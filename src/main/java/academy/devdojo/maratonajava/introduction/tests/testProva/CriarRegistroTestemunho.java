package academy.devdojo.maratonajava.introduction.tests.testProva;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CriarRegistroTestemunho {

    public static String getJsonData(String urlAluno, String raAluno, String testemunhoAluno) {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\n" +
                    "  \"imageUrl\": \" " + urlAluno + " \",\n" +
                    "  \"description\": \" " + testemunhoAluno + "\",\n" +
                    "  \"ra\": \" " + raAluno + " \"\n" +
                    "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            Pattern pattern = Pattern.compile("\"(\\w+)\":\"([^\"]+)\"");
            Matcher matcher = pattern.matcher(response.toString());

            Map<String, Object> jsonData = new HashMap<>();

            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);

                jsonData.put(key, value);
            }
            System.out.println(jsonData);

            //showDataPanel(jsonData);


            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    private static void showDataPanel(Map<String, Object> jsonData) {

        JFrame frame = new JFrame("Dados do Boleto:");
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        panel.add(new JLabel("Aluno: " + jsonData.get("key")));
        panel.add(new JLabel("Registro de Aluno: " + jsonData.get("key")));
        panel.add(new JLabel("Testemunho: " + jsonData.get("key")));


        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);

    }

}
