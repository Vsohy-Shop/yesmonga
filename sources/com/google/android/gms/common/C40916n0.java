package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.C40775j1;
import com.google.android.gms.common.internal.C40779k1;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40963a;
import com.google.android.gms.common.util.C40988n;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.C32489b;
import java.security.MessageDigest;

@C32489b
/* renamed from: com.google.android.gms.common.n0 */
public final class C40916n0 {

    /* renamed from: a */
    public static final C40869l0 f104087a = new C40712f0(C40865j0.m166248O0("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b */
    public static final C40869l0 f104088b = new C40714g0(C40865j0.m166248O0("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c */
    public static final C40869l0 f104089c = new C40716h0(C40865j0.m166248O0("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d */
    public static final C40869l0 f104090d = new C40718i0(C40865j0.m166248O0("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e */
    public static volatile C40779k1 f104091e;

    /* renamed from: f */
    public static final Object f104092f = new Object();

    /* renamed from: g */
    public static Context f104093g;

    /* renamed from: a */
    public static C40962u0 m166360a(String str, C40865j0 j0Var, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m166367h(str, j0Var, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public static C40962u0 m166361b(String str, boolean z, boolean z2, boolean z3) {
        return m166368i(str, z, false, false, true);
    }

    /* renamed from: c */
    public static C40962u0 m166362c(String str, boolean z, boolean z2, boolean z3) {
        return m166368i(str, z, false, false, false);
    }

    /* renamed from: d */
    public static /* synthetic */ String m166363d(boolean z, String str, C40865j0 j0Var) throws Exception {
        boolean z2;
        String str2;
        if (z || !m166367h(str, j0Var, true, false).f104205a) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (true != z2) {
            str2 = "not allowed";
        } else {
            str2 = "debug cert rejected";
        }
        MessageDigest b = C40963a.m166573b("SHA-256");
        C40843u.m166202l(b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, C40988n.m166656a(b.digest(j0Var.mo134530T6())), Boolean.valueOf(z), "12451000.false"});
    }

    /* renamed from: e */
    public static synchronized void m166364e(Context context) {
        synchronized (C40916n0.class) {
            if (f104093g != null) {
                return;
            }
            if (context != null) {
                f104093g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public static boolean m166365f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m166369j();
            boolean h = f104091e.mo134416h();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return h;
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public static boolean m166366g() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m166369j();
            boolean k = f104091e.mo134417k();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return k;
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: h */
    public static C40962u0 m166367h(String str, C40865j0 j0Var, boolean z, boolean z2) {
        try {
            m166369j();
            C40843u.m166202l(f104093g);
            try {
                if (f104091e.mo134414E5(new zzs(str, j0Var, z, z2), C41019f.m166811T6(f104093g.getPackageManager()))) {
                    return C40962u0.m166565b();
                }
                return new C40931s0(new C40710e0(z, str, j0Var), (C40929r0) null);
            } catch (RemoteException e) {
                return C40962u0.m166567d("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            return C40962u0.m166567d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.dynamic.d, android.os.IBinder] */
    /* renamed from: i */
    public static C40962u0 m166368i(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C40962u0 u0Var;
        zzq zzq;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C40843u.m166202l(f104093g);
            try {
                m166369j();
                zzo zzo = new zzo(str, z, false, C41019f.m166811T6(f104093g), false);
                if (z4) {
                    zzq = f104091e.mo134415N6(zzo);
                } else {
                    zzq = f104091e.mo134418k7(zzo);
                }
                if (zzq.mo134790Q()) {
                    u0Var = C40962u0.m166568f(zzq.mo134791W());
                } else {
                    String M = zzq.mo134789M();
                    if (zzq.mo134792X() == 4) {
                        nameNotFoundException = new PackageManager.NameNotFoundException();
                    } else {
                        nameNotFoundException = null;
                    }
                    if (M == null) {
                        M = "error checking package certificate";
                    }
                    u0Var = C40962u0.m166569g(zzq.mo134791W(), zzq.mo134792X(), M, nameNotFoundException);
                }
            } catch (DynamiteModule.LoadingException e) {
                u0Var = C40962u0.m166567d("module init: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (RemoteException e2) {
            u0Var = C40962u0.m166567d("module call", e2);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return u0Var;
    }

    /* renamed from: j */
    public static void m166369j() throws DynamiteModule.LoadingException {
        if (f104091e == null) {
            C40843u.m166202l(f104093g);
            synchronized (f104092f) {
                if (f104091e == null) {
                    f104091e = C40775j1.m165933H0(DynamiteModule.m166879e(f104093g, DynamiteModule.f104323j, "com.google.android.gms.googlecertificates").mo134842d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
