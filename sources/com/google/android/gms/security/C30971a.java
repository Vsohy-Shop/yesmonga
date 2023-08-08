package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.C40715h;
import com.google.android.gms.common.C40864j;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.security.a */
public class C30971a {
    @C0359n0

    /* renamed from: a */
    public static final String f74200a = "GmsCore_OpenSSL";

    /* renamed from: b */
    public static final C40715h f74201b = C40715h.m165670i();

    /* renamed from: c */
    public static final Object f74202c = new Object();
    @C0323b0("ProviderInstaller.lock")

    /* renamed from: d */
    public static Method f74203d = null;
    @C0323b0("ProviderInstaller.lock")

    /* renamed from: e */
    public static Method f74204e = null;

    /* renamed from: com.google.android.gms.security.a$a */
    public interface C30972a {
        /* renamed from: a */
        void mo87647a();

        /* renamed from: b */
        void mo87648b(int i, @C0363p0 Intent intent);
    }

    /* renamed from: a */
    public static void m124376a(@C0359n0 Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context context2;
        C40843u.m166203m(context, "Context must not be null");
        f74201b.mo134227p(context, 11925000);
        synchronized (f74202c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.m166879e(context, DynamiteModule.f104323j, "com.google.android.gms.providerinstaller.dynamite").mo134841b();
            } catch (DynamiteModule.LoadingException e) {
                "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage()));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context i = C40864j.m166235i(context);
                if (i != null) {
                    try {
                        if (f74204e == null) {
                            Class cls = Long.TYPE;
                            f74204e = m124379d(i, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                        }
                        f74204e.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                    } catch (Exception e2) {
                        "Failed to report request stats: ".concat(String.valueOf(e2.getMessage()));
                    }
                }
                if (i != null) {
                    m124380e(i, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                }
                throw new GooglePlayServicesNotAvailableException(8);
            }
            m124380e(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
        }
    }

    /* renamed from: b */
    public static void m124377b(@C0359n0 Context context, @C0359n0 C30972a aVar) {
        C40843u.m166203m(context, "Context must not be null");
        C40843u.m166203m(aVar, "Listener must not be null");
        C40843u.m166197g("Must be called on the UI thread");
        new C30973b(context, aVar).execute(new Void[0]);
    }

    /* renamed from: d */
    public static Method m124379d(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    @C0323b0("ProviderInstaller.lock")
    /* renamed from: e */
    public static void m124380e(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        String str2;
        try {
            if (f74203d == null) {
                f74203d = m124379d(context, str, "insertProvider", new Class[]{Context.class});
            }
            f74203d.invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    str2 = e.getMessage();
                } else {
                    str2 = cause.getMessage();
                }
                "Failed to install provider: ".concat(String.valueOf(str2));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
