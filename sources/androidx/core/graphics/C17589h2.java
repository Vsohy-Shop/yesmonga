package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17455f;
import androidx.core.provider.C17866h;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.graphics.h2 */
public class C17589h2 {

    /* renamed from: b */
    public static final String f45957b = "TypefaceCompatBaseImpl";

    /* renamed from: c */
    public static final int f45958c = 0;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    public ConcurrentHashMap<Long, C17455f.C17459d> f45959a = new ConcurrentHashMap<>();

    /* renamed from: androidx.core.graphics.h2$a */
    public class C17590a implements C17593d<C17866h.C17869c> {
        public C17590a() {
        }

        /* renamed from: c */
        public int mo52053b(C17866h.C17869c cVar) {
            return cVar.mo52286e();
        }

        /* renamed from: d */
        public boolean mo52052a(C17866h.C17869c cVar) {
            return cVar.mo52287f();
        }
    }

    /* renamed from: androidx.core.graphics.h2$b */
    public class C17591b implements C17593d<C17455f.C17460e> {
        public C17591b() {
        }

        /* renamed from: c */
        public int mo52053b(C17455f.C17460e eVar) {
            return eVar.mo51892e();
        }

        /* renamed from: d */
        public boolean mo52052a(C17455f.C17460e eVar) {
            return eVar.mo51893f();
        }
    }

    /* renamed from: androidx.core.graphics.h2$c */
    public class C17592c implements C17593d<C17455f.C17460e> {
        public C17592c() {
        }

        /* renamed from: c */
        public int mo52053b(C17455f.C17460e eVar) {
            return eVar.mo51892e();
        }

        /* renamed from: d */
        public boolean mo52052a(C17455f.C17460e eVar) {
            return eVar.mo51893f();
        }
    }

    /* renamed from: androidx.core.graphics.h2$d */
    public interface C17593d<T> {
        /* renamed from: a */
        boolean mo52052a(T t);

        /* renamed from: b */
        int mo52053b(T t);
    }

    /* renamed from: j */
    public static <T> T m80609j(T[] tArr, int i, C17593d<T> dVar) {
        return m80610k(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, dVar);
    }

    /* renamed from: k */
    public static <T> T m80610k(T[] tArr, int i, boolean z, C17593d<T> dVar) {
        int i2;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(dVar.mo52053b(t2) - i) * 2;
            if (dVar.mo52052a(t2) == z) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int i4 = abs + i2;
            if (t == null || i3 > i4) {
                t = t2;
                i3 = i4;
            }
        }
        return t;
    }

    /* renamed from: n */
    public static long m80611n(@C0363p0 Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo52047a(Typeface typeface, C17455f.C17459d dVar) {
        long n = m80611n(typeface);
        if (n != 0) {
            this.f45959a.put(Long.valueOf(n), dVar);
        }
    }

    @C0363p0
    /* renamed from: b */
    public Typeface mo51926b(Context context, C17455f.C17459d dVar, Resources resources, int i) {
        C17455f.C17460e h = mo52049h(dVar, i);
        if (h == null) {
            return null;
        }
        Typeface h2 = C17530b1.m80356h(context, resources, h.mo51889b(), h.mo51888a(), 0, i);
        mo52047a(h2, dVar);
        return h2;
    }

    @C0363p0
    /* renamed from: c */
    public Typeface mo52048c(Context context, C17455f.C17459d dVar, Resources resources, int i, boolean z) {
        C17455f.C17460e i2 = mo52050i(dVar, i, z);
        if (i2 == null) {
            return null;
        }
        Typeface h = C17530b1.m80356h(context, resources, i2.mo51889b(), i2.mo51888a(), 0, 0);
        mo52047a(h, dVar);
        return h;
    }

    @C0363p0
    /* renamed from: d */
    public Typeface mo51927d(Context context, @C0363p0 CancellationSignal cancellationSignal, @C0359n0 C17866h.C17869c[] cVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo52032l(cVarArr, i).mo52285d());
            try {
                Typeface e = mo52030e(context, inputStream);
                C17599i2.m80643a(inputStream);
                return e;
            } catch (IOException unused) {
                C17599i2.m80643a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C17599i2.m80643a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C17599i2.m80643a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C17599i2.m80643a(inputStream2);
            throw th;
        }
    }

    /* renamed from: e */
    public Typeface mo52030e(Context context, InputStream inputStream) {
        File e = C17599i2.m80647e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C17599i2.m80646d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    @C0363p0
    /* renamed from: f */
    public Typeface mo52031f(Context context, Resources resources, int i, String str, int i2) {
        File e = C17599i2.m80647e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C17599i2.m80645c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    @C0359n0
    /* renamed from: g */
    public Typeface mo51928g(@C0359n0 Context context, @C0359n0 Typeface typeface, int i, boolean z) {
        Typeface typeface2;
        try {
            typeface2 = C17604j2.m80670a(this, context, typeface, i, z);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? typeface : typeface2;
    }

    /* renamed from: h */
    public final C17455f.C17460e mo52049h(C17455f.C17459d dVar, int i) {
        return (C17455f.C17460e) m80609j(dVar.mo51887a(), i, new C17591b());
    }

    /* renamed from: i */
    public final C17455f.C17460e mo52050i(C17455f.C17459d dVar, int i, boolean z) {
        return (C17455f.C17460e) m80610k(dVar.mo51887a(), i, z, new C17592c());
    }

    /* renamed from: l */
    public C17866h.C17869c mo52032l(C17866h.C17869c[] cVarArr, int i) {
        return (C17866h.C17869c) m80609j(cVarArr, i, new C17590a());
    }

    @C0363p0
    /* renamed from: m */
    public C17455f.C17459d mo52051m(Typeface typeface) {
        long n = m80611n(typeface);
        if (n == 0) {
            return null;
        }
        return this.f45959a.get(Long.valueOf(n));
    }
}
