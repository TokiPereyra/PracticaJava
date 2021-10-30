package domain;

/**
 *
 * @author Tomás Emmanuel Pereyra
 */
public class Persona {
    private String name;
    
    public Persona(String name) {
        this.name = name;
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
