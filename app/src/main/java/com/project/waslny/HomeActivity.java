package com.project.waslny;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.waslny.customer.auth.CustomerSignInActivity;
import com.project.waslny.driver.auth.DriverSignInActivity;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";
    private Context mContext = HomeActivity.this;

    private Button mDriver, mCustomer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mDriver = (Button) findViewById(R.id.driver);
        mCustomer = (Button) findViewById(R.id.customer);

        startService(new Intent(HomeActivity.this, onAppKilled.class));
        mDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DriverSignInActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, CustomerSignInActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
