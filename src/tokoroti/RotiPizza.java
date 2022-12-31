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
public class RotiPizza {
    public double beratTepung = 1000;
    public double beratGula = 100;
    public double beratButter = 100;
    public double beratRagi = 20;    
    public double beratSusuBubuk = 200;
    public double beratSusuCair = 180;
    public double beratTelur = 50;
    public double beratEsBatu = 300;
    public double pesanPizza;
    public double doughPizza = 190;
    public double totalBahanPizza;
    public double totalHargaPizza;
    public void hitungBeratBahan(){
        this.totalBahanPizza = this.pesanPizza * this.doughPizza;
    }
    public void hitungHargaBahan(){
        
    }
    public void hitungBeratTopping(){
        
    }
    public void hitungHargaTopping(){
        
    }
    public void hitungHargaAkhir(){
        
    }
    public void hitungBeratAkhir(){
        
    }
}
