/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prototype;


public class Isaque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConcretePrototype prototype1 = new ConcretePrototype("Personagem A");
        Client client = new Client(prototype1);
        ConcretePrototype clone1 = (ConcretePrototype) client.createClone();
        clone1.exibirInfo();
    }
    
}
