package com.bumptech.glide;

import androidx.annotation.C0363p0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.e */
public class C22059e {

    /* renamed from: a */
    public final Map<Class<?>, C22061b> f56620a;

    /* renamed from: com.bumptech.glide.e$a */
    public static final class C22060a {

        /* renamed from: a */
        public final Map<Class<?>, C22061b> f56621a = new HashMap();

        /* renamed from: b */
        public C22060a mo65572b(C22061b bVar) {
            this.f56621a.put(bVar.getClass(), bVar);
            return this;
        }

        /* renamed from: c */
        public C22059e mo65573c() {
            return new C22059e(this);
        }

        /* renamed from: d */
        public C22060a mo65574d(C22061b bVar, boolean z) {
            if (z) {
                mo65572b(bVar);
            } else {
                this.f56621a.remove(bVar.getClass());
            }
            return this;
        }
    }

    /* renamed from: com.bumptech.glide.e$b */
    public interface C22061b {
    }

    public C22059e(C22060a aVar) {
        this.f56620a = Collections.unmodifiableMap(new HashMap(aVar.f56621a));
    }

    @C0363p0
    /* renamed from: a */
    public <T extends C22061b> T mo65570a(Class<T> cls) {
        return (C22061b) this.f56620a.get(cls);
    }

    /* renamed from: b */
    public boolean mo65571b(Class<? extends C22061b> cls) {
        return this.f56620a.containsKey(cls);
    }
}
