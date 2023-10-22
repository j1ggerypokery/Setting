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
        for (String directory : directories) {
            createDirectory(directory);
        }

        List<String> files = Arrays.asList(
                "Main.java",
                "Utils.java"
                //"temp.txt" // - убрала, чтобы не создавать файл temptemp.txt
        );
        List<String> path = Arrays.asList(
                "Users/Oleg/Desktop/Games/src/main",
                "Users/Oleg/Desktop/Games/src/main"
                //"Users/Oleg/Desktop/Games/temp" // - убрала, чтобы не создавать файл temptemp.txt
        );
        for (int i = 0; i < files.size(); i++) {
            createFile(path.get(i), files.get(i));
        }
    }

    public static void createDirectory(String directories) {
        File dir = new File(directories);
        if (dir.mkdirs())
            System.out.println("Каталог создан " + directories);
            //     builder.append("Каталог" + directories + "создан"); // - лучше System.out.println, тк выводит запись создан/не создан
        else {
            System.out.println("Каталог" + directories + " не создан");
            //    builder.append("Каталог" + directories + "НЕ создан");
        }
    //    builder.append("\n");
    }

    public static void createFile(String path, String fileName) {
        File myFile = new File(path + fileName);
        try {
            if (myFile.createNewFile())
                System.out.println(fileName + " Файл был создан");
            else {
                System.out.println(fileName + " Файл НЕ был создан");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileWriter writer = new FileWriter("Users/Oleg/Desktop/Games/temp/temp.txt", false)) {
            writer.write(builder.toString());
            writer.append("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}




