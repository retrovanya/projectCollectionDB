import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Interactive {
        HelpMenu1 helpMenu1 = new HelpMenu1();
CollectionOfPersons col = new CollectionOfPersons();
Person persUn = new Person();
        public Interactive() throws IOException, ParserConfigurationException, AllException {
        }
        long k =0;
        int yuy=0;
    ArrayList<String> historyCom= new ArrayList<String>();
        public void ScanInteractive() throws ParserConfigurationException, IOException, AllException, JAXBException {
            System.out.println("Введите команду. Для просмотра возможных команд введите help");
            Scanner scanInteractive = new Scanner(System.in);
            String userCommand = "";
            String[] finalUserCommand;
            while (!userCommand.equals("exit") ) {
                try {
                userCommand = scanInteractive.nextLine();} catch (NoSuchElementException e){
                    System.out.println("ошибка NoSuchElement, повторите ввод");
                ScanInteractive();}
                userCommand = userCommand.trim();
                finalUserCommand = userCommand.trim().split(" ", 2);
                switch (finalUserCommand[0]) {
                    case"help":
                        helpMenu1.InfoMenu1();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "script":
                        hy();
                        historyCom.add(userCommand);
                        k=k+1;
                        yuy = yuy+1;
                        break;
                    case"info":
                        col.infoCollection();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case"show":
                        CollectionOfPersons.showColllection();
                        historyCom.add(userCommand);
                        k = k+1;
                      break;
                    case"insertElement":
                        InterScanner.personCreator();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "removeByKey":
                        persUn.removeByKey();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case"updateById":
                        InterScanner.changeElement();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "removeGreater":
                        persUn.compare();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "removeLower":
                        persUn.compare2();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "sumOfHeight":
                        persUn.sumOfHeight();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "maxByEyeColor":
                        persUn.maxEye();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case "filterName":
                        persUn.stringFishing();
                        historyCom.add(userCommand);
                        k = k+1;
                        break;
                    case"clear":
                        CollectionOfPersons.MyCollection.clear();
                        historyCom.add(userCommand);
                        k = k+1;
                        System.out.println("Все элементы коллекции удалены");
                        break;
                    case "history":
                        System.out.println("Последние команды:");
                        historyCom.add(userCommand);
                        k = k+1;
                        historyInf();
                        break;
                    case "save":
                        XMLWorker.saveCollection();
                        historyCom.add(userCommand);
                        k = k+1;
                        System.out.println("Коллекция сохранена");
                        break;
                    case"exit":
                }
            }
        }
    public  void historyInf(){
        if (k>0){
            System.out.println(historyCom);
        }
        }
    public  void hy() {
        Scanner scanner = null;
        try {


            Scanner scanInteractive = new Scanner(System.in);
            String userCommand = "";
            String[] finalUserCommand;
            Scanner scanf = new Scanner(System.in);
            System.out.println("Введите имя файла со скриптом");
            try {
                String ggg = scanf.nextLine();
                FileReader fr = new FileReader(ggg);
                Scanner scanCloser = new Scanner(fr);


                while ((scanCloser.hasNextLine()) && (yuy < 5)) {

                    userCommand = scanCloser.nextLine();
                    //userCommand = userCommand.trim();
                    finalUserCommand = userCommand.trim().split(" ", 2);


                    switch (finalUserCommand[0]) {
                        case "help":
                            helpMenu1.InfoMenu1();
                            historyCom.add(userCommand);
                            k = k + 1;
                            break;
                        case "info":
                            col.infoCollection();
                            historyCom.add(userCommand);
                            k = k + 1;
                            break;
                        case "clear":
                            CollectionOfPersons.MyCollection.clear();
                            System.out.println("Все элементы коллекции удалены");
                            historyCom.add(userCommand);
                            k = k + 1;
                            break;
                        case "show":
                            System.out.println(CollectionOfPersons.MyCollection);
                            historyCom.add(userCommand);
                            k = k + 1;
                            break;
                        case "insertElement":
                            int t = CollectionOfPersons.MyCollection.size();
                            Person fl = new Person();
                            fl.setName(scanCloser.nextLine());
                            Double num = Double.parseDouble(scanCloser.nextLine());
                            Double num2 = Double.parseDouble(scanCloser.nextLine());
                            fl.setCoordinates(new Coordinates(num, num2));
                            Double num3 = Double.parseDouble(scanCloser.nextLine());
                            fl.setHeight(num3);
                            Long num4 = Long.parseLong(scanCloser.nextLine());
                            fl.setKey(num4);
                            String color = scanCloser.nextLine();
                            if (color.equals("1"))
                                fl.setColor(Color.RED);
                            if (color.equals("2"))
                                fl.setColor(Color.BLACK);
                            if (color.equals("3"))
                                fl.setColor(Color.YELLOW);
                            if (color.equals("4"))
                                fl.setColor(Color.ORANGE);
                            if (color.equals("5"))
                                fl.setColor(Color.BROWN);
                            String color1 = scanCloser.nextLine();
                            if (color1.equals("1"))
                                fl.setColor1(Color1.RED);
                            if (color1.equals("2"))
                                fl.setColor1(Color1.BLACK);
                            if (color1.equals("3"))
                                fl.setColor1(Color1.BLUE);
                            if (color1.equals("4"))
                                fl.setColor1(Color1.WHITE);
                            if (color1.equals("5"))
                                fl.setColor1(Color1.ORANGE);
                            String country = scanCloser.nextLine();
                            if (country.equals("1"))
                                fl.setCountry(Country.UNITED_KINGDOM);
                            if (country.equals("2"))
                                fl.setCountry(Country.VATICAN);
                            if (country.equals("3"))
                                fl.setCountry(Country.THAILAND);
                            Location location = new Location();
                            location.x = Long.parseLong(scanCloser.nextLine());
                            location.y = Double.parseDouble(scanCloser.nextLine());
                            location.z = Integer.parseInt(scanCloser.nextLine());


                            fl.setLocation(location);
                            fl.setId(persUn.randomID());
                            CollectionOfPersons.MyCollection.add(fl);
                            if (CollectionOfPersons.MyCollection.size() != t)
                                System.out.println("Персонаж успешно добавлена в коллекцию.");
                            historyCom.add(userCommand);
                            k = k + 1;
                            break;
                        case "removeById":
                            removeByKeyScript(scanCloser.nextLine());
                            historyCom.add(userCommand);
                            k = k + 1;
                            break;
                        case "save":
                            XMLWorker.saveCollection();
                            historyCom.add(userCommand);
                            k = k + 1;
                            System.out.println("Коллекция сохранена");
                            break;
                        case "sumOfHeight":
                            persUn.sumOfHeight();
                            historyCom.add(userCommand);
                            k = k + 1;
                            break;
                        case "maxByColor":
                            persUn.maxEye();
                            historyCom.add(userCommand);
                            k = k + 1;
                            break;
                        case "filterName":
                            stringFishingScript(scanCloser.nextLine());
                            historyCom.add(userCommand);
                            k = k + 1;
                            break;
                        case "removeGreater":
                            compareScript(scanCloser.nextLine());
                            historyCom.add(userCommand);
                            k = k + 1;
                            break;
                        case "removeLower":
                            compare2Script(scanCloser.nextLine());
                            historyCom.add(userCommand);
                            k = k + 1;
                            break;
                        case "history":
                            System.out.println("Последние команды:");
                            historyCom.add(userCommand);
                            k = k + 1;
                            historyInf();
                            break;
                        case "script":
                            yuy = yuy + 1;
                            hy();
                            break;
                        case "exit":
                            System.exit(0);
                    }


                }
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (AllException e) {
                e.printStackTrace();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (JAXBException e) {
                e.printStackTrace();
            } catch (NumberFormatException e ) {
                System.out.println( "скрипт заполнен неккоректно"
                );
            }
        } catch (NoSuchElementException e){
            System.out.println("ошибка NoSuchElement, начните заново");
            }

    }

    public void removeByKeyScript(String str) throws IOException, AllException {
        long idScanner = -20000;
        int k = 0;
        Long numID = Long.parseLong(str);
        idScanner = numID;

            Iterator<Person> itr = CollectionOfPersons.MyCollection.iterator();
            while(itr.hasNext()){
                Person pers33 = itr.next();
                if(pers33.getKey() == idScanner){
                    CollectionOfPersons.MyCollection.remove(pers33);
                    System.out.println("Элемент коллекции был успешно удален.");
                    k = k+1;
                } }
            if (k == 0){
                System.out.println("Элемента с введенным вами ключом в коллекции нет.");
            }
    }
    public void stringFishingScript(String str){
        String nameScanner = "hhh222" ;
        int k = 0;
        nameScanner = str;
            Iterator<Person> itr2 = CollectionOfPersons.MyCollection.iterator();
            while (itr2.hasNext()) {
                Person persona = itr2.next();
                String s = persona.getName();
                boolean isContain1 = s.contains(nameScanner);
                if (isContain1) {System.out.println(persona);
                    k=k+1;}
            }
            if (k == 0) System.out.println("В коллекции нет элемента, имя которого оодержит введенные вами символы");

    }
    public void compareScript(String str)  {
        long idScanner = -10;
        int k = 0;
        Long numID = Long.parseLong(str);

        int t = CollectionOfPersons.MyCollection.size();
        int t1 = CollectionOfPersons.MyCollection.size();
        idScanner = numID;

            Iterator<Person> itr = CollectionOfPersons.MyCollection.iterator();
            while(itr.hasNext()){
                Person persi = itr.next();
                if(persi.getKey() == idScanner){
                    k = k+1;
                }
            }
            if (k>0) {
                Iterator<Person> itr1 = CollectionOfPersons.MyCollection.iterator();
                while(itr1.hasNext()){
                    Person pers222 = itr1.next();
                    if(pers222.getKey() > idScanner){
                        itr1.remove();
                        t= t-1;
                    }
                }
                if (t1!=t) System.out.println("Коллекция была обновлена."); else System.out.println("В коллекции нет элемента, превышающего введенный вами.");
            }
            else System.out.println("В коллекции нет элемента с таким ключом.");

    }
    public void compare2Script(String str)  {
        long idScanner = -10;
        int k = 0;
        Long numID = Long.parseLong(str);
        int t = CollectionOfPersons.MyCollection.size();
        int t1 = CollectionOfPersons.MyCollection.size();

        idScanner=numID;

        Iterator<Person> itr = CollectionOfPersons.MyCollection.iterator();
        while(itr.hasNext()){
            Person persi = itr.next();
            if(persi.getKey() == idScanner){
                k = k+1;
            }
        }
        if (k>0) {
            Iterator<Person> itr1 = CollectionOfPersons.MyCollection.iterator();
            while(itr1.hasNext()){
                Person pers222 = itr1.next();
                if(pers222.getKey() < idScanner){
                    itr1.remove();
                    t= t-1;
                }
            }
            if (t1!=t) System.out.println("Коллекция была обновлена."); else System.out.println("В коллекции нет элемента, меньшего чем введенный вами.");
        }
        else System.out.println("В коллекции нет элемента с таким ключом.");
    }}


