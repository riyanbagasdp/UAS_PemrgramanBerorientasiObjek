/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VarTawar;
import varian.Filling;
import bahan.BahandanHarga;
/**
 *
 * @author user
 */
public class TawarVar1 extends BahandanHarga implements Filling {
    double beratTotalAdonanRotiTawar = 2065;
    double beratPcsAdonanRotiTawar = 400;
    double takaran = this.beratTotalAdonanRotiTawar / this.beratPcsAdonanRotiTawar ;
    
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
    
    // filling
    double fillingCoklat;
    double hargaCklt2;
    
    public void hitungTakaran(){
        tepung1 = (beratTepungTeriguM / takaran) * pesanTawarVar1;
        gula1 = (beratGulaPasirM / takaran) * pesanTawarVar1;
        butter1 = (beratButterM / takaran) * pesanTawarVar1;
        ragi1 = (beratRagiM / takaran) * pesanTawarVar1;
        sBubuk1 = (beratSusuBubukM / takaran) * pesanTawarVar1;
        sCair1 = (beratSusuCairM / takaran) * pesanTawarVar1;
        telur1 = (beratTelurM / takaran) * pesanTawarVar1;
        es1 = (beratEsBatuM / takaran) * pesanTawarVar1;
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
    public void FillingCoklat() {
        fillingCoklat = pesanTawarVar1 * 80;
        hargaCklt2 = fillingCoklat * hargaCoklat;
    }

    public void cetak(){
        int totalSemua = (int) (tepung2+gula2+butter2+ragi2+sBubuk2+sCair2+telur2+es2 + fillingCoklat + hargaCklt2); 
        int hpp1 = (int) (totalSemua / pesanTawarVar1);
        int hpp2 = hpp1 + (hpp1 * 50/100);
        System.out.println("CETAK BAHAN ROTI Tawar Var1");
        System.out.println("----------------------------------------------------");
        System.out.println("Total Tepung Terigu  : " + (int)tepung1 + " gram seharga Rp " + (int)tepung2 );
        System.out.println("Total Gula Pasir     :  " + (int)gula1 + " gram seharga Rp  " + (int)gula2);
        System.out.println("Total Butter         :  " + (int)butter1 + " gram seharga Rp  " + (int)butter2);
        System.out.println("Total Ragi           :   " + (int)ragi1 + " gram seharga Rp  " + (int)ragi2);
        System.out.println("Total Susu Bubuk     : " + (int)sBubuk1 + " gram seharga Rp  " + (int)sBubuk2);
        System.out.println("Total Susu Cair      :  " + (int)sCair1 + " gram seharga Rp  " + (int)sCair2);
        System.out.println("Total Telur          :  " + (int)telur1 + " gram seharga Rp   " + (int)telur2);
        System.out.println("Total Es Batu        : " + (int)es1 + " gram seharga Rp   " + (int)es2);
        System.out.println("----------------------------------------------------");   
        System.out.println("Total Filling Coklat : " + (int) fillingCoklat + " gram seharga Rp " + (int)hargaCklt2);
        System.out.println("----------------------------------------------------");
        System.out.println("Total Keseluruhan       : Rp " + totalSemua );
        System.out.println("HPP Roti Tawar Var1     : Rp  " + hpp1);
        System.out.println("Total Penjualan per Pcs : Rp  " + hpp2);
        System.out.println(" ");
        
    }
    
    
    
     @Override
    public void FillingKeju() {
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
}
