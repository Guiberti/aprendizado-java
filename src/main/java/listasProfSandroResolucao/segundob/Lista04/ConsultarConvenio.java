package listasProfSandroResolucao.segundob.Lista04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsultarConvenio {
    public static String getJsonData() {
        try {
            //URL alvo da request
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            //criando conexão HTTP para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //config método da requisição(GET)
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJuR3lOeDVQd3Vpc3RvT2Rzckw1MitWZ0J2bkhpbDFvdTlQMExWQXRXV21BRld2UGJ1cHJCSnlIUDJ5eEJyR3JKTVJicTZQYkYzWHlmWm9BVUhHL1ErRU1TQ3V0NTYrQnZVOGVtL1Q4ZS84QmdVTFBEdHVxY3ZQMHkzQVdHRmE2MVVjY0xyVGs4NzNiWmJBUVRFRGFaT0svaUF6SkFxWDYwTU5sYWpkQUIzS2VGV0ZpZnJJeFloYW5vQ1lGQ015cytZU0tkRkNTV1dqOEQ2RXpCVUNrMFpmdUE3VG4wRTR0NWgzbmtlOFg3ait4MWxhTjJ2UDU0dmlVaUxYUzB1a1VTcG1LaTQ4N1lFZW5CcmVsc0JnNmoyY0dSa0JZU1B5amZuQnFmUms5cEoySWFTcUZXRHBBcVpQaEhENFVpNVcvdzJEdURZVVcxYTZRbXZFeXRpbVJCUU16ajBPYVpUM3FMSXZJUDhvby9zOUdDdGVHdTFpemVHUm8rRUR3Q2JvRWszbW9jSTh1YUFWRlhFWTBQQmxrSklSSzBYQ2FMN3dxQ0h4QTFsRENheWQ2L1BxbkNTVkNHMkZOc2thcjh4eUVOWmoydDdDYUw0R3NHM1dtcStmV0RNY2NNUHNLenF1RVRENElpS05kUHRxL2RQZGxlczBZK1M3R3o5cjVsOXhLaXpKZzdyNjdsTzBpaTZJVGpXUlNXM1d0Ylpja3NISitnb01YN3p0L3NIcUo1UmQvcE1oby9xanpIaHY5WXpGc3JRd0xCdGVpVnpQYlU5QWtBcytBQkhBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNjE4ZDNlMzlkZTdiNGNiZTk4Y2UiLCJleHAiOjE3MTkzMzExNTcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.TvImCeePd5VTeGuNVt0WOwZyCTCFY4xAFv9pzqC9y8g");
            connection.setDoOutput(true);

            //lendo response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            //fechando a conexão
            connection.disconnect();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}
