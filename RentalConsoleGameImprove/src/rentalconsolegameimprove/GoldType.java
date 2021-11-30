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
public class GoldType extends SilverType {
    
    private int cashback;
    
    public void setCashback (int cb){
        this.cashback = cb;
    }
    
    public int getCashback (){
        return this.cashback ;
    }
    
    GoldType() {
        setRentalCost  (30000);
        setPoint       (5);
        setDiscount    (2);
        setCashback    (5000);
    }
    
    
}
