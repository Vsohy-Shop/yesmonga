package androidx.core.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.p */
public final class C17195p {

    @C0376v0(18)
    /* renamed from: androidx.core.app.p$a */
    public static class C17196a {
        @C0373u
        /* renamed from: a */
        public static IBinder m79488a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @C0373u
        /* renamed from: b */
        public static void m79489b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: androidx.core.app.p$b */
    public static class C17197b {

        /* renamed from: a */
        public static final String f45452a = "BundleCompatBaseImpl";

        /* renamed from: b */
        public static Method f45453b;

        /* renamed from: c */
        public static boolean f45454c;

        /* renamed from: d */
        public static Method f45455d;

        /* renamed from: e */
        public static boolean f45456e;

        /* renamed from: a */
        public static IBinder m79490a(Bundle bundle, String str) {
            if (!f45454c) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f45453b = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f45454c = true;
            }
            Method method2 = f45453b;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f45453b = null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public static void m79491b(Bundle bundle, String str, IBinder iBinder) {
            if (!f45456e) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f45455d = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f45456e = true;
            }
            Method method2 = f45455d;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f45455d = null;
                }
            }
        }
    }

    @C0363p0
    /* renamed from: a */
    public static IBinder m79486a(@C0359n0 Bundle bundle, @C0363p0 String str) {
        return C17196a.m79488a(bundle, str);
    }

    /* renamed from: b */
    public static void m79487b(@C0359n0 Bundle bundle, @C0363p0 String str, @C0363p0 IBinder iBinder) {
        C17196a.m79489b(bundle, str, iBinder);
    }
}
