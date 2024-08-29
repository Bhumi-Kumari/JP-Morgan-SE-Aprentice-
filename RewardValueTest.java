import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests 
{
    @Test
    void create_with_cash_value() 
    {
        double cashValue = 100;
        int rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() 
    {
        int milesValue = 10000;
        int rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() 
    {
        double cash = 97777;
        int miles = (int) (cash / 0.0035);
        int rewardValue = new RewardValue(cash);
        assertEquals(miles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() 
    {
        int miles = 98777;
        double expectedCashValue = miles * 0.0035;
        int rewardValue = new RewardValue(miles);
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
