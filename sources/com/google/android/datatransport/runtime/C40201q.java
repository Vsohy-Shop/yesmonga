package com.google.android.datatransport.runtime;

import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.C40083d;
import com.google.android.datatransport.C40085f;
import com.google.android.datatransport.runtime.C40117c;
import com.google.auto.value.C32455c;

@C32455c
/* renamed from: com.google.android.datatransport.runtime.q */
public abstract class C40201q {

    @C32455c.C32456a
    /* renamed from: com.google.android.datatransport.runtime.q$a */
    public static abstract class C40202a {
        /* renamed from: a */
        public abstract C40201q mo132731a();

        /* renamed from: b */
        public abstract C40202a mo132732b(C40041c cVar);

        /* renamed from: c */
        public abstract C40202a mo132733c(C40083d<?> dVar);

        /* renamed from: d */
        public <T> C40202a mo132849d(C40083d<T> dVar, C40041c cVar, C40085f<T, byte[]> fVar) {
            mo132733c(dVar);
            mo132732b(cVar);
            mo132734e(fVar);
            return this;
        }

        /* renamed from: e */
        public abstract C40202a mo132734e(C40085f<?, byte[]> fVar);

        /* renamed from: f */
        public abstract C40202a mo132735f(C40203r rVar);

        /* renamed from: g */
        public abstract C40202a mo132736g(String str);
    }

    /* renamed from: a */
    public static C40202a m163504a() {
        return new C40117c.C40119b();
    }

    /* renamed from: b */
    public abstract C40041c mo132723b();

    /* renamed from: c */
    public abstract C40083d<?> mo132724c();

    /* renamed from: d */
    public byte[] mo132848d() {
        return mo132725e().apply(mo132724c().mo132544b());
    }

    /* renamed from: e */
    public abstract C40085f<?, byte[]> mo132725e();

    /* renamed from: f */
    public abstract C40203r mo132727f();

    /* renamed from: g */
    public abstract String mo132728g();
}
