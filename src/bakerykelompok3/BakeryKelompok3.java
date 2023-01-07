/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakerykelompok3;
import roti.Pizza;
import roti.RotiManis;
import roti.RotiTawar;
import VarTawar.TawarVar1;
import VarTawar.TawarVar2;
import varmanis.ManisVar1;
import varmanis.ManisVar2;
import varmanis.ManisVar3;
/**
 *
 * @author lenovo
 */
public class BakeryKelompok3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // cetak roti manis   
        RotiManis rm = new RotiManis();
        rm.pesanManis = 220;
        rm.hitungTakaran();
        rm.hitungHarga();
        rm.ToppingCoklat();
        rm.ToppingVanilla();
        rm.FillingKeju();
        rm.FillingCoklat();
        rm.FillingRedBean();
        rm.FillingSosis();
        rm.cetak();
        
        //cetak roti manis var1
        ManisVar1 manis1 = new ManisVar1();
        manis1.pesanManisVar1 =50;
        manis1.hitungTakaran();
        manis1.hitungHarga();
        manis1.FillingKeju();
        manis1.ToppingCoklat();
        manis1.FillingCoklat();
        manis1.cetak();
        
        //cetak roti manis var3
        ManisVar2 manis2 = new ManisVar2();
        manis2.pesanManisVar2 =100;
        manis2.hitungTakaran();
        manis2.hitungHarga();
        manis2.FillingRedBean();
        manis2.ToppingVanilla();
        manis2.cetak();
        
        //cetak roti manis var3
        ManisVar3 manis3 = new ManisVar3();
        manis3.pesanManisVar3 =70;
        manis3.hitungTakaran();
        manis3.hitungHarga();
        manis3.FillingKeju();
        manis3.FillingSosis();
        manis3.cetak();
        
        // cetak roti tawar
        RotiTawar rt = new RotiTawar();
        rt.pesanTawar = 35;
        rt.hitungTakaran();
        rt.hitungHarga();
        rt.FillingKeju();
        rt.FillingCoklat();
        rt.cetak();
        
        //cetak roti tawar var1
        TawarVar1 tawar1 = new TawarVar1();
        tawar1.pesanTawarVar1 = 20;
        tawar1.hitungTakaran();
        tawar1.hitungHarga();
        tawar1.FillingCoklat();
        tawar1.cetak();
        
         //cetak roti tawar var2
        TawarVar2 tawar2 = new TawarVar2();
        tawar2.pesanTawarVar2 = 15;
        tawar2.hitungTakaran();
        tawar2.hitungHarga();
        tawar2.FillingKeju();
        tawar2.cetak();
        
        // cetak roti pizza
        Pizza p = new Pizza();
        p.pesanPizza = 10;
        p.hitungTakaran();
        p.hitungHarga();
        p.ToppingKeju();
        p.ToppingSosis();
        p.ToppingSmokedBeef();
        p.ToppingBawangBombay();
        p.cetak();
    }
    
}
