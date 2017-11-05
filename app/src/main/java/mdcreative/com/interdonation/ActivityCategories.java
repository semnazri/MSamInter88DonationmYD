package mdcreative.com.interdonation;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import mdcreative.com.interdonation.Fragment.Fragment_Categories;

/**
 * Created by Semmy
 * mr.shanky08@gmail.com on 11/6/17.
 *
 * @copyright 2016
 * PT.Bisnis Indonesia Sibertama
 */

public class ActivityCategories extends AppCompatActivity {

    private ImageView img_back, img_magnifier, img_dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_categories);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container_categories, new Fragment_Categories());
        fragmentTransaction.commit();

        img_back = (ImageView) findViewById(R.id.img_back);
        img_magnifier = (ImageView) findViewById(R.id.img_magnifier);
        img_dot = (ImageView) findViewById(R.id.img_dot);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        img_magnifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast();
            }
        });

        img_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast();
            }
        });
    }

    private void toast() {
        Toast.makeText(this, "Tada", Toast.LENGTH_SHORT).show();
    }


}
