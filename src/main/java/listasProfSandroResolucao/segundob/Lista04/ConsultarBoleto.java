package listasProfSandroResolucao.segundob.Lista04;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsultarBoleto {
    public static String getJsonData(String linhaDigitavel) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\n" +
                    "  \"barCode\": {\n" +
                    "    \"type\": 0,\n" +
                    "    \"digitable\": \"" + linhaDigitavel + "\"\n" +
                    "  }\n" +
                    "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("accept", "application/json");
            connection.setRequestProperty("content-type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJRRDZVYUY0VlFoTmQ0M1hqbi91Wklsa0JSVWFpNjVBZVh5VGFhZXc1c3c2UGZHdUNSbDlBazhlQzlxL2tMUk1UOFl5T0pMbFFJQ3lxTDNsdlhhRUtrS3lvN1NpcXNhaDUzR2dHUS9UMWV1QTgvSklVdEwrdG5vbXJCNnM4aENqcW1EN1ZSMjcvWjJ3Vk5meXdqZlZuYnJWenROWkNwdFJXUEYraGlKSzMvNEo0U0xvd0V2dXY3QlAvWGQvdlJHSUxNZThYc0lIRTgydjJTNFRiT0UzRG96aDBYbXdSVHZYbzErUWRqeVdoOC9yTEJTaERHV1AxL2NlaEFuandhUi9sVXUvbEs2cEZuVkVJTFJTUU5TVXFzcHBGdDdLWWtxeStpM0FWbmhUSmc1eWY4WmpjTG9uemZKQ2Q3SHI4YWlPb1pNaVFtYVVRUm1hSGZLZ1A1OHBxVnEvanNuUzR2NTgzSHZyNExKc0x5c2J1N2MzQmlXZXM2M2licnpaWHRha25kSkVwR1dzWmhMV3VIdnQvZ2k2WVNDTk5Rc3RPMlVhTjE2SHg5ZGJ2SnpFLzJRVlpZSDd3NDFGWC9tY0wzY2s5dkFHSmx5Ty94RjB3ODg3NzJUSmFXVFFkbFFTeWs0bjJtaUNTaTlNdEZWRzBmN3Z0SGJQamRyRnQzZU8vMUs3V01RVmd1bmgremUyL2JCOFM1TktzMW9FUGMyV0xGRkhkSDFMdmVDRE8zQWF5RWZidnJwUStQaHRVcTRyWWc0TWw1bkUxZVBaTDFvaS9pN3dQTGJWZXV3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNTUwMmQwNDJiODJjNGI1MWI2ZGUiLCJleHAiOjE3MTk1MTg0MzIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.cg8ZHGncqpC7Oc7F24DPIzdXl_NLAB3wXnOFjRTkbJs");
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

            showDataPanel(jsonData);

            return response.toString();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao consultar o boleto, verifique a linha digitavel", "ERRO",
                    JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    private static void showDataPanel(Map<String, Object> jsonData) {

        JFrame frame = new JFrame("Dados do Boleto:");
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        panel.add(new JLabel("Banco: " + jsonData.get("assignor")));
        panel.add(new JLabel("Data de Pagamento: " + jsonData.get("payDueDate")));
        panel.add(new JLabel("Data de Vencimento: " + jsonData.get("dueDate")));
        panel.add(new JLabel("Data de Liquidação: " + jsonData.get("settleDate")));
        panel.add(new JLabel("Pagador: " + jsonData.get("payer")));
        panel.add(new JLabel("Destinatário do documento: " + jsonData.get("documentRecipient")));
        panel.add(new JLabel("Hora Final: " + jsonData.get("endHour")));
        panel.add(new JLabel("Recebedor: " + jsonData.get("recipient")));
        panel.add(new JLabel("Registro de Data de Vencimento: " + jsonData.get("dueDateRegister")));
        panel.add(new JLabel("Recebedor: " + jsonData.get("recipient")));
        panel.add(new JLabel("Hora Inicial: " + jsonData.get("initeHour")));
        panel.add(new JLabel("Documento Pagador: " + jsonData.get("documentPayer")));

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }
}

