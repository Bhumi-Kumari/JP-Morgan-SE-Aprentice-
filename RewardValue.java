import java.util.*;

class RewardValue
{
    int cashInt = 0;
    int milesInt = 0;
    double conversionRate = 0.0035;
    double milesConversionTotal = 0;
    double cashConversionTotal = 0;
    
    public static void main (String[]args)
    {
        RewardValue myClass = new RewardValue();
        
        myClass.getCashValue();
        myClass.getMilesValue();
        myClass.convertCashValue();
        myClass.convertMilesValue();        
    }
    
    public void getCashValue()
    {
        System.out.println("Enter cash value: ");
        Scanner cashEntry = new Scanner(System.in);
        String cash = cashEntry.nextLine();
        cashInt = Integer.parseInt(cash);
    }
    
    public void getMilesValue()
    {
        System.out.println("Enter miles value: ");
        Scanner milesEntry = new Scanner(System.in);
        String miles = milesEntry.nextLine();
        milesInt = Integer.parseInt(miles);
    }
    
    public void convertCashValue()
    {
        cashConversionTotal = milesInt * conversionRate;
        System.out.println(milesInt + " miles would get be " + "£" + cashConversionTotal);
    }
    
    public void convertMilesValue()
    {
        milesConversionTotal = cashInt / conversionRate;
        System.out.println("£" + cashInt + " would get you " + milesConversionTotal + " miles");
    }
}
