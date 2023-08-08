package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPersistentHashMapBuilderContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapBuilderContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.h */
public final class C8476h<K, V> extends C8467a<Map.Entry<K, V>, K, V> {
    @C12579k

    /* renamed from: a */
    public final C8474f<K, V> f22865a;

    public C8476h(@C12579k C8474f<K, V> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "builder");
        this.f22865a = fVar;
    }

    public void clear() {
        this.f22865a.clear();
    }

    /* renamed from: e */
    public int mo15840e() {
        return this.f22865a.size();
    }

    /* renamed from: i */
    public boolean mo15776i(@C12579k Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        V v = this.f22865a.get(entry.getKey());
        if (v != null) {
            return Intrinsics.areEqual((Object) v, (Object) entry.getValue());
        }
        if (entry.getValue() != null || !this.f22865a.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @C12579k
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C8477i(this.f22865a);
    }

    /* renamed from: r */
    public boolean mo15778r(@C12579k Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        return this.f22865a.remove(entry.getKey(), entry.getValue());
    }

    /* renamed from: w */
    public boolean add(@C12579k Map.Entry<K, V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        throw new UnsupportedOperationException();
    }
}
