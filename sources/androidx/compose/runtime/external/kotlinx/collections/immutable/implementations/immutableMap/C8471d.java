package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8443b;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8447e;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.C8489u;
import java.util.Map;
import java.util.Set;
import kotlin.C11532s0;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,85:1\n53#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n69#1:86\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d */
public final class C8471d<K, V> extends AbstractMap<K, V> implements C8452h<K, V> {
    @C12579k

    /* renamed from: f */
    public static final C8472a f22848f = new C8472a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: g */
    public static final C8471d f22849g = new C8471d(C8489u.f22873e.mo15910a(), 0);
    @C12579k

    /* renamed from: d */
    public final C8489u<K, V> f22850d;

    /* renamed from: e */
    public final int f22851e;

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d$a */
    public static final class C8472a {
        public /* synthetic */ C8472a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final <K, V> C8471d<K, V> mo15803a() {
            C8471d<K, V> l = C8471d.f22849g;
            Intrinsics.checkNotNull(l, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return l;
        }

        public C8472a() {
        }
    }

    public C8471d(@C12579k C8489u<K, V> uVar, int i) {
        Intrinsics.checkNotNullParameter(uVar, "node");
        this.f22850d = uVar;
        this.f22851e = i;
    }

    @C12579k
    @C11532s0
    /* renamed from: c */
    public final Set<Map.Entry<K, V>> mo15788c() {
        return mo15795n();
    }

    @C12579k
    public C8452h<K, V> clear() {
        return f22848f.mo15803a();
    }

    public boolean containsKey(Object obj) {
        return this.f22850d.mo15897n(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    /* renamed from: e */
    public int mo15791e() {
        return this.f22851e;
    }

    @C12580l
    public V get(Object obj) {
        return this.f22850d.mo15901r(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @C12579k
    /* renamed from: getValues */
    public C8443b<V> mo15792f() {
        return new C8487s(this);
    }

    @C12579k
    /* renamed from: k */
    public C8447e<K> mo15790d() {
        return new C8485q(this);
    }

    @C12579k
    /* renamed from: k0 */
    public C8447e<Map.Entry<K, V>> mo15636k0() {
        return mo15795n();
    }

    @C12579k
    /* renamed from: m */
    public C8474f<K, V> builder() {
        return new C8474f<>(this);
    }

    /* renamed from: n */
    public final C8447e<Map.Entry<K, V>> mo15795n() {
        return new C8483o(this);
    }

    /* renamed from: o */
    public final /* bridge */ C8447e<Map.Entry<K, V>> mo15796o() {
        return mo15636k0();
    }

    @C12579k
    /* renamed from: p */
    public final C8489u<K, V> mo15797p() {
        return this.f22850d;
    }

    @C12579k
    public C8452h<K, V> putAll(@C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "m");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        C8452h.C8453a builder = builder();
        builder.putAll(map);
        return builder.mo15671g();
    }

    /* renamed from: q */
    public final /* bridge */ C8447e<K> mo15798q() {
        return mo15790d();
    }

    @C12579k
    /* renamed from: r */
    public C8471d<K, V> put(K k, V v) {
        int i;
        C8489u<K, V> uVar = this.f22850d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        C8489u.C8491b<K, V> S = uVar.mo15876S(i, k, v, 0);
        if (S == null) {
            return this;
        }
        return new C8471d<>(S.mo15911a(), size() + S.mo15912b());
    }

    @C12579k
    /* renamed from: s */
    public C8471d<K, V> remove(K k) {
        int i;
        C8489u<K, V> uVar = this.f22850d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        C8489u<K, V> T = uVar.mo15877T(i, k, 0);
        if (this.f22850d == T) {
            return this;
        }
        if (T == null) {
            return f22848f.mo15803a();
        }
        return new C8471d<>(T, size() - 1);
    }

    @C12579k
    /* renamed from: t */
    public C8471d<K, V> remove(K k, V v) {
        int i;
        C8489u<K, V> uVar = this.f22850d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        C8489u<K, V> U = uVar.mo15878U(i, k, v, 0);
        if (this.f22850d == U) {
            return this;
        }
        if (U == null) {
            return f22848f.mo15803a();
        }
        return new C8471d<>(U, size() - 1);
    }

    /* renamed from: u */
    public final /* bridge */ C8443b<V> mo15802u() {
        return mo15792f();
    }
}
