import java.io.FileWriter;
class FileWriteDemo
{
 public static void main(String[] args)
 {
  try
  {
    FileWriter fw=new FileWriter("D:\\Files\\writedemo.txt");
    fw.write("Welcome to java Files.........");
    fw.close();
  }
  catch(Exception i)
  {
   System.out.println(i);
  }
 System.out.println("File Created");
}
}

 