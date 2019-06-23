/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jaimito
 */
public class testUsda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Set set = new HashSet ();
        set.add ("123");
        set.add ("456");

        List list = new ArrayList ();
        list.addAll (set);
        for (Object r: list){
            System.out.println(r);
        }
    }
    
}
