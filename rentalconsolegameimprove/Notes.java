/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameimprove;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author ryanbrilianfatsena
 */
public class Notes {
    static Map<String, List<String>> dataMembership = new HashMap<String, List<String>>();
    static int rentalTime;
    
    // To insert data member values paired with id member key hashmap
    static void insertMembership() {
        
        // To insert membership M001 to value list
        List<String> valueFirst = new ArrayList<String>();
        valueFirst.add("Mr. X");
        valueFirst.add("Silver");
        
        // To insert membership M002 to value list
        List<String> valueSecond = new ArrayList<String>();
        valueSecond.add("Mr. Y");
        valueSecond.add("Gold");
        
        // To insert membership M003 to value list
        List<String> valueThird = new ArrayList<String>();
        valueThird.add("Mr. Z");
        valueThird.add("Platinum");
        
        // To insert all values paired to key
        dataMembership.put("M001", valueFirst);
        dataMembership.put("M002", valueSecond);
        dataMembership.put("M003", valueThird);
    }
    
    
    // To search data on arrayList
    static void searchMembership(String idMembership) {       
         
        if(dataMembership.containsKey(idMembership)) {
            
            for(Map.Entry<String, List<String>> entry : dataMembership.entrySet()) {
                if(entry.getKey().equals(idMembership)) {
                    
                String key = entry.getKey();
                List<String> values = entry.getValue();
                
                System.out.println("\n| ID Member                         | : " + key);
                System.out.println("| Nama Member                       | : " + values.get(0));
                System.out.println("| Jenis Member                      | : " + values.get(1));
                
                }
            }
        } else {
                System.out.println("\n  Member Belum Terdaftar");
        }
    }
    
    static String getMemberType(String idMembership) {
        
        String memberType = null;
        if(dataMembership.containsKey(idMembership)) {
            for(Map.Entry<String, List<String>> entry : dataMembership.entrySet()) {
                if(entry.getKey().equals(idMembership)) {
                    
                List<String> values = entry.getValue();               
                memberType = values.get(1);
                }
            }
        }
        return memberType;
    }
    
    static int rentDuration(int dateRental, int monthRental, int yearRental, int dateReturned, int monthReturned, int yearReturned) {
        
        if(yearReturned >= yearRental) {
            if(monthReturned >= monthRental) {
                
                    LocalDateTime rental = LocalDateTime.of(yearRental, monthRental, dateRental, 23, 59, 59);
                    LocalDateTime returned = LocalDateTime.of(yearReturned, monthReturned, dateReturned, 23, 59, 59);

                    Duration duration = Duration.between(rental, returned);
        
                    rentalTime = (int) duration.toDays();
                 
            } else {
                System.out.println("Tanggal Kembali Invalid, Silakan Ulangi Pengisian Program");
            }
        } else {
            System.out.println("Tanggal Kembali Invalid, Silakan Ulangi Pengisian Program");
        }
        
        return rentalTime;
    }
}