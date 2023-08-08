package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.constraintlayout.core.state.C16772o;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Set;

/* renamed from: androidx.constraintlayout.core.motion.e */
public class C16660e implements C16717v {

    /* renamed from: A */
    public static final int f41673A = 0;

    /* renamed from: B */
    public static final int f41674B = 0;

    /* renamed from: C */
    public static final int f41675C = -1;

    /* renamed from: D */
    public static final int f41676D = -1;

    /* renamed from: E */
    public static final int f41677E = -2;

    /* renamed from: F */
    public static final int f41678F = Integer.MIN_VALUE;

    /* renamed from: G */
    public static final int f41679G = 1;

    /* renamed from: m */
    public static final int f41680m = 0;

    /* renamed from: n */
    public static final int f41681n = 1;

    /* renamed from: o */
    public static final int f41682o = -1;

    /* renamed from: p */
    public static final int f41683p = -2;

    /* renamed from: q */
    public static final int f41684q = 0;

    /* renamed from: r */
    public static final int f41685r = 4;

    /* renamed from: s */
    public static final int f41686s = -3;

    /* renamed from: t */
    public static final int f41687t = -4;

    /* renamed from: u */
    public static final int f41688u = 0;

    /* renamed from: v */
    public static final int f41689v = 1;

    /* renamed from: w */
    public static final int f41690w = 2;

    /* renamed from: x */
    public static final int f41691x = 3;

    /* renamed from: y */
    public static final int f41692y = 4;

    /* renamed from: z */
    public static final int f41693z = -1;

    /* renamed from: h */
    public C16772o f41694h = new C16772o();

    /* renamed from: i */
    public C16661a f41695i = new C16661a();

    /* renamed from: j */
    public C16662b f41696j = new C16662b();

    /* renamed from: k */
    public float f41697k;

    /* renamed from: l */
    public float f41698l;

    /* renamed from: androidx.constraintlayout.core.motion.e$a */
    public static class C16661a {

        /* renamed from: n */
        public static final int f41699n = -2;

        /* renamed from: o */
        public static final int f41700o = -1;

        /* renamed from: p */
        public static final int f41701p = -3;

        /* renamed from: a */
        public int f41702a = -1;

        /* renamed from: b */
        public int f41703b = 0;

        /* renamed from: c */
        public String f41704c = null;

        /* renamed from: d */
        public int f41705d = -1;

        /* renamed from: e */
        public int f41706e = 0;

        /* renamed from: f */
        public float f41707f = Float.NaN;

        /* renamed from: g */
        public int f41708g = -1;

        /* renamed from: h */
        public float f41709h = Float.NaN;

        /* renamed from: i */
        public float f41710i = Float.NaN;

        /* renamed from: j */
        public int f41711j = -1;

        /* renamed from: k */
        public String f41712k = null;

        /* renamed from: l */
        public int f41713l = -3;

        /* renamed from: m */
        public int f41714m = -1;
    }

    /* renamed from: androidx.constraintlayout.core.motion.e$b */
    public static class C16662b {

        /* renamed from: a */
        public int f41715a = 4;

        /* renamed from: b */
        public int f41716b = 0;

        /* renamed from: c */
        public float f41717c = 1.0f;

        /* renamed from: d */
        public float f41718d = Float.NaN;
    }

    public C16660e() {
    }

    /* renamed from: A */
    public float mo48889A(int i) {
        switch (i) {
            case 303:
                return this.f41694h.f42617p;
            case 304:
                return this.f41694h.f42612k;
            case 305:
                return this.f41694h.f42613l;
            case 306:
                return this.f41694h.f42614m;
            case 308:
                return this.f41694h.f42609h;
            case 309:
                return this.f41694h.f42610i;
            case 310:
                return this.f41694h.f42611j;
            case 311:
                return this.f41694h.f42615n;
            case 312:
                return this.f41694h.f42616o;
            case 313:
                return this.f41694h.f42607f;
            case 314:
                return this.f41694h.f42608g;
            case 315:
                return this.f41697k;
            case C16717v.C16718a.f42168q /*316*/:
                return this.f41698l;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: B */
    public int mo48890B() {
        return this.f41696j.f41715a;
    }

    /* renamed from: C */
    public C16772o mo48891C() {
        return this.f41694h;
    }

    /* renamed from: D */
    public int mo48892D() {
        C16772o oVar = this.f41694h;
        return oVar.f42605d - oVar.f42603b;
    }

    /* renamed from: E */
    public int mo48893E() {
        return this.f41694h.f42603b;
    }

    /* renamed from: F */
    public int mo48894F() {
        return this.f41694h.f42604c;
    }

    /* renamed from: G */
    public void mo48895G(int i, int i2, int i3, int i4) {
        mo48896H(i, i2, i3, i4);
    }

    /* renamed from: H */
    public void mo48896H(int i, int i2, int i3, int i4) {
        if (this.f41694h == null) {
            this.f41694h = new C16772o((ConstraintWidget) null);
        }
        C16772o oVar = this.f41694h;
        oVar.f42604c = i2;
        oVar.f42603b = i;
        oVar.f42605d = i3;
        oVar.f42606e = i4;
    }

    /* renamed from: I */
    public void mo48897I(String str, int i, float f) {
        this.f41694h.mo49412v(str, i, f);
    }

    /* renamed from: J */
    public void mo48898J(String str, int i, int i2) {
        this.f41694h.mo49413w(str, i, i2);
    }

    /* renamed from: K */
    public void mo48899K(String str, int i, String str2) {
        this.f41694h.mo49414x(str, i, str2);
    }

    /* renamed from: L */
    public void mo48900L(String str, int i, boolean z) {
        this.f41694h.mo49415y(str, i, z);
    }

    /* renamed from: M */
    public void mo48901M(CustomAttribute customAttribute, float[] fArr) {
        this.f41694h.mo49412v(customAttribute.f41516b, 901, fArr[0]);
    }

    /* renamed from: N */
    public void mo48902N(float f) {
        this.f41694h.f42607f = f;
    }

    /* renamed from: O */
    public void mo48903O(float f) {
        this.f41694h.f42608g = f;
    }

    /* renamed from: P */
    public void mo48904P(float f) {
        this.f41694h.f42609h = f;
    }

    /* renamed from: Q */
    public void mo48905Q(float f) {
        this.f41694h.f42610i = f;
    }

    /* renamed from: R */
    public void mo48906R(float f) {
        this.f41694h.f42611j = f;
    }

    /* renamed from: S */
    public void mo48907S(float f) {
        this.f41694h.f42615n = f;
    }

    /* renamed from: T */
    public void mo48908T(float f) {
        this.f41694h.f42616o = f;
    }

    /* renamed from: U */
    public void mo48909U(float f) {
        this.f41694h.f42612k = f;
    }

    /* renamed from: V */
    public void mo48910V(float f) {
        this.f41694h.f42613l = f;
    }

    /* renamed from: W */
    public void mo48911W(float f) {
        this.f41694h.f42614m = f;
    }

    /* renamed from: X */
    public boolean mo48912X(int i, float f) {
        switch (i) {
            case 303:
                this.f41694h.f42617p = f;
                return true;
            case 304:
                this.f41694h.f42612k = f;
                return true;
            case 305:
                this.f41694h.f42613l = f;
                return true;
            case 306:
                this.f41694h.f42614m = f;
                return true;
            case 308:
                this.f41694h.f42609h = f;
                return true;
            case 309:
                this.f41694h.f42610i = f;
                return true;
            case 310:
                this.f41694h.f42611j = f;
                return true;
            case 311:
                this.f41694h.f42615n = f;
                return true;
            case 312:
                this.f41694h.f42616o = f;
                return true;
            case 313:
                this.f41694h.f42607f = f;
                return true;
            case 314:
                this.f41694h.f42608g = f;
                return true;
            case 315:
                this.f41697k = f;
                return true;
            case C16717v.C16718a.f42168q /*316*/:
                this.f41698l = f;
                return true;
            default:
                return false;
        }
    }

    /* renamed from: Y */
    public boolean mo48913Y(int i, float f) {
        switch (i) {
            case 600:
                this.f41695i.f41707f = f;
                return true;
            case 601:
                this.f41695i.f41709h = f;
                return true;
            case 602:
                this.f41695i.f41710i = f;
                return true;
            default:
                return false;
        }
    }

    /* renamed from: Z */
    public boolean mo48914Z(int i, int i2) {
        switch (i) {
            case C16717v.C16722e.f42268u /*605*/:
                this.f41695i.f41702a = i2;
                return true;
            case C16717v.C16722e.f42269v /*606*/:
                this.f41695i.f41703b = i2;
                return true;
            case C16717v.C16722e.f42270w /*607*/:
                this.f41695i.f41705d = i2;
                return true;
            case 608:
                this.f41695i.f41706e = i2;
                return true;
            case C16717v.C16722e.f42272y /*609*/:
                this.f41695i.f41708g = i2;
                return true;
            case C16717v.C16722e.f42273z /*610*/:
                this.f41695i.f41711j = i2;
                return true;
            case C16717v.C16722e.f42246A /*611*/:
                this.f41695i.f41713l = i2;
                return true;
            case C16717v.C16722e.f42247B /*612*/:
                this.f41695i.f41714m = i2;
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public int mo48818a(String str) {
        int a = C16717v.C16718a.m76346a(str);
        if (a != -1) {
            return a;
        }
        return C16717v.C16722e.m76350a(str);
    }

    /* renamed from: a0 */
    public boolean mo48915a0(int i, String str) {
        if (i == 603) {
            this.f41695i.f41704c = str;
            return true;
        } else if (i != 604) {
            return false;
        } else {
            this.f41695i.f41712k = str;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo48820b(int i, int i2) {
        return mo48912X(i, (float) i2);
    }

    /* renamed from: b0 */
    public void mo48916b0(int i) {
        this.f41696j.f41715a = i;
    }

    /* renamed from: c */
    public boolean mo48822c(int i, float f) {
        if (mo48912X(i, f)) {
            return true;
        }
        return mo48913Y(i, f);
    }

    /* renamed from: d */
    public boolean mo48824d(int i, boolean z) {
        return false;
    }

    /* renamed from: e */
    public boolean mo48826e(int i, String str) {
        return mo48915a0(i, str);
    }

    /* renamed from: f */
    public C16660e mo48917f(int i) {
        return null;
    }

    /* renamed from: g */
    public float mo48918g() {
        return this.f41696j.f41717c;
    }

    /* renamed from: h */
    public int mo48919h() {
        return this.f41694h.f42606e;
    }

    /* renamed from: i */
    public C16655a mo48920i(String str) {
        return this.f41694h.mo49399g(str);
    }

    /* renamed from: j */
    public Set<String> mo48921j() {
        return this.f41694h.mo49400h();
    }

    /* renamed from: k */
    public int mo48922k() {
        C16772o oVar = this.f41694h;
        return oVar.f42606e - oVar.f42604c;
    }

    /* renamed from: l */
    public int mo48923l() {
        return this.f41694h.f42603b;
    }

    /* renamed from: m */
    public String mo48924m() {
        return this.f41694h.mo49403k();
    }

    /* renamed from: n */
    public C16660e mo48925n() {
        return null;
    }

    /* renamed from: o */
    public float mo48926o() {
        return this.f41694h.f42607f;
    }

    /* renamed from: p */
    public float mo48927p() {
        return this.f41694h.f42608g;
    }

    /* renamed from: q */
    public int mo48928q() {
        return this.f41694h.f42605d;
    }

    /* renamed from: r */
    public float mo48929r() {
        return this.f41694h.f42609h;
    }

    /* renamed from: s */
    public float mo48930s() {
        return this.f41694h.f42610i;
    }

    /* renamed from: t */
    public float mo48931t() {
        return this.f41694h.f42611j;
    }

    public String toString() {
        return this.f41694h.f42603b + ", " + this.f41694h.f42604c + ", " + this.f41694h.f42605d + ", " + this.f41694h.f42606e;
    }

    /* renamed from: u */
    public float mo48933u() {
        return this.f41694h.f42615n;
    }

    /* renamed from: v */
    public float mo48934v() {
        return this.f41694h.f42616o;
    }

    /* renamed from: w */
    public int mo48935w() {
        return this.f41694h.f42604c;
    }

    /* renamed from: x */
    public float mo48936x() {
        return this.f41694h.f42612k;
    }

    /* renamed from: y */
    public float mo48937y() {
        return this.f41694h.f42613l;
    }

    /* renamed from: z */
    public float mo48938z() {
        return this.f41694h.f42614m;
    }

    public C16660e(C16772o oVar) {
        this.f41694h = oVar;
    }
}
