package com.google.android.datatransport.cct.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.datatransport.cct.internal.C40067f;
import com.google.auto.value.C32455c;

@C32455c
/* renamed from: com.google.android.datatransport.cct.internal.k */
public abstract class C40078k {

    @C32455c.C32456a
    /* renamed from: com.google.android.datatransport.cct.internal.k$a */
    public static abstract class C40079a {
        @C0359n0
        /* renamed from: a */
        public abstract C40078k mo132631a();

        @C0359n0
        /* renamed from: b */
        public abstract C40079a mo132632b(@C0363p0 Integer num);

        @C0359n0
        /* renamed from: c */
        public abstract C40079a mo132633c(long j);

        @C0359n0
        /* renamed from: d */
        public abstract C40079a mo132634d(long j);

        @C0359n0
        /* renamed from: e */
        public abstract C40079a mo132635e(@C0363p0 NetworkConnectionInfo networkConnectionInfo);

        @C0359n0
        /* renamed from: f */
        public abstract C40079a mo132636f(@C0363p0 byte[] bArr);

        @C0359n0
        /* renamed from: g */
        public abstract C40079a mo132637g(@C0363p0 String str);

        @C0359n0
        /* renamed from: h */
        public abstract C40079a mo132638h(long j);
    }

    /* renamed from: a */
    public static C40079a m163200a() {
        return new C40067f.C40069b();
    }

    @C0359n0
    /* renamed from: i */
    public static C40079a m163201i(@C0359n0 String str) {
        return m163200a().mo132637g(str);
    }

    @C0359n0
    /* renamed from: j */
    public static C40079a m163202j(@C0359n0 byte[] bArr) {
        return m163200a().mo132636f(bArr);
    }

    @C0363p0
    /* renamed from: b */
    public abstract Integer mo132621b();

    /* renamed from: c */
    public abstract long mo132622c();

    /* renamed from: d */
    public abstract long mo132623d();

    @C0363p0
    /* renamed from: e */
    public abstract NetworkConnectionInfo mo132624e();

    @C0363p0
    /* renamed from: f */
    public abstract byte[] mo132626f();

    @C0363p0
    /* renamed from: g */
    public abstract String mo132627g();

    /* renamed from: h */
    public abstract long mo132628h();
}
