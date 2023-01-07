/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roti;
import varian.Filling;
import varian.Topping;
//import adonan.AdonanRotiManis;
import bahan.BahandanHarga;


/**
 *
 * @author lenovo
 */
public class RotiManis extends BahandanHarga implements Topping,Filling {
    double beratTotalAdonanRotiManis = 2350;
    double beratPcsAdonanRotiManis = 50;
    double takaran = this.beratTotalAdonanRotiManis / this.beratPcsAdonanRotiManis ;
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
    double toppingCoklat;
    double hargaCklt;
    double toppingVanilla;
    double hargaVnl;
    double fillingKejuVar1;
    double hargaKjVar1;
    double fillingKejuVar3;
    double hargaKjVar3;
    double fillingCoklat;
    double hargaCklt2;
    double fillingRedBean;
    double hargaRB;
    double fillingSosis;
    double hargaSs;
    
    public void hitungTakaran(){
        tepung1 = (beratTepungTeriguM / takaran) * pesanManis;
        gula1 = (beratGulaPasirM / takaran) * pesanManis;
        butter1 = (beratButterM / takaran) * pesanManis;
        ragi1 = (beratRagiM / takaran) * pesanManis;
        sBubuk1 = (beratSusuBubukM / takaran) * pesanManis;
        sCair1 = (beratSusuCairM / takaran) * pesanManis;
        telur1 = (beratTelurM / takaran) * pesanManis;
        es1 = (beratEsBatuM / takaran) * pesanManis;
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
        toppingCoklat = pesanManisVar1* 5;
        hargaCklt = toppingCoklat * hargaCoklat;
    }

    @Override
    public void ToppingKeju() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ToppingVanilla() {
        toppingVanilla = pesanManisVar2 * 5;
        hargaVnl = toppingVanilla * hargaKrimVanilla;
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
        fillingKejuVar1 = pesanManisVar1 * 5;
        hargaKjVar1 = fillingKejuVar1 * hargaKeju;
        fillingKejuVar3 = pesanManisVar3 * 10;
        hargaKjVar3 = fillingKejuVar3 * hargaKeju;
    }

    @Override
    public void FillingCoklat() {
        fillingCoklat = pesanManisVar1 * 5;
        hargaCklt2 = fillingCoklat * hargaCoklat;
    }

    @Override
    public void FillingRedBean() {
        fillingRedBean = pesanManisVar2 * 10;
        hargaRB = fillingRedBean * hargaSelaiRedBean;
    }

    @Override
    public void FillingSosis() {
        fillingSosis = pesanManisVar3 * 10;
        hargaSs = fillingSosis * hargaSosis;
    }
    public void cetak(){
        int totalSemua = (int) (tepung2+gula2+butter2+ragi2+sBubuk2+sCair2+telur2+es2+hargaCklt + hargaCklt2+hargaKjVar1 + hargaKjVar3+hargaRB+hargaVnl+hargaSs); 
        System.out.println("CETAK BAHAN ROTI MANIS");
        System.out.println("----------------------------------------------------");
        System.out.println("Total Tepung Terigu  : " + (int)tepung1 + " gram seharga Rp " + (int)tepung2 );
        System.out.println("Total Gula Pasir     :  " + (int)gula1 + " gram seharga Rp  " + (int)gula2);
        System.out.println("Total Butter         :  " + (int)butter1 + " gram seharga Rp  " + (int)butter2);
        System.out.println("Total Ragi           :   " + (int)ragi1 + " gram seharga Rp  " + (int)ragi2);
        System.out.println("Total Susu Bubuk     : " + (int)sBubuk1 + " gram seharga Rp  " + (int)sBubuk2);
        System.out.println("Total Susu Cair      : " + (int)sCair1 + " gram seharga Rp  " + (int)sCair2);
        System.out.println("Total Telur          :  " + (int)telur1 + " gram seharga Rp   " + (int)telur2);
        System.out.println("Total Es Batu        : " + (int)es1 + " gram seharga Rp   " + (int)es2);
        System.out.println("----------------------------------------------------");
        System.out.println("Total Coklat         :  " + (int)(toppingCoklat + fillingCoklat) + " gram seharga Rp  " + (int)(hargaCklt + hargaCklt2));
        System.out.println("Total Keju           :  " + (int)(fillingKejuVar1 + fillingKejuVar3)+ " gram seharga Rp " + (int)(hargaKjVar1 + hargaKjVar3));
        System.out.println("Total Red Bean       : " + (int)fillingRedBean + " gram seharga Rp  " + (int)hargaRB);
        System.out.println("Total Vanilla        :  " + (int)toppingVanilla + " gram seharga Rp  " + (int)hargaVnl);
        System.out.println("Total Sosis          :  " + (int)fillingSosis + " gram seharga Rp  " + (int)hargaSs);
        System.out.println("----------------------------------------------------");
        System.out.println("Total Keseluruhan       : Rp " + totalSemua );
        System.out.println(" ");
        
    }
    
    
}
