package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.C16655a;
import androidx.constraintlayout.core.motion.utils.C16686h;
import androidx.constraintlayout.core.motion.utils.C16703o;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.constraintlayout.core.motion.utils.C16727w;
import com.google.firebase.installations.C33124s;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.constraintlayout.core.motion.key.d */
public class C16666d extends C16664b {

    /* renamed from: R */
    public static final String f41770R = "KeyCycle";

    /* renamed from: S */
    public static final String f41771S = "KeyCycle";

    /* renamed from: T */
    public static final String f41772T = "wavePeriod";

    /* renamed from: U */
    public static final String f41773U = "waveOffset";

    /* renamed from: V */
    public static final String f41774V = "wavePhase";

    /* renamed from: W */
    public static final String f41775W = "waveShape";

    /* renamed from: X */
    public static final int f41776X = 0;

    /* renamed from: Y */
    public static final int f41777Y = 1;

    /* renamed from: Z */
    public static final int f41778Z = 2;

    /* renamed from: a0 */
    public static final int f41779a0 = 3;

    /* renamed from: b0 */
    public static final int f41780b0 = 4;

    /* renamed from: c0 */
    public static final int f41781c0 = 5;

    /* renamed from: d0 */
    public static final int f41782d0 = 6;

    /* renamed from: e0 */
    public static final int f41783e0 = 4;

    /* renamed from: A */
    public int f41784A = -1;

    /* renamed from: B */
    public String f41785B = null;

    /* renamed from: C */
    public float f41786C = Float.NaN;

    /* renamed from: D */
    public float f41787D = 0.0f;

    /* renamed from: E */
    public float f41788E = 0.0f;

    /* renamed from: F */
    public float f41789F = Float.NaN;

    /* renamed from: G */
    public float f41790G = Float.NaN;

    /* renamed from: H */
    public float f41791H = Float.NaN;

    /* renamed from: I */
    public float f41792I = Float.NaN;

    /* renamed from: J */
    public float f41793J = Float.NaN;

    /* renamed from: K */
    public float f41794K = Float.NaN;

    /* renamed from: L */
    public float f41795L = Float.NaN;

    /* renamed from: M */
    public float f41796M = Float.NaN;

    /* renamed from: N */
    public float f41797N = Float.NaN;

    /* renamed from: O */
    public float f41798O = Float.NaN;

    /* renamed from: P */
    public float f41799P = Float.NaN;

    /* renamed from: Q */
    public float f41800Q = Float.NaN;

    /* renamed from: y */
    public String f41801y = null;

    /* renamed from: z */
    public int f41802z = 0;

    public C16666d() {
        this.f41747k = 4;
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
                case -1581616630: goto L_0x010f;
                case -1310311125: goto L_0x0103;
                case -1249320806: goto L_0x00f7;
                case -1249320805: goto L_0x00eb;
                case -1249320804: goto L_0x00df;
                case -1225497657: goto L_0x00d3;
                case -1225497656: goto L_0x00c7;
                case -1225497655: goto L_0x00bb;
                case -1019779949: goto L_0x00ad;
                case -1001078227: goto L_0x009f;
                case -991726143: goto L_0x0091;
                case -987906986: goto L_0x0083;
                case -987906985: goto L_0x0076;
                case -908189618: goto L_0x0069;
                case -908189617: goto L_0x005c;
                case 92909918: goto L_0x004f;
                case 106629499: goto L_0x0042;
                case 579057826: goto L_0x0035;
                case 803192288: goto L_0x0028;
                case 1532805160: goto L_0x001b;
                case 1941332754: goto L_0x000e;
                default: goto L_0x000b;
            }
        L_0x000b:
            r3 = r1
            goto L_0x011a
        L_0x000e:
            java.lang.String r0 = "visibility"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0017
            goto L_0x000b
        L_0x0017:
            r3 = 20
            goto L_0x011a
        L_0x001b:
            java.lang.String r0 = "waveShape"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0024
            goto L_0x000b
        L_0x0024:
            r3 = 19
            goto L_0x011a
        L_0x0028:
            java.lang.String r0 = "pathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0031
            goto L_0x000b
        L_0x0031:
            r3 = 18
            goto L_0x011a
        L_0x0035:
            java.lang.String r0 = "curveFit"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x003e
            goto L_0x000b
        L_0x003e:
            r3 = 17
            goto L_0x011a
        L_0x0042:
            java.lang.String r0 = "phase"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x004b
            goto L_0x000b
        L_0x004b:
            r3 = 16
            goto L_0x011a
        L_0x004f:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0058
            goto L_0x000b
        L_0x0058:
            r3 = 15
            goto L_0x011a
        L_0x005c:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0065
            goto L_0x000b
        L_0x0065:
            r3 = 14
            goto L_0x011a
        L_0x0069:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0072
            goto L_0x000b
        L_0x0072:
            r3 = 13
            goto L_0x011a
        L_0x0076:
            java.lang.String r0 = "pivotY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x007f
            goto L_0x000b
        L_0x007f:
            r3 = 12
            goto L_0x011a
        L_0x0083:
            java.lang.String r0 = "pivotX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x008d
            goto L_0x000b
        L_0x008d:
            r3 = 11
            goto L_0x011a
        L_0x0091:
            java.lang.String r0 = "period"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x009b
            goto L_0x000b
        L_0x009b:
            r3 = 10
            goto L_0x011a
        L_0x009f:
            java.lang.String r0 = "progress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00a9
            goto L_0x000b
        L_0x00a9:
            r3 = 9
            goto L_0x011a
        L_0x00ad:
            java.lang.String r0 = "offset"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00b7
            goto L_0x000b
        L_0x00b7:
            r3 = 8
            goto L_0x011a
        L_0x00bb:
            java.lang.String r0 = "translationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00c5
            goto L_0x000b
        L_0x00c5:
            r3 = 7
            goto L_0x011a
        L_0x00c7:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00d1
            goto L_0x000b
        L_0x00d1:
            r3 = 6
            goto L_0x011a
        L_0x00d3:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00dd
            goto L_0x000b
        L_0x00dd:
            r3 = 5
            goto L_0x011a
        L_0x00df:
            java.lang.String r0 = "rotationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00e9
            goto L_0x000b
        L_0x00e9:
            r3 = 4
            goto L_0x011a
        L_0x00eb:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00f5
            goto L_0x000b
        L_0x00f5:
            r3 = 3
            goto L_0x011a
        L_0x00f7:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0101
            goto L_0x000b
        L_0x0101:
            r3 = 2
            goto L_0x011a
        L_0x0103:
            java.lang.String r0 = "easing"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x010d
            goto L_0x000b
        L_0x010d:
            r3 = 1
            goto L_0x011a
        L_0x010f:
            java.lang.String r0 = "customWave"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0119
            goto L_0x000b
        L_0x0119:
            r3 = 0
        L_0x011a:
            switch(r3) {
                case 0: goto L_0x015a;
                case 1: goto L_0x0157;
                case 2: goto L_0x0154;
                case 3: goto L_0x0151;
                case 4: goto L_0x014e;
                case 5: goto L_0x014b;
                case 6: goto L_0x0148;
                case 7: goto L_0x0145;
                case 8: goto L_0x0142;
                case 9: goto L_0x013f;
                case 10: goto L_0x013c;
                case 11: goto L_0x0139;
                case 12: goto L_0x0136;
                case 13: goto L_0x0133;
                case 14: goto L_0x0130;
                case 15: goto L_0x012d;
                case 16: goto L_0x012a;
                case 17: goto L_0x0127;
                case 18: goto L_0x0124;
                case 19: goto L_0x0121;
                case 20: goto L_0x011e;
                default: goto L_0x011d;
            }
        L_0x011d:
            return r1
        L_0x011e:
            r3 = 402(0x192, float:5.63E-43)
            return r3
        L_0x0121:
            r3 = 421(0x1a5, float:5.9E-43)
            return r3
        L_0x0124:
            r3 = 416(0x1a0, float:5.83E-43)
            return r3
        L_0x0127:
            r3 = 401(0x191, float:5.62E-43)
            return r3
        L_0x012a:
            r3 = 425(0x1a9, float:5.96E-43)
            return r3
        L_0x012d:
            r3 = 403(0x193, float:5.65E-43)
            return r3
        L_0x0130:
            r3 = 312(0x138, float:4.37E-43)
            return r3
        L_0x0133:
            r3 = 311(0x137, float:4.36E-43)
            return r3
        L_0x0136:
            r3 = 314(0x13a, float:4.4E-43)
            return r3
        L_0x0139:
            r3 = 313(0x139, float:4.39E-43)
            return r3
        L_0x013c:
            r3 = 423(0x1a7, float:5.93E-43)
            return r3
        L_0x013f:
            r3 = 315(0x13b, float:4.41E-43)
            return r3
        L_0x0142:
            r3 = 424(0x1a8, float:5.94E-43)
            return r3
        L_0x0145:
            r3 = 306(0x132, float:4.29E-43)
            return r3
        L_0x0148:
            r3 = 305(0x131, float:4.27E-43)
            return r3
        L_0x014b:
            r3 = 304(0x130, float:4.26E-43)
            return r3
        L_0x014e:
            r3 = 310(0x136, float:4.34E-43)
            return r3
        L_0x0151:
            r3 = 309(0x135, float:4.33E-43)
            return r3
        L_0x0154:
            r3 = 308(0x134, float:4.32E-43)
            return r3
        L_0x0157:
            r3 = 420(0x1a4, float:5.89E-43)
            return r3
        L_0x015a:
            r3 = 422(0x1a6, float:5.91E-43)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.C16666d.mo48818a(java.lang.String):int");
    }

    /* renamed from: b */
    public boolean mo48820b(int i, int i2) {
        if (i == 401) {
            this.f41802z = i2;
            return true;
        } else if (i == 421) {
            this.f41784A = i2;
            return true;
        } else if (mo48822c(i, (float) i2)) {
            return true;
        } else {
            return super.mo48820b(i, i2);
        }
    }

    /* renamed from: c */
    public boolean mo48822c(int i, float f) {
        if (i == 315) {
            this.f41789F = f;
            return true;
        } else if (i == 403) {
            this.f41790G = f;
            return true;
        } else if (i != 416) {
            switch (i) {
                case 304:
                    this.f41798O = f;
                    return true;
                case 305:
                    this.f41799P = f;
                    return true;
                case 306:
                    this.f41800Q = f;
                    return true;
                case 307:
                    this.f41791H = f;
                    return true;
                case 308:
                    this.f41794K = f;
                    return true;
                case 309:
                    this.f41795L = f;
                    return true;
                case 310:
                    this.f41792I = f;
                    return true;
                case 311:
                    this.f41796M = f;
                    return true;
                case 312:
                    this.f41797N = f;
                    return true;
                default:
                    switch (i) {
                        case C16717v.C16720c.f42234u /*423*/:
                            this.f41786C = f;
                            return true;
                        case C16717v.C16720c.f42235v /*424*/:
                            this.f41787D = f;
                            return true;
                        case C16717v.C16720c.f42236w /*425*/:
                            this.f41788E = f;
                            return true;
                        default:
                            return super.mo48822c(i, f);
                    }
            }
        } else {
            this.f41793J = f;
            return true;
        }
    }

    /* renamed from: e */
    public boolean mo48826e(int i, String str) {
        if (i == 420) {
            this.f41801y = str;
            return true;
        } else if (i != 422) {
            return super.mo48826e(i, str);
        } else {
            this.f41785B = str;
            return true;
        }
    }

    /* renamed from: f */
    public void mo48940f(HashMap<String, C16703o> hashMap) {
    }

    /* renamed from: g */
    public C16664b clone() {
        return null;
    }

    /* renamed from: i */
    public void mo48943i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f41790G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f41791H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f41792I)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f41794K)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f41795L)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f41796M)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f41797N)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f41793J)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f41798O)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f41799P)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f41800Q)) {
            hashSet.add("translationZ");
        }
        if (this.f41748l.size() > 0) {
            for (String str : this.f41748l.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: v */
    public void mo48959v(HashMap<String, C16686h> hashMap) {
        C16686h hVar;
        C16686h hVar2;
        HashMap<String, C16686h> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith("CUSTOM")) {
                C16655a aVar = this.f41748l.get(next.substring(7));
                if (!(aVar == null || aVar.mo48780m() != 901 || (hVar2 = hashMap2.get(next)) == null)) {
                    hVar2.mo49023g(this.f41744h, this.f41784A, this.f41785B, -1, this.f41786C, this.f41787D, this.f41788E, aVar.mo48781n(), aVar);
                }
            } else {
                float x = mo48961x(next);
                if (!Float.isNaN(x) && (hVar = hashMap2.get(next)) != null) {
                    hVar.mo49022f(this.f41744h, this.f41784A, this.f41785B, -1, this.f41786C, this.f41787D, this.f41788E, x);
                }
            }
        }
    }

    /* renamed from: w */
    public void mo48960w() {
        PrintStream printStream = System.out;
        printStream.println("MotionKeyCycle{mWaveShape=" + this.f41784A + ", mWavePeriod=" + this.f41786C + ", mWaveOffset=" + this.f41787D + ", mWavePhase=" + this.f41788E + ", mRotation=" + this.f41792I + C12361b.f30259j);
    }

    /* renamed from: x */
    public float mo48961x(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 5;
                    break;
                }
                break;
            case -1019779949:
                if (str.equals(C16717v.C16720c.f42211R)) {
                    c = 6;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 7;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 8;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
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
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
            case 106629499:
                if (str.equals(C16717v.C16720c.f42212S)) {
                    c = 12;
                    break;
                }
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f41794K;
            case 1:
                return this.f41795L;
            case 2:
                return this.f41792I;
            case 3:
                return this.f41798O;
            case 4:
                return this.f41799P;
            case 5:
                return this.f41800Q;
            case 6:
                return this.f41787D;
            case 7:
                return this.f41789F;
            case 8:
                return this.f41796M;
            case 9:
                return this.f41797N;
            case 10:
                return this.f41791H;
            case 11:
                return this.f41790G;
            case 12:
                return this.f41788E;
            case 13:
                return this.f41793J;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: y */
    public void mo48962y() {
        HashSet hashSet = new HashSet();
        mo48943i(hashSet);
        C16727w.m76355c(" ------------- " + this.f41744h + " -------------");
        C16727w.m76355c("MotionKeyCycle{Shape=" + this.f41784A + ", Period=" + this.f41786C + ", Offset=" + this.f41787D + ", Phase=" + this.f41788E + C12361b.f30259j);
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            C16717v.C16718a.m76346a(strArr[i]);
            C16727w.m76355c(strArr[i] + C33124s.f80355c + mo48961x(strArr[i]));
        }
    }
}
