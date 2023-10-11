
package ClaseNueveBis;


public class VehiculoTurismo extends Vehiculo{
    
    private final int nPuertas;
    
    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }
    
    public int getnPuertas(){
        return nPuertas;
    }

  
    public String mostrarDatos(){
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nNúmero de puertas: " + nPuertas;
    }
    
    
}
