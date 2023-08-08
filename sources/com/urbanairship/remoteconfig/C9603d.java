package com.urbanairship.remoteconfig;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.remoteconfig.d */
public class C9603d implements C9333e {

    /* renamed from: g */
    public static final String f26274g = "remote_data_url";

    /* renamed from: v */
    public static final String f26275v = "device_api_url";

    /* renamed from: w */
    public static final String f26276w = "wallet_url";

    /* renamed from: x */
    public static final String f26277x = "analytics_url";

    /* renamed from: y */
    public static final String f26278y = "chat_url";

    /* renamed from: z */
    public static final String f26279z = "chat_socket_url";

    /* renamed from: a */
    public final String f26280a;

    /* renamed from: b */
    public final String f26281b;

    /* renamed from: c */
    public final String f26282c;

    /* renamed from: d */
    public final String f26283d;

    /* renamed from: e */
    public final String f26284e;

    /* renamed from: f */
    public final String f26285f;

    @C0344h1
    public C9603d(@C0363p0 String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 String str4, @C0363p0 String str5, @C0363p0 String str6) {
        this.f26280a = str;
        this.f26281b = str2;
        this.f26282c = str3;
        this.f26283d = str4;
        this.f26284e = str5;
        this.f26285f = str6;
    }

    @C0359n0
    /* renamed from: a */
    public static C9603d m35971a(@C0359n0 JsonValue jsonValue) {
        C9323b A = jsonValue.mo18749A();
        return new C9603d(A.mo18801A(f26274g).mo18769l(), A.mo18801A(f26275v).mo18769l(), A.mo18801A(f26276w).mo18769l(), A.mo18801A(f26277x).mo18769l(), A.mo18801A(f26278y).mo18769l(), A.mo18801A(f26279z).mo18769l());
    }

    @C0363p0
    /* renamed from: b */
    public String mo19523b() {
        return this.f26283d;
    }

    @C0363p0
    /* renamed from: c */
    public String mo19524c() {
        return this.f26285f;
    }

    @C0363p0
    /* renamed from: d */
    public String mo19525d() {
        return this.f26284e;
    }

    @C0363p0
    /* renamed from: e */
    public String mo19526e() {
        return this.f26281b;
    }

    @C0363p0
    /* renamed from: f */
    public String mo19527f() {
        return this.f26280a;
    }

    @C0363p0
    /* renamed from: g */
    public String mo19528g() {
        return this.f26282c;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g(f26274g, this.f26280a).mo18823g(f26275v, this.f26281b).mo18823g(f26277x, this.f26283d).mo18823g(f26276w, this.f26282c).mo18823g(f26278y, this.f26284e).mo18823g(f26279z, this.f26285f).mo18817a().mo17264q();
    }
}
