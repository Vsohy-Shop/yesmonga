package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C16643e;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.widgets.f */
public class C16801f extends ConstraintWidget {

    /* renamed from: I1 */
    public static final int f43019I1 = 0;

    /* renamed from: J1 */
    public static final int f43020J1 = 1;

    /* renamed from: K1 */
    public static final int f43021K1 = 0;

    /* renamed from: L1 */
    public static final int f43022L1 = 1;

    /* renamed from: M1 */
    public static final int f43023M1 = 2;

    /* renamed from: N1 */
    public static final int f43024N1 = -1;

    /* renamed from: A1 */
    public float f43025A1 = -1.0f;

    /* renamed from: B1 */
    public int f43026B1 = -1;

    /* renamed from: C1 */
    public int f43027C1 = -1;

    /* renamed from: D1 */
    public boolean f43028D1 = true;

    /* renamed from: E1 */
    public ConstraintAnchor f43029E1 = this.f42710R;

    /* renamed from: F1 */
    public int f43030F1;

    /* renamed from: G1 */
    public int f43031G1;

    /* renamed from: H1 */
    public boolean f43032H1;

    /* renamed from: androidx.constraintlayout.core.widgets.f$a */
    public static /* synthetic */ class C16802a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43033a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43033a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43033a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43033a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.f42635c     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43033a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f43033a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f43033a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f43033a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f43033a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f43033a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C16801f.C16802a.<clinit>():void");
        }
    }

    public C16801f() {
        this.f43030F1 = 0;
        this.f43031G1 = 0;
        this.f42721Z.clear();
        this.f42721Z.add(this.f43029E1);
        int length = this.f42720Y.length;
        for (int i = 0; i < length; i++) {
            this.f42720Y[i] = this.f43029E1;
        }
    }

    /* renamed from: A2 */
    public void mo49791A2(int i) {
        this.f43031G1 = i;
    }

    /* renamed from: B2 */
    public void mo49792B2(int i) {
        if (this.f43030F1 != i) {
            this.f43030F1 = i;
            this.f42721Z.clear();
            if (this.f43030F1 == 1) {
                this.f43029E1 = this.f42708Q;
            } else {
                this.f43029E1 = this.f42710R;
            }
            this.f42721Z.add(this.f43029E1);
            int length = this.f42720Y.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f42720Y[i2] = this.f43029E1;
            }
        }
    }

    /* renamed from: G0 */
    public boolean mo49466G0() {
        return this.f43032H1;
    }

    /* renamed from: H0 */
    public boolean mo49469H0() {
        return this.f43032H1;
    }

    /* renamed from: f0 */
    public String mo49543f0() {
        return "Guideline";
    }

    /* renamed from: g */
    public void mo49546g(C16643e eVar, boolean z) {
        boolean z2;
        C16798d dVar = (C16798d) mo49507U();
        if (dVar != null) {
            ConstraintAnchor r = dVar.mo49583r(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor r2 = dVar.mo49583r(ConstraintAnchor.Type.RIGHT);
            ConstraintWidget constraintWidget = this.f42727c0;
            boolean z3 = true;
            if (constraintWidget == null || constraintWidget.f42725b0[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f43030F1 == 0) {
                r = dVar.mo49583r(ConstraintAnchor.Type.f42635c);
                r2 = dVar.mo49583r(ConstraintAnchor.Type.BOTTOM);
                ConstraintWidget constraintWidget2 = this.f42727c0;
                if (constraintWidget2 == null || constraintWidget2.f42725b0[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z3 = false;
                }
                z2 = z3;
            }
            if (this.f43032H1 && this.f43029E1.mo49434o()) {
                SolverVariable u = eVar.mo48727u(this.f43029E1);
                eVar.mo48712f(u, this.f43029E1.mo49425f());
                if (this.f43026B1 != -1) {
                    if (z2) {
                        eVar.mo48715i(eVar.mo48727u(r2), u, 0, 5);
                    }
                } else if (this.f43027C1 != -1 && z2) {
                    SolverVariable u2 = eVar.mo48727u(r2);
                    eVar.mo48715i(u, eVar.mo48727u(r), 0, 5);
                    eVar.mo48715i(u2, u, 0, 5);
                }
                this.f43032H1 = false;
            } else if (this.f43026B1 != -1) {
                SolverVariable u3 = eVar.mo48727u(this.f43029E1);
                eVar.mo48711e(u3, eVar.mo48727u(r), this.f43026B1, 8);
                if (z2) {
                    eVar.mo48715i(eVar.mo48727u(r2), u3, 0, 5);
                }
            } else if (this.f43027C1 != -1) {
                SolverVariable u4 = eVar.mo48727u(this.f43029E1);
                SolverVariable u5 = eVar.mo48727u(r2);
                eVar.mo48711e(u4, u5, -this.f43027C1, 8);
                if (z2) {
                    eVar.mo48715i(u4, eVar.mo48727u(r), 0, 5);
                    eVar.mo48715i(u5, u4, 0, 5);
                }
            } else if (this.f43025A1 != -1.0f) {
                eVar.mo48710d(C16643e.m75762w(eVar, eVar.mo48727u(this.f43029E1), eVar.mo48727u(r2), this.f43025A1));
            }
        }
    }

    /* renamed from: h */
    public boolean mo49550h() {
        return true;
    }

    /* renamed from: j2 */
    public void mo49561j2(C16643e eVar, boolean z) {
        if (mo49507U() != null) {
            int O = eVar.mo48696O(this.f43029E1);
            if (this.f43030F1 == 1) {
                mo49545f2(O);
                mo49549g2(0);
                mo49607y1(mo49507U().mo49456D());
                mo49533c2(0);
                return;
            }
            mo49545f2(0);
            mo49549g2(O);
            mo49533c2(mo49507U().mo49569m0());
            mo49607y1(0);
        }
    }

    /* renamed from: k2 */
    public void mo49793k2() {
        if (this.f43026B1 != -1) {
            mo49802t2();
        } else if (this.f43025A1 != -1.0f) {
            mo49801s2();
        } else if (this.f43027C1 != -1) {
            mo49800r2();
        }
    }

    /* renamed from: l2 */
    public ConstraintAnchor mo49794l2() {
        return this.f43029E1;
    }

    /* renamed from: m2 */
    public int mo49795m2() {
        return this.f43030F1;
    }

    /* renamed from: n */
    public void mo49571n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo49571n(constraintWidget, hashMap);
        C16801f fVar = (C16801f) constraintWidget;
        this.f43025A1 = fVar.f43025A1;
        this.f43026B1 = fVar.f43026B1;
        this.f43027C1 = fVar.f43027C1;
        this.f43028D1 = fVar.f43028D1;
        mo49792B2(fVar.f43030F1);
    }

    /* renamed from: n2 */
    public int mo49796n2() {
        return this.f43026B1;
    }

    /* renamed from: o2 */
    public int mo49797o2() {
        if (this.f43025A1 != -1.0f) {
            return 0;
        }
        if (this.f43026B1 != -1) {
            return 1;
        }
        if (this.f43027C1 != -1) {
            return 2;
        }
        return -1;
    }

    /* renamed from: p2 */
    public int mo49798p2() {
        return this.f43027C1;
    }

    /* renamed from: q2 */
    public float mo49799q2() {
        return this.f43025A1;
    }

    /* renamed from: r */
    public ConstraintAnchor mo49583r(ConstraintAnchor.Type type) {
        int i = C16802a.f43033a[type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f43030F1 == 1) {
                return this.f43029E1;
            }
            return null;
        } else if ((i == 3 || i == 4) && this.f43030F1 == 0) {
            return this.f43029E1;
        } else {
            return null;
        }
    }

    /* renamed from: r2 */
    public void mo49800r2() {
        int o0 = mo49575o0();
        if (this.f43030F1 == 0) {
            o0 = mo49578p0();
        }
        mo49805w2(o0);
    }

    /* renamed from: s2 */
    public void mo49801s2() {
        int m0 = mo49507U().mo49569m0() - mo49575o0();
        if (this.f43030F1 == 0) {
            m0 = mo49507U().mo49456D() - mo49578p0();
        }
        mo49806x2(m0);
    }

    /* renamed from: t2 */
    public void mo49802t2() {
        float o0 = ((float) mo49575o0()) / ((float) mo49507U().mo49569m0());
        if (this.f43030F1 == 0) {
            o0 = ((float) mo49578p0()) / ((float) mo49507U().mo49456D());
        }
        mo49807y2(o0);
    }

    /* renamed from: u2 */
    public boolean mo49803u2() {
        return this.f43025A1 != -1.0f && this.f43026B1 == -1 && this.f43027C1 == -1;
    }

    /* renamed from: v2 */
    public void mo49804v2(int i) {
        this.f43029E1.mo49417A(i);
        this.f43032H1 = true;
    }

    /* renamed from: w2 */
    public void mo49805w2(int i) {
        if (i > -1) {
            this.f43025A1 = -1.0f;
            this.f43026B1 = i;
            this.f43027C1 = -1;
        }
    }

    /* renamed from: x2 */
    public void mo49806x2(int i) {
        if (i > -1) {
            this.f43025A1 = -1.0f;
            this.f43026B1 = -1;
            this.f43027C1 = i;
        }
    }

    /* renamed from: y2 */
    public void mo49807y2(float f) {
        if (f > -1.0f) {
            this.f43025A1 = f;
            this.f43026B1 = -1;
            this.f43027C1 = -1;
        }
    }

    /* renamed from: z2 */
    public void mo49808z2(int i) {
        mo49807y2(((float) i) / 100.0f);
    }
}
