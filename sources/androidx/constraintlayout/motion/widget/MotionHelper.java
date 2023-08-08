package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

public class MotionHelper extends ConstraintHelper implements C16897p {

    /* renamed from: E0 */
    public View[] f43191E0;

    /* renamed from: x */
    public boolean f43192x = false;

    /* renamed from: y */
    public boolean f43193y = false;

    /* renamed from: z */
    public float f43194z;

    public MotionHelper(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo49854a(MotionLayout motionLayout, int i, int i2, float f) {
    }

    /* renamed from: b */
    public void mo49950b(MotionLayout motionLayout) {
    }

    /* renamed from: c */
    public void mo49927c(MotionLayout motionLayout, HashMap<View, C16895o> hashMap) {
    }

    /* renamed from: d */
    public void mo49951d(Canvas canvas) {
    }

    /* renamed from: e */
    public void mo49952e(Canvas canvas) {
    }

    /* renamed from: f */
    public void mo49857f(MotionLayout motionLayout, int i) {
    }

    /* renamed from: g */
    public void mo49953g(MotionLayout motionLayout, int i, int i2) {
    }

    public float getProgress() {
        return this.f43194z;
    }

    /* renamed from: h */
    public void mo49955h(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    /* renamed from: i */
    public boolean mo49956i() {
        return this.f43192x;
    }

    /* renamed from: j */
    public boolean mo49957j() {
        return this.f43193y;
    }

    /* renamed from: k */
    public boolean mo49928k() {
        return false;
    }

    public void setProgress(View view, float f) {
    }

    /* renamed from: y */
    public void mo49882y(AttributeSet attributeSet) {
        super.mo49882y(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.MotionHelper_onShow) {
                    this.f43192x = obtainStyledAttributes.getBoolean(index, this.f43192x);
                } else if (index == C16944e.C16957m.MotionHelper_onHide) {
                    this.f43193y = obtainStyledAttributes.getBoolean(index, this.f43193y);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.f43194z = f;
        int i = 0;
        if (this.f44191b > 0) {
            this.f43191E0 = mo50664w((ConstraintLayout) getParent());
            while (i < this.f44191b) {
                setProgress(this.f43191E0[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f);
            }
            i++;
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo49882y(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo49882y(attributeSet);
    }
}
