package com.bumptech.glide.provider;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22278g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.provider.e */
public class C22549e {

    /* renamed from: a */
    public final List<String> f57767a = new ArrayList();

    /* renamed from: b */
    public final Map<String, List<C22550a<?, ?>>> f57768b = new HashMap();

    /* renamed from: com.bumptech.glide.provider.e$a */
    public static class C22550a<T, R> {

        /* renamed from: a */
        public final Class<T> f57769a;

        /* renamed from: b */
        public final Class<R> f57770b;

        /* renamed from: c */
        public final C22278g<T, R> f57771c;

        public C22550a(@C0359n0 Class<T> cls, @C0359n0 Class<R> cls2, C22278g<T, R> gVar) {
            this.f57769a = cls;
            this.f57770b = cls2;
            this.f57771c = gVar;
        }

        /* renamed from: a */
        public boolean mo66689a(@C0359n0 Class<?> cls, @C0359n0 Class<?> cls2) {
            if (!this.f57769a.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.f57770b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public synchronized <T, R> void mo66683a(@C0359n0 String str, @C0359n0 C22278g<T, R> gVar, @C0359n0 Class<T> cls, @C0359n0 Class<R> cls2) {
        mo66685c(str).add(new C22550a(cls, cls2, gVar));
    }

    @C0359n0
    /* renamed from: b */
    public synchronized <T, R> List<C22278g<T, R>> mo66684b(@C0359n0 Class<T> cls, @C0359n0 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f57767a) {
            List<C22550a> list = this.f57768b.get(str);
            if (list != null) {
                for (C22550a aVar : list) {
                    if (aVar.mo66689a(cls, cls2)) {
                        arrayList.add(aVar.f57771c);
                    }
                }
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: c */
    public final synchronized List<C22550a<?, ?>> mo66685c(@C0359n0 String str) {
        List<C22550a<?, ?>> list;
        if (!this.f57767a.contains(str)) {
            this.f57767a.add(str);
        }
        list = this.f57768b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f57768b.put(str, list);
        }
        return list;
    }

    @C0359n0
    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> mo66686d(@C0359n0 Class<T> cls, @C0359n0 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f57767a) {
            List<C22550a> list = this.f57768b.get(str);
            if (list != null) {
                for (C22550a aVar : list) {
                    if (aVar.mo66689a(cls, cls2) && !arrayList.contains(aVar.f57770b)) {
                        arrayList.add(aVar.f57770b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized <T, R> void mo66687e(@C0359n0 String str, @C0359n0 C22278g<T, R> gVar, @C0359n0 Class<T> cls, @C0359n0 Class<R> cls2) {
        mo66685c(str).add(0, new C22550a(cls, cls2, gVar));
    }

    /* renamed from: f */
    public synchronized void mo66688f(@C0359n0 List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f57767a);
        this.f57767a.clear();
        for (String add : list) {
            this.f57767a.add(add);
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f57767a.add(str);
            }
        }
    }
}
