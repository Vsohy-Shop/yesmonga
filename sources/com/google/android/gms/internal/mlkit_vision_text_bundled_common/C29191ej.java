package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.annotation.SuppressLint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ej */
public final class C29191ej<T> {

    /* renamed from: a */
    public final int f71226a;

    /* renamed from: b */
    public final Map<Long, T> f71227b = new HashMap();

    @SuppressLint({"UseSparseArrays"})
    public C29191ej(int i) {
        this.f71226a = i;
    }

    /* renamed from: a */
    public final synchronized void mo84604a(long j) {
        this.f71227b.remove(Long.valueOf(j));
    }

    /* renamed from: b */
    public final synchronized boolean mo84605b(T t, long j) {
        if (this.f71227b.size() == this.f71226a) {
            C29665rd rdVar = C29665rd.f71433b;
            StringBuilder sb = new StringBuilder(47);
            sb.append("Buffer is full. Drop frame ");
            sb.append(j);
            rdVar.mo84809d(this, sb.toString(), new Object[0]);
            return false;
        }
        this.f71227b.put(Long.valueOf(j), t);
        return true;
    }
}
