package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22059e;
import com.bumptech.glide.load.engine.C22240i;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.engine.bitmap_recycle.C22163f;
import com.bumptech.glide.load.engine.bitmap_recycle.C22168j;
import com.bumptech.glide.load.engine.bitmap_recycle.C22171k;
import com.bumptech.glide.load.engine.cache.C22185a;
import com.bumptech.glide.load.engine.cache.C22202h;
import com.bumptech.glide.load.engine.cache.C22204i;
import com.bumptech.glide.load.engine.cache.C22205j;
import com.bumptech.glide.load.engine.cache.C22208l;
import com.bumptech.glide.load.engine.executor.C22218a;
import com.bumptech.glide.manager.C22507d;
import com.bumptech.glide.manager.C22509f;
import com.bumptech.glide.manager.C22521q;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.bumptech.glide.util.C22633m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.c */
public final class C22040c {

    /* renamed from: a */
    public final Map<Class<?>, C22096k<?, ?>> f56536a = new C1866a();

    /* renamed from: b */
    public final C22059e.C22060a f56537b = new C22059e.C22060a();

    /* renamed from: c */
    public C22240i f56538c;

    /* renamed from: d */
    public C22162e f56539d;

    /* renamed from: e */
    public C22157b f56540e;

    /* renamed from: f */
    public C22205j f56541f;

    /* renamed from: g */
    public C22218a f56542g;

    /* renamed from: h */
    public C22218a f56543h;

    /* renamed from: i */
    public C22185a.C22186a f56544i;

    /* renamed from: j */
    public C22208l f56545j;

    /* renamed from: k */
    public C22507d f56546k;

    /* renamed from: l */
    public int f56547l = 4;

    /* renamed from: m */
    public C22038b.C22039a f56548m = new C22041a();
    @C0363p0

    /* renamed from: n */
    public C22521q.C22523b f56549n;

    /* renamed from: o */
    public C22218a f56550o;

    /* renamed from: p */
    public boolean f56551p;
    @C0363p0

    /* renamed from: q */
    public List<C22560g<Object>> f56552q;

    /* renamed from: com.bumptech.glide.c$a */
    public class C22041a implements C22038b.C22039a {
        public C22041a() {
        }

        @C0359n0
        /* renamed from: g */
        public C22561h mo65493g() {
            return new C22561h();
        }
    }

    /* renamed from: com.bumptech.glide.c$b */
    public class C22042b implements C22038b.C22039a {

        /* renamed from: a */
        public final /* synthetic */ C22561h f56554a;

        public C22042b(C22561h hVar) {
            this.f56554a = hVar;
        }

        @C0359n0
        /* renamed from: g */
        public C22561h mo65493g() {
            C22561h hVar = this.f56554a;
            return hVar != null ? hVar : new C22561h();
        }
    }

    /* renamed from: com.bumptech.glide.c$c */
    public static final class C22043c implements C22059e.C22061b {
    }

    /* renamed from: com.bumptech.glide.c$d */
    public static final class C22044d implements C22059e.C22061b {
    }

    /* renamed from: com.bumptech.glide.c$e */
    public static final class C22045e implements C22059e.C22061b {
    }

    /* renamed from: com.bumptech.glide.c$f */
    public static final class C22046f implements C22059e.C22061b {

        /* renamed from: a */
        public final int f56556a;

        public C22046f(int i) {
            this.f56556a = i;
        }
    }

    /* renamed from: com.bumptech.glide.c$g */
    public static final class C22047g implements C22059e.C22061b {
    }

    @C0359n0
    /* renamed from: a */
    public C22040c mo65494a(@C0359n0 C22560g<Object> gVar) {
        if (this.f56552q == null) {
            this.f56552q = new ArrayList();
        }
        this.f56552q.add(gVar);
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public C22038b mo65495b(@C0359n0 Context context) {
        if (this.f56542g == null) {
            this.f56542g = C22218a.m101151k();
        }
        if (this.f56543h == null) {
            this.f56543h = C22218a.m101147f();
        }
        if (this.f56550o == null) {
            this.f56550o = C22218a.m101144c();
        }
        if (this.f56545j == null) {
            this.f56545j = new C22208l.C22209a(context).mo66053a();
        }
        if (this.f56546k == null) {
            this.f56546k = new C22509f();
        }
        if (this.f56539d == null) {
            int b = this.f56545j.mo66050b();
            if (b > 0) {
                this.f56539d = new C22171k((long) b);
            } else {
                this.f56539d = new C22163f();
            }
        }
        if (this.f56540e == null) {
            this.f56540e = new C22168j(this.f56545j.mo66049a());
        }
        if (this.f56541f == null) {
            this.f56541f = new C22204i((long) this.f56545j.mo66051d());
        }
        if (this.f56544i == null) {
            this.f56544i = new C22202h(context);
        }
        if (this.f56538c == null) {
            this.f56538c = new C22240i(this.f56541f, this.f56544i, this.f56543h, this.f56542g, C22218a.m101154n(), this.f56550o, this.f56551p);
        }
        List<C22560g<Object>> list = this.f56552q;
        if (list == null) {
            this.f56552q = Collections.emptyList();
        } else {
            this.f56552q = Collections.unmodifiableList(list);
        }
        C22059e c = this.f56537b.mo65573c();
        return new C22038b(context, this.f56538c, this.f56541f, this.f56539d, this.f56540e, new C22521q(this.f56549n, c), this.f56546k, this.f56547l, this.f56548m, this.f56536a, this.f56552q, c);
    }

    @C0359n0
    /* renamed from: c */
    public C22040c mo65496c(@C0363p0 C22218a aVar) {
        this.f56550o = aVar;
        return this;
    }

    @C0359n0
    /* renamed from: d */
    public C22040c mo65497d(@C0363p0 C22157b bVar) {
        this.f56540e = bVar;
        return this;
    }

    @C0359n0
    /* renamed from: e */
    public C22040c mo65498e(@C0363p0 C22162e eVar) {
        this.f56539d = eVar;
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public C22040c mo65499f(@C0363p0 C22507d dVar) {
        this.f56546k = dVar;
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C22040c mo65500g(@C0359n0 C22038b.C22039a aVar) {
        this.f56548m = (C22038b.C22039a) C22633m.m102624d(aVar);
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public C22040c mo65501h(@C0363p0 C22561h hVar) {
        return mo65500g(new C22042b(hVar));
    }

    @C0359n0
    /* renamed from: i */
    public <T> C22040c mo65502i(@C0359n0 Class<T> cls, @C0363p0 C22096k<?, T> kVar) {
        this.f56536a.put(cls, kVar);
        return this;
    }

    @C0359n0
    /* renamed from: j */
    public C22040c mo65503j(@C0363p0 C22185a.C22186a aVar) {
        this.f56544i = aVar;
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public C22040c mo65504k(@C0363p0 C22218a aVar) {
        this.f56543h = aVar;
        return this;
    }

    /* renamed from: l */
    public C22040c mo65505l(boolean z) {
        this.f56537b.mo65574d(new C22043c(), z);
        return this;
    }

    /* renamed from: m */
    public C22040c mo65506m(C22240i iVar) {
        this.f56538c = iVar;
        return this;
    }

    /* renamed from: n */
    public C22040c mo65507n(boolean z) {
        this.f56537b.mo65574d(new C22044d(), z && Build.VERSION.SDK_INT >= 29);
        return this;
    }

    @C0359n0
    /* renamed from: o */
    public C22040c mo65508o(boolean z) {
        this.f56551p = z;
        return this;
    }

    @C0359n0
    /* renamed from: p */
    public C22040c mo65509p(int i) {
        if (i < 2 || i > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f56547l = i;
        return this;
    }

    /* renamed from: q */
    public C22040c mo65510q(boolean z) {
        this.f56537b.mo65574d(new C22045e(), z);
        return this;
    }

    @C0359n0
    /* renamed from: r */
    public C22040c mo65511r(@C0363p0 C22205j jVar) {
        this.f56541f = jVar;
        return this;
    }

    @C0359n0
    /* renamed from: s */
    public C22040c mo65512s(@C0359n0 C22208l.C22209a aVar) {
        return mo65513t(aVar.mo66053a());
    }

    @C0359n0
    /* renamed from: t */
    public C22040c mo65513t(@C0363p0 C22208l lVar) {
        this.f56545j = lVar;
        return this;
    }

    /* renamed from: u */
    public void mo65514u(@C0363p0 C22521q.C22523b bVar) {
        this.f56549n = bVar;
    }

    @Deprecated
    /* renamed from: v */
    public C22040c mo65515v(@C0363p0 C22218a aVar) {
        return mo65516w(aVar);
    }

    @C0359n0
    /* renamed from: w */
    public C22040c mo65516w(@C0363p0 C22218a aVar) {
        this.f56542g = aVar;
        return this;
    }
}
