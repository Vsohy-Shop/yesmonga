package com.bumptech.glide.load;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.util.C22633m;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.e */
public final class C22139e<T> {

    /* renamed from: e */
    public static final C22141b<Object> f56855e = new C22140a();

    /* renamed from: a */
    public final T f56856a;

    /* renamed from: b */
    public final C22141b<T> f56857b;

    /* renamed from: c */
    public final String f56858c;

    /* renamed from: d */
    public volatile byte[] f56859d;

    /* renamed from: com.bumptech.glide.load.e$a */
    public class C22140a implements C22141b<Object> {
        /* renamed from: a */
        public void mo65845a(@C0359n0 byte[] bArr, @C0359n0 Object obj, @C0359n0 MessageDigest messageDigest) {
        }
    }

    /* renamed from: com.bumptech.glide.load.e$b */
    public interface C22141b<T> {
        /* renamed from: a */
        void mo65845a(@C0359n0 byte[] bArr, @C0359n0 T t, @C0359n0 MessageDigest messageDigest);
    }

    public C22139e(@C0359n0 String str, @C0363p0 T t, @C0359n0 C22141b<T> bVar) {
        this.f56858c = C22633m.m102622b(str);
        this.f56856a = t;
        this.f56857b = (C22141b) C22633m.m102624d(bVar);
    }

    @C0359n0
    /* renamed from: a */
    public static <T> C22139e<T> m100832a(@C0359n0 String str, @C0359n0 C22141b<T> bVar) {
        return new C22139e<>(str, (Object) null, bVar);
    }

    @C0359n0
    /* renamed from: b */
    public static <T> C22139e<T> m100833b(@C0359n0 String str, @C0363p0 T t, @C0359n0 C22141b<T> bVar) {
        return new C22139e<>(str, t, bVar);
    }

    @C0359n0
    /* renamed from: c */
    public static <T> C22141b<T> m100834c() {
        return f56855e;
    }

    @C0359n0
    /* renamed from: f */
    public static <T> C22139e<T> m100835f(@C0359n0 String str) {
        return new C22139e<>(str, (Object) null, m100834c());
    }

    @C0359n0
    /* renamed from: g */
    public static <T> C22139e<T> m100836g(@C0359n0 String str, @C0359n0 T t) {
        return new C22139e<>(str, t, m100834c());
    }

    @C0363p0
    /* renamed from: d */
    public T mo65839d() {
        return this.f56856a;
    }

    @C0359n0
    /* renamed from: e */
    public final byte[] mo65840e() {
        if (this.f56859d == null) {
            this.f56859d = this.f56858c.getBytes(C22108c.f56791b);
        }
        return this.f56859d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22139e) {
            return this.f56858c.equals(((C22139e) obj).f56858c);
        }
        return false;
    }

    /* renamed from: h */
    public void mo65842h(@C0359n0 T t, @C0359n0 MessageDigest messageDigest) {
        this.f56857b.mo65845a(mo65840e(), t, messageDigest);
    }

    public int hashCode() {
        return this.f56858c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f56858c + '\'' + C12361b.f30259j;
    }
}
