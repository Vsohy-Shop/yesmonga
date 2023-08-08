package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1875h;
import androidx.core.content.res.C17455f;
import java.lang.reflect.Field;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.core.graphics.j2 */
public final class C17604j2 {

    /* renamed from: a */
    public static final String f45969a = "WeightTypeface";

    /* renamed from: b */
    public static final String f45970b = "native_instance";

    /* renamed from: c */
    public static final Field f45971c;
    @C0323b0("sWeightCacheLock")

    /* renamed from: d */
    public static final C1875h<SparseArray<Typeface>> f45972d = new C1875h<>(3);

    /* renamed from: e */
    public static final Object f45973e = new Object();

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
        } catch (Exception unused) {
            field = null;
        }
        f45971c = field;
    }

    @C0363p0
    /* renamed from: a */
    public static Typeface m80670a(@C0359n0 C17589h2 h2Var, @C0359n0 Context context, @C0359n0 Typeface typeface, int i, boolean z) {
        if (!m80673d()) {
            return null;
        }
        boolean z2 = (i << 1) | z;
        synchronized (f45973e) {
            long c = m80672c(typeface);
            C1875h<SparseArray<Typeface>> hVar = f45972d;
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
            Typeface b = m80671b(h2Var, context, typeface, i, z);
            if (b == null) {
                b = m80674e(typeface, i, z);
            }
            k.put(z2 ? 1 : 0, b);
            return b;
        }
    }

    @C0363p0
    /* renamed from: b */
    public static Typeface m80671b(@C0359n0 C17589h2 h2Var, @C0359n0 Context context, @C0359n0 Typeface typeface, int i, boolean z) {
        C17455f.C17459d m = h2Var.mo52051m(typeface);
        if (m == null) {
            return null;
        }
        return h2Var.mo52048c(context, m, context.getResources(), i, z);
    }

    /* renamed from: c */
    public static long m80672c(@C0359n0 Typeface typeface) {
        try {
            return ((Number) f45971c.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static boolean m80673d() {
        return f45971c != null;
    }

    /* renamed from: e */
    public static Typeface m80674e(Typeface typeface, int i, boolean z) {
        int i2 = 1;
        boolean z2 = i >= 600;
        if (!z2 && !z) {
            i2 = 0;
        } else if (!z2) {
            i2 = 2;
        } else if (z) {
            i2 = 3;
        }
        return Typeface.create(typeface, i2);
    }
}
