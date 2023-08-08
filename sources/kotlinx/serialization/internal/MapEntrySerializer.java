package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.C11532s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12227i;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
public final class MapEntrySerializer<K, V> extends C12285k0<K, V, Map.Entry<? extends K, ? extends V>> {
    @C12579k

    /* renamed from: c */
    public final C12217f f30028c;

    /* renamed from: kotlinx.serialization.internal.MapEntrySerializer$a */
    public static final class C12251a<K, V> implements Map.Entry<K, V>, C11345a {

        /* renamed from: a */
        public final K f30029a;

        /* renamed from: b */
        public final V f30030b;

        public C12251a(K k, V v) {
            this.f30029a = k;
            this.f30030b = v;
        }

        /* renamed from: d */
        public static /* synthetic */ C12251a m49082d(C12251a aVar, Object obj, Object obj2, int i, Object obj3) {
            if ((i & 1) != 0) {
                obj = aVar.getKey();
            }
            if ((i & 2) != 0) {
                obj2 = aVar.getValue();
            }
            return aVar.mo24952c(obj, obj2);
        }

        /* renamed from: a */
        public final K mo24950a() {
            return getKey();
        }

        /* renamed from: b */
        public final V mo24951b() {
            return getValue();
        }

        @C12579k
        /* renamed from: c */
        public final C12251a<K, V> mo24952c(K k, V v) {
            return new C12251a<>(k, v);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12251a)) {
                return false;
            }
            C12251a aVar = (C12251a) obj;
            return Intrinsics.areEqual(getKey(), aVar.getKey()) && Intrinsics.areEqual(getValue(), aVar.getValue());
        }

        public K getKey() {
            return this.f30029a;
        }

        public V getValue() {
            return this.f30030b;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (getKey() == null ? 0 : getKey().hashCode()) * 31;
            if (getValue() != null) {
                i = getValue().hashCode();
            }
            return hashCode + i;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @C12579k
        public String toString() {
            return "MapEntry(key=" + getKey() + ", value=" + getValue() + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(@C12579k C12248g<K> gVar, @C12579k C12248g<V> gVar2) {
        super(gVar, gVar2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(gVar, "keySerializer");
        Intrinsics.checkNotNullParameter(gVar2, "valueSerializer");
        this.f30028c = SerialDescriptorsKt.m48845e("kotlin.collections.Map.Entry", C12227i.C12230c.f30013a, new C12217f[0], new MapEntrySerializer$descriptor$1(gVar, gVar2));
    }

    /* renamed from: f */
    public K mo24944a(@C12579k Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    /* renamed from: g */
    public V mo24945c(@C12579k Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30028c;
    }

    @C12579k
    /* renamed from: h */
    public Map.Entry<K, V> mo24946e(K k, V v) {
        return new C12251a(k, v);
    }
}
