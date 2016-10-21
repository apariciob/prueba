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
    String fecha;

    public claseDePrueba(int numero, String texto, String fecha) {
        this.numero = numero;
        this.texto = texto;
        this.fecha = fecha;
    }

    public void textoGrande(){
        if(this.texto.length()==5){
            System.out.println("Texto grande");
        }
    }

    @Override
    public String toString() {
        return "claseDePrueba{" + "numero=" + numero + ", texto=" + texto + '}';
    }
    
    
}
