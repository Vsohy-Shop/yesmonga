package com.google.maps.android.p050ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: com.google.maps.android.ui.SquareTextView */
public class SquareTextView extends AppCompatTextView {

    /* renamed from: v */
    public int f82222v = 0;

    /* renamed from: w */
    public int f82223w = 0;

    public SquareTextView(Context context) {
        super(context);
    }

    public void draw(Canvas canvas) {
        canvas.translate((float) (this.f82223w / 2), (float) (this.f82222v / 2));
        super.draw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f82222v = measuredWidth - measuredHeight;
            this.f82223w = 0;
        } else {
            this.f82222v = 0;
            this.f82223w = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }

    public SquareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
