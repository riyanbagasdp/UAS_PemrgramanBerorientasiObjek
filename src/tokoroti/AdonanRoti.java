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
public abstract class AdonanRoti {
    public double beratTepung;
    public double beratGula;
    public double beratButter;
    public double beratRagi;    
    public double beratSusuBubuk;
    public double beratSusuCair;
    public double beratTelur;
    public double beratEsBatu;
    public abstract double hitungBeratBahan();
    public abstract void hitungHargaBahan();
}
