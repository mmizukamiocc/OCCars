package com.example.mahiro.occars;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoanSummaryActivity extends Activity {

    private TextView monthlyPaymentTextView;
    private TextView loanReportTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_summary2);

        monthlyPaymentTextView = (TextView) findViewById(R.id.monthlyPaymentTextView);
        loanReportTextView = (TextView) findViewById(R.id.loanReportTextView);


        Intent intentFromPurchaseActivity = getIntent();
        String monthlyPaymentText = intentFromPurchaseActivity.getStringExtra("MonthlyPayment");
        String loanReport = intentFromPurchaseActivity.getStringExtra("LoanSummaryText");

        monthlyPaymentTextView.setText(monthlyPaymentText);
        loanReportTextView.setText(loanReport);

    }

    public void returnToDataEntry(View view)
    {
        this.finish();
    }
}
