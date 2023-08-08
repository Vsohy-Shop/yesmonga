package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.C16703o;
import androidx.constraintlayout.core.motion.utils.C16717v;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.core.motion.key.f */
public class C16668f extends C16664b {

    /* renamed from: Q */
    public static final String f41822Q = "KeyTimeCycle";

    /* renamed from: R */
    public static final String f41823R = "KeyTimeCycle";

    /* renamed from: S */
    public static final int f41824S = 3;

    /* renamed from: A */
    public float f41825A = Float.NaN;

    /* renamed from: B */
    public float f41826B = Float.NaN;

    /* renamed from: C */
    public float f41827C = Float.NaN;

    /* renamed from: D */
    public float f41828D = Float.NaN;

    /* renamed from: E */
    public float f41829E = Float.NaN;

    /* renamed from: F */
    public float f41830F = Float.NaN;

    /* renamed from: G */
    public float f41831G = Float.NaN;

    /* renamed from: H */
    public float f41832H = Float.NaN;

    /* renamed from: I */
    public float f41833I = Float.NaN;

    /* renamed from: J */
    public float f41834J = Float.NaN;

    /* renamed from: K */
    public float f41835K = Float.NaN;

    /* renamed from: L */
    public float f41836L = Float.NaN;

    /* renamed from: M */
    public int f41837M = 0;

    /* renamed from: N */
    public String f41838N = null;

    /* renamed from: O */
    public float f41839O = Float.NaN;

    /* renamed from: P */
    public float f41840P = 0.0f;

    /* renamed from: y */
    public String f41841y;

    /* renamed from: z */
    public int f41842z = -1;

    public C16668f() {
        this.f41747k = 3;
        this.f41748l = new HashMap<>();
    }

    /* renamed from: a */
    public int mo48818a(String str) {
        return C16717v.C16720c.m76348a(str);
    }

    /* renamed from: b */
    public boolean mo48820b(int i, int i2) {
        if (i == 100) {
            this.f41744h = i2;
            return true;
        } else if (i != 421) {
            return super.mo48820b(i, i2);
        } else {
            this.f41837M = i2;
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo48822c(int i, float f) {
        if (i == 315) {
            this.f41836L = mo48954t(Float.valueOf(f));
            return true;
        } else if (i == 401) {
            this.f41842z = mo48955u(Float.valueOf(f));
            return true;
        } else if (i == 403) {
            this.f41825A = f;
            return true;
        } else if (i == 416) {
            this.f41830F = mo48954t(Float.valueOf(f));
            return true;
        } else if (i == 423) {
            this.f41839O = mo48954t(Float.valueOf(f));
            return true;
        } else if (i != 424) {
            switch (i) {
                case 304:
                    this.f41833I = mo48954t(Float.valueOf(f));
                    return true;
                case 305:
                    this.f41834J = mo48954t(Float.valueOf(f));
                    return true;
                case 306:
                    this.f41835K = mo48954t(Float.valueOf(f));
                    return true;
                case 307:
                    this.f41826B = mo48954t(Float.valueOf(f));
                    return true;
                case 308:
                    this.f41828D = mo48954t(Float.valueOf(f));
                    return true;
                case 309:
                    this.f41829E = mo48954t(Float.valueOf(f));
                    return true;
                case 310:
                    this.f41827C = mo48954t(Float.valueOf(f));
                    return true;
                case 311:
                    this.f41831G = mo48954t(Float.valueOf(f));
                    return true;
                case 312:
                    this.f41832H = mo48954t(Float.valueOf(f));
                    return true;
                default:
                    return super.mo48822c(i, f);
            }
        } else {
            this.f41840P = mo48954t(Float.valueOf(f));
            return true;
        }
    }

    /* renamed from: d */
    public boolean mo48824d(int i, boolean z) {
        return super.mo48824d(i, z);
    }

    /* renamed from: e */
    public boolean mo48826e(int i, String str) {
        if (i == 420) {
            this.f41841y = str;
            return true;
        } else if (i != 421) {
            return super.mo48826e(i, str);
        } else {
            this.f41837M = 7;
            this.f41838N = str;
            return true;
        }
    }

    /* renamed from: f */
    public void mo48940f(HashMap<String, C16703o> hashMap) {
    }

    /* renamed from: g */
    public C16664b clone() {
        return new C16668f().mo48942h(this);
    }

    /* renamed from: i */
    public void mo48943i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f41825A)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f41826B)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f41827C)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f41828D)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f41829E)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f41831G)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f41832H)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f41830F)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f41833I)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f41834J)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f41835K)) {
            hashSet.add("translationZ");
        }
        if (this.f41748l.size() > 0) {
            for (String str : this.f41748l.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r1.equals("scaleX") == false) goto L_0x004d;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo48974v(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.C16712t> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x020d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            androidx.constraintlayout.core.motion.utils.t r3 = (androidx.constraintlayout.core.motion.utils.C16712t) r3
            if (r3 != 0) goto L_0x001e
            goto L_0x0008
        L_0x001e:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0045
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.a> r2 = r10.f41748l
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.core.motion.a r6 = (androidx.constraintlayout.core.motion.C16655a) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            androidx.constraintlayout.core.motion.utils.t$b r4 = (androidx.constraintlayout.core.motion.utils.C16712t.C16714b) r4
            int r5 = r10.f41744h
            float r7 = r10.f41839O
            int r8 = r10.f41837M
            float r9 = r10.f41840P
            r4.mo49104g(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0045:
            int r2 = r1.hashCode()
            r5 = -1
            switch(r2) {
                case -1249320806: goto L_0x00ce;
                case -1249320805: goto L_0x00c3;
                case -1249320804: goto L_0x00b8;
                case -1225497657: goto L_0x00ad;
                case -1225497656: goto L_0x00a2;
                case -1225497655: goto L_0x0097;
                case -1001078227: goto L_0x008c;
                case -908189618: goto L_0x0083;
                case -908189617: goto L_0x0077;
                case -4379043: goto L_0x006a;
                case 92909918: goto L_0x005d;
                case 803192288: goto L_0x0050;
                default: goto L_0x004d;
            }
        L_0x004d:
            r4 = r5
            goto L_0x00d9
        L_0x0050:
            java.lang.String r2 = "pathRotate"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0059
            goto L_0x004d
        L_0x0059:
            r4 = 11
            goto L_0x00d9
        L_0x005d:
            java.lang.String r2 = "alpha"
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
            java.lang.String r2 = "scaleY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0080
            goto L_0x004d
        L_0x0080:
            r4 = 8
            goto L_0x00d9
        L_0x0083:
            java.lang.String r2 = "scaleX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00d9
            goto L_0x004d
        L_0x008c:
            java.lang.String r2 = "progress"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0095
            goto L_0x004d
        L_0x0095:
            r4 = 6
            goto L_0x00d9
        L_0x0097:
            java.lang.String r2 = "translationZ"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00a0
            goto L_0x004d
        L_0x00a0:
            r4 = 5
            goto L_0x00d9
        L_0x00a2:
            java.lang.String r2 = "translationY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00ab
            goto L_0x004d
        L_0x00ab:
            r4 = 4
            goto L_0x00d9
        L_0x00ad:
            java.lang.String r2 = "translationX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x00b6
            goto L_0x004d
        L_0x00b6:
            r4 = 3
            goto L_0x00d9
        L_0x00b8:
            java.lang.String r2 = "rotationZ"
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
                case 0: goto L_0x01f6;
                case 1: goto L_0x01df;
                case 2: goto L_0x01c8;
                case 3: goto L_0x01b1;
                case 4: goto L_0x019a;
                case 5: goto L_0x0183;
                case 6: goto L_0x016c;
                case 7: goto L_0x0155;
                case 8: goto L_0x013e;
                case 9: goto L_0x0127;
                case 10: goto L_0x0110;
                case 11: goto L_0x00f9;
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
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycles"
            androidx.constraintlayout.core.motion.utils.C16727w.m76358f(r2, r1)
            goto L_0x0008
        L_0x00f9:
            float r1 = r10.f41830F
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f41744h
            float r5 = r10.f41830F
            float r6 = r10.f41839O
            int r7 = r10.f41837M
            float r8 = r10.f41840P
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0110:
            float r1 = r10.f41825A
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f41744h
            float r5 = r10.f41825A
            float r6 = r10.f41839O
            int r7 = r10.f41837M
            float r8 = r10.f41840P
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0127:
            float r1 = r10.f41835K
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f41744h
            float r5 = r10.f41835K
            float r6 = r10.f41839O
            int r7 = r10.f41837M
            float r8 = r10.f41840P
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x013e:
            float r1 = r10.f41832H
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f41744h
            float r5 = r10.f41832H
            float r6 = r10.f41839O
            int r7 = r10.f41837M
            float r8 = r10.f41840P
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0155:
            float r1 = r10.f41831G
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f41744h
            float r5 = r10.f41831G
            float r6 = r10.f41839O
            int r7 = r10.f41837M
            float r8 = r10.f41840P
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x016c:
            float r1 = r10.f41836L
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f41744h
            float r5 = r10.f41836L
            float r6 = r10.f41839O
            int r7 = r10.f41837M
            float r8 = r10.f41840P
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0183:
            float r1 = r10.f41835K
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f41744h
            float r5 = r10.f41835K
            float r6 = r10.f41839O
            int r7 = r10.f41837M
            float r8 = r10.f41840P
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x019a:
            float r1 = r10.f41834J
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f41744h
            float r5 = r10.f41834J
            float r6 = r10.f41839O
            int r7 = r10.f41837M
            float r8 = r10.f41840P
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01b1:
            float r1 = r10.f41833I
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f41744h
            float r5 = r10.f41833I
            float r6 = r10.f41839O
            int r7 = r10.f41837M
            float r8 = r10.f41840P
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01c8:
            float r1 = r10.f41827C
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f41744h
            float r5 = r10.f41827C
            float r6 = r10.f41839O
            int r7 = r10.f41837M
            float r8 = r10.f41840P
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01df:
            float r1 = r10.f41829E
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f41744h
            float r5 = r10.f41829E
            float r6 = r10.f41839O
            int r7 = r10.f41837M
            float r8 = r10.f41840P
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01f6:
            float r1 = r10.f41828D
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f41744h
            float r5 = r10.f41828D
            float r6 = r10.f41839O
            int r7 = r10.f41837M
            float r8 = r10.f41840P
            r3.mo49097c(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.C16668f.mo48974v(java.util.HashMap):void");
    }

    /* renamed from: w */
    public C16668f mo48942h(C16664b bVar) {
        super.mo48942h(bVar);
        C16668f fVar = (C16668f) bVar;
        this.f41841y = fVar.f41841y;
        this.f41842z = fVar.f41842z;
        this.f41837M = fVar.f41837M;
        this.f41839O = fVar.f41839O;
        this.f41840P = fVar.f41840P;
        this.f41836L = fVar.f41836L;
        this.f41825A = fVar.f41825A;
        this.f41826B = fVar.f41826B;
        this.f41827C = fVar.f41827C;
        this.f41830F = fVar.f41830F;
        this.f41828D = fVar.f41828D;
        this.f41829E = fVar.f41829E;
        this.f41831G = fVar.f41831G;
        this.f41832H = fVar.f41832H;
        this.f41833I = fVar.f41833I;
        this.f41834J = fVar.f41834J;
        this.f41835K = fVar.f41835K;
        return this;
    }
}
