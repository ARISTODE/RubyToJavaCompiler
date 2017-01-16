class testValueAssign {
	public static void main(String[] args) { 









Value a = new RyInt(5, 51);
Value b = new RyFloat(3.4f, 52);
Value c = new RyString( Hello, 2);
Value d = b;
Value a1 = a.add(new RyInt(5, 51));
Value a2 = a.add(b);
Value a3 = a.add(c);
Value a4 = b.add(c);
Value a5 = c.mul(new RyInt(3, 51));	}
}
