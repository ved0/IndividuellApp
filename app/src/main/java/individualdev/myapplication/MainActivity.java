package individualdev.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Vedad on 2017-04-05.
 */


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button accelerometerButton = (Button) findViewById(R.id.button);

        accelerometerButton.setOnClickListener(
          new Button.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, AccelerometerActivity.class);
                startActivity(intent);
            }
          }
        );

        Button kompassButton = (Button) findViewById(R.id.button2);

        kompassButton.setOnClickListener(
        new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CompassActivity.class);
                startActivity(intent);
            }
        }
        );
    }
}

