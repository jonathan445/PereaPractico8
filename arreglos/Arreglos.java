/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author jpere
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matriz matriz = new Matriz ();
        matriz.armar();
        for (int i = 0 ; i < matriz.getMatriz().length ; i++){
            System.out.print("Fila " + (i+1) + " --> ");
            for (int a = 0 ; a < matriz.getMatriz()[i].length ; a++){
                if (matriz.getMatriz()[i][a] % 2 == 0 ){
                    System.out.print(matriz.getMatriz()[i][a] + " ");
                }
            }
            System.out.println();
            
        }
    }
    
}
