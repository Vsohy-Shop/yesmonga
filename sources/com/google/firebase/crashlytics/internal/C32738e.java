package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.firebase.crashlytics.internal.e */
public class C32738e {

    /* renamed from: c */
    public static final String f79480c = "Unity";

    /* renamed from: d */
    public static final String f79481d = "Flutter";

    /* renamed from: e */
    public static final String f79482e = "com.google.firebase.crashlytics.unity_version";

    /* renamed from: f */
    public static final String f79483f = "flutter_assets/NOTICES.Z";

    /* renamed from: a */
    public final Context f79484a;
    @C0363p0

    /* renamed from: b */
    public C32740b f79485b = null;

    /* renamed from: com.google.firebase.crashlytics.internal.e$b */
    public class C32740b {
        @C0363p0

        /* renamed from: a */
        public final String f79486a;
        @C0363p0

        /* renamed from: b */
        public final String f79487b;

        public C32740b() {
            int s = CommonUtils.m131937s(C32738e.this.f79484a, C32738e.f79482e, C16717v.C16719b.f42182e);
            if (s != 0) {
                this.f79486a = C32738e.f79480c;
                String string = C32738e.this.f79484a.getResources().getString(s);
                this.f79487b = string;
                C32741f f = C32741f.m132248f();
                f.mo95060k("Unity Editor version is: " + string);
            } else if (C32738e.this.mo95047c(C32738e.f79483f)) {
                this.f79486a = C32738e.f79481d;
                this.f79487b = null;
                C32741f.m132248f().mo95060k("Development platform is: Flutter");
            } else {
                this.f79486a = null;
                this.f79487b = null;
            }
        }
    }

    public C32738e(Context context) {
        this.f79484a = context;
    }

    /* renamed from: g */
    public static boolean m132241g(Context context) {
        if (CommonUtils.m131937s(context, f79482e, C16717v.C16719b.f42182e) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo95047c(String str) {
        if (this.f79484a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f79484a.getAssets().open(str);
            if (open == null) {
                return true;
            }
            open.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @C0363p0
    /* renamed from: d */
    public String mo95048d() {
        return mo95050f().f79486a;
    }

    @C0363p0
    /* renamed from: e */
    public String mo95049e() {
        return mo95050f().f79487b;
    }

    /* renamed from: f */
    public final C32740b mo95050f() {
        if (this.f79485b == null) {
            this.f79485b = new C32740b();
        }
        return this.f79485b;
    }
}
