package sg.edu.rp.c346.id19047433.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Declare the ImageView object called ivDay2
    ImageView ivDay1;
    ImageView ivDay3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get the ImageView obj and assign to ivDay1
        ivDay1 = (ImageView) findViewById(R.id.imageView1);
        //Set image
        ivDay1.setImageResource(R.drawable.day1);
        //Get the ImageView obj and assign to ivDay2
        ivDay1 = (ImageView) findViewById(R.id.imageView3);
        //Set image
        ivDay1.setImageResource(R.drawable.day3);
    }
}