package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import java.util.Map;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.w */
public final class C8493w<K, V> extends C8492v<K, V, Map.Entry<? extends K, ? extends V>> {
    @C12579k
    /* renamed from: p */
    public Map.Entry<K, V> next() {
        C8530a.m30952a(mo15919f());
        mo15926o(mo15918e() + 2);
        return new C8469b(mo15917d()[mo15918e() - 2], mo15917d()[mo15918e() - 1]);
    }
}
