package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.google.firebase.installations.C33124s;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.core.motion.key.c */
public class C16665c extends C16664b {

    /* renamed from: P */
    public static final String f41749P = "KeyAttribute";

    /* renamed from: Q */
    public static final String f41750Q = "KeyAttributes";

    /* renamed from: R */
    public static final boolean f41751R = false;

    /* renamed from: S */
    public static final int f41752S = 1;

    /* renamed from: A */
    public int f41753A = 0;

    /* renamed from: B */
    public float f41754B = Float.NaN;

    /* renamed from: C */
    public float f41755C = Float.NaN;

    /* renamed from: D */
    public float f41756D = Float.NaN;

    /* renamed from: E */
    public float f41757E = Float.NaN;

    /* renamed from: F */
    public float f41758F = Float.NaN;

    /* renamed from: G */
    public float f41759G = Float.NaN;

    /* renamed from: H */
    public float f41760H = Float.NaN;

    /* renamed from: I */
    public float f41761I = Float.NaN;

    /* renamed from: J */
    public float f41762J = Float.NaN;

    /* renamed from: K */
    public float f41763K = Float.NaN;

    /* renamed from: L */
    public float f41764L = Float.NaN;

    /* renamed from: M */
    public float f41765M = Float.NaN;

    /* renamed from: N */
    public float f41766N = Float.NaN;

    /* renamed from: O */
    public float f41767O = Float.NaN;

    /* renamed from: y */
    public String f41768y;

    /* renamed from: z */
    public int f41769z = -1;

    public C16665c() {
        this.f41747k = 1;
        this.f41748l = new HashMap<>();
    }

    /* renamed from: a */
    public int mo48818a(String str) {
        return C16717v.C16718a.m76346a(str);
    }

    /* renamed from: b */
    public boolean mo48820b(int i, int i2) {
        if (i == 100) {
            this.f41744h = i2;
            return true;
        } else if (i == 301) {
            this.f41769z = i2;
            return true;
        } else if (i == 302) {
            this.f41753A = i2;
            return true;
        } else if (!mo48820b(i, i2)) {
            return super.mo48820b(i, i2);
        } else {
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo48822c(int i, float f) {
        if (i != 100) {
            switch (i) {
                case 303:
                    this.f41754B = f;
                    return true;
                case 304:
                    this.f41764L = f;
                    return true;
                case 305:
                    this.f41765M = f;
                    return true;
                case 306:
                    this.f41766N = f;
                    return true;
                case 307:
                    this.f41755C = f;
                    return true;
                case 308:
                    this.f41757E = f;
                    return true;
                case 309:
                    this.f41758F = f;
                    return true;
                case 310:
                    this.f41756D = f;
                    return true;
                case 311:
                    this.f41762J = f;
                    return true;
                case 312:
                    this.f41763K = f;
                    return true;
                case 313:
                    this.f41759G = f;
                    return true;
                case 314:
                    this.f41760H = f;
                    return true;
                case 315:
                    this.f41767O = f;
                    return true;
                case C16717v.C16718a.f42168q /*316*/:
                    this.f41761I = f;
                    return true;
                default:
                    return super.mo48822c(i, f);
            }
        } else {
            this.f41761I = f;
            return true;
        }
    }

    /* renamed from: e */
    public boolean mo48826e(int i, String str) {
        if (i == 101) {
            this.f41746j = str;
            return true;
        } else if (i != 317) {
            return super.mo48826e(i, str);
        } else {
            this.f41768y = str;
            return true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r1.equals("pivotX") == false) goto L_0x0044;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo48940f(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.C16703o> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01f6
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
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.a> r3 = r6.f41748l
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.core.motion.a r1 = (androidx.constraintlayout.core.motion.C16655a) r1
            if (r1 == 0) goto L_0x0008
            androidx.constraintlayout.core.motion.utils.o$c r2 = (androidx.constraintlayout.core.motion.utils.C16703o.C16706c) r2
            int r3 = r6.f41744h
            r2.mo49081k(r3, r1)
            goto L_0x0008
        L_0x003c:
            int r3 = r1.hashCode()
            r5 = -1
            switch(r3) {
                case -1249320806: goto L_0x00e2;
                case -1249320805: goto L_0x00d6;
                case -1249320804: goto L_0x00ca;
                case -1225497657: goto L_0x00be;
                case -1225497656: goto L_0x00b3;
                case -1225497655: goto L_0x00a8;
                case -1001078227: goto L_0x009d;
                case -987906986: goto L_0x0094;
                case -987906985: goto L_0x0088;
                case -908189618: goto L_0x007b;
                case -908189617: goto L_0x006e;
                case -4379043: goto L_0x0061;
                case 92909918: goto L_0x0054;
                case 803192288: goto L_0x0047;
                default: goto L_0x0044;
            }
        L_0x0044:
            r4 = r5
            goto L_0x00ed
        L_0x0047:
            java.lang.String r3 = "pathRotate"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0050
            goto L_0x0044
        L_0x0050:
            r4 = 13
            goto L_0x00ed
        L_0x0054:
            java.lang.String r3 = "alpha"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005d
            goto L_0x0044
        L_0x005d:
            r4 = 12
            goto L_0x00ed
        L_0x0061:
            java.lang.String r3 = "elevation"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x006a
            goto L_0x0044
        L_0x006a:
            r4 = 11
            goto L_0x00ed
        L_0x006e:
            java.lang.String r3 = "scaleY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0077
            goto L_0x0044
        L_0x0077:
            r4 = 10
            goto L_0x00ed
        L_0x007b:
            java.lang.String r3 = "scaleX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0084
            goto L_0x0044
        L_0x0084:
            r4 = 9
            goto L_0x00ed
        L_0x0088:
            java.lang.String r3 = "pivotY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0091
            goto L_0x0044
        L_0x0091:
            r4 = 8
            goto L_0x00ed
        L_0x0094:
            java.lang.String r3 = "pivotX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00ed
            goto L_0x0044
        L_0x009d:
            java.lang.String r3 = "progress"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00a6
            goto L_0x0044
        L_0x00a6:
            r4 = 6
            goto L_0x00ed
        L_0x00a8:
            java.lang.String r3 = "translationZ"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00b1
            goto L_0x0044
        L_0x00b1:
            r4 = 5
            goto L_0x00ed
        L_0x00b3:
            java.lang.String r3 = "translationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00bc
            goto L_0x0044
        L_0x00bc:
            r4 = 4
            goto L_0x00ed
        L_0x00be:
            java.lang.String r3 = "translationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00c8
            goto L_0x0044
        L_0x00c8:
            r4 = 3
            goto L_0x00ed
        L_0x00ca:
            java.lang.String r3 = "rotationZ"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00d4
            goto L_0x0044
        L_0x00d4:
            r4 = 2
            goto L_0x00ed
        L_0x00d6:
            java.lang.String r3 = "rotationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00e0
            goto L_0x0044
        L_0x00e0:
            r4 = 1
            goto L_0x00ed
        L_0x00e2:
            java.lang.String r3 = "rotationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00ec
            goto L_0x0044
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            switch(r4) {
                case 0: goto L_0x01e5;
                case 1: goto L_0x01d4;
                case 2: goto L_0x01c3;
                case 3: goto L_0x01b2;
                case 4: goto L_0x01a1;
                case 5: goto L_0x0190;
                case 6: goto L_0x017f;
                case 7: goto L_0x016e;
                case 8: goto L_0x015d;
                case 9: goto L_0x014c;
                case 10: goto L_0x013b;
                case 11: goto L_0x012a;
                case 12: goto L_0x0119;
                case 13: goto L_0x0108;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "not supported by KeyAttributes "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            goto L_0x0008
        L_0x0108:
            float r1 = r6.f41761I
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41761I
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x0119:
            float r1 = r6.f41754B
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41754B
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x012a:
            float r1 = r6.f41755C
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41755C
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x013b:
            float r1 = r6.f41763K
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41763K
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x014c:
            float r1 = r6.f41762J
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41762J
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x015d:
            float r1 = r6.f41758F
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41760H
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x016e:
            float r1 = r6.f41757E
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41759G
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x017f:
            float r1 = r6.f41767O
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41767O
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x0190:
            float r1 = r6.f41766N
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41766N
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x01a1:
            float r1 = r6.f41765M
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41765M
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x01b2:
            float r1 = r6.f41764L
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41764L
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x01c3:
            float r1 = r6.f41756D
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41756D
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x01d4:
            float r1 = r6.f41758F
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41758F
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x01e5:
            float r1 = r6.f41757E
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f41744h
            float r3 = r6.f41757E
            r2.mo49074g(r1, r3)
            goto L_0x0008
        L_0x01f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.C16665c.mo48940f(java.util.HashMap):void");
    }

    /* renamed from: g */
    public C16664b clone() {
        return null;
    }

    /* renamed from: i */
    public void mo48943i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f41754B)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f41755C)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f41756D)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f41757E)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f41758F)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f41759G)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.f41760H)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.f41764L)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f41765M)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f41766N)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f41761I)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f41762J)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f41763K)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f41767O)) {
            hashSet.add("progress");
        }
        if (this.f41748l.size() > 0) {
            for (String str : this.f41748l.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: q */
    public void mo48951q(HashMap<String, Integer> hashMap) {
        if (!Float.isNaN(this.f41754B)) {
            hashMap.put("alpha", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41755C)) {
            hashMap.put("elevation", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41756D)) {
            hashMap.put("rotationZ", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41757E)) {
            hashMap.put("rotationX", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41758F)) {
            hashMap.put("rotationY", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41759G)) {
            hashMap.put("pivotX", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41760H)) {
            hashMap.put("pivotY", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41764L)) {
            hashMap.put("translationX", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41765M)) {
            hashMap.put("translationY", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41766N)) {
            hashMap.put("translationZ", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41761I)) {
            hashMap.put("pathRotate", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41762J)) {
            hashMap.put("scaleX", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41763K)) {
            hashMap.put("scaleY", Integer.valueOf(this.f41769z));
        }
        if (!Float.isNaN(this.f41767O)) {
            hashMap.put("progress", Integer.valueOf(this.f41769z));
        }
        if (this.f41748l.size() > 0) {
            for (String str : this.f41748l.keySet()) {
                hashMap.put("CUSTOM," + str, Integer.valueOf(this.f41769z));
            }
        }
    }

    /* renamed from: v */
    public int mo48956v() {
        return this.f41769z;
    }

    /* renamed from: w */
    public final float mo48957w(int i) {
        if (i == 100) {
            return (float) this.f41744h;
        }
        switch (i) {
            case 303:
                return this.f41754B;
            case 304:
                return this.f41764L;
            case 305:
                return this.f41765M;
            case 306:
                return this.f41766N;
            case 307:
                return this.f41755C;
            case 308:
                return this.f41757E;
            case 309:
                return this.f41758F;
            case 310:
                return this.f41756D;
            case 311:
                return this.f41762J;
            case 312:
                return this.f41763K;
            case 313:
                return this.f41759G;
            case 314:
                return this.f41760H;
            case 315:
                return this.f41767O;
            case C16717v.C16718a.f42168q /*316*/:
                return this.f41761I;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: x */
    public void mo48958x() {
        HashSet hashSet = new HashSet();
        mo48943i(hashSet);
        PrintStream printStream = System.out;
        printStream.println(" ------------- " + this.f41744h + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            int a = C16717v.C16718a.m76346a(strArr[i]);
            PrintStream printStream2 = System.out;
            printStream2.println(strArr[i] + C33124s.f80355c + mo48957w(a));
        }
    }
}
