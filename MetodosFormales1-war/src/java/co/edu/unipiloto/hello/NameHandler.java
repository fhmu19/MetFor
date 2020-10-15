
package co.edu.unipiloto.hello;

import java.util.Calendar;
import java.util.Locale;

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
        String fecha[]=fechaNac.split("/");
        int din=Integer.parseInt(fecha[0]);
        int min=Integer.parseInt(fecha[1]);
        int ain=Integer.parseInt(fecha[2]);
        System.out.println("Fecha="+din+"/"+min+"/"+ain);
        Calendar c=Calendar.getInstance(Locale.CANADA);
        String d = Integer.toString(c.get(Calendar.DATE));
        String m = Integer.toString(c.get(Calendar.MONTH));
        String a = Integer.toString(c.get(Calendar.YEAR));
        int dac=Integer.parseInt(d);
        int mac=Integer.parseInt(m)+1;
        int yac=Integer.parseInt(a);
        System.out.println("Fecha actual="+dac+"/"+mac+"/"+yac);
        if(ain==yac && mac==min && dac>din || ain==yac && mac>min || ain>yac ||(min>12||min<1)||(din<1||din>31))
        {
            this.fechaNac="Fecha de nacimiento no valida";
            System.out.println("Fecha de nacimiento no valida");
        }else if((ain<=yac && min<mac && din>dac))//Ya cumplio dia mayor a dia actual Listo
        {
            this.fechaNac="Edad: "+((yac-ain))+"años/"+(mac-min)+"meses/"+((30-din)+dac)+"dias";
            System.out.println("Edad: "+((yac-ain))+"años/"+(mac-min)+"meses/"+((30-din)+dac)+"dias");
        }else if((ain<=yac && min<mac && din<=dac))//Ya cumplio dia menor o igual a dia actual Listo
        {
            this.fechaNac="Edad: "+((yac-ain))+"años/"+(mac-min)+"meses/"+(dac-din)+"dias";
            System.out.println("Edad: "+((yac-ain))+"años/"+(mac-min)+"meses/"+(dac-din)+"dias");
        }else if((ain<=yac && min==mac && din>dac))//No ha cumplido dia mayor a dia actual Listo
        {
            this.fechaNac="Edad: "+((yac-ain)-1)+"años/"+(11)+"meses/"+((30-din)+dac)+"dias";
            System.out.println("Edad: "+((yac-ain)-1)+"años/"+(11)+"meses/"+((30-din)+dac)+"dias");
        }else if((ain<=yac && min==mac && din<dac))//Ya cumplio dia menor a dia actual Listo
        {
            this.fechaNac="Edad: "+((yac-ain))+"años/"+(mac-min)+"meses/"+(dac-din)+"dias";
            System.out.println("Edad: "+((yac-ain))+"años/"+(mac-min)+"meses/"+(dac-din)+"dias");
        }else if(ain<=yac && min>mac && din>dac )//No ha cumplido mes mayor dia mayor a dia actual Listo 
        {
            this.fechaNac="Edad: "+((yac-ain)-1)+"años/"+(12-min+mac-1)+"meses/"+((30-din)+dac)+"dias";
            System.out.println("Edad: "+((yac-ain)-1)+"años/"+(12-min+mac)+"meses/"+((30-din)+dac)+"dias");
        }else if(ain<=yac && min>mac && din<dac )//No ha cumplido mes mayor dia menor o igual a dia actual Listo
        {
            this.fechaNac="Edad: "+((yac-ain)-1)+"años/"+(12-min+mac)+"meses/"+(dac-din)+"dias";
            System.out.println("Edad: "+((yac-ain)-1)+"años/"+(12-min+mac)+"meses/"+(dac-din)+"dias");
        }
                
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
        
        Calendar c=Calendar.getInstance(Locale.CANADA);
        String anio = Integer.toString(c.get(Calendar.YEAR));
        int sem=Integer.parseInt(semestre);
        int year=Integer.parseInt(anio);
        int anioIn=Integer.parseInt(this.anioIn);
        year=year-anioIn;
        if(sem==1){
            this.semestre=""+(year*2+2)+" Semestre";
        }else if(sem==2){
            this.semestre=""+(year*2+1)+" Semestre";
        }
        
    }

   
}
