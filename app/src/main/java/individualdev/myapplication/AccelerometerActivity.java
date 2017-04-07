package individualdev.myapplication;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Vedad on 2017-04-06.
 */

public class AccelerometerActivity extends AppCompatActivity implements SensorEventListener {
    private TextView xCoord, yCoord, zCoord;
    private Sensor mySensor;
    private SensorManager SM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accelerometer_activity);
        SM = (SensorManager)getSystemService(SENSOR_SERVICE);
        mySensor = SM.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        SM.registerListener((SensorEventListener) this,mySensor,SensorManager.SENSOR_DELAY_FASTEST);
        xCoord = (TextView)findViewById(R.id.xCoord);
        yCoord = (TextView)findViewById(R.id.yCoord);
        zCoord = (TextView)findViewById(R.id.zCoord);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        DecimalFormat df2 = new DecimalFormat(".##");
        xCoord.setText(" " + df2.format(event.values[0]));
        yCoord.setText(" " + df2.format(event.values[1]));
        zCoord.setText(" " + df2.format(event.values[2]));
    }

}
