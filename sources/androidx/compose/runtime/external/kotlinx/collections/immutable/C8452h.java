package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import kotlin.jvm.internal.markers.C11351g;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.h */
public interface C8452h<K, V> extends C8446d<K, V> {

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.h$a */
    public interface C8453a<K, V> extends Map<K, V>, C11351g {
        @C12579k
        /* renamed from: g */
        C8452h<K, V> mo15671g();
    }

    @C12579k
    C8453a<K, V> builder();

    @C12579k
    C8452h<K, V> clear();

    @C12579k
    C8452h<K, V> put(K k, V v);

    @C12579k
    C8452h<K, V> putAll(@C12579k Map<? extends K, ? extends V> map);

    @C12579k
    C8452h<K, V> remove(K k);

    @C12579k
    C8452h<K, V> remove(K k, V v);
}
