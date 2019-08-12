import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        char c[] = S.toCharArray();
        int start = in.nextInt();
        int end = in.nextInt();
        for(int i=0;i<=c.length;i++){
            if(i>= start && i<end){
                System.out.print(c[i]);
            }
        }
    }
}

