package com.a03gmail.karumanchi.riya.mapsapp20.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.a03gmail.karumanchi.riya.mapsapp20.DirectionItem;
import com.a03gmail.karumanchi.riya.mapsapp20.R;

import java.util.List;

/**
 * Created by Mike on 30-Apr-17.
 */

public class DestinationAdapter extends BaseAdapter {
        Context context;
        List<DirectionItem> directions;
        LayoutInflater inflater;

        public DestinationAdapter(Context context, List<DirectionItem> directions) {
            this.context = context;
            inflater = LayoutInflater.from(context);
            this.directions = directions;
        }

        @Override
        public int getCount() {
            return directions.size();
        }

        @Override
        public Object getItem(int position) {
            return directions.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewGroup vg;

            if (convertView != null) {
                vg = (ViewGroup) convertView;
            } else {
                vg = (ViewGroup) inflater.inflate(R.layout.destination_element, null);
            }

            DirectionItem direction = directions.get(position);
            final TextView header = ((TextView) vg.findViewById(R.id.destination_title));
            final TextView subtitle = (TextView) vg.findViewById(R.id.destination_subtitle);

            header.setText(direction.header);
            subtitle.setText(direction.subtitle);
            return vg;
        }
    }

