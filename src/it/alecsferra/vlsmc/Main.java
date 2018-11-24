/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.alecsferra.vlsmc;

import it.alecsferra.vlsmc.core.Subnet;
import it.alecsferra.vlsmc.core.VLSMCalculator;
import java.util.Scanner;

/**
 *
 * @author aferr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        
        System.out.print("Inserisci l'ip [xxx.xxx.xxx.xxx/xx]: ");
        
        VLSMCalculator calculator = new VLSMCalculator(cin.nextLine());
        
        int nSub = 0;
        
        while(nSub <= 0){
            
            System.out.print("Inserisci in numero di subnet: ");
            nSub = cin.nextInt();
            
        }
        
        for(int i  = 0; i < nSub; i++){
            
            System.out.print("Insrisci la " + (1+i) + "° subnet [NOME NUMERO_HOST]: ");
            calculator.addSubnet(new Subnet(cin.next(), cin.nextInt(), 0));
            
        }
        
        calculator.calculateVLSM().forEach(System.out::println);
        
    }
    
}
