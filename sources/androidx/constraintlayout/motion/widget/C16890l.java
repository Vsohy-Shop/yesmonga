package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.C16831d;
import androidx.constraintlayout.widget.C16944e;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.l */
public class C16890l extends C16881f {

    /* renamed from: V */
    public static final String f43540V = "KeyTimeCycle";

    /* renamed from: W */
    public static final String f43541W = "KeyTimeCycle";

    /* renamed from: X */
    public static final String f43542X = "wavePeriod";

    /* renamed from: Y */
    public static final String f43543Y = "waveOffset";

    /* renamed from: Z */
    public static final String f43544Z = "waveShape";

    /* renamed from: a0 */
    public static final int f43545a0 = 0;

    /* renamed from: b0 */
    public static final int f43546b0 = 1;

    /* renamed from: c0 */
    public static final int f43547c0 = 2;

    /* renamed from: d0 */
    public static final int f43548d0 = 3;

    /* renamed from: e0 */
    public static final int f43549e0 = 4;

    /* renamed from: f0 */
    public static final int f43550f0 = 5;

    /* renamed from: g0 */
    public static final int f43551g0 = 6;

    /* renamed from: h0 */
    public static final int f43552h0 = 3;

    /* renamed from: D */
    public String f43553D;

    /* renamed from: E */
    public int f43554E = -1;

    /* renamed from: F */
    public float f43555F = Float.NaN;

    /* renamed from: G */
    public float f43556G = Float.NaN;

    /* renamed from: H */
    public float f43557H = Float.NaN;

    /* renamed from: I */
    public float f43558I = Float.NaN;

    /* renamed from: J */
    public float f43559J = Float.NaN;

    /* renamed from: K */
    public float f43560K = Float.NaN;

    /* renamed from: L */
    public float f43561L = Float.NaN;

    /* renamed from: M */
    public float f43562M = Float.NaN;

    /* renamed from: N */
    public float f43563N = Float.NaN;

    /* renamed from: O */
    public float f43564O = Float.NaN;

    /* renamed from: P */
    public float f43565P = Float.NaN;

    /* renamed from: Q */
    public float f43566Q = Float.NaN;

    /* renamed from: R */
    public int f43567R = 0;

    /* renamed from: S */
    public String f43568S = null;

    /* renamed from: T */
    public float f43569T = Float.NaN;

    /* renamed from: U */
    public float f43570U = 0.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.l$a */
    public static class C16891a {

        /* renamed from: a */
        public static final int f43571a = 1;

        /* renamed from: b */
        public static final int f43572b = 2;

        /* renamed from: c */
        public static final int f43573c = 4;

        /* renamed from: d */
        public static final int f43574d = 5;

        /* renamed from: e */
        public static final int f43575e = 6;

        /* renamed from: f */
        public static final int f43576f = 8;

        /* renamed from: g */
        public static final int f43577g = 7;

        /* renamed from: h */
        public static final int f43578h = 9;

        /* renamed from: i */
        public static final int f43579i = 10;

        /* renamed from: j */
        public static final int f43580j = 12;

        /* renamed from: k */
        public static final int f43581k = 13;

        /* renamed from: l */
        public static final int f43582l = 14;

        /* renamed from: m */
        public static final int f43583m = 15;

        /* renamed from: n */
        public static final int f43584n = 16;

        /* renamed from: o */
        public static final int f43585o = 17;

        /* renamed from: p */
        public static final int f43586p = 18;

        /* renamed from: q */
        public static final int f43587q = 19;

        /* renamed from: r */
        public static final int f43588r = 20;

        /* renamed from: s */
        public static final int f43589s = 21;

        /* renamed from: t */
        public static SparseIntArray f43590t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f43590t = sparseIntArray;
            sparseIntArray.append(C16944e.C16957m.KeyTimeCycle_android_alpha, 1);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_android_elevation, 2);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_android_rotation, 4);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_android_rotationX, 5);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_android_rotationY, 6);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_android_scaleX, 7);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_transitionPathRotate, 8);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_transitionEasing, 9);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_motionTarget, 10);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_framePosition, 12);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_curveFit, 13);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_android_scaleY, 14);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_android_translationX, 15);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_android_translationY, 16);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_android_translationZ, 17);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_motionProgress, 18);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_wavePeriod, 20);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_waveOffset, 21);
            f43590t.append(C16944e.C16957m.KeyTimeCycle_waveShape, 19);
        }

        /* renamed from: a */
        public static void m77801a(C16890l lVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f43590t.get(index)) {
                    case 1:
                        float unused = lVar.f43555F = typedArray.getFloat(index, lVar.f43555F);
                        break;
                    case 2:
                        float unused2 = lVar.f43556G = typedArray.getDimension(index, lVar.f43556G);
                        break;
                    case 4:
                        float unused3 = lVar.f43557H = typedArray.getFloat(index, lVar.f43557H);
                        break;
                    case 5:
                        float unused4 = lVar.f43558I = typedArray.getFloat(index, lVar.f43558I);
                        break;
                    case 6:
                        float unused5 = lVar.f43559J = typedArray.getFloat(index, lVar.f43559J);
                        break;
                    case 7:
                        float unused6 = lVar.f43561L = typedArray.getFloat(index, lVar.f43561L);
                        break;
                    case 8:
                        float unused7 = lVar.f43560K = typedArray.getFloat(index, lVar.f43560K);
                        break;
                    case 9:
                        String unused8 = lVar.f43553D = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f43205d2) {
                            if (typedArray.peekValue(index).type != 3) {
                                lVar.f43394b = typedArray.getResourceId(index, lVar.f43394b);
                                break;
                            } else {
                                lVar.f43395c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, lVar.f43394b);
                            lVar.f43394b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                lVar.f43395c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        lVar.f43393a = typedArray.getInt(index, lVar.f43393a);
                        break;
                    case 13:
                        int unused9 = lVar.f43554E = typedArray.getInteger(index, lVar.f43554E);
                        break;
                    case 14:
                        float unused10 = lVar.f43562M = typedArray.getFloat(index, lVar.f43562M);
                        break;
                    case 15:
                        float unused11 = lVar.f43563N = typedArray.getDimension(index, lVar.f43563N);
                        break;
                    case 16:
                        float unused12 = lVar.f43564O = typedArray.getDimension(index, lVar.f43564O);
                        break;
                    case 17:
                        float unused13 = lVar.f43565P = typedArray.getDimension(index, lVar.f43565P);
                        break;
                    case 18:
                        float unused14 = lVar.f43566Q = typedArray.getFloat(index, lVar.f43566Q);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type != 3) {
                            int unused15 = lVar.f43567R = typedArray.getInt(index, lVar.f43567R);
                            break;
                        } else {
                            String unused16 = lVar.f43568S = typedArray.getString(index);
                            int unused17 = lVar.f43567R = 7;
                            break;
                        }
                    case 20:
                        float unused18 = lVar.f43569T = typedArray.getFloat(index, lVar.f43569T);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused19 = lVar.f43570U = typedArray.getFloat(index, lVar.f43570U);
                            break;
                        } else {
                            float unused20 = lVar.f43570U = typedArray.getDimension(index, lVar.f43570U);
                            break;
                        }
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f43590t.get(index));
                        break;
                }
            }
        }
    }

    public C16890l() {
        this.f43396d = 3;
        this.f43397e = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r1.equals("scaleY") == false) goto L_0x004d;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50191W(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.C16848f> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0204
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            androidx.constraintlayout.motion.utils.f r3 = (androidx.constraintlayout.motion.utils.C16848f) r3
            if (r3 != 0) goto L_0x001e
            goto L_0x0008
        L_0x001e:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0045
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r10.f43397e
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            androidx.constraintlayout.motion.utils.f$b r4 = (androidx.constraintlayout.motion.utils.C16848f.C16850b) r4
            int r5 = r10.f43393a
            float r7 = r10.f43569T
            int r8 = r10.f43567R
            float r9 = r10.f43570U
            r4.mo49948k(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0045:
            int r2 = r1.hashCode()
            r5 = -1
            switch(r2) {
                case -1249320806: goto L_0x00ce;
                case -1249320805: goto L_0x00c3;
                case -1225497657: goto L_0x00b8;
                case -1225497656: goto L_0x00ad;
                case -1225497655: goto L_0x00a2;
                case -1001078227: goto L_0x0097;
                case -908189618: goto L_0x008c;
                case -908189617: goto L_0x0083;
                case -40300674: goto L_0x0077;
                case -4379043: goto L_0x006a;
                case 37232917: goto L_0x005d;
                case 92909918: goto L_0x0050;
                default: goto L_0x004d;
            }
        L_0x004d:
            r4 = r5
            goto L_0x00d9
        L_0x0050:
            java.lang.String r2 = "alpha"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0059
            goto L_0x004d
        L_0x0059:
            r4 = 11
            goto L_0x00d9
        L_0x005d:
            java.lang.String r2 = "transitionPathRotate"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0066
            goto L_0x004d
        L_0x0066:
            r4 = 10
            goto L_0x00d9
        L_0x006a:
            java.lang.String r2 = "elevation"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0073
            goto L_0x004d
        L_0x0073:
            r4 = 9
            goto L_0x00d9
        L_0x0077:
            java.lang.String r2 = "rotation"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0080
            goto L_0x004d
        L_0x0080:
            r4 = 8
            goto L_0x00d9
        L_0x0083:
            java.lang.String r2 = "scaleY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00d9
            goto L_0x004d
        L_0x008c:
            java.lang.String r2 = "scaleX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0095
            goto L_0x004d
        L_0x0095:
            r4 = 6
            goto L_0x00d9
        L_0x0097:
            java.lang.String r2 = "progress"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00a0
            goto L_0x004d
        L_0x00a0:
            r4 = 5
            goto L_0x00d9
        L_0x00a2:
            java.lang.String r2 = "translationZ"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00ab
            goto L_0x004d
        L_0x00ab:
            r4 = 4
            goto L_0x00d9
        L_0x00ad:
            java.lang.String r2 = "translationY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00b6
            goto L_0x004d
        L_0x00b6:
            r4 = 3
            goto L_0x00d9
        L_0x00b8:
            java.lang.String r2 = "translationX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00c1
            goto L_0x004d
        L_0x00c1:
            r4 = 2
            goto L_0x00d9
        L_0x00c3:
            java.lang.String r2 = "rotationY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00cc
            goto L_0x004d
        L_0x00cc:
            r4 = 1
            goto L_0x00d9
        L_0x00ce:
            java.lang.String r2 = "rotationX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00d8
            goto L_0x004d
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            switch(r4) {
                case 0: goto L_0x01ed;
                case 1: goto L_0x01d6;
                case 2: goto L_0x01bf;
                case 3: goto L_0x01a8;
                case 4: goto L_0x0191;
                case 5: goto L_0x017a;
                case 6: goto L_0x0163;
                case 7: goto L_0x014c;
                case 8: goto L_0x0135;
                case 9: goto L_0x011e;
                case 10: goto L_0x0107;
                case 11: goto L_0x00f0;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            goto L_0x0008
        L_0x00f0:
            float r1 = r10.f43555F
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f43393a
            float r5 = r10.f43555F
            float r6 = r10.f43569T
            int r7 = r10.f43567R
            float r8 = r10.f43570U
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0107:
            float r1 = r10.f43560K
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f43393a
            float r5 = r10.f43560K
            float r6 = r10.f43569T
            int r7 = r10.f43567R
            float r8 = r10.f43570U
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x011e:
            float r1 = r10.f43556G
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f43393a
            float r5 = r10.f43556G
            float r6 = r10.f43569T
            int r7 = r10.f43567R
            float r8 = r10.f43570U
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0135:
            float r1 = r10.f43557H
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f43393a
            float r5 = r10.f43557H
            float r6 = r10.f43569T
            int r7 = r10.f43567R
            float r8 = r10.f43570U
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x014c:
            float r1 = r10.f43562M
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f43393a
            float r5 = r10.f43562M
            float r6 = r10.f43569T
            int r7 = r10.f43567R
            float r8 = r10.f43570U
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0163:
            float r1 = r10.f43561L
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f43393a
            float r5 = r10.f43561L
            float r6 = r10.f43569T
            int r7 = r10.f43567R
            float r8 = r10.f43570U
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x017a:
            float r1 = r10.f43566Q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f43393a
            float r5 = r10.f43566Q
            float r6 = r10.f43569T
            int r7 = r10.f43567R
            float r8 = r10.f43570U
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0191:
            float r1 = r10.f43565P
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f43393a
            float r5 = r10.f43565P
            float r6 = r10.f43569T
            int r7 = r10.f43567R
            float r8 = r10.f43570U
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01a8:
            float r1 = r10.f43564O
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f43393a
            float r5 = r10.f43564O
            float r6 = r10.f43569T
            int r7 = r10.f43567R
            float r8 = r10.f43570U
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01bf:
            float r1 = r10.f43563N
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f43393a
            float r5 = r10.f43563N
            float r6 = r10.f43569T
            int r7 = r10.f43567R
            float r8 = r10.f43570U
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01d6:
            float r1 = r10.f43559J
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f43393a
            float r5 = r10.f43559J
            float r6 = r10.f43569T
            int r7 = r10.f43567R
            float r8 = r10.f43570U
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01ed:
            float r1 = r10.f43558I
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f43393a
            float r5 = r10.f43558I
            float r6 = r10.f43569T
            int r7 = r10.f43567R
            float r8 = r10.f43570U
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C16890l.mo50191W(java.util.HashMap):void");
    }

    /* renamed from: a */
    public void mo50156a(HashMap<String, C16831d> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* renamed from: b */
    public C16881f clone() {
        return new C16890l().mo50158c(this);
    }

    /* renamed from: c */
    public C16881f mo50158c(C16881f fVar) {
        super.mo50158c(fVar);
        C16890l lVar = (C16890l) fVar;
        this.f43553D = lVar.f43553D;
        this.f43554E = lVar.f43554E;
        this.f43567R = lVar.f43567R;
        this.f43569T = lVar.f43569T;
        this.f43570U = lVar.f43570U;
        this.f43566Q = lVar.f43566Q;
        this.f43555F = lVar.f43555F;
        this.f43556G = lVar.f43556G;
        this.f43557H = lVar.f43557H;
        this.f43560K = lVar.f43560K;
        this.f43558I = lVar.f43558I;
        this.f43559J = lVar.f43559J;
        this.f43561L = lVar.f43561L;
        this.f43562M = lVar.f43562M;
        this.f43563N = lVar.f43563N;
        this.f43564O = lVar.f43564O;
        this.f43565P = lVar.f43565P;
        return this;
    }

    /* renamed from: d */
    public void mo50160d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f43555F)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f43556G)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f43557H)) {
            hashSet.add(C16881f.f43375i);
        }
        if (!Float.isNaN(this.f43558I)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f43559J)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f43563N)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f43564O)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f43565P)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f43560K)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f43561L)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f43562M)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f43566Q)) {
            hashSet.add("progress");
        }
        if (this.f43397e.size() > 0) {
            for (String str : this.f43397e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: f */
    public void mo50162f(Context context, AttributeSet attributeSet) {
        C16891a.m77801a(this, context.obtainStyledAttributes(attributeSet, C16944e.C16957m.KeyTimeCycle));
    }

    /* renamed from: i */
    public void mo50165i(HashMap<String, Integer> hashMap) {
        if (this.f43554E != -1) {
            if (!Float.isNaN(this.f43555F)) {
                hashMap.put("alpha", Integer.valueOf(this.f43554E));
            }
            if (!Float.isNaN(this.f43556G)) {
                hashMap.put("elevation", Integer.valueOf(this.f43554E));
            }
            if (!Float.isNaN(this.f43557H)) {
                hashMap.put(C16881f.f43375i, Integer.valueOf(this.f43554E));
            }
            if (!Float.isNaN(this.f43558I)) {
                hashMap.put("rotationX", Integer.valueOf(this.f43554E));
            }
            if (!Float.isNaN(this.f43559J)) {
                hashMap.put("rotationY", Integer.valueOf(this.f43554E));
            }
            if (!Float.isNaN(this.f43563N)) {
                hashMap.put("translationX", Integer.valueOf(this.f43554E));
            }
            if (!Float.isNaN(this.f43564O)) {
                hashMap.put("translationY", Integer.valueOf(this.f43554E));
            }
            if (!Float.isNaN(this.f43565P)) {
                hashMap.put("translationZ", Integer.valueOf(this.f43554E));
            }
            if (!Float.isNaN(this.f43560K)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f43554E));
            }
            if (!Float.isNaN(this.f43561L)) {
                hashMap.put("scaleX", Integer.valueOf(this.f43554E));
            }
            if (!Float.isNaN(this.f43561L)) {
                hashMap.put("scaleY", Integer.valueOf(this.f43554E));
            }
            if (!Float.isNaN(this.f43566Q)) {
                hashMap.put("progress", Integer.valueOf(this.f43554E));
            }
            if (this.f43397e.size() > 0) {
                for (String str : this.f43397e.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f43554E));
                }
            }
        }
    }

    /* renamed from: j */
    public void mo50166j(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals(C16881f.f43369A)) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 8;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(C16881f.f43375i)) {
                    c = 9;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 10;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 12;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 13;
                    break;
                }
                break;
            case 184161818:
                if (str.equals("wavePeriod")) {
                    c = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f43566Q = mo50169m(obj);
                return;
            case 1:
                this.f43553D = obj.toString();
                return;
            case 2:
                this.f43558I = mo50169m(obj);
                return;
            case 3:
                this.f43559J = mo50169m(obj);
                return;
            case 4:
                this.f43563N = mo50169m(obj);
                return;
            case 5:
                this.f43564O = mo50169m(obj);
                return;
            case 6:
                this.f43565P = mo50169m(obj);
                return;
            case 7:
                this.f43561L = mo50169m(obj);
                return;
            case 8:
                this.f43562M = mo50169m(obj);
                return;
            case 9:
                this.f43557H = mo50169m(obj);
                return;
            case 10:
                this.f43556G = mo50169m(obj);
                return;
            case 11:
                this.f43560K = mo50169m(obj);
                return;
            case 12:
                this.f43555F = mo50169m(obj);
                return;
            case 13:
                this.f43570U = mo50169m(obj);
                return;
            case 14:
                this.f43569T = mo50169m(obj);
                return;
            case 15:
                this.f43554E = mo50170n(obj);
                return;
            case 16:
                if (obj instanceof Integer) {
                    this.f43567R = mo50170n(obj);
                    return;
                }
                this.f43567R = 7;
                this.f43568S = obj.toString();
                return;
            default:
                return;
        }
    }
}
