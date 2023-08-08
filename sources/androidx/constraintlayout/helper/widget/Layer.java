package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Layer extends ConstraintHelper {

    /* renamed from: T0 */
    public static final String f43128T0 = "Layer";

    /* renamed from: E0 */
    public ConstraintLayout f43129E0;

    /* renamed from: F0 */
    public float f43130F0 = 1.0f;

    /* renamed from: G0 */
    public float f43131G0 = 1.0f;

    /* renamed from: H0 */
    public float f43132H0 = Float.NaN;

    /* renamed from: I0 */
    public float f43133I0 = Float.NaN;

    /* renamed from: J0 */
    public float f43134J0 = Float.NaN;

    /* renamed from: K0 */
    public float f43135K0 = Float.NaN;

    /* renamed from: L0 */
    public float f43136L0 = Float.NaN;

    /* renamed from: M0 */
    public float f43137M0 = Float.NaN;

    /* renamed from: N0 */
    public boolean f43138N0 = true;

    /* renamed from: O0 */
    public View[] f43139O0 = null;

    /* renamed from: P0 */
    public float f43140P0 = 0.0f;

    /* renamed from: Q0 */
    public float f43141Q0 = 0.0f;

    /* renamed from: R0 */
    public boolean f43142R0;

    /* renamed from: S0 */
    public boolean f43143S0;

    /* renamed from: x */
    public float f43144x = Float.NaN;

    /* renamed from: y */
    public float f43145y = Float.NaN;

    /* renamed from: z */
    public float f43146z = Float.NaN;

    public Layer(Context context) {
        super(context);
    }

    /* renamed from: D */
    public void mo49911D(ConstraintLayout constraintLayout) {
        mo49914K();
        this.f43132H0 = Float.NaN;
        this.f43133I0 = Float.NaN;
        ConstraintWidget b = ((ConstraintLayout.C16926b) getLayoutParams()).mo50703b();
        b.mo49533c2(0);
        b.mo49607y1(0);
        mo49913J();
        layout(((int) this.f43136L0) - getPaddingLeft(), ((int) this.f43137M0) - getPaddingTop(), ((int) this.f43134J0) + getPaddingRight(), ((int) this.f43135K0) + getPaddingBottom());
        mo49915L();
    }

    /* renamed from: F */
    public void mo49912F(ConstraintLayout constraintLayout) {
        this.f43129E0 = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f43146z = rotation;
        } else if (!Float.isNaN(this.f43146z)) {
            this.f43146z = rotation;
        }
    }

    /* renamed from: J */
    public void mo49913J() {
        if (this.f43129E0 != null) {
            if (!this.f43138N0 && !Float.isNaN(this.f43132H0) && !Float.isNaN(this.f43133I0)) {
                return;
            }
            if (Float.isNaN(this.f43144x) || Float.isNaN(this.f43145y)) {
                View[] w = mo50664w(this.f43129E0);
                int left = w[0].getLeft();
                int top = w[0].getTop();
                int right = w[0].getRight();
                int bottom = w[0].getBottom();
                for (int i = 0; i < this.f44191b; i++) {
                    View view = w[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f43134J0 = (float) right;
                this.f43135K0 = (float) bottom;
                this.f43136L0 = (float) left;
                this.f43137M0 = (float) top;
                if (Float.isNaN(this.f43144x)) {
                    this.f43132H0 = (float) ((left + right) / 2);
                } else {
                    this.f43132H0 = this.f43144x;
                }
                if (Float.isNaN(this.f43145y)) {
                    this.f43133I0 = (float) ((top + bottom) / 2);
                } else {
                    this.f43133I0 = this.f43145y;
                }
            } else {
                this.f43133I0 = this.f43145y;
                this.f43132H0 = this.f43144x;
            }
        }
    }

    /* renamed from: K */
    public final void mo49914K() {
        int i;
        if (this.f43129E0 != null && (i = this.f44191b) != 0) {
            View[] viewArr = this.f43139O0;
            if (viewArr == null || viewArr.length != i) {
                this.f43139O0 = new View[i];
            }
            for (int i2 = 0; i2 < this.f44191b; i2++) {
                this.f43139O0[i2] = this.f43129E0.getViewById(this.f44190a[i2]);
            }
        }
    }

    /* renamed from: L */
    public final void mo49915L() {
        double d;
        if (this.f43129E0 != null) {
            if (this.f43139O0 == null) {
                mo49914K();
            }
            mo49913J();
            if (Float.isNaN(this.f43146z)) {
                d = 0.0d;
            } else {
                d = Math.toRadians((double) this.f43146z);
            }
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = this.f43130F0;
            float f2 = f * cos;
            float f3 = this.f43131G0;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < this.f44191b; i++) {
                View view = this.f43139O0[i];
                float left = ((float) ((view.getLeft() + view.getRight()) / 2)) - this.f43132H0;
                float top = ((float) ((view.getTop() + view.getBottom()) / 2)) - this.f43133I0;
                view.setTranslationX((((f2 * left) + (f4 * top)) - left) + this.f43140P0);
                view.setTranslationY((((left * f5) + (f6 * top)) - top) + this.f43141Q0);
                view.setScaleY(this.f43131G0);
                view.setScaleX(this.f43130F0);
                if (!Float.isNaN(this.f43146z)) {
                    view.setRotation(this.f43146z);
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43129E0 = (ConstraintLayout) getParent();
        if (this.f43142R0 || this.f43143S0) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f44191b; i++) {
                View viewById = this.f43129E0.getViewById(this.f44190a[i]);
                if (viewById != null) {
                    if (this.f43142R0) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f43143S0 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void mo49916r(ConstraintLayout constraintLayout) {
        mo50655q(constraintLayout);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo50654p();
    }

    public void setPivotX(float f) {
        this.f43144x = f;
        mo49915L();
    }

    public void setPivotY(float f) {
        this.f43145y = f;
        mo49915L();
    }

    public void setRotation(float f) {
        this.f43146z = f;
        mo49915L();
    }

    public void setScaleX(float f) {
        this.f43130F0 = f;
        mo49915L();
    }

    public void setScaleY(float f) {
        this.f43131G0 = f;
        mo49915L();
    }

    public void setTranslationX(float f) {
        this.f43140P0 = f;
        mo49915L();
    }

    public void setTranslationY(float f) {
        this.f43141Q0 = f;
        mo49915L();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo50654p();
    }

    /* renamed from: y */
    public void mo49882y(AttributeSet attributeSet) {
        super.mo49882y(attributeSet);
        this.f44194e = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.ConstraintLayout_Layout_android_visibility) {
                    this.f43142R0 = true;
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_android_elevation) {
                    this.f43143S0 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
