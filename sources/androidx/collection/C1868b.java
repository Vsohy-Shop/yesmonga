package androidx.collection;

import kotlin.Pair;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.collection.b */
public final class C1868b {
    @C12579k
    /* renamed from: a */
    public static final <K, V> C1866a<K, V> m7444a() {
        return new C1866a<>();
    }

    @C12579k
    /* renamed from: b */
    public static final <K, V> C1866a<K, V> m7445b(@C12579k Pair<? extends K, ? extends V>... pairArr) {
        C1866a<K, V> aVar = new C1866a<>(pairArr.length);
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            aVar.put(pair.mo21849e(), pair.mo21851f());
        }
        return aVar;
    }
}
