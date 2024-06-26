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
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJnZExmVW4wSFQ0NGQ4cXV0WExVRXZUNnRNZG1FbEc4UDFTR1J3VzhmYnoxQjZjcXFSYldPRk11N3lVakJyTkRkb043WTFuQ0Q0K2hzeC94NkQ1N0J4WktKNG9lTjFhemZWMFZBY0dRbjhhU0xHcWIrWGFMRjQ0OXFWNW4rTEJDdVNLcjFYcTFHNndTS3pMeERPcXc2eGt0M2ZZVGg4dVRtem4zV2JNeHhsYXFYVjFuZTZObm5HN1RDR2xLZ04xTmRha25uSWpQNmx0UXNPNFd3ZmJCWnUzdkVyOE43dDdpdE9seXlYZm9KZ0N5MWZCeUsyelFaOElxVmNxYjNtZ2RHUCtmQys4S0k3WjNteTkwUTVuczMxS0J5WkZpNkdoa1N1SjBlYW9hS0NqbDdOUml4TkE3V0M2NE1WRUxPQUtZYytjU3I4NFZIWTN3NXBzT21CWUVnakhRN3F6Q2d5dDVIMHJnY3NZZCtIeUJ2UFhmSjh0d3g2NDRPUktCM3FYb3hXSmZ0MkFLeWNuOTdQYkRYR3hYVVhVTDlnTDBqT0RlUURubWdianNIOWd2UWZiaE41QW5JVjlJTkJQSjl5QU9pcTN1UjYyRWt3UTlvY2VPYVhMKzJNd1BrMUZsWnBiUFJEd3pPaU9LVVhtTkFqVyszYkRaNEpDOVVpa3Z6YUpva2tLQ25SeUk5VW1lSjE3ZU56REcvaVNyd3NTcFJNSmtDT2ZJTm9vcnlFSUM5LzRUZFcvSkFKakU4eDArK0dwWVFBVGdsSHkrUGpkd0lrTG5oVDArd0t3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiODNlNWM1NjBlOGU4NDcxMWJkOTUiLCJleHAiOjE3MTkzNzI4NTcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.4TJtKLh4HCIUiQnQwmvq5ucdWJDyLP6MsCqISfynbN0");
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
