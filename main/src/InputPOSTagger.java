// This program will parse the user input and tag the proper POS.

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import opennlp.tools.postag.POSModel;

public class InputPOSTagger {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        try (InputStream modelIn = new FileInputStream("en-pos-maxent.bin")) {
            POSModel model = new POSModel(modelIn);
        }
    }
}

