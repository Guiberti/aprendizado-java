package listasProfSandroResolucao.segundob.Lista04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsultarConvenio {
    private static final String CONVENIO_URL = "https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions";
    private static final String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJiMk14VjJCMFVqd2hvRDZrSnJ6SXhXNEkzWElDdS9mMmMwd2lJR20wWnlzaC9XMG5MUzhIekpneHFYb0ttb1hZRVdjQW5yUVJNRzNyMUEwSzdQMXJldHUwa29hSFZDKzAwZ2tZVE1ITDc2aFIydVFHUmhNNHFpM1owcXZFZjQ4enNzR0ludldHaHhUQkRLZjdvaDFLNVNFektOZmxtSThlSytCVW1UUnlDVHpZZnBJSzdFN0FhK2RTQzBMK1VDV00xdHNIWEZScEJ0N3BwWVpOUjZ1anJoOVk1UzIwQkc3YjVPMDhoVlRoaTJFdjhaZGIrQkJHODhsS2REQTBYOHUzT2xEZ2F6UHN2LzlWTzI4d3N1L256SHU3SVBDVlhwVUNBcFBzU0dpZVZ0TE1URTdKalE4ZjlsRThBZmgrLzd2R1pnSHlobGZEb0w3WTNTNE84UEFadUp1dGpBc3RGNnQvbEFtNEtIdm5wKzdyYkFsQUF6TEFKTDBQQ1NtUW54bVRPWUZIS3k4cVlWckxXUHMrWlFyRGdoNWZENXFRcFI1RGFTM3FMWmMvWWtqZHh6VFpsMDNUVEhxZUYzQk5td2tQTDF6cTFtTFFrNmhKeUs2K0Q5T0wwdTJ6NGhtOEdWcENMYVlRUUdMNEJNaGxTZlhScFdtNWlRNEN1NmpVWFFGMm1wcDBSWG5sdHl6NGR0d2M3SCt6aVg0S1pZVW5Nemc4Q3JKNVB4KzhnSHZlRm5jVWJSZlZXN3Y0MzhlVGxSSFFGMFVEVG9MUlFmRzVaYVlDTVNEc1FnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMmJiMDNiNmI2NDc1NGU4ZGI4ZjkiLCJleHAiOjE3MTkzNDUzMTAsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.UZAu3l2cvKSbe2Omf89UJWiF-G_2kol2u3Vr_xbR6pQ";

    public static String getJsonData() {
        try {

            URL url = new URL(CONVENIO_URL);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + TOKEN);
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
