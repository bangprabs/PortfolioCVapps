package net.prabowoaz.realcv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    TextView balik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        balik = (TextView)findViewById(R.id.back);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(profile.this, MainActivity.class);
                startActivity(i);
                finish();
                overridePendingTransition(R.anim.anim_left_in, R.anim.anim_left_out);
            }
        });
    }
}
