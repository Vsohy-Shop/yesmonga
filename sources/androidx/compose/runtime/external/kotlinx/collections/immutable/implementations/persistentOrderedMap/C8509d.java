package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.C8471d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.C8474f;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8532c;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10931e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.d */
public final class C8509d<K, V> extends C10931e<K, V> implements C8452h.C8453a<K, V> {
    @C12579k

    /* renamed from: a */
    public C8507c<K, V> f22928a;
    @C12580l

    /* renamed from: b */
    public Object f22929b;
    @C12580l

    /* renamed from: c */
    public Object f22930c = this.f22928a.mo16023q();
    @C12579k

    /* renamed from: d */
    public final C8474f<K, C8505a<V>> f22931d = this.f22928a.mo16022p().builder();

    public C8509d(@C12579k C8507c<K, V> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "map");
        this.f22928a = cVar;
        this.f22929b = cVar.mo16021o();
    }

    @C12579k
    /* renamed from: a */
    public Set<Map.Entry<K, V>> mo15814a() {
        return new C8510e(this);
    }

    @C12579k
    /* renamed from: b */
    public Set<K> mo15815b() {
        return new C8512g(this);
    }

    /* renamed from: c */
    public int mo15816c() {
        return this.f22931d.size();
    }

    public void clear() {
        this.f22931d.clear();
        C8532c cVar = C8532c.f22972a;
        this.f22929b = cVar;
        this.f22930c = cVar;
    }

    public boolean containsKey(Object obj) {
        return this.f22931d.containsKey(obj);
    }

    @C12579k
    /* renamed from: d */
    public Collection<V> mo15819d() {
        return new C8515j(this);
    }

    @C12580l
    /* renamed from: e */
    public final Object mo16032e() {
        return this.f22929b;
    }

    @C12579k
    /* renamed from: f */
    public final C8474f<K, C8505a<V>> mo16033f() {
        return this.f22931d;
    }

    @C12579k
    /* renamed from: g */
    public C8452h<K, V> mo15671g() {
        C8507c<K, V> cVar;
        boolean z;
        C8471d<K, C8505a<V>> e = this.f22931d.mo15671g();
        if (e == this.f22928a.mo16022p()) {
            boolean z2 = true;
            if (this.f22929b == this.f22928a.mo16021o()) {
                z = true;
            } else {
                z = false;
            }
            C8530a.m30952a(z);
            if (this.f22930c != this.f22928a.mo16023q()) {
                z2 = false;
            }
            C8530a.m30952a(z2);
            cVar = this.f22928a;
        } else {
            cVar = new C8507c<>(this.f22929b, this.f22930c, e);
        }
        this.f22928a = cVar;
        return cVar;
    }

    @C12580l
    public V get(Object obj) {
        C8505a aVar = this.f22931d.get(obj);
        if (aVar != null) {
            return aVar.mo16015e();
        }
        return null;
    }

    @C12580l
    public V put(K k, V v) {
        C8505a aVar = this.f22931d.get(k);
        if (aVar != null) {
            if (aVar.mo16015e() == v) {
                return v;
            }
            this.f22931d.put(k, aVar.mo16018h(v));
            return aVar.mo16015e();
        } else if (isEmpty()) {
            this.f22929b = k;
            this.f22930c = k;
            this.f22931d.put(k, new C8505a(v));
            return null;
        } else {
            Object obj = this.f22930c;
            C8505a<V> aVar2 = this.f22931d.get(obj);
            Intrinsics.checkNotNull(aVar2);
            C8505a aVar3 = aVar2;
            C8530a.m30952a(!aVar3.mo16011a());
            this.f22931d.put(obj, aVar3.mo16016f(k));
            this.f22931d.put(k, new C8505a(v, obj));
            this.f22930c = k;
            return null;
        }
    }

    @C12580l
    public V remove(Object obj) {
        C8505a remove = this.f22931d.remove(obj);
        if (remove == null) {
            return null;
        }
        if (remove.mo16012b()) {
            C8505a<V> aVar = this.f22931d.get(remove.mo16014d());
            Intrinsics.checkNotNull(aVar);
            this.f22931d.put(remove.mo16014d(), aVar.mo16016f(remove.mo16013c()));
        } else {
            this.f22929b = remove.mo16013c();
        }
        if (remove.mo16011a()) {
            C8505a<V> aVar2 = this.f22931d.get(remove.mo16013c());
            Intrinsics.checkNotNull(aVar2);
            this.f22931d.put(remove.mo16013c(), aVar2.mo16017g(remove.mo16014d()));
        } else {
            this.f22930c = remove.mo16014d();
        }
        return remove.mo16015e();
    }

    public final boolean remove(Object obj, Object obj2) {
        C8505a aVar = this.f22931d.get(obj);
        if (aVar == null || !Intrinsics.areEqual(aVar.mo16015e(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
