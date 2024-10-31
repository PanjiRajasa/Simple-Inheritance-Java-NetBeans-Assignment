/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pewarisan_sederhana_netbeans;

/**
 *
 * @author 1234
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        mamalia Mamalia = new mamalia();
        monyet Monyet = new monyet();
        paus Paus = new paus();
        abstractMamalia AbstractMamalia = new abstractMamalia();

        System.out.println("Paus Berjenis tulang : " + Paus.tulang);
        Mamalia.alatPernafasan();
        Mamalia.jenisTulang();

        System.out.print("\n\n");
        
        System.out.println("Monyet Bernafas dengan : " + Monyet.nafas);
        Mamalia.alatPernafasan();
        Mamalia.jenisTulang();

        System.out.print("\n\n");
        
        Monyet.habitat();
        Monyet.tarsius();

        System.out.print("\n\n");

        Paus.habitat();
        Paus.faktaUnik();

        System.out.print("\n\n");

        AbstractMamalia.suara();
        AbstractMamalia.tidur();
    }
    
}
