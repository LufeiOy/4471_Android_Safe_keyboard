import java.util.Random;
import java.io.*;

public class passwordGenerator {
 /**
  * @param args
  * @throws IOException
  */
 public static void main(String[] args) throws IOException {
    char pwd_Len;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please enter the length of password: (Press Q to quit)");
    do {
        pwd_Len = (char) br.read();
        System.out.println(pwd_Len);
    } while (pwd_Len != 'q');
    System.out.println(genRandomNum((int)pwd_Len));
 }

 /**
  * Generator a ramdom password
  * @param pwd_len length of the passwprd
  * @return  passward string
  */
 public static String genRandomNum(int pwd_len){
  final int  maxNum = 67; //26*2+10+5
  int i;  //nember of random units
  int count = 0; //password length
  char[] str = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
    'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
    'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
    'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
    'X', 'Y', 'Z','0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '_', '-', '~', '?' };
  
  StringBuffer pwd = new StringBuffer("");
  Random r = new Random();
  while(count < pwd_len){
   //avoid negative value
   
   i = Math.abs(r.nextInt(maxNum));  //largest value would be 67-1
   
   if (i >= 0 && i < str.length) {
    pwd.append(str[i]);
    count ++;
   }
  }
  
  return pwd.toString();
 }
}