class StaticTest {
static
{
System.out.println("Class is loaded Successfully");
}
{
System.out.println("One object is created Successfully");
}
public static void main(String[] args) {
StaticTest t1 = new StaticTest();
StaticTest t2 = new StaticTest();
StaticTest t3 = new StaticTest();
}
}