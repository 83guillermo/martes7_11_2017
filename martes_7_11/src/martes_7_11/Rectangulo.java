
package martes_7_11;

/*
prueba de visibilidad 
de atributos y metodos
*/
public class Rectangulo {
    
    private float alto;
    private float ancho;
  
     public void setDimensiones(float alto,float ancho){
        this.alto=alto;
        this.ancho=ancho;
    }
     
   public float cacluarPerimetro(){
       float per=2*alto+2*ancho;
        return per;
       }
   
}
