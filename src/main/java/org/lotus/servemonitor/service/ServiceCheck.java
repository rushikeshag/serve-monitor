package org.lotus.servemonitor.service;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


@Component
public class ServiceCheck {

    /*
        checkIfServiceRunning is checking service and return 0 when service name is INVALID, return 1 when service is RUNNING,
        return -1 when service is STOPPED.
     */
    public int checkIfServiceRunning(String serviceName, String hostName) {
        Process process;
        try {
            process = Runtime.getRuntime().exec("sc \\\\" + hostName + " query " + serviceName);
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line, scOutput = "";
            // Append the buffer lines into one string
            while ((line = br.readLine()) != null) {
                scOutput += line + "\n";
            }
            if (scOutput.contains("STATE")) {
                if (scOutput.contains("RUNNING")) {
                    return 1; // Return 1 when Running
                } else {
                    return -1; // Return -1 When stopped
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0; // Return 0 when invalid service name
    }
}
