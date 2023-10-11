
package ClaseNueveBis;


public class Principal {
    
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("AF128", "Ferrari", "A8");
        
        misVehiculos[1] = new VehiculoTurismo(4, "RST123", "Peugeot", "504");
        
        misVehiculos[2] = new VehiculoDeportivo(500, "ABC145", "GolGTI", "3");
        
        misVehiculos[3] = new VehiculoFurgoneta(300, "MNO654", "Fiat", "Fiorino");
        
        for ( Vehiculo vehiculos: misVehiculos ){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
        
    }
    
}
