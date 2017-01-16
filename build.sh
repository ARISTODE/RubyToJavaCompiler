#!/bin/bash
java -jar /usr/local/lib/antlr-4.5-complete.jar -no-visitor -listener -o com/reverycoder Ry.g4
cd com/reverycoder

javac -d compiledfile Ry*.java
cd compiledfile
jar uf0 compiler_tools.jar *.class
