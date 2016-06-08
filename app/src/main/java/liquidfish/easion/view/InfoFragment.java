package liquidfish.easion.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import liquidfish.easion.R;

/**
 * Created by Rick on 1-6-2016.
 */
public class InfoFragment extends Fragment {

    public InfoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_info, container, false);

        ImageView logo = (ImageView) rootView.findViewById(R.id.parantionLogo);
        logo.setImageResource(R.drawable.parantion_logo);

        TextView title = (TextView) rootView.findViewById(R.id.titleText);
        title.setText(getString(R.string.info_header));

        TextView textWall = (TextView) rootView.findViewById(R.id.wallOfText);
        textWall.setText(getString(R.string.info_text));


        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}

