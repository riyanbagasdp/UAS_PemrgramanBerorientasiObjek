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
public class RotiTawar {
    public double beratTepung = 1000;
    public double beratGula = 125;
    public double beratButter = 100;
    public double beratRagi = 20;    
    public double beratSusuBubuk = 250;
    public double beratSusuCair = 200;
    public double beratTelur = 70;
    public double beratEsBatu = 300;
    public double pesanTawar;
    public double doughTawar = 400;
    public double totalBahanTawar;
    public double totalHargaTawar;
    public void hitungBeratBahan(){
        this.pesanTawar = this.pesanTawar * this.doughTawar;
    }
    public void hitungHargaBahan(){
        
    }
    
}
