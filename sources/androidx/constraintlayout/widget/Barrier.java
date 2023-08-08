package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.C16775a;
import androidx.constraintlayout.core.widgets.C16798d;
import androidx.constraintlayout.core.widgets.C16804h;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Barrier extends ConstraintHelper {

    /* renamed from: E0 */
    public static final int f44162E0 = 0;

    /* renamed from: F0 */
    public static final int f44163F0 = 2;

    /* renamed from: G0 */
    public static final int f44164G0 = 1;

    /* renamed from: H0 */
    public static final int f44165H0 = 3;

    /* renamed from: I0 */
    public static final int f44166I0 = 5;

    /* renamed from: J0 */
    public static final int f44167J0 = 6;

    /* renamed from: x */
    public int f44168x;

    /* renamed from: y */
    public int f44169y;

    /* renamed from: z */
    public C16775a f44170z;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: B */
    public void mo49883B(ConstraintWidget constraintWidget, boolean z) {
        mo50616K(constraintWidget, this.f44168x, z);
    }

    @Deprecated
    /* renamed from: J */
    public boolean mo50615J() {
        return this.f44170z.mo49613o2();
    }

    /* renamed from: K */
    public final void mo50616K(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f44169y = i;
        if (z) {
            int i2 = this.f44168x;
            if (i2 == 5) {
                this.f44169y = 1;
            } else if (i2 == 6) {
                this.f44169y = 0;
            }
        } else {
            int i3 = this.f44168x;
            if (i3 == 5) {
                this.f44169y = 0;
            } else if (i3 == 6) {
                this.f44169y = 1;
            }
        }
        if (constraintWidget instanceof C16775a) {
            ((C16775a) constraintWidget).mo49619u2(this.f44169y);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f44170z.mo49613o2();
    }

    public int getMargin() {
        return this.f44170z.mo49615q2();
    }

    public int getType() {
        return this.f44168x;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f44170z.mo49618t2(z);
    }

    public void setDpMargin(int i) {
        C16775a aVar = this.f44170z;
        aVar.mo49620v2((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f44170z.mo49620v2(i);
    }

    public void setType(int i) {
        this.f44168x = i;
    }

    /* renamed from: y */
    public void mo49882y(AttributeSet attributeSet) {
        super.mo49882y(attributeSet);
        this.f44170z = new C16775a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f44170z.mo49618t2(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_barrierMargin) {
                    this.f44170z.mo49620v2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f44193d = this.f44170z;
        mo50647I();
    }

    /* renamed from: z */
    public void mo49910z(C16934c.C16935a aVar, C16804h hVar, ConstraintLayout.C16926b bVar, SparseArray<ConstraintWidget> sparseArray) {
        super.mo49910z(aVar, hVar, bVar, sparseArray);
        if (hVar instanceof C16775a) {
            C16775a aVar2 = (C16775a) hVar;
            mo50616K(aVar2, aVar.f44584e.f44716h0, ((C16798d) hVar.mo49507U()).mo49731O2());
            aVar2.mo49618t2(aVar.f44584e.f44732p0);
            aVar2.mo49620v2(aVar.f44584e.f44718i0);
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
