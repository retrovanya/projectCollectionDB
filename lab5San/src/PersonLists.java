import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement(name="lists")
public class PersonLists{

   public  List<Person> PersonList;

    public List<Person> getPersonList() {
        return PersonList;
    }

    public void setPersonList(List<Person> PersonList) {
        this.PersonList = PersonList;
    }

}