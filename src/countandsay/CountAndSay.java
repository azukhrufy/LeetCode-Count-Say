/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countandsay;

import java.util.Scanner;

/**
 *
 * @author zukhruf
 */
public class CountAndSay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        if(n == 1) return "1";
        String prev = countAndSay(n - 1);
        String result="";
        char current = prev.charAt(0);
        int count = 1;
        for(int i = 1; i < prev.length(); i++){
            if(current == prev.charAt(i)){
                //menghitung ada berapa nilai yang sama
                count++;
            }else{
                //memasukkan ada berapa nilai kedalam value selanjutnya
                result += String.valueOf(count) + String.valueOf(current);
                count = 1;
                current = prev.charAt(i);
            }
        }
        //memasukkan ada berapa nilai kedalam value selanjutnya
        result += String.valueOf(count) + String.valueOf(current);
        return result;
    }
    
}
