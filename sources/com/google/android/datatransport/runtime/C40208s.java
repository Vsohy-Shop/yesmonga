package com.google.android.datatransport.runtime;

import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.C40085f;
import com.google.android.datatransport.C40086g;
import com.google.android.datatransport.C40087h;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.s */
public final class C40208s implements C40087h {

    /* renamed from: a */
    public final Set<C40041c> f102456a;

    /* renamed from: b */
    public final C40203r f102457b;

    /* renamed from: c */
    public final C40322v f102458c;

    public C40208s(Set<C40041c> set, C40203r rVar, C40322v vVar) {
        this.f102456a = set;
        this.f102457b = rVar;
        this.f102458c = vVar;
    }

    /* renamed from: a */
    public <T> C40086g<T> mo132668a(String str, Class<T> cls, C40085f<T, byte[]> fVar) {
        return mo132669b(str, cls, C40041c.m163048b("proto"), fVar);
    }

    /* renamed from: b */
    public <T> C40086g<T> mo132669b(String str, Class<T> cls, C40041c cVar, C40085f<T, byte[]> fVar) {
        if (this.f102456a.contains(cVar)) {
            return new C40320u(this.f102457b, str, cVar, fVar, this.f102458c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{cVar, this.f102456a}));
    }
}
