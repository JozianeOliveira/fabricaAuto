/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricaAuto;

/**
 *
 * @author Particular
 */
public class Carro extends Automovel {

    private int tetoSolar;
    private int aberto;

    public Carro(String cor, String placa, String modelo) {
        super(cor, placa, modelo);
        this.tetoSolar = 0;
        this.aberto = 0;
    }

    public void abrirTeto() {
        this.tetoSolar = 1;
        System.out.println("O teto solar foi aberto.");
    }

    public void fecharTeto() {
        this.tetoSolar = 0;
        System.out.println("O teto solar foi fechado.");
    }

    public void abrirPorta() {
        this.aberto = 1;
        System.out.println("A porta do carro foi aberta.");
    }

    public void fecharPorta() {
        this.aberto = 0;
        System.out.println("A porta do carro foi fechada.");
    }

    public void abrirFechar() {
        if (this.aberto == 0) {
            this.aberto = 1;
            System.out.println("Carro aberto.");
        } else {
            this.aberto = 0;
            System.out.println("Carro fechado.");
        }
    }
}
