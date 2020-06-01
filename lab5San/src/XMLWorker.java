import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
public class XMLWorker {


    public static void saveCollection() throws JAXBException, IOException {
        try{
            String pathToFile = getFilePathForSave();
            if (pathToFile == null)
                System.out.println("----\nПуть не указан, дальнейшая работа не возможна.\n----");
            else {
                JAXBContext jaxbContext;
                PersonLists lists = new PersonLists();
                List lst = new ArrayList();
                lst.addAll(CollectionOfPersons.MyCollection);
                lists.setPersonList(lst);
                try {
                    File file = new File(pathToFile);
                    PrintWriter pw = new PrintWriter(file);
                    jaxbContext = JAXBContext.newInstance(PersonLists.class);
                    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
                    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                    jaxbMarshaller.marshal(lists, pw);
                } catch (JAXBException e) {
                    e.printStackTrace();
                }
            }
        }
        catch (NoSuchElementException e){
            e.getMessage();
        }
    }


    private static String getFilePathForSave(){
        String path = System.getenv("SecondFile");
        if (path == null){
            return ("----\nПуть через переменную окружения duo не указан\n----");
        } else {
            return path;
        }
    }
}
