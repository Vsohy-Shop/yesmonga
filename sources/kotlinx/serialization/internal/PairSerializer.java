package kotlinx.serialization.internal;

import kotlin.C11078d1;
import kotlin.C11532s0;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.jetbrains.annotations.C12579k;

@C11532s0
public final class PairSerializer<K, V> extends C12285k0<K, V, Pair<? extends K, ? extends V>> {
    @C12579k

    /* renamed from: c */
    public final C12217f f30034c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairSerializer(@C12579k C12248g<K> gVar, @C12579k C12248g<V> gVar2) {
        super(gVar, gVar2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(gVar, "keySerializer");
        Intrinsics.checkNotNullParameter(gVar2, "valueSerializer");
        this.f30034c = SerialDescriptorsKt.m48843c("kotlin.Pair", new C12217f[0], new PairSerializer$descriptor$1(gVar, gVar2));
    }

    /* renamed from: f */
    public K mo24944a(@C12579k Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.mo21849e();
    }

    /* renamed from: g */
    public V mo24945c(@C12579k Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.mo21851f();
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30034c;
    }

    @C12579k
    /* renamed from: h */
    public Pair<K, V> mo24946e(K k, V v) {
        return C11078d1.m42659a(k, v);
    }
}
