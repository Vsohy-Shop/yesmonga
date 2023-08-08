package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.C16958f;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ReactiveGuide extends View implements C16958f.C16959a {

    /* renamed from: a */
    public int f44387a = -1;

    /* renamed from: b */
    public boolean f44388b = false;

    /* renamed from: c */
    public int f44389c = 0;

    /* renamed from: d */
    public boolean f44390d = true;

    public ReactiveGuide(Context context) {
        super(context);
        super.setVisibility(8);
        mo50736c((AttributeSet) null);
    }

    /* renamed from: a */
    public void mo50124a(int i, int i2, int i3) {
        setGuidelineBegin(i2);
        int id = getId();
        if (id > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i4 = this.f44389c;
            if (i4 != 0) {
                currentState = i4;
            }
            int i5 = 0;
            if (this.f44388b) {
                if (this.f44390d) {
                    int[] constraintSetIds = motionLayout.getConstraintSetIds();
                    while (i5 < constraintSetIds.length) {
                        int i6 = constraintSetIds[i5];
                        if (i6 != currentState) {
                            mo50735b(i2, id, motionLayout, i6);
                        }
                        i5++;
                    }
                }
                C16934c Z = motionLayout.mo49991Z(currentState);
                Z.mo50865d1(id, i2);
                motionLayout.mo49987W0(currentState, Z, 1000);
            } else if (this.f44390d) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i5 < constraintSetIds2.length) {
                    mo50735b(i2, id, motionLayout, constraintSetIds2[i5]);
                    i5++;
                }
            } else {
                mo50735b(i2, id, motionLayout, currentState);
            }
        }
    }

    /* renamed from: b */
    public final void mo50735b(int i, int i2, MotionLayout motionLayout, int i3) {
        C16934c n0 = motionLayout.mo50021n0(i3);
        n0.mo50865d1(i2, i);
        motionLayout.mo49985V0(i3, n0);
    }

    /* renamed from: c */
    public final void mo50736c(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f44387a = obtainStyledAttributes.getResourceId(index, this.f44387a);
                } else if (index == C16944e.C16957m.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f44388b = obtainStyledAttributes.getBoolean(index, this.f44388b);
                } else if (index == C16944e.C16957m.f44837x2694048c) {
                    this.f44389c = obtainStyledAttributes.getResourceId(index, this.f44389c);
                } else if (index == C16944e.C16957m.f44836xfdeff96) {
                    this.f44390d = obtainStyledAttributes.getBoolean(index, this.f44390d);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f44387a != -1) {
            ConstraintLayout.getSharedValues().mo50984a(this.f44387a, this);
        }
    }

    /* renamed from: d */
    public boolean mo50737d() {
        return this.f44388b;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f44389c;
    }

    public int getAttributeId() {
        return this.f44387a;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.f44388b = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f44389c = i;
    }

    public void setAttributeId(int i) {
        C16958f sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f44387a;
        if (i2 != -1) {
            sharedValues.mo50988e(i2, this);
        }
        this.f44387a = i;
        if (i != -1) {
            sharedValues.mo50984a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C16926b bVar = (ConstraintLayout.C16926b) getLayoutParams();
        bVar.f44250a = i;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C16926b bVar = (ConstraintLayout.C16926b) getLayoutParams();
        bVar.f44252b = i;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C16926b bVar = (ConstraintLayout.C16926b) getLayoutParams();
        bVar.f44254c = f;
        setLayoutParams(bVar);
    }

    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
        mo50736c(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
        mo50736c(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
        mo50736c(attributeSet);
    }
}
