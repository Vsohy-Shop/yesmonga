package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    /* renamed from: D */
    public void mo49911D(ConstraintLayout constraintLayout) {
        ConstraintLayout.C16926b bVar = (ConstraintLayout.C16926b) getLayoutParams();
        bVar.f44293v0.mo49533c2(0);
        bVar.f44293v0.mo49607y1(0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo50654p();
    }

    /* renamed from: r */
    public void mo49916r(ConstraintLayout constraintLayout) {
        mo50655q(constraintLayout);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo50654p();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo50654p();
    }

    /* renamed from: y */
    public void mo49882y(AttributeSet attributeSet) {
        super.mo49882y(attributeSet);
        this.f44194e = false;
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
