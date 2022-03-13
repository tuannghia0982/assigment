/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

/**
 *
 * @author tuann
 */
public class test {
    public static void main(String[] args){
        int a=3, b=2, c=-3;
        if(a>-1&&b>-1&&c>-1){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if(a>-1){
            if(c>-1){
                System.out.println(c);
            }
            if(b>-1){
                System.out.println(b);
            }
            System.out.println(a);
        }else if(b>-1){
            System.out.println(b);
        }
    }
    
}
