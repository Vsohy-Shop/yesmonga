package com.google.maps.android.collections;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;
import com.google.android.gms.maps.C30412c;
import com.google.maps.android.collections.C33793c.C33795b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.maps.android.collections.c */
public abstract class C33793c<O, C extends C33795b> {

    /* renamed from: a */
    public final C30412c f81977a;

    /* renamed from: b */
    public final Map<String, C> f81978b = new HashMap();

    /* renamed from: c */
    public final Map<O, C> f81979c = new HashMap();

    /* renamed from: com.google.maps.android.collections.c$a */
    public class C33794a implements Runnable {
        public C33794a() {
        }

        public void run() {
            C33793c.this.mo98160q();
        }
    }

    /* renamed from: com.google.maps.android.collections.c$b */
    public class C33795b {

        /* renamed from: a */
        public final Set<O> f81981a = new LinkedHashSet();

        public C33795b() {
        }

        /* renamed from: a */
        public void mo98182a(O o) {
            this.f81981a.add(o);
            C33793c.this.f81979c.put(o, this);
        }

        /* renamed from: b */
        public void mo98183b() {
            for (O next : this.f81981a) {
                C33793c.this.mo98159p(next);
                C33793c.this.f81979c.remove(next);
            }
            this.f81981a.clear();
        }

        /* renamed from: c */
        public Collection<O> mo98184c() {
            return Collections.unmodifiableCollection(this.f81981a);
        }

        /* renamed from: d */
        public boolean mo98185d(O o) {
            if (!this.f81981a.remove(o)) {
                return false;
            }
            C33793c.this.f81979c.remove(o);
            C33793c.this.mo98159p(o);
            return true;
        }
    }

    public C33793c(@C0359n0 C30412c cVar) {
        this.f81977a = cVar;
        new Handler(Looper.getMainLooper()).post(new C33794a());
    }

    /* renamed from: l */
    public C mo98155l(String str) {
        return (C33795b) this.f81978b.get(str);
    }

    /* renamed from: m */
    public abstract C mo98156m();

    /* renamed from: n */
    public C mo98157n(String str) {
        if (this.f81978b.get(str) == null) {
            C m = mo98156m();
            this.f81978b.put(str, m);
            return m;
        }
        throw new IllegalArgumentException("collection id is not unique: " + str);
    }

    /* renamed from: o */
    public boolean mo98158o(O o) {
        C33795b bVar = (C33795b) this.f81979c.get(o);
        if (bVar == null || !bVar.mo98185d(o)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public abstract void mo98159p(O o);

    /* renamed from: q */
    public abstract void mo98160q();
}
