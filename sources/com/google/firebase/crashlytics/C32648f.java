package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.analytics.C32657b;
import java.util.Locale;

/* renamed from: com.google.firebase.crashlytics.f */
public class C32648f implements C32537a.C32539b {

    /* renamed from: c */
    public static final String f79204c = "_o";

    /* renamed from: d */
    public static final String f79205d = "name";

    /* renamed from: e */
    public static final String f79206e = "params";

    /* renamed from: f */
    public static final String f79207f = "clx";

    /* renamed from: a */
    public C32657b f79208a;

    /* renamed from: b */
    public C32657b f79209b;

    /* renamed from: b */
    public static void m131858b(@C0363p0 C32657b bVar, @C0359n0 String str, @C0359n0 Bundle bundle) {
        if (bVar != null) {
            bVar.mo94844U0(str, bundle);
        }
    }

    /* renamed from: a */
    public void mo94656a(int i, @C0363p0 Bundle bundle) {
        String string;
        C32741f.m132248f().mo95060k(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i), bundle}));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle(f79206e);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            mo94812c(string, bundle2);
        }
    }

    /* renamed from: c */
    public final void mo94812c(@C0359n0 String str, @C0359n0 Bundle bundle) {
        C32657b bVar;
        if ("clx".equals(bundle.getString(f79204c))) {
            bVar = this.f79208a;
        } else {
            bVar = this.f79209b;
        }
        m131858b(bVar, str, bundle);
    }

    /* renamed from: d */
    public void mo94813d(@C0363p0 C32657b bVar) {
        this.f79209b = bVar;
    }

    /* renamed from: e */
    public void mo94814e(@C0363p0 C32657b bVar) {
        this.f79208a = bVar;
    }
}
