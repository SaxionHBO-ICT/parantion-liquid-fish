package liquidfish.easion.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import liquidfish.easion.R;
import liquidfish.easion.adapter.TaskAdapter;
import liquidfish.easion.model.DataProvider;
import liquidfish.easion.model.Task;

/**
 * Created by Rick on 25-5-2016.
 */
public class TaskList extends Fragment {

    private ArrayList<Task> tasks = DataProvider.getTasks();

    public TaskList() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_task_list, container, false);

       TaskAdapter adapter = new TaskAdapter(getActivity(), R.layout.task_layout, tasks);
       ListView lv = (ListView) rootView.findViewById(R.id.listView);
       lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CharSequence text = "Opening " + tasks.get(position).getLabel();
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
            }
        });

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
