package com.jonmid.quizdos.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.jonmid.quizdos.Models.CommentModelRosalesLuis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis Eduardo on 10/10/2017.
 */

public class CommentAdapterRosalesLuis extends RecyclerView.Adapter<CommentAdapterRosalesLuis.ViewHolder> {

    List<CommentModelRosalesLuis> commenList=new ArrayList<>();

    public CommentAdapterRosalesLuis (List<CommentModelRosalesLuis> commenList, Context context){
        this.commenList=commenList;
        this.context=context;

    }

    @Override
    public CommentAdapterRosalesLuis.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CommentAdapterRosalesLuis.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder {
    }
}
