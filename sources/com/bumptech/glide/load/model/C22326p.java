package com.bumptech.glide.load.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17997q;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.model.p */
public class C22326p {

    /* renamed from: a */
    public final C22331r f57343a;

    /* renamed from: b */
    public final C22327a f57344b;

    /* renamed from: com.bumptech.glide.load.model.p$a */
    public static class C22327a {

        /* renamed from: a */
        public final Map<Class<?>, C22328a<?>> f57345a = new HashMap();

        /* renamed from: com.bumptech.glide.load.model.p$a$a */
        public static class C22328a<Model> {

            /* renamed from: a */
            public final List<C22323n<Model, ?>> f57346a;

            public C22328a(List<C22323n<Model, ?>> list) {
                this.f57346a = list;
            }
        }

        /* renamed from: a */
        public void mo66315a() {
            this.f57345a.clear();
        }

        @C0363p0
        /* renamed from: b */
        public <Model> List<C22323n<Model, ?>> mo66316b(Class<Model> cls) {
            C22328a aVar = this.f57345a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f57346a;
        }

        /* renamed from: c */
        public <Model> void mo66317c(Class<Model> cls, List<C22323n<Model, ?>> list) {
            if (this.f57345a.put(cls, new C22328a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public C22326p(@C0359n0 C17997q.C17998a<List<Throwable>> aVar) {
        this(new C22331r(aVar));
    }

    @C0359n0
    /* renamed from: c */
    public static <A> Class<A> m101475c(@C0359n0 A a) {
        return a.getClass();
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo66306a(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2, @C0359n0 C22325o<? extends Model, ? extends Data> oVar) {
        this.f57343a.mo66321b(cls, cls2, oVar);
        this.f57344b.mo66315a();
    }

    /* renamed from: b */
    public synchronized <Model, Data> C22323n<Model, Data> mo66307b(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2) {
        return this.f57343a.mo66323d(cls, cls2);
    }

    @C0359n0
    /* renamed from: d */
    public synchronized List<Class<?>> mo66308d(@C0359n0 Class<?> cls) {
        return this.f57343a.mo66325g(cls);
    }

    @C0359n0
    /* renamed from: e */
    public <A> List<C22323n<A, ?>> mo66309e(@C0359n0 A a) {
        List f = mo66310f(m101475c(a));
        if (!f.isEmpty()) {
            int size = f.size();
            List<C22323n<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                C22323n nVar = (C22323n) f.get(i);
                if (nVar.mo66239a(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new Registry.NoModelLoaderAvailableException(a, f);
        }
        throw new Registry.NoModelLoaderAvailableException(a);
    }

    @C0359n0
    /* renamed from: f */
    public final synchronized <A> List<C22323n<A, ?>> mo66310f(@C0359n0 Class<A> cls) {
        List<C22323n<A, ?>> b;
        b = this.f57344b.mo66316b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.f57343a.mo66324e(cls));
            this.f57344b.mo66317c(cls, b);
        }
        return b;
    }

    /* renamed from: g */
    public synchronized <Model, Data> void mo66311g(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2, @C0359n0 C22325o<? extends Model, ? extends Data> oVar) {
        this.f57343a.mo66327i(cls, cls2, oVar);
        this.f57344b.mo66315a();
    }

    /* renamed from: h */
    public synchronized <Model, Data> void mo66312h(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2) {
        mo66314j(this.f57343a.mo66328j(cls, cls2));
        this.f57344b.mo66315a();
    }

    /* renamed from: i */
    public synchronized <Model, Data> void mo66313i(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2, @C0359n0 C22325o<? extends Model, ? extends Data> oVar) {
        mo66314j(this.f57343a.mo66329k(cls, cls2, oVar));
        this.f57344b.mo66315a();
    }

    /* renamed from: j */
    public final <Model, Data> void mo66314j(@C0359n0 List<C22325o<? extends Model, ? extends Data>> list) {
        for (C22325o<? extends Model, ? extends Data> a : list) {
            a.mo66244a();
        }
    }

    public C22326p(@C0359n0 C22331r rVar) {
        this.f57344b = new C22327a();
        this.f57343a = rVar;
    }
}
