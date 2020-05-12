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
public class Matriz {
    private int matriz [][];
    public int[][] getMatriz(){
        return matriz;
    }
    public void armar(){
        matriz = new int[4][];
        matriz[0] = new int[4];
        matriz[1] = new int[3];
        matriz[2] = new int[5];
        matriz[3] = new int[2];
        matriz[0][0] = 3;
        matriz[0][1] = 6;
        matriz[0][2] = 9;
        matriz[0][3] = 12;
        matriz[1][0] = 15;
        matriz[1][1] = 18;
        matriz[1][2] = 21;
        matriz[2][0] = 24;
        matriz[2][1] = 27;
        matriz[2][2] = 30;
        matriz[2][3] = 33;
        matriz[2][4] = 36;
        matriz[3][0] = 39;
        matriz[3][1] = 42;
    }
}
