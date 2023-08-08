package com.contentsquare.android.sdk;

import java.util.concurrent.TimeUnit;

/* renamed from: com.contentsquare.android.sdk.u6 */
public class C14771u6 {

    /* renamed from: c */
    public static C14453jf f36618c = new C14453jf("Configuration");

    /* renamed from: a */
    public final C14213b7 f36619a;

    /* renamed from: b */
    public C14466k4 f36620b = mo36563e();

    public C14771u6(C14213b7 b7Var) {
        this.f36619a = b7Var;
    }

    /* renamed from: a */
    public final String mo36559a() {
        String e = this.f36619a.mo34673e(C14477k8.RAW_CONFIGURATION_AS_JSON, (String) null);
        f36618c.mo35676e("retrieving last config from preferences");
        if (!C14358g3.m61811e(e)) {
            return e;
        }
        f36618c.mo35676e("last config is null");
        return null;
    }

    /* renamed from: b */
    public void mo36560b(String str) {
        if (!C14358g3.m61811e(str)) {
            this.f36620b = C14466k4.m62296b(str);
            this.f36619a.mo34680l(C14477k8.CONFIGURATION_TIMESTAMP, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
            this.f36619a.mo34681m(C14477k8.RAW_CONFIGURATION_AS_JSON, str);
        }
    }

    /* renamed from: c */
    public C14466k4 mo36561c() {
        return this.f36620b;
    }

    /* renamed from: d */
    public boolean mo36562d() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - this.f36619a.mo34671c(C14477k8.CONFIGURATION_TIMESTAMP, 0) >= this.f36619a.mo34671c(C14477k8.CONFIGURATION_MAX_AGE, 0);
    }

    /* renamed from: e */
    public final C14466k4 mo36563e() {
        String f = mo36564f();
        if (f == null) {
            return null;
        }
        return C14466k4.m62296b(f);
    }

    /* renamed from: f */
    public String mo36564f() {
        String a = mo36559a();
        if (C14358g3.m61811e(a)) {
            f36618c.mo35676e("No configuration saved.");
        }
        f36618c.mo35674c("config is: %s", a);
        return a;
    }
}
