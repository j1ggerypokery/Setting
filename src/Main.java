import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        List<String> directories = Arrays.asList(
                "Users/Oleg/Desktop/Games/src",
                "Users/Oleg/Desktop/Games/res",
                "Users/Oleg/Desktop/Games/savegames",
                "Users/Oleg/Desktop/Games/temp",
                "Users/Oleg/Desktop/Games/src/main",
                "Users/Oleg/Desktop/Games/src/test",
                "Users/Oleg/Desktop/Games/res/drawables",
                "Users/Oleg/Desktop/Games/res/vectors",
                "Users/Oleg/Desktop/Games/res/icons"
        );
        createDirectory(directories);

        List<String> files = Arrays.asList(
                "Users/Oleg/Desktop/Games/src/main/Main.java",
                "Users/Oleg/Desktop/Games/src/main/Utils.java",
                "Users/Oleg/Desktop/Games/temp/temp.txt"
        );
        createFile(files);
    }

    public static void createDirectory(List<String> directories) {

        for (int i = 0; i < directories.size(); i++) {
            File dir = new File("Users/Oleg/Desktop/Games");
            if (dir.mkdirs())
                System.out.println("Каталог создан" + directories);
            else {
                System.out.println("Каталог" + directories + "не создан");
            }
        }
        append();
    }

    public static void append() {
        try (FileWriter writer = new FileWriter("Users/Oleg/Desktop/Games/temp/temp.txt")) {
            writer.write(builder.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void createFile(List<String> files) {
        for (int i = 0; i < files.size(); i++) {
            File myFile = new File(String.valueOf(files));
            try {
                if (myFile.createNewFile())
                    System.out.println("Файл был создан");
                else {
                    System.out.println("Файл НЕ был создан");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}




