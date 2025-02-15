package ent1.ejb.e3;

public class Author {

    // Zona de atributos
    private String name;
    private String email;

    // Zona de constructor
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Zona de métodos: Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Zona de métodos: Setters
    public void setEmail(String email) {
        this.email = email;
    }

    // Zona de métodos: Otros
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + "]";
    }
}

