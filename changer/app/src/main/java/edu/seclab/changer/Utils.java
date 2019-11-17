package edu.seclab.changer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
    private static String packageFile = "/sdcard/changer/packagename.txt";
    private static String phoneNumFile = "/sdcard/changer/phonenumber.txt";
    private static String simSerialNumFile = "/sdcard/changer/simserialnum.txt";
    private static String subscriberIDFile = "/sdcard/changer/subscriberid.txt";
    private static String deviceIDFile = "/sdcard/changer/deviceid.txt";
    private static String MACAddrFile = "/sdcard/changer/macaddr.txt";
    private static String emailFile = "/sdcard/changer/email.txt";
    private static String genderFile = "/sdcard/changer/gender.txt";


    public static String readLineFromFile(String fname){
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(fname));
            String line = br.readLine();
            br.close();

            if (line != null)
                return line;
            else
                return null;
        } catch (IOException e) {
            return null;
        }
    }

    public static String getAPKPackage(){
        String result = readLineFromFile(packageFile);
        if (result != null) {
            return result;
        }
        else {
            return "thisisnotarealpackage";
        }
    }

    public static String getPhoneNumber(){
        String result = readLineFromFile(phoneNumFile);
        if (result != null) {
            return result;
        }
        else {
            return "1234567";
        }
    }

    public static String getSimSerialNum(){
        // ICCID
        String result = readLineFromFile(simSerialNumFile);
        if (result != null) {
            return result;
        }
        else {
            return "1234567";
        }
    }

    public static String getSubscriberID(){
        // IMSI
        String result = readLineFromFile(subscriberIDFile);
        if (result != null) {
            return result;
        }
        else {
            return "1234567";
        }
    }

    public static String getDeviceID(){
        // IMEI
        String result = readLineFromFile(deviceIDFile);
        if (result != null) {
            return result;
        }
        else {
            return "1234567";
        }
    }

    public static String getMACAddr(){
        String result = readLineFromFile(MACAddrFile);
        if (result != null) {
            return result;
        }
        else {
            return "00:11:22:33:44:55";
        }
    }

    public static String getEMail(){
        String result = readLineFromFile(emailFile);
        if (result != null) {
            return result;
        }
        else {
            return "mail@gmail.com";
        }
    }

}
