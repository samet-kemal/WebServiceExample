package com.samet.webserviceexample.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.samet.webserviceexample.Models.InformationsItem;
import com.samet.webserviceexample.R;

import java.util.List;

public class Adapter extends BaseAdapter {

    public Adapter(List<InformationsItem> list, Context context) {
        this.list = list;
        this.context = context;
    }

    List<InformationsItem> list;
    Context context;
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.layout,viewGroup,false);

        TextView userID = (TextView) view.findViewById(R.id.userIdTextView);
        TextView id = (TextView) view.findViewById(R.id.idTextView);
        TextView title = (TextView) view.findViewById(R.id.userTitleTextView);
        TextView body = (TextView) view.findViewById(R.id.userBodyTextView);

        userID.setText(list.get(i).userIDtoString());
        id.setText(list.get(i).idtoString());
        title.setText(list.get(i).getTitle().toString());
        body.setText(list.get(i).getBody().toString());




        return view;
    }
}
