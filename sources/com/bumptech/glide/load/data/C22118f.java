package com.bumptech.glide.load.data;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.data.C22116e;
import com.bumptech.glide.util.C22633m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.data.f */
public class C22118f {

    /* renamed from: b */
    public static final C22116e.C22117a<?> f56803b = new C22119a();

    /* renamed from: a */
    public final Map<Class<?>, C22116e.C22117a<?>> f56804a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.f$a */
    public class C22119a implements C22116e.C22117a<Object> {
        @C0359n0
        /* renamed from: a */
        public Class<Object> mo65781a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @C0359n0
        /* renamed from: b */
        public C22116e<Object> mo65782b(@C0359n0 Object obj) {
            return new C22120b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.f$b */
    public static final class C22120b implements C22116e<Object> {

        /* renamed from: a */
        public final Object f56805a;

        public C22120b(@C0359n0 Object obj) {
            this.f56805a = obj;
        }

        @C0359n0
        /* renamed from: a */
        public Object mo65777a() {
            return this.f56805a;
        }

        /* renamed from: b */
        public void mo65778b() {
        }
    }

    @C0359n0
    /* renamed from: a */
    public synchronized <T> C22116e<T> mo65805a(@C0359n0 T t) {
        C22116e.C22117a<?> aVar;
        C22633m.m102624d(t);
        aVar = this.f56804a.get(t.getClass());
        if (aVar == null) {
            Iterator<C22116e.C22117a<?>> it = this.f56804a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C22116e.C22117a<?> next = it.next();
                if (next.mo65781a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f56803b;
        }
        return aVar.mo65782b(t);
    }

    /* renamed from: b */
    public synchronized void mo65806b(@C0359n0 C22116e.C22117a<?> aVar) {
        this.f56804a.put(aVar.mo65781a(), aVar);
    }
}
