package ng.com.bkm.developerportfolio.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ng.com.bkm.developerportfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkFragment extends Fragment {


    public WorkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View workView = inflater.inflate(R.layout.fragment_work, container, false);
        // Inflate the layout for this fragment
        return workView;
    }
}
