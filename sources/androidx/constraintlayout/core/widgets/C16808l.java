package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.C16778b;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.core.widgets.l */
public class C16808l extends C16804h {

    /* renamed from: C1 */
    public int f43057C1 = 0;

    /* renamed from: D1 */
    public int f43058D1 = 0;

    /* renamed from: E1 */
    public int f43059E1 = 0;

    /* renamed from: F1 */
    public int f43060F1 = 0;

    /* renamed from: G1 */
    public int f43061G1 = 0;

    /* renamed from: H1 */
    public int f43062H1 = 0;

    /* renamed from: I1 */
    public int f43063I1 = 0;

    /* renamed from: J1 */
    public int f43064J1 = 0;

    /* renamed from: K1 */
    public boolean f43065K1 = false;

    /* renamed from: L1 */
    public int f43066L1 = 0;

    /* renamed from: M1 */
    public int f43067M1 = 0;

    /* renamed from: N1 */
    public C16778b.C16779a f43068N1 = new C16778b.C16779a();

    /* renamed from: O1 */
    public C16778b.C16780b f43069O1 = null;

    /* renamed from: A2 */
    public void mo49820A2(int i, int i2) {
        this.f43066L1 = i;
        this.f43067M1 = i2;
    }

    /* renamed from: B2 */
    public void mo49821B2(int i) {
        this.f43059E1 = i;
        this.f43057C1 = i;
        this.f43060F1 = i;
        this.f43058D1 = i;
        this.f43061G1 = i;
        this.f43062H1 = i;
    }

    /* renamed from: C2 */
    public void mo49822C2(int i) {
        this.f43058D1 = i;
    }

    /* renamed from: D2 */
    public void mo49823D2(int i) {
        this.f43062H1 = i;
    }

    /* renamed from: E2 */
    public void mo49824E2(int i) {
        this.f43059E1 = i;
        this.f43063I1 = i;
    }

    /* renamed from: F2 */
    public void mo49825F2(int i) {
        this.f43060F1 = i;
        this.f43064J1 = i;
    }

    /* renamed from: G2 */
    public void mo49826G2(int i) {
        this.f43061G1 = i;
        this.f43063I1 = i;
        this.f43064J1 = i;
    }

    /* renamed from: H2 */
    public void mo49827H2(int i) {
        this.f43057C1 = i;
    }

    /* renamed from: c */
    public void mo49811c(C16798d dVar) {
        mo49829n2();
    }

    /* renamed from: m2 */
    public void mo49828m2(boolean z) {
        int i = this.f43061G1;
        if (i <= 0 && this.f43062H1 <= 0) {
            return;
        }
        if (z) {
            this.f43063I1 = this.f43062H1;
            this.f43064J1 = i;
            return;
        }
        this.f43063I1 = i;
        this.f43064J1 = this.f43062H1;
    }

    /* renamed from: n2 */
    public void mo49829n2() {
        for (int i = 0; i < this.f43035B1; i++) {
            ConstraintWidget constraintWidget = this.f43034A1[i];
            if (constraintWidget != null) {
                constraintWidget.mo49473I1(true);
            }
        }
    }

    /* renamed from: o2 */
    public boolean mo49830o2(HashSet<ConstraintWidget> hashSet) {
        for (int i = 0; i < this.f43035B1; i++) {
            if (hashSet.contains(this.f43034A1[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p2 */
    public int mo49831p2() {
        return this.f43067M1;
    }

    /* renamed from: q2 */
    public int mo49832q2() {
        return this.f43066L1;
    }

    /* renamed from: r2 */
    public int mo49833r2() {
        return this.f43058D1;
    }

    /* renamed from: s2 */
    public int mo49834s2() {
        return this.f43063I1;
    }

    /* renamed from: t2 */
    public int mo49835t2() {
        return this.f43064J1;
    }

    /* renamed from: u2 */
    public int mo49836u2() {
        return this.f43057C1;
    }

    /* renamed from: v2 */
    public void mo49776v2(int i, int i2, int i3, int i4) {
    }

    /* renamed from: w2 */
    public void mo49837w2(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        while (this.f43069O1 == null && mo49507U() != null) {
            this.f43069O1 = ((C16798d) mo49507U()).mo49723G2();
        }
        C16778b.C16779a aVar = this.f43068N1;
        aVar.f42842a = dimensionBehaviour;
        aVar.f42843b = dimensionBehaviour2;
        aVar.f42844c = i;
        aVar.f42845d = i2;
        this.f43069O1.mo48388c(constraintWidget, aVar);
        constraintWidget.mo49533c2(this.f43068N1.f42846e);
        constraintWidget.mo49607y1(this.f43068N1.f42847f);
        constraintWidget.mo49604x1(this.f43068N1.f42849h);
        constraintWidget.mo49548g1(this.f43068N1.f42848g);
    }

    /* renamed from: x2 */
    public boolean mo49838x2() {
        C16778b.C16780b bVar;
        ConstraintWidget constraintWidget = this.f42727c0;
        if (constraintWidget != null) {
            bVar = ((C16798d) constraintWidget).mo49723G2();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f43035B1) {
                return true;
            }
            ConstraintWidget constraintWidget2 = this.f43034A1[i];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof C16801f)) {
                ConstraintWidget.DimensionBehaviour z2 = constraintWidget2.mo49608z(0);
                ConstraintWidget.DimensionBehaviour z3 = constraintWidget2.mo49608z(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (z2 != dimensionBehaviour || constraintWidget2.f42766w == 1 || z3 != dimensionBehaviour || constraintWidget2.f42768x == 1) {
                    z = false;
                }
                if (!z) {
                    if (z2 == dimensionBehaviour) {
                        z2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (z3 == dimensionBehaviour) {
                        z3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    C16778b.C16779a aVar = this.f43068N1;
                    aVar.f42842a = z2;
                    aVar.f42843b = z3;
                    aVar.f42844c = constraintWidget2.mo49569m0();
                    this.f43068N1.f42845d = constraintWidget2.mo49456D();
                    bVar.mo48388c(constraintWidget2, this.f43068N1);
                    constraintWidget2.mo49533c2(this.f43068N1.f42846e);
                    constraintWidget2.mo49607y1(this.f43068N1.f42847f);
                    constraintWidget2.mo49548g1(this.f43068N1.f42848g);
                }
            }
            i++;
        }
    }

    /* renamed from: y2 */
    public boolean mo49839y2() {
        return this.f43065K1;
    }

    /* renamed from: z2 */
    public void mo49840z2(boolean z) {
        this.f43065K1 = z;
    }
}
