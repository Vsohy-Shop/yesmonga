package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8454i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.C8471d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.C8474f;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8532c;
import java.util.Iterator;
import kotlin.collections.C10934f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.c */
public final class C8527c<E> extends C10934f<E> implements C8454i.C8455a<E> {
    @C12579k

    /* renamed from: a */
    public C8525b<E> f22960a;
    @C12580l

    /* renamed from: b */
    public Object f22961b;
    @C12580l

    /* renamed from: c */
    public Object f22962c = this.f22960a.mo16096r();
    @C12579k

    /* renamed from: d */
    public final C8474f<E, C8524a> f22963d = this.f22960a.mo16095q().builder();

    public C8527c(@C12579k C8525b<E> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "set");
        this.f22960a = bVar;
        this.f22961b = bVar.mo16094i();
    }

    public boolean add(E e) {
        if (this.f22963d.containsKey(e)) {
            return false;
        }
        if (isEmpty()) {
            this.f22961b = e;
            this.f22962c = e;
            this.f22963d.put(e, new C8524a());
            return true;
        }
        C8524a aVar = this.f22963d.get(this.f22962c);
        Intrinsics.checkNotNull(aVar);
        this.f22963d.put(this.f22962c, aVar.mo16092e(e));
        this.f22963d.put(e, new C8524a(this.f22962c));
        this.f22962c = e;
        return true;
    }

    public void clear() {
        this.f22963d.clear();
        C8532c cVar = C8532c.f22972a;
        this.f22961b = cVar;
        this.f22962c = cVar;
    }

    public boolean contains(Object obj) {
        return this.f22963d.containsKey(obj);
    }

    /* renamed from: e */
    public int mo15840e() {
        return this.f22963d.size();
    }

    @C12580l
    /* renamed from: h */
    public final Object mo16100h() {
        return this.f22961b;
    }

    @C12579k
    /* renamed from: i */
    public final C8474f<E, C8524a> mo16101i() {
        return this.f22963d;
    }

    @C12579k
    public Iterator<E> iterator() {
        return new C8529e(this);
    }

    /* renamed from: q */
    public final void mo16103q(@C12580l Object obj) {
        this.f22961b = obj;
    }

    public boolean remove(Object obj) {
        C8524a remove = this.f22963d.remove(obj);
        if (remove == null) {
            return false;
        }
        if (remove.mo16089b()) {
            C8524a aVar = this.f22963d.get(remove.mo16091d());
            Intrinsics.checkNotNull(aVar);
            this.f22963d.put(remove.mo16091d(), aVar.mo16092e(remove.mo16090c()));
        } else {
            this.f22961b = remove.mo16090c();
        }
        if (remove.mo16088a()) {
            C8524a aVar2 = this.f22963d.get(remove.mo16090c());
            Intrinsics.checkNotNull(aVar2);
            this.f22963d.put(remove.mo16090c(), aVar2.mo16093f(remove.mo16091d()));
            return true;
        }
        this.f22962c = remove.mo16091d();
        return true;
    }

    @C12579k
    /* renamed from: g */
    public C8454i<E> m30942g() {
        C8525b<E> bVar;
        C8471d<E, C8524a> e = this.f22963d.mo15671g();
        if (e == this.f22960a.mo16095q()) {
            boolean z = true;
            C8530a.m30952a(this.f22961b == this.f22960a.mo16094i());
            if (this.f22962c != this.f22960a.mo16096r()) {
                z = false;
            }
            C8530a.m30952a(z);
            bVar = this.f22960a;
        } else {
            bVar = new C8525b<>(this.f22961b, this.f22962c, e);
        }
        this.f22960a = bVar;
        return bVar;
    }
}
