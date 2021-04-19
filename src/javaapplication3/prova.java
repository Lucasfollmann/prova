/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
 double distance, consumption, pay, value, consumptionL, consumptionR;
        boolean viagem;
        int onibus;
        String local;

        
        //scanner
        Scanner entrada = new Scanner(System.in);

        
        //System
        System.out.println("Para qual cidade você irá viajar? ");
        distance = entrada.nextDouble();

        
        System.out.println("Qual o preço da passagem? ");
        value = entrada.nextDouble();



        //Sobre o trajeto da viagem
        System.out.println("Qual é cidade onde o onibus irá parar? ");
        local = entrada.nextLine();
        
        
        System.out.println("vai ter muitas paradas? ");
        System.out.println("[true] Sim");
        System.out.println("[false] Nao");
        System.out.println(">>>>>digite aqui sua opção<<<<");
        viagem = entrada.nextBoolean();

        
        //Escolha da empresa
        System.out.println("Qual empresa de onibus voce ira utilizar? ");
        System.out.println("[1] Princesa dos campos ");
        System.out.println("[2] Eucatur ");
        System.out.println("[3] Nordeste ");
        System.out.println(">>>>>digite aqui sua opção<<<<");
        onibus = entrada.nextInt();

    
        
        switch (onibus) {
            case 1: 
                if (viagem= false){
                    consumption = 8;
                }
                else {
                    consumption = 8 - 2;
                }
                
                consumptionL = distance / consumption;
                pay = consumptionL * value;

                System.out.println ("Para você ir até" + local + " a passagem irá custar " + pay + " reais!");
                System.out.println ("Voce gastou " + consumptionL + "passagem!");
                break;

              
                
            case 2: 
                if (viagem = false){
                    consumption = 10;
                }
                else {
                    consumption = 10 - 2;
                }

                consumptionL = distance / consumption;
                pay = consumptionL * value;

                System.out.println ("Para você chegar a " + local + " você irá gastar " + pay + " reais!");
                System.out.println ("Voce gastou " + consumptionL + "reais!");
                break;

              
                
            case 3: 
                if (viagem = false){
                    consumption = 5;
                }
                else {
                    consumption = 5 - 2;
                }

                consumptionL = distance / consumption;
                pay = consumptionL * value;

                System.out.println ("Para você viajar até" + local + " a passagem irá custar" + pay + " reais!");
                System.out.println ("Voce gatou " + consumptionL + "reais!");
                break;
        }

        
    }

}

    
