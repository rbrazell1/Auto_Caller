package com.example.autocaller;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  EditText edittext1;
  Button button1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Getting the edittext and button instance
    edittext1 = (EditText) findViewById(R.id.inputfile);
    button1 = (Button) findViewById(R.id.button1);

    //Performing action on button click
    button1.setOnClickListener(new OnClickListener() {

      @Override
      public void onClick(View arg0) {
        String number = edittext1.getText().toString();
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:" + number));
        startActivity(callIntent);
      }

    });
  }
}