package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8532c;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i */
public class C8514i<K, V> implements Iterator<C8505a<V>>, C11348d {
    @C12580l

    /* renamed from: a */
    public Object f22936a;
    @C12579k

    /* renamed from: b */
    public final C8509d<K, V> f22937b;
    @C12580l

    /* renamed from: c */
    public Object f22938c = C8532c.f22972a;

    /* renamed from: d */
    public boolean f22939d;

    /* renamed from: e */
    public int f22940e;

    /* renamed from: f */
    public int f22941f;

    public C8514i(@C12580l Object obj, @C12579k C8509d<K, V> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "builder");
        this.f22936a = obj;
        this.f22937b = dVar;
        this.f22940e = dVar.mo16033f().mo15821f();
    }

    /* renamed from: b */
    public final void mo16051b() {
        if (this.f22937b.mo16033f().mo15821f() != this.f22940e) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public final void mo16052c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d */
    public final void mo16053d() {
        if (!this.f22939d) {
            throw new IllegalStateException();
        }
    }

    @C12579k
    /* renamed from: e */
    public final C8509d<K, V> mo16054e() {
        return this.f22937b;
    }

    /* renamed from: f */
    public final int mo16055f() {
        return this.f22941f;
    }

    @C12580l
    /* renamed from: h */
    public final Object mo16056h() {
        return this.f22938c;
    }

    public boolean hasNext() {
        return this.f22941f < this.f22937b.size();
    }

    @C12579k
    /* renamed from: j */
    public C8505a<V> next() {
        mo16051b();
        mo16052c();
        this.f22938c = this.f22936a;
        this.f22939d = true;
        this.f22941f++;
        C8505a<V> aVar = this.f22937b.mo16033f().get(this.f22936a);
        if (aVar != null) {
            C8505a<V> aVar2 = aVar;
            this.f22936a = aVar2.mo16013c();
            return aVar2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f22936a + ") has changed after it was added to the persistent map.");
    }

    /* renamed from: l */
    public final void mo16059l(int i) {
        this.f22941f = i;
    }

    /* renamed from: m */
    public final void mo16060m(@C12580l Object obj) {
        this.f22938c = obj;
    }

    public void remove() {
        mo16053d();
        C11370u0.m43695k(this.f22937b).remove(this.f22938c);
        this.f22938c = null;
        this.f22939d = false;
        this.f22940e = this.f22937b.mo16033f().mo15821f();
        this.f22941f--;
    }
}
