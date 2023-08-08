package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8531b;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8535f;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10931e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f */
public final class C8474f<K, V> extends C10931e<K, V> implements C8452h.C8453a<K, V> {
    @C12579k

    /* renamed from: a */
    public C8471d<K, V> f22855a;
    @C12579k

    /* renamed from: b */
    public C8535f f22856b = new C8535f();
    @C12579k

    /* renamed from: c */
    public C8489u<K, V> f22857c = this.f22855a.mo15797p();
    @C12580l

    /* renamed from: d */
    public V f22858d;

    /* renamed from: e */
    public int f22859e;

    /* renamed from: f */
    public int f22860f = this.f22855a.size();

    public C8474f(@C12579k C8471d<K, V> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "map");
        this.f22855a = dVar;
    }

    @C12579k
    /* renamed from: a */
    public Set<Map.Entry<K, V>> mo15814a() {
        return new C8476h(this);
    }

    @C12579k
    /* renamed from: b */
    public Set<K> mo15815b() {
        return new C8478j(this);
    }

    /* renamed from: c */
    public int mo15816c() {
        return this.f22860f;
    }

    public void clear() {
        C8489u<K, V> a = C8489u.f22873e.mo15910a();
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f22857c = a;
        mo15829o(0);
    }

    public boolean containsKey(Object obj) {
        return this.f22857c.mo15897n(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @C12579k
    /* renamed from: d */
    public Collection<V> mo15819d() {
        return new C8480l(this);
    }

    @C12579k
    /* renamed from: e */
    public C8471d<K, V> mo15671g() {
        C8471d<K, V> dVar;
        if (this.f22857c == this.f22855a.mo15797p()) {
            dVar = this.f22855a;
        } else {
            this.f22856b = new C8535f();
            dVar = new C8471d<>(this.f22857c, size());
        }
        this.f22855a = dVar;
        return dVar;
    }

    /* renamed from: f */
    public final int mo15821f() {
        return this.f22859e;
    }

    @C12580l
    public V get(Object obj) {
        return this.f22857c.mo15901r(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @C12579k
    /* renamed from: h */
    public final C8489u<K, V> mo15823h() {
        return this.f22857c;
    }

    @C12580l
    /* renamed from: i */
    public final V mo15824i() {
        return this.f22858d;
    }

    @C12579k
    /* renamed from: j */
    public final C8535f mo15825j() {
        return this.f22856b;
    }

    /* renamed from: l */
    public final void mo15826l(int i) {
        this.f22859e = i;
    }

    /* renamed from: m */
    public final void mo15827m(@C12579k C8489u<K, V> uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<set-?>");
        this.f22857c = uVar;
    }

    /* renamed from: n */
    public final void mo15828n(@C12580l V v) {
        this.f22858d = v;
    }

    /* renamed from: o */
    public void mo15829o(int i) {
        this.f22860f = i;
        this.f22859e++;
    }

    @C12580l
    public V put(K k, V v) {
        int i;
        this.f22858d = null;
        C8489u<K, V> uVar = this.f22857c;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        this.f22857c = uVar.mo15864G(i, k, v, 0, this);
        return this.f22858d;
    }

    public void putAll(@C12579k Map<? extends K, ? extends V> map) {
        C8471d dVar;
        C8474f fVar;
        Intrinsics.checkNotNullParameter(map, "from");
        if (map instanceof C8471d) {
            dVar = (C8471d) map;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            if (map instanceof C8474f) {
                fVar = (C8474f) map;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                dVar = fVar.mo15671g();
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            C8531b bVar = new C8531b(0, 1, (DefaultConstructorMarker) null);
            int size = size();
            C8489u<K, V> uVar = this.f22857c;
            C8489u p = dVar.mo15797p();
            Intrinsics.checkNotNull(p, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.f22857c = uVar.mo15865H(p, 0, bVar, this);
            int size2 = (dVar.size() + size) - bVar.mo16115d();
            if (size != size2) {
                mo15829o(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @C12580l
    public V remove(Object obj) {
        this.f22858d = null;
        C8489u<K, V> J = this.f22857c.mo15867J(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (J == null) {
            J = C8489u.f22873e.mo15910a();
            Intrinsics.checkNotNull(J, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f22857c = J;
        return this.f22858d;
    }

    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        C8489u<K, V> K = this.f22857c.mo15868K(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (K == null) {
            K = C8489u.f22873e.mo15910a();
            Intrinsics.checkNotNull(K, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f22857c = K;
        if (size != size()) {
            return true;
        }
        return false;
    }
}
