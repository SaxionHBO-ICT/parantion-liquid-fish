package liquidfish.easion.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import liquidfish.easion.model.Task;

/**
 * Created by Rick on 31-5-2016.
 */
public class ProgressView extends View {
    private Task task;

    public ProgressView(Context context, Task task) {
        super(context);
        this.task = task;
    }

    public ProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ProgressView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        if (task != null) {
            switch (task.getProgress()) {
                case 0://not started
                    paint.setColor(Color.GREEN);
                    break;
                case 1://started
                    paint.setColor(Color.rgb(255, 153, 51));
                    break;
                case 2://done
                    paint.setColor(Color.RED);
                    break;
                default:
                    System.out.println("non legal task progress");
                    break;
            }
        }else {
            System.out.println("task is null");
            paint.setColor(Color.GREEN);
        }


        Paint outline = new Paint();
        outline.setColor(Color.BLACK);
        outline.setStyle(Paint.Style.STROKE);
        outline.setStrokeWidth(1f);


        int width = canvas.getWidth();
        int height = canvas.getHeight();

        canvas.drawCircle(width / 2, height / 2, height / 5, paint);
        canvas.drawCircle(width / 2, height / 2, height / 5, outline);
    }

}
