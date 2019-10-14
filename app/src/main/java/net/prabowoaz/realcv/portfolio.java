package net.prabowoaz.realcv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class portfolio extends AppCompatActivity {

    String[] menuItem = {"Plasapedia", "Dunia Online Shop", "Job Management System", "Aneka Travel"};
    Integer[] menuImage = {R.drawable.plasapedia, R.drawable.onlineshop, R.drawable.projek, R.drawable.aneka};
    ListView list;
    TextView kuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        CustomListAdapterPort adapter = new CustomListAdapterPort(this, menuItem, menuImage);
        list = (ListView)findViewById(R.id.port_list);
        list.setAdapter(adapter);

        kuy = (TextView)findViewById(R.id.balix);
        kuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(portfolio.this, MainActivity.class);
                startActivity(i);
                finish();
                overridePendingTransition(R.anim.anim_left_in, R.anim.anim_left_out);
            }
        });
    }
}
