import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

public class InputPOSTagger {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        try (InputStream modelIn = new FileInputStream("en-pos-maxent.bin")) {
            POSModel model = new POSModel(modelIn);
        }
    }
}

