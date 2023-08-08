package com.contentsquare.android.sdk;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C19499w;
import com.contentsquare.android.C14146m;
import com.contentsquare.android.sdk.C14750tc;

/* renamed from: com.contentsquare.android.sdk.b9 */
public class C14217b9 {

    /* renamed from: a */
    public static C14453jf f35125a = new C14453jf("SingletonProvider");

    /* renamed from: a */
    public static void m61031a(Application application) {
        C14538n0 c = C14538n0.m62672c();
        if (c == null) {
            synchronized (C14146m.class) {
                if (C14538n0.m62672c() == null) {
                    f35125a.mo35676e("Initializing the Runtime...");
                    C14538n0 a = C14538n0.m62671a(application);
                    m61034d(application);
                    C14600oe.m62881b(application).mo36120o().mo35291d(application.getPackageName(), a.mo35955d());
                    C14750tc.m63580d(application, new C14750tc.C14751a());
                } else {
                    f35125a.mo35676e("SDK was already initialized, skipping call.");
                }
            }
            return;
        }
        String g = c.mo35956e().mo36389g();
        f35125a.mo35676e("SDK was already initialized, skipping call.");
        f35125a.mo35679i("Starting with user ID: %s", g);
    }

    /* renamed from: b */
    public static boolean m61032b() {
        return C14538n0.m62672c() != null;
    }

    /* renamed from: c */
    public static boolean m61033c(Context context, C19499w wVar) {
        if (m61032b()) {
            return false;
        }
        Application application = (Application) context.getApplicationContext();
        C14600oe.m62881b(application);
        m61031a(application);
        C14737t5.m63529a(application, wVar);
        C14549na.m62703a(application).mo35988i().mo34904a();
        return true;
    }

    /* renamed from: d */
    public static void m61034d(Application application) {
        C14453jf.m62246k("Contentsquare SDK %s starting in app: %s t: %d", "4.14.0", application.getPackageName(), 1667475339590L);
    }
}
