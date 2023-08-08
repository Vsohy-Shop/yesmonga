package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C16643e;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* renamed from: androidx.constraintlayout.core.widgets.j */
public class C16806j extends C16808l {
    /* renamed from: g */
    public void mo49546g(C16643e eVar, boolean z) {
        super.mo49546g(eVar, z);
        if (this.f43035B1 > 0) {
            ConstraintWidget constraintWidget = this.f43034A1[0];
            constraintWidget.mo49502S0();
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.mo49558j(type, this, type);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.mo49558j(type2, this, type2);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f42635c;
            constraintWidget.mo49558j(type3, this, type3);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.mo49558j(type4, this, type4);
        }
    }

    /* renamed from: v2 */
    public void mo49776v2(int i, int i2, int i3, int i4) {
        boolean z = false;
        int s2 = mo49834s2() + mo49835t2() + 0;
        int u2 = mo49836u2() + mo49833r2() + 0;
        if (this.f43035B1 > 0) {
            s2 += this.f43034A1[0].mo49569m0();
            u2 += this.f43034A1[0].mo49456D();
        }
        int max = Math.max(mo49495Q(), s2);
        int max2 = Math.max(mo49492P(), u2);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(max, i2);
            } else if (i == 0) {
                i2 = max;
            } else {
                i2 = 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(max2, i4);
            } else if (i3 == 0) {
                i4 = max2;
            } else {
                i4 = 0;
            }
        }
        mo49820A2(i2, i4);
        mo49533c2(i2);
        mo49607y1(i4);
        if (this.f43035B1 > 0) {
            z = true;
        }
        mo49840z2(z);
    }
}
