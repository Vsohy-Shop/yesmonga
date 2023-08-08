package com.bumptech.glide.load.model;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17997q;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.util.C22633m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.model.r */
public class C22331r {

    /* renamed from: e */
    public static final C22334c f57356e = new C22334c();

    /* renamed from: f */
    public static final C22323n<Object, Object> f57357f = new C22332a();

    /* renamed from: a */
    public final List<C22333b<?, ?>> f57358a;

    /* renamed from: b */
    public final C22334c f57359b;

    /* renamed from: c */
    public final Set<C22333b<?, ?>> f57360c;

    /* renamed from: d */
    public final C17997q.C17998a<List<Throwable>> f57361d;

    /* renamed from: com.bumptech.glide.load.model.r$a */
    public static class C22332a implements C22323n<Object, Object> {
        /* renamed from: a */
        public boolean mo66239a(@C0359n0 Object obj) {
            return false;
        }

        @C0363p0
        /* renamed from: b */
        public C22323n.C22324a<Object> mo66240b(@C0359n0 Object obj, int i, int i2, @C0359n0 C22277f fVar) {
            return null;
        }
    }

    /* renamed from: com.bumptech.glide.load.model.r$b */
    public static class C22333b<Model, Data> {

        /* renamed from: a */
        public final Class<Model> f57362a;

        /* renamed from: b */
        public final Class<Data> f57363b;

        /* renamed from: c */
        public final C22325o<? extends Model, ? extends Data> f57364c;

        public C22333b(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2, @C0359n0 C22325o<? extends Model, ? extends Data> oVar) {
            this.f57362a = cls;
            this.f57363b = cls2;
            this.f57364c = oVar;
        }

        /* renamed from: a */
        public boolean mo66330a(@C0359n0 Class<?> cls) {
            return this.f57362a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean mo66331b(@C0359n0 Class<?> cls, @C0359n0 Class<?> cls2) {
            return mo66330a(cls) && this.f57363b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.r$c */
    public static class C22334c {
        @C0359n0
        /* renamed from: a */
        public <Model, Data> C22329q<Model, Data> mo66332a(@C0359n0 List<C22323n<Model, Data>> list, @C0359n0 C17997q.C17998a<List<Throwable>> aVar) {
            return new C22329q<>(list, aVar);
        }
    }

    public C22331r(@C0359n0 C17997q.C17998a<List<Throwable>> aVar) {
        this(aVar, f57356e);
    }

    @C0359n0
    /* renamed from: f */
    public static <Model, Data> C22323n<Model, Data> m101497f() {
        return f57357f;
    }

    /* renamed from: a */
    public final <Model, Data> void mo66320a(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2, @C0359n0 C22325o<? extends Model, ? extends Data> oVar, boolean z) {
        int i;
        C22333b bVar = new C22333b(cls, cls2, oVar);
        List<C22333b<?, ?>> list = this.f57358a;
        if (z) {
            i = list.size();
        } else {
            i = 0;
        }
        list.add(i, bVar);
    }

    /* renamed from: b */
    public synchronized <Model, Data> void mo66321b(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2, @C0359n0 C22325o<? extends Model, ? extends Data> oVar) {
        mo66320a(cls, cls2, oVar, true);
    }

    @C0359n0
    /* renamed from: c */
    public final <Model, Data> C22323n<Model, Data> mo66322c(@C0359n0 C22333b<?, ?> bVar) {
        return (C22323n) C22633m.m102624d(bVar.f57364c.mo66245c(this));
    }

    @C0359n0
    /* renamed from: d */
    public synchronized <Model, Data> C22323n<Model, Data> mo66323d(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C22333b next : this.f57358a) {
                if (this.f57360c.contains(next)) {
                    z = true;
                } else if (next.mo66331b(cls, cls2)) {
                    this.f57360c.add(next);
                    arrayList.add(mo66322c(next));
                    this.f57360c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f57359b.mo66332a(arrayList, this.f57361d);
            } else if (arrayList.size() == 1) {
                return (C22323n) arrayList.get(0);
            } else if (z) {
                return m101497f();
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f57360c.clear();
            throw th;
        }
    }

    @C0359n0
    /* renamed from: e */
    public synchronized <Model> List<C22323n<Model, ?>> mo66324e(@C0359n0 Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C22333b next : this.f57358a) {
                if (!this.f57360c.contains(next)) {
                    if (next.mo66330a(cls)) {
                        this.f57360c.add(next);
                        arrayList.add(mo66322c(next));
                        this.f57360c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f57360c.clear();
            throw th;
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: g */
    public synchronized List<Class<?>> mo66325g(@C0359n0 Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C22333b next : this.f57358a) {
            if (!arrayList.contains(next.f57363b) && next.mo66330a(cls)) {
                arrayList.add(next.f57363b);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: h */
    public final <Model, Data> C22325o<Model, Data> mo66326h(@C0359n0 C22333b<?, ?> bVar) {
        return bVar.f57364c;
    }

    /* renamed from: i */
    public synchronized <Model, Data> void mo66327i(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2, @C0359n0 C22325o<? extends Model, ? extends Data> oVar) {
        mo66320a(cls, cls2, oVar, false);
    }

    @C0359n0
    /* renamed from: j */
    public synchronized <Model, Data> List<C22325o<? extends Model, ? extends Data>> mo66328j(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<C22333b<?, ?>> it = this.f57358a.iterator();
        while (it.hasNext()) {
            C22333b next = it.next();
            if (next.mo66331b(cls, cls2)) {
                it.remove();
                arrayList.add(mo66326h(next));
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: k */
    public synchronized <Model, Data> List<C22325o<? extends Model, ? extends Data>> mo66329k(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2, @C0359n0 C22325o<? extends Model, ? extends Data> oVar) {
        List<C22325o<? extends Model, ? extends Data>> j;
        j = mo66328j(cls, cls2);
        mo66321b(cls, cls2, oVar);
        return j;
    }

    @C0344h1
    public C22331r(@C0359n0 C17997q.C17998a<List<Throwable>> aVar, @C0359n0 C22334c cVar) {
        this.f57358a = new ArrayList();
        this.f57360c = new HashSet();
        this.f57361d = aVar;
        this.f57359b = cVar;
    }
}
