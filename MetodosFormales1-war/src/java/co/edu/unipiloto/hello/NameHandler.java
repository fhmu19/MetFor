
package co.edu.unipiloto.hello;

public class NameHandler 
{
    private String name,apellido,fechaNac;
    private String anioIn,semestre;
    
    
    public NameHandler() {
        this.name = null;
        this.apellido = null;
        this.fechaNac = null;
        this.anioIn = null;
        this.semestre = null;
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getAnioIn() {
        return anioIn;
    }

    public void setAnioIn(String anioIn) {
        this.anioIn = anioIn;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

   
}
