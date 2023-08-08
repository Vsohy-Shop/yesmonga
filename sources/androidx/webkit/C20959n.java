package androidx.webkit;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* renamed from: androidx.webkit.n */
public class C20959n {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: e */
    public static final int f54056e = 0;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: f */
    public static final int f54057f = 1;
    @C0363p0

    /* renamed from: a */
    public final C20961o[] f54058a;
    @C0363p0

    /* renamed from: b */
    public final String f54059b;
    @C0363p0

    /* renamed from: c */
    public final byte[] f54060c;

    /* renamed from: d */
    public final int f54061d;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.webkit.n$a */
    public @interface C20960a {
    }

    public C20959n(@C0363p0 String str) {
        this(str, (C20961o[]) null);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public byte[] mo62725a() {
        return this.f54060c;
    }

    @C0363p0
    /* renamed from: b */
    public String mo62726b() {
        return this.f54059b;
    }

    @C0363p0
    /* renamed from: c */
    public C20961o[] mo62727c() {
        return this.f54058a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public int mo62728d() {
        return this.f54061d;
    }

    public C20959n(@C0363p0 String str, @C0363p0 C20961o[] oVarArr) {
        this.f54059b = str;
        this.f54060c = null;
        this.f54058a = oVarArr;
        this.f54061d = 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C20959n(@C0359n0 byte[] bArr) {
        this(bArr, (C20961o[]) null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C20959n(@C0359n0 byte[] bArr, @C0363p0 C20961o[] oVarArr) {
        Objects.requireNonNull(bArr);
        this.f54060c = bArr;
        this.f54059b = null;
        this.f54058a = oVarArr;
        this.f54061d = 1;
    }
}
