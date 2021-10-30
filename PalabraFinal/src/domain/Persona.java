package domain;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public final class Persona { //La palabra "final" en una clase significa que no puede tener hijas.

    public final static int UNA_CONSTANTE = 7;
    
    private String name;
    
    

    public final void imprimir() { //La palabra "final" en un método significa que la clase hija no podrá sobreescribir su comportamiento.
        System.out.println("Ejecutando el método.");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{name=").append(name);
        sb.append('}');
        return sb.toString();
    }
    
    
}
