package com.bumptech.glide.load.engine;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.engine.C22216e;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.util.pool.C22647b;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.t */
public class C22271t implements C22216e, C22114d.C22115a<Object> {

    /* renamed from: a */
    public final C22216e.C22217a f57247a;

    /* renamed from: b */
    public final C22231f<?> f57248b;

    /* renamed from: c */
    public int f57249c;

    /* renamed from: d */
    public int f57250d = -1;

    /* renamed from: e */
    public C22108c f57251e;

    /* renamed from: f */
    public List<C22323n<File, ?>> f57252f;

    /* renamed from: g */
    public int f57253g;

    /* renamed from: v */
    public volatile C22323n.C22324a<?> f57254v;

    /* renamed from: w */
    public File f57255w;

    /* renamed from: x */
    public C22272u f57256x;

    public C22271t(C22231f<?> fVar, C22216e.C22217a aVar) {
        this.f57248b = fVar;
        this.f57247a = aVar;
    }

    /* renamed from: a */
    public boolean mo65922a() {
        C22647b.m102675a("ResourceCacheGenerator.startNext");
        try {
            List<C22108c> c = this.f57248b.mo66094c();
            boolean z = false;
            if (c.isEmpty()) {
                return false;
            }
            List<Class<?>> m = this.f57248b.mo66104m();
            if (!m.isEmpty()) {
                while (true) {
                    if (this.f57252f != null) {
                        if (mo66221b()) {
                            this.f57254v = null;
                            while (!z && mo66221b()) {
                                List<C22323n<File, ?>> list = this.f57252f;
                                int i = this.f57253g;
                                this.f57253g = i + 1;
                                this.f57254v = list.get(i).mo66240b(this.f57255w, this.f57248b.mo66111t(), this.f57248b.mo66097f(), this.f57248b.mo66102k());
                                if (this.f57254v != null && this.f57248b.mo66112u(this.f57254v.f57342c.mo65784a())) {
                                    this.f57254v.f57342c.mo65793e(this.f57248b.mo66103l(), this);
                                    z = true;
                                }
                            }
                            C22647b.m102680f();
                            return z;
                        }
                    }
                    int i2 = this.f57250d + 1;
                    this.f57250d = i2;
                    if (i2 >= m.size()) {
                        int i3 = this.f57249c + 1;
                        this.f57249c = i3;
                        if (i3 >= c.size()) {
                            C22647b.m102680f();
                            return false;
                        }
                        this.f57250d = 0;
                    }
                    C22108c cVar = c.get(this.f57249c);
                    Class cls = m.get(this.f57250d);
                    this.f57256x = new C22272u(this.f57248b.mo66093b(), cVar, this.f57248b.mo66107p(), this.f57248b.mo66111t(), this.f57248b.mo66097f(), this.f57248b.mo66110s(cls), cls, this.f57248b.mo66102k());
                    File b = this.f57248b.mo66095d().mo66023b(this.f57256x);
                    this.f57255w = b;
                    if (b != null) {
                        this.f57251e = cVar;
                        this.f57252f = this.f57248b.mo66101j(b);
                        this.f57253g = 0;
                    }
                }
            } else if (File.class.equals(this.f57248b.mo66109r())) {
                C22647b.m102680f();
                return false;
            } else {
                throw new IllegalStateException("Failed to find any load path from " + this.f57248b.mo66100i() + " to " + this.f57248b.mo66109r());
            }
        } finally {
            C22647b.m102680f();
        }
    }

    /* renamed from: b */
    public final boolean mo66221b() {
        return this.f57253g < this.f57252f.size();
    }

    /* renamed from: c */
    public void mo65803c(@C0359n0 Exception exc) {
        this.f57247a.mo65857b(this.f57256x, exc, this.f57254v.f57342c, DataSource.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        C22323n.C22324a<?> aVar = this.f57254v;
        if (aVar != null) {
            aVar.f57342c.cancel();
        }
    }

    /* renamed from: f */
    public void mo65804f(Object obj) {
        this.f57247a.mo65870r(this.f57251e, obj, this.f57254v.f57342c, DataSource.RESOURCE_DISK_CACHE, this.f57256x);
    }
}
