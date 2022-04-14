import java.util.Scanner;

public class Stage3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String operation = scn.nextLine();
        if (operation.equals("enc")) {
            String string = scn.nextLine();
            int key = scn.nextInt();
           encrypt2(string, key);
        } else if(operation.equals("dec")){
            String string = scn.nextLine();
            int key = scn.nextInt();
            decrypt(string,key);
        } else {
            System.out.println("why do i never do anything right?");
        }
    }


    public static void dec(){

    }
    public static String encrypt2(String str, int k){
        int n=str.length();
        String res=new String("");
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int asc=(int)ch+k;
            ch=(char)asc;
            res+=Character.toString(ch);
        }
        System.out.println(res);
        return res;
    }
    public static String decrypt(String str, int k){
        int n=str.length();
        String res=new String("");
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int asc=(int)ch-k;
            ch=(char)asc;
            res+=Character.toString(ch);
        }
        System.out.println(res);
        return res;
    }


}

