package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.m0 */
public final class C38690m0 extends C38573d0 {
    @NullableDecl

    /* renamed from: a */
    public final Object f98027a;

    /* renamed from: b */
    public int f98028b;

    /* renamed from: c */
    public final /* synthetic */ zzbs f98029c;

    public C38690m0(zzbs zzbs, int i) {
        this.f98029c = zzbs;
        this.f98027a = zzbs.f98387c[i];
        this.f98028b = i;
    }

    /* renamed from: a */
    public final void mo122426a() {
        int i = this.f98028b;
        if (i == -1 || i >= this.f98029c.size() || !C38676l.m160047a(this.f98027a, this.f98029c.f98387c[this.f98028b])) {
            this.f98028b = this.f98029c.mo122620s(this.f98027a);
        }
    }

    @NullableDecl
    public final Object getKey() {
        return this.f98027a;
    }

    @NullableDecl
    public final Object getValue() {
        Map l = this.f98029c.mo122612l();
        if (l != null) {
            return l.get(this.f98027a);
        }
        mo122426a();
        int i = this.f98028b;
        if (i == -1) {
            return null;
        }
        return this.f98029c.f98388d[i];
    }

    public final Object setValue(Object obj) {
        Map l = this.f98029c.mo122612l();
        if (l != null) {
            return l.put(this.f98027a, obj);
        }
        mo122426a();
        int i = this.f98028b;
        if (i == -1) {
            this.f98029c.put(this.f98027a, obj);
            return null;
        }
        Object[] objArr = this.f98029c.f98388d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
