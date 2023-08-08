package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8447e;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C10937g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPersistentOrderedMapContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMapContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.l */
public final class C8517l<K, V> extends C10937g<Map.Entry<? extends K, ? extends V>> implements C8447e<Map.Entry<? extends K, ? extends V>> {
    @C12579k

    /* renamed from: b */
    public final C8507c<K, V> f22944b;

    public C8517l(@C12579k C8507c<K, V> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "map");
        this.f22944b = cVar;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo16069h((Map.Entry) obj);
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f22944b.size();
    }

    /* renamed from: h */
    public boolean mo16069h(@C12579k Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        V v = this.f22944b.get(entry.getKey());
        if (v != null) {
            return Intrinsics.areEqual((Object) v, (Object) entry.getValue());
        }
        if (entry.getValue() != null || !this.f22944b.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @C12579k
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C8518m(this.f22944b);
    }
}
