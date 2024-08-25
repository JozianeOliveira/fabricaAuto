/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricaAuto;

/**
 *
 * @author Particular
 */
public class Automovel {

    private String cor;
    private String placa;
    private String modelo;
    private int ligado;
    private int emMovimento;

    public Automovel(String cor, String placa, String modelo) {
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.ligado = 0;
        this.emMovimento = 0;
    }

    public void ligar() {
        this.ligado = 1;
        System.out.println("O automóvel está ligado.");
    }

    public void mover() {
        if (this.ligado == 1) {
            this.emMovimento = 1;
            System.out.println("O automóvel está em movimento.");
        } else {
            System.out.println("O automóvel precisa estar ligado para se mover.");
        }
    }

    public void parar() {
        if (this.emMovimento == 1) {
            this.emMovimento = 0;
            System.out.println("O automóvel está parado.");
        } else {
            System.out.println("O automóvel já está parado.");
        }
    }
}

