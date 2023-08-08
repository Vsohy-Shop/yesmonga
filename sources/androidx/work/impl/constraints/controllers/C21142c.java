package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.C21137a;
import androidx.work.impl.constraints.trackers.C21164h;
import androidx.work.impl.model.C21249u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.work.impl.constraints.controllers.c */
public abstract class C21142c<T> implements C21137a<T> {
    @C12579k

    /* renamed from: a */
    public final C21164h<T> f54590a;
    @C12579k

    /* renamed from: b */
    public final List<C21249u> f54591b = new ArrayList();
    @C12579k

    /* renamed from: c */
    public final List<String> f54592c = new ArrayList();
    @C12580l

    /* renamed from: d */
    public T f54593d;
    @C12580l

    /* renamed from: e */
    public C21143a f54594e;

    /* renamed from: androidx.work.impl.constraints.controllers.c$a */
    public interface C21143a {
        /* renamed from: b */
        void mo63298b(@C12579k List<C21249u> list);

        /* renamed from: c */
        void mo63299c(@C12579k List<C21249u> list);
    }

    public C21142c(@C12579k C21164h<T> hVar) {
        Intrinsics.checkNotNullParameter(hVar, "tracker");
        this.f54590a = hVar;
    }

    /* renamed from: a */
    public void mo63275a(T t) {
        this.f54593d = t;
        mo63297i(this.f54594e, t);
    }

    @C12580l
    /* renamed from: b */
    public final C21143a mo63292b() {
        return this.f54594e;
    }

    /* renamed from: c */
    public abstract boolean mo63288c(@C12579k C21249u uVar);

    /* renamed from: d */
    public abstract boolean mo63289d(T t);

    /* renamed from: e */
    public final boolean mo63293e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "workSpecId");
        T t = this.f54593d;
        if (t == null || !mo63289d(t) || !this.f54592c.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo63294f(@C12579k Iterable<C21249u> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "workSpecs");
        this.f54591b.clear();
        this.f54592c.clear();
        Collection collection = this.f54591b;
        for (C21249u next : iterable) {
            if (mo63288c(next)) {
                collection.add(next);
            }
        }
        Collection collection2 = this.f54592c;
        for (C21249u uVar : this.f54591b) {
            collection2.add(uVar.f54804a);
        }
        if (this.f54591b.isEmpty()) {
            this.f54590a.mo63321g(this);
        } else {
            this.f54590a.mo63318c(this);
        }
        mo63297i(this.f54594e, this.f54593d);
    }

    /* renamed from: g */
    public final void mo63295g() {
        if (!this.f54591b.isEmpty()) {
            this.f54591b.clear();
            this.f54590a.mo63321g(this);
        }
    }

    /* renamed from: h */
    public final void mo63296h(@C12580l C21143a aVar) {
        if (this.f54594e != aVar) {
            this.f54594e = aVar;
            mo63297i(aVar, this.f54593d);
        }
    }

    /* renamed from: i */
    public final void mo63297i(C21143a aVar, T t) {
        if (!this.f54591b.isEmpty() && aVar != null) {
            if (t == null || mo63289d(t)) {
                aVar.mo63299c(this.f54591b);
            } else {
                aVar.mo63298b(this.f54591b);
            }
        }
    }
}
