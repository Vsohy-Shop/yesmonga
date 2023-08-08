package com.contentsquare.android.sdk;

import android.app.Application;

/* renamed from: com.contentsquare.android.sdk.o8 */
public class C14586o8 {

    /* renamed from: a */
    public final C14213b7 f36070a;

    /* renamed from: b */
    public final C14705sb f36071b;

    /* renamed from: c */
    public Application f36072c;

    /* renamed from: d */
    public final C14453jf f36073d = new C14453jf();

    public C14586o8(C14213b7 b7Var, C14705sb sbVar, Application application) {
        this.f36070a = b7Var;
        this.f36071b = sbVar;
        this.f36072c = application;
    }

    /* renamed from: a */
    public void mo36045a(String str) {
        this.f36073d.mo35679i("ConfigureFromDeepLink, configuration in progress...", new Object[0]);
        for (String split : str.split(",")) {
            String[] split2 = split.split("=");
            if ("optout_data_collection".equals(split2[0])) {
                mo36046b(split2);
            } else {
                mo36048d(split2);
            }
        }
        this.f36073d.mo35679i("ConfigureFromDeepLink, configuration done.", new Object[0]);
    }

    /* renamed from: b */
    public final void mo36046b(String[] strArr) {
        String str = strArr[1];
        this.f36073d.mo35679i("ConfigureFromDeepLink, AppPrefs, value = %s", str);
        if (C14358g3.m61809c(str)) {
            this.f36071b.mo36003k("optout_data_collection", Boolean.parseBoolean(str));
            C14600oe.m62881b(this.f36072c).mo36120o().mo34402a();
        }
    }

    /* renamed from: c */
    public void mo36047c(String str) {
        this.f36070a.mo34681m(C14477k8.INAPP_USER_ID, str);
    }

    /* renamed from: d */
    public final void mo36048d(String[] strArr) {
        C14477k8 valueOf = C14477k8.valueOf(strArr[0]);
        String str = strArr[1];
        this.f36073d.mo35679i("ConfigureFromDeepLink, key = %s, value = %s", valueOf.toString(), str);
        if (C14358g3.m61809c(str)) {
            this.f36070a.mo34683o(valueOf, Boolean.parseBoolean(str));
        } else if (C14358g3.m61810d(str)) {
            this.f36070a.mo34679k(valueOf, Integer.parseInt(str));
        } else {
            this.f36070a.mo34681m(valueOf, str);
        }
    }
}
