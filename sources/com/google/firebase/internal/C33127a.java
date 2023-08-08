package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.C0344h1;
import androidx.core.content.C17318d;
import com.google.firebase.C32566c;
import com.google.firebase.events.C33029a;
import com.google.firebase.events.C33031c;

/* renamed from: com.google.firebase.internal.a */
public class C33127a {

    /* renamed from: e */
    public static final String f80360e = "com.google.firebase.common.prefs:";
    @C0344h1

    /* renamed from: f */
    public static final String f80361f = "firebase_data_collection_default_enabled";

    /* renamed from: a */
    public final Context f80362a;

    /* renamed from: b */
    public final SharedPreferences f80363b;

    /* renamed from: c */
    public final C33031c f80364c;

    /* renamed from: d */
    public boolean f80365d = mo95914c();

    public C33127a(Context context, String str, C33031c cVar) {
        Context a = m133628a(context);
        this.f80362a = a;
        this.f80363b = a.getSharedPreferences(f80360e + str, 0);
        this.f80364c = cVar;
    }

    /* renamed from: a */
    public static Context m133628a(Context context) {
        return C17318d.m79719b(context);
    }

    /* renamed from: b */
    public synchronized boolean mo95913b() {
        return this.f80365d;
    }

    /* renamed from: c */
    public final boolean mo95914c() {
        if (this.f80363b.contains(f80361f)) {
            return this.f80363b.getBoolean(f80361f, true);
        }
        return mo95915d();
    }

    /* renamed from: d */
    public final boolean mo95915d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f80362a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f80362a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(f80361f)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(f80361f);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: e */
    public synchronized void mo95916e(Boolean bool) {
        if (bool == null) {
            this.f80363b.edit().remove(f80361f).apply();
            mo95917f(mo95915d());
        } else {
            boolean equals = Boolean.TRUE.equals(bool);
            this.f80363b.edit().putBoolean(f80361f, equals).apply();
            mo95917f(equals);
        }
    }

    /* renamed from: f */
    public final synchronized void mo95917f(boolean z) {
        if (this.f80365d != z) {
            this.f80365d = z;
            this.f80364c.mo94713c(new C33029a(C32566c.class, new C32566c(z)));
        }
    }
}
