package kotlinx.coroutines.debug.internal;

import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010'\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"", "K", "V", "k", "v", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ConcurrentWeakMap$entries$1 extends Lambda implements C11304p<K, V, Map.Entry<K, V>> {

    /* renamed from: f */
    public static final ConcurrentWeakMap$entries$1 f29212f = new ConcurrentWeakMap$entries$1();

    public ConcurrentWeakMap$entries$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final Map.Entry<K, V> invoke(@C12579k K k, @C12579k V v) {
        return new ConcurrentWeakMap.C11776b(k, v);
    }
}
