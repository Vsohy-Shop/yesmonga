package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C16944e;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.g */
public class C16882g extends C16881f {

    /* renamed from: U */
    public static final String f43398U = "KeyAttribute";

    /* renamed from: V */
    public static final String f43399V = "KeyAttributes";

    /* renamed from: W */
    public static final boolean f43400W = false;

    /* renamed from: X */
    public static final int f43401X = 1;

    /* renamed from: D */
    public String f43402D;

    /* renamed from: E */
    public int f43403E = -1;

    /* renamed from: F */
    public boolean f43404F = false;

    /* renamed from: G */
    public float f43405G = Float.NaN;

    /* renamed from: H */
    public float f43406H = Float.NaN;

    /* renamed from: I */
    public float f43407I = Float.NaN;

    /* renamed from: J */
    public float f43408J = Float.NaN;

    /* renamed from: K */
    public float f43409K = Float.NaN;

    /* renamed from: L */
    public float f43410L = Float.NaN;

    /* renamed from: M */
    public float f43411M = Float.NaN;

    /* renamed from: N */
    public float f43412N = Float.NaN;

    /* renamed from: O */
    public float f43413O = Float.NaN;

    /* renamed from: P */
    public float f43414P = Float.NaN;

    /* renamed from: Q */
    public float f43415Q = Float.NaN;

    /* renamed from: R */
    public float f43416R = Float.NaN;

    /* renamed from: S */
    public float f43417S = Float.NaN;

    /* renamed from: T */
    public float f43418T = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.g$a */
    public static class C16883a {

        /* renamed from: a */
        public static final int f43419a = 1;

        /* renamed from: b */
        public static final int f43420b = 2;

        /* renamed from: c */
        public static final int f43421c = 4;

        /* renamed from: d */
        public static final int f43422d = 5;

        /* renamed from: e */
        public static final int f43423e = 6;

        /* renamed from: f */
        public static final int f43424f = 8;

        /* renamed from: g */
        public static final int f43425g = 7;

        /* renamed from: h */
        public static final int f43426h = 9;

        /* renamed from: i */
        public static final int f43427i = 10;

        /* renamed from: j */
        public static final int f43428j = 12;

        /* renamed from: k */
        public static final int f43429k = 13;

        /* renamed from: l */
        public static final int f43430l = 14;

        /* renamed from: m */
        public static final int f43431m = 15;

        /* renamed from: n */
        public static final int f43432n = 16;

        /* renamed from: o */
        public static final int f43433o = 17;

        /* renamed from: p */
        public static final int f43434p = 18;

        /* renamed from: q */
        public static final int f43435q = 19;

        /* renamed from: r */
        public static final int f43436r = 20;

        /* renamed from: s */
        public static SparseIntArray f43437s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f43437s = sparseIntArray;
            sparseIntArray.append(C16944e.C16957m.KeyAttribute_android_alpha, 1);
            f43437s.append(C16944e.C16957m.KeyAttribute_android_elevation, 2);
            f43437s.append(C16944e.C16957m.KeyAttribute_android_rotation, 4);
            f43437s.append(C16944e.C16957m.KeyAttribute_android_rotationX, 5);
            f43437s.append(C16944e.C16957m.KeyAttribute_android_rotationY, 6);
            f43437s.append(C16944e.C16957m.KeyAttribute_android_transformPivotX, 19);
            f43437s.append(C16944e.C16957m.KeyAttribute_android_transformPivotY, 20);
            f43437s.append(C16944e.C16957m.KeyAttribute_android_scaleX, 7);
            f43437s.append(C16944e.C16957m.KeyAttribute_transitionPathRotate, 8);
            f43437s.append(C16944e.C16957m.KeyAttribute_transitionEasing, 9);
            f43437s.append(C16944e.C16957m.KeyAttribute_motionTarget, 10);
            f43437s.append(C16944e.C16957m.KeyAttribute_framePosition, 12);
            f43437s.append(C16944e.C16957m.KeyAttribute_curveFit, 13);
            f43437s.append(C16944e.C16957m.KeyAttribute_android_scaleY, 14);
            f43437s.append(C16944e.C16957m.KeyAttribute_android_translationX, 15);
            f43437s.append(C16944e.C16957m.KeyAttribute_android_translationY, 16);
            f43437s.append(C16944e.C16957m.KeyAttribute_android_translationZ, 17);
            f43437s.append(C16944e.C16957m.KeyAttribute_motionProgress, 18);
        }

        /* renamed from: a */
        public static void m77679a(C16882g gVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f43437s.get(index)) {
                    case 1:
                        float unused = gVar.f43405G = typedArray.getFloat(index, gVar.f43405G);
                        break;
                    case 2:
                        float unused2 = gVar.f43406H = typedArray.getDimension(index, gVar.f43406H);
                        break;
                    case 4:
                        float unused3 = gVar.f43407I = typedArray.getFloat(index, gVar.f43407I);
                        break;
                    case 5:
                        float unused4 = gVar.f43408J = typedArray.getFloat(index, gVar.f43408J);
                        break;
                    case 6:
                        float unused5 = gVar.f43409K = typedArray.getFloat(index, gVar.f43409K);
                        break;
                    case 7:
                        float unused6 = gVar.f43413O = typedArray.getFloat(index, gVar.f43413O);
                        break;
                    case 8:
                        float unused7 = gVar.f43412N = typedArray.getFloat(index, gVar.f43412N);
                        break;
                    case 9:
                        String unused8 = gVar.f43402D = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f43205d2) {
                            if (typedArray.peekValue(index).type != 3) {
                                gVar.f43394b = typedArray.getResourceId(index, gVar.f43394b);
                                break;
                            } else {
                                gVar.f43395c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, gVar.f43394b);
                            gVar.f43394b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                gVar.f43395c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        gVar.f43393a = typedArray.getInt(index, gVar.f43393a);
                        break;
                    case 13:
                        int unused9 = gVar.f43403E = typedArray.getInteger(index, gVar.f43403E);
                        break;
                    case 14:
                        float unused10 = gVar.f43414P = typedArray.getFloat(index, gVar.f43414P);
                        break;
                    case 15:
                        float unused11 = gVar.f43415Q = typedArray.getDimension(index, gVar.f43415Q);
                        break;
                    case 16:
                        float unused12 = gVar.f43416R = typedArray.getDimension(index, gVar.f43416R);
                        break;
                    case 17:
                        float unused13 = gVar.f43417S = typedArray.getDimension(index, gVar.f43417S);
                        break;
                    case 18:
                        float unused14 = gVar.f43418T = typedArray.getFloat(index, gVar.f43418T);
                        break;
                    case 19:
                        float unused15 = gVar.f43410L = typedArray.getDimension(index, gVar.f43410L);
                        break;
                    case 20:
                        float unused16 = gVar.f43411M = typedArray.getDimension(index, gVar.f43411M);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f43437s.get(index));
                        break;
                }
            }
        }
    }

    public C16882g() {
        this.f43396d = 1;
        this.f43397e = new HashMap<>();
    }

    /* renamed from: T */
    public int mo50171T() {
        return this.f43403E;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50156a(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.C16831d> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e0
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            androidx.constraintlayout.core.motion.utils.o r2 = (androidx.constraintlayout.core.motion.utils.C16703o) r2
            if (r2 != 0) goto L_0x001d
            goto L_0x0008
        L_0x001d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x003c
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r6.f43397e
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            if (r1 == 0) goto L_0x0008
            androidx.constraintlayout.motion.utils.d$b r2 = (androidx.constraintlayout.motion.utils.C16831d.C16833b) r2
            int r3 = r6.f43393a
            r2.mo49941n(r3, r1)
            goto L_0x0008
        L_0x003c:
            int r3 = r1.hashCode()
            r5 = -1
            switch(r3) {
                case -1249320806: goto L_0x00e2;
                case -1249320805: goto L_0x00d6;
                case -1225497657: goto L_0x00ca;
                case -1225497656: goto L_0x00be;
                case -1225497655: goto L_0x00b3;
                case -1001078227: goto L_0x00a8;
                case -908189618: goto L_0x009d;
                case -908189617: goto L_0x0094;
                case -760884510: goto L_0x0088;
                case -760884509: goto L_0x007b;
                case -40300674: goto L_0x006e;
                case -4379043: goto L_0x0061;
                case 37232917: goto L_0x0054;
                case 92909918: goto L_0x0047;
                default: goto L_0x0044;
            }
        L_0x0044:
            r4 = r5
            goto L_0x00ed
        L_0x0047:
            java.lang.String r3 = "alpha"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0050
            goto L_0x0044
        L_0x0050:
            r4 = 13
            goto L_0x00ed
        L_0x0054:
            java.lang.String r3 = "transitionPathRotate"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x005d
            goto L_0x0044
        L_0x005d:
            r4 = 12
            goto L_0x00ed
        L_0x0061:
            java.lang.String r3 = "elevation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x006a
            goto L_0x0044
        L_0x006a:
            r4 = 11
            goto L_0x00ed
        L_0x006e:
            java.lang.String r3 = "rotation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0077
            goto L_0x0044
        L_0x0077:
            r4 = 10
            goto L_0x00ed
        L_0x007b:
            java.lang.String r3 = "transformPivotY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0084
            goto L_0x0044
        L_0x0084:
            r4 = 9
            goto L_0x00ed
        L_0x0088:
            java.lang.String r3 = "transformPivotX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0091
            goto L_0x0044
        L_0x0091:
            r4 = 8
            goto L_0x00ed
        L_0x0094:
            java.lang.String r3 = "scaleY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00ed
            goto L_0x0044
        L_0x009d:
            java.lang.String r3 = "scaleX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00a6
            goto L_0x0044
        L_0x00a6:
            r4 = 6
            goto L_0x00ed
        L_0x00a8:
            java.lang.String r3 = "progress"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00b1
            goto L_0x0044
        L_0x00b1:
            r4 = 5
            goto L_0x00ed
        L_0x00b3:
            java.lang.String r3 = "translationZ"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00bc
            goto L_0x0044
        L_0x00bc:
            r4 = 4
            goto L_0x00ed
        L_0x00be:
            java.lang.String r3 = "translationY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00c8
            goto L_0x0044
        L_0x00c8:
            r4 = 3
            goto L_0x00ed
        L_0x00ca:
            java.lang.String r3 = "translationX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00d4
            goto L_0x0044
        L_0x00d4:
            r4 = 2
            goto L_0x00ed
        L_0x00d6:
            java.lang.String r3 = "rotationY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00e0
            goto L_0x0044
        L_0x00e0:
            r4 = 1
            goto L_0x00ed
        L_0x00e2:
            java.lang.String r3 = "rotationX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00ec
            goto L_0x0044
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            switch(r4) {
                case 0: goto L_0x01cf;
                case 1: goto L_0x01be;
                case 2: goto L_0x01ad;
                case 3: goto L_0x019c;
                case 4: goto L_0x018b;
                case 5: goto L_0x017a;
                case 6: goto L_0x0169;
                case 7: goto L_0x0158;
                case 8: goto L_0x0147;
                case 9: goto L_0x0136;
                case 10: goto L_0x0125;
                case 11: goto L_0x0114;
                case 12: goto L_0x0103;
                case 13: goto L_0x00f2;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x0008
        L_0x00f2:
            float r1 = r6.f43405G
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43405G
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x0103:
            float r1 = r6.f43412N
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43412N
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x0114:
            float r1 = r6.f43406H
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43406H
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x0125:
            float r1 = r6.f43407I
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43407I
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x0136:
            float r1 = r6.f43409K
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43411M
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x0147:
            float r1 = r6.f43408J
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43410L
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x0158:
            float r1 = r6.f43414P
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43414P
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x0169:
            float r1 = r6.f43413O
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43413O
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x017a:
            float r1 = r6.f43418T
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43418T
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x018b:
            float r1 = r6.f43417S
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43417S
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x019c:
            float r1 = r6.f43416R
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43416R
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x01ad:
            float r1 = r6.f43415Q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43415Q
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x01be:
            float r1 = r6.f43409K
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43409K
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x01cf:
            float r1 = r6.f43408J
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f43393a
            float r3 = r6.f43408J
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C16882g.mo50156a(java.util.HashMap):void");
    }

    /* renamed from: b */
    public C16881f clone() {
        return new C16882g().mo50158c(this);
    }

    /* renamed from: c */
    public C16881f mo50158c(C16881f fVar) {
        super.mo50158c(fVar);
        C16882g gVar = (C16882g) fVar;
        this.f43403E = gVar.f43403E;
        this.f43404F = gVar.f43404F;
        this.f43405G = gVar.f43405G;
        this.f43406H = gVar.f43406H;
        this.f43407I = gVar.f43407I;
        this.f43408J = gVar.f43408J;
        this.f43409K = gVar.f43409K;
        this.f43410L = gVar.f43410L;
        this.f43411M = gVar.f43411M;
        this.f43412N = gVar.f43412N;
        this.f43413O = gVar.f43413O;
        this.f43414P = gVar.f43414P;
        this.f43415Q = gVar.f43415Q;
        this.f43416R = gVar.f43416R;
        this.f43417S = gVar.f43417S;
        this.f43418T = gVar.f43418T;
        return this;
    }

    /* renamed from: d */
    public void mo50160d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f43405G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f43406H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f43407I)) {
            hashSet.add(C16881f.f43375i);
        }
        if (!Float.isNaN(this.f43408J)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f43409K)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f43410L)) {
            hashSet.add(C16881f.f43378l);
        }
        if (!Float.isNaN(this.f43411M)) {
            hashSet.add(C16881f.f43379m);
        }
        if (!Float.isNaN(this.f43415Q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f43416R)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f43417S)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f43412N)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f43413O)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f43414P)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f43418T)) {
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
        C16883a.m77679a(this, context.obtainStyledAttributes(attributeSet, C16944e.C16957m.KeyAttribute));
    }

    /* renamed from: i */
    public void mo50165i(HashMap<String, Integer> hashMap) {
        if (this.f43403E != -1) {
            if (!Float.isNaN(this.f43405G)) {
                hashMap.put("alpha", Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43406H)) {
                hashMap.put("elevation", Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43407I)) {
                hashMap.put(C16881f.f43375i, Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43408J)) {
                hashMap.put("rotationX", Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43409K)) {
                hashMap.put("rotationY", Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43410L)) {
                hashMap.put(C16881f.f43378l, Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43411M)) {
                hashMap.put(C16881f.f43379m, Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43415Q)) {
                hashMap.put("translationX", Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43416R)) {
                hashMap.put("translationY", Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43417S)) {
                hashMap.put("translationZ", Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43412N)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43413O)) {
                hashMap.put("scaleX", Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43414P)) {
                hashMap.put("scaleY", Integer.valueOf(this.f43403E));
            }
            if (!Float.isNaN(this.f43418T)) {
                hashMap.put("progress", Integer.valueOf(this.f43403E));
            }
            if (this.f43397e.size() > 0) {
                for (String str : this.f43397e.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f43403E));
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
            case -760884510:
                if (str.equals(C16881f.f43378l)) {
                    c = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals(C16881f.f43379m)) {
                    c = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(C16881f.f43375i)) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
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
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f43418T = mo50169m(obj);
                return;
            case 1:
                this.f43402D = obj.toString();
                return;
            case 2:
                this.f43408J = mo50169m(obj);
                return;
            case 3:
                this.f43409K = mo50169m(obj);
                return;
            case 4:
                this.f43415Q = mo50169m(obj);
                return;
            case 5:
                this.f43416R = mo50169m(obj);
                return;
            case 6:
                this.f43417S = mo50169m(obj);
                return;
            case 7:
                this.f43413O = mo50169m(obj);
                return;
            case 8:
                this.f43414P = mo50169m(obj);
                return;
            case 9:
                this.f43410L = mo50169m(obj);
                return;
            case 10:
                this.f43411M = mo50169m(obj);
                return;
            case 11:
                this.f43407I = mo50169m(obj);
                return;
            case 12:
                this.f43406H = mo50169m(obj);
                return;
            case 13:
                this.f43412N = mo50169m(obj);
                return;
            case 14:
                this.f43405G = mo50169m(obj);
                return;
            case 15:
                this.f43403E = mo50170n(obj);
                return;
            case 16:
                this.f43404F = mo50168l(obj);
                return;
            default:
                return;
        }
    }
}
