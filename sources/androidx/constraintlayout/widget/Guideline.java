package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {

    /* renamed from: a */
    public boolean f44383a = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f44383a = z;
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C16926b bVar = (ConstraintLayout.C16926b) getLayoutParams();
        if (!this.f44383a || bVar.f44250a != i) {
            bVar.f44250a = i;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C16926b bVar = (ConstraintLayout.C16926b) getLayoutParams();
        if (!this.f44383a || bVar.f44252b != i) {
            bVar.f44252b = i;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C16926b bVar = (ConstraintLayout.C16926b) getLayoutParams();
        if (!this.f44383a || bVar.f44254c != f) {
            bVar.f44254c = f;
            setLayoutParams(bVar);
        }
    }

    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
