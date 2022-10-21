package core.logging;

public class DatabaseLogger implements Logger{
    public void log(String data) {
        System.out.println("Veritabanına loglandı : " + data);
    }
}
