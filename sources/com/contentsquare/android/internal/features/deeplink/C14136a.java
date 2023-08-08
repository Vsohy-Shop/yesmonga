package com.contentsquare.android.internal.features.deeplink;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.contentsquare.android.sdk.C14453jf;
import com.contentsquare.android.sdk.C14466k4;
import com.contentsquare.android.sdk.C14586o8;
import com.contentsquare.android.sdk.C14771u6;
import com.google.firebase.crashlytics.internal.metadata.C32748d;

/* renamed from: com.contentsquare.android.internal.features.deeplink.a */
public class C14136a {

    /* renamed from: e */
    public static final C14453jf f34970e = new C14453jf();

    /* renamed from: a */
    public final C14137a f34971a;

    /* renamed from: b */
    public final Context f34972b;

    /* renamed from: c */
    public final C14771u6 f34973c;

    /* renamed from: d */
    public final C14586o8 f34974d;

    /* renamed from: com.contentsquare.android.internal.features.deeplink.a$a */
    public interface C14137a {
        /* renamed from: a */
        void mo34414a();
    }

    public C14136a(Context context, C14137a aVar, C14771u6 u6Var, C14586o8 o8Var) {
        this.f34972b = context.getApplicationContext();
        this.f34971a = aVar;
        this.f34973c = u6Var;
        this.f34974d = o8Var;
    }

    /* renamed from: a */
    public final void mo34415a(Uri uri) {
        String queryParameter = uri.getQueryParameter("activationKey");
        String queryParameter2 = uri.getQueryParameter(C32748d.f79502c);
        String queryParameter3 = uri.getQueryParameter("configure");
        if (queryParameter != null && queryParameter2 != null) {
            this.f34974d.mo36047c(queryParameter2);
            if (queryParameter3 != null) {
                mo34417c(queryParameter, queryParameter2, queryParameter3);
            } else {
                mo34416b(queryParameter, queryParameter2);
            }
        }
    }

    /* renamed from: b */
    public final void mo34416b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && mo34418d(str)) {
            this.f34971a.mo34414a();
        }
    }

    /* renamed from: c */
    public final void mo34417c(String str, String str2, String str3) {
        if (str.equals("weballwin") && str2.equals("iamjenkins")) {
            this.f34974d.mo36045a(str3);
        }
    }

    /* renamed from: d */
    public final boolean mo34418d(String str) {
        C14466k4 c = this.f34973c.mo36561c();
        if (c == null) {
            return false;
        }
        C14466k4.C14470d f = c.mo35711e().mo35728f();
        String b = f.mo35721b();
        if (!TextUtils.isEmpty(b) && b.equals(str)) {
            if (f.mo35722c()) {
                return true;
            }
            f34970e.mo35679i("Contentsquare in-app features is disabled in the project configuration", new Object[0]);
        }
        return false;
    }

    /* renamed from: e */
    public void mo34419e(Uri uri) {
        if ("cs-".concat(this.f34972b.getPackageName()).equals(uri.getScheme())) {
            mo34415a(uri);
        }
    }
}
