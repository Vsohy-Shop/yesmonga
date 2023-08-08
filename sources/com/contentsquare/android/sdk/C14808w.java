package com.contentsquare.android.sdk;

import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentManager;

/* renamed from: com.contentsquare.android.sdk.w */
public class C14808w {

    /* renamed from: a */
    public final C14453jf f36706a = new C14453jf("FragmentLifecycleCallbackRule");

    /* renamed from: a */
    public final void mo36654a(FragmentManager fragmentManager) {
        fragmentManager.getClass().getMethod("registerFragmentLifecycleCallbacks", new Class[]{FragmentManager.C19180m.class, Boolean.TYPE});
    }

    /* renamed from: b */
    public final void mo36655b(String str) {
        Class.forName(str);
    }

    /* renamed from: c */
    public boolean mo36656c(C19232h hVar) {
        try {
            mo36655b("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks");
            mo36654a(hVar.mo57175g0());
            return true;
        } catch (ClassNotFoundException e) {
            this.f36706a.mo35681l("Could not attach to Activity due to wrong Support API version.", e);
            return false;
        } catch (NoSuchMethodException e2) {
            this.f36706a.mo35681l("Could not attach to Activity due to wrong Support API version.", e2);
            return false;
        }
    }
}
