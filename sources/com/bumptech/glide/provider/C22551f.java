package com.bumptech.glide.provider;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22279h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.provider.f */
public class C22551f {

    /* renamed from: a */
    public final List<C22552a<?>> f57772a = new ArrayList();

    /* renamed from: com.bumptech.glide.provider.f$a */
    public static final class C22552a<T> {

        /* renamed from: a */
        public final Class<T> f57773a;

        /* renamed from: b */
        public final C22279h<T> f57774b;

        public C22552a(@C0359n0 Class<T> cls, @C0359n0 C22279h<T> hVar) {
            this.f57773a = cls;
            this.f57774b = hVar;
        }

        /* renamed from: a */
        public boolean mo66693a(@C0359n0 Class<?> cls) {
            return this.f57773a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo66690a(@C0359n0 Class<Z> cls, @C0359n0 C22279h<Z> hVar) {
        this.f57772a.add(new C22552a(cls, hVar));
    }

    @C0363p0
    /* renamed from: b */
    public synchronized <Z> C22279h<Z> mo66691b(@C0359n0 Class<Z> cls) {
        int size = this.f57772a.size();
        for (int i = 0; i < size; i++) {
            C22552a aVar = this.f57772a.get(i);
            if (aVar.mo66693a(cls)) {
                return aVar.f57774b;
            }
        }
        return null;
    }

    /* renamed from: c */
    public synchronized <Z> void mo66692c(@C0359n0 Class<Z> cls, @C0359n0 C22279h<Z> hVar) {
        this.f57772a.add(0, new C22552a(cls, hVar));
    }
}
