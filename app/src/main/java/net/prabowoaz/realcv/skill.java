package net.prabowoaz.realcv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class skill extends AppCompatActivity {

    String[] menuItem = {"Photoshop", "Premiere Pro", "Codeigniter", "Android Native", "PHP", "Word"};
    String[] menuDesk = {"30% -------------", "40% -----------------", "50% ---------------------", "40% -----------------", "50% ---------------------", "70% --------------------------------"};
    Integer[] menuImage = {R.drawable.ps, R.drawable.pr, R.drawable.cei, R.drawable.studio, R.drawable.php, R.drawable.word};
    ListView list;
    TextView tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        CustomListAdapterSk adapter = new CustomListAdapterSk(this, menuItem, menuDesk, menuImage);
        list = (ListView)findViewById(R.id.port_skill);
        list.setAdapter(adapter);

        list.post(new Runnable(){
            public void run() {
                list.setSelection(list.getCount() - 1);
            }});

        tombol = (TextView)findViewById(R.id.tombol);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(skill.this, MainActivity.class);
                startActivity(i);
                finish();
                overridePendingTransition(R.anim.anim_left_in, R.anim.anim_left_out);
            }
        });
    }
}
