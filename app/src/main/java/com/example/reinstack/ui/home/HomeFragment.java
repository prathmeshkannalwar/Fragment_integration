package com.example.reinstack.ui.home;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.example.reinstack.Expense_Main_Totally;
import com.example.reinstack.Income_Main_Totally;
import com.example.reinstack.Notification_Layout;
import com.example.reinstack.R;
import com.example.reinstack.Receipt_Scanning;
import com.example.reinstack.Setting_Layout;
import com.example.reinstack.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
Activity context;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //This implementation by me...
        context = getActivity();
        //----------------------------
        return root;
    }

    public void onStart(){
        super.onStart();

        // Expense button
        ImageButton btn = (ImageButton) context.findViewById(R.id.expense_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Expense_Main_Totally.class);
                startActivity(intent);
            }
        });

        //Income button
        ImageButton btn1 = (ImageButton)  context.findViewById(R.id.income_btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Income_Main_Totally.class);
                startActivity(intent);
            }
        });


        //Receipt Scan Button
        ImageButton btn2 = (ImageButton) context.findViewById(R.id.receipt_scn_btn);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Receipt_Scanning.class);
                startActivity(intent);
            }
        });

        ImageButton btn3 = (ImageButton)  context.findViewById(R.id.notiimgbtn);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Notification_Layout.class);
                startActivity(intent);
            }
        });

        ImageButton btn4 = (ImageButton) context.findViewById(R.id.setngimgbtn);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Setting_Layout.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}