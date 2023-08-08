package com.google.android.gms.internal.gtm;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.firebase.crashlytics.internal.persistence.C32920e;

/* renamed from: com.google.android.gms.internal.gtm.qe */
public final class C41525qe {

    /* renamed from: a */
    public final String f104901a;
    @C0363p0

    /* renamed from: b */
    public final String f104902b;
    @C0363p0

    /* renamed from: c */
    public final String f104903c;

    /* renamed from: d */
    public final boolean f104904d;
    @C0363p0

    /* renamed from: e */
    public final String f104905e;
    @C0363p0

    /* renamed from: f */
    public final String f104906f = "";

    public C41525qe(String str, String str2, @C0363p0 String str3, boolean z, @C0363p0 String str4, String str5) {
        C40843u.m166202l(str);
        C40843u.m166202l("");
        this.f104901a = str;
        this.f104902b = str2;
        this.f104903c = str3;
        this.f104904d = z;
        this.f104905e = str4;
    }

    /* renamed from: a */
    public final String mo135773a() {
        return this.f104905e;
    }

    /* renamed from: b */
    public final String mo135774b() {
        return this.f104901a;
    }

    /* renamed from: c */
    public final String mo135775c() {
        return this.f104902b;
    }

    /* renamed from: d */
    public final String mo135776d() {
        String str = this.f104903c;
        if (str == null) {
            return this.f104901a;
        }
        String str2 = this.f104901a;
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(C32920e.f79928l);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: e */
    public final String mo135777e() {
        return this.f104906f;
    }

    /* renamed from: f */
    public final String mo135778f() {
        return this.f104903c;
    }

    /* renamed from: g */
    public final boolean mo135779g() {
        return this.f104904d;
    }
}
