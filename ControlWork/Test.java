package ControlWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("C://Users//mihai//OneDrive//Рабочий стол//schedule.txt"));
        List<String> list = new ArrayList<String>();
        while (s.hasNext()) {
            list.add(s.next());
        }
        s.close();

    }
}