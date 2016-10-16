/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Usuario
 */
public class claseDePrueba {
    
    int numero;
    String texto;

    public claseDePrueba(int numero, String texto) {
        this.numero = numero;
        this.texto = texto;
    }



    @Override
    public String toString() {
        return "claseDePrueba{" + "numero=" + numero + ", texto=" + texto + '}';
    }
    
    
}
