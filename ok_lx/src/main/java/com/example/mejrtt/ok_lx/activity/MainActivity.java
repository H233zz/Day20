package com.example.mejrtt.ok_lx.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.mejrtt.ok_lx.R;
import com.example.mejrtt.ok_lx.fragment.Fragment1;
import com.example.mejrtt.ok_lx.fragment.Fragment10;
import com.example.mejrtt.ok_lx.fragment.Fragment2;
import com.example.mejrtt.ok_lx.fragment.Fragment3;
import com.example.mejrtt.ok_lx.fragment.Fragment4;
import com.example.mejrtt.ok_lx.fragment.Fragment5;
import com.example.mejrtt.ok_lx.fragment.Fragment6;
import com.example.mejrtt.ok_lx.fragment.Fragment7;
import com.example.mejrtt.ok_lx.fragment.Fragment8;
import com.example.mejrtt.ok_lx.fragment.Fragment9;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();//初始化控件
        initViewPager();// 初始化ViewPager
    }

    private void initViewPager() {
        // 创建一个集合,装填Fragment
        ArrayList<Fragment> fragments = new ArrayList<>();
        // 装填
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        fragments.add(new Fragment3());
        fragments.add(new Fragment4());
        fragments.add(new Fragment5());
        fragments.add(new Fragment6());
        fragments.add(new Fragment7());
        fragments.add(new Fragment8());
        fragments.add(new Fragment9());
        fragments.add(new Fragment10());
        // 创建ViewPager适配器
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        myPagerAdapter.setFragments(fragments);
        // 给ViewPager设置适配器
        mViewPager.setAdapter(myPagerAdapter);
        // TabLayout 指示器 (记得自己手动创建4个Fragment,注意是 app包下的Fragment 还是 V4包下的 Fragment)
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        // 使用 TabLayout 和 ViewPager 相关联
        mTabLayout.setupWithViewPager(mViewPager);
        // TabLayout指示器添加文本
        mTabLayout.getTabAt(0).setText("推荐");
        mTabLayout.getTabAt(1).setText("头条");
        mTabLayout.getTabAt(2).setText("热点");
        mTabLayout.getTabAt(3).setText("娱乐");
        mTabLayout.getTabAt(4).setText("体育");
        mTabLayout.getTabAt(5).setText("军事");
        mTabLayout.getTabAt(6).setText("段子");
        mTabLayout.getTabAt(7).setText("美图");
        mTabLayout.getTabAt(8).setText("搞笑");
        mTabLayout.getTabAt(9).setText("新闻");
    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.tvtablayout);
        mViewPager = (ViewPager) findViewById(R.id.tvviewpager);
    }

    //ViewPager适配器代码:
    public class MyPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> mFragmentList;

        public void setFragments(ArrayList<Fragment> fragments) {
            mFragmentList = fragments;
        }

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            Fragment fragment = mFragmentList.get(position);
            return fragment;
        }
        @Override
        public int getCount() {
            return mFragmentList.size();
        }
    }
}
