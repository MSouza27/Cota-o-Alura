import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Arquivo {
    public void geradorDeArquivo(Moedas moedas) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter dados = new FileWriter("cambio.json");
        dados.write(gson.toJson(moedas));
        dados.close();
    }
}


