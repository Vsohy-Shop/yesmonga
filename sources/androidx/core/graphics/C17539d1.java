package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1886l;
import androidx.core.content.res.C17455f;
import androidx.core.provider.C17866h;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

@C0376v0(24)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.graphics.d1 */
public class C17539d1 extends C17589h2 {

    /* renamed from: d */
    public static final String f45860d = "TypefaceCompatApi24Impl";

    /* renamed from: e */
    public static final String f45861e = "android.graphics.FontFamily";

    /* renamed from: f */
    public static final String f45862f = "addFontWeightStyle";

    /* renamed from: g */
    public static final String f45863g = "createFromFamiliesWithDefault";

    /* renamed from: h */
    public static final Class<?> f45864h;

    /* renamed from: i */
    public static final Constructor<?> f45865i;

    /* renamed from: j */
    public static final Method f45866j;

    /* renamed from: k */
    public static final Method f45867k;

    static {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method2 = null;
            constructor = null;
            method = null;
        }
        f45865i = constructor;
        f45864h = cls;
        f45866j = method;
        f45867k = method2;
    }

    /* renamed from: o */
    public static boolean m80378o(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f45866j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public static Typeface m80379p(Object obj) {
        try {
            Object newInstance = Array.newInstance(f45864h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f45867k.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static boolean m80380q() {
        return f45866j != null;
    }

    /* renamed from: r */
    public static Object m80381r() {
        try {
            return f45865i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @C0363p0
    /* renamed from: b */
    public Typeface mo51926b(Context context, C17455f.C17459d dVar, Resources resources, int i) {
        Object r = m80381r();
        if (r == null) {
            return null;
        }
        for (C17455f.C17460e eVar : dVar.mo51887a()) {
            ByteBuffer b = C17599i2.m80644b(context, resources, eVar.mo51889b());
            if (b == null || !m80378o(r, b, eVar.mo51890c(), eVar.mo51892e(), eVar.mo51893f())) {
                return null;
            }
        }
        return m80379p(r);
    }

    @C0363p0
    /* renamed from: d */
    public Typeface mo51927d(Context context, @C0363p0 CancellationSignal cancellationSignal, @C0359n0 C17866h.C17869c[] cVarArr, int i) {
        Object r = m80381r();
        if (r == null) {
            return null;
        }
        C1886l lVar = new C1886l();
        for (C17866h.C17869c cVar : cVarArr) {
            Uri d = cVar.mo52285d();
            ByteBuffer byteBuffer = (ByteBuffer) lVar.get(d);
            if (byteBuffer == null) {
                byteBuffer = C17599i2.m80648f(context, cancellationSignal, d);
                lVar.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m80378o(r, byteBuffer, cVar.mo52284c(), cVar.mo52286e(), cVar.mo52287f())) {
                return null;
            }
        }
        Typeface p = m80379p(r);
        if (p == null) {
            return null;
        }
        return Typeface.create(p, i);
    }

    @C0359n0
    /* renamed from: g */
    public Typeface mo51928g(@C0359n0 Context context, @C0359n0 Typeface typeface, int i, boolean z) {
        Typeface typeface2;
        try {
            typeface2 = C17608k2.m80679b(typeface, i, z);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        if (typeface2 == null) {
            return super.mo51928g(context, typeface, i, z);
        }
        return typeface2;
    }
}
