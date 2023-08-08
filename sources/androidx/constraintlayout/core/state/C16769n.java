package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.C16656b;
import androidx.constraintlayout.core.motion.C16660e;
import androidx.constraintlayout.core.motion.key.C16665c;
import androidx.constraintlayout.core.motion.key.C16666d;
import androidx.constraintlayout.core.motion.key.C16667e;
import androidx.constraintlayout.core.motion.utils.C16680d;
import androidx.constraintlayout.core.motion.utils.C16685g;
import androidx.constraintlayout.core.motion.utils.C16716u;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.constraintlayout.core.widgets.C16798d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.state.n */
public class C16769n implements C16717v {

    /* renamed from: A */
    public static final int f42564A = -1;

    /* renamed from: B */
    public static final int f42565B = -2;

    /* renamed from: q */
    public static final int f42566q = 0;

    /* renamed from: r */
    public static final int f42567r = 1;

    /* renamed from: s */
    public static final int f42568s = 2;

    /* renamed from: t */
    public static final int f42569t = 0;

    /* renamed from: u */
    public static final int f42570u = 1;

    /* renamed from: v */
    public static final int f42571v = 2;

    /* renamed from: w */
    public static final int f42572w = 3;

    /* renamed from: x */
    public static final int f42573x = 4;

    /* renamed from: y */
    public static final int f42574y = 5;

    /* renamed from: z */
    public static final int f42575z = 6;

    /* renamed from: h */
    public HashMap<Integer, HashMap<String, C16770a>> f42576h = new HashMap<>();

    /* renamed from: i */
    public HashMap<String, C16771b> f42577i = new HashMap<>();

    /* renamed from: j */
    public C16716u f42578j = new C16716u();

    /* renamed from: k */
    public int f42579k = 0;

    /* renamed from: l */
    public String f42580l = null;

    /* renamed from: m */
    public C16680d f42581m = null;

    /* renamed from: n */
    public int f42582n = 0;

    /* renamed from: o */
    public int f42583o = 400;

    /* renamed from: p */
    public float f42584p = 0.0f;

    /* renamed from: androidx.constraintlayout.core.state.n$a */
    public static class C16770a {

        /* renamed from: a */
        public int f42585a;

        /* renamed from: b */
        public String f42586b;

        /* renamed from: c */
        public int f42587c;

        /* renamed from: d */
        public float f42588d;

        /* renamed from: e */
        public float f42589e;

        public C16770a(String str, int i, int i2, float f, float f2) {
            this.f42586b = str;
            this.f42585a = i;
            this.f42587c = i2;
            this.f42588d = f;
            this.f42589e = f2;
        }
    }

    /* renamed from: androidx.constraintlayout.core.state.n$b */
    public static class C16771b {

        /* renamed from: a */
        public C16772o f42590a = new C16772o();

        /* renamed from: b */
        public C16772o f42591b = new C16772o();

        /* renamed from: c */
        public C16772o f42592c = new C16772o();

        /* renamed from: d */
        public C16656b f42593d;

        /* renamed from: e */
        public C16660e f42594e = new C16660e(this.f42590a);

        /* renamed from: f */
        public C16660e f42595f = new C16660e(this.f42591b);

        /* renamed from: g */
        public C16660e f42596g = new C16660e(this.f42592c);

        /* renamed from: h */
        public C16685g f42597h = new C16685g();

        /* renamed from: i */
        public int f42598i = -1;

        /* renamed from: j */
        public int f42599j = -1;

        public C16771b() {
            C16656b bVar = new C16656b(this.f42594e);
            this.f42593d = bVar;
            bVar.mo48817Z(this.f42594e);
            this.f42593d.mo48815X(this.f42595f);
        }

        /* renamed from: a */
        public C16772o mo49384a(int i) {
            if (i == 0) {
                return this.f42590a;
            }
            if (i == 1) {
                return this.f42591b;
            }
            return this.f42592c;
        }

        /* renamed from: b */
        public void mo49385b(int i, int i2, float f, C16769n nVar) {
            this.f42598i = i2;
            this.f42599j = i;
            this.f42593d.mo48825d0(i, i2, 1.0f, System.nanoTime());
            C16772o.m76717n(i, i2, this.f42592c, this.f42590a, this.f42591b, nVar, f);
            this.f42592c.f42618q = f;
            this.f42593d.mo48808Q(this.f42596g, f, System.nanoTime(), this.f42597h);
        }

        /* renamed from: c */
        public void mo49386c(C16716u uVar) {
            C16665c cVar = new C16665c();
            uVar.mo49112g(cVar);
            this.f42593d.mo48828f(cVar);
        }

        /* renamed from: d */
        public void mo49387d(C16716u uVar) {
            C16666d dVar = new C16666d();
            uVar.mo49112g(dVar);
            this.f42593d.mo48828f(dVar);
        }

        /* renamed from: e */
        public void mo49388e(C16716u uVar) {
            C16667e eVar = new C16667e();
            uVar.mo49112g(eVar);
            this.f42593d.mo48828f(eVar);
        }

        /* renamed from: f */
        public void mo49389f(ConstraintWidget constraintWidget, int i) {
            if (i == 0) {
                this.f42590a.mo49392C(constraintWidget);
                this.f42593d.mo48817Z(this.f42594e);
            } else if (i == 1) {
                this.f42591b.mo49392C(constraintWidget);
                this.f42593d.mo48815X(this.f42595f);
            }
            this.f42599j = -1;
        }
    }

    /* renamed from: E */
    public static C16746b m76656E(int i, String str) {
        switch (i) {
            case -1:
                return new C16750f(str);
            case 0:
                return new C16751g();
            case 1:
                return new C16752h();
            case 2:
                return new C16764i();
            case 3:
                return new C16765j();
            case 4:
                return new C16768m();
            case 5:
                return new C16767l();
            case 6:
                return new C16766k();
            default:
                return null;
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ float m76657Q(String str, float f) {
        return (float) C16680d.m76169c(str).mo48998a((double) f);
    }

    /* renamed from: R */
    public static /* synthetic */ float m76658R(float f) {
        return (float) C16680d.m76169c(C16680d.f41933k).mo48998a((double) f);
    }

    /* renamed from: S */
    public static /* synthetic */ float m76659S(float f) {
        return (float) C16680d.m76169c(C16680d.f41932j).mo48998a((double) f);
    }

    /* renamed from: T */
    public static /* synthetic */ float m76660T(float f) {
        return (float) C16680d.m76169c(C16680d.f41931i).mo48998a((double) f);
    }

    /* renamed from: U */
    public static /* synthetic */ float m76661U(float f) {
        return (float) C16680d.m76169c(C16680d.f41934l).mo48998a((double) f);
    }

    /* renamed from: V */
    public static /* synthetic */ float m76662V(float f) {
        return (float) C16680d.m76169c(C16680d.f41935m).mo48998a((double) f);
    }

    /* renamed from: W */
    public static /* synthetic */ float m76663W(float f) {
        return (float) C16680d.m76169c(C16680d.f41936n).mo48998a((double) f);
    }

    /* renamed from: X */
    public static /* synthetic */ float m76664X(float f) {
        return (float) C16680d.m76169c("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").mo48998a((double) f);
    }

    /* renamed from: A */
    public C16772o mo49354A(String str) {
        C16771b bVar = this.f42577i.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f42591b;
    }

    /* renamed from: B */
    public C16772o mo49355B(ConstraintWidget constraintWidget) {
        return mo49365M(constraintWidget.f42750o, (ConstraintWidget) null, 2).f42592c;
    }

    /* renamed from: C */
    public C16772o mo49356C(String str) {
        C16771b bVar = this.f42577i.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f42592c;
    }

    /* renamed from: D */
    public C16746b mo49357D() {
        return m76656E(this.f42579k, this.f42580l);
    }

    /* renamed from: F */
    public int mo49358F(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.f42577i.get(str).f42593d.mo48832j(fArr, iArr, iArr2);
    }

    /* renamed from: G */
    public C16656b mo49359G(String str) {
        return mo49365M(str, (ConstraintWidget) null, 0).f42593d;
    }

    /* renamed from: H */
    public int mo49360H(C16772o oVar) {
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap hashMap = this.f42576h.get(Integer.valueOf(i2));
            if (!(hashMap == null || ((C16770a) hashMap.get(oVar.f42602a.f42750o)) == null)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: I */
    public float[] mo49361I(String str) {
        float[] fArr = new float[124];
        this.f42577i.get(str).f42593d.mo48833k(fArr, 62);
        return fArr;
    }

    /* renamed from: J */
    public C16772o mo49362J(ConstraintWidget constraintWidget) {
        return mo49365M(constraintWidget.f42750o, (ConstraintWidget) null, 0).f42590a;
    }

    /* renamed from: K */
    public C16772o mo49363K(String str) {
        C16771b bVar = this.f42577i.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f42590a;
    }

    /* renamed from: L */
    public final C16771b mo49364L(String str) {
        return this.f42577i.get(str);
    }

    /* renamed from: M */
    public final C16771b mo49365M(String str, ConstraintWidget constraintWidget, int i) {
        C16771b bVar = this.f42577i.get(str);
        if (bVar == null) {
            bVar = new C16771b();
            this.f42578j.mo49112g(bVar.f42593d);
            this.f42577i.put(str, bVar);
            if (constraintWidget != null) {
                bVar.mo49389f(constraintWidget, i);
            }
        }
        return bVar;
    }

    /* renamed from: N */
    public boolean mo49366N() {
        return this.f42576h.size() > 0;
    }

    /* renamed from: O */
    public void mo49367O(int i, int i2, float f) {
        C16680d dVar = this.f42581m;
        if (dVar != null) {
            f = (float) dVar.mo48998a((double) f);
        }
        for (String str : this.f42577i.keySet()) {
            this.f42577i.get(str).mo49385b(i, i2, f, this);
        }
    }

    /* renamed from: P */
    public boolean mo49368P() {
        return this.f42577i.isEmpty();
    }

    /* renamed from: Y */
    public void mo49369Y(C16716u uVar) {
        uVar.mo49111f(this.f42578j);
        uVar.mo49112g(this);
    }

    /* renamed from: Z */
    public void mo49370Z(C16798d dVar, int i) {
        ArrayList<ConstraintWidget> l2 = dVar.mo49843l2();
        int size = l2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = l2.get(i2);
            mo49365M(constraintWidget.f42750o, (ConstraintWidget) null, i).mo49389f(constraintWidget, i);
        }
    }

    /* renamed from: a */
    public int mo48818a(String str) {
        return 0;
    }

    /* renamed from: b */
    public boolean mo48820b(int i, int i2) {
        return false;
    }

    /* renamed from: c */
    public boolean mo48822c(int i, float f) {
        if (i != 706) {
            return false;
        }
        this.f42584p = f;
        return false;
    }

    /* renamed from: d */
    public boolean mo48824d(int i, boolean z) {
        return false;
    }

    /* renamed from: e */
    public boolean mo48826e(int i, String str) {
        if (i != 705) {
            return false;
        }
        this.f42580l = str;
        this.f42581m = C16680d.m76169c(str);
        return false;
    }

    /* renamed from: n */
    public void mo49371n(int i, String str, String str2, int i2) {
        mo49365M(str, (ConstraintWidget) null, i).mo49384a(i).mo49395c(str2, i2);
    }

    /* renamed from: o */
    public void mo49372o(int i, String str, String str2, float f) {
        mo49365M(str, (ConstraintWidget) null, i).mo49384a(i).mo49396d(str2, f);
    }

    /* renamed from: p */
    public void mo49373p(String str, C16716u uVar) {
        mo49365M(str, (ConstraintWidget) null, 0).mo49386c(uVar);
    }

    /* renamed from: q */
    public void mo49374q(String str, C16716u uVar) {
        mo49365M(str, (ConstraintWidget) null, 0).mo49387d(uVar);
    }

    /* renamed from: r */
    public void mo49375r(String str, int i, int i2, float f, float f2) {
        C16716u uVar = new C16716u();
        uVar.mo49107b(C16717v.C16724g.f42314r, 2);
        uVar.mo49107b(100, i);
        uVar.mo49106a(C16717v.C16724g.f42310n, f);
        uVar.mo49106a(C16717v.C16724g.f42311o, f2);
        mo49365M(str, (ConstraintWidget) null, 0).mo49388e(uVar);
        C16770a aVar = new C16770a(str, i, i2, f, f2);
        HashMap hashMap = this.f42576h.get(Integer.valueOf(i));
        if (hashMap == null) {
            hashMap = new HashMap();
            this.f42576h.put(Integer.valueOf(i), hashMap);
        }
        hashMap.put(str, aVar);
    }

    /* renamed from: s */
    public void mo49376s(String str, C16716u uVar) {
        mo49365M(str, (ConstraintWidget) null, 0).mo49388e(uVar);
    }

    /* renamed from: t */
    public void mo49377t() {
        this.f42577i.clear();
    }

    /* renamed from: u */
    public boolean mo49378u(String str) {
        return this.f42577i.containsKey(str);
    }

    /* renamed from: v */
    public void mo49379v(C16772o oVar, float[] fArr, float[] fArr2, float[] fArr3) {
        C16770a aVar;
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap hashMap = this.f42576h.get(Integer.valueOf(i2));
            if (!(hashMap == null || (aVar = (C16770a) hashMap.get(oVar.f42602a.f42750o)) == null)) {
                fArr[i] = aVar.f42588d;
                fArr2[i] = aVar.f42589e;
                fArr3[i] = (float) aVar.f42585a;
                i++;
            }
        }
    }

    /* renamed from: w */
    public C16770a mo49380w(String str, int i) {
        C16770a aVar;
        while (i <= 100) {
            HashMap hashMap = this.f42576h.get(Integer.valueOf(i));
            if (hashMap != null && (aVar = (C16770a) hashMap.get(str)) != null) {
                return aVar;
            }
            i++;
        }
        return null;
    }

    /* renamed from: x */
    public C16770a mo49381x(String str, int i) {
        C16770a aVar;
        while (i >= 0) {
            HashMap hashMap = this.f42576h.get(Integer.valueOf(i));
            if (hashMap != null && (aVar = (C16770a) hashMap.get(str)) != null) {
                return aVar;
            }
            i--;
        }
        return null;
    }

    /* renamed from: y */
    public int mo49382y() {
        return this.f42582n;
    }

    /* renamed from: z */
    public C16772o mo49383z(ConstraintWidget constraintWidget) {
        return mo49365M(constraintWidget.f42750o, (ConstraintWidget) null, 1).f42591b;
    }
}
