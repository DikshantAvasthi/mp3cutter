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


try {
File g=new File("C:\\Users\\Dikshant Avasthi\\Desktop\\addicted.mp3");
File k=new File("C:\\Users\\Dikshant Avasthi\\Desktop\\laung.mp3");
FileInputStream tis= new FileInputStream(g);
FileInputStream pis= new FileInputStream(k);
FileOutputStream fos3=new FileOutputStream("C:\\Users\\Dikshant Avasthi\\Desktop\\koina.mp3");
int q=0;
int w=0;
int l1 = (int)g.length();
int l2 = (int)k.length();
while ( q < l1)
{
	fos3.write(tis.read());
	q++;
}

while (w < l2)
{
	fos3.write(pis.read());
     w++;
	}

}
catch (Exception e)
{
	System.out.println(e);
}
}
}