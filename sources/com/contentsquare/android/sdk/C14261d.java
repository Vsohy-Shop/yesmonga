package com.contentsquare.android.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.contentsquare.android.C14146m;
import com.contentsquare.android.api.model.C14103e;
import com.contentsquare.android.sdk.C14439j3;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.d */
public class C14261d {

    /* renamed from: a */
    public final C14453jf f35219a = new C14453jf("CsJavaScriptInterface");

    /* renamed from: b */
    public final Context f35220b;

    /* renamed from: c */
    public final long f35221c;

    /* renamed from: d */
    public final C14772u7 f35222d;

    /* renamed from: e */
    public C14739t6 f35223e;

    public C14261d(WebView webView, Activity activity, C14688re reVar, C14870xf xfVar, C14326f6 f6Var, C14265d3<C14439j3.C14440a> d3Var, C14772u7 u7Var) {
        C14772u7 u7Var2 = u7Var;
        this.f35220b = activity.getApplicationContext();
        this.f35223e = new C14739t6(activity, new Handler(Looper.getMainLooper()), webView, reVar, f6Var, xfVar, d3Var);
        WebView webView2 = webView;
        this.f35221c = (long) u7Var2.mo36565a(webView);
        this.f35222d = u7Var2;
    }

    @JavascriptInterface
    public void optIn() {
        this.f35219a.mo35676e("optIn triggered");
        C14146m.m60769v(this.f35220b);
    }

    @JavascriptInterface
    public void optOut() {
        this.f35219a.mo35676e("optOut triggered");
        C14146m.m60770w(this.f35220b);
    }

    @JavascriptInterface
    public void sendDynamicVar(String str, int i) {
        this.f35219a.mo35674c("Receiving Dvar, with key = %s, value(int) = %d", str, Integer.valueOf(i));
        C14146m.m60740A(str, (long) i);
    }

    @JavascriptInterface
    public void sendEvent(String str) {
        this.f35219a.mo35674c("sendEvent triggered: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            C14739t6 t6Var = this.f35223e;
            if (t6Var != null) {
                t6Var.mo36492h(jSONObject);
            }
        } catch (JSONException e) {
            this.f35219a.mo35678g(e, "Error while parsing %s", str);
        }
    }

    @JavascriptInterface
    public void sendException(String str) {
        this.f35219a.mo35674c("sendException triggered: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("message");
            String string3 = jSONObject.getString("tagVersion");
            long j = jSONObject.getLong("timestamp");
            C14739t6 t6Var = this.f35223e;
            if (t6Var != null) {
                t6Var.mo36491e(string, string2, string3, j);
            }
        } catch (JSONException e) {
            this.f35219a.mo35678g(e, "Error while parsing %s", str);
        }
    }

    @JavascriptInterface
    public void sendMessage(String str) {
        try {
            String string = new JSONObject(str).getString("message");
            C14739t6 t6Var = this.f35223e;
            if (t6Var != null) {
                t6Var.mo36490d(string);
            }
        } catch (JSONException e) {
            this.f35219a.mo35678g(e, "Error while parsing %s", str);
        }
    }

    @JavascriptInterface
    public void sendSREvent(String str) {
        this.f35219a.mo35674c("sendSrEvent triggered: %s", str);
        C14731t1 e = C14731t1.m63478e();
        if (e != null) {
            e.mo36459d(new C14304e9(this.f35221c, str, this.f35222d.mo36566b()));
        }
    }

    @JavascriptInterface
    public void sendTransaction(String str, float f, String str2) {
        this.f35219a.mo35674c("Receiving transaction, with id = %s, value(float) = %f, currency = %s", str, Float.valueOf(f), str2);
        C14103e.C14104a b = C14103e.m60627b(f, str2);
        if (str != null) {
            b.mo34351e(str);
        }
        C14146m.m60772y(b.mo34350d());
    }

    @JavascriptInterface
    public void sendDynamicVar(String str, String str2) {
        this.f35219a.mo35674c("Receiving Dvar, with key = %s, value(String) = %s", str, str2);
        C14146m.m60741B(str, str2);
    }
}
