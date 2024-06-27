package listasProfSandroResolucao.segundob.Lista04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsultarConvenio {
    public static String getJsonData() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJTbEJsMXIzdXErTk9RaFNjMlp1SmdVOFJNa1duOHlYUGhveUYwV2hJeW00aUdnOU85UTRMTlpBcXlmWHBmQ1BNR1NKbXJ6QUFPTE91endNeVJRTnYrYi9PaGNoc21uK09ZVnBuYnBrZlBIcmV1dElHbDVRK3VrekE0V0toZFdBdTRPc0tKL3gzZmpWOEdhS04vd0dMemJnbmNhQWxCS0xOT055SFQ4RFlZQTFWNGJER1VqbE42aUJYQ201VHZQcEVDZ2tUUHVUWFF2eDJCU0ZrUHBVSDFMRUI1MmdJQkVxVUhLTUowM1FhaUFIdXFJQmw0REZhS1AzRVhCejcwemI5TTNlR1YraTJjd0RVdGl0aWFhbjJZd3grTmRNNjlvNzlMYlNrWi8zbjlVWDlRbU4xLzdDWU1iWGNmZlFWM2lXakdadmV4K25PTTRodXZ5ejI3UDNCak5xKzJWMVlVMCtuNlhwVlUvK0tTcTJ3VGNKYllWelFrSEhnQ3BEdjFwYzJ4S2RlaVcvT3RTT3Q2a1pEMmRXanFzRnFuL2I5OW5qRTFFUXpFNUZDc1F6MTN2MHY4QVlpK1RhREZrTkU3VWtUZFZVRHVTb1ZTSmZvTHYzNWpjN1p5QUlGWHEzZlpEZDhUdXlUbVphY1J6QnNvU3orRWMyWnlibm0vcDBhSmExQWU3bHhpK1hjTVAzM1RmT3ErKzRBVVFsTElEcnNPNUtlZFVWaHFFZ0pkYjQ2aERqTGd5dGQxVld4U1NrRkF1LzQ5YmNuWmhuNUQ2TDlmZFZJWGUwR3dnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNTAzYzBjODM4Zjc4NDQ4ODkxZTUiLCJleHAiOjE3MTk0NTA3ODQsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.7SVul-VKLCT9WGJf-pKTVg0FvcwgS08U9Sl4PuTT4H0");
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
