package com.contentsquare.android.api.bridge.flutter;

import android.view.View;
import com.contentsquare.android.sdk.C14296e6;
import com.contentsquare.android.sdk.C14453jf;
import com.contentsquare.android.sdk.C14887y7;
import com.contentsquare.android.sdk.C14932zd;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.api.bridge.flutter.c */
public class C14090c {

    /* renamed from: a */
    public static final String f34495a = "FlutterSurfaceView";

    /* renamed from: b */
    public static final C14453jf f34496b = new C14453jf("FlutterInterface");

    /* renamed from: c */
    public static C14091a f34497c = new C14091a();

    /* renamed from: com.contentsquare.android.api.bridge.flutter.c$a */
    public static class C14091a {
        /* renamed from: a */
        public void mo34341a(String str, JSONObject jSONObject) {
            C14887y7.m64154a().mo36931c(str, jSONObject);
        }
    }

    @SafeVarargs
    /* renamed from: a */
    public static void m60610a(Class<? extends View>... clsArr) {
        C14932zd.m64247d(clsArr);
    }

    /* renamed from: b */
    public static void m60611b(View view, C14088a aVar) {
        C14296e6.m61465d(view, aVar);
    }

    /* renamed from: c */
    public static void m60612c(String str) {
        f34496b.mo35674c("sendEvent: %s", str);
        try {
            f34497c.mo34341a(f34495a, new JSONObject(str));
        } catch (JSONException e) {
            f34496b.mo35678g(e, "Error while parsing %s", str);
        }
    }

    /* renamed from: d */
    public static void m60613d(View view) {
        C14296e6.m61464c(view);
    }
}
