package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.compose.p004ui.text.font.C16180b1;
import androidx.compose.p004ui.text.font.C16196f1;
import androidx.core.content.res.C17455f;
import androidx.core.provider.C17866h;
import com.carrefour.fid.android.shared.constant.C28515a1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

@C0376v0(26)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.graphics.h1 */
public class C17588h1 extends C17535c1 {

    /* renamed from: A */
    public static final int f45942A = -1;

    /* renamed from: t */
    public static final String f45943t = "TypefaceCompatApi26Impl";

    /* renamed from: u */
    public static final String f45944u = "android.graphics.FontFamily";

    /* renamed from: v */
    public static final String f45945v = "addFontFromAssetManager";

    /* renamed from: w */
    public static final String f45946w = "addFontFromBuffer";

    /* renamed from: x */
    public static final String f45947x = "createFromFamiliesWithDefault";

    /* renamed from: y */
    public static final String f45948y = "freeze";

    /* renamed from: z */
    public static final String f45949z = "abortCreation";

    /* renamed from: m */
    public final Class<?> f45950m;

    /* renamed from: n */
    public final Constructor<?> f45951n;

    /* renamed from: o */
    public final Method f45952o;

    /* renamed from: p */
    public final Method f45953p;

    /* renamed from: q */
    public final Method f45954q;

    /* renamed from: r */
    public final Method f45955r;

    /* renamed from: s */
    public final Method f45956s;

    public C17588h1() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor<?> constructor;
        Class<?> cls;
        try {
            cls = mo52036C();
            constructor = mo52037D(cls);
            method5 = mo52046z(cls);
            method4 = mo52034A(cls);
            method3 = mo52038E(cls);
            method2 = mo52045y(cls);
            method = mo52035B(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            cls = null;
            constructor = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f45950m = cls;
        this.f45951n = constructor;
        this.f45952o = method5;
        this.f45953p = method4;
        this.f45954q = method3;
        this.f45955r = method2;
        this.f45956s = method;
    }

    @C0363p0
    /* renamed from: s */
    private Object m80591s() {
        try {
            return this.f45951n.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: A */
    public Method mo52034A(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f45946w, new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* renamed from: B */
    public Method mo52035B(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: C */
    public Class<?> mo52036C() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: D */
    public Constructor<?> mo52037D(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: E */
    public Method mo52038E(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f45948y, new Class[0]);
    }

    @C0363p0
    /* renamed from: b */
    public Typeface mo51926b(Context context, C17455f.C17459d dVar, Resources resources, int i) {
        if (!mo52044x()) {
            return super.mo51926b(context, dVar, resources, i);
        }
        Object s = m80591s();
        if (s == null) {
            return null;
        }
        for (C17455f.C17460e eVar : dVar.mo51887a()) {
            if (!mo52041u(context, s, eVar.mo51888a(), eVar.mo51890c(), eVar.mo51892e(), eVar.mo51893f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.mo51891d()))) {
                mo52040t(s);
                return null;
            }
        }
        if (!mo52043w(s)) {
            return null;
        }
        return mo52039p(s);
    }

    @C0363p0
    /* renamed from: d */
    public Typeface mo51927d(Context context, @C0363p0 CancellationSignal cancellationSignal, @C0359n0 C17866h.C17869c[] cVarArr, int i) {
        Typeface p;
        ParcelFileDescriptor openFileDescriptor;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!mo52044x()) {
            C17866h.C17869c l = mo52032l(cVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(l.mo52285d(), C28515a1.f68703k, cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                C16180b1.m72909a();
                Typeface a = C16196f1.m72981a(openFileDescriptor.getFileDescriptor()).setWeight(l.mo52286e()).setItalic(l.mo52287f()).build();
                openFileDescriptor.close();
                return a;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> h = C17599i2.m80650h(context, cVarArr, cancellationSignal);
            Object s = m80591s();
            if (s == null) {
                return null;
            }
            boolean z = false;
            for (C17866h.C17869c cVar : cVarArr) {
                ByteBuffer byteBuffer = h.get(cVar.mo52285d());
                if (byteBuffer != null) {
                    if (!mo52042v(s, byteBuffer, cVar.mo52284c(), cVar.mo52286e(), cVar.mo52287f() ? 1 : 0)) {
                        mo52040t(s);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                mo52040t(s);
                return null;
            } else if (mo52043w(s) && (p = mo52039p(s)) != null) {
                return Typeface.create(p, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    @C0363p0
    /* renamed from: f */
    public Typeface mo52031f(Context context, Resources resources, int i, String str, int i2) {
        if (!mo52044x()) {
            return super.mo52031f(context, resources, i, str, i2);
        }
        Object s = m80591s();
        if (s == null) {
            return null;
        }
        if (!mo52041u(context, s, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            mo52040t(s);
            return null;
        } else if (!mo52043w(s)) {
            return null;
        } else {
            return mo52039p(s);
        }
    }

    @C0359n0
    /* renamed from: g */
    public Typeface mo51928g(@C0359n0 Context context, @C0359n0 Typeface typeface, int i, boolean z) {
        Typeface typeface2;
        try {
            typeface2 = C17614l2.m80689b(typeface, i, z);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        if (typeface2 == null) {
            return super.mo51928g(context, typeface, i, z);
        }
        return typeface2;
    }

    @C0363p0
    /* renamed from: p */
    public Typeface mo52039p(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f45950m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f45956s.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: t */
    public final void mo52040t(Object obj) {
        try {
            this.f45955r.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: u */
    public final boolean mo52041u(Context context, Object obj, String str, int i, int i2, int i3, @C0363p0 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f45952o.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: v */
    public final boolean mo52042v(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f45953p.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: w */
    public final boolean mo52043w(Object obj) {
        try {
            return ((Boolean) this.f45954q.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: x */
    public final boolean mo52044x() {
        return this.f45952o != null;
    }

    /* renamed from: y */
    public Method mo52045y(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f45949z, new Class[0]);
    }

    /* renamed from: z */
    public Method mo52046z(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f45945v, new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }
}
