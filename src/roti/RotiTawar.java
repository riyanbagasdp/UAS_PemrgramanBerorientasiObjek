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
public class RotiTawar extends BahandanHarga implements Topping,Filling {
    double beratTotalAdonanRotiTawar = 2065;
    double beratPcsAdonanRotiTawar = 400;
    double takaran = this.beratTotalAdonanRotiTawar / this.beratPcsAdonanRotiTawar ;
    
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
    double fillingKeju;
    double hargaKj;
    double fillingCoklat;
    double hargaCklt;
    
    public void hitungTakaran(){
        tepung1 = (beratTepungTeriguT / takaran) * pesanTawar;
        gula1 = (beratGulaPasirT / takaran) * pesanTawar;
        butter1 = (beratButterT / takaran) * pesanTawar;
        ragi1 = (beratRagiT / takaran) * pesanTawar;
        sBubuk1 = (beratSusuBubukT / takaran) * pesanTawar;
        sCair1 = (beratSusuCairT / takaran) * pesanTawar;
        telur1 = (beratTelurT / takaran) * pesanTawar;
        es1 = (beratEsBatuT / takaran) * pesanTawar;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ToppingVanilla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ToppingSosis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ToppingSmokedBeef() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ToppingBawangBombay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void FillingKeju() {
        fillingKeju = pesanTawarVar2 * 80;
        hargaKj = fillingKeju * hargaKeju;
    }

    @Override
    public void FillingCoklat() {
        fillingCoklat = pesanTawarVar1 * 80;
        hargaCklt = fillingCoklat * hargaCoklat;
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
        int totalSemua = (int) (tepung2+gula2+butter2+ragi2+sBubuk2+sCair2+telur2+es2+hargaCklt + fillingKeju + hargaKj + fillingCoklat); 
        System.out.println("CETAK BAHAN ROTI TAWAR");
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
        System.out.println("Total Coklat         : " + (int)fillingCoklat + " gram seharga Rp  " + (int)hargaCklt);
        System.out.println("Total Keju           : " + (int)fillingKeju + " gram seharga Rp " + (int)hargaKj);
        System.out.println("----------------------------------------------------");
        System.out.println("Total Keseluruhan       : Rp " + totalSemua );
        System.out.println(" ");
        
    }
}
