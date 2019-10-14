package net.prabowoaz.realcv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class pengalaman extends AppCompatActivity {

    String[] menuItem = {"Praktik Kerja Lapangan", "Magang"};
    String[] menuDesk = {"CV. Novatama Infomedia | Programmer Web", "Giant Teknokindo Solusi | Android Programmer"};
    Integer[] menuImage = {R.drawable.noavan, R.drawable.gts};
    ListView list;
    TextView kems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengalaman);

        CustomListAdapterExp adapter = new CustomListAdapterExp(this, menuItem, menuDesk, menuImage);
        list = (ListView)findViewById(R.id.port_exp);
        list.setAdapter(adapter);

        list.post(new Runnable(){
            public void run() {
                list.setSelection(list.getCount() - 1);
            }});

        kems = (TextView)findViewById(R.id.kems);
        kems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pengalaman.this, MainActivity.class);
                startActivity(i);
                finish();
                overridePendingTransition(R.anim.anim_left_in, R.anim.anim_left_out);
            }
        });
    }
}
