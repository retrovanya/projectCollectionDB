import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Location {
  public Long x;
   public Double y; //Поле не может быть null
    public Integer z; //Поле не может быть null
    Location(long x, Double y, Integer z) throws AllException{
        this.x=x;
        this.y = y;
        this.z = z;
    }


    Location(){
        this.x=x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString() {
        return ("Месторасположение в пространстве : x = " + x + ", y = "+ y+ ", z = " + z + "\n");
    }
}
