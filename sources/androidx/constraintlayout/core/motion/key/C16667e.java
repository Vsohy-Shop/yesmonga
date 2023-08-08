package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.C16660e;
import androidx.constraintlayout.core.motion.utils.C16682e;
import androidx.constraintlayout.core.motion.utils.C16703o;
import androidx.constraintlayout.core.motion.utils.C16717v;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.core.motion.key.e */
public class C16667e extends C16664b {

    /* renamed from: L */
    public static final String f41803L = "KeyPosition";

    /* renamed from: M */
    public static final float f41804M = 20.0f;

    /* renamed from: N */
    public static final int f41805N = 2;

    /* renamed from: O */
    public static final int f41806O = 1;

    /* renamed from: P */
    public static final int f41807P = 0;

    /* renamed from: Q */
    public static final int f41808Q = 2;

    /* renamed from: A */
    public int f41809A;

    /* renamed from: B */
    public int f41810B;

    /* renamed from: C */
    public float f41811C;

    /* renamed from: D */
    public float f41812D;

    /* renamed from: E */
    public float f41813E;

    /* renamed from: F */
    public float f41814F;

    /* renamed from: G */
    public float f41815G;

    /* renamed from: H */
    public float f41816H;

    /* renamed from: I */
    public int f41817I;

    /* renamed from: J */
    public float f41818J;

    /* renamed from: K */
    public float f41819K;

    /* renamed from: y */
    public int f41820y;

    /* renamed from: z */
    public String f41821z = null;

    public C16667e() {
        int i = C16664b.f41732m;
        this.f41820y = i;
        this.f41809A = i;
        this.f41810B = 0;
        this.f41811C = Float.NaN;
        this.f41812D = Float.NaN;
        this.f41813E = Float.NaN;
        this.f41814F = Float.NaN;
        this.f41815G = Float.NaN;
        this.f41816H = Float.NaN;
        this.f41817I = 0;
        this.f41818J = Float.NaN;
        this.f41819K = Float.NaN;
        this.f41747k = 2;
    }

    /* renamed from: A */
    public float mo48963A() {
        return this.f41819K;
    }

    /* renamed from: B */
    public boolean mo48964B(int i, int i2, C16682e eVar, C16682e eVar2, float f, float f2) {
        mo48971x(i, i2, eVar.mo49006a(), eVar.mo49007b(), eVar2.mo49006a(), eVar2.mo49007b());
        if (Math.abs(f - this.f41818J) >= 20.0f || Math.abs(f2 - this.f41819K) >= 20.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public void mo48965C(C16660e eVar, C16682e eVar2, C16682e eVar3, float f, float f2, String[] strArr, float[] fArr) {
        int i = this.f41817I;
        if (i == 1) {
            mo48967E(eVar2, eVar3, f, f2, strArr, fArr);
        } else if (i != 2) {
            mo48966D(eVar2, eVar3, f, f2, strArr, fArr);
        } else {
            mo48968F(eVar, eVar2, eVar3, f, f2, strArr, fArr);
        }
    }

    /* renamed from: D */
    public void mo48966D(C16682e eVar, C16682e eVar2, float f, float f2, String[] strArr, float[] fArr) {
        float a = eVar.mo49006a();
        float b = eVar.mo49007b();
        float a2 = eVar2.mo49006a() - a;
        float b2 = eVar2.mo49007b() - b;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f - a) / a2;
            strArr[1] = "percentY";
            fArr[1] = (f2 - b) / b2;
        } else if ("percentX".equals(str)) {
            fArr[0] = (f - a) / a2;
            fArr[1] = (f2 - b) / b2;
        } else {
            fArr[1] = (f - a) / a2;
            fArr[0] = (f2 - b) / b2;
        }
    }

    /* renamed from: E */
    public void mo48967E(C16682e eVar, C16682e eVar2, float f, float f2, String[] strArr, float[] fArr) {
        float a = eVar.mo49006a();
        float b = eVar.mo49007b();
        float a2 = eVar2.mo49006a() - a;
        float b2 = eVar2.mo49007b() - b;
        float hypot = (float) Math.hypot((double) a2, (double) b2);
        if (((double) hypot) < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = a2 / hypot;
        float f4 = b2 / hypot;
        float f5 = f2 - b;
        float f6 = f - a;
        float f7 = ((f3 * f5) - (f6 * f4)) / hypot;
        float f8 = ((f3 * f6) + (f4 * f5)) / hypot;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            strArr[1] = "percentY";
            fArr[0] = f8;
            fArr[1] = f7;
        } else if ("percentX".equals(str)) {
            fArr[0] = f8;
            fArr[1] = f7;
        }
    }

    /* renamed from: F */
    public void mo48968F(C16660e eVar, C16682e eVar2, C16682e eVar3, float f, float f2, String[] strArr, float[] fArr) {
        eVar2.mo49006a();
        eVar2.mo49007b();
        eVar3.mo49006a();
        eVar3.mo49007b();
        C16660e n = eVar.mo48925n();
        int D = n.mo48892D();
        int k = n.mo48922k();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f / ((float) D);
            strArr[1] = "percentY";
            fArr[1] = f2 / ((float) k);
        } else if ("percentX".equals(str)) {
            fArr[0] = f / ((float) D);
            fArr[1] = f2 / ((float) k);
        } else {
            fArr[1] = f / ((float) D);
            fArr[0] = f2 / ((float) k);
        }
    }

    /* renamed from: a */
    public int mo48818a(String str) {
        return C16717v.C16724g.m76351a(str);
    }

    /* renamed from: b */
    public boolean mo48820b(int i, int i2) {
        if (i == 100) {
            this.f41744h = i2;
            return true;
        } else if (i == 508) {
            this.f41820y = i2;
            return true;
        } else if (i != 510) {
            return super.mo48820b(i, i2);
        } else {
            this.f41817I = i2;
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo48822c(int i, float f) {
        switch (i) {
            case 503:
                this.f41811C = f;
                return true;
            case 504:
                this.f41812D = f;
                return true;
            case C16717v.C16724g.f42309m /*505*/:
                this.f41811C = f;
                this.f41812D = f;
                return true;
            case C16717v.C16724g.f42310n /*506*/:
                this.f41813E = f;
                return true;
            case C16717v.C16724g.f42311o /*507*/:
                this.f41814F = f;
                return true;
            default:
                return super.mo48822c(i, f);
        }
    }

    /* renamed from: e */
    public boolean mo48826e(int i, String str) {
        if (i != 501) {
            return super.mo48826e(i, str);
        }
        this.f41821z = str.toString();
        return true;
    }

    /* renamed from: f */
    public void mo48940f(HashMap<String, C16703o> hashMap) {
    }

    /* renamed from: g */
    public C16664b clone() {
        return new C16667e().mo48942h(this);
    }

    /* renamed from: h */
    public C16664b mo48942h(C16664b bVar) {
        super.mo48942h(bVar);
        C16667e eVar = (C16667e) bVar;
        this.f41821z = eVar.f41821z;
        this.f41809A = eVar.f41809A;
        this.f41810B = eVar.f41810B;
        this.f41811C = eVar.f41811C;
        this.f41812D = Float.NaN;
        this.f41813E = eVar.f41813E;
        this.f41814F = eVar.f41814F;
        this.f41815G = eVar.f41815G;
        this.f41816H = eVar.f41816H;
        this.f41818J = eVar.f41818J;
        this.f41819K = eVar.f41819K;
        return this;
    }

    /* renamed from: i */
    public void mo48943i(HashSet<String> hashSet) {
    }

    /* renamed from: v */
    public final void mo48969v(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = 0.0f;
        if (Float.isNaN(this.f41813E)) {
            f5 = 0.0f;
        } else {
            f5 = this.f41813E;
        }
        if (Float.isNaN(this.f41816H)) {
            f6 = 0.0f;
        } else {
            f6 = this.f41816H;
        }
        if (Float.isNaN(this.f41814F)) {
            f7 = 0.0f;
        } else {
            f7 = this.f41814F;
        }
        if (!Float.isNaN(this.f41815G)) {
            f10 = this.f41815G;
        }
        this.f41818J = (float) ((int) (f + (f5 * f8) + (f10 * f9)));
        this.f41819K = (float) ((int) (f2 + (f8 * f6) + (f9 * f7)));
    }

    /* renamed from: w */
    public final void mo48970w(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.f41813E;
        float f8 = this.f41814F;
        this.f41818J = f + (f5 * f7) + ((-f6) * f8);
        this.f41819K = f2 + (f6 * f7) + (f5 * f8);
    }

    /* renamed from: x */
    public void mo48971x(int i, int i2, float f, float f2, float f3, float f4) {
        int i3 = this.f41817I;
        if (i3 == 1) {
            mo48970w(f, f2, f3, f4);
        } else if (i3 != 2) {
            mo48969v(f, f2, f3, f4);
        } else {
            mo48972y(i, i2);
        }
    }

    /* renamed from: y */
    public final void mo48972y(int i, int i2) {
        float f = this.f41813E;
        float f2 = (float) 0;
        this.f41818J = (((float) (i - 0)) * f) + f2;
        this.f41819K = (((float) (i2 - 0)) * f) + f2;
    }

    /* renamed from: z */
    public float mo48973z() {
        return this.f41818J;
    }
}
