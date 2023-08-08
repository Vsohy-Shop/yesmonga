package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C16643e;
import androidx.constraintlayout.core.C16646f;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.C16778b;
import androidx.constraintlayout.core.widgets.analyzer.C16783e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.d */
public class C16798d extends C16809m {

    /* renamed from: g2 */
    public static final int f42929g2 = 8;

    /* renamed from: h2 */
    public static final boolean f42930h2 = false;

    /* renamed from: i2 */
    public static final boolean f42931i2 = false;

    /* renamed from: j2 */
    public static final boolean f42932j2 = false;

    /* renamed from: k2 */
    public static int f42933k2;

    /* renamed from: B1 */
    public C16778b f42934B1 = new C16778b(this);

    /* renamed from: C1 */
    public C16783e f42935C1 = new C16783e(this);

    /* renamed from: D1 */
    public int f42936D1;

    /* renamed from: E1 */
    public C16778b.C16780b f42937E1 = null;

    /* renamed from: F1 */
    public boolean f42938F1 = false;

    /* renamed from: G1 */
    public C16646f f42939G1;

    /* renamed from: H1 */
    public C16643e f42940H1 = new C16643e();

    /* renamed from: I1 */
    public int f42941I1;

    /* renamed from: J1 */
    public int f42942J1;

    /* renamed from: K1 */
    public int f42943K1;

    /* renamed from: L1 */
    public int f42944L1;

    /* renamed from: M1 */
    public int f42945M1 = 0;

    /* renamed from: N1 */
    public int f42946N1 = 0;

    /* renamed from: O1 */
    public C16797c[] f42947O1 = new C16797c[4];

    /* renamed from: P1 */
    public C16797c[] f42948P1 = new C16797c[4];

    /* renamed from: Q1 */
    public boolean f42949Q1 = false;

    /* renamed from: R1 */
    public boolean f42950R1 = false;

    /* renamed from: S1 */
    public boolean f42951S1 = false;

    /* renamed from: T1 */
    public int f42952T1 = 0;

    /* renamed from: U1 */
    public int f42953U1 = 0;

    /* renamed from: V1 */
    public int f42954V1 = 257;

    /* renamed from: W1 */
    public boolean f42955W1 = false;

    /* renamed from: X1 */
    public boolean f42956X1 = false;

    /* renamed from: Y1 */
    public boolean f42957Y1 = false;

    /* renamed from: Z1 */
    public int f42958Z1 = 0;

    /* renamed from: a2 */
    public WeakReference<ConstraintAnchor> f42959a2 = null;

    /* renamed from: b2 */
    public WeakReference<ConstraintAnchor> f42960b2 = null;

    /* renamed from: c2 */
    public WeakReference<ConstraintAnchor> f42961c2 = null;

    /* renamed from: d2 */
    public WeakReference<ConstraintAnchor> f42962d2 = null;

    /* renamed from: e2 */
    public HashSet<ConstraintWidget> f42963e2 = new HashSet<>();

    /* renamed from: f2 */
    public C16778b.C16779a f42964f2 = new C16778b.C16779a();

    public C16798d() {
    }

    /* renamed from: R2 */
    public static boolean m77097R2(int i, ConstraintWidget constraintWidget, C16778b.C16780b bVar, C16778b.C16779a aVar, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (constraintWidget.mo49566l0() == 8 || (constraintWidget instanceof C16801f) || (constraintWidget instanceof C16775a)) {
            aVar.f42846e = 0;
            aVar.f42847f = 0;
            return false;
        }
        aVar.f42842a = constraintWidget.mo49468H();
        aVar.f42843b = constraintWidget.mo49559j0();
        aVar.f42844c = constraintWidget.mo49569m0();
        aVar.f42845d = constraintWidget.mo49456D();
        aVar.f42850i = false;
        aVar.f42851j = i2;
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
        if (z && constraintWidget.mo49584r0(0) && constraintWidget.f42766w == 0 && !z3) {
            aVar.f42842a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.f42768x == 0) {
                aVar.f42842a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.mo49584r0(1) && constraintWidget.f42768x == 0 && !z4) {
            aVar.f42843b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.f42766w == 0) {
                aVar.f42843b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.mo49466G0()) {
            aVar.f42842a = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.mo49469H0()) {
            aVar.f42843b = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.f42770y[0] == 4) {
                aVar.f42842a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f42843b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i4 = aVar.f42845d;
                } else {
                    aVar.f42842a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.mo48388c(constraintWidget, aVar);
                    i4 = aVar.f42847f;
                }
                aVar.f42842a = dimensionBehaviour4;
                aVar.f42844c = (int) (constraintWidget.mo49447A() * ((float) i4));
            }
        }
        if (z4) {
            if (constraintWidget.f42770y[1] == 4) {
                aVar.f42843b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f42842a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i3 = aVar.f42844c;
                } else {
                    aVar.f42843b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.mo48388c(constraintWidget, aVar);
                    i3 = aVar.f42846e;
                }
                aVar.f42843b = dimensionBehaviour6;
                if (constraintWidget.mo49450B() == -1) {
                    aVar.f42845d = (int) (((float) i3) / constraintWidget.mo49447A());
                } else {
                    aVar.f42845d = (int) (constraintWidget.mo49447A() * ((float) i3));
                }
            }
        }
        bVar.mo48388c(constraintWidget, aVar);
        constraintWidget.mo49533c2(aVar.f42846e);
        constraintWidget.mo49607y1(aVar.f42847f);
        constraintWidget.mo49604x1(aVar.f42849h);
        constraintWidget.mo49548g1(aVar.f42848g);
        aVar.f42851j = C16778b.C16779a.f42839k;
        return aVar.f42850i;
    }

    /* renamed from: A2 */
    public void mo49717A2() {
        this.f42935C1.mo49661f(mo49468H(), mo49559j0());
    }

    /* renamed from: B2 */
    public boolean mo49718B2(boolean z) {
        return this.f42935C1.mo49662g(z);
    }

    /* renamed from: C2 */
    public boolean mo49719C2(boolean z) {
        return this.f42935C1.mo49663h(z);
    }

    /* renamed from: D2 */
    public boolean mo49720D2(boolean z, int i) {
        return this.f42935C1.mo49664i(z, i);
    }

    /* renamed from: E2 */
    public void mo49721E2(C16646f fVar) {
        this.f42939G1 = fVar;
        this.f42940H1.mo48688F(fVar);
    }

    /* renamed from: F2 */
    public ArrayList<C16801f> mo49722F2() {
        ArrayList<C16801f> arrayList = new ArrayList<>();
        int size = this.f43070A1.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f43070A1.get(i);
            if (constraintWidget instanceof C16801f) {
                C16801f fVar = (C16801f) constraintWidget;
                if (fVar.mo49795m2() == 0) {
                    arrayList.add(fVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: G2 */
    public C16778b.C16780b mo49723G2() {
        return this.f42937E1;
    }

    /* renamed from: H2 */
    public int mo49724H2() {
        return this.f42954V1;
    }

    /* renamed from: I2 */
    public C16643e mo49725I2() {
        return this.f42940H1;
    }

    /* renamed from: J2 */
    public ArrayList<C16801f> mo49726J2() {
        ArrayList<C16801f> arrayList = new ArrayList<>();
        int size = this.f43070A1.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f43070A1.get(i);
            if (constraintWidget instanceof C16801f) {
                C16801f fVar = (C16801f) constraintWidget;
                if (fVar.mo49795m2() == 1) {
                    arrayList.add(fVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: K2 */
    public boolean mo49727K2() {
        return false;
    }

    /* renamed from: L2 */
    public void mo49728L2() {
        this.f42935C1.mo49670o();
    }

    /* renamed from: M2 */
    public void mo49729M2() {
        this.f42935C1.mo49671p();
    }

    /* renamed from: N2 */
    public boolean mo49730N2() {
        return this.f42957Y1;
    }

    /* renamed from: O2 */
    public boolean mo49731O2() {
        return this.f42938F1;
    }

    /* renamed from: P2 */
    public boolean mo49732P2() {
        return this.f42956X1;
    }

    /* renamed from: Q2 */
    public long mo49733Q2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.f42941I1 = i10;
        int i11 = i9;
        this.f42942J1 = i11;
        return this.f42934B1.mo49650d(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: R0 */
    public void mo49499R0() {
        this.f42940H1.mo48706Y();
        this.f42941I1 = 0;
        this.f42943K1 = 0;
        this.f42942J1 = 0;
        this.f42944L1 = 0;
        this.f42955W1 = false;
        super.mo49499R0();
    }

    /* renamed from: S2 */
    public boolean mo49734S2(int i) {
        return (this.f42954V1 & i) == i;
    }

    /* renamed from: T2 */
    public final void mo49735T2() {
        this.f42945M1 = 0;
        this.f42946N1 = 0;
    }

    /* renamed from: U2 */
    public void mo49736U2(C16778b.C16780b bVar) {
        this.f42937E1 = bVar;
        this.f42935C1.mo49676u(bVar);
    }

    /* renamed from: V2 */
    public void mo49737V2(int i) {
        this.f42954V1 = i;
        C16643e.f41416v = mo49734S2(512);
    }

    /* renamed from: W2 */
    public void mo49738W2(int i, int i2, int i3, int i4) {
        this.f42941I1 = i;
        this.f42942J1 = i2;
        this.f42943K1 = i3;
        this.f42944L1 = i4;
    }

    /* renamed from: X2 */
    public void mo49739X2(int i) {
        this.f42936D1 = i;
    }

    /* renamed from: Y2 */
    public void mo49740Y2(boolean z) {
        this.f42938F1 = z;
    }

    /* renamed from: Z2 */
    public boolean mo49741Z2(C16643e eVar, boolean[] zArr) {
        zArr[2] = false;
        boolean S2 = mo49734S2(64);
        mo49561j2(eVar, S2);
        int size = this.f43070A1.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f43070A1.get(i);
            constraintWidget.mo49561j2(eVar, S2);
            if (constraintWidget.mo49590t0()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a3 */
    public void mo49742a3() {
        this.f42934B1.mo49651e(this);
    }

    /* renamed from: b0 */
    public void mo49528b0(StringBuilder sb) {
        sb.append(this.f42750o + ":{\n");
        sb.append("  actualWidth:" + this.f42729d0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f42731e0);
        sb.append("\n");
        Iterator<ConstraintWidget> it = mo49843l2().iterator();
        while (it.hasNext()) {
            it.next().mo49528b0(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    /* renamed from: f0 */
    public String mo49543f0() {
        return "ConstraintLayout";
    }

    /* renamed from: i2 */
    public void mo49557i2(boolean z, boolean z2) {
        super.mo49557i2(z, z2);
        int size = this.f43070A1.size();
        for (int i = 0; i < size; i++) {
            this.f43070A1.get(i).mo49557i2(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x031d  */
    /* renamed from: n2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49743n2() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f42737h0 = r2
            r1.f42739i0 = r2
            r1.f42956X1 = r2
            r1.f42957Y1 = r2
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.f43070A1
            int r3 = r0.size()
            int r0 = r18.mo49569m0()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.mo49456D()
            int r4 = java.lang.Math.max(r2, r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.f42725b0
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            androidx.constraintlayout.core.f r8 = r1.f42939G1
            if (r8 == 0) goto L_0x0033
            long r9 = r8.f41454P
            r11 = 1
            long r9 = r9 + r11
            r8.f41454P = r9
        L_0x0033:
            int r8 = r1.f42936D1
            if (r8 != 0) goto L_0x0093
            int r8 = r1.f42954V1
            boolean r8 = androidx.constraintlayout.core.widgets.C16805i.m77235b(r8, r6)
            if (r8 == 0) goto L_0x0093
            androidx.constraintlayout.core.widgets.analyzer.b$b r8 = r18.mo49723G2()
            androidx.constraintlayout.core.widgets.analyzer.C16785g.m77027j(r1, r8)
            r8 = r2
        L_0x0047:
            if (r8 >= r3) goto L_0x0093
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r9 = r1.f43070A1
            java.lang.Object r9 = r9.get(r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r10 = r9.mo49463F0()
            if (r10 == 0) goto L_0x0090
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.C16801f
            if (r10 != 0) goto L_0x0090
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r10 != 0) goto L_0x0090
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.C16808l
            if (r10 != 0) goto L_0x0090
            boolean r10 = r9.mo49460E0()
            if (r10 != 0) goto L_0x0090
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r9.mo49608z(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.mo49608z(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0081
            int r10 = r9.f42766w
            if (r10 == r6) goto L_0x0081
            if (r11 != r12) goto L_0x0081
            int r10 = r9.f42768x
            if (r10 == r6) goto L_0x0081
            r10 = r6
            goto L_0x0082
        L_0x0081:
            r10 = r2
        L_0x0082:
            if (r10 != 0) goto L_0x0090
            androidx.constraintlayout.core.widgets.analyzer.b$a r10 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r10.<init>()
            androidx.constraintlayout.core.widgets.analyzer.b$b r11 = r1.f42937E1
            int r12 = androidx.constraintlayout.core.widgets.analyzer.C16778b.C16779a.f42839k
            m77097R2(r2, r9, r11, r10, r12)
        L_0x0090:
            int r8 = r8 + 1
            goto L_0x0047
        L_0x0093:
            r8 = 2
            if (r3 <= r8) goto L_0x00dc
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r9) goto L_0x009c
            if (r7 != r9) goto L_0x00dc
        L_0x009c:
            int r10 = r1.f42954V1
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = androidx.constraintlayout.core.widgets.C16805i.m77235b(r10, r11)
            if (r10 == 0) goto L_0x00dc
            androidx.constraintlayout.core.widgets.analyzer.b$b r10 = r18.mo49723G2()
            boolean r10 = androidx.constraintlayout.core.widgets.analyzer.C16786h.m77031c(r1, r10)
            if (r10 == 0) goto L_0x00dc
            if (r5 != r9) goto L_0x00c4
            int r10 = r18.mo49569m0()
            if (r0 >= r10) goto L_0x00c0
            if (r0 <= 0) goto L_0x00c0
            r1.mo49533c2(r0)
            r1.f42956X1 = r6
            goto L_0x00c4
        L_0x00c0:
            int r0 = r18.mo49569m0()
        L_0x00c4:
            if (r7 != r9) goto L_0x00d8
            int r9 = r18.mo49456D()
            if (r4 >= r9) goto L_0x00d4
            if (r4 <= 0) goto L_0x00d4
            r1.mo49607y1(r4)
            r1.f42957Y1 = r6
            goto L_0x00d8
        L_0x00d4:
            int r4 = r18.mo49456D()
        L_0x00d8:
            r9 = r4
            r4 = r0
            r0 = r6
            goto L_0x00df
        L_0x00dc:
            r9 = r4
            r4 = r0
            r0 = r2
        L_0x00df:
            r10 = 64
            boolean r11 = r1.mo49734S2(r10)
            if (r11 != 0) goto L_0x00f2
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.mo49734S2(r11)
            if (r11 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r11 = r2
            goto L_0x00f3
        L_0x00f2:
            r11 = r6
        L_0x00f3:
            androidx.constraintlayout.core.e r12 = r1.f42940H1
            r12.f41428h = r2
            r12.f41429i = r2
            int r13 = r1.f42954V1
            if (r13 == 0) goto L_0x0101
            if (r11 == 0) goto L_0x0101
            r12.f41429i = r6
        L_0x0101:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r11 = r1.f43070A1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r18.mo49468H()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r13) goto L_0x0114
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r18.mo49559j0()
            if (r12 != r13) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r12 = r2
            goto L_0x0115
        L_0x0114:
            r12 = r6
        L_0x0115:
            r18.mo49735T2()
            r13 = r2
        L_0x0119:
            if (r13 >= r3) goto L_0x012f
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r14 = r1.f43070A1
            java.lang.Object r14 = r14.get(r13)
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r14
            boolean r15 = r14 instanceof androidx.constraintlayout.core.widgets.C16809m
            if (r15 == 0) goto L_0x012c
            androidx.constraintlayout.core.widgets.m r14 = (androidx.constraintlayout.core.widgets.C16809m) r14
            r14.mo49743n2()
        L_0x012c:
            int r13 = r13 + 1
            goto L_0x0119
        L_0x012f:
            boolean r10 = r1.mo49734S2(r10)
            r13 = r0
            r0 = r2
            r14 = r6
        L_0x0136:
            if (r14 == 0) goto L_0x0324
            int r15 = r0 + 1
            androidx.constraintlayout.core.e r0 = r1.f42940H1     // Catch:{ Exception -> 0x01e7 }
            r0.mo48706Y()     // Catch:{ Exception -> 0x01e7 }
            r18.mo49735T2()     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.e r0 = r1.f42940H1     // Catch:{ Exception -> 0x01e7 }
            r1.mo49574o(r0)     // Catch:{ Exception -> 0x01e7 }
            r0 = r2
        L_0x0148:
            if (r0 >= r3) goto L_0x015c
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r1.f43070A1     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.e r2 = r1.f42940H1     // Catch:{ Exception -> 0x01e7 }
            r6.mo49574o(r2)     // Catch:{ Exception -> 0x01e7 }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x0148
        L_0x015c:
            androidx.constraintlayout.core.e r0 = r1.f42940H1     // Catch:{ Exception -> 0x01e7 }
            boolean r14 = r1.mo49745r2(r0)     // Catch:{ Exception -> 0x01e7 }
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f42959a2     // Catch:{ Exception -> 0x01e7 }
            r2 = 0
            if (r0 == 0) goto L_0x0182
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x0182
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f42959a2     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.e r6 = r1.f42940H1     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.f42710R     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo48727u(r8)     // Catch:{ Exception -> 0x01e7 }
            r1.mo49750w2(r0, r6)     // Catch:{ Exception -> 0x01e7 }
            r1.f42959a2 = r2     // Catch:{ Exception -> 0x01e7 }
        L_0x0182:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f42961c2     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01a1
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01a1
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f42961c2     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.e r6 = r1.f42940H1     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.f42714T     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo48727u(r8)     // Catch:{ Exception -> 0x01e7 }
            r1.mo49749v2(r0, r6)     // Catch:{ Exception -> 0x01e7 }
            r1.f42961c2 = r2     // Catch:{ Exception -> 0x01e7 }
        L_0x01a1:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f42960b2     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01c0
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f42960b2     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.e r6 = r1.f42940H1     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.f42708Q     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo48727u(r8)     // Catch:{ Exception -> 0x01e7 }
            r1.mo49750w2(r0, r6)     // Catch:{ Exception -> 0x01e7 }
            r1.f42960b2 = r2     // Catch:{ Exception -> 0x01e7 }
        L_0x01c0:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f42962d2     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01df
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01df
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f42962d2     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.e r6 = r1.f42940H1     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.f42712S     // Catch:{ Exception -> 0x01e7 }
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo48727u(r8)     // Catch:{ Exception -> 0x01e7 }
            r1.mo49749v2(r0, r6)     // Catch:{ Exception -> 0x01e7 }
            r1.f42962d2 = r2     // Catch:{ Exception -> 0x01e7 }
        L_0x01df:
            if (r14 == 0) goto L_0x0201
            androidx.constraintlayout.core.e r0 = r1.f42940H1     // Catch:{ Exception -> 0x01e7 }
            r0.mo48701T()     // Catch:{ Exception -> 0x01e7 }
            goto L_0x0201
        L_0x01e7:
            r0 = move-exception
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x0201:
            if (r14 == 0) goto L_0x020c
            androidx.constraintlayout.core.e r0 = r1.f42940H1
            boolean[] r2 = androidx.constraintlayout.core.widgets.C16805i.f43049n
            boolean r0 = r1.mo49741Z2(r0, r2)
            goto L_0x0225
        L_0x020c:
            androidx.constraintlayout.core.e r0 = r1.f42940H1
            r1.mo49561j2(r0, r10)
            r0 = 0
        L_0x0212:
            if (r0 >= r3) goto L_0x0224
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r1.f43070A1
            java.lang.Object r2 = r2.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.e r6 = r1.f42940H1
            r2.mo49561j2(r6, r10)
            int r0 = r0 + 1
            goto L_0x0212
        L_0x0224:
            r0 = 0
        L_0x0225:
            r2 = 8
            if (r12 == 0) goto L_0x0296
            if (r15 >= r2) goto L_0x0296
            boolean[] r6 = androidx.constraintlayout.core.widgets.C16805i.f43049n
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x0296
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x0235:
            if (r6 >= r3) goto L_0x025f
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r1.f43070A1
            java.lang.Object r2 = r2.get(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            r16 = r0
            int r0 = r2.f42737h0
            int r17 = r2.mo49569m0()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f42739i0
            int r2 = r2.mo49456D()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x0235
        L_0x025f:
            r16 = r0
            int r0 = r1.f42751o0
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f42753p0
            int r2 = java.lang.Math.max(r2, r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 != r6) goto L_0x0282
            int r8 = r18.mo49569m0()
            if (r8 >= r0) goto L_0x0282
            r1.mo49533c2(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f42725b0
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0282:
            if (r7 != r6) goto L_0x0298
            int r0 = r18.mo49456D()
            if (r0 >= r2) goto L_0x0298
            r1.mo49607y1(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f42725b0
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x0298
        L_0x0296:
            r16 = r0
        L_0x0298:
            int r0 = r1.f42751o0
            int r2 = r18.mo49569m0()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.mo49569m0()
            if (r0 <= r2) goto L_0x02b5
            r1.mo49533c2(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f42725b0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02b5:
            int r0 = r1.f42753p0
            int r2 = r18.mo49456D()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.mo49456D()
            if (r0 <= r2) goto L_0x02d3
            r1.mo49607y1(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f42725b0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = r6
            r16 = r2
            goto L_0x02d5
        L_0x02d3:
            r6 = 1
            r2 = r13
        L_0x02d5:
            if (r2 != 0) goto L_0x0314
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f42725b0
            r8 = 0
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L_0x02f6
            if (r4 <= 0) goto L_0x02f6
            int r0 = r18.mo49569m0()
            if (r0 <= r4) goto L_0x02f6
            r1.f42956X1 = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f42725b0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r8] = r2
            r1.mo49533c2(r4)
            r2 = r6
            r16 = r2
        L_0x02f6:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f42725b0
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0314
            if (r9 <= 0) goto L_0x0314
            int r0 = r18.mo49456D()
            if (r0 <= r9) goto L_0x0314
            r1.f42957Y1 = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f42725b0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r6] = r2
            r1.mo49607y1(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x0319
        L_0x0314:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x0319:
            if (r15 <= r0) goto L_0x031d
            r14 = 0
            goto L_0x031e
        L_0x031d:
            r14 = r2
        L_0x031e:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x0136
        L_0x0324:
            r1.f43070A1 = r11
            if (r13 == 0) goto L_0x0330
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f42725b0
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x0330:
            androidx.constraintlayout.core.e r0 = r1.f42940H1
            androidx.constraintlayout.core.c r0 = r0.mo48689G()
            r1.mo49514W0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C16798d.mo49743n2():void");
    }

    /* renamed from: q2 */
    public void mo49744q2(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            mo49746s2(constraintWidget);
        } else if (i == 1) {
            mo49751x2(constraintWidget);
        }
    }

    /* renamed from: r2 */
    public boolean mo49745r2(C16643e eVar) {
        int i;
        boolean S2 = mo49734S2(64);
        mo49546g(eVar, S2);
        int size = this.f43070A1.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = this.f43070A1.get(i2);
            constraintWidget.mo49467G1(0, false);
            constraintWidget.mo49467G1(1, false);
            if (constraintWidget instanceof C16775a) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = this.f43070A1.get(i3);
                if (constraintWidget2 instanceof C16775a) {
                    ((C16775a) constraintWidget2).mo49617s2();
                }
            }
        }
        this.f42963e2.clear();
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget3 = this.f43070A1.get(i4);
            if (constraintWidget3.mo49542f()) {
                if (constraintWidget3 instanceof C16808l) {
                    this.f42963e2.add(constraintWidget3);
                } else {
                    constraintWidget3.mo49546g(eVar, S2);
                }
            }
        }
        while (this.f42963e2.size() > 0) {
            int size2 = this.f42963e2.size();
            Iterator<ConstraintWidget> it = this.f42963e2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C16808l lVar = (C16808l) it.next();
                if (lVar.mo49830o2(this.f42963e2)) {
                    lVar.mo49546g(eVar, S2);
                    this.f42963e2.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f42963e2.size()) {
                Iterator<ConstraintWidget> it2 = this.f42963e2.iterator();
                while (it2.hasNext()) {
                    it2.next().mo49546g(eVar, S2);
                }
                this.f42963e2.clear();
            }
        }
        if (C16643e.f41416v) {
            HashSet hashSet = new HashSet();
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget4 = this.f43070A1.get(i5);
                if (!constraintWidget4.mo49542f()) {
                    hashSet.add(constraintWidget4);
                }
            }
            if (mo49468H() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            mo49538e(this, eVar, hashSet, i, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) it3.next();
                C16805i.m77234a(this, eVar, constraintWidget5);
                constraintWidget5.mo49546g(eVar, S2);
            }
        } else {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget6 = this.f43070A1.get(i6);
                if (constraintWidget6 instanceof C16798d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.f42725b0;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.mo49458D1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.mo49521Y1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.mo49546g(eVar, S2);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.mo49458D1(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.mo49521Y1(dimensionBehaviour2);
                    }
                } else {
                    C16805i.m77234a(this, eVar, constraintWidget6);
                    if (!constraintWidget6.mo49542f()) {
                        constraintWidget6.mo49546g(eVar, S2);
                    }
                }
            }
        }
        if (this.f42945M1 > 0) {
            C16796b.m77085b(this, eVar, (ArrayList<ConstraintWidget>) null, 0);
        }
        if (this.f42946N1 > 0) {
            C16796b.m77085b(this, eVar, (ArrayList<ConstraintWidget>) null, 1);
        }
        return true;
    }

    /* renamed from: s2 */
    public final void mo49746s2(ConstraintWidget constraintWidget) {
        int i = this.f42945M1 + 1;
        C16797c[] cVarArr = this.f42948P1;
        if (i >= cVarArr.length) {
            this.f42948P1 = (C16797c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f42948P1[this.f42945M1] = new C16797c(constraintWidget, 0, mo49731O2());
        this.f42945M1++;
    }

    /* renamed from: t2 */
    public void mo49747t2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f42962d2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo49425f() > this.f42962d2.get().mo49425f()) {
            this.f42962d2 = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: u2 */
    public void mo49748u2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f42960b2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo49425f() > this.f42960b2.get().mo49425f()) {
            this.f42960b2 = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: v2 */
    public final void mo49749v2(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f42940H1.mo48715i(solverVariable, this.f42940H1.mo48727u(constraintAnchor), 0, 5);
    }

    /* renamed from: w2 */
    public final void mo49750w2(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f42940H1.mo48715i(this.f42940H1.mo48727u(constraintAnchor), solverVariable, 0, 5);
    }

    /* renamed from: x2 */
    public final void mo49751x2(ConstraintWidget constraintWidget) {
        int i = this.f42946N1 + 1;
        C16797c[] cVarArr = this.f42947O1;
        if (i >= cVarArr.length) {
            this.f42947O1 = (C16797c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f42947O1[this.f42946N1] = new C16797c(constraintWidget, 1, mo49731O2());
        this.f42946N1++;
    }

    /* renamed from: y2 */
    public void mo49752y2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f42961c2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo49425f() > this.f42961c2.get().mo49425f()) {
            this.f42961c2 = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: z2 */
    public void mo49753z2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f42959a2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo49425f() > this.f42959a2.get().mo49425f()) {
            this.f42959a2 = new WeakReference<>(constraintAnchor);
        }
    }

    public C16798d(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public C16798d(int i, int i2) {
        super(i, i2);
    }

    public C16798d(String str, int i, int i2) {
        super(i, i2);
        mo49560j1(str);
    }
}
