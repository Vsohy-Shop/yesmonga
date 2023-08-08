package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.transcode.f */
public class C22500f {

    /* renamed from: a */
    public final List<C22501a<?, ?>> f57685a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.resource.transcode.f$a */
    public static final class C22501a<Z, R> {

        /* renamed from: a */
        public final Class<Z> f57686a;

        /* renamed from: b */
        public final Class<R> f57687b;

        /* renamed from: c */
        public final C22499e<Z, R> f57688c;

        public C22501a(@C0359n0 Class<Z> cls, @C0359n0 Class<R> cls2, @C0359n0 C22499e<Z, R> eVar) {
            this.f57686a = cls;
            this.f57687b = cls2;
            this.f57688c = eVar;
        }

        /* renamed from: a */
        public boolean mo66570a(@C0359n0 Class<?> cls, @C0359n0 Class<?> cls2) {
            return this.f57686a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f57687b);
        }
    }

    @C0359n0
    /* renamed from: a */
    public synchronized <Z, R> C22499e<Z, R> mo66567a(@C0359n0 Class<Z> cls, @C0359n0 Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C22502g.m102060b();
        }
        for (C22501a next : this.f57685a) {
            if (next.mo66570a(cls, cls2)) {
                return next.f57688c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @C0359n0
    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo66568b(@C0359n0 Class<Z> cls, @C0359n0 Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C22501a next : this.f57685a) {
            if (next.mo66570a(cls, cls2) && !arrayList.contains(next.f57687b)) {
                arrayList.add(next.f57687b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void mo66569c(@C0359n0 Class<Z> cls, @C0359n0 Class<R> cls2, @C0359n0 C22499e<Z, R> eVar) {
        this.f57685a.add(new C22501a(cls, cls2, eVar));
    }
}
