package com.contentsquare.android.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.contentsquare.android.C14147n;
import com.contentsquare.android.sdk.C14439j3;
import com.contentsquare.android.sdk.C14479ka;
import com.contentsquare.android.sdk.C14760u2;
import com.contentsquare.android.sdk.C14928zb;
import java.util.List;
import java.util.Queue;

/* renamed from: com.contentsquare.android.sdk.xd */
public class C14861xd implements Application.ActivityLifecycleCallbacks, C14325f5, C14760u2.C14761a {

    /* renamed from: E0 */
    public C14841we<C14680ra> f36853E0;

    /* renamed from: F0 */
    public C14173a6 f36854F0;

    /* renamed from: G0 */
    public C14760u2 f36855G0;

    /* renamed from: H0 */
    public final C14373g9<Activity> f36856H0 = new C14864c();

    /* renamed from: I0 */
    public final C14373g9<Activity> f36857I0 = new C14865d();

    /* renamed from: X */
    public Runnable f36858X;

    /* renamed from: Y */
    public C14562o0 f36859Y;

    /* renamed from: Z */
    public final C14373g9<Activity> f36860Z = new C14863b();

    /* renamed from: a */
    public final C14432if f36861a;

    /* renamed from: b */
    public final C14454k f36862b;

    /* renamed from: c */
    public final List<C14663r3<Activity>> f36863c;

    /* renamed from: d */
    public final C14265d3<C14439j3.C14440a> f36864d;

    /* renamed from: e */
    public final C14453jf f36865e;

    /* renamed from: f */
    public final C14837wc f36866f;

    /* renamed from: g */
    public final C14373g9<Activity> f36867g = new C14862a();

    /* renamed from: v */
    public final C14870xf f36868v;

    /* renamed from: w */
    public final C14803vc f36869w;

    /* renamed from: x */
    public final C14536n f36870x;

    /* renamed from: y */
    public Activity f36871y;

    /* renamed from: z */
    public Handler f36872z;

    /* renamed from: com.contentsquare.android.sdk.xd$a */
    public class C14862a implements C14373g9<Activity> {
        public C14862a() {
        }

        /* renamed from: a */
        public void mo34337b(Activity activity) {
            C14861xd.this.f36861a.onActivityStarted(activity);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.xd$b */
    public class C14863b implements C14373g9<Activity> {
        public C14863b() {
        }

        /* renamed from: a */
        public void mo34337b(Activity activity) {
            if (activity != null) {
                C14861xd.this.f36869w.mo34691e(activity);
                mo36850c(activity);
            } else {
                C14861xd.this.f36865e.mo35676e("[onActivityPaused] : the Activity was null when trying to call #detachFrom on ScreenMonitoringService");
            }
            C14861xd xdVar = C14861xd.this;
            xdVar.f36871y = null;
            xdVar.mo36840n();
        }

        /* renamed from: c */
        public final void mo36850c(Activity activity) {
            if (C14861xd.this.f36866f.mo36767n().booleanValue()) {
                C14861xd.this.f36861a.mo35555b(activity);
            }
        }
    }

    /* renamed from: com.contentsquare.android.sdk.xd$c */
    public class C14864c implements C14373g9<Activity> {
        public C14864c() {
        }

        /* renamed from: a */
        public final void mo36851a() {
            C14861xd.this.f36859Y.mo36010f();
            C14861xd.this.f36859Y.mo36011g();
        }

        /* renamed from: c */
        public void mo34337b(Activity activity) {
            if (mo36853d()) {
                C14861xd.this.mo36834h();
            }
            C14861xd xdVar = C14861xd.this;
            xdVar.f36871y = activity;
            xdVar.mo36837k();
            C14861xd xdVar2 = C14861xd.this;
            xdVar2.f36869w.mo34687b(xdVar2.f36871y);
            C14861xd.this.mo36836j();
        }

        /* renamed from: d */
        public final boolean mo36853d() {
            mo36851a();
            C14861xd xdVar = C14861xd.this;
            if (xdVar.f36858X == null) {
                return true;
            }
            xdVar.f36865e.mo35676e("canceling hide event event");
            C14861xd xdVar2 = C14861xd.this;
            xdVar2.f36872z.removeCallbacks(xdVar2.f36858X);
            return false;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.xd$d */
    public class C14865d implements C14373g9<Activity> {
        public C14865d() {
        }

        /* renamed from: a */
        public void mo34337b(Activity activity) {
            C14861xd xdVar = C14861xd.this;
            xdVar.f36871y = activity;
            xdVar.mo36837k();
            C14861xd xdVar2 = C14861xd.this;
            xdVar2.f36869w.mo34687b(xdVar2.f36871y);
            C14861xd.this.mo36836j();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.xd$e */
    public class C14866e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C14479ka.C14480a f36877a;

        public C14866e(C14479ka.C14480a aVar) {
            this.f36877a = aVar;
        }

        public void run() {
            C14861xd.this.f36864d.mo34827b(this.f36877a);
            C14861xd.this.f36859Y.mo36010f();
            C14861xd.this.f36866f.mo36763j();
            C14861xd.this.f36870x.mo35949a().mo34764d();
            C14861xd.this.f36858X = null;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.xd$f */
    public class C14867f implements C14373g9<WebView> {
        public C14867f() {
        }

        /* renamed from: a */
        public void mo34337b(WebView webView) {
            Object context = webView.getContext();
            if (!(context instanceof Activity)) {
                context = webView.getTag(C14147n.C14155h.contentsquare_react_native_web_view_activity_tag);
                if (!(context instanceof Activity)) {
                    return;
                }
            }
            C14861xd xdVar = C14861xd.this;
            xdVar.f36854F0.mo34496b(webView, (Activity) context, xdVar.f36870x.mo35949a());
        }
    }

    /* renamed from: com.contentsquare.android.sdk.xd$g */
    public class C14868g implements C14373g9<WebView> {
        public C14868g() {
        }

        /* renamed from: a */
        public void mo34337b(WebView webView) {
            C14861xd.this.f36854F0.mo34495a(webView);
        }
    }

    public C14861xd(Application application, C14432if ifVar, C14454k kVar, C14837wc wcVar, C14562o0 o0Var, C14841we<C14680ra> weVar, C14173a6 a6Var, C14265d3<C14439j3.C14440a> d3Var, List<C14663r3<Activity>> list, C14760u2 u2Var, C14870xf xfVar, C14803vc vcVar) {
        C14841we<C14680ra> weVar2 = weVar;
        C14760u2 u2Var2 = u2Var;
        C14453jf jfVar = new C14453jf("Callbacks");
        this.f36865e = jfVar;
        this.f36861a = ifVar;
        C14454k kVar2 = kVar;
        this.f36862b = kVar2;
        C14837wc wcVar2 = wcVar;
        this.f36866f = wcVar2;
        this.f36859Y = o0Var;
        C14870xf xfVar2 = xfVar;
        this.f36868v = xfVar2;
        C14803vc vcVar2 = vcVar;
        this.f36869w = vcVar2;
        this.f36872z = new Handler(Looper.getMainLooper());
        jfVar.mo35676e("sending start event");
        this.f36864d = d3Var;
        this.f36855G0 = u2Var2;
        u2Var2.mo36548c(this);
        this.f36870x = new C14536n(kVar2, wcVar2, d3Var, this.f36855G0, xfVar2, vcVar2, C14549na.m62703a(application).mo35984e());
        this.f36863c = list;
        this.f36853E0 = weVar2;
        this.f36854F0 = a6Var;
        weVar2.mo34979d(this);
    }

    /* renamed from: a */
    public void mo34402a() {
        C14373g9 gVar;
        C14583o5 o5Var;
        C14680ra c = this.f36853E0.mo34977c();
        if (c instanceof C14490l1) {
            gVar = new C14867f();
            o5Var = (C14490l1) c;
        } else if (c instanceof C14188ad) {
            gVar = new C14868g();
            o5Var = (C14188ad) c;
        } else {
            return;
        }
        mo36833g(o5Var, gVar);
    }

    /* renamed from: b */
    public void mo35950b(Queue queue) {
        if (this.f36871y != null) {
            this.f36870x.mo35953e(queue);
        }
    }

    /* renamed from: c */
    public void mo36829c(Activity activity) {
        mo36830d(activity, this.f36857I0, this.f36863c);
    }

    /* renamed from: d */
    public final void mo36830d(Activity activity, C14373g9<Activity> g9Var, List<C14663r3<Activity>> list) {
        for (C14663r3<Activity> b : list) {
            if (b.mo34386b(activity)) {
                return;
            }
        }
        g9Var.mo34337b(activity);
    }

    /* renamed from: e */
    public void mo36831e(Application application) {
        application.registerActivityLifecycleCallbacks(this);
        this.f36869w.mo34693p();
    }

    /* renamed from: f */
    public final void mo36832f(C14439j3.C14440a aVar) {
        this.f36864d.mo34827b(aVar);
    }

    /* renamed from: g */
    public final void mo36833g(C14583o5 o5Var, C14373g9<WebView> g9Var) {
        WebView a = o5Var.mo36042a();
        if (a != null) {
            g9Var.mo34337b(a);
        }
    }

    /* renamed from: h */
    public final void mo36834h() {
        C14928zb.C14929a aVar = (C14928zb.C14929a) this.f36868v.mo36863b(1);
        this.f36865e.mo35679i("Starting with Session number: %d", Integer.valueOf(aVar.mo35612r()));
        this.f36865e.mo35676e("sending show event");
        mo36832f(aVar);
    }

    /* renamed from: i */
    public void mo36835i(Application application) {
        application.unregisterActivityLifecycleCallbacks(this);
        this.f36869w.mo34686b();
        mo36838l();
    }

    /* renamed from: j */
    public final void mo36836j() {
        if (this.f36866f.mo36767n().booleanValue()) {
            this.f36861a.mo35556c(this.f36871y, this.f36870x.mo35949a());
        }
    }

    /* renamed from: k */
    public final void mo36837k() {
        this.f36870x.mo35953e(this.f36855G0.mo36549d());
    }

    /* renamed from: l */
    public final void mo36838l() {
        Activity activity = this.f36871y;
        if (activity != null) {
            this.f36861a.mo35555b(activity);
            this.f36869w.mo34691e(this.f36871y);
        }
        this.f36871y = null;
    }

    /* renamed from: m */
    public void mo36839m() {
        this.f36870x.mo35952d();
    }

    /* renamed from: n */
    public void mo36840n() {
        C14479ka.C14480a aVar = (C14479ka.C14480a) this.f36868v.mo36863b(2);
        String jSONObject = C14886y6.m64142f(aVar.mo34709e()).toString();
        this.f36859Y.mo36007c(true);
        this.f36859Y.mo36006b(jSONObject);
        this.f36858X = new C14866e(aVar);
        this.f36865e.mo35676e("scheduling hide");
        this.f36872z.postDelayed(this.f36858X, 700);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        mo36830d(activity, this.f36860Z, this.f36863c);
    }

    public void onActivityResumed(Activity activity) {
        mo36830d(activity, this.f36856H0, this.f36863c);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        mo36830d(activity, this.f36867g, this.f36863c);
    }

    public void onActivityStopped(Activity activity) {
    }
}
