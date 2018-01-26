package ng.com.bkm.developerportfolio.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ng.com.bkm.developerportfolio.views.AboutFragment;
import ng.com.bkm.developerportfolio.views.ContactFragment;
import ng.com.bkm.developerportfolio.views.SkillsFragment;
import ng.com.bkm.developerportfolio.views.WorkFragment;

/**
 * Created by lenovo on 1/19/2018.
 */

public class DevPagerAdapter extends FragmentPagerAdapter {
    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AboutFragment();
            case 1:
                return new WorkFragment();
            case 2:
                return new SkillsFragment();
            case 3:
                return new ContactFragment();
        }


        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "About";
            case 1:
                return "Work";
            case 2:
                return "Skills";
            case 3:
                return "Contacts";
        }

        return null;
    }
}
