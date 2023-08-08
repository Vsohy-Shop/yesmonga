package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.C0387a;

public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a */
    public final C0744m f1927a;

    public AppCompatRatingBar(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f1927a.mo3533b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.ratingBarStyle);
    }

    public AppCompatRatingBar(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0705c1.m3421a(this, getContext());
        C0744m mVar = new C0744m(this);
        this.f1927a = mVar;
        mVar.mo3534c(attributeSet, i);
    }
}
