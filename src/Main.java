import java.io.*;

public class Main {
    public static void main(String[] args) {


        File dir = new File("Users/Oleg/Desktop/Games");
        if (dir.mkdir())
            System.out.println("Каталог создан");


        File dir1 = new File("Users/Oleg/Desktop/Games/src");
        boolean created1 = dir1.mkdir();
        if (created1)
            System.out.println("Folder1 has been created");

        File dir1Dir1 = new File("Users/Oleg/Desktop/Games/src/main");
        boolean created11 = dir1Dir1.mkdir();
        if (created11)
            System.out.println("Folder11 has been created");

        File myFile111 = new File("Users/Oleg/Desktop/Games/src/main/Main.java");
        try {
            if (myFile111.createNewFile())
                System.out.println("Файл111 был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File myFile112 = new File("Users/Oleg/Desktop/Games/src/main/Utils.java");
        try {
            if (myFile112.createNewFile())
                System.out.println("Файл112 был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File dir1Dir2 = new File("Users/Oleg/Desktop/Games/src/test");
        boolean created12 = dir1Dir2.mkdir();
        if (created12)
            System.out.println("Folder12 has been created");

        File dir2 = new File("Users/Oleg/Desktop/Games/res");
        boolean created2 = dir2.mkdir();
        if (created2)
            System.out.println("Folder2 has been created");

        File dir2Dir1 = new File("Users/Oleg/Desktop/Games/res/drawables");
        boolean created21 = dir2Dir1.mkdir();
        if (created21)
            System.out.println("Folder21 has been created");

        File dir2Dir2 = new File("Users/Oleg/Desktop/Games/res/vectors");
        boolean created22 = dir2Dir2.mkdir();
        if (created22)
            System.out.println("Folder22 has been created");

        File dir2Dir3 = new File("Users/Oleg/Desktop/Games/res/icons");
        boolean created23 = dir2Dir3.mkdir();
        if (created23)
            System.out.println("Folder23 has been created");

        File dir3 = new File("Users/Oleg/Desktop/Games/savegames");
        boolean created3 = dir3.mkdir();
        if (created3)
            System.out.println("Folder3 has been created");

        File dir4 = new File("Users/Oleg/Desktop/Games/temp");
        boolean created4 = dir4.mkdir();
        if (created4)
            System.out.println("Folder4 has been created");

        File myFile41 = new File("Users/Oleg/Desktop/Games/temp/temp.txt");
        try {
            if (myFile41.createNewFile())
                System.out.println("Файл41 был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String text = "Hello world!";
// откроем байтовый поток записи в файл
        try (FileOutputStream fos = new FileOutputStream("temp.txt")) {
// перевод строки в массив байтов
            byte[] bytes = text.getBytes();
// запись байтов в файл
            fos.write(bytes, 0, bytes.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter("temp.txt", false)) {
// запись всей строки
            writer.write(text);
// запись по символам
            writer.append('\n');
            writer.append('!');
// дозаписываем и очищаем буфер
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}