
package martes_7_11;


public class Martes_7_11 {

   
    public static void main(String[] args) {
        
        /*
        Rectangulo perimetro = new Rectangulo();
        float var1=perimetro.alto=12;
        float var2=perimetro.ancho=9;
        float var3=2*var1+2*var2;
        System.out.println("este es el perimetro"+var3);
        */
        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.setDimensiones(10, 5);
      
        
        System.out.println("el perimetro es "+rectangulo2.cacluarPerimetro());
        
  
    }
    
}
