package liquidfish.easion.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import liquidfish.easion.R;
import liquidfish.easion.model.Task;
import liquidfish.easion.view.ProgressView;

/**
 * Created by Rick on 31-5-2016.
 */
public class TaskAdapter extends ArrayAdapter<Task> {

    private ArrayList<Task> tasks;

    public TaskAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);
        tasks = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.task_layout, parent, false);
        }

        Task task = getItem(position);
        TextView titleText = (TextView) convertView.findViewById(R.id.titleText);
        titleText.setText(task.getLabel());

        TextView senderText = (TextView) convertView.findViewById(R.id.senderText);
        senderText.setText(task.getSender());

        Task _task = tasks.get(position);
        ProgressView progressView = (ProgressView) convertView.findViewById(R.id.progressView);
        progressView = new ProgressView(getContext(), _task);

        return convertView;
    }
}
