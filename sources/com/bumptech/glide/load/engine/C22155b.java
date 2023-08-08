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

/* renamed from: com.bumptech.glide.load.engine.b */
public class C22155b implements C22216e, C22114d.C22115a<Object> {

    /* renamed from: a */
    public final List<C22108c> f56933a;

    /* renamed from: b */
    public final C22231f<?> f56934b;

    /* renamed from: c */
    public final C22216e.C22217a f56935c;

    /* renamed from: d */
    public int f56936d;

    /* renamed from: e */
    public C22108c f56937e;

    /* renamed from: f */
    public List<C22323n<File, ?>> f56938f;

    /* renamed from: g */
    public int f56939g;

    /* renamed from: v */
    public volatile C22323n.C22324a<?> f56940v;

    /* renamed from: w */
    public File f56941w;

    public C22155b(C22231f<?> fVar, C22216e.C22217a aVar) {
        this(fVar.mo66094c(), fVar, aVar);
    }

    /* renamed from: a */
    public boolean mo65922a() {
        C22647b.m102675a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.f56938f != null) {
                    if (mo65923b()) {
                        this.f56940v = null;
                        while (!z && mo65923b()) {
                            List<C22323n<File, ?>> list = this.f56938f;
                            int i = this.f56939g;
                            this.f56939g = i + 1;
                            this.f56940v = list.get(i).mo66240b(this.f56941w, this.f56934b.mo66111t(), this.f56934b.mo66097f(), this.f56934b.mo66102k());
                            if (this.f56940v != null && this.f56934b.mo66112u(this.f56940v.f57342c.mo65784a())) {
                                this.f56940v.f57342c.mo65793e(this.f56934b.mo66103l(), this);
                                z = true;
                            }
                        }
                        C22647b.m102680f();
                        return z;
                    }
                }
                int i2 = this.f56936d + 1;
                this.f56936d = i2;
                if (i2 >= this.f56933a.size()) {
                    return false;
                }
                C22108c cVar = this.f56933a.get(this.f56936d);
                File b = this.f56934b.mo66095d().mo66023b(new C22184c(cVar, this.f56934b.mo66107p()));
                this.f56941w = b;
                if (b != null) {
                    this.f56937e = cVar;
                    this.f56938f = this.f56934b.mo66101j(b);
                    this.f56939g = 0;
                }
            } finally {
                C22647b.m102680f();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo65923b() {
        return this.f56939g < this.f56938f.size();
    }

    /* renamed from: c */
    public void mo65803c(@C0359n0 Exception exc) {
        this.f56935c.mo65857b(this.f56937e, exc, this.f56940v.f57342c, DataSource.DATA_DISK_CACHE);
    }

    public void cancel() {
        C22323n.C22324a<?> aVar = this.f56940v;
        if (aVar != null) {
            aVar.f57342c.cancel();
        }
    }

    /* renamed from: f */
    public void mo65804f(Object obj) {
        this.f56935c.mo65870r(this.f56937e, obj, this.f56940v.f57342c, DataSource.DATA_DISK_CACHE, this.f56937e);
    }

    public C22155b(List<C22108c> list, C22231f<?> fVar, C22216e.C22217a aVar) {
        this.f56936d = -1;
        this.f56933a = list;
        this.f56934b = fVar;
        this.f56935c = aVar;
    }
}
