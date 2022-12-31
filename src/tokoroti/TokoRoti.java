/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoroti;

/**
 *
 * @author lenovo
 */
public class TokoRoti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RotiManis rt = new RotiManis();
        rt.pesanManis = 220;
        rt.hitungBeratPcs();
        rt.hitungBeratBahan();
        rt.hitungHargaPcs();
        rt.hitungHargaBahan();
    } 
    
}
