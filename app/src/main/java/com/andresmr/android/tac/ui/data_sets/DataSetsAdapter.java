package com.andresmr.android.tac.ui.data_sets;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;

import com.andresmr.android.tac.R;
import com.andresmr.android.tac.data.service.StyleBinderHelper;
import com.andresmr.android.tac.ui.base.DiffByIdItemCallback;
import com.andresmr.android.tac.ui.base.ListItemWithStyleHolder;

import org.hisp.dhis.android.core.dataset.DataSet;

public class DataSetsAdapter extends PagedListAdapter<DataSet, ListItemWithStyleHolder> {

    DataSetsAdapter() {
        super(new DiffByIdItemCallback<>());
    }

    @NonNull
    @Override
    public ListItemWithStyleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_with_style, parent, false);
        return new ListItemWithStyleHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListItemWithStyleHolder holder, int position) {
        DataSet dataSet = getItem(position);
        holder.title.setText(dataSet.displayName());
        holder.subtitle1.setText(dataSet.periodType().name());
        StyleBinderHelper.bindStyle(holder, dataSet.style());
    }
}
