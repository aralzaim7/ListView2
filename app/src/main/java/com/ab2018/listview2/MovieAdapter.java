package com.ab2018.listview2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by metuncc on 1/28/18.
 */
// object
public class MovieAdapter extends ArrayAdapter<Movie> {


    public MovieAdapter(@NonNull Context context, int resource, @NonNull List<Movie> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Movie movie = getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.movie_item, parent, false);
        }

        TextView name = convertView.findViewById(R.id.movieName);
        ImageView imageMovie = convertView.findViewById(R.id.movieImage);

        name.setText(movie.name);

        imageMovie.setImageResource(movie.getImageCode());

        return convertView;

    }

}
