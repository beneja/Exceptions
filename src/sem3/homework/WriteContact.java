package sem3.homework;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteContact {
    public void write(Contact contact) {
        try {
            FileWriter writer = new FileWriter(new File(contact.getSurname() + ".txt"), true);
            writer.write(contact.toString());
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
