
public class RewardValue {

    double cashValue = 0.0;
    int milesValue = 0;

    RewardValue(double cash){
        this.cashValue = cash;
    };

    RewardValue(int miles){
        this.milesValue = miles;
    }

    double getCashValue(){
        return this.cashValue;
    };

    int getMilesValue(){
        return this.milesValue;
    }

    int cashToMiles(){
        return (int)(cashValue / 0.0035);
    }

    double milesToCash(){
        return (milesValue * 0.0035);      //convert miles to cash at 0.0035
    } 

}
