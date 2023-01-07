/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahan;

/**
 *
 * @author lenovo
 */
public abstract class BahandanHarga { 
    
    // Komposisi bahan untuk roti manis
    public double pesanManis;
    public double pesanManisVar1 = 50;
    public double pesanManisVar2 = 100;
    public double pesanManisVar3 = 70;
    public double beratTepungTeriguM = 1000;
    public double beratGulaPasirM = 150;
    public double beratButterM = 150;
    public double beratRagiM = 20;
    public double beratSusuBubukM = 300;
    public double beratSusuCairM = 250;
    public double beratTelurM = 80;
    public double beratEsBatuM = 400;
    
    // Kompposisi bahan untuk roti tawar
    public double pesanTawar;
    public double pesanTawarVar1 = 20;
    public double pesanTawarVar2 = 15;
    public double beratTepungTeriguT = 1000;
    public double beratGulaPasirT = 125;
    public double beratButterT = 100;
    public double beratRagiT = 20;
    public double beratSusuBubukT = 250;
    public double beratSusuCairT = 200;
    public double beratTelurT = 70;
    public double beratEsBatuT = 300;
    
    // Komposisi bahan untuk pizza
    public double pesanPizza = 10;
    public double beratTepungTeriguP = 1000;
    public double beratGulaPasirP = 100;
    public double beratButterP = 100;
    public double beratRagiP = 20;
    public double beratSusuBubukP = 200;
    public double beratSusuCairP = 180;
    public double beratTelurP = 50;
    public double beratEsBatuP = 300;
    
    // Menghitung harga per gram
    public double hargaTepungTerigu = 40000/1000;
    public double hargaGulaPasir = 25000/1000;
    public double hargaButter = 23000/500;
    public double hargaRagi = 5000/11;
    public double hargaSusuBubuk = 39000/1000;
    public double hargaSusuCair = 24000/1000;
    public double hargaTelur = 23000/1000;
    public double hargaEsBatu = 2000/1000;
    public double hargaKeju = 31000/250;
    public double hargaCoklat = 29000/500;
    public double hargaKrimVanilla = 30000/500;
    public double hargaSelaiRedBean = 25000/500;
    public double hargaSosis = 80000/1000;
    public double hargaSmokedBeef = 90000/1000;
    public double hargaBawangBombay = 40000/500;
}
