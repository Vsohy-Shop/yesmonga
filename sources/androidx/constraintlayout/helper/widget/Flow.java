package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.C16799e;
import androidx.constraintlayout.core.widgets.C16804h;
import androidx.constraintlayout.core.widgets.C16808l;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;

public class Flow extends VirtualLayout {

    /* renamed from: E0 */
    public static final String f43111E0 = "Flow";

    /* renamed from: F0 */
    public static final int f43112F0 = 0;

    /* renamed from: G0 */
    public static final int f43113G0 = 1;

    /* renamed from: H0 */
    public static final int f43114H0 = 0;

    /* renamed from: I0 */
    public static final int f43115I0 = 1;

    /* renamed from: J0 */
    public static final int f43116J0 = 2;

    /* renamed from: K0 */
    public static final int f43117K0 = 0;

    /* renamed from: L0 */
    public static final int f43118L0 = 1;

    /* renamed from: M0 */
    public static final int f43119M0 = 2;

    /* renamed from: N0 */
    public static final int f43120N0 = 0;

    /* renamed from: O0 */
    public static final int f43121O0 = 1;

    /* renamed from: P0 */
    public static final int f43122P0 = 2;

    /* renamed from: Q0 */
    public static final int f43123Q0 = 0;

    /* renamed from: R0 */
    public static final int f43124R0 = 1;

    /* renamed from: S0 */
    public static final int f43125S0 = 2;

    /* renamed from: T0 */
    public static final int f43126T0 = 3;

    /* renamed from: z */
    public C16799e f43127z;

    public Flow(Context context) {
        super(context);
    }

    /* renamed from: B */
    public void mo49883B(ConstraintWidget constraintWidget, boolean z) {
        this.f43127z.mo49828m2(z);
    }

    /* renamed from: J */
    public void mo49884J(C16808l lVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (lVar != null) {
            lVar.mo49776v2(mode, size, mode2, size2);
            setMeasuredDimension(lVar.mo49832q2(), lVar.mo49831p2());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo49884J(this.f43127z, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f43127z.mo49765k3(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f43127z.mo49766l3(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f43127z.mo49767m3(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f43127z.mo49768n3(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f43127z.mo49769o3(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f43127z.mo49770p3(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f43127z.mo49771q3(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f43127z.mo49772r3(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f43127z.mo49773s3(f);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f43127z.mo49774t3(i);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f43127z.mo49775u3(f);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f43127z.mo49777v3(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f43127z.mo49778w3(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f43127z.mo49779x3(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f43127z.mo49821B2(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f43127z.mo49822C2(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f43127z.mo49824E2(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f43127z.mo49825F2(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f43127z.mo49827H2(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f43127z.mo49780y3(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f43127z.mo49781z3(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f43127z.mo49754A3(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f43127z.mo49755B3(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f43127z.mo49756C3(i);
        requestLayout();
    }

    /* renamed from: y */
    public void mo49882y(AttributeSet attributeSet) {
        super.mo49882y(attributeSet);
        this.f43127z = new C16799e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.ConstraintLayout_Layout_android_orientation) {
                    this.f43127z.mo49779x3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_android_padding) {
                    this.f43127z.mo49821B2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_android_paddingStart) {
                    this.f43127z.mo49826G2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f43127z.mo49823D2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f43127z.mo49824E2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_android_paddingTop) {
                    this.f43127z.mo49827H2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_android_paddingRight) {
                    this.f43127z.mo49825F2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f43127z.mo49822C2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f43127z.mo49756C3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f43127z.mo49772r3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f43127z.mo49755B3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f43127z.mo49766l3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f43127z.mo49774t3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f43127z.mo49768n3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f43127z.mo49777v3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f43127z.mo49770p3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f43127z.mo49765k3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f43127z.mo49773s3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f43127z.mo49767m3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f43127z.mo49775u3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f43127z.mo49781z3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f43127z.mo49769o3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f43127z.mo49780y3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f43127z.mo49771q3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f43127z.mo49754A3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f43127z.mo49778w3(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f44193d = this.f43127z;
        mo50647I();
    }

    /* renamed from: z */
    public void mo49910z(C16934c.C16935a aVar, C16804h hVar, ConstraintLayout.C16926b bVar, SparseArray<ConstraintWidget> sparseArray) {
        super.mo49910z(aVar, hVar, bVar, sparseArray);
        if (hVar instanceof C16799e) {
            C16799e eVar = (C16799e) hVar;
            int i = bVar.f44249Z;
            if (i != -1) {
                eVar.mo49779x3(i);
            }
        }
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
