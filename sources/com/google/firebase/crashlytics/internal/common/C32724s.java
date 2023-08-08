package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.C0363p0;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.firebase.C33033f;
import com.google.firebase.crashlytics.internal.C32741f;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.crashlytics.internal.common.s */
public class C32724s {

    /* renamed from: i */
    public static final String f79440i = "firebase_crashlytics_collection_enabled";

    /* renamed from: a */
    public final SharedPreferences f79441a;

    /* renamed from: b */
    public final C33033f f79442b;

    /* renamed from: c */
    public final Object f79443c;

    /* renamed from: d */
    public C31049l<Void> f79444d = new C31049l<>();

    /* renamed from: e */
    public boolean f79445e = false;

    /* renamed from: f */
    public boolean f79446f = false;
    @C0363p0

    /* renamed from: g */
    public Boolean f79447g;

    /* renamed from: h */
    public final C31049l<Void> f79448h = new C31049l<>();

    public C32724s(C33033f fVar) {
        Object obj = new Object();
        this.f79443c = obj;
        Context n = fVar.mo95721n();
        this.f79442b = fVar;
        this.f79441a = CommonUtils.m131938t(n);
        Boolean b = mo95020b();
        this.f79447g = b == null ? mo95019a(n) : b;
        synchronized (obj) {
            if (mo95022d()) {
                this.f79444d.mo87745e(null);
                this.f79445e = true;
            }
        }
    }

    @C0363p0
    /* renamed from: f */
    public static Boolean m132181f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(f79440i)) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean(f79440i));
        } catch (PackageManager.NameNotFoundException e) {
            C32741f.m132248f().mo95055e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: h */
    public static void m132182h(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean(f79440i, bool.booleanValue());
        } else {
            edit.remove(f79440i);
        }
        edit.apply();
    }

    @C0363p0
    /* renamed from: a */
    public final Boolean mo95019a(Context context) {
        Boolean f = m132181f(context);
        if (f == null) {
            this.f79446f = false;
            return null;
        }
        this.f79446f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f));
    }

    @C0363p0
    /* renamed from: b */
    public final Boolean mo95020b() {
        if (!this.f79441a.contains(f79440i)) {
            return null;
        }
        this.f79446f = false;
        return Boolean.valueOf(this.f79441a.getBoolean(f79440i, true));
    }

    /* renamed from: c */
    public void mo95021c(boolean z) {
        if (z) {
            this.f79448h.mo87745e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean mo95022d() {
        boolean z;
        Boolean bool = this.f79447g;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.f79442b.mo95705A();
        }
        mo95023e(z);
        return z;
    }

    /* renamed from: e */
    public final void mo95023e(boolean z) {
        String str;
        String str2;
        if (z) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f79447g == null) {
            str2 = "global Firebase setting";
        } else if (this.f79446f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        C32741f.m132248f().mo95052b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{str, str2}));
    }

    /* renamed from: g */
    public synchronized void mo95024g(@C0363p0 Boolean bool) {
        Boolean bool2;
        if (bool != null) {
            try {
                this.f79446f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            bool2 = bool;
        } else {
            bool2 = mo95019a(this.f79442b.mo95721n());
        }
        this.f79447g = bool2;
        m132182h(this.f79441a, bool);
        synchronized (this.f79443c) {
            if (mo95022d()) {
                if (!this.f79445e) {
                    this.f79444d.mo87745e(null);
                    this.f79445e = true;
                }
            } else if (this.f79445e) {
                this.f79444d = new C31049l<>();
                this.f79445e = false;
            }
        }
    }

    /* renamed from: i */
    public C31047k<Void> mo95025i() {
        C31047k<Void> a;
        synchronized (this.f79443c) {
            a = this.f79444d.mo87741a();
        }
        return a;
    }

    /* renamed from: j */
    public C31047k<Void> mo95026j(Executor executor) {
        return C32720q0.m132177k(executor, this.f79448h.mo87741a(), mo95025i());
    }
}
