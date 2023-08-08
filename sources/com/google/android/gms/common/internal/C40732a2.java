package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.common.internal.a2 */
public final class C40732a2 {

    /* renamed from: f */
    public static final Uri f103781f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    @C0363p0

    /* renamed from: a */
    public final String f103782a;
    @C0363p0

    /* renamed from: b */
    public final String f103783b;
    @C0363p0

    /* renamed from: c */
    public final ComponentName f103784c;

    /* renamed from: d */
    public final int f103785d;

    /* renamed from: e */
    public final boolean f103786e;

    public C40732a2(ComponentName componentName, int i) {
        this.f103782a = null;
        this.f103783b = null;
        C40843u.m166202l(componentName);
        this.f103784c = componentName;
        this.f103785d = i;
        this.f103786e = false;
    }

    /* renamed from: a */
    public final int mo134300a() {
        return this.f103785d;
    }

    @C0363p0
    /* renamed from: b */
    public final ComponentName mo134301b() {
        return this.f103784c;
    }

    /* renamed from: c */
    public final Intent mo134302c(Context context) {
        Bundle bundle;
        if (this.f103782a == null) {
            return new Intent().setComponent(this.f103784c);
        }
        Intent intent = null;
        if (this.f103786e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f103782a);
            try {
                bundle = context.getContentResolver().call(f103781f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f103782a));
            }
        }
        if (intent != null) {
            return intent;
        }
        return new Intent(this.f103782a).setPackage(this.f103783b);
    }

    @C0363p0
    /* renamed from: d */
    public final String mo134303d() {
        return this.f103783b;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40732a2)) {
            return false;
        }
        C40732a2 a2Var = (C40732a2) obj;
        if (!C40808s.m166010b(this.f103782a, a2Var.f103782a) || !C40808s.m166010b(this.f103783b, a2Var.f103783b) || !C40808s.m166010b(this.f103784c, a2Var.f103784c) || this.f103785d != a2Var.f103785d || this.f103786e != a2Var.f103786e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C40808s.m166011c(this.f103782a, this.f103783b, this.f103784c, Integer.valueOf(this.f103785d), Boolean.valueOf(this.f103786e));
    }

    public final String toString() {
        String str = this.f103782a;
        if (str != null) {
            return str;
        }
        C40843u.m166202l(this.f103784c);
        return this.f103784c.flattenToString();
    }

    public C40732a2(String str, int i, boolean z) {
        this(str, "com.google.android.gms", i, false);
    }

    public C40732a2(String str, String str2, int i, boolean z) {
        C40843u.m166198h(str);
        this.f103782a = str;
        C40843u.m166198h(str2);
        this.f103783b = str2;
        this.f103784c = null;
        this.f103785d = i;
        this.f103786e = z;
    }
}
