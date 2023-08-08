package com.bumptech.glide.manager;

import androidx.annotation.C0359n0;
import com.bumptech.glide.request.target.C22584p;
import com.bumptech.glide.util.C22635o;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.v */
public final class C22537v implements C22516m {

    /* renamed from: a */
    public final Set<C22584p<?>> f57754a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void mo65585a() {
        for (T a : C22635o.m102636k(this.f57754a)) {
            a.mo65585a();
        }
    }

    /* renamed from: b */
    public void mo65586b() {
        for (T b : C22635o.m102636k(this.f57754a)) {
            b.mo65586b();
        }
    }

    /* renamed from: c */
    public void mo65587c() {
        for (T c : C22635o.m102636k(this.f57754a)) {
            c.mo65587c();
        }
    }

    /* renamed from: e */
    public void mo66662e() {
        this.f57754a.clear();
    }

    @C0359n0
    /* renamed from: f */
    public List<C22584p<?>> mo66663f() {
        return C22635o.m102636k(this.f57754a);
    }

    /* renamed from: h */
    public void mo66664h(@C0359n0 C22584p<?> pVar) {
        this.f57754a.add(pVar);
    }

    /* renamed from: i */
    public void mo66665i(@C0359n0 C22584p<?> pVar) {
        this.f57754a.remove(pVar);
    }
}
