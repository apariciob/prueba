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
    
    public void cabeza(){
        int cabezaloca=180;
        int loquito= 80;
        String nombre;
        if(cabezaloca> loquito){
            nombre="Carlos";
        }
    }
    
    public void alejo(){
        int num = 5;
        if(num==5){
            System.out.println("Alejo es puto");
        }
    }

    @Override
    public String toString() {
        return "claseDePrueba{" + "numero=" + numero + ", texto=" + texto + '}';
    }
    
    
}
