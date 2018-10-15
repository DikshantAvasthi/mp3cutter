import java.util.*;
//import java.io.File;
//import java.io.FileOutputStream;
import java.io.*;

class cutter
{


public static void main(String t[])
{
try {
File f=new File("C:\\Users\\Dikshant Avasthi\\Desktop\\addicted.mp3");
FileInputStream fis= new FileInputStream(f);
FileOutputStream fos=new FileOutputStream("D:\\ad.mp3");
FileOutputStream fos2=new FileOutputStream("F:\\ad2.mp3");
int ops=(int)f.length();
System.out.println("total size o file"+ops);
int y=0;


while(y<(ops/2))
{
fos.write(fis.read());
y++;
}
while(y<=ops)
{
fos2.write(fis.read());
y++;	
}


}
catch (Exception e)
{
	System.out.println(e);
}

}
}
