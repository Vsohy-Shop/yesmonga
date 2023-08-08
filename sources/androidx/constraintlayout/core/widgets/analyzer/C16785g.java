package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C16775a;
import androidx.constraintlayout.core.widgets.C16798d;
import androidx.constraintlayout.core.widgets.C16801f;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.C16778b;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.g */
public class C16785g {

    /* renamed from: a */
    public static final boolean f42865a = false;

    /* renamed from: b */
    public static final boolean f42866b = false;

    /* renamed from: c */
    public static C16778b.C16779a f42867c = new C16778b.C16779a();

    /* renamed from: d */
    public static final boolean f42868d = true;

    /* renamed from: e */
    public static int f42869e = 0;

    /* renamed from: f */
    public static int f42870f = 0;

    /* renamed from: a */
    public static boolean m77018a(int i, ConstraintWidget constraintWidget) {
        C16798d dVar;
        boolean z;
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour H = constraintWidget.mo49468H();
        ConstraintWidget.DimensionBehaviour j0 = constraintWidget.mo49559j0();
        if (constraintWidget.mo49507U() != null) {
            dVar = (C16798d) constraintWidget.mo49507U();
        } else {
            dVar = null;
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour H2 = dVar.mo49468H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour j02 = dVar.mo49559j0();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (H == dimensionBehaviour5 || constraintWidget.mo49466G0() || H == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || ((H == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f42766w == 0 && constraintWidget.f42733f0 == 0.0f && constraintWidget.mo49584r0(0)) || (H == dimensionBehaviour2 && constraintWidget.f42766w == 1 && constraintWidget.mo49594u0(0, constraintWidget.mo49569m0())))) {
            z = true;
        } else {
            z = false;
        }
        if (j0 == dimensionBehaviour5 || constraintWidget.mo49469H0() || j0 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || ((j0 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f42768x == 0 && constraintWidget.f42733f0 == 0.0f && constraintWidget.mo49584r0(1)) || (j0 == dimensionBehaviour && constraintWidget.f42768x == 1 && constraintWidget.mo49594u0(1, constraintWidget.mo49456D())))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (constraintWidget.f42733f0 > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m77019b(int i, ConstraintWidget constraintWidget, C16778b.C16780b bVar, boolean z) {
        boolean z2;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        boolean z3;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintWidget constraintWidget2 = constraintWidget;
        C16778b.C16780b bVar2 = bVar;
        boolean z4 = z;
        if (!constraintWidget.mo49609z0()) {
            boolean z5 = true;
            f42869e++;
            if (!(constraintWidget2 instanceof C16798d) && constraintWidget.mo49463F0()) {
                int i2 = i + 1;
                if (m77018a(i2, constraintWidget2)) {
                    C16798d.m77097R2(i2, constraintWidget2, bVar2, new C16778b.C16779a(), C16778b.C16779a.f42839k);
                }
            }
            ConstraintAnchor r = constraintWidget2.mo49583r(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor r2 = constraintWidget2.mo49583r(ConstraintAnchor.Type.RIGHT);
            int f = r.mo49425f();
            int f2 = r2.mo49425f();
            if (r.mo49424e() != null && r.mo49434o()) {
                Iterator<ConstraintAnchor> it = r.mo49424e().iterator();
                while (it.hasNext()) {
                    ConstraintAnchor next = it.next();
                    ConstraintWidget constraintWidget3 = next.f42627d;
                    int i3 = i + 1;
                    boolean a = m77018a(i3, constraintWidget3);
                    if (constraintWidget3.mo49463F0() && a) {
                        C16798d.m77097R2(i3, constraintWidget3, bVar2, new C16778b.C16779a(), C16778b.C16779a.f42839k);
                    }
                    if ((next != constraintWidget3.f42708Q || (constraintAnchor4 = constraintWidget3.f42712S.f42629f) == null || !constraintAnchor4.mo49434o()) && (next != constraintWidget3.f42712S || (constraintAnchor3 = constraintWidget3.f42708Q.f42629f) == null || !constraintAnchor3.mo49434o())) {
                        z3 = false;
                    } else {
                        z3 = z5;
                    }
                    ConstraintWidget.DimensionBehaviour H = constraintWidget3.mo49468H();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (H != dimensionBehaviour || a) {
                        if (!constraintWidget3.mo49463F0()) {
                            ConstraintAnchor constraintAnchor5 = constraintWidget3.f42708Q;
                            if (next == constraintAnchor5 && constraintWidget3.f42712S.f42629f == null) {
                                int g = constraintAnchor5.mo49426g() + f;
                                constraintWidget3.mo49582q1(g, constraintWidget3.mo49569m0() + g);
                                m77019b(i3, constraintWidget3, bVar2, z4);
                            } else {
                                ConstraintAnchor constraintAnchor6 = constraintWidget3.f42712S;
                                if (next == constraintAnchor6 && constraintAnchor5.f42629f == null) {
                                    int g2 = f - constraintAnchor6.mo49426g();
                                    constraintWidget3.mo49582q1(g2 - constraintWidget3.mo49569m0(), g2);
                                    m77019b(i3, constraintWidget3, bVar2, z4);
                                } else if (z3 && !constraintWidget3.mo49451B0()) {
                                    m77023f(i3, bVar2, constraintWidget3, z4);
                                }
                            }
                        }
                    } else if (constraintWidget3.mo49468H() == dimensionBehaviour && constraintWidget3.f42676A >= 0 && constraintWidget3.f42772z >= 0 && ((constraintWidget3.mo49566l0() == 8 || (constraintWidget3.f42766w == 0 && constraintWidget3.mo49447A() == 0.0f)) && !constraintWidget3.mo49451B0() && !constraintWidget3.mo49460E0() && z3 && !constraintWidget3.mo49451B0())) {
                        m77024g(i3, constraintWidget2, bVar2, constraintWidget3, z4);
                    }
                    z5 = true;
                }
            }
            if (!(constraintWidget2 instanceof C16801f)) {
                if (r2.mo49424e() != null && r2.mo49434o()) {
                    Iterator<ConstraintAnchor> it2 = r2.mo49424e().iterator();
                    while (it2.hasNext()) {
                        ConstraintAnchor next2 = it2.next();
                        ConstraintWidget constraintWidget4 = next2.f42627d;
                        int i4 = i + 1;
                        boolean a2 = m77018a(i4, constraintWidget4);
                        if (constraintWidget4.mo49463F0() && a2) {
                            C16798d.m77097R2(i4, constraintWidget4, bVar2, new C16778b.C16779a(), C16778b.C16779a.f42839k);
                        }
                        if ((next2 != constraintWidget4.f42708Q || (constraintAnchor2 = constraintWidget4.f42712S.f42629f) == null || !constraintAnchor2.mo49434o()) && (next2 != constraintWidget4.f42712S || (constraintAnchor = constraintWidget4.f42708Q.f42629f) == null || !constraintAnchor.mo49434o())) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        ConstraintWidget.DimensionBehaviour H2 = constraintWidget4.mo49468H();
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (H2 != dimensionBehaviour2 || a2) {
                            if (!constraintWidget4.mo49463F0()) {
                                ConstraintAnchor constraintAnchor7 = constraintWidget4.f42708Q;
                                if (next2 == constraintAnchor7 && constraintWidget4.f42712S.f42629f == null) {
                                    int g3 = constraintAnchor7.mo49426g() + f2;
                                    constraintWidget4.mo49582q1(g3, constraintWidget4.mo49569m0() + g3);
                                    m77019b(i4, constraintWidget4, bVar2, z4);
                                } else {
                                    ConstraintAnchor constraintAnchor8 = constraintWidget4.f42712S;
                                    if (next2 == constraintAnchor8 && constraintAnchor7.f42629f == null) {
                                        int g4 = f2 - constraintAnchor8.mo49426g();
                                        constraintWidget4.mo49582q1(g4 - constraintWidget4.mo49569m0(), g4);
                                        m77019b(i4, constraintWidget4, bVar2, z4);
                                    } else if (z2 && !constraintWidget4.mo49451B0()) {
                                        m77023f(i4, bVar2, constraintWidget4, z4);
                                    }
                                }
                            }
                        } else if (constraintWidget4.mo49468H() == dimensionBehaviour2 && constraintWidget4.f42676A >= 0 && constraintWidget4.f42772z >= 0) {
                            if ((constraintWidget4.mo49566l0() == 8 || (constraintWidget4.f42766w == 0 && constraintWidget4.mo49447A() == 0.0f)) && !constraintWidget4.mo49451B0() && !constraintWidget4.mo49460E0() && z2 && !constraintWidget4.mo49451B0()) {
                                m77024g(i4, constraintWidget2, bVar2, constraintWidget4, z4);
                            }
                        }
                    }
                }
                constraintWidget.mo49487N0();
            }
        }
    }

    /* renamed from: c */
    public static String m77020c(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(GlideException.C22148a.f56917d);
        }
        sb.append("+-(" + i + ") ");
        return sb.toString();
    }

    /* renamed from: d */
    public static void m77021d(int i, C16775a aVar, C16778b.C16780b bVar, int i2, boolean z) {
        if (!aVar.mo49611m2()) {
            return;
        }
        if (i2 == 0) {
            m77019b(i + 1, aVar, bVar, z);
        } else {
            m77028k(i + 1, aVar, bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        r7 = r7.f42629f.mo49425f() + r4.f42720Y[r23].mo49426g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d1, code lost:
        if (r6.f42627d == r0) goto L_0x01d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m77022e(androidx.constraintlayout.core.widgets.C16798d r20, androidx.constraintlayout.core.C16643e r21, int r22, int r23, androidx.constraintlayout.core.widgets.C16797c r24, boolean r25, boolean r26, boolean r27) {
        /*
            r0 = 0
            if (r27 == 0) goto L_0x0004
            return r0
        L_0x0004:
            if (r22 != 0) goto L_0x000d
            boolean r1 = r20.mo49466G0()
            if (r1 != 0) goto L_0x0014
            return r0
        L_0x000d:
            boolean r1 = r20.mo49469H0()
            if (r1 != 0) goto L_0x0014
            return r0
        L_0x0014:
            boolean r1 = r20.mo49731O2()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r24.mo49709c()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r24.mo49713g()
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r24.mo49711e()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r24.mo49715i()
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r24.mo49712f()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r2.f42720Y
            r7 = r7[r23]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.f42720Y
            int r8 = r23 + 1
            r3 = r3[r8]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r7.f42629f
            if (r9 == 0) goto L_0x0229
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f42629f
            if (r10 != 0) goto L_0x0040
            goto L_0x0229
        L_0x0040:
            boolean r9 = r9.mo49434o()
            if (r9 == 0) goto L_0x0229
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r3.f42629f
            boolean r9 = r9.mo49434o()
            if (r9 != 0) goto L_0x0050
            goto L_0x0229
        L_0x0050:
            if (r4 == 0) goto L_0x0229
            if (r5 != 0) goto L_0x0056
            goto L_0x0229
        L_0x0056:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.f42629f
            int r7 = r7.mo49425f()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r9 = r4.f42720Y
            r9 = r9[r23]
            int r9 = r9.mo49426g()
            int r7 = r7 + r9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f42629f
            int r3 = r3.mo49425f()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r9 = r5.f42720Y
            r9 = r9[r8]
            int r9 = r9.mo49426g()
            int r3 = r3 - r9
            int r9 = r3 - r7
            if (r9 > 0) goto L_0x0079
            return r0
        L_0x0079:
            androidx.constraintlayout.core.widgets.analyzer.b$a r10 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r10.<init>()
            r11 = r0
            r12 = r11
            r14 = r12
            r15 = r14
            r13 = r2
        L_0x0083:
            r17 = 0
            r0 = 1
            if (r11 != 0) goto L_0x0101
            boolean r18 = m77018a(r0, r13)
            if (r18 != 0) goto L_0x0091
            r16 = 0
            return r16
        L_0x0091:
            r16 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r13.f42725b0
            r0 = r0[r22]
            r18 = r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x009e
            return r16
        L_0x009e:
            boolean r0 = r13.mo49463F0()
            if (r0 == 0) goto L_0x00b1
            androidx.constraintlayout.core.widgets.analyzer.b$b r0 = r20.mo49723G2()
            int r2 = androidx.constraintlayout.core.widgets.analyzer.C16778b.C16779a.f42839k
            r19 = r11
            r11 = 1
            androidx.constraintlayout.core.widgets.C16798d.m77097R2(r11, r13, r0, r10, r2)
            goto L_0x00b3
        L_0x00b1:
            r19 = r11
        L_0x00b3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.f42720Y
            r0 = r0[r23]
            int r0 = r0.mo49426g()
            int r15 = r15 + r0
            if (r22 != 0) goto L_0x00c3
            int r0 = r13.mo49569m0()
            goto L_0x00c7
        L_0x00c3:
            int r0 = r13.mo49456D()
        L_0x00c7:
            int r15 = r15 + r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.f42720Y
            r0 = r0[r8]
            int r0 = r0.mo49426g()
            int r15 = r15 + r0
            int r14 = r14 + 1
            int r0 = r13.mo49566l0()
            r2 = 8
            if (r0 == r2) goto L_0x00dd
            int r12 = r12 + 1
        L_0x00dd:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.f42720Y
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42629f
            if (r0 == 0) goto L_0x00f6
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.f42627d
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r0.f42720Y
            r2 = r2[r23]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f42629f
            if (r2 == 0) goto L_0x00f6
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.f42627d
            if (r2 == r13) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r17 = r0
        L_0x00f6:
            if (r17 == 0) goto L_0x00fd
            r13 = r17
            r11 = r19
            goto L_0x00fe
        L_0x00fd:
            r11 = 1
        L_0x00fe:
            r2 = r18
            goto L_0x0083
        L_0x0101:
            r18 = r2
            if (r12 != 0) goto L_0x0107
            r0 = 0
            return r0
        L_0x0107:
            r0 = 0
            if (r12 == r14) goto L_0x010b
            return r0
        L_0x010b:
            if (r9 >= r15) goto L_0x010e
            return r0
        L_0x010e:
            int r9 = r9 - r15
            r0 = 2
            if (r25 == 0) goto L_0x0117
            int r2 = r12 + 1
            int r9 = r9 / r2
        L_0x0115:
            r2 = 1
            goto L_0x011e
        L_0x0117:
            if (r26 == 0) goto L_0x0115
            if (r12 <= r0) goto L_0x0115
            int r9 = r9 / r12
            r2 = 1
            int r9 = r9 - r2
        L_0x011e:
            if (r12 != r2) goto L_0x014f
            if (r22 != 0) goto L_0x0127
            float r0 = r6.mo49459E()
            goto L_0x012b
        L_0x0127:
            float r0 = r6.mo49547g0()
        L_0x012b:
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = (float) r7
            float r3 = r3 + r2
            float r2 = (float) r9
            float r2 = r2 * r0
            float r3 = r3 + r2
            int r0 = (int) r3
            if (r22 != 0) goto L_0x013e
            int r2 = r4.mo49569m0()
            int r2 = r2 + r0
            r4.mo49582q1(r0, r2)
            goto L_0x0146
        L_0x013e:
            int r2 = r4.mo49456D()
            int r2 = r2 + r0
            r4.mo49591t1(r0, r2)
        L_0x0146:
            androidx.constraintlayout.core.widgets.analyzer.b$b r0 = r20.mo49723G2()
            r2 = 1
            m77019b(r2, r4, r0, r1)
            return r2
        L_0x014f:
            if (r25 == 0) goto L_0x01dd
            int r7 = r7 + r9
            r0 = r18
            r3 = 0
        L_0x0155:
            if (r3 != 0) goto L_0x0228
            int r4 = r0.mo49566l0()
            r5 = 8
            if (r4 != r5) goto L_0x017a
            if (r22 != 0) goto L_0x016c
            r0.mo49582q1(r7, r7)
            androidx.constraintlayout.core.widgets.analyzer.b$b r4 = r20.mo49723G2()
            m77019b(r2, r0, r4, r1)
            goto L_0x0176
        L_0x016c:
            r0.mo49591t1(r7, r7)
            androidx.constraintlayout.core.widgets.analyzer.b$b r4 = r20.mo49723G2()
            m77028k(r2, r0, r4)
        L_0x0176:
            r2 = r21
            r4 = 0
            goto L_0x01ba
        L_0x017a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r0.f42720Y
            r2 = r2[r23]
            int r2 = r2.mo49426g()
            int r7 = r7 + r2
            if (r22 != 0) goto L_0x019a
            int r2 = r0.mo49569m0()
            int r2 = r2 + r7
            r0.mo49582q1(r7, r2)
            androidx.constraintlayout.core.widgets.analyzer.b$b r2 = r20.mo49723G2()
            r4 = 1
            m77019b(r4, r0, r2, r1)
            int r2 = r0.mo49569m0()
            goto L_0x01ae
        L_0x019a:
            r4 = 1
            int r2 = r0.mo49456D()
            int r2 = r2 + r7
            r0.mo49591t1(r7, r2)
            androidx.constraintlayout.core.widgets.analyzer.b$b r2 = r20.mo49723G2()
            m77028k(r4, r0, r2)
            int r2 = r0.mo49456D()
        L_0x01ae:
            int r7 = r7 + r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r0.f42720Y
            r2 = r2[r8]
            int r2 = r2.mo49426g()
            int r7 = r7 + r2
            int r7 = r7 + r9
            goto L_0x0176
        L_0x01ba:
            r0.mo49546g(r2, r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r0.f42720Y
            r4 = r4[r8]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f42629f
            if (r4 == 0) goto L_0x01d3
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.f42627d
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r4.f42720Y
            r6 = r6[r23]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.f42629f
            if (r6 == 0) goto L_0x01d3
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.f42627d
            if (r6 == r0) goto L_0x01d5
        L_0x01d3:
            r4 = r17
        L_0x01d5:
            if (r4 == 0) goto L_0x01d9
            r0 = r4
            goto L_0x01da
        L_0x01d9:
            r3 = 1
        L_0x01da:
            r2 = 1
            goto L_0x0155
        L_0x01dd:
            if (r26 == 0) goto L_0x0227
            if (r12 != r0) goto L_0x0225
            if (r22 != 0) goto L_0x0204
            int r0 = r4.mo49569m0()
            int r0 = r0 + r7
            r4.mo49582q1(r7, r0)
            int r0 = r5.mo49569m0()
            int r0 = r3 - r0
            r5.mo49582q1(r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.b$b r0 = r20.mo49723G2()
            r2 = 1
            m77019b(r2, r4, r0, r1)
            androidx.constraintlayout.core.widgets.analyzer.b$b r0 = r20.mo49723G2()
            m77019b(r2, r5, r0, r1)
            goto L_0x0224
        L_0x0204:
            r2 = 1
            int r0 = r4.mo49456D()
            int r0 = r0 + r7
            r4.mo49591t1(r7, r0)
            int r0 = r5.mo49456D()
            int r0 = r3 - r0
            r5.mo49591t1(r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.b$b r0 = r20.mo49723G2()
            m77028k(r2, r4, r0)
            androidx.constraintlayout.core.widgets.analyzer.b$b r0 = r20.mo49723G2()
            m77028k(r2, r5, r0)
        L_0x0224:
            return r2
        L_0x0225:
            r0 = 0
            return r0
        L_0x0227:
            r2 = 1
        L_0x0228:
            return r2
        L_0x0229:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C16785g.m77022e(androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.e, int, int, androidx.constraintlayout.core.widgets.c, boolean, boolean, boolean):boolean");
    }

    /* renamed from: f */
    public static void m77023f(int i, C16778b.C16780b bVar, ConstraintWidget constraintWidget, boolean z) {
        float f;
        float E = constraintWidget.mo49459E();
        int f2 = constraintWidget.f42708Q.f42629f.mo49425f();
        int f3 = constraintWidget.f42712S.f42629f.mo49425f();
        int g = constraintWidget.f42708Q.mo49426g() + f2;
        int g2 = f3 - constraintWidget.f42712S.mo49426g();
        if (f2 == f3) {
            E = 0.5f;
        } else {
            f2 = g;
            f3 = g2;
        }
        int m0 = constraintWidget.mo49569m0();
        int i2 = (f3 - f2) - m0;
        if (f2 > f3) {
            i2 = (f2 - f3) - m0;
        }
        if (i2 > 0) {
            f = (E * ((float) i2)) + 0.5f;
        } else {
            f = E * ((float) i2);
        }
        int i3 = ((int) f) + f2;
        int i4 = i3 + m0;
        if (f2 > f3) {
            i4 = i3 - m0;
        }
        constraintWidget.mo49582q1(i3, i4);
        m77019b(i + 1, constraintWidget, bVar, z);
    }

    /* renamed from: g */
    public static void m77024g(int i, ConstraintWidget constraintWidget, C16778b.C16780b bVar, ConstraintWidget constraintWidget2, boolean z) {
        int i2;
        float E = constraintWidget2.mo49459E();
        int f = constraintWidget2.f42708Q.f42629f.mo49425f() + constraintWidget2.f42708Q.mo49426g();
        int f2 = constraintWidget2.f42712S.f42629f.mo49425f() - constraintWidget2.f42712S.mo49426g();
        if (f2 >= f) {
            int m0 = constraintWidget2.mo49569m0();
            if (constraintWidget2.mo49566l0() != 8) {
                int i3 = constraintWidget2.f42766w;
                if (i3 == 2) {
                    if (constraintWidget instanceof C16798d) {
                        i2 = constraintWidget.mo49569m0();
                    } else {
                        i2 = constraintWidget.mo49507U().mo49569m0();
                    }
                    m0 = (int) (constraintWidget2.mo49459E() * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    m0 = f2 - f;
                }
                m0 = Math.max(constraintWidget2.f42772z, m0);
                int i4 = constraintWidget2.f42676A;
                if (i4 > 0) {
                    m0 = Math.min(i4, m0);
                }
            }
            int i5 = f + ((int) ((E * ((float) ((f2 - f) - m0))) + 0.5f));
            constraintWidget2.mo49582q1(i5, m0 + i5);
            m77019b(i + 1, constraintWidget2, bVar, z);
        }
    }

    /* renamed from: h */
    public static void m77025h(int i, C16778b.C16780b bVar, ConstraintWidget constraintWidget) {
        float f;
        float g0 = constraintWidget.mo49547g0();
        int f2 = constraintWidget.f42710R.f42629f.mo49425f();
        int f3 = constraintWidget.f42714T.f42629f.mo49425f();
        int g = constraintWidget.f42710R.mo49426g() + f2;
        int g2 = f3 - constraintWidget.f42714T.mo49426g();
        if (f2 == f3) {
            g0 = 0.5f;
        } else {
            f2 = g;
            f3 = g2;
        }
        int D = constraintWidget.mo49456D();
        int i2 = (f3 - f2) - D;
        if (f2 > f3) {
            i2 = (f2 - f3) - D;
        }
        if (i2 > 0) {
            f = (g0 * ((float) i2)) + 0.5f;
        } else {
            f = g0 * ((float) i2);
        }
        int i3 = (int) f;
        int i4 = f2 + i3;
        int i5 = i4 + D;
        if (f2 > f3) {
            i4 = f2 - i3;
            i5 = i4 - D;
        }
        constraintWidget.mo49591t1(i4, i5);
        m77028k(i + 1, constraintWidget, bVar);
    }

    /* renamed from: i */
    public static void m77026i(int i, ConstraintWidget constraintWidget, C16778b.C16780b bVar, ConstraintWidget constraintWidget2) {
        int i2;
        float g0 = constraintWidget2.mo49547g0();
        int f = constraintWidget2.f42710R.f42629f.mo49425f() + constraintWidget2.f42710R.mo49426g();
        int f2 = constraintWidget2.f42714T.f42629f.mo49425f() - constraintWidget2.f42714T.mo49426g();
        if (f2 >= f) {
            int D = constraintWidget2.mo49456D();
            if (constraintWidget2.mo49566l0() != 8) {
                int i3 = constraintWidget2.f42768x;
                if (i3 == 2) {
                    if (constraintWidget instanceof C16798d) {
                        i2 = constraintWidget.mo49456D();
                    } else {
                        i2 = constraintWidget.mo49507U().mo49456D();
                    }
                    D = (int) (g0 * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    D = f2 - f;
                }
                D = Math.max(constraintWidget2.f42680C, D);
                int i4 = constraintWidget2.f42682D;
                if (i4 > 0) {
                    D = Math.min(i4, D);
                }
            }
            int i5 = f + ((int) ((g0 * ((float) ((f2 - f) - D))) + 0.5f));
            constraintWidget2.mo49591t1(i5, D + i5);
            m77028k(i + 1, constraintWidget2, bVar);
        }
    }

    /* renamed from: j */
    public static void m77027j(C16798d dVar, C16778b.C16780b bVar) {
        ConstraintWidget.DimensionBehaviour H = dVar.mo49468H();
        ConstraintWidget.DimensionBehaviour j0 = dVar.mo49559j0();
        f42869e = 0;
        f42870f = 0;
        dVar.mo49511V0();
        ArrayList<ConstraintWidget> l2 = dVar.mo49843l2();
        int size = l2.size();
        for (int i = 0; i < size; i++) {
            l2.get(i).mo49511V0();
        }
        boolean O2 = dVar.mo49731O2();
        if (H == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.mo49582q1(0, dVar.mo49569m0());
        } else {
            dVar.mo49585r1(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = l2.get(i2);
            if (constraintWidget instanceof C16801f) {
                C16801f fVar = (C16801f) constraintWidget;
                if (fVar.mo49795m2() == 1) {
                    if (fVar.mo49796n2() != -1) {
                        fVar.mo49804v2(fVar.mo49796n2());
                    } else if (fVar.mo49798p2() != -1 && dVar.mo49466G0()) {
                        fVar.mo49804v2(dVar.mo49569m0() - fVar.mo49798p2());
                    } else if (dVar.mo49466G0()) {
                        fVar.mo49804v2((int) ((fVar.mo49799q2() * ((float) dVar.mo49569m0())) + 0.5f));
                    }
                    z = true;
                }
            } else if ((constraintWidget instanceof C16775a) && ((C16775a) constraintWidget).mo49616r2() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = l2.get(i3);
                if (constraintWidget2 instanceof C16801f) {
                    C16801f fVar2 = (C16801f) constraintWidget2;
                    if (fVar2.mo49795m2() == 1) {
                        m77019b(0, fVar2, bVar, O2);
                    }
                }
            }
        }
        m77019b(0, dVar, bVar, O2);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget3 = l2.get(i4);
                if (constraintWidget3 instanceof C16775a) {
                    C16775a aVar = (C16775a) constraintWidget3;
                    if (aVar.mo49616r2() == 0) {
                        m77021d(0, aVar, bVar, 0, O2);
                    }
                }
            }
        }
        if (j0 == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.mo49591t1(0, dVar.mo49456D());
        } else {
            dVar.mo49588s1(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = l2.get(i5);
            if (constraintWidget4 instanceof C16801f) {
                C16801f fVar3 = (C16801f) constraintWidget4;
                if (fVar3.mo49795m2() == 0) {
                    if (fVar3.mo49796n2() != -1) {
                        fVar3.mo49804v2(fVar3.mo49796n2());
                    } else if (fVar3.mo49798p2() != -1 && dVar.mo49469H0()) {
                        fVar3.mo49804v2(dVar.mo49456D() - fVar3.mo49798p2());
                    } else if (dVar.mo49469H0()) {
                        fVar3.mo49804v2((int) ((fVar3.mo49799q2() * ((float) dVar.mo49456D())) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((constraintWidget4 instanceof C16775a) && ((C16775a) constraintWidget4).mo49616r2() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = l2.get(i6);
                if (constraintWidget5 instanceof C16801f) {
                    C16801f fVar4 = (C16801f) constraintWidget5;
                    if (fVar4.mo49795m2() == 0) {
                        m77028k(1, fVar4, bVar);
                    }
                }
            }
        }
        m77028k(0, dVar, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget6 = l2.get(i7);
                if (constraintWidget6 instanceof C16775a) {
                    C16775a aVar2 = (C16775a) constraintWidget6;
                    if (aVar2.mo49616r2() == 1) {
                        m77021d(0, aVar2, bVar, 1, O2);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget7 = l2.get(i8);
            if (constraintWidget7.mo49463F0() && m77018a(0, constraintWidget7)) {
                C16798d.m77097R2(0, constraintWidget7, bVar, f42867c, C16778b.C16779a.f42839k);
                if (!(constraintWidget7 instanceof C16801f)) {
                    m77019b(0, constraintWidget7, bVar, O2);
                    m77028k(0, constraintWidget7, bVar);
                } else if (((C16801f) constraintWidget7).mo49795m2() == 0) {
                    m77028k(0, constraintWidget7, bVar);
                } else {
                    m77019b(0, constraintWidget7, bVar, O2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        r14 = r11.f42714T.f42629f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r14 = r11.f42710R.f42629f;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m77028k(int r16, androidx.constraintlayout.core.widgets.ConstraintWidget r17, androidx.constraintlayout.core.widgets.analyzer.C16778b.C16780b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r17.mo49481L0()
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            int r2 = f42870f
            r3 = 1
            int r2 = r2 + r3
            f42870f = r2
            boolean r2 = r0 instanceof androidx.constraintlayout.core.widgets.C16798d
            if (r2 != 0) goto L_0x002d
            boolean r2 = r17.mo49463F0()
            if (r2 == 0) goto L_0x002d
            int r2 = r16 + 1
            boolean r4 = m77018a(r2, r0)
            if (r4 == 0) goto L_0x002d
            androidx.constraintlayout.core.widgets.analyzer.b$a r4 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r4.<init>()
            int r5 = androidx.constraintlayout.core.widgets.analyzer.C16778b.C16779a.f42839k
            androidx.constraintlayout.core.widgets.C16798d.m77097R2(r2, r0, r1, r4, r5)
        L_0x002d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.f42635c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mo49583r(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo49583r(r4)
            int r5 = r2.mo49425f()
            int r6 = r4.mo49425f()
            java.util.HashSet r7 = r2.mo49424e()
            r8 = 0
            r9 = 8
            if (r7 == 0) goto L_0x0132
            boolean r7 = r2.mo49434o()
            if (r7 == 0) goto L_0x0132
            java.util.HashSet r2 = r2.mo49424e()
            java.util.Iterator r2 = r2.iterator()
        L_0x0058:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0132
            java.lang.Object r7 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r7.f42627d
            int r12 = r16 + 1
            boolean r13 = m77018a(r12, r11)
            boolean r14 = r11.mo49463F0()
            if (r14 == 0) goto L_0x007e
            if (r13 == 0) goto L_0x007e
            androidx.constraintlayout.core.widgets.analyzer.b$a r14 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r14.<init>()
            int r15 = androidx.constraintlayout.core.widgets.analyzer.C16778b.C16779a.f42839k
            androidx.constraintlayout.core.widgets.C16798d.m77097R2(r12, r11, r1, r14, r15)
        L_0x007e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.f42710R
            if (r7 != r14) goto L_0x008e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.f42714T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f42629f
            if (r14 == 0) goto L_0x008e
            boolean r14 = r14.mo49434o()
            if (r14 != 0) goto L_0x009e
        L_0x008e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.f42714T
            if (r7 != r14) goto L_0x00a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.f42710R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f42629f
            if (r14 == 0) goto L_0x00a0
            boolean r14 = r14.mo49434o()
            if (r14 == 0) goto L_0x00a0
        L_0x009e:
            r14 = r3
            goto L_0x00a1
        L_0x00a0:
            r14 = 0
        L_0x00a1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r11.mo49559j0()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r10) goto L_0x00e5
            if (r13 == 0) goto L_0x00ac
            goto L_0x00e5
        L_0x00ac:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r11.mo49559j0()
            if (r7 != r10) goto L_0x0058
            int r7 = r11.f42682D
            if (r7 < 0) goto L_0x0058
            int r7 = r11.f42680C
            if (r7 < 0) goto L_0x0058
            int r7 = r11.mo49566l0()
            if (r7 == r9) goto L_0x00cc
            int r7 = r11.f42768x
            if (r7 != 0) goto L_0x0058
            float r7 = r11.mo49447A()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0058
        L_0x00cc:
            boolean r7 = r11.mo49457D0()
            if (r7 != 0) goto L_0x0058
            boolean r7 = r11.mo49460E0()
            if (r7 != 0) goto L_0x0058
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.mo49457D0()
            if (r7 != 0) goto L_0x0058
            m77026i(r12, r0, r1, r11)
            goto L_0x0058
        L_0x00e5:
            boolean r10 = r11.mo49463F0()
            if (r10 == 0) goto L_0x00ed
            goto L_0x0058
        L_0x00ed:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r11.f42710R
            if (r7 != r10) goto L_0x0109
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r11.f42714T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r13.f42629f
            if (r13 != 0) goto L_0x0109
            int r7 = r10.mo49426g()
            int r7 = r7 + r5
            int r10 = r11.mo49456D()
            int r10 = r10 + r7
            r11.mo49591t1(r7, r10)
            m77028k(r12, r11, r1)
            goto L_0x0058
        L_0x0109:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r11.f42714T
            if (r7 != r13) goto L_0x0125
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r10.f42629f
            if (r7 != 0) goto L_0x0125
            int r7 = r13.mo49426g()
            int r7 = r5 - r7
            int r10 = r11.mo49456D()
            int r10 = r7 - r10
            r11.mo49591t1(r10, r7)
            m77028k(r12, r11, r1)
            goto L_0x0058
        L_0x0125:
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.mo49457D0()
            if (r7 != 0) goto L_0x0058
            m77025h(r12, r1, r11)
            goto L_0x0058
        L_0x0132:
            boolean r2 = r0 instanceof androidx.constraintlayout.core.widgets.C16801f
            if (r2 == 0) goto L_0x0137
            return
        L_0x0137:
            java.util.HashSet r2 = r4.mo49424e()
            if (r2 == 0) goto L_0x0225
            boolean r2 = r4.mo49434o()
            if (r2 == 0) goto L_0x0225
            java.util.HashSet r2 = r4.mo49424e()
            java.util.Iterator r2 = r2.iterator()
        L_0x014b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0225
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r4.f42627d
            int r7 = r16 + 1
            boolean r10 = m77018a(r7, r5)
            boolean r11 = r5.mo49463F0()
            if (r11 == 0) goto L_0x0171
            if (r10 == 0) goto L_0x0171
            androidx.constraintlayout.core.widgets.analyzer.b$a r11 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r11.<init>()
            int r12 = androidx.constraintlayout.core.widgets.analyzer.C16778b.C16779a.f42839k
            androidx.constraintlayout.core.widgets.C16798d.m77097R2(r7, r5, r1, r11, r12)
        L_0x0171:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.f42710R
            if (r4 != r11) goto L_0x0181
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.f42714T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.f42629f
            if (r11 == 0) goto L_0x0181
            boolean r11 = r11.mo49434o()
            if (r11 != 0) goto L_0x0191
        L_0x0181:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.f42714T
            if (r4 != r11) goto L_0x0193
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.f42710R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.f42629f
            if (r11 == 0) goto L_0x0193
            boolean r11 = r11.mo49434o()
            if (r11 == 0) goto L_0x0193
        L_0x0191:
            r11 = r3
            goto L_0x0194
        L_0x0193:
            r11 = 0
        L_0x0194:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r5.mo49559j0()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x01d8
            if (r10 == 0) goto L_0x019f
            goto L_0x01d8
        L_0x019f:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r5.mo49559j0()
            if (r4 != r13) goto L_0x014b
            int r4 = r5.f42682D
            if (r4 < 0) goto L_0x014b
            int r4 = r5.f42680C
            if (r4 < 0) goto L_0x014b
            int r4 = r5.mo49566l0()
            if (r4 == r9) goto L_0x01bf
            int r4 = r5.f42768x
            if (r4 != 0) goto L_0x014b
            float r4 = r5.mo49447A()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x014b
        L_0x01bf:
            boolean r4 = r5.mo49457D0()
            if (r4 != 0) goto L_0x014b
            boolean r4 = r5.mo49460E0()
            if (r4 != 0) goto L_0x014b
            if (r11 == 0) goto L_0x014b
            boolean r4 = r5.mo49457D0()
            if (r4 != 0) goto L_0x014b
            m77026i(r7, r0, r1, r5)
            goto L_0x014b
        L_0x01d8:
            boolean r10 = r5.mo49463F0()
            if (r10 == 0) goto L_0x01e0
            goto L_0x014b
        L_0x01e0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r5.f42710R
            if (r4 != r10) goto L_0x01fc
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.f42714T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.f42629f
            if (r12 != 0) goto L_0x01fc
            int r4 = r10.mo49426g()
            int r4 = r4 + r6
            int r10 = r5.mo49456D()
            int r10 = r10 + r4
            r5.mo49591t1(r4, r10)
            m77028k(r7, r5, r1)
            goto L_0x014b
        L_0x01fc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.f42714T
            if (r4 != r12) goto L_0x0218
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r10.f42629f
            if (r4 != 0) goto L_0x0218
            int r4 = r12.mo49426g()
            int r4 = r6 - r4
            int r10 = r5.mo49456D()
            int r10 = r4 - r10
            r5.mo49591t1(r10, r4)
            m77028k(r7, r5, r1)
            goto L_0x014b
        L_0x0218:
            if (r11 == 0) goto L_0x014b
            boolean r4 = r5.mo49457D0()
            if (r4 != 0) goto L_0x014b
            m77025h(r7, r1, r5)
            goto L_0x014b
        L_0x0225:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mo49583r(r2)
            java.util.HashSet r4 = r2.mo49424e()
            if (r4 == 0) goto L_0x028a
            boolean r4 = r2.mo49434o()
            if (r4 == 0) goto L_0x028a
            int r4 = r2.mo49425f()
            java.util.HashSet r2 = r2.mo49424e()
            java.util.Iterator r2 = r2.iterator()
        L_0x0243:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x028a
            java.lang.Object r5 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.f42627d
            int r7 = r16 + 1
            boolean r8 = m77018a(r7, r6)
            boolean r9 = r6.mo49463F0()
            if (r9 == 0) goto L_0x0269
            if (r8 == 0) goto L_0x0269
            androidx.constraintlayout.core.widgets.analyzer.b$a r9 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r9.<init>()
            int r10 = androidx.constraintlayout.core.widgets.analyzer.C16778b.C16779a.f42839k
            androidx.constraintlayout.core.widgets.C16798d.m77097R2(r7, r6, r1, r9, r10)
        L_0x0269:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r6.mo49559j0()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x0273
            if (r8 == 0) goto L_0x0243
        L_0x0273:
            boolean r8 = r6.mo49463F0()
            if (r8 == 0) goto L_0x027a
            goto L_0x0243
        L_0x027a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r6.f42716U
            if (r5 != r8) goto L_0x0243
            int r5 = r5.mo49426g()
            int r5 = r5 + r4
            r6.mo49576o1(r5)
            m77028k(r7, r6, r1)
            goto L_0x0243
        L_0x028a:
            r17.mo49490O0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C16785g.m77028k(int, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.b$b):void");
    }
}
