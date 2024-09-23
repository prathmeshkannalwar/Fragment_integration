package com.example.reinstack.ui.tagging_and_notes;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.reinstack.R;

public class tagging_and_notes extends Fragment {

    private TaggingAndNotesViewModel mViewModel;

    public static tagging_and_notes newInstance() {
        return new tagging_and_notes();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tagging_and_notes, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(TaggingAndNotesViewModel.class);
        // TODO: Use the ViewModel
    }

}