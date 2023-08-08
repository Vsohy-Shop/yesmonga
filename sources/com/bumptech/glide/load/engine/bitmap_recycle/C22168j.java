package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.bumptech.glide.util.C22633m;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.j */
public final class C22168j implements C22157b {

    /* renamed from: h */
    public static final int f56959h = 4194304;
    @C0344h1

    /* renamed from: i */
    public static final int f56960i = 8;

    /* renamed from: j */
    public static final int f56961j = 2;

    /* renamed from: b */
    public final C22165h<C22169a, Object> f56962b;

    /* renamed from: c */
    public final C22170b f56963c;

    /* renamed from: d */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f56964d;

    /* renamed from: e */
    public final Map<Class<?>, C22156a<?>> f56965e;

    /* renamed from: f */
    public final int f56966f;

    /* renamed from: g */
    public int f56967g;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.j$a */
    public static final class C22169a implements C22176m {

        /* renamed from: a */
        public final C22170b f56968a;

        /* renamed from: b */
        public int f56969b;

        /* renamed from: c */
        public Class<?> f56970c;

        public C22169a(C22170b bVar) {
            this.f56968a = bVar;
        }

        /* renamed from: a */
        public void mo65943a() {
            this.f56968a.mo65952c(this);
        }

        /* renamed from: b */
        public void mo65985b(int i, Class<?> cls) {
            this.f56969b = i;
            this.f56970c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C22169a)) {
                return false;
            }
            C22169a aVar = (C22169a) obj;
            if (this.f56969b == aVar.f56969b && this.f56970c == aVar.f56970c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = this.f56969b * 31;
            Class<?> cls = this.f56970c;
            if (cls != null) {
                i = cls.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return "Key{size=" + this.f56969b + "array=" + this.f56970c + C12361b.f30259j;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.j$b */
    public static final class C22170b extends C22161d<C22169a> {
        /* renamed from: d */
        public C22169a mo65948a() {
            return new C22169a(this);
        }

        /* renamed from: e */
        public C22169a mo65990e(int i, Class<?> cls) {
            C22169a aVar = (C22169a) mo65951b();
            aVar.mo65985b(i, cls);
            return aVar;
        }
    }

    @C0344h1
    public C22168j() {
        this.f56962b = new C22165h<>();
        this.f56963c = new C22170b();
        this.f56964d = new HashMap();
        this.f56965e = new HashMap();
        this.f56966f = 4194304;
    }

    /* renamed from: a */
    public synchronized void mo65930a(int i) {
        if (i >= 40) {
            try {
                mo65931b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            mo65975i(this.f56966f / 2);
        }
    }

    /* renamed from: b */
    public synchronized void mo65931b() {
        mo65975i(0);
    }

    /* renamed from: c */
    public synchronized <T> T mo65932c(int i, Class<T> cls) {
        C22169a aVar;
        Integer ceilingKey = mo65981o(cls).ceilingKey(Integer.valueOf(i));
        if (mo65984r(i, ceilingKey)) {
            aVar = this.f56963c.mo65990e(ceilingKey.intValue(), cls);
        } else {
            aVar = this.f56963c.mo65990e(i, cls);
        }
        return mo65980n(aVar, cls);
    }

    /* renamed from: d */
    public synchronized <T> T mo65933d(int i, Class<T> cls) {
        return mo65980n(this.f56963c.mo65990e(i, cls), cls);
    }

    /* renamed from: e */
    public synchronized <T> void mo65934e(T t) {
        Class<?> cls = t.getClass();
        C22156a<?> k = mo65977k(cls);
        int b = k.mo65928b(t);
        int a = k.mo65927a() * b;
        if (mo65983q(a)) {
            C22169a e = this.f56963c.mo65990e(b, cls);
            this.f56962b.mo65965d(e, t);
            NavigableMap<Integer, Integer> o = mo65981o(cls);
            Integer num = o.get(Integer.valueOf(e.f56969b));
            Integer valueOf = Integer.valueOf(e.f56969b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            o.put(valueOf, Integer.valueOf(i));
            this.f56967g += a;
            mo65974h();
        }
    }

    @Deprecated
    /* renamed from: f */
    public <T> void mo65935f(T t, Class<T> cls) {
        mo65934e(t);
    }

    /* renamed from: g */
    public final void mo65973g(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> o = mo65981o(cls);
        Integer num = o.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            o.remove(Integer.valueOf(i));
        } else {
            o.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: h */
    public final void mo65974h() {
        mo65975i(this.f56966f);
    }

    /* renamed from: i */
    public final void mo65975i(int i) {
        while (this.f56967g > i) {
            Object f = this.f56962b.mo65966f();
            C22633m.m102624d(f);
            C22156a j = mo65976j(f);
            this.f56967g -= j.mo65928b(f) * j.mo65927a();
            mo65973g(j.mo65928b(f), f.getClass());
            if (Log.isLoggable(j.mo65926B(), 2)) {
                j.mo65926B();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(j.mo65928b(f));
            }
        }
    }

    /* renamed from: j */
    public final <T> C22156a<T> mo65976j(T t) {
        return mo65977k(t.getClass());
    }

    /* renamed from: k */
    public final <T> C22156a<T> mo65977k(Class<T> cls) {
        C22156a<T> aVar = this.f56965e.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C22167i();
            } else if (cls.equals(byte[].class)) {
                aVar = new C22164g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f56965e.put(cls, aVar);
        }
        return aVar;
    }

    @C0363p0
    /* renamed from: l */
    public final <T> T mo65978l(C22169a aVar) {
        return this.f56962b.mo65962a(aVar);
    }

    /* renamed from: m */
    public int mo65979m() {
        int i = 0;
        for (Class next : this.f56964d.keySet()) {
            for (Integer num : this.f56964d.get(next).keySet()) {
                i += num.intValue() * ((Integer) this.f56964d.get(next).get(num)).intValue() * mo65977k(next).mo65927a();
            }
        }
        return i;
    }

    /* renamed from: n */
    public final <T> T mo65980n(C22169a aVar, Class<T> cls) {
        C22156a<T> k = mo65977k(cls);
        T l = mo65978l(aVar);
        if (l != null) {
            this.f56967g -= k.mo65928b(l) * k.mo65927a();
            mo65973g(k.mo65928b(l), cls);
        }
        if (l != null) {
            return l;
        }
        if (Log.isLoggable(k.mo65926B(), 2)) {
            k.mo65926B();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(aVar.f56969b);
            sb.append(" bytes");
        }
        return k.newArray(aVar.f56969b);
    }

    /* renamed from: o */
    public final NavigableMap<Integer, Integer> mo65981o(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f56964d.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f56964d.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: p */
    public final boolean mo65982p() {
        int i = this.f56967g;
        return i == 0 || this.f56966f / i >= 2;
    }

    /* renamed from: q */
    public final boolean mo65983q(int i) {
        return i <= this.f56966f / 2;
    }

    /* renamed from: r */
    public final boolean mo65984r(int i, Integer num) {
        return num != null && (mo65982p() || num.intValue() <= i * 8);
    }

    public C22168j(int i) {
        this.f56962b = new C22165h<>();
        this.f56963c = new C22170b();
        this.f56964d = new HashMap();
        this.f56965e = new HashMap();
        this.f56966f = i;
    }
}
