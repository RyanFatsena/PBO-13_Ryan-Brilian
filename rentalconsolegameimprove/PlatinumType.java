/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameimprove;

/**
 *
 * @author ryanbrilianfatsena
 */
public class PlatinumType extends GoldType{
    
    private int benefit;
    
    PlatinumType() {
        setRentalCost  (30000);
        setPoint       (5);
        setDiscount    (2);
        setCashback    (5000);
    }
    
    protected int toGetBenefit(int rentalForDuration) {
        
        benefit     = rentalForDuration * 5000;
        return benefit;
    }
}
