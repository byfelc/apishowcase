
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;



public class App {

    public static int suma=0;
    public static String recu(int num){
        
      
        if (num == 1) {
            return String.valueOf(num);
        }
        if (num % 2==0) {
            return String.valueOf(num)+" "+recu(num/2);
            
        }else{
            return String.valueOf(num)+" "+recu(num*3+1);
        }
        
        
        
    }

    public static String recu2(String temp){
        
        if (temp.isEmpty()) {
            return temp;
        }
        return recu2(temp.substring(1))+ temp.charAt(0);
    }

    public static int recu3(String temp){
        if (temp.isEmpty()) {
            return 0;
        }
        if (temp.length()==1&& temp.charAt(0)==' ') {
            return recu3(temp.substring(1));
        }else{
            if (temp.length()==1) {
                return 1+recu3(temp.substring(1));
                
            } 
        }
        if (temp.charAt(0)== ' ' ) {
            return 1+recu3(temp.substring(1));
        }
        return recu3(temp.substring(1));
    }

    public static String recu4(double ola){
            
        if (ola==0) {
            return "";
            
        }
        if (ola%2==0) {
            return "0"+recu4(ola/2);
            
        }else {
            return"1"+recu4(ola/2-ola%2);
        }
        
    }

    public static String recu5(String temp,char temp2){
        
        if (temp.isEmpty()) {
            return "";
        }
        if (temp.charAt(0) != temp2) {
            return temp.charAt(0) + recu5(temp.substring(1),temp2);
        } else {
            
            return recu5(temp.substring(1), temp2);
        }
        
    }
    public static int recu6(int[] ola,int index){
        
        
        if (index == ola.length) {
            return suma;
        }
        suma+= ola[index];
        return recu6(ola,++index);
    }
   
    public static void main(String[] args) throws Exception {
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(in);

        int temp;
        
       // System.out.println("introdusca el numero");
        //temp= Integer.parseInt(leer.readLine());

       // recu(temp);

       //System.out.println(recu2("milton")); 
      // System.out.println(recu5("hola",'o'));
      //System.out.println(recu(20));
      int [] array= new int[]{2,3,4,6};
      System.out.println(recu6(array,0));
       
        
    }
}
