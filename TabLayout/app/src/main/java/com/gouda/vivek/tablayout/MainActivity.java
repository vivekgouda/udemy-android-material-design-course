package com.gouda.vivek.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewPager_id);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new OneFragment(),"ITEM ONE");
        viewPagerAdapter.addFragment(new TwoFragment(),"ITEM TWO");
        viewPagerAdapter.addFragment(new ThreeFragment(),"ITEM THREE");
        viewPagerAdapter.addFragment(new FourFragment(),"ITEM FOUR");
        viewPagerAdapter.addFragment(new FiveFragment(),"ITEM FIVE");
        viewPagerAdapter.addFragment(new SixFragment(),"ITEM SIX");
        viewPagerAdapter.addFragment(new SevenFragment(),"ITEM SEVEN");
        viewPagerAdapter.addFragment(new EightFragment(),"ITEM EIGHT");
        viewPagerAdapter.addFragment(new NineFragment(),"ITEM NINE");
        viewPagerAdapter.addFragment(new TenFragment(),"ITEM TEN");

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);

        tabLayout.setupWithViewPager(viewPager);
    }
}
