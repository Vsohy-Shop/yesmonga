package com.contentsquare.android.sdk;

import android.app.Activity;
import android.os.Handler;
import android.webkit.WebView;
import com.contentsquare.android.sdk.C14342fb;
import com.contentsquare.android.sdk.C14439j3;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.t6 */
public class C14739t6 {

    /* renamed from: a */
    public final C14870xf f36480a;

    /* renamed from: b */
    public final C14265d3<C14439j3.C14440a> f36481b;

    /* renamed from: c */
    public C14453jf f36482c = new C14453jf("WebViewEventProcessor");

    /* renamed from: d */
    public WeakReference<Activity> f36483d;

    /* renamed from: e */
    public Handler f36484e;

    /* renamed from: f */
    public Runnable f36485f;

    /* renamed from: g */
    public C14326f6 f36486g;

    /* renamed from: h */
    public C14688re f36487h;

    /* renamed from: i */
    public WeakReference<WebView> f36488i;

    /* renamed from: j */
    public boolean f36489j = true;

    public C14739t6(Activity activity, Handler handler, WebView webView, C14688re reVar, C14326f6 f6Var, C14870xf xfVar, C14265d3<C14439j3.C14440a> d3Var) {
        this.f36483d = new WeakReference<>(activity);
        this.f36484e = handler;
        this.f36488i = new WeakReference<>(webView);
        this.f36487h = reVar;
        this.f36486g = f6Var;
        this.f36480a = xfVar;
        this.f36481b = d3Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m63534f(JSONObject jSONObject) {
        Activity c = mo36489c();
        if (c != null) {
            this.f36482c.mo35681l("WebView PAGE_VIEW triggered", new Object[0]);
            try {
                this.f36487h.mo34761a(c, jSONObject.getString("url"), 1);
            } catch (JSONException e) {
                this.f36482c.mo35678g(e, "Error while parsing %s", jSONObject);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m63535g() {
        C14453jf.m62245h("WebView Tracking Tag is detected on page: " + this.f36488i.get().getUrl());
    }

    /* renamed from: c */
    public Activity mo36489c() {
        return this.f36483d.get();
    }

    /* renamed from: d */
    public void mo36490d(String str) {
        this.f36482c.mo35674c("WebView message LOG --> %s", str);
    }

    /* renamed from: e */
    public void mo36491e(String str, String str2, String str3, long j) {
        C14342fb.C14343a aVar = (C14342fb.C14343a) this.f36480a.mo36863b(17);
        aVar.mo35188x(3);
        aVar.mo35186v(false);
        aVar.mo35187w("TagErrMessage: " + str3 + " - " + str2 + "[" + j + "] " + str);
        this.f36481b.mo34827b(aVar);
    }

    /* renamed from: h */
    public void mo36492h(JSONObject jSONObject) {
        try {
            int i = jSONObject.getInt("type");
            this.f36482c.mo35681l("type: %d", Integer.valueOf(i));
            if (this.f36489j && this.f36488i.get() != null) {
                this.f36489j = false;
                this.f36484e.post(new C14667r6(this));
            }
            if (i == 4) {
                mo36493i(jSONObject.getJSONObject("data"));
            } else if (this.f36488i.get() != null) {
                this.f36486g.mo35138h(C14547n8.m62701b(jSONObject, new C14691s0(this.f36488i.get())));
            }
        } catch (JSONException e) {
            this.f36482c.mo35678g(e, "Error while parsing %s", jSONObject);
        }
    }

    /* renamed from: i */
    public void mo36493i(JSONObject jSONObject) {
        C14698s6 s6Var = new C14698s6(this, jSONObject);
        this.f36485f = s6Var;
        this.f36484e.post(s6Var);
    }
}
