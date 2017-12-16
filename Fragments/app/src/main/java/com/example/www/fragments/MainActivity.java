package com.example.www.fragments;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import fragments.CourseFragment;
import fragments.SessionFragment;
import layout.FirstFragment;
import layout.FourthFragment;
import layout.SecondFragment;
import layout.ThirdFragment;

public class MainActivity  extends AppCompatActivity  implements FirstFragment.OnFragmentInteractionListener, SecondFragment.OnFragmentInteractionListener, ThirdFragment.OnFragmentInteractionListener, FourthFragment.OnFragmentInteractionListener{

    Button firstBtn, secondBtn, thirdBtn, fourthBtn;
    View.OnClickListener myListner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstBtn = (Button) findViewById(R.id.firstButton);
        secondBtn = (Button) findViewById(R.id.secondButton);
        thirdBtn = (Button) findViewById(R.id.thirdButton);
        fourthBtn = (Button) findViewById(R.id.fourthButton);
        
        myListner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final FragmentManager fragmentManager = getSupportFragmentManager();
                final android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                switch (v.getId()) {
                    case R.id.firstButton:
                        FirstFragment firstFragment = new FirstFragment();
                        fragmentTransaction.replace(R.id.llFragments, firstFragment);
                        fragmentTransaction.commit();
                        break;
                    case R.id.secondButton:
                        SecondFragment secondFragment = new SecondFragment();
                        fragmentTransaction.replace(R.id.llFragments, secondFragment);
                        fragmentTransaction.commit();
                        break;
                    case R.id.thirdButton:
                        ThirdFragment thirdFragment = new ThirdFragment();
                        fragmentTransaction.replace(R.id.llFragments, thirdFragment);
                        fragmentTransaction.commit();
                        break;
                    case R.id.fourthButton:
                        FourthFragment fourthFragment = new FourthFragment();
                        fragmentTransaction.replace(R.id.llFragments, fourthFragment);
                        fragmentTransaction.commit();
                        break;
                }
            }
        };

        firstBtn.setOnClickListener(myListner);
        secondBtn.setOnClickListener(myListner);
        thirdBtn.setOnClickListener(myListner);
        fourthBtn.setOnClickListener(myListner);
    }
    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}