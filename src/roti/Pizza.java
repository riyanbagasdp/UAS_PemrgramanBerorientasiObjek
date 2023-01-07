/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roti;
import varian.Filling;
import varian.Topping;
import bahan.BahandanHarga;
/**
 *
 * @author lenovo
 */
public class Pizza extends BahandanHarga implements Topping,Filling {
    double beratTotalAdonanRotiPizza = 1950;
    double beratPcsAdonanRotiPizza = 190;
    double takaran = this.beratTotalAdonanRotiPizza / this.beratPcsAdonanRotiPizza ;
    
    // berat tepung
    public double tepung1;
    public double gula1 ;
    public double butter1 ;
    public double ragi1;
    public double sBubuk1;
    public double sCair1;
    public double telur1;
    public double es1;
    
    // harga tepung
    double tepung2;
    double gula2;
    double butter2;
    double ragi2;
    double sBubuk2;
    double sCair2;
    double telur2;
    double es2;
    
    // topping dan filling
    double toppingKeju;
    double hargaKj;
    double toppingSosis;
    double hargaSs;
    double toppingSmokedBeef;
    double hargaSb; 
    double toppingBawangBombay;
    double hargaBb; 
    
    public void hitungTakaran(){
        tepung1 = (beratTepungTeriguP / takaran) * pesanPizza;
        gula1 = (beratGulaPasirP / takaran) * pesanPizza;
        butter1 = (beratButterP / takaran) * pesanPizza;
        ragi1 = (beratRagiP / takaran) * pesanPizza;
        sBubuk1 = (beratSusuBubukP / takaran) * pesanPizza;
        sCair1 = (beratSusuCairP / takaran) * pesanPizza;
        telur1 = (beratTelurP / takaran) * pesanPizza;
        es1 = (beratEsBatuP / takaran) * pesanPizza;
    }
    public void hitungHarga(){
        tepung2 = this.tepung1 * hargaTepungTerigu;
        gula2 = this.gula1 * hargaGulaPasir;
        butter2 = this.butter1 * hargaButter;
        ragi2 = this.ragi1 * hargaRagi;
        sBubuk2 = this.sBubuk1 * hargaSusuBubuk;
        sCair2 = this.sCair1 * hargaSusuCair;
        telur2 = this.telur1 * hargaTelur;
        es2 = this.es1 * hargaEsBatu;
    }
    
    @Override
    public void ToppingCoklat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ToppingKeju() {
        toppingKeju = pesanPizza * 30;
        hargaKj = toppingKeju * hargaKeju;
    }

    @Override
    public void ToppingVanilla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ToppingSosis() {
        toppingSosis = pesanPizza * 50;
        hargaSs = toppingSosis * hargaSosis;
    }

    @Override
    public void ToppingSmokedBeef() {
        toppingSmokedBeef = pesanPizza* 50;
        hargaSb = toppingSmokedBeef * hargaSmokedBeef;        
    }

    @Override
    public void ToppingBawangBombay() {
        toppingBawangBombay = pesanPizza * 30;
        hargaBb = toppingBawangBombay * hargaBawangBombay;  
    }

    @Override
    public void FillingKeju() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void FillingCoklat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void FillingRedBean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void FillingSosis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void cetak(){
        int totalSemua = (int) (tepung2+gula2+butter2+ragi2+sBubuk2+sCair2+telur2+es2+ toppingKeju + hargaKj + toppingSosis + hargaSs + toppingSmokedBeef + hargaSb + toppingBawangBombay + hargaBb); 
        int hpp1 = (int) (totalSemua / pesanPizza);
        int hpp2 = hpp1 + (hpp1 * 50/100);
        System.out.println("CETAK BAHAN ROTI PIZZA");
        System.out.println("----------------------------------------------------");
        System.out.println("Total Tepung Terigu  : " + (int)tepung1 + " gram seharga Rp " + (int)tepung2 );
        System.out.println("Total Gula Pasir     :  " + (int)gula1 + " gram seharga Rp  " + (int)gula2);
        System.out.println("Total Butter         :  " + (int)butter1 + " gram seharga Rp  " + (int)butter2);
        System.out.println("Total Ragi           :  " + (int)ragi1 + " gram seharga Rp  " + (int)ragi2);
        System.out.println("Total Susu Bubuk     : " + (int)sBubuk1 + " gram seharga Rp  " + (int)sBubuk2);
        System.out.println("Total Susu Cair      : " + (int)sCair1 + " gram seharga Rp  " + (int)sCair2);
        System.out.println("Total Telur          :  " + (int)telur1 + " gram seharga Rp  " + (int)telur2);
        System.out.println("Total Es Batu        : " + (int)es1 + " gram seharga Rp   " + (int)es2);
        System.out.println("----------------------------------------------------");
        System.out.println("Total Keju           : " + (int)toppingKeju + " gram seharga Rp  " + (int)hargaKj);
        System.out.println("Total Sosis          : " + (int)toppingSosis + " gram seharga Rp " + (int)hargaSs);        
        System.out.println("Total Smoked Beef    : " + (int)toppingSmokedBeef + " gram seharga Rp " + (int)hargaSb);
        System.out.println("Total Bawang Bombay  : " + (int)toppingBawangBombay + " gram seharga Rp " + (int)hargaBb);
        System.out.println("----------------------------------------------------");
        System.out.println("Total Keseluruhan       : Rp " + totalSemua );
        System.out.println("HPP                     : Rp  " + hpp1);
        System.out.println("Total Penjualan per Pcs : Rp  " + hpp2);
        System.out.println(" ");
        
    }
}
