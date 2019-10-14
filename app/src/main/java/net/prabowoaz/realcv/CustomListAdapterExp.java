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

public class CustomListAdapterExp extends ArrayAdapter<String> {

    Activity context;
    String[] menuItem;
    String[] menuDesk;
    Integer[] menuImage;


    public CustomListAdapterExp(Activity context, String[] menuItem, String[] menuDesk, Integer[] menuImage) {
        super(context, R.layout.activity_list_extra, menuItem);
        this.context = context;
        this.menuItem = menuItem;
        this.menuDesk = menuDesk;
        this.menuImage = menuImage;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_list, null, true);

        TextView textdesk = (TextView)rowView.findViewById(R.id.menudesk);
        TextView textmenu = (TextView)rowView.findViewById(R.id.menuItem);
        ImageView imgMenu = (ImageView)rowView.findViewById(R.id.imageView);

        textdesk.setText(menuDesk[position]);
        textmenu.setText(menuItem[position]);
        imgMenu.setImageResource(menuImage[position]);

        return rowView;
    }

}
