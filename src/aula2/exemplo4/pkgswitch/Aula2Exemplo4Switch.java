/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2.exemplo4.pkgswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author jwern
 */
public class Aula2Exemplo4Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int controle;
        int resultado, numero1 = 10, numero2 = 5;

        controle = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Qual operação você quer executar?\n1 - adição\n2 - subtração"
            )
        );

        switch (controle) {

            case 1 -> {
                resultado = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            }

            case 2 -> {
                resultado = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            }

            default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}