import java.io.Console;

public class Hello{

int a;
float b;
static String age = "";

public static void main (String args[])
{
  //заводи переменные там, где ты их будешь использовать, т.е. String age = con...;
String age = con.readLine("Write your age: ");
Console con = System.console();
  //чтобы не было проблем с кодировкой лучше использовать англ язык

System.out.println("You're - " + age);

}
}
