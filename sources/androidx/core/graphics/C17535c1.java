package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17455f;
import androidx.core.provider.C17866h;
import com.carrefour.fid.android.shared.constant.C28515a1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@C0376v0(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.graphics.c1 */
public class C17535c1 extends C17589h2 {

    /* renamed from: d */
    public static final String f45851d = "TypefaceCompatApi21Impl";

    /* renamed from: e */
    public static final String f45852e = "android.graphics.FontFamily";

    /* renamed from: f */
    public static final String f45853f = "addFontWeightStyle";

    /* renamed from: g */
    public static final String f45854g = "createFromFamiliesWithDefault";

    /* renamed from: h */
    public static Class<?> f45855h = null;

    /* renamed from: i */
    public static Constructor<?> f45856i = null;

    /* renamed from: j */
    public static Method f45857j = null;

    /* renamed from: k */
    public static Method f45858k = null;

    /* renamed from: l */
    public static boolean f45859l = false;

    /* renamed from: o */
    public static boolean m80367o(Object obj, String str, int i, boolean z) {
        m80369r();
        try {
            return ((Boolean) f45857j.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: p */
    public static Typeface mo52039p(Object obj) {
        m80369r();
        try {
            Object newInstance = Array.newInstance(f45855h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f45858k.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: r */
    public static void m80369r() {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        Method method2;
        if (!f45859l) {
            f45859l = true;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                constructor = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                cls = null;
                method2 = null;
                constructor = null;
                method = null;
            }
            f45856i = constructor;
            f45855h = cls;
            f45857j = method;
            f45858k = method2;
        }
    }

    /* renamed from: s */
    public static Object m80370s() {
        m80369r();
        try {
            return f45856i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Typeface mo51926b(Context context, C17455f.C17459d dVar, Resources resources, int i) {
        Object s = m80370s();
        C17455f.C17460e[] a = dVar.mo51887a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C17455f.C17460e eVar = a[i2];
            File e = C17599i2.m80647e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C17599i2.m80645c(e, resources, eVar.mo51889b())) {
                    e.delete();
                    return null;
                } else if (!m80367o(s, e.getPath(), eVar.mo51892e(), eVar.mo51893f())) {
                    return null;
                } else {
                    e.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo52039p(s);
    }

    /* renamed from: d */
    public Typeface mo51927d(Context context, CancellationSignal cancellationSignal, @C0359n0 C17866h.C17869c[] cVarArr, int i) {
        FileInputStream fileInputStream;
        if (cVarArr.length < 1) {
            return null;
        }
        C17866h.C17869c l = mo52032l(cVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l.mo52285d(), C28515a1.f68703k, cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File q = mo51929q(openFileDescriptor);
                if (q != null) {
                    if (q.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(q);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface e = super.mo52030e(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return e;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
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

    /* renamed from: q */
    public final File mo51929q(@C0359n0 ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
