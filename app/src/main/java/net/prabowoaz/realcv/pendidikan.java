package net.prabowoaz.realcv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class pendidikan extends AppCompatActivity {

    String[] menuItem = {"TK Salman Al Farisi", "SD Negri Kalibaru 3", "SMP Islam Raden Patah", "SMK Taruna Bhakti"};
    String[] menuDesk = {"2006 - 2005 \nDisana saya dapat belajar mengenai budaya, bahasa, agama, sosial dan emosional dan tujuan nya untuk mengembangkan daya pikir",
                         "2007 - 2012 \nDisana saya banyak belajar banyak hal selama 6 tahun mulai dari belajar tata krama dan sopan santun dan mempelajari tentang budaya sosial dan matematika",
                         "2012 - 2015 \nDisana saya mulai dalam era dimana pembelajaran mengenai islam sangat kuat disana, dimana kita mau melakukan aktivitas dari yang kecil hingga besar diiringi dengan Do'a",
                         "2015 - Sekarang \nSekolah IT, Wow Disini saya belajar banyak tentang dunia IT, Dimulai dari yang tidak tahu dunia IT seperti apa Taruna Bhakti mengejarkan banyak hal :)"};
    Integer[] menuImage = {R.drawable.salman, R.drawable.kaltri, R.drawable.rapat, R.drawable.jae};
    ListView list;
    TextView balik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendidikan);

        CustomListAdapter adapter = new CustomListAdapter(this, menuItem, menuDesk, menuImage);
        list = (ListView)findViewById(R.id.mobile_list);
        list.setAdapter(adapter);


        balik = (TextView)findViewById(R.id.kembali);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pendidikan.this, MainActivity.class);
                startActivity(i);
                finish();
                overridePendingTransition(R.anim.anim_left_in, R.anim.anim_left_out);
            }
        });
    }
}
