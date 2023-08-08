package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.prefill.c */
public final class C22264c {

    /* renamed from: a */
    public final Map<C22265d, Integer> f57225a;

    /* renamed from: b */
    public final List<C22265d> f57226b;

    /* renamed from: c */
    public int f57227c;

    /* renamed from: d */
    public int f57228d;

    public C22264c(Map<C22265d, Integer> map) {
        this.f57225a = map;
        this.f57226b = new ArrayList(map.keySet());
        for (Integer intValue : map.values()) {
            this.f57227c += intValue.intValue();
        }
    }

    /* renamed from: a */
    public int mo66199a() {
        return this.f57227c;
    }

    /* renamed from: b */
    public boolean mo66200b() {
        return this.f57227c == 0;
    }

    /* renamed from: c */
    public C22265d mo66201c() {
        int i;
        C22265d dVar = this.f57226b.get(this.f57228d);
        Integer num = this.f57225a.get(dVar);
        if (num.intValue() == 1) {
            this.f57225a.remove(dVar);
            this.f57226b.remove(this.f57228d);
        } else {
            this.f57225a.put(dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f57227c--;
        if (this.f57226b.isEmpty()) {
            i = 0;
        } else {
            i = (this.f57228d + 1) % this.f57226b.size();
        }
        this.f57228d = i;
        return dVar;
    }
}
