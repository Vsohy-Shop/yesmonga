package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.C16655a;
import androidx.constraintlayout.core.motion.C16660e;
import androidx.constraintlayout.core.motion.utils.C16682e;
import androidx.constraintlayout.core.motion.utils.C16703o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.constraintlayout.core.motion.key.g */
public class C16669g extends C16664b {

    /* renamed from: R */
    public static final String f41843R = "KeyTrigger";

    /* renamed from: S */
    public static final String f41844S = "viewTransitionOnCross";

    /* renamed from: T */
    public static final String f41845T = "viewTransitionOnPositiveCross";

    /* renamed from: U */
    public static final String f41846U = "viewTransitionOnNegativeCross";

    /* renamed from: V */
    public static final String f41847V = "postLayout";

    /* renamed from: W */
    public static final String f41848W = "triggerSlack";

    /* renamed from: X */
    public static final String f41849X = "triggerCollisionView";

    /* renamed from: Y */
    public static final String f41850Y = "triggerCollisionId";

    /* renamed from: Z */
    public static final String f41851Z = "triggerID";

    /* renamed from: a0 */
    public static final String f41852a0 = "positiveCross";

    /* renamed from: b0 */
    public static final String f41853b0 = "negativeCross";

    /* renamed from: c0 */
    public static final String f41854c0 = "triggerReceiver";

    /* renamed from: d0 */
    public static final String f41855d0 = "CROSS";

    /* renamed from: e0 */
    public static final int f41856e0 = 301;

    /* renamed from: f0 */
    public static final int f41857f0 = 302;

    /* renamed from: g0 */
    public static final int f41858g0 = 303;

    /* renamed from: h0 */
    public static final int f41859h0 = 304;

    /* renamed from: i0 */
    public static final int f41860i0 = 305;

    /* renamed from: j0 */
    public static final int f41861j0 = 306;

    /* renamed from: k0 */
    public static final int f41862k0 = 307;

    /* renamed from: l0 */
    public static final int f41863l0 = 308;

    /* renamed from: m0 */
    public static final int f41864m0 = 309;

    /* renamed from: n0 */
    public static final int f41865n0 = 310;

    /* renamed from: o0 */
    public static final int f41866o0 = 311;

    /* renamed from: p0 */
    public static final int f41867p0 = 312;

    /* renamed from: q0 */
    public static final int f41868q0 = 5;

    /* renamed from: A */
    public int f41869A;

    /* renamed from: B */
    public String f41870B;

    /* renamed from: C */
    public String f41871C;

    /* renamed from: D */
    public int f41872D;

    /* renamed from: E */
    public int f41873E;

    /* renamed from: F */
    public float f41874F;

    /* renamed from: G */
    public boolean f41875G;

    /* renamed from: H */
    public boolean f41876H;

    /* renamed from: I */
    public boolean f41877I;

    /* renamed from: J */
    public float f41878J;

    /* renamed from: K */
    public float f41879K;

    /* renamed from: L */
    public boolean f41880L;

    /* renamed from: M */
    public int f41881M;

    /* renamed from: N */
    public int f41882N;

    /* renamed from: O */
    public int f41883O;

    /* renamed from: P */
    public C16682e f41884P;

    /* renamed from: Q */
    public C16682e f41885Q;

    /* renamed from: y */
    public int f41886y = -1;

    /* renamed from: z */
    public String f41887z = null;

    public C16669g() {
        int i = C16664b.f41732m;
        this.f41869A = i;
        this.f41870B = null;
        this.f41871C = null;
        this.f41872D = i;
        this.f41873E = i;
        this.f41874F = 0.1f;
        this.f41875G = true;
        this.f41876H = true;
        this.f41877I = true;
        this.f41878J = Float.NaN;
        this.f41880L = false;
        this.f41881M = i;
        this.f41882N = i;
        this.f41883O = i;
        this.f41884P = new C16682e();
        this.f41885Q = new C16682e();
        this.f41747k = 5;
        this.f41748l = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo48818a(java.lang.String r3) {
        /*
            r2 = this;
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1594793529: goto L_0x0082;
                case -966421266: goto L_0x0077;
                case -786670827: goto L_0x006c;
                case -648752941: goto L_0x0061;
                case -638126837: goto L_0x0056;
                case -76025313: goto L_0x004b;
                case -9754574: goto L_0x0040;
                case 364489912: goto L_0x0035;
                case 1301930599: goto L_0x0028;
                case 1401391082: goto L_0x001b;
                case 1535404999: goto L_0x000e;
                default: goto L_0x000b;
            }
        L_0x000b:
            r3 = r1
            goto L_0x008c
        L_0x000e:
            java.lang.String r0 = "triggerReceiver"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0017
            goto L_0x000b
        L_0x0017:
            r3 = 10
            goto L_0x008c
        L_0x001b:
            java.lang.String r0 = "postLayout"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0024
            goto L_0x000b
        L_0x0024:
            r3 = 9
            goto L_0x008c
        L_0x0028:
            java.lang.String r0 = "viewTransitionOnCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0031
            goto L_0x000b
        L_0x0031:
            r3 = 8
            goto L_0x008c
        L_0x0035:
            java.lang.String r0 = "triggerSlack"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x003e
            goto L_0x000b
        L_0x003e:
            r3 = 7
            goto L_0x008c
        L_0x0040:
            java.lang.String r0 = "viewTransitionOnNegativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0049
            goto L_0x000b
        L_0x0049:
            r3 = 6
            goto L_0x008c
        L_0x004b:
            java.lang.String r0 = "triggerCollisionView"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0054
            goto L_0x000b
        L_0x0054:
            r3 = 5
            goto L_0x008c
        L_0x0056:
            java.lang.String r0 = "negativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x005f
            goto L_0x000b
        L_0x005f:
            r3 = 4
            goto L_0x008c
        L_0x0061:
            java.lang.String r0 = "triggerID"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x006a
            goto L_0x000b
        L_0x006a:
            r3 = 3
            goto L_0x008c
        L_0x006c:
            java.lang.String r0 = "triggerCollisionId"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0075
            goto L_0x000b
        L_0x0075:
            r3 = 2
            goto L_0x008c
        L_0x0077:
            java.lang.String r0 = "viewTransitionOnPositiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0080
            goto L_0x000b
        L_0x0080:
            r3 = 1
            goto L_0x008c
        L_0x0082:
            java.lang.String r0 = "positiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x008b
            goto L_0x000b
        L_0x008b:
            r3 = 0
        L_0x008c:
            switch(r3) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x00ab;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00a5;
                case 4: goto L_0x00a2;
                case 5: goto L_0x009f;
                case 6: goto L_0x009c;
                case 7: goto L_0x0099;
                case 8: goto L_0x0096;
                case 9: goto L_0x0093;
                case 10: goto L_0x0090;
                default: goto L_0x008f;
            }
        L_0x008f:
            return r1
        L_0x0090:
            r3 = 311(0x137, float:4.36E-43)
            return r3
        L_0x0093:
            r3 = 304(0x130, float:4.26E-43)
            return r3
        L_0x0096:
            r3 = 301(0x12d, float:4.22E-43)
            return r3
        L_0x0099:
            r3 = 305(0x131, float:4.27E-43)
            return r3
        L_0x009c:
            r3 = 303(0x12f, float:4.25E-43)
            return r3
        L_0x009f:
            r3 = 306(0x132, float:4.29E-43)
            return r3
        L_0x00a2:
            r3 = 310(0x136, float:4.34E-43)
            return r3
        L_0x00a5:
            r3 = 308(0x134, float:4.32E-43)
            return r3
        L_0x00a8:
            r3 = 307(0x133, float:4.3E-43)
            return r3
        L_0x00ab:
            r3 = 302(0x12e, float:4.23E-43)
            return r3
        L_0x00ae:
            r3 = 309(0x135, float:4.33E-43)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.C16669g.mo48818a(java.lang.String):int");
    }

    /* renamed from: b */
    public boolean mo48820b(int i, int i2) {
        if (i == 307) {
            this.f41873E = i2;
            return true;
        } else if (i == 308) {
            this.f41872D = mo48955u(Integer.valueOf(i2));
            return true;
        } else if (i != 311) {
            switch (i) {
                case 301:
                    this.f41883O = i2;
                    return true;
                case 302:
                    this.f41882N = i2;
                    return true;
                case 303:
                    this.f41881M = i2;
                    return true;
                default:
                    return super.mo48820b(i, i2);
            }
        } else {
            this.f41869A = i2;
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo48822c(int i, float f) {
        if (i != 305) {
            return super.mo48822c(i, f);
        }
        this.f41874F = f;
        return true;
    }

    /* renamed from: d */
    public boolean mo48824d(int i, boolean z) {
        if (i != 304) {
            return super.mo48824d(i, z);
        }
        this.f41880L = z;
        return true;
    }

    /* renamed from: e */
    public boolean mo48826e(int i, String str) {
        if (i == 309) {
            this.f41871C = str;
            return true;
        } else if (i == 310) {
            this.f41870B = str;
            return true;
        } else if (i != 312) {
            return super.mo48826e(i, str);
        } else {
            this.f41887z = str;
            return true;
        }
    }

    /* renamed from: f */
    public void mo48940f(HashMap<String, C16703o> hashMap) {
    }

    /* renamed from: g */
    public C16664b clone() {
        return new C16669g().mo48942h(this);
    }

    /* renamed from: i */
    public void mo48943i(HashSet<String> hashSet) {
    }

    /* renamed from: v */
    public void mo48976v(float f, C16660e eVar) {
    }

    /* renamed from: w */
    public C16669g mo48942h(C16664b bVar) {
        super.mo48942h(bVar);
        C16669g gVar = (C16669g) bVar;
        this.f41886y = gVar.f41886y;
        this.f41887z = gVar.f41887z;
        this.f41869A = gVar.f41869A;
        this.f41870B = gVar.f41870B;
        this.f41871C = gVar.f41871C;
        this.f41872D = gVar.f41872D;
        this.f41873E = gVar.f41873E;
        this.f41874F = gVar.f41874F;
        this.f41875G = gVar.f41875G;
        this.f41876H = gVar.f41876H;
        this.f41877I = gVar.f41877I;
        this.f41878J = gVar.f41878J;
        this.f41879K = gVar.f41879K;
        this.f41880L = gVar.f41880L;
        this.f41884P = gVar.f41884P;
        this.f41885Q = gVar.f41885Q;
        return this;
    }

    /* renamed from: x */
    public final void mo48978x(String str, C16660e eVar) {
        boolean z;
        C16655a aVar;
        if (str.length() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String next : this.f41748l.keySet()) {
            String lowerCase = next.toLowerCase(Locale.ROOT);
            if ((z || lowerCase.matches(str)) && (aVar = this.f41748l.get(next)) != null) {
                aVar.mo48770a(eVar);
            }
        }
    }
}
