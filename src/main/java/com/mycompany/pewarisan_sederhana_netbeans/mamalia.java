/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pewarisan_sederhana_netbeans;

/**
 *
 * @author 1234
 */
public class mamalia {
    //variable pernafasan
    String nafas = "Paru-paru";
    String tulang = "Vertebrata";
    
    //fungsi/method
    void alatPernafasan() {
        System.out.println("Mamalia bernafas dengan : " + nafas);
    }
    void jenisTulang() {
        System.out.println("Mamalia berjenis tulang : " + tulang);
    }
    
}

abstract class Hewan {
    //Method abstract
    abstract void suara();
    
    //method konkret
    void tidur() {
        System.out.println("Mamalia sedang tidur...");
    }
}
