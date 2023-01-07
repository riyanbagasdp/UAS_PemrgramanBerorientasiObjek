/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varmanis;
import varian.Filling;
import varian.Topping;
import bahan.BahandanHarga;
/**
 *
 * @author ACER
 */
public class ManisVar3 extends BahandanHarga implements Topping,Filling {
    double beratTotalAdonanRotiManis = 2350;
    double beratPcsAdonanRotiManis = 50;
    double takaran = this.beratTotalAdonanRotiManis / this.beratPcsAdonanRotiManis ;
    
    // berat bahan
    public double tepung1;
    public double gula1 ;
    public double butter1 ;
    public double ragi1;
    public double sBubuk1;
    public double sCair1;
    public double telur1;
    public double es1;
    
    // harga bahan
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
    double fillingSosis;
    double hargaSs;
    
    public void hitungTakaran(){
        tepung1 = (beratTepungTeriguM / takaran) * pesanManisVar3;
        gula1 = (beratGulaPasirM / takaran) * pesanManisVar3;
        butter1 = (beratButterM / takaran) * pesanManisVar3;
        ragi1 = (beratRagiM / takaran) * pesanManisVar3;
        sBubuk1 = (beratSusuBubukM / takaran) * pesanManisVar3;
        sCair1 = (beratSusuCairM / takaran) * pesanManisVar3;
        telur1 = (beratTelurM / takaran) * pesanManisVar3;
        es1 = (beratEsBatuM / takaran) * pesanManisVar3;
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
    public void FillingKeju() {
        fillingKeju = pesanManisVar3 * 10;
        hargaKj = fillingKeju * hargaKeju;
    }

    @Override
    public void FillingSosis() {
        fillingSosis = pesanManisVar3 * 10;
        hargaSs = fillingSosis * hargaSosis;
    }

    public void cetak(){
        int totalSemua = (int) (tepung2+gula2+butter2+ragi2+sBubuk2+sCair2+telur2+es2+ fillingKeju + hargaKj + fillingSosis + hargaSs); 
        int hpp1 = (int) (totalSemua / pesanManisVar2);
        int hpp2 = hpp1 + (hpp1 * 50/100);
        System.out.println("CETAK BAHAN ROTI Manis Var 3");
        System.out.println("----------------------------------------------------");
        System.out.println("Total Tepung Terigu  : " + (int)tepung1 + " gram seharga Rp " + (int)tepung2 );
        System.out.println("Total Gula Pasir     :  " + (int)gula1 + " gram seharga Rp  " + (int)gula2);
        System.out.println("Total Butter         :  " + (int)butter1 + " gram seharga Rp " + (int)butter2);
        System.out.println("Total Ragi           :   " + (int)ragi1 + " gram seharga Rp " + (int)ragi2);
        System.out.println("Total Susu Bubuk     :  " + (int)sBubuk1 + " gram seharga Rp " + (int)sBubuk2);
        System.out.println("Total Susu Cair      :  " + (int)sCair1 + " gram seharga Rp  " + (int)sCair2);
        System.out.println("Total Telur          :  " + (int)telur1 + " gram seharga Rp  " + (int)telur2);
        System.out.println("Total Es Batu        :  " + (int)es1 + " gram seharga Rp  " + (int)es2);
        System.out.println("----------------------------------------------------");
        System.out.println("Total Filling Keju   : " + (int)fillingKeju + " gram seharga Rp " + (int)hargaKj);   
        System.out.println("Total Filling Sosis  : " + (int)fillingSosis + " gram seharga Rp " + (int)hargaSs);
        System.out.println("----------------------------------------------------");
        System.out.println("Total Keseluruhan       : Rp " + totalSemua );
        System.out.println("HPP Roti Manis Var 3    : Rp   " + hpp1);
        System.out.println("Total Penjualan per Pcs : Rp   " + hpp2);
        System.out.println(" ");
        
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
    public void ToppingCoklat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ToppingKeju() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void FillingCoklat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ToppingVanilla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void FillingRedBean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

