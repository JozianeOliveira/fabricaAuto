/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricaAuto;

/**
 *
 * @author Particular
 */
public class FabricaAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro carro = new Carro("Branco", "ABC-1234", "Camaro");
        // Ligando o carro
        carro.ligar();

        // Movendo o carro
        carro.mover();

        // Abrindo o teto solar
        carro.abrirTeto();

        // Abrindo a porta
        carro.abrirPorta();

        // Aberto ou fechado
        carro.abrirFechar();

        // Abrindo a porta
        carro.abrirPorta();

        // Fechando a porta
        carro.fecharPorta();

        // Aberto ou fechado
        carro.abrirFechar();

        // Fechando o teto solar
        carro.fecharTeto();

        // Parando o carro
        carro.parar();

        // Criando um objeto Moto
        Moto moto = new Moto("Azul", "DEF-5678", "CB 650R");

        // Ligando a moto
        moto.ligar();

        // Movendo a moto
        moto.mover();

        // Ativando o freio ABS
        moto.ativarFreioAbs();

        // Possui baú
        moto.possuiBau();

        // Não possui baú
        moto.naoPossuiBau();

        // Desativando o freio ABS
        moto.desativarFreioAbs();

        // Parando a moto
        moto.parar();

        // Ativando o alarme
        moto.ativarAlarme();

        // Desativando o alarme
        moto.desativarAlarme();

    }
}
