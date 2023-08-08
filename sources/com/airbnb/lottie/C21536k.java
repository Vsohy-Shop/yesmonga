package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: com.airbnb.lottie.k */
public class C21536k {

    /* renamed from: a */
    public final int f55559a;

    /* renamed from: b */
    public final int f55560b;

    /* renamed from: c */
    public final String f55561c;

    /* renamed from: d */
    public final String f55562d;

    /* renamed from: e */
    public final String f55563e;
    @C0363p0

    /* renamed from: f */
    public Bitmap f55564f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C21536k(int i, int i2, String str, String str2, String str3) {
        this.f55559a = i;
        this.f55560b = i2;
        this.f55561c = str;
        this.f55562d = str2;
        this.f55563e = str3;
    }

    @C0363p0
    /* renamed from: a */
    public Bitmap mo64270a() {
        return this.f55564f;
    }

    /* renamed from: b */
    public String mo64271b() {
        return this.f55563e;
    }

    /* renamed from: c */
    public String mo64272c() {
        return this.f55562d;
    }

    /* renamed from: d */
    public int mo64273d() {
        return this.f55560b;
    }

    /* renamed from: e */
    public String mo64274e() {
        return this.f55561c;
    }

    /* renamed from: f */
    public int mo64275f() {
        return this.f55559a;
    }

    /* renamed from: g */
    public boolean mo64276g() {
        return this.f55564f != null || (this.f55562d.startsWith("data:") && this.f55562d.indexOf("base64,") > 0);
    }

    /* renamed from: h */
    public void mo64277h(@C0363p0 Bitmap bitmap) {
        this.f55564f = bitmap;
    }
}
