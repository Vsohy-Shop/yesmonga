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
@C0376v0(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.core.graphics.k2 */
public final class C17608k2 {

    /* renamed from: a */
    public static final String f45974a = "WeightTypeface";

    /* renamed from: b */
    public static final String f45975b = "native_instance";

    /* renamed from: c */
    public static final String f45976c = "nativeCreateFromTypeface";

    /* renamed from: d */
    public static final String f45977d = "nativeCreateWeightAlias";

    /* renamed from: e */
    public static final Field f45978e;

    /* renamed from: f */
    public static final Method f45979f;

    /* renamed from: g */
    public static final Method f45980g;

    /* renamed from: h */
    public static final Constructor<Typeface> f45981h;
    @C0323b0("sWeightCacheLock")

    /* renamed from: i */
    public static final C1875h<SparseArray<Typeface>> f45982i = new C1875h<>(3);

    /* renamed from: j */
    public static final Object f45983j = new Object();

    static {
        Method method;
        Method method2;
        Field field;
        Constructor<Typeface> constructor;
        Class<Typeface> cls = Typeface.class;
        try {
            field = cls.getDeclaredField("native_instance");
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            method2 = cls.getDeclaredMethod(f45976c, new Class[]{cls2, cls3});
            method2.setAccessible(true);
            method = cls.getDeclaredMethod(f45977d, new Class[]{cls2, cls3});
            method.setAccessible(true);
            constructor = cls.getDeclaredConstructor(new Class[]{cls2});
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            field = null;
            constructor = null;
            method2 = null;
            method = null;
        }
        f45978e = field;
        f45979f = method2;
        f45980g = method;
        f45981h = constructor;
    }

    @C0363p0
    /* renamed from: a */
    public static Typeface m80678a(long j) {
        try {
            return f45981h.newInstance(new Object[]{Long.valueOf(j)});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @C0363p0
    /* renamed from: b */
    public static Typeface m80679b(@C0359n0 Typeface typeface, int i, boolean z) {
        Typeface typeface2;
        if (!m80681d()) {
            return null;
        }
        boolean z2 = (i << 1) | z;
        synchronized (f45983j) {
            long c = m80680c(typeface);
            C1875h<SparseArray<Typeface>> hVar = f45982i;
            SparseArray k = hVar.mo6223k(c);
            if (k == null) {
                k = new SparseArray(4);
                hVar.mo6229t(c, k);
            } else {
                Typeface typeface3 = (Typeface) k.get(z2);
                if (typeface3 != null) {
                    return typeface3;
                }
            }
            if (z == typeface.isItalic()) {
                typeface2 = m80678a(m80683f(c, i));
            } else {
                typeface2 = m80678a(m80682e(c, i, z));
            }
            k.put(z2 ? 1 : 0, typeface2);
            return typeface2;
        }
    }

    /* renamed from: c */
    public static long m80680c(@C0359n0 Typeface typeface) {
        try {
            return f45978e.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static boolean m80681d() {
        return f45978e != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: e */
    public static long m80682e(long j, int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        try {
            return ((Long) f45980g.invoke((Object) null, new Object[]{Long.valueOf(((Long) f45979f.invoke((Object) null, new Object[]{Long.valueOf(j), Integer.valueOf(i2)})).longValue()), Integer.valueOf(i)})).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: f */
    public static long m80683f(long j, int i) {
        try {
            return ((Long) f45980g.invoke((Object) null, new Object[]{Long.valueOf(j), Integer.valueOf(i)})).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
