import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ShortLister {
    //lets the user pick a text file which uses the filter to display the short words from the file

    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ArrayList<String> shortWords = new ArrayList<>();
            ShortWordFilter filter = new ShortWordFilter();
            try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] words = line.split("\\W+");
                    for (String word : words) {
                        if (filter.accept(word)) {
                            shortWords.add(word);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Short words (length < 5):");
            for (String word : shortWords) {
                System.out.println(word);
            }
        }
    }

}
