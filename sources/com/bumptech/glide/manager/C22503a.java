package com.bumptech.glide.manager;

import androidx.annotation.C0359n0;
import com.bumptech.glide.util.C22635o;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.a */
public class C22503a implements C22515l {

    /* renamed from: a */
    public final Set<C22516m> f57690a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f57691b;

    /* renamed from: c */
    public boolean f57692c;

    /* renamed from: a */
    public void mo66571a(@C0359n0 C22516m mVar) {
        this.f57690a.remove(mVar);
    }

    /* renamed from: b */
    public void mo66572b(@C0359n0 C22516m mVar) {
        this.f57690a.add(mVar);
        if (this.f57692c) {
            mVar.mo65587c();
        } else if (this.f57691b) {
            mVar.mo65586b();
        } else {
            mVar.mo65585a();
        }
    }

    /* renamed from: c */
    public void mo66573c() {
        this.f57692c = true;
        for (T c : C22635o.m102636k(this.f57690a)) {
            c.mo65587c();
        }
    }

    /* renamed from: d */
    public void mo66574d() {
        this.f57691b = true;
        for (T b : C22635o.m102636k(this.f57690a)) {
            b.mo65586b();
        }
    }

    /* renamed from: e */
    public void mo66575e() {
        this.f57691b = false;
        for (T a : C22635o.m102636k(this.f57690a)) {
            a.mo65585a();
        }
    }
}
