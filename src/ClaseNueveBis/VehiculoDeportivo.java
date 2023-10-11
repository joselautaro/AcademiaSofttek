
package ClaseNueveBis;


public class VehiculoDeportivo extends Vehiculo{
    
    private final int cilindrada;
    
    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    public int getCilindrada(){
        return cilindrada;
    }
    
     public String mostrarDatos(){
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCilindrada: " + cilindrada;
    }
    
}
