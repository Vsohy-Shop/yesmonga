package com.contentsquare.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.contentsquare.android.api.model.C14103e;
import com.contentsquare.android.sdk.C14210b5;
import com.contentsquare.android.sdk.C14373g9;
import com.contentsquare.android.sdk.C14453jf;
import com.contentsquare.android.sdk.C14477k8;
import com.contentsquare.android.sdk.C14538n0;
import com.contentsquare.android.sdk.C14549na;
import com.contentsquare.android.sdk.C14600oe;
import com.contentsquare.android.sdk.C14699s7;
import com.contentsquare.android.sdk.C14705sb;
import com.contentsquare.android.sdk.C14731t1;
import com.contentsquare.android.sdk.C14760u2;
import com.contentsquare.android.sdk.C14831w9;
import com.contentsquare.android.sdk.C14859xb;
import com.contentsquare.android.sdk.C14915z1;
import com.contentsquare.android.sdk.C14932zd;

/* renamed from: com.contentsquare.android.m */
public class C14146m {

    /* renamed from: a */
    public static final C14453jf f35011a = new C14453jf("Contentsquare");

    public C14146m() {
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

    /* renamed from: A */
    public static void m60740A(String str, long j) {
        f35011a.mo35674c("CS_API send, with key = %s, value(long) = %d", str, Long.valueOf(j));
        m60750c(new C14123h(str, j));
    }

    /* renamed from: B */
    public static void m60741B(String str, String str2) {
        f35011a.mo35674c("CS_API send, with key = %s, value(string) = %s", str, str2);
        m60750c(new C14108d(str, str2));
    }

    /* renamed from: C */
    public static void m60742C(boolean z) {
        m60750c(new C14121f(z));
    }

    /* renamed from: D */
    public static void m60743D(Context context) {
        C14831w9.m63901a(context);
    }

    /* renamed from: E */
    public static void m60744E() {
        f35011a.mo35676e("CS_API, stopTracking");
        C14760u2.m63605e().mo36546a();
        m60750c(new C14143j());
    }

    /* renamed from: F */
    public static void m60745F(View view) {
        m60750c(new C14085a(view));
    }

    /* renamed from: G */
    public static void m60746G(Class<?> cls) {
        m60750c(new C14106b(cls));
    }

    /* renamed from: H */
    public static boolean m60747H() {
        return C14538n0.m62672c() != null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m60748a(View view, C14699s7 s7Var) {
        C14731t1 e = C14731t1.m63478e();
        if (e != null) {
            e.mo36461g().mo35521a(view);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m60749b(C14699s7 s7Var) {
        C14549na d = C14549na.m62704d();
        if (d != null) {
            d.mo35986g().mo34683o(C14477k8.FORGET_ME, true);
        }
        s7Var.mo36383a();
        f35011a.mo35679i("Forgetting User", new Object[0]);
    }

    /* renamed from: c */
    public static void m60750c(C14373g9<C14699s7> g9Var) {
        C14538n0 c = C14538n0.m62672c();
        if (c != null) {
            m60758k(g9Var, c.mo35956e());
        } else {
            f35011a.mo35677f("Unable to perform the action, make sure you are not opted out of the Contentsquare tracker and SDK was correctly initialized.", new Object[0]);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m60752e(Class cls, C14699s7 s7Var) {
        C14731t1 e = C14731t1.m63478e();
        if (e != null) {
            e.mo36461g().mo35522b(cls);
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m60755h(boolean z, C14699s7 s7Var) {
        C14731t1 e = C14731t1.m63478e();
        if (e != null) {
            e.mo36461g().mo35523c(z);
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m60756i(View view, C14699s7 s7Var) {
        C14731t1 e = C14731t1.m63478e();
        if (e != null) {
            e.mo36461g().mo35526f(view);
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m60757j(C14699s7 s7Var) {
        s7Var.mo36390h();
        f35011a.mo35679i("Opting out", new Object[0]);
    }

    /* renamed from: k */
    public static void m60758k(C14373g9<C14699s7> g9Var, C14699s7 s7Var) {
        if (!C14859xb.m64014a()) {
            new Handler(Looper.getMainLooper()).post(new C14144k(g9Var, s7Var));
        } else {
            g9Var.mo34337b(s7Var);
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m60759l(Class cls, C14699s7 s7Var) {
        C14731t1 e = C14731t1.m63478e();
        if (e != null) {
            e.mo36461g().mo35527g(cls);
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m60760m(C14699s7 s7Var) {
        if (C14600oe.m62882k() != null) {
            C14731t1.m63477b(C14600oe.m62882k().mo36108a(), false);
        }
        s7Var.mo36392j();
        f35011a.mo35679i("Resuming Tracker", new Object[0]);
    }

    /* renamed from: n */
    public static void m60761n(MotionEvent motionEvent) {
        f35011a.mo35674c("CS_API, consumeEvent with event %s", motionEvent);
        if (C14600oe.m62882k() != null) {
            C14600oe.m62882k().mo36118m().mo34827b(C14210b5.m60989d(MotionEvent.obtain(motionEvent)));
        }
    }

    /* renamed from: o */
    public static String m60762o() {
        String str;
        C14453jf jfVar = f35011a;
        jfVar.mo35676e("CS_API, currentSessionReplayLink");
        C14731t1 e = C14731t1.m63478e();
        if (e != null) {
            str = e.mo36460f().mo36531a();
            e.mo36457a();
        } else {
            str = "INACTIVE";
        }
        jfVar.mo35679i("SessionReplay link: %s", str);
        return str;
    }

    /* renamed from: p */
    public static /* synthetic */ void m60763p(C14699s7 s7Var) {
        C14731t1.m63480i();
        s7Var.mo36391i();
        f35011a.mo35679i("Stopping Tracker", new Object[0]);
    }

    @SafeVarargs
    /* renamed from: q */
    public static void m60764q(Class<? extends Activity>... clsArr) {
        f35011a.mo35676e("@CS_API -- doNotTrack activated");
        C14932zd.m64245b(clsArr);
    }

    /* renamed from: r */
    public static void m60765r() {
        f35011a.mo35676e("CS_API, forgetMe");
        C14760u2.m63605e().mo36546a();
        m60750c(new C14109e());
    }

    /* renamed from: s */
    public static String m60766s() {
        C14453jf jfVar = f35011a;
        jfVar.mo35676e("CS_API, getUserId");
        jfVar.mo35679i("User requested Contentsquare User ID.", new Object[0]);
        C14538n0 c = C14538n0.m62672c();
        String g = c != null ? c.mo35956e().mo36389g() : null;
        if (g != null) {
            jfVar.mo35679i("Get user ID - User ID: %s", g);
            return g;
        }
        jfVar.mo35679i("User ID Unknown. You need to opt-in.", new Object[0]);
        return "UNKNOWN";
    }

    /* renamed from: t */
    public static void m60767t(View view) {
        m60750c(new C14122g(view));
    }

    /* renamed from: u */
    public static void m60768u(Class<?> cls) {
        m60750c(new C14107c(cls));
    }

    /* renamed from: v */
    public static void m60769v(Context context) {
        Activity a;
        C14453jf jfVar = f35011a;
        jfVar.mo35676e("CS_API, optIn");
        new C14705sb(context).mo36003k("optout_data_collection", false);
        C14549na.m62703a(context.getApplicationContext()).mo35986g().mo34683o(C14477k8.FORGET_ME, false);
        C14600oe.m62881b((Application) context.getApplicationContext()).mo36124s().mo36632c();
        if (!(C14538n0.m62672c() == null || (a = C14549na.m62703a(context).mo35984e().mo36415a()) == null)) {
            C14538n0.m62672c().mo35954b().mo36829c(a);
        }
        C14600oe.m62881b((Application) context.getApplicationContext()).mo36120o().mo34402a();
        jfVar.mo35679i("Opting-in. User ID: %s", m60766s());
    }

    /* renamed from: w */
    public static void m60770w(Context context) {
        f35011a.mo35676e("CS_API, optOut");
        C14760u2.m63605e().mo36546a();
        new C14705sb(context).mo36003k("optout_data_collection", true);
        m60750c(new C14124i());
        C14600oe.m62881b((Application) context.getApplicationContext()).mo36120o().mo34402a();
    }

    /* renamed from: x */
    public static void m60771x() {
        f35011a.mo35676e("CS_API, resumeTracking");
        m60750c(new C14145l());
    }

    /* renamed from: y */
    public static void m60772y(C14103e eVar) {
        C14453jf jfVar = f35011a;
        jfVar.mo35674c("CS_API, send with transaction = %s", eVar.toString());
        C14538n0 c = C14538n0.m62672c();
        if (c != null) {
            c.mo35956e().mo36386d(eVar);
        } else {
            jfVar.mo35677f("Transaction not registered, please check CS tracker is on", new Object[0]);
        }
    }

    /* renamed from: z */
    public static void m60773z(String str) {
        f35011a.mo35674c("CS_API, screenName = %s", str);
        if (C14549na.m62704d() != null) {
            C14549na.m62704d().mo35987h().mo36127b();
        }
        C14760u2.m63605e().mo36547b(new C14915z1(str));
    }
}
