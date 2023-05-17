package com.alsarahdella.uts_201103660;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyWebPagerAdapter extends FragmentPagerAdapter {
    private webmoodle _beritaFragment = new webmoodle();
    private Context _context;
    private webresmi _ecommerceFragment = new webresmi();
    private int _tabcount;

    public MyWebPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount)
    {
        super(fragmentManager);

        _context = context;
        _tabcount = tabCount;
    }
    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return _webresmi;
            case 1:
                return _webmoodle;
        }
    }

    @Override
    public int getCount()
    {
        return _tabcount;
    }
}
