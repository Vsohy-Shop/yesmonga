package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8447e;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C10937g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPersistentHashMapContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.o */
public final class C8483o<K, V> extends C10937g<Map.Entry<? extends K, ? extends V>> implements C8447e<Map.Entry<? extends K, ? extends V>> {
    @C12579k

    /* renamed from: b */
    public final C8471d<K, V> f22870b;

    public C8483o(@C12579k C8471d<K, V> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "map");
        this.f22870b = dVar;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo15857h((Map.Entry) obj);
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f22870b.size();
    }

    /* renamed from: h */
    public boolean mo15857h(@C12579k Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        V v = this.f22870b.get(entry.getKey());
        if (v != null) {
            return Intrinsics.areEqual((Object) v, (Object) entry.getValue());
        }
        if (entry.getValue() != null || !this.f22870b.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @C12579k
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C8484p(this.f22870b.mo15797p());
    }
}
