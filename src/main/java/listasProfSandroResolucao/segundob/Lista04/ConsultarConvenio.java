package listasProfSandroResolucao.segundob.Lista04;

import javax.swing.*;
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
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJRRDZVYUY0VlFoTmQ0M1hqbi91Wklsa0JSVWFpNjVBZVh5VGFhZXc1c3c2UGZHdUNSbDlBazhlQzlxL2tMUk1UOFl5T0pMbFFJQ3lxTDNsdlhhRUtrS3lvN1NpcXNhaDUzR2dHUS9UMWV1QTgvSklVdEwrdG5vbXJCNnM4aENqcW1EN1ZSMjcvWjJ3Vk5meXdqZlZuYnJWenROWkNwdFJXUEYraGlKSzMvNEo0U0xvd0V2dXY3QlAvWGQvdlJHSUxNZThYc0lIRTgydjJTNFRiT0UzRG96aDBYbXdSVHZYbzErUWRqeVdoOC9yTEJTaERHV1AxL2NlaEFuandhUi9sVXUvbEs2cEZuVkVJTFJTUU5TVXFzcHBGdDdLWWtxeStpM0FWbmhUSmc1eWY4WmpjTG9uemZKQ2Q3SHI4YWlPb1pNaVFtYVVRUm1hSGZLZ1A1OHBxVnEvanNuUzR2NTgzSHZyNExKc0x5c2J1N2MzQmlXZXM2M2licnpaWHRha25kSkVwR1dzWmhMV3VIdnQvZ2k2WVNDTk5Rc3RPMlVhTjE2SHg5ZGJ2SnpFLzJRVlpZSDd3NDFGWC9tY0wzY2s5dkFHSmx5Ty94RjB3ODg3NzJUSmFXVFFkbFFTeWs0bjJtaUNTaTlNdEZWRzBmN3Z0SGJQamRyRnQzZU8vMUs3V01RVmd1bmgremUyL2JCOFM1TktzMW9FUGMyV0xGRkhkSDFMdmVDRE8zQWF5RWZidnJwUStQaHRVcTRyWWc0TWw1bkUxZVBaTDFvaS9pN3dQTGJWZXV3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNTUwMmQwNDJiODJjNGI1MWI2ZGUiLCJleHAiOjE3MTk1MTg0MzIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.cg8ZHGncqpC7Oc7F24DPIzdXl_NLAB3wXnOFjRTkbJs");
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
            JOptionPane.showMessageDialog(null,
                    "Erro ao verificar os convênios.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
