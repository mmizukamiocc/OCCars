package com.example.mahiro.occars;

/**
 * Created by Mahiro on 2016/09/15.
 */
public class Car {
    private double mDownPayment;
    private int mLoanTerm;
    private double mPrice;
    private double TAX_RATE = 0.08;


    public Car(){
         mDownPayment = 0.0;
         mLoanTerm = 0;
         mPrice = 0.0;
    }

   public double calculateBorrowedAmount()
   {
    return(calculateTotalCost()  - mDownPayment);
   }

    public double calculateInterestAmount()
    {
        double interest;
        if(mLoanTerm == 3)
        {interest = calculateBorrowedAmount() * 0.0462;}
        else if (mLoanTerm == 4)
        {interest = calculateBorrowedAmount() * 0.0416;}
        else if (mLoanTerm == 5)
        {interest = calculateBorrowedAmount() * 0.0419;}
        else
        {interest = 0.0;}
        return interest;
    }

    public double calculateMonthlyPayment()
    {
        return ((calculateTotalCost() - mDownPayment) /( mLoanTerm * 12));
    }

   public double calculateTaxAmount()
    {
        return mPrice * TAX_RATE;
    }

    public double calculateTotalCost()
    {
        return mPrice + calculateTaxAmount();
    }


    public double getDownPayment() {
        return mDownPayment;
    }

    public void setDownPayment(double mDownPayment) {
        this.mDownPayment = mDownPayment;
    }

    public int getLoanTerm() {
        return mLoanTerm;
    }

    public void setLoanTerm(int mLoanTerm) {
        this.mLoanTerm = mLoanTerm;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double mPrice) {
        this.mPrice = mPrice;
    }
}
