package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.C8467a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPersistentOrderedMapBuilderContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMapBuilderContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.e */
public final class C8510e<K, V> extends C8467a<Map.Entry<K, V>, K, V> {
    @C12579k

    /* renamed from: a */
    public final C8509d<K, V> f22932a;

    public C8510e(@C12579k C8509d<K, V> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "builder");
        this.f22932a = dVar;
    }

    public void clear() {
        this.f22932a.clear();
    }

    /* renamed from: e */
    public int mo15840e() {
        return this.f22932a.size();
    }

    /* renamed from: i */
    public boolean mo15776i(@C12579k Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        V v = this.f22932a.get(entry.getKey());
        if (v != null) {
            return Intrinsics.areEqual((Object) v, (Object) entry.getValue());
        }
        if (entry.getValue() != null || !this.f22932a.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @C12579k
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C8511f(this.f22932a);
    }

    /* renamed from: r */
    public boolean mo15778r(@C12579k Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        return this.f22932a.remove(entry.getKey(), entry.getValue());
    }

    /* renamed from: w */
    public boolean add(@C12579k Map.Entry<K, V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        throw new UnsupportedOperationException();
    }
}
