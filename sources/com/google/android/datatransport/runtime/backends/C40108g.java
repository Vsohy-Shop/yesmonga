package com.google.android.datatransport.runtime.backends;

import androidx.annotation.C0363p0;
import com.google.android.datatransport.runtime.C40190j;
import com.google.android.datatransport.runtime.backends.C40100a;
import com.google.auto.value.C32455c;

@C32455c
/* renamed from: com.google.android.datatransport.runtime.backends.g */
public abstract class C40108g {

    @C32455c.C32456a
    /* renamed from: com.google.android.datatransport.runtime.backends.g$a */
    public static abstract class C40109a {
        /* renamed from: a */
        public abstract C40108g mo132702a();

        /* renamed from: b */
        public abstract C40109a mo132703b(Iterable<C40190j> iterable);

        /* renamed from: c */
        public abstract C40109a mo132704c(@C0363p0 byte[] bArr);
    }

    /* renamed from: a */
    public static C40109a m163300a() {
        return new C40100a.C40102b();
    }

    /* renamed from: b */
    public static C40108g m163301b(Iterable<C40190j> iterable) {
        return m163300a().mo132703b(iterable).mo132702a();
    }

    /* renamed from: c */
    public abstract Iterable<C40190j> mo132697c();

    @C0363p0
    /* renamed from: d */
    public abstract byte[] mo132698d();
}
