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
