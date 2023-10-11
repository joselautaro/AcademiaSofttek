
package ClaseNueveBis;


public class Vehiculo {
    
    
    //Protected: hace que pueda ser accedido por los hijos de esta misma
    protected String matricula;
    
    protected String marca;
    
    protected String modelo;
    
    //Declaramos el método constructor
    
    public Vehiculo (String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    //Obetenemos los atributos mediantes getters
    public String getMatricula(){
        return matricula;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }

     public String mostrarDatos(){
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
    
    
}
