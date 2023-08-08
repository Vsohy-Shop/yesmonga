package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.C16808l;
import androidx.constraintlayout.widget.C16944e;

public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: x */
    public boolean f44391x;

    /* renamed from: y */
    public boolean f44392y;

    public VirtualLayout(Context context) {
        super(context);
    }

    /* renamed from: J */
    public void mo49884J(C16808l lVar, int i, int i2) {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f44391x || this.f44392y) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f44191b; i++) {
                    View viewById = constraintLayout.getViewById(this.f44190a[i]);
                    if (viewById != null) {
                        if (this.f44391x) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f44392y && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
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

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo50654p();
    }

    /* renamed from: y */
    public void mo49882y(AttributeSet attributeSet) {
        super.mo49882y(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.ConstraintLayout_Layout_android_visibility) {
                    this.f44391x = true;
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_android_elevation) {
                    this.f44392y = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
