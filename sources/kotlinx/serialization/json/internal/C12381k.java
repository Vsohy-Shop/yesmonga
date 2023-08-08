package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.k */
public final class C12381k {
    @C12579k
    /* renamed from: a */
    public static final <K, V> Map<K, V> m50080a(int i) {
        return new ConcurrentHashMap(i);
    }
}
