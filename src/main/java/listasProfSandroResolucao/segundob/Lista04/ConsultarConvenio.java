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
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiI2bWlqUkpvU2dRRDduYmdCeVRtb2JpU2JKVlhqNFZQVFZpZW1ReG1vdVFwU3JuMjgrOTlkYWhLT3kxVU5QWDh3WnJ0UHF3Qm8yclF2K0h6NmViaGNmWkRBS2ZoL0VtYW1kZk0wNXVEUFFCU2phMHFTNXo5TVhtYnlHNVY0eGpJOUxpckRZQ1ZFS2lsaTZjekxqWFlqVVpvZUpEeTBXdWxWRG5laFFjUVN2dXo5cWhHb2RyVm5FU3FRYitDTW9kQXBzQmJmNE4zVTJVR1E1MnFVZm82eDJkRVp6YUl0U1BHU09tUE5lTHpMM1hGcFJWajV4cmNoWXVzRFJmUmNNcER1RmI2eTIwZnJDZGx3STFNNW9QQ3VZbkdlMVFwVFFhcmROOHliMkV4WCtwaEx5dTR3NUtiOHVOSWlhQmxoZ1BwbFF2Rk5PWWpJRlJHa0NzbnVNZ3BNTW1EeExFUXJCUXhMUllqOFU0NjBoZmxxQkphRlQ3TWtDR1hucXFlTzNDQXp3VUNqejMzN1Q5eE9LNFJMOUZURUhOWjFCcTRDTVR6Z3Z2ZDVXT09XcmpBTi9PazNWVlJUWGp2a29qNEFHSUQzUmErZEhEYVNvOWxIMmFreWtLV0lJdWpERkNodmFvWDF0ZWxDVkZJY1NBc0FVNytMMVBwL3A1YUNuUTN3RGFRL0pJckJYL29VTU5aR3E2Z05kejZvZGFvM2dSaVJ6SUxPSmk2Wmd0dllhR1YyWlVpUTlic1dWMG93aEIrTjI1TlRXS0FuaHhmbVl3bDNlR25Md2ZwMzNBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYmMwZjQyZjU1NmU2NDMxYjhlZjgiLCJleHAiOjE3MTk0ODU1ODMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.MbcPQMLenF2xolXLAjNS4tb5CarrNmTK82zBsQfe0u4");
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
