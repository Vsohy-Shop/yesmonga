package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.C16655a;
import androidx.constraintlayout.core.motion.utils.C16703o;
import androidx.constraintlayout.core.motion.utils.C16717v;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.core.motion.key.b */
public abstract class C16664b implements C16717v {

    /* renamed from: m */
    public static int f41732m = -1;

    /* renamed from: n */
    public static final String f41733n = "alpha";

    /* renamed from: o */
    public static final String f41734o = "elevation";

    /* renamed from: p */
    public static final String f41735p = "rotationZ";

    /* renamed from: q */
    public static final String f41736q = "rotationX";

    /* renamed from: r */
    public static final String f41737r = "transitionPathRotate";

    /* renamed from: s */
    public static final String f41738s = "scaleX";

    /* renamed from: t */
    public static final String f41739t = "scaleY";

    /* renamed from: u */
    public static final String f41740u = "translationX";

    /* renamed from: v */
    public static final String f41741v = "translationY";

    /* renamed from: w */
    public static final String f41742w = "CUSTOM";

    /* renamed from: x */
    public static final String f41743x = "visibility";

    /* renamed from: h */
    public int f41744h;

    /* renamed from: i */
    public int f41745i;

    /* renamed from: j */
    public String f41746j = null;

    /* renamed from: k */
    public int f41747k;

    /* renamed from: l */
    public HashMap<String, C16655a> f41748l;

    public C16664b() {
        int i = f41732m;
        this.f41744h = i;
        this.f41745i = i;
    }

    /* renamed from: b */
    public boolean mo48820b(int i, int i2) {
        if (i != 100) {
            return false;
        }
        this.f41744h = i2;
        return true;
    }

    /* renamed from: c */
    public boolean mo48822c(int i, float f) {
        return false;
    }

    /* renamed from: d */
    public boolean mo48824d(int i, boolean z) {
        return false;
    }

    /* renamed from: e */
    public boolean mo48826e(int i, String str) {
        if (i != 101) {
            return false;
        }
        this.f41746j = str;
        return true;
    }

    /* renamed from: f */
    public abstract void mo48940f(HashMap<String, C16703o> hashMap);

    /* renamed from: g */
    public abstract C16664b clone();

    /* renamed from: h */
    public C16664b mo48942h(C16664b bVar) {
        this.f41744h = bVar.f41744h;
        this.f41745i = bVar.f41745i;
        this.f41746j = bVar.f41746j;
        this.f41747k = bVar.f41747k;
        return this;
    }

    /* renamed from: i */
    public abstract void mo48943i(HashSet<String> hashSet);

    /* renamed from: j */
    public int mo48944j() {
        return this.f41744h;
    }

    /* renamed from: k */
    public boolean mo48945k(String str) {
        String str2 = this.f41746j;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    /* renamed from: l */
    public void mo48946l(String str, int i, float f) {
        this.f41748l.put(str, new C16655a(str, i, f));
    }

    /* renamed from: m */
    public void mo48947m(String str, int i, int i2) {
        this.f41748l.put(str, new C16655a(str, i, i2));
    }

    /* renamed from: n */
    public void mo48948n(String str, int i, String str2) {
        this.f41748l.put(str, new C16655a(str, i, str2));
    }

    /* renamed from: o */
    public void mo48949o(String str, int i, boolean z) {
        this.f41748l.put(str, new C16655a(str, i, z));
    }

    /* renamed from: p */
    public void mo48950p(int i) {
        this.f41744h = i;
    }

    /* renamed from: q */
    public void mo48951q(HashMap<String, Integer> hashMap) {
    }

    /* renamed from: r */
    public C16664b mo48952r(int i) {
        this.f41745i = i;
        return this;
    }

    /* renamed from: s */
    public boolean mo48953s(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    /* renamed from: t */
    public float mo48954t(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    /* renamed from: u */
    public int mo48955u(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
