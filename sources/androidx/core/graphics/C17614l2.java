package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1875h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressLint({"SoonBlockedPrivateApi"})
@C0376v0(26)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.core.graphics.l2 */
public final class C17614l2 {

    /* renamed from: a */
    public static final String f45986a = "WeightTypeface";

    /* renamed from: b */
    public static final String f45987b = "native_instance";

    /* renamed from: c */
    public static final String f45988c = "nativeCreateFromTypefaceWithExactStyle";

    /* renamed from: d */
    public static final Field f45989d;

    /* renamed from: e */
    public static final Method f45990e;

    /* renamed from: f */
    public static final Constructor<Typeface> f45991f;
    @C0323b0("sWeightCacheLock")

    /* renamed from: g */
    public static final C1875h<SparseArray<Typeface>> f45992g = new C1875h<>(3);

    /* renamed from: h */
    public static final Object f45993h = new Object();

    static {
        Method method;
        Field field;
        Constructor<Typeface> constructor;
        Class<Typeface> cls = Typeface.class;
        try {
            field = cls.getDeclaredField("native_instance");
            Class cls2 = Long.TYPE;
            method = cls.getDeclaredMethod(f45988c, new Class[]{cls2, Integer.TYPE, Boolean.TYPE});
            method.setAccessible(true);
            constructor = cls.getDeclaredConstructor(new Class[]{cls2});
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            field = null;
            constructor = null;
            method = null;
        }
        f45989d = field;
        f45990e = method;
        f45991f = constructor;
    }

    @C0363p0
    /* renamed from: a */
    public static Typeface m80688a(long j) {
        try {
            return f45991f.newInstance(new Object[]{Long.valueOf(j)});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @C0363p0
    /* renamed from: b */
    public static Typeface m80689b(@C0359n0 Typeface typeface, int i, boolean z) {
        if (!m80691d()) {
            return null;
        }
        boolean z2 = (i << 1) | z;
        synchronized (f45993h) {
            long c = m80690c(typeface);
            C1875h<SparseArray<Typeface>> hVar = f45992g;
            SparseArray k = hVar.mo6223k(c);
            if (k == null) {
                k = new SparseArray(4);
                hVar.mo6229t(c, k);
            } else {
                Typeface typeface2 = (Typeface) k.get(z2);
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            Typeface a = m80688a(m80692e(c, i, z));
            k.put(z2 ? 1 : 0, a);
            return a;
        }
    }

    /* renamed from: c */
    public static long m80690c(@C0359n0 Typeface typeface) {
        try {
            return f45989d.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static boolean m80691d() {
        return f45989d != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: e */
    public static long m80692e(long j, int i, boolean z) {
        try {
            return ((Long) f45990e.invoke((Object) null, new Object[]{Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z)})).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
