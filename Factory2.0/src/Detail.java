/**
 * Created by fur1k on 26.05.2017.
 */
import java.io.Serializable;

public class Detail implements Cloneable  {
    private String country;
    private String name;

    public Detail(String country, String name){
        this.setCountry(country);
        this.setName(name);
    }
    public String getContry(){
        return country;
    }
    public void setCountry (String country){
        this.country = country;
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;
    }
    public Detail clone() throws CloneNotSupportedException{
        Detail cloned = (Detail) super.clone();
        return cloned;
    }
}