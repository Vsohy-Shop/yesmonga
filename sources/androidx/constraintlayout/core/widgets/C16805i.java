package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C16643e;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* renamed from: androidx.constraintlayout.core.widgets.i */
public class C16805i {

    /* renamed from: a */
    public static final int f43036a = 0;

    /* renamed from: b */
    public static final int f43037b = 1;

    /* renamed from: c */
    public static final int f43038c = 2;

    /* renamed from: d */
    public static final int f43039d = 4;

    /* renamed from: e */
    public static final int f43040e = 8;

    /* renamed from: f */
    public static final int f43041f = 16;

    /* renamed from: g */
    public static final int f43042g = 32;

    /* renamed from: h */
    public static final int f43043h = 64;

    /* renamed from: i */
    public static final int f43044i = 128;

    /* renamed from: j */
    public static final int f43045j = 256;

    /* renamed from: k */
    public static final int f43046k = 512;

    /* renamed from: l */
    public static final int f43047l = 1024;

    /* renamed from: m */
    public static final int f43048m = 257;

    /* renamed from: n */
    public static boolean[] f43049n = new boolean[3];

    /* renamed from: o */
    public static final int f43050o = 0;

    /* renamed from: p */
    public static final int f43051p = 1;

    /* renamed from: q */
    public static final int f43052q = 2;

    /* renamed from: a */
    public static void m77234a(C16798d dVar, C16643e eVar, ConstraintWidget constraintWidget) {
        constraintWidget.f42760t = -1;
        constraintWidget.f42762u = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.f42725b0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f42725b0[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.f42708Q.f42630g;
            int m0 = dVar.mo49569m0() - constraintWidget.f42712S.f42630g;
            ConstraintAnchor constraintAnchor = constraintWidget.f42708Q;
            constraintAnchor.f42632i = eVar.mo48727u(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f42712S;
            constraintAnchor2.f42632i = eVar.mo48727u(constraintAnchor2);
            eVar.mo48712f(constraintWidget.f42708Q.f42632i, i);
            eVar.mo48712f(constraintWidget.f42712S.f42632i, m0);
            constraintWidget.f42760t = 2;
            constraintWidget.mo49455C1(i, m0);
        }
        if (dVar.f42725b0[1] != dimensionBehaviour2 && constraintWidget.f42725b0[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i2 = constraintWidget.f42710R.f42630g;
            int D = dVar.mo49456D() - constraintWidget.f42714T.f42630g;
            ConstraintAnchor constraintAnchor3 = constraintWidget.f42710R;
            constraintAnchor3.f42632i = eVar.mo48727u(constraintAnchor3);
            ConstraintAnchor constraintAnchor4 = constraintWidget.f42714T;
            constraintAnchor4.f42632i = eVar.mo48727u(constraintAnchor4);
            eVar.mo48712f(constraintWidget.f42710R.f42632i, i2);
            eVar.mo48712f(constraintWidget.f42714T.f42632i, D);
            if (constraintWidget.f42749n0 > 0 || constraintWidget.mo49566l0() == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.f42716U;
                constraintAnchor5.f42632i = eVar.mo48727u(constraintAnchor5);
                eVar.mo48712f(constraintWidget.f42716U.f42632i, constraintWidget.f42749n0 + i2);
            }
            constraintWidget.f42762u = 2;
            constraintWidget.mo49518X1(i2, D);
        }
    }

    /* renamed from: b */
    public static final boolean m77235b(int i, int i2) {
        return (i & i2) == i2;
    }
}
