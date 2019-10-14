package net.prabowoaz.realcv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class extrakulikuler extends AppCompatActivity {

    String[] menuItem = {"Silat Merpati putih", "PSHT Terate", "Kursus Bahasa Inggris", "Marawis"};
    String[] menuDesk = {"2007 - 2012 \nDimulai kecintaan melihat di tv Pencak silat sangat lah menarik bagi saya dalam pencak silat yang saya ikuti saya lebih bisa mengontrol emosi dan mengehela nafas lega dengan keadaan di luar sana karna dibekali ilmu bela diri",
            "2016 - 2017 \nSilat yang saya ikuti ini muncul karna rasa penasaran saya dengan Silat yang satu ini, dan juga sekolah mengharuskan mengikuti eskul maka eskul ini yang saya pilih",
            "2008 - 2012 \nSaya ikuti karna semakin tumbuhnya perkembangan dunia yang pesat dimana saya harus membekali diri saya dengan mahir berbahasa inggris",
            "2012 - 2015 \nMarawis menurut saya irama nya sangat menarik sehingga saya tertarik mengikuti kegiatan marawis ini kegiatan tersebut adalah merupakan eskul dari SMP dan menarik unutk di coba"};
    Integer[] menuImage = {R.drawable.mp, R.drawable.sht, R.drawable.lia, R.drawable.marawis};
    ListView list;
    TextView mundur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extrakulikuler);

        CustomListAdapterEx adapter = new CustomListAdapterEx(this, menuItem, menuDesk, menuImage);
        list = (ListView)findViewById(R.id.port_extra);
        list.setAdapter(adapter);

//        list.post(new Runnable(){
//            public void run() {
//                list.setSelection(list.getCount() - 0);
//            }});

        mundur = (TextView)findViewById(R.id.mundur);
        mundur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(extrakulikuler.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.anim_left_in, R.anim.anim_left_out);
            }
        });
    }
}
