package com.bumptech.glide.load.engine;

import com.bumptech.glide.C22048d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C22098a;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22279h;
import com.bumptech.glide.load.C22280i;
import com.bumptech.glide.load.data.C22116e;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.load.engine.cache.C22185a;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.load.resource.C22494k;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.f */
public final class C22231f<Transcode> {

    /* renamed from: a */
    public final List<C22323n.C22324a<?>> f57099a = new ArrayList();

    /* renamed from: b */
    public final List<C22108c> f57100b = new ArrayList();

    /* renamed from: c */
    public C22048d f57101c;

    /* renamed from: d */
    public Object f57102d;

    /* renamed from: e */
    public int f57103e;

    /* renamed from: f */
    public int f57104f;

    /* renamed from: g */
    public Class<?> f57105g;

    /* renamed from: h */
    public DecodeJob.C22146e f57106h;

    /* renamed from: i */
    public C22277f f57107i;

    /* renamed from: j */
    public Map<Class<?>, C22280i<?>> f57108j;

    /* renamed from: k */
    public Class<Transcode> f57109k;

    /* renamed from: l */
    public boolean f57110l;

    /* renamed from: m */
    public boolean f57111m;

    /* renamed from: n */
    public C22108c f57112n;

    /* renamed from: o */
    public Priority f57113o;

    /* renamed from: p */
    public C22234h f57114p;

    /* renamed from: q */
    public boolean f57115q;

    /* renamed from: r */
    public boolean f57116r;

    /* renamed from: a */
    public void mo66092a() {
        this.f57101c = null;
        this.f57102d = null;
        this.f57112n = null;
        this.f57105g = null;
        this.f57109k = null;
        this.f57107i = null;
        this.f57113o = null;
        this.f57108j = null;
        this.f57114p = null;
        this.f57099a.clear();
        this.f57110l = false;
        this.f57100b.clear();
        this.f57111m = false;
    }

    /* renamed from: b */
    public C22157b mo66093b() {
        return this.f57101c.mo65518b();
    }

    /* renamed from: c */
    public List<C22108c> mo66094c() {
        if (!this.f57111m) {
            this.f57111m = true;
            this.f57100b.clear();
            List<C22323n.C22324a<?>> g = mo66098g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C22323n.C22324a aVar = g.get(i);
                if (!this.f57100b.contains(aVar.f57340a)) {
                    this.f57100b.add(aVar.f57340a);
                }
                for (int i2 = 0; i2 < aVar.f57341b.size(); i2++) {
                    if (!this.f57100b.contains(aVar.f57341b.get(i2))) {
                        this.f57100b.add(aVar.f57341b.get(i2));
                    }
                }
            }
        }
        return this.f57100b;
    }

    /* renamed from: d */
    public C22185a mo66095d() {
        return this.f57106h.mo65885a();
    }

    /* renamed from: e */
    public C22234h mo66096e() {
        return this.f57114p;
    }

    /* renamed from: f */
    public int mo66097f() {
        return this.f57104f;
    }

    /* renamed from: g */
    public List<C22323n.C22324a<?>> mo66098g() {
        if (!this.f57110l) {
            this.f57110l = true;
            this.f57099a.clear();
            List i = this.f57101c.mo65525i().mo65448i(this.f57102d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                C22323n.C22324a b = ((C22323n) i.get(i2)).mo66240b(this.f57102d, this.f57103e, this.f57104f, this.f57107i);
                if (b != null) {
                    this.f57099a.add(b);
                }
            }
        }
        return this.f57099a;
    }

    /* renamed from: h */
    public <Data> C22267q<Data, ?, Transcode> mo66099h(Class<Data> cls) {
        return this.f57101c.mo65525i().mo65447h(cls, this.f57105g, this.f57109k);
    }

    /* renamed from: i */
    public Class<?> mo66100i() {
        return this.f57102d.getClass();
    }

    /* renamed from: j */
    public List<C22323n<File, ?>> mo66101j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f57101c.mo65525i().mo65448i(file);
    }

    /* renamed from: k */
    public C22277f mo66102k() {
        return this.f57107i;
    }

    /* renamed from: l */
    public Priority mo66103l() {
        return this.f57113o;
    }

    /* renamed from: m */
    public List<Class<?>> mo66104m() {
        return this.f57101c.mo65525i().mo65449j(this.f57102d.getClass(), this.f57105g, this.f57109k);
    }

    /* renamed from: n */
    public <Z> C22279h<Z> mo66105n(C22270s<Z> sVar) {
        return this.f57101c.mo65525i().mo65450k(sVar);
    }

    /* renamed from: o */
    public <T> C22116e<T> mo66106o(T t) {
        return this.f57101c.mo65525i().mo65451l(t);
    }

    /* renamed from: p */
    public C22108c mo66107p() {
        return this.f57112n;
    }

    /* renamed from: q */
    public <X> C22098a<X> mo66108q(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f57101c.mo65525i().mo65452m(x);
    }

    /* renamed from: r */
    public Class<?> mo66109r() {
        return this.f57109k;
    }

    /* renamed from: s */
    public <Z> C22280i<Z> mo66110s(Class<Z> cls) {
        C22280i<Z> iVar = this.f57108j.get(cls);
        if (iVar == null) {
            Iterator<Map.Entry<Class<?>, C22280i<?>>> it = this.f57108j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    iVar = (C22280i) next.getValue();
                    break;
                }
            }
        }
        if (iVar != null) {
            return iVar;
        }
        if (!this.f57108j.isEmpty() || !this.f57115q) {
            return C22494k.m102047c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: t */
    public int mo66111t() {
        return this.f57103e;
    }

    /* renamed from: u */
    public boolean mo66112u(Class<?> cls) {
        return mo66099h(cls) != null;
    }

    /* renamed from: v */
    public <R> void mo66113v(C22048d dVar, Object obj, C22108c cVar, int i, int i2, C22234h hVar, Class<?> cls, Class<R> cls2, Priority priority, C22277f fVar, Map<Class<?>, C22280i<?>> map, boolean z, boolean z2, DecodeJob.C22146e eVar) {
        this.f57101c = dVar;
        this.f57102d = obj;
        this.f57112n = cVar;
        this.f57103e = i;
        this.f57104f = i2;
        this.f57114p = hVar;
        this.f57105g = cls;
        this.f57106h = eVar;
        this.f57109k = cls2;
        this.f57113o = priority;
        this.f57107i = fVar;
        this.f57108j = map;
        this.f57115q = z;
        this.f57116r = z2;
    }

    /* renamed from: w */
    public boolean mo66114w(C22270s<?> sVar) {
        return this.f57101c.mo65525i().mo65453n(sVar);
    }

    /* renamed from: x */
    public boolean mo66115x() {
        return this.f57116r;
    }

    /* renamed from: y */
    public boolean mo66116y(C22108c cVar) {
        List<C22323n.C22324a<?>> g = mo66098g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).f57340a.equals(cVar)) {
                return true;
            }
        }
        return false;
    }
}
