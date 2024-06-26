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
                .header("authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJnZExmVW4wSFQ0NGQ4cXV0WExVRXZUNnRNZG1FbEc4UDFTR1J3VzhmYnoxQjZjcXFSYldPRk11N3lVakJyTkRkb043WTFuQ0Q0K2hzeC94NkQ1N0J4WktKNG9lTjFhemZWMFZBY0dRbjhhU0xHcWIrWGFMRjQ0OXFWNW4rTEJDdVNLcjFYcTFHNndTS3pMeERPcXc2eGt0M2ZZVGg4dVRtem4zV2JNeHhsYXFYVjFuZTZObm5HN1RDR2xLZ04xTmRha25uSWpQNmx0UXNPNFd3ZmJCWnUzdkVyOE43dDdpdE9seXlYZm9KZ0N5MWZCeUsyelFaOElxVmNxYjNtZ2RHUCtmQys4S0k3WjNteTkwUTVuczMxS0J5WkZpNkdoa1N1SjBlYW9hS0NqbDdOUml4TkE3V0M2NE1WRUxPQUtZYytjU3I4NFZIWTN3NXBzT21CWUVnakhRN3F6Q2d5dDVIMHJnY3NZZCtIeUJ2UFhmSjh0d3g2NDRPUktCM3FYb3hXSmZ0MkFLeWNuOTdQYkRYR3hYVVhVTDlnTDBqT0RlUURubWdianNIOWd2UWZiaE41QW5JVjlJTkJQSjl5QU9pcTN1UjYyRWt3UTlvY2VPYVhMKzJNd1BrMUZsWnBiUFJEd3pPaU9LVVhtTkFqVyszYkRaNEpDOVVpa3Z6YUpva2tLQ25SeUk5VW1lSjE3ZU56REcvaVNyd3NTcFJNSmtDT2ZJTm9vcnlFSUM5LzRUZFcvSkFKakU4eDArK0dwWVFBVGdsSHkrUGpkd0lrTG5oVDArd0t3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiODNlNWM1NjBlOGU4NDcxMWJkOTUiLCJleHAiOjE3MTkzNzI4NTcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.4TJtKLh4HCIUiQnQwmvq5ucdWJDyLP6MsCqISfynbN0")
                .method("POST", HttpRequest.BodyPublishers.ofString("{\"barCode\":{\"type\":0,\"digitable\":\"" + "36490000190001508760400000706457500000000009990" + "\"}}"))
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

