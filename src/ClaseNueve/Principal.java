
package ClaseNueve;

public class Principal {
    
    public static void main(String[] args) {
        Planta p1 = new Planta();
        
        Animal ac = new AnimalCarnivoro();
        
        ac.alimentarse();
        
        p1.alimentarse();
    }
    
}
