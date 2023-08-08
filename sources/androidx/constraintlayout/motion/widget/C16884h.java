package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.C16703o;
import androidx.constraintlayout.motion.utils.C16817c;
import androidx.constraintlayout.motion.utils.C16831d;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.h */
public class C16884h extends C16881f {

    /* renamed from: X */
    public static final String f43438X = "KeyCycle";

    /* renamed from: Y */
    public static final String f43439Y = "KeyCycle";

    /* renamed from: Z */
    public static final String f43440Z = "wavePeriod";

    /* renamed from: a0 */
    public static final String f43441a0 = "waveOffset";

    /* renamed from: b0 */
    public static final String f43442b0 = "wavePhase";

    /* renamed from: c0 */
    public static final String f43443c0 = "waveShape";

    /* renamed from: d0 */
    public static final int f43444d0 = 0;

    /* renamed from: e0 */
    public static final int f43445e0 = 1;

    /* renamed from: f0 */
    public static final int f43446f0 = 2;

    /* renamed from: g0 */
    public static final int f43447g0 = 3;

    /* renamed from: h0 */
    public static final int f43448h0 = 4;

    /* renamed from: i0 */
    public static final int f43449i0 = 5;

    /* renamed from: j0 */
    public static final int f43450j0 = 6;

    /* renamed from: k0 */
    public static final int f43451k0 = 4;

    /* renamed from: D */
    public String f43452D = null;

    /* renamed from: E */
    public int f43453E = 0;

    /* renamed from: F */
    public int f43454F = -1;

    /* renamed from: G */
    public String f43455G = null;

    /* renamed from: H */
    public float f43456H = Float.NaN;

    /* renamed from: I */
    public float f43457I = 0.0f;

    /* renamed from: J */
    public float f43458J = 0.0f;

    /* renamed from: K */
    public float f43459K = Float.NaN;

    /* renamed from: L */
    public int f43460L = -1;

    /* renamed from: M */
    public float f43461M = Float.NaN;

    /* renamed from: N */
    public float f43462N = Float.NaN;

    /* renamed from: O */
    public float f43463O = Float.NaN;

    /* renamed from: P */
    public float f43464P = Float.NaN;

    /* renamed from: Q */
    public float f43465Q = Float.NaN;

    /* renamed from: R */
    public float f43466R = Float.NaN;

    /* renamed from: S */
    public float f43467S = Float.NaN;

    /* renamed from: T */
    public float f43468T = Float.NaN;

    /* renamed from: U */
    public float f43469U = Float.NaN;

    /* renamed from: V */
    public float f43470V = Float.NaN;

    /* renamed from: W */
    public float f43471W = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.h$a */
    public static class C16885a {

        /* renamed from: a */
        public static final int f43472a = 1;

        /* renamed from: b */
        public static final int f43473b = 2;

        /* renamed from: c */
        public static final int f43474c = 3;

        /* renamed from: d */
        public static final int f43475d = 4;

        /* renamed from: e */
        public static final int f43476e = 5;

        /* renamed from: f */
        public static final int f43477f = 6;

        /* renamed from: g */
        public static final int f43478g = 7;

        /* renamed from: h */
        public static final int f43479h = 8;

        /* renamed from: i */
        public static final int f43480i = 9;

        /* renamed from: j */
        public static final int f43481j = 10;

        /* renamed from: k */
        public static final int f43482k = 11;

        /* renamed from: l */
        public static final int f43483l = 12;

        /* renamed from: m */
        public static final int f43484m = 13;

        /* renamed from: n */
        public static final int f43485n = 14;

        /* renamed from: o */
        public static final int f43486o = 15;

        /* renamed from: p */
        public static final int f43487p = 16;

        /* renamed from: q */
        public static final int f43488q = 17;

        /* renamed from: r */
        public static final int f43489r = 18;

        /* renamed from: s */
        public static final int f43490s = 19;

        /* renamed from: t */
        public static final int f43491t = 20;

        /* renamed from: u */
        public static final int f43492u = 21;

        /* renamed from: v */
        public static SparseIntArray f43493v;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f43493v = sparseIntArray;
            sparseIntArray.append(C16944e.C16957m.KeyCycle_motionTarget, 1);
            f43493v.append(C16944e.C16957m.KeyCycle_framePosition, 2);
            f43493v.append(C16944e.C16957m.KeyCycle_transitionEasing, 3);
            f43493v.append(C16944e.C16957m.KeyCycle_curveFit, 4);
            f43493v.append(C16944e.C16957m.KeyCycle_waveShape, 5);
            f43493v.append(C16944e.C16957m.KeyCycle_wavePeriod, 6);
            f43493v.append(C16944e.C16957m.KeyCycle_waveOffset, 7);
            f43493v.append(C16944e.C16957m.KeyCycle_waveVariesBy, 8);
            f43493v.append(C16944e.C16957m.KeyCycle_android_alpha, 9);
            f43493v.append(C16944e.C16957m.KeyCycle_android_elevation, 10);
            f43493v.append(C16944e.C16957m.KeyCycle_android_rotation, 11);
            f43493v.append(C16944e.C16957m.KeyCycle_android_rotationX, 12);
            f43493v.append(C16944e.C16957m.KeyCycle_android_rotationY, 13);
            f43493v.append(C16944e.C16957m.KeyCycle_transitionPathRotate, 14);
            f43493v.append(C16944e.C16957m.KeyCycle_android_scaleX, 15);
            f43493v.append(C16944e.C16957m.KeyCycle_android_scaleY, 16);
            f43493v.append(C16944e.C16957m.KeyCycle_android_translationX, 17);
            f43493v.append(C16944e.C16957m.KeyCycle_android_translationY, 18);
            f43493v.append(C16944e.C16957m.KeyCycle_android_translationZ, 19);
            f43493v.append(C16944e.C16957m.KeyCycle_motionProgress, 20);
            f43493v.append(C16944e.C16957m.KeyCycle_wavePhase, 21);
        }

        /* renamed from: b */
        public static void m77727b(C16884h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f43493v.get(index)) {
                    case 1:
                        if (!MotionLayout.f43205d2) {
                            if (typedArray.peekValue(index).type != 3) {
                                hVar.f43394b = typedArray.getResourceId(index, hVar.f43394b);
                                break;
                            } else {
                                hVar.f43395c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, hVar.f43394b);
                            hVar.f43394b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                hVar.f43395c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        hVar.f43393a = typedArray.getInt(index, hVar.f43393a);
                        break;
                    case 3:
                        String unused = hVar.f43452D = typedArray.getString(index);
                        break;
                    case 4:
                        int unused2 = hVar.f43453E = typedArray.getInteger(index, hVar.f43453E);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type != 3) {
                            int unused3 = hVar.f43454F = typedArray.getInt(index, hVar.f43454F);
                            break;
                        } else {
                            String unused4 = hVar.f43455G = typedArray.getString(index);
                            int unused5 = hVar.f43454F = 7;
                            break;
                        }
                    case 6:
                        float unused6 = hVar.f43456H = typedArray.getFloat(index, hVar.f43456H);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused7 = hVar.f43457I = typedArray.getFloat(index, hVar.f43457I);
                            break;
                        } else {
                            float unused8 = hVar.f43457I = typedArray.getDimension(index, hVar.f43457I);
                            break;
                        }
                    case 8:
                        int unused9 = hVar.f43460L = typedArray.getInt(index, hVar.f43460L);
                        break;
                    case 9:
                        float unused10 = hVar.f43461M = typedArray.getFloat(index, hVar.f43461M);
                        break;
                    case 10:
                        float unused11 = hVar.f43462N = typedArray.getDimension(index, hVar.f43462N);
                        break;
                    case 11:
                        float unused12 = hVar.f43463O = typedArray.getFloat(index, hVar.f43463O);
                        break;
                    case 12:
                        float unused13 = hVar.f43465Q = typedArray.getFloat(index, hVar.f43465Q);
                        break;
                    case 13:
                        float unused14 = hVar.f43466R = typedArray.getFloat(index, hVar.f43466R);
                        break;
                    case 14:
                        float unused15 = hVar.f43464P = typedArray.getFloat(index, hVar.f43464P);
                        break;
                    case 15:
                        float unused16 = hVar.f43467S = typedArray.getFloat(index, hVar.f43467S);
                        break;
                    case 16:
                        float unused17 = hVar.f43468T = typedArray.getFloat(index, hVar.f43468T);
                        break;
                    case 17:
                        float unused18 = hVar.f43469U = typedArray.getDimension(index, hVar.f43469U);
                        break;
                    case 18:
                        float unused19 = hVar.f43470V = typedArray.getDimension(index, hVar.f43470V);
                        break;
                    case 19:
                        float unused20 = hVar.f43471W = typedArray.getDimension(index, hVar.f43471W);
                        break;
                    case 20:
                        float unused21 = hVar.f43459K = typedArray.getFloat(index, hVar.f43459K);
                        break;
                    case 21:
                        float unused22 = hVar.f43458J = typedArray.getFloat(index, hVar.f43458J) / 360.0f;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f43493v.get(index));
                        break;
                }
            }
        }
    }

    public C16884h() {
        this.f43396d = 4;
        this.f43397e = new HashMap<>();
    }

    /* renamed from: a */
    public void mo50156a(HashMap<String, C16831d> hashMap) {
        C16878c.m77591n("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String next : hashMap.keySet()) {
            C16703o oVar = hashMap.get(next);
            if (oVar != null) {
                next.hashCode();
                char c = 65535;
                switch (next.hashCode()) {
                    case -1249320806:
                        if (next.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (next.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (next.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (next.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (next.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (next.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (next.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (next.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (next.equals(C16881f.f43375i)) {
                            c = 8;
                            break;
                        }
                        break;
                    case -4379043:
                        if (next.equals("elevation")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 37232917:
                        if (next.equals("transitionPathRotate")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 92909918:
                        if (next.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (next.equals("waveOffset")) {
                            c = 12;
                            break;
                        }
                        break;
                    case 1530034690:
                        if (next.equals("wavePhase")) {
                            c = 13;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        oVar.mo49074g(this.f43393a, this.f43465Q);
                        break;
                    case 1:
                        oVar.mo49074g(this.f43393a, this.f43466R);
                        break;
                    case 2:
                        oVar.mo49074g(this.f43393a, this.f43469U);
                        break;
                    case 3:
                        oVar.mo49074g(this.f43393a, this.f43470V);
                        break;
                    case 4:
                        oVar.mo49074g(this.f43393a, this.f43471W);
                        break;
                    case 5:
                        oVar.mo49074g(this.f43393a, this.f43459K);
                        break;
                    case 6:
                        oVar.mo49074g(this.f43393a, this.f43467S);
                        break;
                    case 7:
                        oVar.mo49074g(this.f43393a, this.f43468T);
                        break;
                    case 8:
                        oVar.mo49074g(this.f43393a, this.f43463O);
                        break;
                    case 9:
                        oVar.mo49074g(this.f43393a, this.f43462N);
                        break;
                    case 10:
                        oVar.mo49074g(this.f43393a, this.f43464P);
                        break;
                    case 11:
                        oVar.mo49074g(this.f43393a, this.f43461M);
                        break;
                    case 12:
                        oVar.mo49074g(this.f43393a, this.f43457I);
                        break;
                    case 13:
                        oVar.mo49074g(this.f43393a, this.f43458J);
                        break;
                    default:
                        if (next.startsWith("CUSTOM")) {
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("  UNKNOWN  ");
                            sb.append(next);
                            break;
                        }
                }
            }
        }
    }

    /* renamed from: a0 */
    public void mo50172a0(HashMap<String, C16817c> hashMap) {
        C16817c cVar;
        C16817c cVar2;
        HashMap<String, C16817c> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.f43397e.get(next.substring(7));
                if (!(constraintAttribute == null || constraintAttribute.mo50631j() != ConstraintAttribute.AttributeType.FLOAT_TYPE || (cVar2 = hashMap2.get(next)) == null)) {
                    cVar2.mo49023g(this.f43393a, this.f43454F, this.f43455G, this.f43460L, this.f43456H, this.f43457I, this.f43458J, constraintAttribute.mo50632k(), constraintAttribute);
                }
            } else {
                float b0 = mo50173b0(next);
                if (!Float.isNaN(b0) && (cVar = hashMap2.get(next)) != null) {
                    cVar.mo49022f(this.f43393a, this.f43454F, this.f43455G, this.f43460L, this.f43456H, this.f43457I, this.f43458J, b0);
                }
            }
        }
    }

    /* renamed from: b */
    public C16881f clone() {
        return new C16884h().mo50158c(this);
    }

    /* renamed from: b0 */
    public float mo50173b0(String str) {
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
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(C16881f.f43375i)) {
                    c = 8;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 9;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
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
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 12;
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f43465Q;
            case 1:
                return this.f43466R;
            case 2:
                return this.f43469U;
            case 3:
                return this.f43470V;
            case 4:
                return this.f43471W;
            case 5:
                return this.f43459K;
            case 6:
                return this.f43467S;
            case 7:
                return this.f43468T;
            case 8:
                return this.f43463O;
            case 9:
                return this.f43462N;
            case 10:
                return this.f43464P;
            case 11:
                return this.f43461M;
            case 12:
                return this.f43457I;
            case 13:
                return this.f43458J;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("  UNKNOWN  ");
                sb.append(str);
                return Float.NaN;
        }
    }

    /* renamed from: c */
    public C16881f mo50158c(C16881f fVar) {
        super.mo50158c(fVar);
        C16884h hVar = (C16884h) fVar;
        this.f43452D = hVar.f43452D;
        this.f43453E = hVar.f43453E;
        this.f43454F = hVar.f43454F;
        this.f43455G = hVar.f43455G;
        this.f43456H = hVar.f43456H;
        this.f43457I = hVar.f43457I;
        this.f43458J = hVar.f43458J;
        this.f43459K = hVar.f43459K;
        this.f43460L = hVar.f43460L;
        this.f43461M = hVar.f43461M;
        this.f43462N = hVar.f43462N;
        this.f43463O = hVar.f43463O;
        this.f43464P = hVar.f43464P;
        this.f43465Q = hVar.f43465Q;
        this.f43466R = hVar.f43466R;
        this.f43467S = hVar.f43467S;
        this.f43468T = hVar.f43468T;
        this.f43469U = hVar.f43469U;
        this.f43470V = hVar.f43470V;
        this.f43471W = hVar.f43471W;
        return this;
    }

    /* renamed from: d */
    public void mo50160d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f43461M)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f43462N)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f43463O)) {
            hashSet.add(C16881f.f43375i);
        }
        if (!Float.isNaN(this.f43465Q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f43466R)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f43467S)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f43468T)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f43464P)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f43469U)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f43470V)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f43471W)) {
            hashSet.add("translationZ");
        }
        if (this.f43397e.size() > 0) {
            for (String str : this.f43397e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    /* renamed from: f */
    public void mo50162f(Context context, AttributeSet attributeSet) {
        C16885a.m77727b(this, context.obtainStyledAttributes(attributeSet, C16944e.C16957m.KeyCycle));
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
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = 16;
                    break;
                }
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f43459K = mo50169m(obj);
                return;
            case 1:
                this.f43452D = obj.toString();
                return;
            case 2:
                this.f43465Q = mo50169m(obj);
                return;
            case 3:
                this.f43466R = mo50169m(obj);
                return;
            case 4:
                this.f43469U = mo50169m(obj);
                return;
            case 5:
                this.f43470V = mo50169m(obj);
                return;
            case 6:
                this.f43471W = mo50169m(obj);
                return;
            case 7:
                this.f43467S = mo50169m(obj);
                return;
            case 8:
                this.f43468T = mo50169m(obj);
                return;
            case 9:
                this.f43463O = mo50169m(obj);
                return;
            case 10:
                this.f43462N = mo50169m(obj);
                return;
            case 11:
                this.f43464P = mo50169m(obj);
                return;
            case 12:
                this.f43461M = mo50169m(obj);
                return;
            case 13:
                this.f43457I = mo50169m(obj);
                return;
            case 14:
                this.f43456H = mo50169m(obj);
                return;
            case 15:
                this.f43453E = mo50170n(obj);
                return;
            case 16:
                this.f43458J = mo50169m(obj);
                return;
            case 17:
                if (obj instanceof Integer) {
                    this.f43454F = mo50170n(obj);
                    return;
                }
                this.f43454F = 7;
                this.f43455G = obj.toString();
                return;
            default:
                return;
        }
    }
}
