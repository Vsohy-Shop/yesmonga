package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c */
public final class C41885c {

    /* renamed from: a */
    public C41867b f106036a;

    /* renamed from: b */
    public C41867b f106037b;

    /* renamed from: c */
    public final List f106038c;

    public C41885c() {
        this.f106036a = new C41867b("", 0, (Map) null);
        this.f106037b = new C41867b("", 0, (Map) null);
        this.f106038c = new ArrayList();
    }

    /* renamed from: a */
    public final C41867b mo136640a() {
        return this.f106036a;
    }

    /* renamed from: b */
    public final C41867b mo136641b() {
        return this.f106037b;
    }

    /* renamed from: c */
    public final List mo136642c() {
        return this.f106038c;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C41885c cVar = new C41885c(this.f106036a.clone());
        for (C41867b b : this.f106038c) {
            cVar.f106038c.add(b.clone());
        }
        return cVar;
    }

    /* renamed from: d */
    public final void mo136644d(C41867b bVar) {
        this.f106036a = bVar;
        this.f106037b = bVar.clone();
        this.f106038c.clear();
    }

    /* renamed from: e */
    public final void mo136645e(String str, long j, Map map) {
        this.f106038c.add(new C41867b(str, j, map));
    }

    /* renamed from: f */
    public final void mo136646f(C41867b bVar) {
        this.f106037b = bVar;
    }

    public C41885c(C41867b bVar) {
        this.f106036a = bVar;
        this.f106037b = bVar.clone();
        this.f106038c = new ArrayList();
    }
}
