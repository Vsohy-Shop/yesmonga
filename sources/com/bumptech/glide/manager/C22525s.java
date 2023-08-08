package com.bumptech.glide.manager;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.request.C22557e;
import com.bumptech.glide.util.C22635o;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.s */
public class C22525s {

    /* renamed from: d */
    public static final String f57721d = "RequestTracker";

    /* renamed from: a */
    public final Set<C22557e> f57722a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final Set<C22557e> f57723b = new HashSet();

    /* renamed from: c */
    public boolean f57724c;

    @C0344h1
    /* renamed from: a */
    public void mo66624a(C22557e eVar) {
        this.f57722a.add(eVar);
    }

    /* renamed from: b */
    public boolean mo66625b(@C0363p0 C22557e eVar) {
        boolean z = true;
        if (eVar == null) {
            return true;
        }
        boolean remove = this.f57722a.remove(eVar);
        if (!this.f57723b.remove(eVar) && !remove) {
            z = false;
        }
        if (z) {
            eVar.clear();
        }
        return z;
    }

    /* renamed from: c */
    public void mo66626c() {
        for (T b : C22635o.m102636k(this.f57722a)) {
            mo66625b(b);
        }
        this.f57723b.clear();
    }

    /* renamed from: d */
    public boolean mo66627d() {
        return this.f57724c;
    }

    /* renamed from: e */
    public void mo66628e() {
        this.f57724c = true;
        for (T t : C22635o.m102636k(this.f57722a)) {
            if (t.isRunning() || t.mo66706b()) {
                t.clear();
                this.f57723b.add(t);
            }
        }
    }

    /* renamed from: f */
    public void mo66629f() {
        this.f57724c = true;
        for (T t : C22635o.m102636k(this.f57722a)) {
            if (t.isRunning()) {
                t.mo66704Z();
                this.f57723b.add(t);
            }
        }
    }

    /* renamed from: g */
    public void mo66630g() {
        for (T t : C22635o.m102636k(this.f57722a)) {
            if (!t.mo66706b() && !t.mo66711f()) {
                t.clear();
                if (!this.f57724c) {
                    t.mo66714i();
                } else {
                    this.f57723b.add(t);
                }
            }
        }
    }

    /* renamed from: h */
    public void mo66631h() {
        this.f57724c = false;
        for (T t : C22635o.m102636k(this.f57722a)) {
            if (!t.mo66706b() && !t.isRunning()) {
                t.mo66714i();
            }
        }
        this.f57723b.clear();
    }

    /* renamed from: i */
    public void mo66632i(@C0359n0 C22557e eVar) {
        this.f57722a.add(eVar);
        if (!this.f57724c) {
            eVar.mo66714i();
            return;
        }
        eVar.clear();
        this.f57723b.add(eVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f57722a.size() + ", isPaused=" + this.f57724c + "}";
    }
}
