package net.prabowoaz.realcv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class organisasi extends AppCompatActivity {

    String[] menuItem = {"Ketua OSIS", "Ketua Tim Marawis"};
    String[] menuDesk = {"SMP Islam Raden Patah 2013-2014", "SMP Islam Raden Patah 2013-2015"};
    Integer[] menuImage = {R.drawable.rapat, R.drawable.marawis};
    ListView list;
    TextView balik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organisasi);

        CustomListAdapterOrg adapter = new CustomListAdapterOrg(this, menuItem, menuDesk, menuImage);
        list = (ListView)findViewById(R.id.list_org);
        list.setAdapter(adapter);

        list.post(new Runnable(){
            public void run() {
                list.setSelection(list.getCount() - 1);
            }});

        balik = (TextView)findViewById(R.id.hadeh);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(organisasi.this, MainActivity.class);
                startActivity(i);
                finish();
                overridePendingTransition(R.anim.anim_left_in, R.anim.anim_left_out);
            }
        });
    }
}
