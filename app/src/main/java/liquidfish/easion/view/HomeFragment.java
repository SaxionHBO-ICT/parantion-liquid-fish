package liquidfish.easion.view;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.InputStream;

import liquidfish.easion.R;
import liquidfish.easion.model.StaticInfo;

/**
 * Created by Rick on 25-5-2016.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        ImageView image = (ImageView) rootView.findViewById(R.id.profilePictureView);
        image.setImageResource(R.drawable.temp_photo);

        TextView name = (TextView) rootView.findViewById(R.id.nameText);
        name.setText(StaticInfo.user.getFirstname() + " " + StaticInfo.user.getMiddlename() + " " + StaticInfo.user.getLastname());

        TextView email = (TextView) rootView.findViewById(R.id.emailText);
        email.setText(StaticInfo.user.getEmail());

        TextView studentNr = (TextView) rootView.findViewById(R.id.studentText);
        studentNr.setText("" + StaticInfo.user.getStudentNumber());

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