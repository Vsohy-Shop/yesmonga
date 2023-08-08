package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.C0337f0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1879j;
import androidx.core.content.res.C17455f;
import androidx.core.content.res.C17465i;
import androidx.core.provider.C17866h;
import androidx.core.util.C18001r;

/* renamed from: androidx.core.graphics.b1 */
public class C17530b1 {

    /* renamed from: a */
    public static final C17589h2 f45848a;

    /* renamed from: b */
    public static final C1879j<String, Typeface> f45849b = new C1879j<>(16);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.core.graphics.b1$a */
    public static class C17531a extends C17866h.C17870d {
        @C0363p0

        /* renamed from: j */
        public C17465i.C17472g f45850j;

        public C17531a(@C0363p0 C17465i.C17472g gVar) {
            this.f45850j = gVar;
        }

        /* renamed from: a */
        public void mo51924a(int i) {
            C17465i.C17472g gVar = this.f45850j;
            if (gVar != null) {
                gVar.m80195f(i);
            }
        }

        /* renamed from: b */
        public void mo51925b(@C0359n0 Typeface typeface) {
            C17465i.C17472g gVar = this.f45850j;
            if (gVar != null) {
                gVar.m80196g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f45848a = new C17583g2();
        } else if (i >= 28) {
            f45848a = new C17598i1();
        } else if (i >= 26) {
            f45848a = new C17588h1();
        } else if (C17539d1.m80380q()) {
            f45848a = new C17539d1();
        } else {
            f45848a = new C17535c1();
        }
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static void m80349a() {
        f45849b.mo6244d();
    }

    @C0359n0
    /* renamed from: b */
    public static Typeface m80350b(@C0359n0 Context context, @C0363p0 Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @C0359n0
    /* renamed from: c */
    public static Typeface m80351c(@C0359n0 Context context, @C0363p0 Typeface typeface, @C0337f0(from = 1, mo995to = 1000) int i, boolean z) {
        if (context != null) {
            C18001r.m81770g(i, 1, 1000, "weight");
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return f45848a.mo51928g(context, typeface, i, z);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: d */
    public static Typeface m80352d(@C0359n0 Context context, @C0363p0 CancellationSignal cancellationSignal, @C0359n0 C17866h.C17869c[] cVarArr, int i) {
        return f45848a.mo51927d(context, cancellationSignal, cVarArr, i);
    }

    @C0363p0
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: e */
    public static Typeface m80353e(@C0359n0 Context context, @C0359n0 C17455f.C17457b bVar, @C0359n0 Resources resources, int i, int i2, @C0363p0 C17465i.C17472g gVar, @C0363p0 Handler handler, boolean z) {
        return m80354f(context, bVar, resources, i, (String) null, 0, i2, gVar, handler, z);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: f */
    public static Typeface m80354f(@C0359n0 Context context, @C0359n0 C17455f.C17457b bVar, @C0359n0 Resources resources, int i, @C0363p0 String str, int i2, int i3, @C0363p0 C17465i.C17472g gVar, @C0363p0 Handler handler, boolean z) {
        Typeface typeface;
        boolean z2;
        int i4;
        C17455f.C17457b bVar2 = bVar;
        C17465i.C17472g gVar2 = gVar;
        Handler handler2 = handler;
        if (bVar2 instanceof C17455f.C17461f) {
            C17455f.C17461f fVar = (C17455f.C17461f) bVar2;
            Typeface m = m80361m(fVar.mo51896c());
            if (m != null) {
                if (gVar2 != null) {
                    gVar2.mo51901d(m, handler2);
                }
                return m;
            }
            if (!z ? gVar2 != null : fVar.mo51894a() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                i4 = fVar.mo51897d();
            } else {
                i4 = -1;
            }
            Context context2 = context;
            typeface = C17866h.m81376f(context2, fVar.mo51895b(), i3, z2, i4, C17465i.C17472g.m80194e(handler), new C17531a(gVar2));
            Resources resources2 = resources;
            int i5 = i3;
        } else {
            Context context3 = context;
            Resources resources3 = resources;
            typeface = f45848a.mo51926b(context, (C17455f.C17459d) bVar2, resources, i3);
            if (gVar2 != null) {
                if (typeface != null) {
                    gVar2.mo51901d(typeface, handler2);
                } else {
                    gVar2.mo51900c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f45849b.mo6250j(m80357i(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    @C0363p0
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: g */
    public static Typeface m80355g(@C0359n0 Context context, @C0359n0 Resources resources, int i, String str, int i2) {
        return m80356h(context, resources, i, str, 0, i2);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: h */
    public static Typeface m80356h(@C0359n0 Context context, @C0359n0 Resources resources, int i, String str, int i2, int i3) {
        Typeface f = f45848a.mo52031f(context, resources, i, str, i3);
        if (f != null) {
            f45849b.mo6250j(m80357i(resources, i, str, i2, i3), f);
        }
        return f;
    }

    /* renamed from: i */
    public static String m80357i(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    @C0363p0
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public static Typeface m80358j(@C0359n0 Resources resources, int i, int i2) {
        return m80359k(resources, i, (String) null, 0, i2);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: k */
    public static Typeface m80359k(@C0359n0 Resources resources, int i, @C0363p0 String str, int i2, int i3) {
        return f45849b.mo6246f(m80357i(resources, i, str, i2, i3));
    }

    @C0363p0
    /* renamed from: l */
    public static Typeface m80360l(Context context, Typeface typeface, int i) {
        C17589h2 h2Var = f45848a;
        C17455f.C17459d m = h2Var.mo52051m(typeface);
        if (m == null) {
            return null;
        }
        return h2Var.mo51926b(context, m, context.getResources(), i);
    }

    /* renamed from: m */
    public static Typeface m80361m(@C0363p0 String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
