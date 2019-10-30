/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package famosos1;

import java.util.Scanner;

/**
 *
 * @author esmer
 */
public class Entrada {
    private String entrada;

    public Entrada() {
        Scanner sc= new Scanner(System.in);
       
        this.entrada = sc.nextLine();
    }

    public String getEntrada() {
        return entrada;
    }

 
    public void setEntrada(String entrada) {
        this.entrada= entrada;
    }
   
}



