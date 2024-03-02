import static java.sql.DriverManager.println;

public class HDD {
    void copyFromDVD(DVDRom dvd){
        if (dvd.hasData()){
           println("Происходит копирование данных с диска");
        }
        else{
            println("Вставьте диск с данными");
        }
    }
}
