package com.emergency.app;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements list_Fragment.OnListFragmentInteractionListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_Fragment mProjectFragment = new list_Fragment();
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, mProjectFragment).commit();


    }

    @Override
    public void onListFragmentInteraction(CountryDetails item) {
        ShowAlertDialogBox(item);

    }

    private void ShowAlertDialogBox(CountryDetails item) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.alert_dialog, null);
        dialogBuilder.setView(dialogView);
        TextView editText = (TextView) dialogView.findViewById(R.id.ambulance);
        editText.setText(item.getAMbPhoneNumber());
        AlertDialog alertDialog = dialogBuilder.create();
        alertDialog.show();
    }
}
