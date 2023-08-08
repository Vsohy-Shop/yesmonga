package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.z */
public final class C8496z<K, V> extends C8492v<K, V, Map.Entry<K, V>> {
    @C12579k

    /* renamed from: d */
    public final C8477i<K, V> f22889d;

    public C8496z(@C12579k C8477i<K, V> iVar) {
        Intrinsics.checkNotNullParameter(iVar, "parentIterator");
        this.f22889d = iVar;
    }

    @C12579k
    /* renamed from: p */
    public Map.Entry<K, V> next() {
        C8530a.m30952a(mo15919f());
        mo15926o(mo15918e() + 2);
        return new C8470c(this.f22889d, mo15917d()[mo15918e() - 2], mo15917d()[mo15918e() - 1]);
    }
}
