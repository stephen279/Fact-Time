package rest.hello.org.dontfeellikeit.ui;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import rest.hello.org.dontfeellikeit.R;

class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, String[] factsArray) {
        super(context, R.layout.list_item,factsArray);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.list_item, parent,false);
        //get references
        String singleFactItem = getItem(position);
        TextView text = (TextView) customView.findViewById(R.id.factEditLabel);
        ImageView image1 = (ImageView) customView.findViewById(R.id.fact1ImageView);
        text.setText(singleFactItem);

        image1.setImageResource(R.mipmap.ic_launcher);
        return customView;
    }
}
