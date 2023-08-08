package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C16643e;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.widgets.a */
public class C16775a extends C16804h {

    /* renamed from: G1 */
    public static final int f42781G1 = 0;

    /* renamed from: H1 */
    public static final int f42782H1 = 1;

    /* renamed from: I1 */
    public static final int f42783I1 = 2;

    /* renamed from: J1 */
    public static final int f42784J1 = 3;

    /* renamed from: K1 */
    public static final boolean f42785K1 = true;

    /* renamed from: L1 */
    public static final boolean f42786L1 = false;

    /* renamed from: C1 */
    public int f42787C1 = 0;

    /* renamed from: D1 */
    public boolean f42788D1 = true;

    /* renamed from: E1 */
    public int f42789E1 = 0;

    /* renamed from: F1 */
    public boolean f42790F1 = false;

    public C16775a() {
    }

    /* renamed from: G0 */
    public boolean mo49466G0() {
        return this.f42790F1;
    }

    /* renamed from: H0 */
    public boolean mo49469H0() {
        return this.f42790F1;
    }

    /* renamed from: g */
    public void mo49546g(C16643e eVar, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ConstraintAnchor[] constraintAnchorArr2 = this.f42720Y;
        constraintAnchorArr2[0] = this.f42708Q;
        constraintAnchorArr2[2] = this.f42710R;
        constraintAnchorArr2[1] = this.f42712S;
        constraintAnchorArr2[3] = this.f42714T;
        int i6 = 0;
        while (true) {
            constraintAnchorArr = this.f42720Y;
            if (i6 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i6];
            constraintAnchor.f42632i = eVar.mo48727u(constraintAnchor);
            i6++;
        }
        int i7 = this.f42787C1;
        if (i7 >= 0 && i7 < 4) {
            ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i7];
            if (!this.f42790F1) {
                mo49611m2();
            }
            if (this.f42790F1) {
                this.f42790F1 = false;
                int i8 = this.f42787C1;
                if (i8 == 0 || i8 == 1) {
                    eVar.mo48712f(this.f42708Q.f42632i, this.f42737h0);
                    eVar.mo48712f(this.f42712S.f42632i, this.f42737h0);
                } else if (i8 == 2 || i8 == 3) {
                    eVar.mo48712f(this.f42710R.f42632i, this.f42739i0);
                    eVar.mo48712f(this.f42714T.f42632i, this.f42739i0);
                }
            } else {
                int i9 = 0;
                while (true) {
                    if (i9 >= this.f43035B1) {
                        z2 = false;
                        break;
                    }
                    ConstraintWidget constraintWidget = this.f43034A1[i9];
                    if ((this.f42788D1 || constraintWidget.mo49550h()) && ((((i4 = this.f42787C1) == 0 || i4 == 1) && constraintWidget.mo49468H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f42708Q.f42629f != null && constraintWidget.f42712S.f42629f != null) || (((i5 = this.f42787C1) == 2 || i5 == 3) && constraintWidget.mo49559j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f42710R.f42629f != null && constraintWidget.f42714T.f42629f != null))) {
                        z2 = true;
                    } else {
                        i9++;
                    }
                }
                z2 = true;
                if (this.f42708Q.mo49432m() || this.f42712S.mo49432m()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f42710R.mo49432m() || this.f42714T.mo49432m()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z2 || (((i3 = this.f42787C1) != 0 || !z3) && ((i3 != 2 || !z4) && ((i3 != 1 || !z3) && (i3 != 3 || !z4))))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z5) {
                    i = 4;
                } else {
                    i = 5;
                }
                for (int i10 = 0; i10 < this.f43035B1; i10++) {
                    ConstraintWidget constraintWidget2 = this.f43034A1[i10];
                    if (this.f42788D1 || constraintWidget2.mo49550h()) {
                        SolverVariable u = eVar.mo48727u(constraintWidget2.f42720Y[this.f42787C1]);
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f42720Y;
                        int i11 = this.f42787C1;
                        ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i11];
                        constraintAnchor3.f42632i = u;
                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f42629f;
                        if (constraintAnchor4 == null || constraintAnchor4.f42627d != this) {
                            i2 = 0;
                        } else {
                            i2 = constraintAnchor3.f42630g + 0;
                        }
                        if (i11 == 0 || i11 == 2) {
                            eVar.mo48716j(constraintAnchor2.f42632i, u, this.f42789E1 - i2, z2);
                        } else {
                            eVar.mo48714h(constraintAnchor2.f42632i, u, this.f42789E1 + i2, z2);
                        }
                        eVar.mo48711e(constraintAnchor2.f42632i, u, this.f42789E1 + i2, i);
                    }
                }
                int i12 = this.f42787C1;
                if (i12 == 0) {
                    eVar.mo48711e(this.f42712S.f42632i, this.f42708Q.f42632i, 0, 8);
                    eVar.mo48711e(this.f42708Q.f42632i, this.f42727c0.f42712S.f42632i, 0, 4);
                    eVar.mo48711e(this.f42708Q.f42632i, this.f42727c0.f42708Q.f42632i, 0, 0);
                } else if (i12 == 1) {
                    eVar.mo48711e(this.f42708Q.f42632i, this.f42712S.f42632i, 0, 8);
                    eVar.mo48711e(this.f42708Q.f42632i, this.f42727c0.f42708Q.f42632i, 0, 4);
                    eVar.mo48711e(this.f42708Q.f42632i, this.f42727c0.f42712S.f42632i, 0, 0);
                } else if (i12 == 2) {
                    eVar.mo48711e(this.f42714T.f42632i, this.f42710R.f42632i, 0, 8);
                    eVar.mo48711e(this.f42710R.f42632i, this.f42727c0.f42714T.f42632i, 0, 4);
                    eVar.mo48711e(this.f42710R.f42632i, this.f42727c0.f42710R.f42632i, 0, 0);
                } else if (i12 == 3) {
                    eVar.mo48711e(this.f42710R.f42632i, this.f42714T.f42632i, 0, 8);
                    eVar.mo48711e(this.f42710R.f42632i, this.f42727c0.f42710R.f42632i, 0, 4);
                    eVar.mo48711e(this.f42710R.f42632i, this.f42727c0.f42714T.f42632i, 0, 0);
                }
            }
        }
    }

    /* renamed from: h */
    public boolean mo49550h() {
        return true;
    }

    /* renamed from: m2 */
    public boolean mo49611m2() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f43035B1;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.f43034A1[i4];
            if ((this.f42788D1 || constraintWidget.mo49550h()) && ((((i2 = this.f42787C1) == 0 || i2 == 1) && !constraintWidget.mo49466G0()) || (((i3 = this.f42787C1) == 2 || i3 == 3) && !constraintWidget.mo49469H0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f43035B1; i6++) {
            ConstraintWidget constraintWidget2 = this.f43034A1[i6];
            if (this.f42788D1 || constraintWidget2.mo49550h()) {
                if (!z2) {
                    int i7 = this.f42787C1;
                    if (i7 == 0) {
                        i5 = constraintWidget2.mo49583r(ConstraintAnchor.Type.LEFT).mo49425f();
                    } else if (i7 == 1) {
                        i5 = constraintWidget2.mo49583r(ConstraintAnchor.Type.RIGHT).mo49425f();
                    } else if (i7 == 2) {
                        i5 = constraintWidget2.mo49583r(ConstraintAnchor.Type.f42635c).mo49425f();
                    } else if (i7 == 3) {
                        i5 = constraintWidget2.mo49583r(ConstraintAnchor.Type.BOTTOM).mo49425f();
                    }
                    z2 = true;
                }
                int i8 = this.f42787C1;
                if (i8 == 0) {
                    i5 = Math.min(i5, constraintWidget2.mo49583r(ConstraintAnchor.Type.LEFT).mo49425f());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, constraintWidget2.mo49583r(ConstraintAnchor.Type.RIGHT).mo49425f());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, constraintWidget2.mo49583r(ConstraintAnchor.Type.f42635c).mo49425f());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, constraintWidget2.mo49583r(ConstraintAnchor.Type.BOTTOM).mo49425f());
                }
            }
        }
        int i9 = i5 + this.f42789E1;
        int i10 = this.f42787C1;
        if (i10 == 0 || i10 == 1) {
            mo49582q1(i9, i9);
        } else {
            mo49591t1(i9, i9);
        }
        this.f42790F1 = true;
        return true;
    }

    /* renamed from: n */
    public void mo49571n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo49571n(constraintWidget, hashMap);
        C16775a aVar = (C16775a) constraintWidget;
        this.f42787C1 = aVar.f42787C1;
        this.f42788D1 = aVar.f42788D1;
        this.f42789E1 = aVar.f42789E1;
    }

    @Deprecated
    /* renamed from: n2 */
    public boolean mo49612n2() {
        return this.f42788D1;
    }

    /* renamed from: o2 */
    public boolean mo49613o2() {
        return this.f42788D1;
    }

    /* renamed from: p2 */
    public int mo49614p2() {
        return this.f42787C1;
    }

    /* renamed from: q2 */
    public int mo49615q2() {
        return this.f42789E1;
    }

    /* renamed from: r2 */
    public int mo49616r2() {
        int i = this.f42787C1;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* renamed from: s2 */
    public void mo49617s2() {
        for (int i = 0; i < this.f43035B1; i++) {
            ConstraintWidget constraintWidget = this.f43034A1[i];
            if (this.f42788D1 || constraintWidget.mo49550h()) {
                int i2 = this.f42787C1;
                if (i2 == 0 || i2 == 1) {
                    constraintWidget.mo49467G1(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    constraintWidget.mo49467G1(1, true);
                }
            }
        }
    }

    /* renamed from: t2 */
    public void mo49618t2(boolean z) {
        this.f42788D1 = z;
    }

    public String toString() {
        String str = "[Barrier] " + mo49605y() + " {";
        for (int i = 0; i < this.f43035B1; i++) {
            ConstraintWidget constraintWidget = this.f43034A1[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.mo49605y();
        }
        return str + "}";
    }

    /* renamed from: u2 */
    public void mo49619u2(int i) {
        this.f42787C1 = i;
    }

    /* renamed from: v2 */
    public void mo49620v2(int i) {
        this.f42789E1 = i;
    }

    public C16775a(String str) {
        mo49560j1(str);
    }
}
