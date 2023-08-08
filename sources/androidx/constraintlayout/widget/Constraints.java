package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Constraints extends ViewGroup {

    /* renamed from: b */
    public static final String f44368b = "Constraints";

    /* renamed from: a */
    public C16934c f44369a;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: a */
    public C16929a generateDefaultLayoutParams() {
        return new C16929a(-2, -2);
    }

    /* renamed from: b */
    public C16929a generateLayoutParams(AttributeSet attributeSet) {
        return new C16929a(getContext(), attributeSet);
    }

    /* renamed from: c */
    public final void mo50712c(AttributeSet attributeSet) {
    }

    public C16934c getConstraintSet() {
        if (this.f44369a == null) {
            this.f44369a = new C16934c();
        }
        this.f44369a.mo50828J(this);
        return this.f44369a;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C16926b(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo50712c(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo50712c(attributeSet);
        super.setVisibility(8);
    }

    /* renamed from: androidx.constraintlayout.widget.Constraints$a */
    public static class C16929a extends ConstraintLayout.C16926b {

        /* renamed from: V0 */
        public float f44370V0;

        /* renamed from: W0 */
        public boolean f44371W0;

        /* renamed from: X0 */
        public float f44372X0;

        /* renamed from: Y0 */
        public float f44373Y0;

        /* renamed from: Z0 */
        public float f44374Z0;

        /* renamed from: a1 */
        public float f44375a1;

        /* renamed from: b1 */
        public float f44376b1;

        /* renamed from: c1 */
        public float f44377c1;

        /* renamed from: d1 */
        public float f44378d1;

        /* renamed from: e1 */
        public float f44379e1;

        /* renamed from: f1 */
        public float f44380f1;

        /* renamed from: g1 */
        public float f44381g1;

        /* renamed from: h1 */
        public float f44382h1;

        public C16929a(int i, int i2) {
            super(i, i2);
            this.f44370V0 = 1.0f;
            this.f44371W0 = false;
            this.f44372X0 = 0.0f;
            this.f44373Y0 = 0.0f;
            this.f44374Z0 = 0.0f;
            this.f44375a1 = 0.0f;
            this.f44376b1 = 1.0f;
            this.f44377c1 = 1.0f;
            this.f44378d1 = 0.0f;
            this.f44379e1 = 0.0f;
            this.f44380f1 = 0.0f;
            this.f44381g1 = 0.0f;
            this.f44382h1 = 0.0f;
        }

        public C16929a(C16929a aVar) {
            super((ConstraintLayout.C16926b) aVar);
            this.f44370V0 = 1.0f;
            this.f44371W0 = false;
            this.f44372X0 = 0.0f;
            this.f44373Y0 = 0.0f;
            this.f44374Z0 = 0.0f;
            this.f44375a1 = 0.0f;
            this.f44376b1 = 1.0f;
            this.f44377c1 = 1.0f;
            this.f44378d1 = 0.0f;
            this.f44379e1 = 0.0f;
            this.f44380f1 = 0.0f;
            this.f44381g1 = 0.0f;
            this.f44382h1 = 0.0f;
        }

        public C16929a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44370V0 = 1.0f;
            this.f44371W0 = false;
            this.f44372X0 = 0.0f;
            this.f44373Y0 = 0.0f;
            this.f44374Z0 = 0.0f;
            this.f44375a1 = 0.0f;
            this.f44376b1 = 1.0f;
            this.f44377c1 = 1.0f;
            this.f44378d1 = 0.0f;
            this.f44379e1 = 0.0f;
            this.f44380f1 = 0.0f;
            this.f44381g1 = 0.0f;
            this.f44382h1 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16944e.C16957m.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.ConstraintSet_android_alpha) {
                    this.f44370V0 = obtainStyledAttributes.getFloat(index, this.f44370V0);
                } else if (index == C16944e.C16957m.ConstraintSet_android_elevation) {
                    this.f44372X0 = obtainStyledAttributes.getFloat(index, this.f44372X0);
                    this.f44371W0 = true;
                } else if (index == C16944e.C16957m.ConstraintSet_android_rotationX) {
                    this.f44374Z0 = obtainStyledAttributes.getFloat(index, this.f44374Z0);
                } else if (index == C16944e.C16957m.ConstraintSet_android_rotationY) {
                    this.f44375a1 = obtainStyledAttributes.getFloat(index, this.f44375a1);
                } else if (index == C16944e.C16957m.ConstraintSet_android_rotation) {
                    this.f44373Y0 = obtainStyledAttributes.getFloat(index, this.f44373Y0);
                } else if (index == C16944e.C16957m.ConstraintSet_android_scaleX) {
                    this.f44376b1 = obtainStyledAttributes.getFloat(index, this.f44376b1);
                } else if (index == C16944e.C16957m.ConstraintSet_android_scaleY) {
                    this.f44377c1 = obtainStyledAttributes.getFloat(index, this.f44377c1);
                } else if (index == C16944e.C16957m.ConstraintSet_android_transformPivotX) {
                    this.f44378d1 = obtainStyledAttributes.getFloat(index, this.f44378d1);
                } else if (index == C16944e.C16957m.ConstraintSet_android_transformPivotY) {
                    this.f44379e1 = obtainStyledAttributes.getFloat(index, this.f44379e1);
                } else if (index == C16944e.C16957m.ConstraintSet_android_translationX) {
                    this.f44380f1 = obtainStyledAttributes.getFloat(index, this.f44380f1);
                } else if (index == C16944e.C16957m.ConstraintSet_android_translationY) {
                    this.f44381g1 = obtainStyledAttributes.getFloat(index, this.f44381g1);
                } else if (index == C16944e.C16957m.ConstraintSet_android_translationZ) {
                    this.f44382h1 = obtainStyledAttributes.getFloat(index, this.f44382h1);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
