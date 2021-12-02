package com.andresmr.android.tac.ui.enrollment_form;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.andresmr.android.tac.R;
import com.andresmr.android.tac.data.service.forms.FormField;

class FieldHolder extends RecyclerView.ViewHolder {

    final FormAdapter.OnValueSaved valueSavedListener;
    TextView label;

    FieldHolder(@NonNull View itemView, FormAdapter.OnValueSaved valueSavedListener) {
        super(itemView);
        this.label = itemView.findViewById(R.id.label);
        this.valueSavedListener = valueSavedListener;
    }

    void bind(FormField fieldItem) {
        label.setText(fieldItem.getFormLabel());
    }
}
