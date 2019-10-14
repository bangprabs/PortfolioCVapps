package net.prabowoaz.realcv;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Prabowo on 8/31/2017.
 */

public class CustomListAdapterPort extends ArrayAdapter<String> {

    Activity context;
    String[] menuItem;
    Integer[] menuImage;


    public CustomListAdapterPort(Activity context, String[] menuItem, Integer[] menuImage) {
        super(context, R.layout.activity_list, menuItem);
        this.context = context;
        this.menuItem = menuItem;
        this.menuImage = menuImage;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_list_port, null, true);

        TextView textmenu = (TextView)rowView.findViewById(R.id.titlePort);
        ImageView imgMenu = (ImageView)rowView.findViewById(R.id.imageView);

        textmenu.setText(menuItem[position]);
        imgMenu.setImageResource(menuImage[position]);

        return rowView;
    }

}
