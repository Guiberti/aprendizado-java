package listasProfSandroResolucao.segundob.Lista04;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsultarBoleto {
    public static String getJsonData(String linhaDigitavel) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize"))
                .header("accept", "application/json")
                .header("content-type", "application/json")
                .header("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJTbEJsMXIzdXErTk9RaFNjMlp1SmdVOFJNa1duOHlYUGhveUYwV2hJeW00aUdnOU85UTRMTlpBcXlmWHBmQ1BNR1NKbXJ6QUFPTE91endNeVJRTnYrYi9PaGNoc21uK09ZVnBuYnBrZlBIcmV1dElHbDVRK3VrekE0V0toZFdBdTRPc0tKL3gzZmpWOEdhS04vd0dMemJnbmNhQWxCS0xOT055SFQ4RFlZQTFWNGJER1VqbE42aUJYQ201VHZQcEVDZ2tUUHVUWFF2eDJCU0ZrUHBVSDFMRUI1MmdJQkVxVUhLTUowM1FhaUFIdXFJQmw0REZhS1AzRVhCejcwemI5TTNlR1YraTJjd0RVdGl0aWFhbjJZd3grTmRNNjlvNzlMYlNrWi8zbjlVWDlRbU4xLzdDWU1iWGNmZlFWM2lXakdadmV4K25PTTRodXZ5ejI3UDNCak5xKzJWMVlVMCtuNlhwVlUvK0tTcTJ3VGNKYllWelFrSEhnQ3BEdjFwYzJ4S2RlaVcvT3RTT3Q2a1pEMmRXanFzRnFuL2I5OW5qRTFFUXpFNUZDc1F6MTN2MHY4QVlpK1RhREZrTkU3VWtUZFZVRHVTb1ZTSmZvTHYzNWpjN1p5QUlGWHEzZlpEZDhUdXlUbVphY1J6QnNvU3orRWMyWnlibm0vcDBhSmExQWU3bHhpK1hjTVAzM1RmT3ErKzRBVVFsTElEcnNPNUtlZFVWaHFFZ0pkYjQ2aERqTGd5dGQxVld4U1NrRkF1LzQ5YmNuWmhuNUQ2TDlmZFZJWGUwR3dnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNTAzYzBjODM4Zjc4NDQ4ODkxZTUiLCJleHAiOjE3MTk0NTA3ODQsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.7SVul-VKLCT9WGJf-pKTVg0FvcwgS08U9Sl4PuTT4H0")
                .method("POST", HttpRequest.BodyPublishers.ofString("{\"barCode\":{\"type\":0,\"digitable\":\"" + linhaDigitavel + "\"}}"))
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        Pattern pattern = Pattern.compile("\"(\\w+)\":\"([^\"]+)\"");
        Matcher matcher = pattern.matcher(response.body());

        Map<String, Object> jsonData = new HashMap<>();

        while (matcher.find()) {
            String key = matcher.group(1);
            String value = matcher.group(2);

            jsonData.put(key, value);
        }
        System.out.println(jsonData);

        showDataPanel(jsonData);

        return response.body();
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

