package com.app.javaprog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomeAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ProgramsActivity.ListItem> listItemArrayList;
    private Integer[] imgid;

    public CustomeAdapter(Context context,ArrayList<ProgramsActivity.ListItem> listItemArrayList,Integer[] imgid) {

        this.context = context;
        this.listItemArrayList = listItemArrayList;
        this.imgid=imgid;
    }

    @Override
    public int getViewTypeCount() {
        return getCount();
    }
    @Override
    public int getItemViewType(int position) {

        return position;
    }

    @Override
    public int getCount() {
        return listItemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return listItemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            if(listItemArrayList.get(position).isHeader()){
                convertView = inflater.inflate(R.layout.lv_header, null, true);
                holder.tvLabel = (TextView) convertView.findViewById(R.id.tvVehicle);
                holder.tvLabel.setText(listItemArrayList.get(position).getName());
            }
            else
            if(listItemArrayList.get(position).isChild()){
                convertView = inflater.inflate(R.layout.lv_child, null, true);
                holder.tvLabel = (TextView) convertView.findViewById(R.id.tvChild);
                holder.tvLabel.setText(listItemArrayList.get(position).getName());
                holder.tvImage = (ImageView) convertView.findViewById(R.id.icon);
                holder.tvImage.setImageResource(imgid[position]);
            }


            convertView.setTag(holder);

        }else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = (ViewHolder)convertView.getTag();
        }


        return convertView;
        }

    private class ViewHolder {

        protected TextView tvLabel;
        protected  ImageView tvImage;
    }

}