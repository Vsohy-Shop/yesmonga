package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8454i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8531b;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8535f;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10934f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b */
public final class C8499b<E> extends C10934f<E> implements C8454i.C8455a<E> {
    @C12579k

    /* renamed from: a */
    public C8497a<E> f22899a;
    @C12579k

    /* renamed from: b */
    public C8535f f22900b = new C8535f();
    @C12579k

    /* renamed from: c */
    public C8502e<E> f22901c = this.f22899a.mo15934i();

    /* renamed from: d */
    public int f22902d;

    /* renamed from: e */
    public int f22903e = this.f22899a.size();

    public C8499b(@C12579k C8497a<E> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "set");
        this.f22899a = aVar;
    }

    public boolean add(E e) {
        int i;
        int size = size();
        C8502e<E> eVar = this.f22901c;
        if (e != null) {
            i = e.hashCode();
        } else {
            i = 0;
        }
        this.f22901c = eVar.mo15996u(i, e, 0, this);
        if (size != size()) {
            return true;
        }
        return false;
    }

    public boolean addAll(@C12579k Collection<? extends E> collection) {
        C8497a aVar;
        C8499b bVar;
        Intrinsics.checkNotNullParameter(collection, "elements");
        if (collection instanceof C8497a) {
            aVar = (C8497a) collection;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            if (collection instanceof C8499b) {
                bVar = (C8499b) collection;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                aVar = bVar.m30798g();
            } else {
                aVar = null;
            }
        }
        if (aVar == null) {
            return super.addAll(collection);
        }
        C8531b bVar2 = new C8531b(0, 1, (DefaultConstructorMarker) null);
        int size = size();
        C8502e<E> v = this.f22901c.mo15997v(aVar.mo15934i(), 0, bVar2, this);
        int size2 = (collection.size() + size) - bVar2.mo16115d();
        if (size != size2) {
            this.f22901c = v;
            mo15948w(size2);
        }
        if (size != size()) {
            return true;
        }
        return false;
    }

    public void clear() {
        C8502e<E> a = C8502e.f22911d.mo16002a();
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.f22901c = a;
        mo15948w(0);
    }

    public boolean contains(Object obj) {
        return this.f22901c.mo15984i(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        if (collection instanceof C8497a) {
            return this.f22901c.mo15985j(((C8497a) collection).mo15934i(), 0);
        }
        if (collection instanceof C8499b) {
            return this.f22901c.mo15985j(((C8499b) collection).f22901c, 0);
        }
        return super.containsAll(collection);
    }

    /* renamed from: e */
    public int mo15840e() {
        return this.f22903e;
    }

    @C12579k
    /* renamed from: h */
    public C8497a<E> m30798g() {
        C8497a<E> aVar;
        if (this.f22901c == this.f22899a.mo15934i()) {
            aVar = this.f22899a;
        } else {
            this.f22900b = new C8535f();
            aVar = new C8497a<>(this.f22901c, size());
        }
        this.f22899a = aVar;
        return aVar;
    }

    /* renamed from: i */
    public final int mo15941i() {
        return this.f22902d;
    }

    @C12579k
    public Iterator<E> iterator() {
        return new C8501d(this);
    }

    @C12579k
    /* renamed from: q */
    public final C8502e<E> mo15943q() {
        return this.f22901c;
    }

    @C12579k
    /* renamed from: r */
    public final C8535f mo15944r() {
        return this.f22900b;
    }

    public boolean remove(Object obj) {
        int i;
        int size = size();
        C8502e<E> eVar = this.f22901c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.f22901c = eVar.mo15965E(i, obj, 0, this);
        if (size != size()) {
            return true;
        }
        return false;
    }

    public boolean removeAll(@C12579k Collection<? extends Object> collection) {
        C8497a aVar;
        C8499b bVar;
        Intrinsics.checkNotNullParameter(collection, "elements");
        if (collection instanceof C8497a) {
            aVar = (C8497a) collection;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            if (collection instanceof C8499b) {
                bVar = (C8499b) collection;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                aVar = bVar.m30798g();
            } else {
                aVar = null;
            }
        }
        if (aVar == null) {
            return super.removeAll(collection);
        }
        C8531b bVar2 = new C8531b(0, 1, (DefaultConstructorMarker) null);
        int size = size();
        Object F = this.f22901c.mo15966F(aVar.mo15934i(), 0, bVar2, this);
        int d = size - bVar2.mo16115d();
        if (d == 0) {
            clear();
        } else if (d != size) {
            Intrinsics.checkNotNull(F, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f22901c = (C8502e) F;
            mo15948w(d);
        }
        if (size != size()) {
            return true;
        }
        return false;
    }

    public boolean retainAll(@C12579k Collection<? extends Object> collection) {
        C8497a aVar;
        C8499b bVar;
        Intrinsics.checkNotNullParameter(collection, "elements");
        if (collection instanceof C8497a) {
            aVar = (C8497a) collection;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            if (collection instanceof C8499b) {
                bVar = (C8499b) collection;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                aVar = bVar.m30798g();
            } else {
                aVar = null;
            }
        }
        if (aVar == null) {
            return super.retainAll(collection);
        }
        C8531b bVar2 = new C8531b(0, 1, (DefaultConstructorMarker) null);
        int size = size();
        Object H = this.f22901c.mo15968H(aVar.mo15934i(), 0, bVar2, this);
        int d = bVar2.mo16115d();
        if (d == 0) {
            clear();
        } else if (d != size) {
            Intrinsics.checkNotNull(H, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f22901c = (C8502e) H;
            mo15948w(d);
        }
        if (size != size()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public void mo15948w(int i) {
        this.f22903e = i;
        this.f22902d++;
    }
}
