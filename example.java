public class StaticVarExample
{
public static String myClassVar="class or static variable";
public static void main(String args[])
{
StaticVarExample obj = new StaticVarExample();
StaticVarExample obj2 = new StaticVarExample();
StaticVarExample obj3 = new StaticVarExample();
//All three will display "class or static variable"
System.out.println(obj.myClassVar);
System.out.println(obj2.myClassVar);
System.out.println(obj3.myClassVar);
//changing the value of static variable using obj2
obj2.myClassVar = "Changed Text";//All three will display "Changed Text"
System.out.println(obj.myClassVar);
System.out.println(obj2.myClassVar);
System.out.println(obj3.myClassVar);
}
}

/*10. Example of Instance variable */
public class InstanceVarExample
{
String myInstanceVar="instance variable";
public static void main(String args[])
{
InstanceVarExample obj = new InstanceVarExample();
InstanceVarExample obj2 = new InstanceVarExample();
InstanceVarExample obj3 = new InstanceVarExample();
System.out.println(obj.myInstanceVar);
System.out.println(obj2.myInstanceVar);
System.out.println(obj3.myInstanceVar);
obj2.myInstanceVar = "Changed Text";
System.out.println(obj.myInstanceVar);
System.out.println(obj2.myInstanceVar);
System.out.println(obj3.myInstanceVar);
}
}
/*11. Example of Local variable */
public class VariableExample {
// instance variable
public String myVar="instance variable";
public void myMethod(){
// local variable
String myVar = "Inside Method";
System.out.println(myVar);}
public static void main(String args[]){
// Creating object
VariableExample obj = new VariableExample();
/* We are calling the method, that changes the
* value of myVar. We are displaying myVar again after
* the method call, to demonstrate that the local
* variable scope is limited to the method itself.
*/
System.out.println("Calling Method");
obj.myMethod();
System.out.println(obj.myVar);
}
