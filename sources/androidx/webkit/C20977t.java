package androidx.webkit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.C20851a;
import androidx.webkit.internal.C20866c;
import androidx.webkit.internal.C20877e0;
import androidx.webkit.internal.C20884g1;
import androidx.webkit.internal.C20891j;
import androidx.webkit.internal.C20896k1;
import androidx.webkit.internal.C20901m0;
import androidx.webkit.internal.C20908o1;
import androidx.webkit.internal.C20912p1;
import androidx.webkit.internal.C20915q;
import androidx.webkit.internal.C20917q1;
import androidx.webkit.internal.C20920r1;
import androidx.webkit.internal.C20931u1;
import androidx.webkit.internal.C20938w1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: androidx.webkit.t */
public class C20977t {

    /* renamed from: a */
    public static final Uri f54084a = Uri.parse("*");

    /* renamed from: b */
    public static final Uri f54085b = Uri.parse("");

    /* renamed from: androidx.webkit.t$a */
    public interface C20978a {
        @C0341g1
        void onComplete(long j);
    }

    /* renamed from: androidx.webkit.t$b */
    public interface C20979b {
        @C0341g1
        /* renamed from: a */
        void mo62740a(@C0359n0 WebView webView, @C0359n0 C20959n nVar, @C0359n0 Uri uri, boolean z, @C0359n0 C20840c cVar);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static C20849h m97093a(@C0359n0 WebView webView, @C0359n0 String str, @C0359n0 Set<String> set) {
        if (C20908o1.f53969V.mo62608d()) {
            return m97103k(webView).mo62673a(str, (String[]) set.toArray(new String[0]));
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: b */
    public static void m97094b(@C0359n0 WebView webView, @C0359n0 String str, @C0359n0 Set<String> set, @C0359n0 C20979b bVar) {
        if (C20908o1.f53968U.mo62608d()) {
            m97103k(webView).mo62674b(str, (String[]) set.toArray(new String[0]), bVar);
            return;
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: c */
    public static void m97095c(WebView webView) {
        if (Build.VERSION.SDK_INT >= 28) {
            Looper c = C20877e0.m96856c(webView);
            if (c != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + c + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
            return;
        }
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(webView, new Object[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: d */
    public static WebViewProviderBoundaryInterface m97096d(WebView webView) {
        return m97100h().createWebView(webView);
    }

    @C0359n0
    /* renamed from: e */
    public static C20961o[] m97097e(@C0359n0 WebView webView) {
        C20851a.C20853b bVar = C20908o1.f53952E;
        if (bVar.mo62607c()) {
            return C20896k1.m96888l(C20866c.m96815c(webView));
        }
        if (bVar.mo62608d()) {
            return m97103k(webView).mo62675c();
        }
        throw C20908o1.m96934a();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: f */
    public static PackageInfo m97098f() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C20891j.m96877a();
        }
        try {
            return m97101i();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @C0363p0
    /* renamed from: g */
    public static PackageInfo m97099g(@C0359n0 Context context) {
        PackageInfo f = m97098f();
        if (f != null) {
            return f;
        }
        return m97102j(context);
    }

    /* renamed from: h */
    public static C20920r1 m97100h() {
        return C20912p1.m96946d();
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: i */
    public static PackageInfo m97101i() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke((Object) null, new Object[0]);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.annotation.SuppressLint({"PrivateApi"})
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.pm.PackageInfo m97102j(android.content.Context r5) {
        /*
            r0 = 0
            java.lang.String r1 = "android.webkit.WebViewUpdateService"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0024 }
            java.lang.String r2 = "getCurrentWebViewPackageName"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0024 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0024 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0024 }
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0024 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0024 }
            if (r1 != 0) goto L_0x001b
            return r0
        L_0x001b:
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r3)     // Catch:{  }
            return r5
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.webkit.C20977t.m97102j(android.content.Context):android.content.pm.PackageInfo");
    }

    /* renamed from: k */
    public static C20917q1 m97103k(WebView webView) {
        return new C20917q1(m97096d(webView));
    }

    @C0359n0
    /* renamed from: l */
    public static Uri m97104l() {
        C20851a.C20857f fVar = C20908o1.f53984j;
        if (fVar.mo62607c()) {
            return C20915q.m96950b();
        }
        if (fVar.mo62608d()) {
            return m97100h().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw C20908o1.m96934a();
    }

    @C0359n0
    /* renamed from: m */
    public static String m97105m() {
        if (C20908o1.f53971X.mo62608d()) {
            return m97100h().getStatics().getVariationsHeader();
        }
        throw C20908o1.m96934a();
    }

    @C0363p0
    /* renamed from: n */
    public static WebChromeClient m97106n(@C0359n0 WebView webView) {
        C20851a.C20856e eVar = C20908o1.f53956I;
        if (eVar.mo62607c()) {
            return C20891j.m96879c(webView);
        }
        if (eVar.mo62608d()) {
            return m97103k(webView).mo62676d();
        }
        throw C20908o1.m96934a();
    }

    @C0359n0
    /* renamed from: o */
    public static WebViewClient m97107o(@C0359n0 WebView webView) {
        C20851a.C20856e eVar = C20908o1.f53955H;
        if (eVar.mo62607c()) {
            return C20891j.m96880d(webView);
        }
        if (eVar.mo62608d()) {
            return m97103k(webView).mo62677e();
        }
        throw C20908o1.m96934a();
    }

    @C0363p0
    /* renamed from: p */
    public static C20983v m97108p(@C0359n0 WebView webView) {
        C20851a.C20859h hVar = C20908o1.f53957J;
        if (hVar.mo62607c()) {
            WebViewRenderProcess b = C20901m0.m96905b(webView);
            if (b != null) {
                return C20938w1.m96997b(b);
            }
            return null;
        } else if (hVar.mo62608d()) {
            return m97103k(webView).mo62678f();
        } else {
            throw C20908o1.m96934a();
        }
    }

    @C0363p0
    /* renamed from: q */
    public static C20984w m97109q(@C0359n0 WebView webView) {
        C20851a.C20859h hVar = C20908o1.f53961N;
        if (hVar.mo62607c()) {
            WebViewRenderProcessClient c = C20901m0.m96906c(webView);
            if (c == null || !(c instanceof C20931u1)) {
                return null;
            }
            return ((C20931u1) c).mo62697a();
        } else if (hVar.mo62608d()) {
            return m97103k(webView).mo62679g();
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: r */
    public static boolean m97110r() {
        if (C20908o1.f53965R.mo62608d()) {
            return m97100h().getStatics().isMultiProcessEnabled();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: s */
    public static void m97111s(@C0359n0 WebView webView, long j, @C0359n0 C20978a aVar) {
        C20851a.C20853b bVar = C20908o1.f53974a;
        if (bVar.mo62607c()) {
            C20866c.m96821i(webView, j, aVar);
        } else if (bVar.mo62608d()) {
            m97095c(webView);
            m97103k(webView).mo62680h(j, aVar);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: t */
    public static void m97112t(@C0359n0 WebView webView, @C0359n0 C20959n nVar, @C0359n0 Uri uri) {
        if (f54084a.equals(uri)) {
            uri = f54085b;
        }
        C20851a.C20853b bVar = C20908o1.f53953F;
        if (bVar.mo62607c() && nVar.mo62728d() == 0) {
            C20866c.m96822j(webView, C20896k1.m96885g(nVar), uri);
        } else if (!bVar.mo62608d() || !C20884g1.m96870a(nVar.mo62728d())) {
            throw C20908o1.m96934a();
        } else {
            m97103k(webView).mo62681i(nVar, uri);
        }
    }

    /* renamed from: u */
    public static void m97113u(@C0359n0 WebView webView, @C0359n0 String str) {
        if (C20908o1.f53968U.mo62608d()) {
            m97103k(webView).mo62682j(str);
            return;
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: v */
    public static void m97114v(@C0359n0 Set<String> set, @C0363p0 ValueCallback<Boolean> valueCallback) {
        C20851a.C20857f fVar = C20908o1.f53983i;
        C20851a.C20857f fVar2 = C20908o1.f53982h;
        if (fVar.mo62608d()) {
            m97100h().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (fVar2.mo62607c()) {
            C20915q.m96952d(arrayList, valueCallback);
        } else if (fVar2.mo62608d()) {
            m97100h().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            throw C20908o1.m96934a();
        }
    }

    @Deprecated
    /* renamed from: w */
    public static void m97115w(@C0359n0 List<String> list, @C0363p0 ValueCallback<Boolean> valueCallback) {
        m97114v(new HashSet(list), valueCallback);
    }

    /* renamed from: x */
    public static void m97116x(@C0359n0 WebView webView, @C0363p0 C20984w wVar) {
        C20851a.C20859h hVar = C20908o1.f53961N;
        if (hVar.mo62607c()) {
            C20901m0.m96908e(webView, wVar);
        } else if (hVar.mo62608d()) {
            m97103k(webView).mo62683k((Executor) null, wVar);
        } else {
            throw C20908o1.m96934a();
        }
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: y */
    public static void m97117y(@C0359n0 WebView webView, @C0359n0 Executor executor, @C0359n0 C20984w wVar) {
        C20851a.C20859h hVar = C20908o1.f53961N;
        if (hVar.mo62607c()) {
            C20901m0.m96909f(webView, executor, wVar);
        } else if (hVar.mo62608d()) {
            m97103k(webView).mo62683k(executor, wVar);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: z */
    public static void m97118z(@C0359n0 Context context, @C0363p0 ValueCallback<Boolean> valueCallback) {
        C20851a.C20857f fVar = C20908o1.f53979e;
        if (fVar.mo62607c()) {
            C20915q.m96954f(context, valueCallback);
        } else if (fVar.mo62608d()) {
            m97100h().getStatics().initSafeBrowsing(context, valueCallback);
        } else {
            throw C20908o1.m96934a();
        }
    }
}
