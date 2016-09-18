package com.example.ghostofcyb3r.zerocoder;

/**
 * Created by GhostOfCyb3r on 9/17/2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MoviesAdapterToXml extends RecyclerView.Adapter<MoviesAdapterToXml.MyViewHolder> {
private List<Movie> movieList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title,year,genre;
        public MyViewHolder(View view){
            super(view);
            title = (TextView)view.findViewById(R.id.title);
            genre = (TextView)view.findViewById(R.id.genre);
            year = (TextView)view.findViewById(R.id.year);
        }
    }
    public MoviesAdapterToXml(List<Movie> moviesList){
        this.movieList = moviesList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row,parent,false);
        return new MyViewHolder(itemView);

    }
    @Override
    public void onBindViewHolder(MyViewHolder holder,int position){
        Movie movie = movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }
    @Override
    public int getItemCount(){
        return movieList.size();
    }
}
