package com.contentsquare.android.sdk;

import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.n8 */
public class C14547n8 extends C14522m7 {
    /* renamed from: b */
    public static C14547n8 m62701b(JSONObject jSONObject, C14250c9 c9Var) {
        C14547n8 n8Var = new C14547n8();
        n8Var.f35924b = jSONObject.optInt("type", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            m62702c(n8Var, c9Var, optJSONObject.optString("path", ""));
            n8Var.f35927e = optJSONObject.optDouble("distance", 0.0d);
            n8Var.f35928f = optJSONObject.optDouble("velocity", 0.0d);
            n8Var.f35926d = optJSONObject.optInt("direction", 0);
        }
        return n8Var;
    }

    /* renamed from: c */
    public static void m62702c(C14522m7 m7Var, C14250c9 c9Var, String str) {
        C14250c9 w7Var;
        String a = c9Var.mo34853a();
        if (a.contains(">FlutterView")) {
            w7Var = new C14910yf(c9Var, str);
        } else if (a.contains(">WebView") || a.contains(">RNCWebView")) {
            w7Var = new C14827w7(c9Var, str);
        } else {
            m7Var.f35925c = c9Var;
            return;
        }
        m7Var.f35925c = w7Var;
    }
}
