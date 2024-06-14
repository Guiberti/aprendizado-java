package listasProfSandroResolucao.segundob.Aulas.Aula06;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpSample {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://economia.awesomeapi.com.br/json/last/USD");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

}
