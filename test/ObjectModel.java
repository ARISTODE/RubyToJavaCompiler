import java.util.*;
import java.lang.reflect.Method;


interface I_methodInvoke {
	public void invokeMethod() throws Exception;
	public void setMethod(Method method);
}

class InvokesMethod implements I_methodInvoke{
	private Method method;

	@Override
	public void invokeMethod() throws Exception {
		 method.invoke(null);
	}

	@Override
	public void setMethod(Method method) {
		this.method = method;
	}
}

class __Global {
	public static HashMap<String,HashMap<String,I_methodInvoke>> cls_methods_map = new HashMap();
	
	public static void printHello() {
		System.out.println("Hello");	
	}
}

class Base {
	RyClass cls;
	Map<String, Object> fields;
	
	Base(RyClass cls, HashMap<String,Object> fields) {
		this.cls = cls;
		this.fields = fields;
	}
	
	public Object read_attr(String fieldname) {
		return read_dic(fieldname);
	}

	public void write_attr(String fieldname, Object value) {
		write_dic(fieldname, value);
	} 
	
	public Boolean isinstance(RyClass cls) {
		return this.cls.equals(cls) || this.cls.getBaseRyClass().equals(cls);
	}

	public RyClass getSelfRyClass() {
		// only for read, if allow write, some serious problem may occur
		return this.cls;
	}

	public I_methodInvoke callmethod(String methodname) {
		I_methodInvoke method = this.cls.read_from_RyClass(methodname);
		return method;
	}
	
	public Object read_dic(String fieldname) {
		return this.fields.get(fieldname);
	}
	
	public void write_dic(String fieldname, Object value) {
		this.fields.put(fieldname, value);
	}
}

class Instance extends Base{
	Instance(RyClass cls) {
		super(cls, new HashMap<String,Object>());
	}
}

class RyClass extends Base {
	String name;
	RyClass base_RyClass;
	
	// metaRyClass refer to Base, since every object indirectly inherit from the Base RyClass
	RyClass(String name, Map<String, Object> fields,RyClass meta_cls, RyClass base_RyClass) {
		super(meta_cls, (HashMap)fields);
		this.name = name;
		this.base_RyClass = base_RyClass;
	}
	
	public void writeRyClass(RyClass cls) {
		this.cls = cls;
	}
	
	public RyClass getBaseRyClass() {
		return base_RyClass;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<String> method_resolution_order(ArrayList<String> a) {
		a.add(name);
		if (base_RyClass == null) {
			return a;
		} else {
			return base_RyClass.method_resolution_order(a);
		}
	}
	
	public Boolean issubRyClass(RyClass o) {
		// use this because cls -> RyClass and this -> A
		ArrayList<String> method_chain = this.method_resolution_order(new ArrayList<String>());
		return method_chain.contains(o.getName()); 
	}
	
	public I_methodInvoke read_from_RyClass(String methodName) {
		// return the method name
		// search the method resolution chain
		for (String s : this.method_resolution_order(new ArrayList<String>())) {
			HashMap<String,I_methodInvoke> cls_methods = __Global.cls_methods_map.get(s);
			if (cls_methods.containsKey(methodName)) {
				// return the I_methodInvoke Object
				return cls_methods.get(methodName);
			}
		}
		return null;
	}
	
	public void setMethod(String clsName, String methodName, Method method) {
		I_methodInvoke inv = new InvokesMethod();
		inv.setMethod(method);
		if (__Global.cls_methods_map.get(clsName) == null) {
			__Global.cls_methods_map.put(clsName, new HashMap<String, I_methodInvoke>());
		}
		__Global.cls_methods_map.get(clsName).put(methodName, inv);
	}

	public void executeMethod(String clsName,String methodName) throws Exception {
		__Global.cls_methods_map.get(clsName).get(methodName).invokeMethod();
	}
}


class ObjectModel {
	public static void main(String[] args) {
		// initialization of the OO model
		RyClass basicObject = new RyClass("BasicObject", new HashMap<String,Object>(), null, null);
		RyClass _Object = new RyClass("Object", new HashMap<String,Object>(), null, basicObject);
		RyClass _Module = new RyClass("Module", new HashMap<String,Object>(), null, _Object);
		RyClass _RyClass = new RyClass("RyClass", new HashMap<String,Object>(), null, _Module);
		__Global _global = new __Global();
		
		basicObject.writeRyClass(_RyClass);
		_Object.writeRyClass(_RyClass);
		_Module.writeRyClass(_RyClass);
		_RyClass.writeRyClass(_RyClass);
		
		RyClass A = new RyClass("A", new HashMap<String,Object>(), null, _Object);
		A.writeRyClass(_RyClass);
		Instance a = new Instance(A);
		
		
		try {
			A.setMethod("A", "print", _global.getClass().getDeclaredMethod("printHello"));
//			A.callMethod("print");
			((InvokesMethod)a.callmethod("print")).invokeMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



