package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.C16643e;
import androidx.constraintlayout.core.C16646f;
import androidx.constraintlayout.core.widgets.C16798d;
import androidx.constraintlayout.core.widgets.C16801f;
import androidx.constraintlayout.core.widgets.C16803g;
import androidx.constraintlayout.core.widgets.C16805i;
import androidx.constraintlayout.core.widgets.C16808l;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.b */
public class C16778b {

    /* renamed from: d */
    public static final boolean f42828d = false;

    /* renamed from: e */
    public static final int f42829e = 30;

    /* renamed from: f */
    public static final int f42830f = 0;

    /* renamed from: g */
    public static final int f42831g = 1073741824;

    /* renamed from: h */
    public static final int f42832h = Integer.MIN_VALUE;

    /* renamed from: i */
    public static final int f42833i = -1;

    /* renamed from: j */
    public static final int f42834j = -2;

    /* renamed from: k */
    public static final int f42835k = -3;

    /* renamed from: a */
    public final ArrayList<ConstraintWidget> f42836a = new ArrayList<>();

    /* renamed from: b */
    public C16779a f42837b = new C16779a();

    /* renamed from: c */
    public C16798d f42838c;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.b$a */
    public static class C16779a {

        /* renamed from: k */
        public static int f42839k = 0;

        /* renamed from: l */
        public static int f42840l = 1;

        /* renamed from: m */
        public static int f42841m = 2;

        /* renamed from: a */
        public ConstraintWidget.DimensionBehaviour f42842a;

        /* renamed from: b */
        public ConstraintWidget.DimensionBehaviour f42843b;

        /* renamed from: c */
        public int f42844c;

        /* renamed from: d */
        public int f42845d;

        /* renamed from: e */
        public int f42846e;

        /* renamed from: f */
        public int f42847f;

        /* renamed from: g */
        public int f42848g;

        /* renamed from: h */
        public boolean f42849h;

        /* renamed from: i */
        public boolean f42850i;

        /* renamed from: j */
        public int f42851j;
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.b$b */
    public interface C16780b {
        /* renamed from: a */
        void mo48386a();

        /* renamed from: c */
        void mo48388c(ConstraintWidget constraintWidget, C16779a aVar);
    }

    public C16778b(C16798d dVar) {
        this.f42838c = dVar;
    }

    /* renamed from: a */
    public final boolean mo49647a(C16780b bVar, ConstraintWidget constraintWidget, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f42837b.f42842a = constraintWidget.mo49468H();
        this.f42837b.f42843b = constraintWidget.mo49559j0();
        this.f42837b.f42844c = constraintWidget.mo49569m0();
        this.f42837b.f42845d = constraintWidget.mo49456D();
        C16779a aVar = this.f42837b;
        aVar.f42850i = false;
        aVar.f42851j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f42842a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.f42843b == dimensionBehaviour2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || constraintWidget.f42733f0 <= 0.0f) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z2 || constraintWidget.f42733f0 <= 0.0f) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 && constraintWidget.f42770y[0] == 4) {
            aVar.f42842a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.f42770y[1] == 4) {
            aVar.f42843b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        bVar.mo48388c(constraintWidget, aVar);
        constraintWidget.mo49533c2(this.f42837b.f42846e);
        constraintWidget.mo49607y1(this.f42837b.f42847f);
        constraintWidget.mo49604x1(this.f42837b.f42849h);
        constraintWidget.mo49548g1(this.f42837b.f42848g);
        C16779a aVar2 = this.f42837b;
        aVar2.f42851j = C16779a.f42839k;
        return aVar2.f42850i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008e, code lost:
        if (r8 != r9) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0095, code lost:
        if (r5.f42733f0 <= 0.0f) goto L_0x0098;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49648b(androidx.constraintlayout.core.widgets.C16798d r13) {
        /*
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r13.f43070A1
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.mo49734S2(r1)
            androidx.constraintlayout.core.widgets.analyzer.b$b r2 = r13.mo49723G2()
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r4 >= r0) goto L_0x00b0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r13.f43070A1
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.C16801f
            if (r6 == 0) goto L_0x0022
            goto L_0x00ac
        L_0x0022:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r6 == 0) goto L_0x0028
            goto L_0x00ac
        L_0x0028:
            boolean r6 = r5.mo49460E0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00ac
        L_0x0030:
            if (r1 == 0) goto L_0x0048
            androidx.constraintlayout.core.widgets.analyzer.k r6 = r5.f42730e
            if (r6 == 0) goto L_0x0048
            androidx.constraintlayout.core.widgets.analyzer.m r7 = r5.f42732f
            if (r7 == 0) goto L_0x0048
            androidx.constraintlayout.core.widgets.analyzer.f r6 = r6.f42816e
            boolean r6 = r6.f42800j
            if (r6 == 0) goto L_0x0048
            androidx.constraintlayout.core.widgets.analyzer.f r6 = r7.f42816e
            boolean r6 = r6.f42800j
            if (r6 == 0) goto L_0x0048
            goto L_0x00ac
        L_0x0048:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.mo49608z(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.mo49608z(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0061
            int r10 = r5.f42766w
            if (r10 == r7) goto L_0x0061
            if (r8 != r9) goto L_0x0061
            int r10 = r5.f42768x
            if (r10 == r7) goto L_0x0061
            r10 = r7
            goto L_0x0062
        L_0x0061:
            r10 = r3
        L_0x0062:
            if (r10 != 0) goto L_0x0098
            boolean r11 = r13.mo49734S2(r7)
            if (r11 == 0) goto L_0x0098
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.C16808l
            if (r11 != 0) goto L_0x0098
            if (r6 != r9) goto L_0x007d
            int r11 = r5.f42766w
            if (r11 != 0) goto L_0x007d
            if (r8 == r9) goto L_0x007d
            boolean r11 = r5.mo49451B0()
            if (r11 != 0) goto L_0x007d
            r10 = r7
        L_0x007d:
            if (r8 != r9) goto L_0x008c
            int r11 = r5.f42768x
            if (r11 != 0) goto L_0x008c
            if (r6 == r9) goto L_0x008c
            boolean r11 = r5.mo49451B0()
            if (r11 != 0) goto L_0x008c
            r10 = r7
        L_0x008c:
            if (r6 == r9) goto L_0x0090
            if (r8 != r9) goto L_0x0098
        L_0x0090:
            float r6 = r5.f42733f0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r7 = r10
        L_0x0099:
            if (r7 == 0) goto L_0x009c
            goto L_0x00ac
        L_0x009c:
            int r6 = androidx.constraintlayout.core.widgets.analyzer.C16778b.C16779a.f42839k
            r12.mo49647a(r2, r5, r6)
            androidx.constraintlayout.core.f r5 = r13.f42939G1
            if (r5 == 0) goto L_0x00ac
            long r6 = r5.f41458c
            r8 = 1
            long r6 = r6 + r8
            r5.f41458c = r6
        L_0x00ac:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00b0:
            r2.mo48386a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C16778b.mo49648b(androidx.constraintlayout.core.widgets.d):void");
    }

    /* renamed from: c */
    public final void mo49649c(C16798d dVar, String str, int i, int i2, int i3) {
        int Q = dVar.mo49495Q();
        int P = dVar.mo49492P();
        dVar.mo49494P1(0);
        dVar.mo49491O1(0);
        dVar.mo49533c2(i2);
        dVar.mo49607y1(i3);
        dVar.mo49494P1(Q);
        dVar.mo49491O1(P);
        this.f42838c.mo49739X2(i);
        this.f42838c.mo49743n2();
    }

    /* renamed from: d */
    public long mo49650d(C16798d dVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        boolean z2;
        int i10;
        boolean z3;
        int i11;
        boolean z4;
        boolean z5;
        int i12;
        boolean z6;
        C16780b bVar;
        int i13;
        int i14;
        int i15;
        boolean z7;
        boolean z8;
        boolean z9;
        C16646f fVar;
        boolean z10;
        boolean z11;
        boolean z12;
        C16798d dVar2 = dVar;
        int i16 = i;
        int i17 = i4;
        int i18 = i6;
        C16780b G2 = dVar.mo49723G2();
        int size = dVar2.f43070A1.size();
        int m0 = dVar.mo49569m0();
        int D = dVar.mo49456D();
        boolean b = C16805i.m77235b(i16, 128);
        if (b || C16805i.m77235b(i16, 64)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    break;
                }
                ConstraintWidget constraintWidget = dVar2.f43070A1.get(i19);
                ConstraintWidget.DimensionBehaviour H = constraintWidget.mo49468H();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (H == dimensionBehaviour) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (constraintWidget.mo49559j0() == dimensionBehaviour) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z10 || !z11 || constraintWidget.mo49447A() <= 0.0f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if ((!constraintWidget.mo49451B0() || !z12) && ((!constraintWidget.mo49457D0() || !z12) && !(constraintWidget instanceof C16808l) && !constraintWidget.mo49451B0() && !constraintWidget.mo49457D0())) {
                    i19++;
                }
            }
            z = false;
        }
        if (z && (fVar = C16643e.f41409C) != null) {
            fVar.f41460e++;
        }
        if (!(i17 == 1073741824 && i18 == 1073741824) && !b) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z13 = z & z2;
        int i20 = 2;
        if (z13) {
            int min = Math.min(dVar.mo49489O(), i5);
            int min2 = Math.min(dVar.mo49486N(), i7);
            if (i17 == 1073741824 && dVar.mo49569m0() != min) {
                dVar2.mo49533c2(min);
                dVar.mo49728L2();
            }
            if (i18 == 1073741824 && dVar.mo49456D() != min2) {
                dVar2.mo49607y1(min2);
                dVar.mo49728L2();
            }
            if (i17 == 1073741824 && i18 == 1073741824) {
                z3 = dVar2.mo49718B2(b);
                i10 = 2;
            } else {
                boolean C2 = dVar2.mo49719C2(b);
                if (i17 == 1073741824) {
                    C2 &= dVar2.mo49720D2(b, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i18 == 1073741824) {
                    z3 = dVar2.mo49720D2(b, 1) & C2;
                    i10++;
                } else {
                    z3 = C2;
                }
            }
            if (z3) {
                if (i17 == 1073741824) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (i18 == 1073741824) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                dVar2.mo49557i2(z8, z9);
            }
        } else {
            z3 = false;
            i10 = 0;
        }
        if (z3 && i10 == 2) {
            return 0;
        }
        int H2 = dVar.mo49724H2();
        if (size > 0) {
            mo49648b(dVar);
        }
        mo49651e(dVar);
        int size2 = this.f42836a.size();
        if (size > 0) {
            mo49649c(dVar, "First pass", 0, m0, D);
        }
        if (size2 > 0) {
            ConstraintWidget.DimensionBehaviour H3 = dVar.mo49468H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (H3 == dimensionBehaviour2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVar.mo49559j0() == dimensionBehaviour2) {
                z5 = true;
            } else {
                z5 = false;
            }
            int max = Math.max(dVar.mo49569m0(), this.f42838c.mo49495Q());
            int max2 = Math.max(dVar.mo49456D(), this.f42838c.mo49492P());
            int i21 = 0;
            boolean z14 = false;
            while (i21 < size2) {
                ConstraintWidget constraintWidget2 = this.f42836a.get(i21);
                if (!(constraintWidget2 instanceof C16808l)) {
                    i13 = H2;
                    i14 = m0;
                    i15 = D;
                } else {
                    int m02 = constraintWidget2.mo49569m0();
                    i13 = H2;
                    int D2 = constraintWidget2.mo49456D();
                    i15 = D;
                    boolean a = mo49647a(G2, constraintWidget2, C16779a.f42840l) | z14;
                    C16646f fVar2 = dVar2.f42939G1;
                    i14 = m0;
                    boolean z15 = a;
                    if (fVar2 != null) {
                        fVar2.f41459d++;
                    }
                    int m03 = constraintWidget2.mo49569m0();
                    int D3 = constraintWidget2.mo49456D();
                    if (m03 != m02) {
                        constraintWidget2.mo49533c2(m03);
                        if (z4 && constraintWidget2.mo49516X() > max) {
                            max = Math.max(max, constraintWidget2.mo49516X() + constraintWidget2.mo49583r(ConstraintAnchor.Type.RIGHT).mo49426g());
                        }
                        z7 = true;
                    } else {
                        z7 = z15;
                    }
                    if (D3 != D2) {
                        constraintWidget2.mo49607y1(D3);
                        if (z5 && constraintWidget2.mo49596v() > max2) {
                            max2 = Math.max(max2, constraintWidget2.mo49596v() + constraintWidget2.mo49583r(ConstraintAnchor.Type.BOTTOM).mo49426g());
                        }
                        z7 = true;
                    }
                    z14 = z7 | ((C16808l) constraintWidget2).mo49839y2();
                }
                i21++;
                H2 = i13;
                D = i15;
                m0 = i14;
                i20 = 2;
            }
            int i22 = H2;
            int i23 = m0;
            int i24 = D;
            int i25 = i20;
            int i26 = 0;
            while (i26 < i25) {
                int i27 = 0;
                while (i27 < size2) {
                    ConstraintWidget constraintWidget3 = this.f42836a.get(i27);
                    if ((!(constraintWidget3 instanceof C16803g) || (constraintWidget3 instanceof C16808l)) && !(constraintWidget3 instanceof C16801f) && constraintWidget3.mo49566l0() != 8 && ((!z13 || !constraintWidget3.f42730e.f42816e.f42800j || !constraintWidget3.f42732f.f42816e.f42800j) && !(constraintWidget3 instanceof C16808l))) {
                        int m04 = constraintWidget3.mo49569m0();
                        int D4 = constraintWidget3.mo49456D();
                        int t = constraintWidget3.mo49589t();
                        int i28 = C16779a.f42840l;
                        z6 = z13;
                        if (i26 == 1) {
                            i28 = C16779a.f42841m;
                        }
                        boolean a2 = mo49647a(G2, constraintWidget3, i28) | z14;
                        C16646f fVar3 = dVar2.f42939G1;
                        i12 = size2;
                        bVar = G2;
                        if (fVar3 != null) {
                            fVar3.f41459d++;
                        }
                        int m05 = constraintWidget3.mo49569m0();
                        int D5 = constraintWidget3.mo49456D();
                        if (m05 != m04) {
                            constraintWidget3.mo49533c2(m05);
                            if (z4 && constraintWidget3.mo49516X() > max) {
                                max = Math.max(max, constraintWidget3.mo49516X() + constraintWidget3.mo49583r(ConstraintAnchor.Type.RIGHT).mo49426g());
                            }
                            a2 = true;
                        }
                        if (D5 != D4) {
                            constraintWidget3.mo49607y1(D5);
                            if (z5 && constraintWidget3.mo49596v() > max2) {
                                max2 = Math.max(max2, constraintWidget3.mo49596v() + constraintWidget3.mo49583r(ConstraintAnchor.Type.BOTTOM).mo49426g());
                            }
                            a2 = true;
                        }
                        if (!constraintWidget3.mo49581q0() || t == constraintWidget3.mo49589t()) {
                            z14 = a2;
                        } else {
                            z14 = true;
                        }
                    } else {
                        z6 = z13;
                        i12 = size2;
                        bVar = G2;
                    }
                    i27++;
                    G2 = bVar;
                    z13 = z6;
                    size2 = i12;
                }
                boolean z16 = z13;
                int i29 = size2;
                C16780b bVar2 = G2;
                if (!z14) {
                    break;
                }
                i26++;
                mo49649c(dVar, "intermediate pass", i26, i23, i24);
                G2 = bVar2;
                z13 = z16;
                size2 = i29;
                i25 = 2;
                z14 = false;
            }
            i11 = i22;
        } else {
            i11 = H2;
        }
        dVar2.mo49737V2(i11);
        return 0;
    }

    /* renamed from: e */
    public void mo49651e(C16798d dVar) {
        this.f42836a.clear();
        int size = dVar.f43070A1.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = dVar.f43070A1.get(i);
            ConstraintWidget.DimensionBehaviour H = constraintWidget.mo49468H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (H == dimensionBehaviour || constraintWidget.mo49559j0() == dimensionBehaviour) {
                this.f42836a.add(constraintWidget);
            }
        }
        dVar.mo49728L2();
    }
}
