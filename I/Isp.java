interface UPIPayment{
    public void payMoney();

    public void getScratchCard();

    public void getCashBackAsCredit();
}


class GooglePay implements UPIPayment{

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCredit() {

    }
}
class Paytm implements UPIPayment{

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCredit() {
        //Paytm does not have this feature
    }
}


public class Isp {
    //The principle state that the larger interfaces split into smaller one. Because the implementation class use
    //only the methods that are required. The goal of Interface segregation principle is same as single
    // responsibility
    //principle
    public static void main(String args[]){
        //According to single responsibility every class should perform single functionality
        //Implementation of multiple functionality violate the rule

    }
}