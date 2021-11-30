/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameimprove;

import java.util.Scanner;

/**
 *
 * @author ryanbrilianfatsena
 */
public class RentalConsoleGameImprove extends Notes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // This is object
        SilverType sm   = new SilverType();
        GoldType gm     = new GoldType();
        PlatinumType pm = new PlatinumType();
        
        
        // To do insert data member
        insertMembership();
        
        
        // This is attribute
        String idMembership;
        int dateRental, monthRental, yearRental, dateReturned, monthReturned, yearReturned;
        Scanner input = new Scanner(System.in);
    
        
        // To do input
        System.out.println("======== Program Pengembalian Rental Console Game ========");
        
        System.out.print("\n| Masukkan ID Member                | : ");
        idMembership = input.nextLine();
        
        System.out.print("| Masukkan Tanggal Pinjam  (1 - 31) | : ");
        dateRental = input.nextInt();
        
        System.out.print("| Masukkan Bulan Pinjam    (1 - 12) | : ");
        monthRental = input.nextInt();
        
        System.out.print("| Masukkan Tahun Pinjam     (xxxx)  | : ");
        yearRental = input.nextInt();
        
        System.out.print("| Masukkan Tanggal Kembali (1 - 31) | : ");
        dateReturned = input.nextInt();
        
        System.out.print("| Masukkan Bulan Kembali   (1 - 12) | : ");
        monthReturned = input.nextInt();
        
        System.out.print("| Masukkan Tahun Kembali    (xxxx)  | : ");
        yearReturned = input.nextInt();
        
        
        // To do search data member
        System.out.println("\n----------------------------------------------------------");
        searchMembership(idMembership);
        
        
        // To show rent date and return date
        System.out.println("\n----------------------------------------------------------");
        System.out.println("\n| Tanggal Pinjam                    | : " + dateRental + " - " + monthRental + " - " + yearRental);
        System.out.println("| Tanggal Kembali                   | : " + dateReturned + " - " + monthReturned + " - " + yearReturned);
        
        
        // To show rent duration
        int rentalForDuration = rentDuration(dateRental, monthRental, yearRental, dateReturned, monthReturned, yearReturned);
        System.out.println("| Lama Sewa                         | : " + rentalForDuration + " hari");
        
        
        // To show rent cost
        System.out.println("\n----------------------------------------------------------");
        
        String memberType = getMemberType(idMembership);
        if(memberType == "Silver") {
            System.out.println("\n| Total Sewa                        | : Rp. " + sm.costAmount(rentalForDuration));
            System.out.println("| Jumlah Poin                       | : " + sm.toGetPoint(rentalForDuration));
        
        } else if(memberType == "Gold") {
            System.out.println("\n| Total Sewa                        | : Rp. " + gm.costAmount(rentalForDuration));
            System.out.println("| Jumlah Poin                       | : " + gm.toGetPoint(rentalForDuration));
            System.out.println("| Jumlah Cashback                   | : " + gm.getCashback());
            
        } else {
            System.out.println("\n| Total Sewa                        | : Rp. " + pm.costAmount(rentalForDuration));
            System.out.println("| Jumlah Poin                       | : " + pm.toGetPoint(rentalForDuration));
            System.out.println("| Jumlah Cashback                   | : " + pm.getCashback());
            System.out.println("| Bonus Pulsa                       | : " + pm.toGetBenefit(rentalForDuration));
        }
    }
    
}
