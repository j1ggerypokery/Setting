import java.io.*;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.createDirectory;

public class Main {
    StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {

        List<String> directories = Arrays.asList(
                "Users/Oleg/IdeaProjects/Setting/Games/src",
                "Users/Oleg/IdeaProjects/Setting/Games/res",
                "Users/Oleg/IdeaProjects/Setting/Games/savegames",
                "Users/Oleg/IdeaProjects/Setting/Games/temp",
                "Users/Oleg/IdeaProjects/Setting/Games/src/main",
                "Users/Oleg/IdeaProjects/Setting/Games/src/test",
                "Users/Oleg/IdeaProjects/Setting/Games/res/drawables",
                "Users/Oleg/IdeaProjects/Setting/Games/res/vectors",
                "Users/Oleg/IdeaProjects/Setting/Games/res/icons"
        );

        createDirectory(directories);


    }

    public static void createDirectory(List<String> directories) {

        File dir = new File("Users/Oleg/IdeaProjects/Setting/Games");
        //    while (directories.isEmpty()) {
        for (int i = 0; i < directories.size(); i++) {
            if (dir.mkdirs())
                System.out.println("Каталог создан" + directories);
            else {
                System.out.println("Каталог" + directories + "не создан");
            }
        }
//append();
    }

    //      public static void append(){
//try (FileWriter writer = new FileWriter()) {
    //   writer.write(StringBuilder.toString());
//}
//catch (IOException ex) {
//    System.out.println(ex.getMessage());
//}
    //     }

//       public static void createFile
}




