package org.example;

//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import au.com.bytecode.opencsv.CSVReader;
public class Main
{
    public static void main(String[] args) throws IOException {
        ArrayList<Person> personArrayList = new ArrayList<>();
        String csvFilePath="foreign_names.csv";
        InputStream in = Main.class.getClassLoader().getResourceAsStream(csvFilePath);
        char separator =',';
        CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), separator);
        if (reader == null)
        {
            System.out.print("Error! File not found!");
            return;
        }
        String[] nextLine;
        nextLine = reader.readNext();
        while ((nextLine = reader.readNext()) != null)
        {
            if (nextLine != null)
            {
                String currentLine = Arrays.toString(nextLine);
                String[] words = currentLine.split(";");
                words[0] = words[0].replace("[","");
                words[5] = words[5].replace("]","");
                personArrayList.add(new Person(words[0],words[1],words[2],
                        words[3],words[4],words[5]));
            }
        }
        int size = personArrayList.size();
        for (int i = 0;i<size;i++)
        {
            personArrayList.get(i).printDataPersonWithoutFormat();
            System.out.print("\n");
        }
    }
}