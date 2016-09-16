package lindenvalley.de.customprogress;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class Progress extends ProgressBar {

    public Progress(Context context) {
        super(context);
    }

    public Progress(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Progress(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public int getProgressX() {
       return (getWidth()*getProgress())/100;
    }
}
