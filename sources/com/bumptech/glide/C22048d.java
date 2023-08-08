package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.load.engine.C22240i;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.bumptech.glide.request.target.C22578k;
import com.bumptech.glide.request.target.C22586r;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.d */
public class C22048d extends ContextWrapper {
    @C0344h1

    /* renamed from: k */
    public static final C22096k<?, ?> f56557k = new C22031a();

    /* renamed from: a */
    public final C22157b f56558a;

    /* renamed from: b */
    public final Registry f56559b;

    /* renamed from: c */
    public final C22578k f56560c;

    /* renamed from: d */
    public final C22038b.C22039a f56561d;

    /* renamed from: e */
    public final List<C22560g<Object>> f56562e;

    /* renamed from: f */
    public final Map<Class<?>, C22096k<?, ?>> f56563f;

    /* renamed from: g */
    public final C22240i f56564g;

    /* renamed from: h */
    public final C22059e f56565h;

    /* renamed from: i */
    public final int f56566i;
    @C0363p0
    @C0323b0("this")

    /* renamed from: j */
    public C22561h f56567j;

    public C22048d(@C0359n0 Context context, @C0359n0 C22157b bVar, @C0359n0 Registry registry, @C0359n0 C22578k kVar, @C0359n0 C22038b.C22039a aVar, @C0359n0 Map<Class<?>, C22096k<?, ?>> map, @C0359n0 List<C22560g<Object>> list, @C0359n0 C22240i iVar, @C0359n0 C22059e eVar, int i) {
        super(context.getApplicationContext());
        this.f56558a = bVar;
        this.f56559b = registry;
        this.f56560c = kVar;
        this.f56561d = aVar;
        this.f56562e = list;
        this.f56563f = map;
        this.f56564g = iVar;
        this.f56565h = eVar;
        this.f56566i = i;
    }

    @C0359n0
    /* renamed from: a */
    public <X> C22586r<ImageView, X> mo65517a(@C0359n0 ImageView imageView, @C0359n0 Class<X> cls) {
        return this.f56560c.mo66908a(imageView, cls);
    }

    @C0359n0
    /* renamed from: b */
    public C22157b mo65518b() {
        return this.f56558a;
    }

    /* renamed from: c */
    public List<C22560g<Object>> mo65519c() {
        return this.f56562e;
    }

    /* renamed from: d */
    public synchronized C22561h mo65520d() {
        if (this.f56567j == null) {
            this.f56567j = (C22561h) this.f56561d.mo65493g().mo66739E0();
        }
        return this.f56567j;
    }

    @C0359n0
    /* renamed from: e */
    public <T> C22096k<?, T> mo65521e(@C0359n0 Class<T> cls) {
        C22096k<?, T> kVar = this.f56563f.get(cls);
        if (kVar == null) {
            for (Map.Entry next : this.f56563f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    kVar = (C22096k) next.getValue();
                }
            }
        }
        if (kVar == null) {
            return f56557k;
        }
        return kVar;
    }

    @C0359n0
    /* renamed from: f */
    public C22240i mo65522f() {
        return this.f56564g;
    }

    /* renamed from: g */
    public C22059e mo65523g() {
        return this.f56565h;
    }

    /* renamed from: h */
    public int mo65524h() {
        return this.f56566i;
    }

    @C0359n0
    /* renamed from: i */
    public Registry mo65525i() {
        return this.f56559b;
    }
}
