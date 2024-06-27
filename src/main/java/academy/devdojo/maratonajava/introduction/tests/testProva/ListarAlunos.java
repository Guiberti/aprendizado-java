package academy.devdojo.maratonajava.introduction.tests.testProva;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ListarAlunos {
    public static String getJsonData() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/students");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("accept", "application/json");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();
            return response.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
