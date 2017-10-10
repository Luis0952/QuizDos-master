package com.jonmid.quizdos.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jonmid.quizdos.Models.CommentModelRosalesLuis;
import com.jonmid.quizdos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis Eduardo on 10/10/2017.
 */

public class CommentAdapterRosalesLuis extends RecyclerView.Adapter<CommentAdapterRosalesLuis.ViewHolder> {

    List<CommentModelRosalesLuis> commenList=new ArrayList<>();
    Context context;

    public CommentAdapterRosalesLuis (List<CommentModelRosalesLuis> commenList, Context context){
        this.commenList=commenList;
        this.context=context;
    }

    @Override
    public CommentAdapterRosalesLuis.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View item= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment_cardview, parent, false);
        ViewHolder viewHolder=new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CommentAdapterRosalesLuis.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    }
}
