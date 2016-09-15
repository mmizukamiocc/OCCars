package com.example.mahiro.occars;

/**
 * Created by Mahiro on 2016/09/15.
 */
public class Car {
    private double mDownPayment;
    private int mLoanTerm;
    private double mPrice;
    private double TAX_RATE;

    public Car(){
         mDownPayment = 0.0;
         mLoanTerm = 0;
         mPrice = 0.0;
    }

   public double calculateBorrowedAmount()
   {
    return( mPrice *( 1 + TAX_RATE)) - mDownPayment;
   }

    public double calculateInterstAmount()
    {
        double interest;
        if(mLoanTerm == 3)
        {interest = calculateBorrowedAmount() * 4.62;}
        else if (mLoanTerm == 4)
        {interest = calculateBorrowedAmount() * 4.16;}
        else if (mLoanTerm == 5)
        {interest = calculateBorrowedAmount() * 4.19;}
        else
        {interest = 0.0;}
        return interest;
    }

    public double calculateMonthlyPayment()
    {
        return ((mPrice - mDownPayment) /( mLoanTerm * 12));
    }

    public double calculateTaxAmount()
    {
        return mPrice * TAX_RATE;
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
