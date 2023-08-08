package com.contentsquare.android.sdk;

import android.content.Context;
import android.os.Build;
import androidx.autofill.C0861a;
import com.contentsquare.android.C14147n;
import com.google.firebase.crashlytics.internal.common.C32689j;
import com.urbanairship.analytics.C35554i;
import com.urbanairship.channel.C9029l;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.uc */
public class C14778uc {

    /* renamed from: a */
    public final String f36631a = "release";

    /* renamed from: b */
    public final String f36632b;

    /* renamed from: c */
    public final String f36633c;

    /* renamed from: d */
    public final String f36634d;

    /* renamed from: e */
    public final String f36635e;

    /* renamed from: f */
    public String f36636f = "";

    /* renamed from: g */
    public String f36637g = "";

    /* renamed from: h */
    public String f36638h = "";

    /* renamed from: i */
    public String f36639i = "";

    /* renamed from: j */
    public String f36640j;

    /* renamed from: k */
    public String f36641k;

    /* renamed from: l */
    public int f36642l = 0;

    /* renamed from: m */
    public boolean f36643m = false;

    public C14778uc(Context context) {
        this.f36632b = context.getResources().getBoolean(C14147n.C14149b.contentsquare_isTablet) ? "tablet" : C0861a.f2705e;
        this.f36633c = Build.MANUFACTURER + ' ' + Build.MODEL;
        this.f36634d = String.valueOf(Build.VERSION.SDK_INT);
        this.f36635e = "v:" + Build.VERSION.RELEASE;
    }

    /* renamed from: a */
    public C14778uc mo36571a(int i) {
        this.f36642l = i;
        return this;
    }

    /* renamed from: b */
    public C14778uc mo36572b(String str) {
        this.f36636f = str;
        return this;
    }

    /* renamed from: c */
    public C14778uc mo36573c(boolean z) {
        this.f36643m = z;
        return this;
    }

    /* renamed from: d */
    public JSONObject mo36574d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("origin", this.f36642l);
        jSONObject.put(C32689j.f79317s, this.f36643m);
        jSONObject.put("app_name", this.f36636f);
        jSONObject.put("app_version", this.f36637g);
        jSONObject.put("sdk_version", this.f36638h);
        jSONObject.put("sdk_type", this.f36631a);
        jSONObject.put("device_type", this.f36632b);
        jSONObject.put(C9029l.f24302e1, this.f36633c);
        jSONObject.put("os_api", this.f36634d);
        jSONObject.put(C35554i.f87765Z, this.f36635e);
        String str = this.f36641k;
        if (str != null) {
            jSONObject.put("root_point", str);
        }
        jSONObject.put("message", this.f36639i);
        String str2 = this.f36640j;
        if (str2 != null) {
            jSONObject.put("stack", str2);
        }
        return jSONObject;
    }

    /* renamed from: e */
    public C14778uc mo36575e(String str) {
        this.f36637g = str;
        return this;
    }

    /* renamed from: f */
    public C14778uc mo36576f(String str) {
        this.f36639i = str;
        return this;
    }

    /* renamed from: g */
    public C14778uc mo36577g(String str) {
        this.f36641k = str;
        return this;
    }

    /* renamed from: h */
    public C14778uc mo36578h(String str) {
        this.f36638h = str;
        return this;
    }

    /* renamed from: i */
    public C14778uc mo36579i(String str) {
        this.f36640j = str;
        return this;
    }
}
