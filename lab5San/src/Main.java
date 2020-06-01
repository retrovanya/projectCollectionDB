import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
public class Main   {
    public static void main (String args[]) throws AllException, JAXBException, IOException, ParserConfigurationException {
CollectionOfPersons collection = new CollectionOfPersons();
collection.CollectionWork();
Interactive interactive = new Interactive();
        interactive.ScanInteractive();
    }}



