package com.bumptech.glide.load.engine;

import androidx.annotation.C0344h1;
import com.bumptech.glide.load.C22108c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.p */
public final class C22259p {

    /* renamed from: a */
    public final Map<C22108c, C22247j<?>> f57205a = new HashMap();

    /* renamed from: b */
    public final Map<C22108c, C22247j<?>> f57206b = new HashMap();

    /* renamed from: a */
    public C22247j<?> mo66185a(C22108c cVar, boolean z) {
        return mo66187c(z).get(cVar);
    }

    @C0344h1
    /* renamed from: b */
    public Map<C22108c, C22247j<?>> mo66186b() {
        return Collections.unmodifiableMap(this.f57205a);
    }

    /* renamed from: c */
    public final Map<C22108c, C22247j<?>> mo66187c(boolean z) {
        return z ? this.f57206b : this.f57205a;
    }

    /* renamed from: d */
    public void mo66188d(C22108c cVar, C22247j<?> jVar) {
        mo66187c(jVar.mo66156q()).put(cVar, jVar);
    }

    /* renamed from: e */
    public void mo66189e(C22108c cVar, C22247j<?> jVar) {
        Map<C22108c, C22247j<?>> c = mo66187c(jVar.mo66156q());
        if (jVar.equals(c.get(cVar))) {
            c.remove(cVar);
        }
    }
}
