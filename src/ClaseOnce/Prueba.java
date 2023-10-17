
package ClaseOnce;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Prueba {
    
    public void leerArchivo() throws IOException{
        
        
        //Creamos un objeto "file" que representa la ubicación del archivo en el sistema de archivos
        File archivo = new File("C:\\Users\\Usuario\\Desktop\\AcademiaSofttek\\src\\archivo.txt");
        
        //Iniciamos un bloque try para manejar excepciones que pueda ocurrir al abrir el archivo
        try(FileReader fr = new FileReader(archivo)){
           
            int c;
            
            //Iiniciamos un bucle "while" que se ejecuta mientras haya caracteres por leer en el archivo
            while( (c = fr.read()) != -1 ){
                System.out.println((char) c);
            }
            }catch ( FileNotFoundException e){
                System.out.println("Error: El archivo no se pudo encontrar");
           }
    }
        public void leerArchivo2() throws IOException{
            //Llamamos al método "leerArchivo" desde otro método de la misma clase
            leerArchivo();  
          }
        
        public static void main(String[] args) {
            
          //Creamos una instancia de la clase padre
        Prueba archivo = new Prueba();
        //Iniciamos un bloque Try-catch para manejar las excepciones que puedan ocurrir al llamar al método "leerArchivo"
        try{
            archivo.leerArchivo();
        }catch( IOException e ){
            System.out.println("Error en la lectura: " + e.getMessage());
        }
        
    }
    
}
