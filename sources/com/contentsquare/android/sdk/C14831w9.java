package com.contentsquare.android.sdk;

import android.content.Context;
import androidx.lifecycle.C19441m0;

/* renamed from: com.contentsquare.android.sdk.w9 */
public class C14831w9 {

    /* renamed from: a */
    public static final C14453jf f36774a = new C14453jf();

    /* renamed from: a */
    public static void m63901a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            try {
                if (!C14217b9.m61032b()) {
                    C14549na a = C14549na.m62703a(applicationContext);
                    C14217b9.m61033c(applicationContext, C19441m0.m90725l());
                    a.mo35986g().mo34683o(C14477k8.FORGET_ME, false);
                    return;
                }
                f36774a.mo35679i("Contentsquare SDK is already initialized.", new Object[0]);
            } catch (Exception e) {
                C14453jf jfVar = f36774a;
                jfVar.mo35679i("Something went wrong", new Object[0]);
                jfVar.mo35679i("Contentsquare SDK couldn't be initialized. %s", e);
            }
        } else {
            f36774a.mo35679i("Could not initialize Contentsquare SDK because application context is null.", new Object[0]);
        }
    }
}
