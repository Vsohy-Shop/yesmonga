package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.util.C22633m;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.model.g */
public class C22309g implements C22108c {

    /* renamed from: j */
    public static final String f57309j = "@#&=*+-_.,:!?()/~'%;$";

    /* renamed from: c */
    public final C22310h f57310c;
    @C0363p0

    /* renamed from: d */
    public final URL f57311d;
    @C0363p0

    /* renamed from: e */
    public final String f57312e;
    @C0363p0

    /* renamed from: f */
    public String f57313f;
    @C0363p0

    /* renamed from: g */
    public URL f57314g;
    @C0363p0

    /* renamed from: h */
    public volatile byte[] f57315h;

    /* renamed from: i */
    public int f57316i;

    public C22309g(URL url) {
        this(url, C22310h.f57318b);
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        messageDigest.update(mo66270d());
    }

    /* renamed from: c */
    public String mo66269c() {
        String str = this.f57312e;
        return str != null ? str : ((URL) C22633m.m102624d(this.f57311d)).toString();
    }

    /* renamed from: d */
    public final byte[] mo66270d() {
        if (this.f57315h == null) {
            this.f57315h = mo66269c().getBytes(C22108c.f56791b);
        }
        return this.f57315h;
    }

    /* renamed from: e */
    public Map<String, String> mo66271e() {
        return this.f57310c.getHeaders();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22309g)) {
            return false;
        }
        C22309g gVar = (C22309g) obj;
        if (!mo66269c().equals(gVar.mo66269c()) || !this.f57310c.equals(gVar.f57310c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo66272f() {
        if (TextUtils.isEmpty(this.f57313f)) {
            String str = this.f57312e;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C22633m.m102624d(this.f57311d)).toString();
            }
            this.f57313f = Uri.encode(str, f57309j);
        }
        return this.f57313f;
    }

    /* renamed from: g */
    public final URL mo66273g() throws MalformedURLException {
        if (this.f57314g == null) {
            this.f57314g = new URL(mo66272f());
        }
        return this.f57314g;
    }

    /* renamed from: h */
    public String mo66274h() {
        return mo66272f();
    }

    public int hashCode() {
        if (this.f57316i == 0) {
            int hashCode = mo66269c().hashCode();
            this.f57316i = hashCode;
            this.f57316i = (hashCode * 31) + this.f57310c.hashCode();
        }
        return this.f57316i;
    }

    /* renamed from: i */
    public URL mo66275i() throws MalformedURLException {
        return mo66273g();
    }

    public String toString() {
        return mo66269c();
    }

    public C22309g(String str) {
        this(str, C22310h.f57318b);
    }

    public C22309g(URL url, C22310h hVar) {
        this.f57311d = (URL) C22633m.m102624d(url);
        this.f57312e = null;
        this.f57310c = (C22310h) C22633m.m102624d(hVar);
    }

    public C22309g(String str, C22310h hVar) {
        this.f57311d = null;
        this.f57312e = C22633m.m102622b(str);
        this.f57310c = (C22310h) C22633m.m102624d(hVar);
    }
}
