package com.example.tuan3;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class customAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private List<Contact> objects;
    private LayoutInflater inflater;
    public customAdapter(@NonNull Context context, int resource, @NonNull List<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
        this.resource = resource;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if(convertView==null){
            convertView = inflater.inflate(R.layout.item_listviiew, null);
            holder.tvAvatar = (TextView)convertView.findViewById(R.id.tvAvatar);
            holder.tvPhone = (TextView)convertView.findViewById(R.id.tvPhone);
            holder.tvName = (TextView)convertView.findViewById(R.id.tvName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Contact contact = objects.get(position);
        holder.tvAvatar.setText((String.valueOf(position)));
        holder.tvAvatar.setBackgroundColor(Color.GREEN);
        holder.tvName.setText(contact.getName());
        holder.tvPhone.setText(contact.getPhone());
        return convertView;
    }

    public class ViewHolder{
        TextView tvAvatar, tvName, tvPhone;
    }
}
