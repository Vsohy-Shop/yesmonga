package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.y */
public final class C30273y extends C30153o {
    @NullableDecl

    /* renamed from: a */
    public final Object f72350a;

    /* renamed from: b */
    public int f72351b;

    /* renamed from: c */
    public final /* synthetic */ zzbc f72352c;

    public C30273y(zzbc zzbc, int i) {
        this.f72352c = zzbc;
        this.f72350a = zzbc.f72396c[i];
        this.f72351b = i;
    }

    /* renamed from: a */
    public final void mo85398a() {
        int i = this.f72351b;
        if (i == -1 || i >= this.f72352c.size() || !C30272xa.m121934a(this.f72350a, this.f72352c.f72396c[this.f72351b])) {
            this.f72351b = this.f72352c.mo85438s(this.f72350a);
        }
    }

    @NullableDecl
    public final Object getKey() {
        return this.f72350a;
    }

    @NullableDecl
    public final Object getValue() {
        Map l = this.f72352c.mo85430l();
        if (l != null) {
            return l.get(this.f72350a);
        }
        mo85398a();
        int i = this.f72351b;
        if (i == -1) {
            return null;
        }
        return this.f72352c.f72397d[i];
    }

    public final Object setValue(Object obj) {
        Map l = this.f72352c.mo85430l();
        if (l != null) {
            return l.put(this.f72350a, obj);
        }
        mo85398a();
        int i = this.f72351b;
        if (i == -1) {
            this.f72352c.put(this.f72350a, obj);
            return null;
        }
        Object[] objArr = this.f72352c.f72397d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
