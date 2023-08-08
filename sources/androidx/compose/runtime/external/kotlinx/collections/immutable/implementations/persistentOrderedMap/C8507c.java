package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8443b;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8447e;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.C8471d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8532c;
import java.util.Map;
import java.util.Set;
import kotlin.C11532s0;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPersistentOrderedMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,135:1\n53#2:136\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n*L\n119#1:136\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c */
public final class C8507c<K, V> extends AbstractMap<K, V> implements C8452h<K, V> {
    @C12579k

    /* renamed from: g */
    public static final C8508a f22923g = new C8508a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: v */
    public static final C8507c f22924v;
    @C12580l

    /* renamed from: d */
    public final Object f22925d;
    @C12580l

    /* renamed from: e */
    public final Object f22926e;
    @C12579k

    /* renamed from: f */
    public final C8471d<K, C8505a<V>> f22927f;

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c$a */
    public static final class C8508a {
        public /* synthetic */ C8508a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final <K, V> C8507c<K, V> mo16029a() {
            C8507c<K, V> l = C8507c.f22924v;
            Intrinsics.checkNotNull(l, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return l;
        }

        public C8508a() {
        }
    }

    static {
        C8532c cVar = C8532c.f22972a;
        f22924v = new C8507c(cVar, cVar, C8471d.f22848f.mo15803a());
    }

    public C8507c(@C12580l Object obj, @C12580l Object obj2, @C12579k C8471d<K, C8505a<V>> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "hashMap");
        this.f22925d = obj;
        this.f22926e = obj2;
        this.f22927f = dVar;
    }

    @C12579k
    public C8452h.C8453a<K, V> builder() {
        return new C8509d(this);
    }

    @C12579k
    @C11532s0
    /* renamed from: c */
    public final Set<Map.Entry<K, V>> mo15788c() {
        return mo16019m();
    }

    @C12579k
    public C8452h<K, V> clear() {
        return f22923g.mo16029a();
    }

    public boolean containsKey(Object obj) {
        return this.f22927f.containsKey(obj);
    }

    /* renamed from: e */
    public int mo15791e() {
        return this.f22927f.size();
    }

    @C12580l
    public V get(Object obj) {
        C8505a aVar = this.f22927f.get(obj);
        if (aVar != null) {
            return aVar.mo16015e();
        }
        return null;
    }

    @C12579k
    /* renamed from: getValues */
    public C8443b<V> mo15792f() {
        return new C8522q(this);
    }

    @C12579k
    /* renamed from: k */
    public C8447e<K> mo15790d() {
        return new C8519n(this);
    }

    @C12579k
    /* renamed from: k0 */
    public C8447e<Map.Entry<K, V>> mo15636k0() {
        return mo16019m();
    }

    /* renamed from: m */
    public final C8447e<Map.Entry<K, V>> mo16019m() {
        return new C8517l(this);
    }

    /* renamed from: n */
    public final /* bridge */ C8447e<Map.Entry<K, V>> mo16020n() {
        return mo15636k0();
    }

    @C12580l
    /* renamed from: o */
    public final Object mo16021o() {
        return this.f22925d;
    }

    @C12579k
    /* renamed from: p */
    public final C8471d<K, C8505a<V>> mo16022p() {
        return this.f22927f;
    }

    @C12579k
    public C8452h<K, V> putAll(@C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "m");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        C8452h.C8453a builder = builder();
        builder.putAll(map);
        return builder.mo15671g();
    }

    @C12580l
    /* renamed from: q */
    public final Object mo16023q() {
        return this.f22926e;
    }

    /* renamed from: r */
    public final /* bridge */ C8447e<K> mo16024r() {
        return mo15790d();
    }

    @C12579k
    /* renamed from: s */
    public C8507c<K, V> put(K k, V v) {
        if (isEmpty()) {
            return new C8507c<>(k, k, this.f22927f.put(k, new C8505a(v)));
        }
        C8505a aVar = this.f22927f.get(k);
        if (aVar == null) {
            Object obj = this.f22926e;
            C8505a<V> aVar2 = this.f22927f.get(obj);
            Intrinsics.checkNotNull(aVar2);
            return new C8507c<>(this.f22925d, k, this.f22927f.put(obj, aVar2.mo16016f(k)).put(k, new C8505a(v, obj)));
        } else if (aVar.mo16015e() == v) {
            return this;
        } else {
            return new C8507c<>(this.f22925d, this.f22926e, this.f22927f.put(k, aVar.mo16018h(v)));
        }
    }

    @C12579k
    /* renamed from: t */
    public C8507c<K, V> remove(K k) {
        Object obj;
        Object obj2;
        C8505a aVar = this.f22927f.get(k);
        if (aVar == null) {
            return this;
        }
        C8471d<K, C8505a<V>> s = this.f22927f.remove(k);
        if (aVar.mo16012b()) {
            C8505a<V> aVar2 = s.get(aVar.mo16014d());
            Intrinsics.checkNotNull(aVar2);
            s = s.put(aVar.mo16014d(), aVar2.mo16016f(aVar.mo16013c()));
        }
        if (aVar.mo16011a()) {
            C8505a<V> aVar3 = s.get(aVar.mo16013c());
            Intrinsics.checkNotNull(aVar3);
            s = s.put(aVar.mo16013c(), aVar3.mo16017g(aVar.mo16014d()));
        }
        if (!aVar.mo16012b()) {
            obj = aVar.mo16013c();
        } else {
            obj = this.f22925d;
        }
        if (!aVar.mo16011a()) {
            obj2 = aVar.mo16014d();
        } else {
            obj2 = this.f22926e;
        }
        return new C8507c<>(obj, obj2, s);
    }

    @C12579k
    /* renamed from: u */
    public C8507c<K, V> remove(K k, V v) {
        C8505a aVar = this.f22927f.get(k);
        if (aVar == null) {
            return this;
        }
        if (Intrinsics.areEqual(aVar.mo16015e(), (Object) v)) {
            return remove(k);
        }
        return this;
    }

    /* renamed from: v */
    public final /* bridge */ C8443b<V> mo16028v() {
        return mo15792f();
    }
}
