package com.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomUsersAdapter extends ArrayAdapter<User> {
    /*public CustomUsersAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }*/

    private static class ViewHolder{
        TextView name;
        TextView home;
    }

    public CustomUsersAdapter(Context context, ArrayList<User> users)
    {
        super(context,R.layout.item_user,users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        User user = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            //            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
            convertView = inflater.inflate(R.layout.item_user,parent,false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.tvName);
            viewHolder.home = (TextView) convertView.findViewById(R.id.tvHometown);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.name.setText(user.getName());
        viewHolder.home.setText(user.getHometown());



        Button button = convertView.findViewById(R.id.btnButton);
        button.setTag(position);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (Integer) v.getTag();
                User user = getItem(position);
                if (user != null) {
                    Toast.makeText(getContext(), "Username: " + user.getName(), Toast.LENGTH_SHORT).show();
                }
            }
        });


        //User user = getItem(position);

        //TextView tvName = convertView.findViewById(R.id.tvName);
        //TextView tvHome = convertView.findViewById(R.id.tvHometown);

        //if (user != null) {
       //     tvName.setText(user.getName());
        //    tvHome.setText(user.getHometown());
        //}

        return convertView;
    }
}
