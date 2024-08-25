/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricaAuto;

/**
 *
 * @author Particular
 */
public class Moto extends Automovel {

    private int freioAbs;
    private int temBau;
    private int alarme;

    public Moto(String cor, String placa, String modelo) {
        super(cor, placa, modelo);
        this.freioAbs = 0;
        this.temBau = 0;
        this.alarme = 0;
    }

    public void ativarFreioAbs() {
        this.freioAbs = 1;
        System.out.println("O freio ABS foi ativado.");
    }

    public void desativarFreioAbs() {
        this.freioAbs = 0;
        System.out.println("O freio ABS foi desativado.");
    }

    public void possuiBau() {
        this.temBau = 1;
        System.out.println("A moto possui baú.");
    }

    public void naoPossuiBau() {
        this.temBau = 0;
        System.out.println("A moto não possui baú.");
    }

    public void ativarAlarme() {
        this.alarme = 1;
        System.out.println("O alarme foi ligado.");
    }

    public void desativarAlarme() {
        this.alarme = 0;
        System.out.println("O alarme foi desligado.");
    }
}
