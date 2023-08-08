package com.bumptech.glide.provider;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22098a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.provider.a */
public class C22544a {

    /* renamed from: a */
    public final List<C22545a<?>> f57758a = new ArrayList();

    /* renamed from: com.bumptech.glide.provider.a$a */
    public static final class C22545a<T> {

        /* renamed from: a */
        public final Class<T> f57759a;

        /* renamed from: b */
        public final C22098a<T> f57760b;

        public C22545a(@C0359n0 Class<T> cls, @C0359n0 C22098a<T> aVar) {
            this.f57759a = cls;
            this.f57760b = aVar;
        }

        /* renamed from: a */
        public boolean mo66673a(@C0359n0 Class<?> cls) {
            return this.f57759a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void mo66670a(@C0359n0 Class<T> cls, @C0359n0 C22098a<T> aVar) {
        this.f57758a.add(new C22545a(cls, aVar));
    }

    @C0363p0
    /* renamed from: b */
    public synchronized <T> C22098a<T> mo66671b(@C0359n0 Class<T> cls) {
        for (C22545a next : this.f57758a) {
            if (next.mo66673a(cls)) {
                return next.f57760b;
            }
        }
        return null;
    }

    /* renamed from: c */
    public synchronized <T> void mo66672c(@C0359n0 Class<T> cls, @C0359n0 C22098a<T> aVar) {
        this.f57758a.add(0, new C22545a(cls, aVar));
    }
}
