package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C16643e;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.widgets.e */
public class C16799e extends C16808l {

    /* renamed from: o2 */
    public static final int f42965o2 = 0;

    /* renamed from: p2 */
    public static final int f42966p2 = 1;

    /* renamed from: q2 */
    public static final int f42967q2 = 2;

    /* renamed from: r2 */
    public static final int f42968r2 = 0;

    /* renamed from: s2 */
    public static final int f42969s2 = 1;

    /* renamed from: t2 */
    public static final int f42970t2 = 2;

    /* renamed from: u2 */
    public static final int f42971u2 = 3;

    /* renamed from: v2 */
    public static final int f42972v2 = 0;

    /* renamed from: w2 */
    public static final int f42973w2 = 1;

    /* renamed from: x2 */
    public static final int f42974x2 = 2;

    /* renamed from: y2 */
    public static final int f42975y2 = 3;

    /* renamed from: P1 */
    public int f42976P1 = -1;

    /* renamed from: Q1 */
    public int f42977Q1 = -1;

    /* renamed from: R1 */
    public int f42978R1 = -1;

    /* renamed from: S1 */
    public int f42979S1 = -1;

    /* renamed from: T1 */
    public int f42980T1 = -1;

    /* renamed from: U1 */
    public int f42981U1 = -1;

    /* renamed from: V1 */
    public float f42982V1 = 0.5f;

    /* renamed from: W1 */
    public float f42983W1 = 0.5f;

    /* renamed from: X1 */
    public float f42984X1 = 0.5f;

    /* renamed from: Y1 */
    public float f42985Y1 = 0.5f;

    /* renamed from: Z1 */
    public float f42986Z1 = 0.5f;

    /* renamed from: a2 */
    public float f42987a2 = 0.5f;

    /* renamed from: b2 */
    public int f42988b2 = 0;

    /* renamed from: c2 */
    public int f42989c2 = 0;

    /* renamed from: d2 */
    public int f42990d2 = 2;

    /* renamed from: e2 */
    public int f42991e2 = 2;

    /* renamed from: f2 */
    public int f42992f2 = 0;

    /* renamed from: g2 */
    public int f42993g2 = -1;

    /* renamed from: h2 */
    public int f42994h2 = 0;

    /* renamed from: i2 */
    public ArrayList<C16800a> f42995i2 = new ArrayList<>();

    /* renamed from: j2 */
    public ConstraintWidget[] f42996j2 = null;

    /* renamed from: k2 */
    public ConstraintWidget[] f42997k2 = null;

    /* renamed from: l2 */
    public int[] f42998l2 = null;

    /* renamed from: m2 */
    public ConstraintWidget[] f42999m2;

    /* renamed from: n2 */
    public int f43000n2 = 0;

    /* renamed from: androidx.constraintlayout.core.widgets.e$a */
    public class C16800a {

        /* renamed from: a */
        public int f43001a;

        /* renamed from: b */
        public ConstraintWidget f43002b = null;

        /* renamed from: c */
        public int f43003c = 0;

        /* renamed from: d */
        public ConstraintAnchor f43004d;

        /* renamed from: e */
        public ConstraintAnchor f43005e;

        /* renamed from: f */
        public ConstraintAnchor f43006f;

        /* renamed from: g */
        public ConstraintAnchor f43007g;

        /* renamed from: h */
        public int f43008h = 0;

        /* renamed from: i */
        public int f43009i = 0;

        /* renamed from: j */
        public int f43010j = 0;

        /* renamed from: k */
        public int f43011k = 0;

        /* renamed from: l */
        public int f43012l = 0;

        /* renamed from: m */
        public int f43013m = 0;

        /* renamed from: n */
        public int f43014n = 0;

        /* renamed from: o */
        public int f43015o = 0;

        /* renamed from: p */
        public int f43016p = 0;

        /* renamed from: q */
        public int f43017q = 0;

        public C16800a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.f43001a = i;
            this.f43004d = constraintAnchor;
            this.f43005e = constraintAnchor2;
            this.f43006f = constraintAnchor3;
            this.f43007g = constraintAnchor4;
            this.f43008h = C16799e.this.mo49834s2();
            this.f43009i = C16799e.this.mo49836u2();
            this.f43010j = C16799e.this.mo49835t2();
            this.f43011k = C16799e.this.mo49833r2();
            this.f43017q = i2;
        }

        /* renamed from: b */
        public void mo49782b(ConstraintWidget constraintWidget) {
            int i = 0;
            if (this.f43001a == 0) {
                int U2 = C16799e.this.mo49760f3(constraintWidget, this.f43017q);
                if (constraintWidget.mo49468H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f43016p++;
                    U2 = 0;
                }
                int I2 = C16799e.this.f42988b2;
                if (constraintWidget.mo49566l0() != 8) {
                    i = I2;
                }
                this.f43012l += U2 + i;
                int V2 = C16799e.this.mo49759e3(constraintWidget, this.f43017q);
                if (this.f43002b == null || this.f43003c < V2) {
                    this.f43002b = constraintWidget;
                    this.f43003c = V2;
                    this.f43013m = V2;
                }
            } else {
                int U22 = C16799e.this.mo49760f3(constraintWidget, this.f43017q);
                int V22 = C16799e.this.mo49759e3(constraintWidget, this.f43017q);
                if (constraintWidget.mo49559j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f43016p++;
                    V22 = 0;
                }
                int J2 = C16799e.this.f42989c2;
                if (constraintWidget.mo49566l0() != 8) {
                    i = J2;
                }
                this.f43013m += V22 + i;
                if (this.f43002b == null || this.f43003c < U22) {
                    this.f43002b = constraintWidget;
                    this.f43003c = U22;
                    this.f43012l = U22;
                }
            }
            this.f43015o++;
        }

        /* renamed from: c */
        public void mo49783c() {
            this.f43003c = 0;
            this.f43002b = null;
            this.f43012l = 0;
            this.f43013m = 0;
            this.f43014n = 0;
            this.f43015o = 0;
            this.f43016p = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo49784d(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f43015o
                r2 = 0
                r3 = r2
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.f43014n
                int r4 = r4 + r3
                androidx.constraintlayout.core.widgets.e r5 = androidx.constraintlayout.core.widgets.C16799e.this
                int r5 = r5.f43000n2
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                androidx.constraintlayout.core.widgets.e r4 = androidx.constraintlayout.core.widgets.C16799e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r4.f42999m2
                int r5 = r0.f43014n
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.mo49508U0()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x0384
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f43002b
                if (r3 != 0) goto L_0x002f
                goto L_0x0384
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = r2
            L_0x0036:
                r5 = -1
                r6 = r2
                r7 = r5
                r8 = r7
            L_0x003a:
                if (r6 >= r1) goto L_0x0069
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.f43014n
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C16799e.this
                int r11 = r11.f43000n2
                if (r10 < r11) goto L_0x004f
                goto L_0x0069
            L_0x004f:
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.C16799e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r10.f42999m2
                int r11 = r0.f43014n
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L_0x0066
                int r9 = r9.mo49566l0()
                if (r9 != 0) goto L_0x0066
                if (r7 != r5) goto L_0x0065
                r7 = r6
            L_0x0065:
                r8 = r6
            L_0x0066:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0069:
                int r6 = r0.f43001a
                r9 = 0
                if (r6 != 0) goto L_0x020e
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r0.f43002b
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.C16799e.this
                int r10 = r10.f42977Q1
                r6.mo49515W1(r10)
                int r10 = r0.f43009i
                if (r18 <= 0) goto L_0x0084
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C16799e.this
                int r11 = r11.f42989c2
                int r10 = r10 + r11
            L_0x0084:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f42710R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f43005e
                r11.mo49420a(r12, r10)
                if (r19 == 0) goto L_0x0096
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r6.f42714T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f43007g
                int r12 = r0.f43011k
                r10.mo49420a(r11, r12)
            L_0x0096:
                if (r18 <= 0) goto L_0x00a3
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f43005e
                androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.f42627d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.f42714T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f42710R
                r10.mo49420a(r11, r2)
            L_0x00a3:
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.C16799e.this
                int r10 = r10.f42991e2
                r11 = 3
                if (r10 != r11) goto L_0x00dd
                boolean r10 = r6.mo49581q0()
                if (r10 != 0) goto L_0x00dd
                r10 = r2
            L_0x00b3:
                if (r10 >= r1) goto L_0x00dd
                if (r17 == 0) goto L_0x00bb
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00bc
            L_0x00bb:
                r12 = r10
            L_0x00bc:
                int r13 = r0.f43014n
                int r13 = r13 + r12
                androidx.constraintlayout.core.widgets.e r14 = androidx.constraintlayout.core.widgets.C16799e.this
                int r14 = r14.f43000n2
                if (r13 < r14) goto L_0x00c8
                goto L_0x00dd
            L_0x00c8:
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C16799e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r13.f42999m2
                int r14 = r0.f43014n
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.mo49581q0()
                if (r13 == 0) goto L_0x00da
                goto L_0x00de
            L_0x00da:
                int r10 = r10 + 1
                goto L_0x00b3
            L_0x00dd:
                r12 = r6
            L_0x00de:
                r10 = r2
            L_0x00df:
                if (r10 >= r1) goto L_0x0384
                if (r17 == 0) goto L_0x00e7
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e8
            L_0x00e7:
                r13 = r10
            L_0x00e8:
                int r14 = r0.f43014n
                int r14 = r14 + r13
                androidx.constraintlayout.core.widgets.e r15 = androidx.constraintlayout.core.widgets.C16799e.this
                int r15 = r15.f43000n2
                if (r14 < r15) goto L_0x00f5
                goto L_0x0384
            L_0x00f5:
                androidx.constraintlayout.core.widgets.e r14 = androidx.constraintlayout.core.widgets.C16799e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r14 = r14.f42999m2
                int r15 = r0.f43014n
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L_0x0106
                r14 = r9
                r9 = r11
                goto L_0x0208
            L_0x0106:
                if (r10 != 0) goto L_0x0111
                androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r14.f42708Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f43004d
                int r3 = r0.f43008h
                r14.mo49565l(r15, r11, r3)
            L_0x0111:
                if (r13 != 0) goto L_0x016f
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.C16799e.this
                int r3 = r3.f42976P1
                r11 = 1065353216(0x3f800000, float:1.0)
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C16799e.this
                float r13 = r13.f42982V1
                if (r17 == 0) goto L_0x0125
                float r13 = r11 - r13
            L_0x0125:
                int r15 = r0.f43014n
                if (r15 != 0) goto L_0x0149
                androidx.constraintlayout.core.widgets.e r15 = androidx.constraintlayout.core.widgets.C16799e.this
                int r15 = r15.f42978R1
                if (r15 == r5) goto L_0x0149
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.C16799e.this
                int r3 = r3.f42978R1
                if (r17 == 0) goto L_0x0141
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C16799e.this
                float r13 = r13.f42984X1
            L_0x013f:
                float r11 = r11 - r13
                goto L_0x0147
            L_0x0141:
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C16799e.this
                float r11 = r11.f42984X1
            L_0x0147:
                r13 = r11
                goto L_0x0169
            L_0x0149:
                if (r19 == 0) goto L_0x0169
                androidx.constraintlayout.core.widgets.e r15 = androidx.constraintlayout.core.widgets.C16799e.this
                int r15 = r15.f42980T1
                if (r15 == r5) goto L_0x0169
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.C16799e.this
                int r3 = r3.f42980T1
                if (r17 == 0) goto L_0x0162
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C16799e.this
                float r13 = r13.f42986Z1
                goto L_0x013f
            L_0x0162:
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C16799e.this
                float r11 = r11.f42986Z1
                goto L_0x0147
            L_0x0169:
                r14.mo49452B1(r3)
                r14.mo49449A1(r13)
            L_0x016f:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x017c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f42712S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f43006f
                int r13 = r0.f43010j
                r14.mo49565l(r3, r11, r13)
            L_0x017c:
                if (r9 == 0) goto L_0x01a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f42708Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.f42712S
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C16799e.this
                int r13 = r13.f42988b2
                r3.mo49420a(r11, r13)
                if (r10 != r7) goto L_0x0194
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f42708Q
                int r11 = r0.f43008h
                r3.mo49418B(r11)
            L_0x0194:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r9.f42712S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r14.f42708Q
                r3.mo49420a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x01a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r9.f42712S
                int r9 = r0.f43010j
                r3.mo49418B(r9)
            L_0x01a7:
                if (r14 == r6) goto L_0x0207
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.C16799e.this
                int r3 = r3.f42991e2
                r9 = 3
                if (r3 != r9) goto L_0x01c8
                boolean r3 = r12.mo49581q0()
                if (r3 == 0) goto L_0x01c8
                if (r14 == r12) goto L_0x01c8
                boolean r3 = r14.mo49581q0()
                if (r3 == 0) goto L_0x01c8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f42716U
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.f42716U
                r3.mo49420a(r11, r2)
                goto L_0x0208
            L_0x01c8:
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.C16799e.this
                int r3 = r3.f42991e2
                if (r3 == 0) goto L_0x01ff
                r11 = 1
                if (r3 == r11) goto L_0x01f7
                if (r4 == 0) goto L_0x01e8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f42710R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f43005e
                int r13 = r0.f43009i
                r3.mo49420a(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f42714T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f43007g
                int r13 = r0.f43011k
                r3.mo49420a(r11, r13)
                goto L_0x0208
            L_0x01e8:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f42710R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f42710R
                r3.mo49420a(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f42714T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f42714T
                r3.mo49420a(r11, r2)
                goto L_0x0208
            L_0x01f7:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f42714T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f42714T
                r3.mo49420a(r11, r2)
                goto L_0x0208
            L_0x01ff:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f42710R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f42710R
                r3.mo49420a(r11, r2)
                goto L_0x0208
            L_0x0207:
                r9 = 3
            L_0x0208:
                int r10 = r10 + 1
                r11 = r9
                r9 = r14
                goto L_0x00df
            L_0x020e:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f43002b
                androidx.constraintlayout.core.widgets.e r6 = androidx.constraintlayout.core.widgets.C16799e.this
                int r6 = r6.f42976P1
                r3.mo49452B1(r6)
                int r6 = r0.f43008h
                if (r18 <= 0) goto L_0x0224
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.C16799e.this
                int r10 = r10.f42988b2
                int r6 = r6 + r10
            L_0x0224:
                if (r17 == 0) goto L_0x0246
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f42712S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f43006f
                r10.mo49420a(r11, r6)
                if (r19 == 0) goto L_0x0238
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f42708Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f43004d
                int r11 = r0.f43010j
                r6.mo49420a(r10, r11)
            L_0x0238:
                if (r18 <= 0) goto L_0x0265
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.f43006f
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.f42627d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.f42708Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f42712S
                r6.mo49420a(r10, r2)
                goto L_0x0265
            L_0x0246:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f42708Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f43004d
                r10.mo49420a(r11, r6)
                if (r19 == 0) goto L_0x0258
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f42712S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f43006f
                int r11 = r0.f43010j
                r6.mo49420a(r10, r11)
            L_0x0258:
                if (r18 <= 0) goto L_0x0265
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.f43004d
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.f42627d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.f42712S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f42708Q
                r6.mo49420a(r10, r2)
            L_0x0265:
                r6 = r2
            L_0x0266:
                if (r6 >= r1) goto L_0x0384
                int r10 = r0.f43014n
                int r10 = r10 + r6
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C16799e.this
                int r11 = r11.f43000n2
                if (r10 < r11) goto L_0x0275
                goto L_0x0384
            L_0x0275:
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.C16799e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r10.f42999m2
                int r11 = r0.f43014n
                int r11 = r11 + r6
                r10 = r10[r11]
                if (r10 != 0) goto L_0x0285
                r12 = 1
                goto L_0x0380
            L_0x0285:
                if (r6 != 0) goto L_0x02d1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.f42710R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f43005e
                int r13 = r0.f43009i
                r10.mo49565l(r11, r12, r13)
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C16799e.this
                int r11 = r11.f42977Q1
                androidx.constraintlayout.core.widgets.e r12 = androidx.constraintlayout.core.widgets.C16799e.this
                float r12 = r12.f42983W1
                int r13 = r0.f43014n
                if (r13 != 0) goto L_0x02b5
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C16799e.this
                int r13 = r13.f42979S1
                if (r13 == r5) goto L_0x02b5
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C16799e.this
                int r11 = r11.f42979S1
                androidx.constraintlayout.core.widgets.e r12 = androidx.constraintlayout.core.widgets.C16799e.this
                float r12 = r12.f42985Y1
                goto L_0x02cb
            L_0x02b5:
                if (r19 == 0) goto L_0x02cb
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C16799e.this
                int r13 = r13.f42981U1
                if (r13 == r5) goto L_0x02cb
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C16799e.this
                int r11 = r11.f42981U1
                androidx.constraintlayout.core.widgets.e r12 = androidx.constraintlayout.core.widgets.C16799e.this
                float r12 = r12.f42987a2
            L_0x02cb:
                r10.mo49515W1(r11)
                r10.mo49512V1(r12)
            L_0x02d1:
                int r11 = r1 + -1
                if (r6 != r11) goto L_0x02de
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.f42714T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f43007g
                int r13 = r0.f43011k
                r10.mo49565l(r11, r12, r13)
            L_0x02de:
                if (r9 == 0) goto L_0x0309
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.f42710R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r9.f42714T
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C16799e.this
                int r13 = r13.f42989c2
                r11.mo49420a(r12, r13)
                if (r6 != r7) goto L_0x02f6
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.f42710R
                int r12 = r0.f43009i
                r11.mo49418B(r12)
            L_0x02f6:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.f42714T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r10.f42710R
                r11.mo49420a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r6 != r12) goto L_0x0309
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f42714T
                int r11 = r0.f43011k
                r9.mo49418B(r11)
            L_0x0309:
                if (r10 == r3) goto L_0x037e
                r9 = 2
                if (r17 == 0) goto L_0x033b
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C16799e.this
                int r11 = r11.f42990d2
                if (r11 == 0) goto L_0x0333
                r12 = 1
                if (r11 == r12) goto L_0x032b
                if (r11 == r9) goto L_0x031c
                goto L_0x037e
            L_0x031c:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f42708Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f42708Q
                r9.mo49420a(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f42712S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f42712S
                r9.mo49420a(r11, r2)
                goto L_0x037e
            L_0x032b:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f42708Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f42708Q
                r9.mo49420a(r11, r2)
                goto L_0x037e
            L_0x0333:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f42712S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f42712S
                r9.mo49420a(r11, r2)
                goto L_0x037e
            L_0x033b:
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C16799e.this
                int r11 = r11.f42990d2
                if (r11 == 0) goto L_0x0375
                r12 = 1
                if (r11 == r12) goto L_0x036d
                if (r11 == r9) goto L_0x0349
                goto L_0x037f
            L_0x0349:
                if (r4 == 0) goto L_0x035e
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f42708Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f43004d
                int r13 = r0.f43008h
                r9.mo49420a(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f42712S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f43006f
                int r13 = r0.f43010j
                r9.mo49420a(r11, r13)
                goto L_0x037f
            L_0x035e:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f42708Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f42708Q
                r9.mo49420a(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f42712S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f42712S
                r9.mo49420a(r11, r2)
                goto L_0x037f
            L_0x036d:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f42712S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f42712S
                r9.mo49420a(r11, r2)
                goto L_0x037f
            L_0x0375:
                r12 = 1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f42708Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f42708Q
                r9.mo49420a(r11, r2)
                goto L_0x037f
            L_0x037e:
                r12 = 1
            L_0x037f:
                r9 = r10
            L_0x0380:
                int r6 = r6 + 1
                goto L_0x0266
            L_0x0384:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C16799e.C16800a.mo49784d(boolean, int, boolean):void");
        }

        /* renamed from: e */
        public int mo49785e() {
            if (this.f43001a == 1) {
                return this.f43013m - C16799e.this.f42989c2;
            }
            return this.f43013m;
        }

        /* renamed from: f */
        public int mo49786f() {
            if (this.f43001a == 0) {
                return this.f43012l - C16799e.this.f42988b2;
            }
            return this.f43012l;
        }

        /* renamed from: g */
        public void mo49787g(int i) {
            int i2 = this.f43016p;
            if (i2 != 0) {
                int i3 = this.f43015o;
                int i4 = i / i2;
                int i5 = 0;
                while (i5 < i3 && this.f43014n + i5 < C16799e.this.f43000n2) {
                    ConstraintWidget constraintWidget = C16799e.this.f42999m2[this.f43014n + i5];
                    if (this.f43001a == 0) {
                        if (constraintWidget != null && constraintWidget.mo49468H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f42766w == 0) {
                            C16799e.this.mo49837w2(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.mo49559j0(), constraintWidget.mo49456D());
                        }
                    } else if (constraintWidget != null && constraintWidget.mo49559j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f42768x == 0) {
                        C16799e.this.mo49837w2(constraintWidget, constraintWidget.mo49468H(), constraintWidget.mo49569m0(), ConstraintWidget.DimensionBehaviour.FIXED, i4);
                    }
                    i5++;
                }
                mo49788h();
            }
        }

        /* renamed from: h */
        public final void mo49788h() {
            this.f43012l = 0;
            this.f43013m = 0;
            this.f43002b = null;
            this.f43003c = 0;
            int i = this.f43015o;
            int i2 = 0;
            while (i2 < i && this.f43014n + i2 < C16799e.this.f43000n2) {
                ConstraintWidget constraintWidget = C16799e.this.f42999m2[this.f43014n + i2];
                if (this.f43001a == 0) {
                    int m0 = constraintWidget.mo49569m0();
                    int I2 = C16799e.this.f42988b2;
                    if (constraintWidget.mo49566l0() == 8) {
                        I2 = 0;
                    }
                    this.f43012l += m0 + I2;
                    int V2 = C16799e.this.mo49759e3(constraintWidget, this.f43017q);
                    if (this.f43002b == null || this.f43003c < V2) {
                        this.f43002b = constraintWidget;
                        this.f43003c = V2;
                        this.f43013m = V2;
                    }
                } else {
                    int U2 = C16799e.this.mo49760f3(constraintWidget, this.f43017q);
                    int V22 = C16799e.this.mo49759e3(constraintWidget, this.f43017q);
                    int J2 = C16799e.this.f42989c2;
                    if (constraintWidget.mo49566l0() == 8) {
                        J2 = 0;
                    }
                    this.f43013m += V22 + J2;
                    if (this.f43002b == null || this.f43003c < U2) {
                        this.f43002b = constraintWidget;
                        this.f43003c = U2;
                        this.f43012l = U2;
                    }
                }
                i2++;
            }
        }

        /* renamed from: i */
        public void mo49789i(int i) {
            this.f43014n = i;
        }

        /* renamed from: j */
        public void mo49790j(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.f43001a = i;
            this.f43004d = constraintAnchor;
            this.f43005e = constraintAnchor2;
            this.f43006f = constraintAnchor3;
            this.f43007g = constraintAnchor4;
            this.f43008h = i2;
            this.f43009i = i3;
            this.f43010j = i4;
            this.f43011k = i5;
            this.f43017q = i6;
        }
    }

    /* renamed from: A3 */
    public void mo49754A3(int i) {
        this.f42989c2 = i;
    }

    /* renamed from: B3 */
    public void mo49755B3(int i) {
        this.f42977Q1 = i;
    }

    /* renamed from: C3 */
    public void mo49756C3(int i) {
        this.f42992f2 = i;
    }

    /* renamed from: c3 */
    public final void mo49757c3(boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        if (this.f42998l2 != null && this.f42997k2 != null && this.f42996j2 != null) {
            for (int i2 = 0; i2 < this.f43000n2; i2++) {
                this.f42999m2[i2].mo49508U0();
            }
            int[] iArr = this.f42998l2;
            int i3 = iArr[0];
            int i4 = iArr[1];
            float f2 = this.f42982V1;
            ConstraintWidget constraintWidget2 = null;
            int i5 = 0;
            while (i5 < i3) {
                if (z) {
                    i = (i3 - i5) - 1;
                    f = 1.0f - this.f42982V1;
                } else {
                    f = f2;
                    i = i5;
                }
                ConstraintWidget constraintWidget3 = this.f42997k2[i];
                if (!(constraintWidget3 == null || constraintWidget3.mo49566l0() == 8)) {
                    if (i5 == 0) {
                        constraintWidget3.mo49565l(constraintWidget3.f42708Q, this.f42708Q, mo49834s2());
                        constraintWidget3.mo49452B1(this.f42976P1);
                        constraintWidget3.mo49449A1(f);
                    }
                    if (i5 == i3 - 1) {
                        constraintWidget3.mo49565l(constraintWidget3.f42712S, this.f42712S, mo49835t2());
                    }
                    if (i5 > 0 && constraintWidget2 != null) {
                        constraintWidget3.mo49565l(constraintWidget3.f42708Q, constraintWidget2.f42712S, this.f42988b2);
                        constraintWidget2.mo49565l(constraintWidget2.f42712S, constraintWidget3.f42708Q, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i5++;
                f2 = f;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                ConstraintWidget constraintWidget4 = this.f42996j2[i6];
                if (!(constraintWidget4 == null || constraintWidget4.mo49566l0() == 8)) {
                    if (i6 == 0) {
                        constraintWidget4.mo49565l(constraintWidget4.f42710R, this.f42710R, mo49836u2());
                        constraintWidget4.mo49515W1(this.f42977Q1);
                        constraintWidget4.mo49512V1(this.f42983W1);
                    }
                    if (i6 == i4 - 1) {
                        constraintWidget4.mo49565l(constraintWidget4.f42714T, this.f42714T, mo49833r2());
                    }
                    if (i6 > 0 && constraintWidget2 != null) {
                        constraintWidget4.mo49565l(constraintWidget4.f42710R, constraintWidget2.f42714T, this.f42989c2);
                        constraintWidget2.mo49565l(constraintWidget2.f42714T, constraintWidget4.f42710R, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.f42994h2 == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.f42999m2;
                    if (!(i9 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i9]) == null || constraintWidget.mo49566l0() == 8)) {
                        ConstraintWidget constraintWidget5 = this.f42997k2[i7];
                        ConstraintWidget constraintWidget6 = this.f42996j2[i8];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.mo49565l(constraintWidget.f42708Q, constraintWidget5.f42708Q, 0);
                            constraintWidget.mo49565l(constraintWidget.f42712S, constraintWidget5.f42712S, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.mo49565l(constraintWidget.f42710R, constraintWidget6.f42710R, 0);
                            constraintWidget.mo49565l(constraintWidget.f42714T, constraintWidget6.f42714T, 0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d3 */
    public float mo49758d3() {
        return (float) this.f42993g2;
    }

    /* renamed from: e3 */
    public final int mo49759e3(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.mo49559j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.f42768x;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.f42684E * ((float) i));
                if (i3 != constraintWidget.mo49456D()) {
                    constraintWidget.mo49488N1(true);
                    mo49837w2(constraintWidget, constraintWidget.mo49468H(), constraintWidget.mo49569m0(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.mo49456D();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.mo49569m0()) * constraintWidget.f42733f0) + 0.5f);
                }
            }
        }
        return constraintWidget.mo49456D();
    }

    /* renamed from: f3 */
    public final int mo49760f3(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.mo49468H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.f42766w;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.f42678B * ((float) i));
                if (i3 != constraintWidget.mo49569m0()) {
                    constraintWidget.mo49488N1(true);
                    mo49837w2(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.mo49559j0(), constraintWidget.mo49456D());
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.mo49569m0();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.mo49456D()) * constraintWidget.f42733f0) + 0.5f);
                }
            }
        }
        return constraintWidget.mo49569m0();
    }

    /* renamed from: g */
    public void mo49546g(C16643e eVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        super.mo49546g(eVar, z);
        if (mo49507U() == null || !((C16798d) mo49507U()).mo49731O2()) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i = this.f42992f2;
        if (i != 0) {
            if (i == 1) {
                int size = this.f42995i2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C16800a aVar = this.f42995i2.get(i2);
                    if (i2 == size - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aVar.mo49784d(z2, i2, z3);
                }
            } else if (i == 2) {
                mo49757c3(z2);
            } else if (i == 3) {
                int size2 = this.f42995i2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C16800a aVar2 = this.f42995i2.get(i3);
                    if (i3 == size2 - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    aVar2.mo49784d(z2, i3, z4);
                }
            }
        } else if (this.f42995i2.size() > 0) {
            this.f42995i2.get(0).mo49784d(z2, 0, true);
        }
        mo49840z2(false);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005e  */
    /* renamed from: g3 */
    public final void mo49761g3(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            r10 = this;
            r0 = 0
            if (r13 != 0) goto L_0x0026
            int r1 = r10.f42993g2
            if (r1 > 0) goto L_0x0023
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x000a:
            if (r2 >= r12) goto L_0x0023
            if (r2 <= 0) goto L_0x0011
            int r4 = r10.f42988b2
            int r3 = r3 + r4
        L_0x0011:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0016
            goto L_0x0020
        L_0x0016:
            int r4 = r10.mo49760f3(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            int r1 = r1 + 1
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0023:
            r2 = r1
            r1 = r0
            goto L_0x0047
        L_0x0026:
            int r1 = r10.f42993g2
            if (r1 > 0) goto L_0x0046
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x002d:
            if (r2 >= r12) goto L_0x0046
            if (r2 <= 0) goto L_0x0034
            int r4 = r10.f42989c2
            int r3 = r3 + r4
        L_0x0034:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            int r4 = r10.mo49759e3(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x0041
            goto L_0x0046
        L_0x0041:
            int r1 = r1 + 1
        L_0x0043:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x0046:
            r2 = r0
        L_0x0047:
            int[] r3 = r10.f42998l2
            if (r3 != 0) goto L_0x0050
            r3 = 2
            int[] r3 = new int[r3]
            r10.f42998l2 = r3
        L_0x0050:
            r3 = 1
            if (r1 != 0) goto L_0x0055
            if (r13 == r3) goto L_0x0059
        L_0x0055:
            if (r2 != 0) goto L_0x005b
            if (r13 != 0) goto L_0x005b
        L_0x0059:
            r4 = r3
            goto L_0x005c
        L_0x005b:
            r4 = r0
        L_0x005c:
            if (r4 != 0) goto L_0x011d
            if (r13 != 0) goto L_0x006a
            float r1 = (float) r12
            float r5 = (float) r2
            float r1 = r1 / r5
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            goto L_0x0073
        L_0x006a:
            float r2 = (float) r12
            float r5 = (float) r1
            float r2 = r2 / r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
        L_0x0073:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r10.f42997k2
            r6 = 0
            if (r5 == 0) goto L_0x0080
            int r7 = r5.length
            if (r7 >= r2) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0084
        L_0x0080:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r2]
            r10.f42997k2 = r5
        L_0x0084:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r10.f42996j2
            if (r5 == 0) goto L_0x0090
            int r7 = r5.length
            if (r7 >= r1) goto L_0x008c
            goto L_0x0090
        L_0x008c:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0094
        L_0x0090:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r10.f42996j2 = r5
        L_0x0094:
            r5 = r0
        L_0x0095:
            if (r5 >= r2) goto L_0x00d9
            r6 = r0
        L_0x0098:
            if (r6 >= r1) goto L_0x00d6
            int r7 = r6 * r2
            int r7 = r7 + r5
            if (r13 != r3) goto L_0x00a2
            int r7 = r5 * r1
            int r7 = r7 + r6
        L_0x00a2:
            int r8 = r11.length
            if (r7 < r8) goto L_0x00a6
            goto L_0x00d3
        L_0x00a6:
            r7 = r11[r7]
            if (r7 != 0) goto L_0x00ab
            goto L_0x00d3
        L_0x00ab:
            int r8 = r10.mo49760f3(r7, r14)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r9 = r10.f42997k2
            r9 = r9[r5]
            if (r9 == 0) goto L_0x00bb
            int r9 = r9.mo49569m0()
            if (r9 >= r8) goto L_0x00bf
        L_0x00bb:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r10.f42997k2
            r8[r5] = r7
        L_0x00bf:
            int r8 = r10.mo49759e3(r7, r14)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r9 = r10.f42996j2
            r9 = r9[r6]
            if (r9 == 0) goto L_0x00cf
            int r9 = r9.mo49456D()
            if (r9 >= r8) goto L_0x00d3
        L_0x00cf:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r10.f42996j2
            r8[r6] = r7
        L_0x00d3:
            int r6 = r6 + 1
            goto L_0x0098
        L_0x00d6:
            int r5 = r5 + 1
            goto L_0x0095
        L_0x00d9:
            r5 = r0
            r6 = r5
        L_0x00db:
            if (r5 >= r2) goto L_0x00f0
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r10.f42997k2
            r7 = r7[r5]
            if (r7 == 0) goto L_0x00ed
            if (r5 <= 0) goto L_0x00e8
            int r8 = r10.f42988b2
            int r6 = r6 + r8
        L_0x00e8:
            int r7 = r10.mo49760f3(r7, r14)
            int r6 = r6 + r7
        L_0x00ed:
            int r5 = r5 + 1
            goto L_0x00db
        L_0x00f0:
            r5 = r0
            r7 = r5
        L_0x00f2:
            if (r5 >= r1) goto L_0x0107
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r10.f42996j2
            r8 = r8[r5]
            if (r8 == 0) goto L_0x0104
            if (r5 <= 0) goto L_0x00ff
            int r9 = r10.f42989c2
            int r7 = r7 + r9
        L_0x00ff:
            int r8 = r10.mo49759e3(r8, r14)
            int r7 = r7 + r8
        L_0x0104:
            int r5 = r5 + 1
            goto L_0x00f2
        L_0x0107:
            r15[r0] = r6
            r15[r3] = r7
            if (r13 != 0) goto L_0x0115
            if (r6 <= r14) goto L_0x0059
            if (r2 <= r3) goto L_0x0059
            int r2 = r2 + -1
            goto L_0x005c
        L_0x0115:
            if (r7 <= r14) goto L_0x0059
            if (r1 <= r3) goto L_0x0059
            int r1 = r1 + -1
            goto L_0x005c
        L_0x011d:
            int[] r11 = r10.f42998l2
            r11[r0] = r2
            r11[r3] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C16799e.mo49761g3(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    /* renamed from: h3 */
    public final void mo49762h3(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        ConstraintAnchor constraintAnchor;
        int i5;
        int i6;
        int i7;
        ConstraintAnchor constraintAnchor2;
        boolean z2;
        int i8;
        boolean z3;
        int i9;
        int i10 = i;
        int i11 = i3;
        if (i10 != 0) {
            this.f42995i2.clear();
            C16800a aVar = new C16800a(i2, this.f42708Q, this.f42710R, this.f42712S, this.f42714T, i3);
            this.f42995i2.add(aVar);
            if (i2 == 0) {
                i4 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i13 < i10) {
                    ConstraintWidget constraintWidget = constraintWidgetArr[i13];
                    int f3 = mo49760f3(constraintWidget, i11);
                    if (constraintWidget.mo49468H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    int i14 = i4;
                    if ((i12 == i11 || this.f42988b2 + i12 + f3 > i11) && aVar.f43002b != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && i13 > 0 && (i9 = this.f42993g2) > 0 && i13 % i9 == 0) {
                        z3 = true;
                    }
                    if (z3) {
                        aVar = new C16800a(i2, this.f42708Q, this.f42710R, this.f42712S, this.f42714T, i3);
                        aVar.mo49789i(i13);
                        this.f42995i2.add(aVar);
                    } else if (i13 > 0) {
                        i12 += this.f42988b2 + f3;
                        aVar.mo49782b(constraintWidget);
                        i13++;
                        i4 = i14;
                    }
                    i12 = f3;
                    aVar.mo49782b(constraintWidget);
                    i13++;
                    i4 = i14;
                }
            } else {
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i17 < i10) {
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i17];
                    int e3 = mo49759e3(constraintWidget2, i11);
                    if (constraintWidget2.mo49559j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    int i18 = i4;
                    if ((i16 == i11 || this.f42989c2 + i16 + e3 > i11) && aVar.f43002b != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 && i17 > 0 && (i8 = this.f42993g2) > 0 && i17 % i8 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new C16800a(i2, this.f42708Q, this.f42710R, this.f42712S, this.f42714T, i3);
                        aVar.mo49789i(i17);
                        this.f42995i2.add(aVar);
                    } else if (i17 > 0) {
                        i16 += this.f42989c2 + e3;
                        aVar.mo49782b(constraintWidget2);
                        i17++;
                        i15 = i18;
                    }
                    i16 = e3;
                    aVar.mo49782b(constraintWidget2);
                    i17++;
                    i15 = i18;
                }
            }
            int size = this.f42995i2.size();
            ConstraintAnchor constraintAnchor3 = this.f42708Q;
            ConstraintAnchor constraintAnchor4 = this.f42710R;
            ConstraintAnchor constraintAnchor5 = this.f42712S;
            ConstraintAnchor constraintAnchor6 = this.f42714T;
            int s2 = mo49834s2();
            int u2 = mo49836u2();
            int t2 = mo49835t2();
            int r2 = mo49833r2();
            ConstraintWidget.DimensionBehaviour H = mo49468H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (H == dimensionBehaviour || mo49559j0() == dimensionBehaviour) {
                z = true;
            } else {
                z = false;
            }
            if (i4 > 0 && z) {
                for (int i19 = 0; i19 < size; i19++) {
                    C16800a aVar2 = this.f42995i2.get(i19);
                    if (i2 == 0) {
                        aVar2.mo49787g(i11 - aVar2.mo49786f());
                    } else {
                        aVar2.mo49787g(i11 - aVar2.mo49785e());
                    }
                }
            }
            int i20 = u2;
            int i21 = t2;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = s2;
            ConstraintAnchor constraintAnchor7 = constraintAnchor4;
            ConstraintAnchor constraintAnchor8 = constraintAnchor3;
            int i26 = r2;
            while (i24 < size) {
                C16800a aVar3 = this.f42995i2.get(i24);
                if (i2 == 0) {
                    if (i24 < size - 1) {
                        constraintAnchor2 = this.f42995i2.get(i24 + 1).f43002b.f42710R;
                        i7 = 0;
                    } else {
                        constraintAnchor2 = this.f42714T;
                        i7 = mo49833r2();
                    }
                    ConstraintAnchor constraintAnchor9 = aVar3.f43002b.f42714T;
                    ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                    int i27 = i22;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                    int i28 = i23;
                    ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                    ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                    i5 = i24;
                    aVar3.mo49790j(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i25, i20, i21, i7, i3);
                    int max = Math.max(i28, aVar3.mo49786f());
                    i22 = i27 + aVar3.mo49785e();
                    if (i5 > 0) {
                        i22 += this.f42989c2;
                    }
                    constraintAnchor8 = constraintAnchor11;
                    i23 = max;
                    i20 = 0;
                    constraintAnchor7 = constraintAnchor9;
                    constraintAnchor = constraintAnchor14;
                    int i29 = i7;
                    constraintAnchor6 = constraintAnchor2;
                    i26 = i29;
                } else {
                    ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                    int i30 = i22;
                    int i31 = i23;
                    i5 = i24;
                    if (i5 < size - 1) {
                        constraintAnchor = this.f42995i2.get(i5 + 1).f43002b.f42708Q;
                        i6 = 0;
                    } else {
                        constraintAnchor = this.f42712S;
                        i6 = mo49835t2();
                    }
                    ConstraintAnchor constraintAnchor16 = aVar3.f43002b.f42712S;
                    aVar3.mo49790j(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i25, i20, i6, i26, i3);
                    i23 = i31 + aVar3.mo49786f();
                    int max2 = Math.max(i30, aVar3.mo49785e());
                    if (i5 > 0) {
                        i23 += this.f42988b2;
                    }
                    i22 = max2;
                    i25 = 0;
                    i21 = i6;
                    constraintAnchor8 = constraintAnchor16;
                }
                i24 = i5 + 1;
                int i32 = i3;
                constraintAnchor5 = constraintAnchor;
            }
            iArr[0] = i23;
            iArr[1] = i22;
        }
    }

    /* renamed from: i3 */
    public final void mo49763i3(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        ConstraintAnchor constraintAnchor;
        int i5;
        int i6;
        int i7;
        ConstraintAnchor constraintAnchor2;
        boolean z2;
        int i8;
        boolean z3;
        int i9;
        int i10 = i;
        int i11 = i3;
        if (i10 != 0) {
            this.f42995i2.clear();
            C16800a aVar = new C16800a(i2, this.f42708Q, this.f42710R, this.f42712S, this.f42714T, i3);
            this.f42995i2.add(aVar);
            if (i2 == 0) {
                int i12 = 0;
                i4 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i14 < i10) {
                    int i15 = i12 + 1;
                    ConstraintWidget constraintWidget = constraintWidgetArr[i14];
                    int f3 = mo49760f3(constraintWidget, i11);
                    if (constraintWidget.mo49468H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    int i16 = i4;
                    if ((i13 == i11 || this.f42988b2 + i13 + f3 > i11) && aVar.f43002b != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && i14 > 0 && (i9 = this.f42993g2) > 0 && i15 > i9) {
                        z3 = true;
                    }
                    if (z3) {
                        aVar = new C16800a(i2, this.f42708Q, this.f42710R, this.f42712S, this.f42714T, i3);
                        aVar.mo49789i(i14);
                        this.f42995i2.add(aVar);
                        i12 = i15;
                        i13 = f3;
                    } else {
                        if (i14 > 0) {
                            i13 += this.f42988b2 + f3;
                        } else {
                            i13 = f3;
                        }
                        i12 = 0;
                    }
                    aVar.mo49782b(constraintWidget);
                    i14++;
                    i4 = i16;
                }
            } else {
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                while (i19 < i10) {
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i19];
                    int e3 = mo49759e3(constraintWidget2, i11);
                    if (constraintWidget2.mo49559j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    int i20 = i4;
                    if ((i17 == i11 || this.f42989c2 + i17 + e3 > i11) && aVar.f43002b != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 && i19 > 0 && (i8 = this.f42993g2) > 0 && i8 < 0) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new C16800a(i2, this.f42708Q, this.f42710R, this.f42712S, this.f42714T, i3);
                        aVar.mo49789i(i19);
                        this.f42995i2.add(aVar);
                    } else if (i19 > 0) {
                        i17 += this.f42989c2 + e3;
                        aVar.mo49782b(constraintWidget2);
                        i19++;
                        i18 = i20;
                    }
                    i17 = e3;
                    aVar.mo49782b(constraintWidget2);
                    i19++;
                    i18 = i20;
                }
            }
            int size = this.f42995i2.size();
            ConstraintAnchor constraintAnchor3 = this.f42708Q;
            ConstraintAnchor constraintAnchor4 = this.f42710R;
            ConstraintAnchor constraintAnchor5 = this.f42712S;
            ConstraintAnchor constraintAnchor6 = this.f42714T;
            int s2 = mo49834s2();
            int u2 = mo49836u2();
            int t2 = mo49835t2();
            int r2 = mo49833r2();
            ConstraintWidget.DimensionBehaviour H = mo49468H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (H == dimensionBehaviour || mo49559j0() == dimensionBehaviour) {
                z = true;
            } else {
                z = false;
            }
            if (i4 > 0 && z) {
                for (int i21 = 0; i21 < size; i21++) {
                    C16800a aVar2 = this.f42995i2.get(i21);
                    if (i2 == 0) {
                        aVar2.mo49787g(i11 - aVar2.mo49786f());
                    } else {
                        aVar2.mo49787g(i11 - aVar2.mo49785e());
                    }
                }
            }
            int i22 = u2;
            int i23 = t2;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = s2;
            ConstraintAnchor constraintAnchor7 = constraintAnchor4;
            ConstraintAnchor constraintAnchor8 = constraintAnchor3;
            int i28 = r2;
            while (i26 < size) {
                C16800a aVar3 = this.f42995i2.get(i26);
                if (i2 == 0) {
                    if (i26 < size - 1) {
                        constraintAnchor2 = this.f42995i2.get(i26 + 1).f43002b.f42710R;
                        i7 = 0;
                    } else {
                        constraintAnchor2 = this.f42714T;
                        i7 = mo49833r2();
                    }
                    ConstraintAnchor constraintAnchor9 = aVar3.f43002b.f42714T;
                    ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                    int i29 = i24;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                    int i30 = i25;
                    ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                    ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                    i5 = i26;
                    aVar3.mo49790j(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i27, i22, i23, i7, i3);
                    int max = Math.max(i30, aVar3.mo49786f());
                    i24 = i29 + aVar3.mo49785e();
                    if (i5 > 0) {
                        i24 += this.f42989c2;
                    }
                    constraintAnchor8 = constraintAnchor11;
                    i25 = max;
                    i22 = 0;
                    constraintAnchor7 = constraintAnchor9;
                    constraintAnchor = constraintAnchor14;
                    int i31 = i7;
                    constraintAnchor6 = constraintAnchor2;
                    i28 = i31;
                } else {
                    ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                    int i32 = i24;
                    int i33 = i25;
                    i5 = i26;
                    if (i5 < size - 1) {
                        constraintAnchor = this.f42995i2.get(i5 + 1).f43002b.f42708Q;
                        i6 = 0;
                    } else {
                        constraintAnchor = this.f42712S;
                        i6 = mo49835t2();
                    }
                    ConstraintAnchor constraintAnchor16 = aVar3.f43002b.f42712S;
                    aVar3.mo49790j(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i27, i22, i6, i28, i3);
                    i25 = i33 + aVar3.mo49786f();
                    int max2 = Math.max(i32, aVar3.mo49785e());
                    if (i5 > 0) {
                        i25 += this.f42988b2;
                    }
                    i24 = max2;
                    i27 = 0;
                    i23 = i6;
                    constraintAnchor8 = constraintAnchor16;
                }
                i26 = i5 + 1;
                int i34 = i3;
                constraintAnchor5 = constraintAnchor;
            }
            iArr[0] = i25;
            iArr[1] = i24;
        }
    }

    /* renamed from: j3 */
    public final void mo49764j3(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        C16800a aVar;
        int i4 = i;
        if (i4 != 0) {
            if (this.f42995i2.size() == 0) {
                aVar = new C16800a(i2, this.f42708Q, this.f42710R, this.f42712S, this.f42714T, i3);
                this.f42995i2.add(aVar);
            } else {
                C16800a aVar2 = this.f42995i2.get(0);
                aVar2.mo49783c();
                aVar = aVar2;
                aVar.mo49790j(i2, this.f42708Q, this.f42710R, this.f42712S, this.f42714T, mo49834s2(), mo49836u2(), mo49835t2(), mo49833r2(), i3);
            }
            for (int i5 = 0; i5 < i4; i5++) {
                aVar.mo49782b(constraintWidgetArr[i5]);
            }
            iArr[0] = aVar.mo49786f();
            iArr[1] = aVar.mo49785e();
        }
    }

    /* renamed from: k3 */
    public void mo49765k3(float f) {
        this.f42984X1 = f;
    }

    /* renamed from: l3 */
    public void mo49766l3(int i) {
        this.f42978R1 = i;
    }

    /* renamed from: m3 */
    public void mo49767m3(float f) {
        this.f42985Y1 = f;
    }

    /* renamed from: n */
    public void mo49571n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo49571n(constraintWidget, hashMap);
        C16799e eVar = (C16799e) constraintWidget;
        this.f42976P1 = eVar.f42976P1;
        this.f42977Q1 = eVar.f42977Q1;
        this.f42978R1 = eVar.f42978R1;
        this.f42979S1 = eVar.f42979S1;
        this.f42980T1 = eVar.f42980T1;
        this.f42981U1 = eVar.f42981U1;
        this.f42982V1 = eVar.f42982V1;
        this.f42983W1 = eVar.f42983W1;
        this.f42984X1 = eVar.f42984X1;
        this.f42985Y1 = eVar.f42985Y1;
        this.f42986Z1 = eVar.f42986Z1;
        this.f42987a2 = eVar.f42987a2;
        this.f42988b2 = eVar.f42988b2;
        this.f42989c2 = eVar.f42989c2;
        this.f42990d2 = eVar.f42990d2;
        this.f42991e2 = eVar.f42991e2;
        this.f42992f2 = eVar.f42992f2;
        this.f42993g2 = eVar.f42993g2;
        this.f42994h2 = eVar.f42994h2;
    }

    /* renamed from: n3 */
    public void mo49768n3(int i) {
        this.f42979S1 = i;
    }

    /* renamed from: o3 */
    public void mo49769o3(int i) {
        this.f42990d2 = i;
    }

    /* renamed from: p3 */
    public void mo49770p3(float f) {
        this.f42982V1 = f;
    }

    /* renamed from: q3 */
    public void mo49771q3(int i) {
        this.f42988b2 = i;
    }

    /* renamed from: r3 */
    public void mo49772r3(int i) {
        this.f42976P1 = i;
    }

    /* renamed from: s3 */
    public void mo49773s3(float f) {
        this.f42986Z1 = f;
    }

    /* renamed from: t3 */
    public void mo49774t3(int i) {
        this.f42980T1 = i;
    }

    /* renamed from: u3 */
    public void mo49775u3(float f) {
        this.f42987a2 = f;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49776v2(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.f43035B1
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.mo49838x2()
            if (r0 != 0) goto L_0x001c
            r6.mo49820A2(r11, r11)
            r6.mo49840z2(r11)
            return
        L_0x001c:
            int r12 = r18.mo49834s2()
            int r13 = r18.mo49835t2()
            int r14 = r18.mo49836u2()
            int r15 = r18.mo49833r2()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.f42994h2
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004c
            int r2 = r6.f42976P1
            if (r2 != r1) goto L_0x0045
            r6.f42976P1 = r11
        L_0x0045:
            int r2 = r6.f42977Q1
            if (r2 != r1) goto L_0x0058
            r6.f42977Q1 = r11
            goto L_0x0058
        L_0x004c:
            int r2 = r6.f42976P1
            if (r2 != r1) goto L_0x0052
            r6.f42976P1 = r11
        L_0x0052:
            int r2 = r6.f42977Q1
            if (r2 != r1) goto L_0x0058
            r6.f42977Q1 = r11
        L_0x0058:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r6.f43034A1
            r2 = r11
            r3 = r2
        L_0x005c:
            int r11 = r6.f43035B1
            r0 = 8
            if (r2 >= r11) goto L_0x0072
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r11 = r6.f43034A1
            r11 = r11[r2]
            int r11 = r11.mo49566l0()
            if (r11 != r0) goto L_0x006e
            int r3 = r3 + 1
        L_0x006e:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005c
        L_0x0072:
            if (r3 <= 0) goto L_0x0091
            int r11 = r11 - r3
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r11]
            r2 = 0
            r3 = 0
        L_0x0079:
            int r11 = r6.f43035B1
            if (r2 >= r11) goto L_0x008f
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r11 = r6.f43034A1
            r11 = r11[r2]
            int r4 = r11.mo49566l0()
            if (r4 == r0) goto L_0x008b
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x008b:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0079
        L_0x008f:
            r2 = r3
            goto L_0x0092
        L_0x0091:
            r2 = r11
        L_0x0092:
            r6.f42999m2 = r1
            r6.f43000n2 = r2
            int r0 = r6.f42992f2
            if (r0 == 0) goto L_0x00cf
            r4 = 1
            if (r0 == r4) goto L_0x00c2
            r3 = 2
            if (r0 == r3) goto L_0x00b5
            r3 = 3
            if (r0 == r3) goto L_0x00a8
            r11 = r4
            r17 = r5
        L_0x00a6:
            r0 = 0
            goto L_0x00dc
        L_0x00a8:
            int r3 = r6.f42994h2
            r0 = r18
            r11 = r4
            r4 = r16
            r17 = r5
            r0.mo49763i3(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00b5:
            r11 = r4
            r17 = r5
            int r3 = r6.f42994h2
            r0 = r18
            r4 = r16
            r0.mo49761g3(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00c2:
            r11 = r4
            r17 = r5
            int r3 = r6.f42994h2
            r0 = r18
            r4 = r16
            r0.mo49762h3(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00cf:
            r17 = r5
            r11 = 1
            int r3 = r6.f42994h2
            r0 = r18
            r4 = r16
            r0.mo49764j3(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00dc:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00ec
            r1 = r8
            goto L_0x00f7
        L_0x00ec:
            if (r7 != r3) goto L_0x00f3
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00f7
        L_0x00f3:
            if (r7 != 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r1 = r0
        L_0x00f7:
            if (r9 != r4) goto L_0x00fb
            r2 = r10
            goto L_0x0106
        L_0x00fb:
            if (r9 != r3) goto L_0x0102
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x0106
        L_0x0102:
            if (r9 != 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r2 = r0
        L_0x0106:
            r6.mo49820A2(r1, r2)
            r6.mo49533c2(r1)
            r6.mo49607y1(r2)
            int r1 = r6.f43035B1
            if (r1 <= 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r11 = r0
        L_0x0115:
            r6.mo49840z2(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C16799e.mo49776v2(int, int, int, int):void");
    }

    /* renamed from: v3 */
    public void mo49777v3(int i) {
        this.f42981U1 = i;
    }

    /* renamed from: w3 */
    public void mo49778w3(int i) {
        this.f42993g2 = i;
    }

    /* renamed from: x3 */
    public void mo49779x3(int i) {
        this.f42994h2 = i;
    }

    /* renamed from: y3 */
    public void mo49780y3(int i) {
        this.f42991e2 = i;
    }

    /* renamed from: z3 */
    public void mo49781z3(float f) {
        this.f42983W1 = f;
    }
}
