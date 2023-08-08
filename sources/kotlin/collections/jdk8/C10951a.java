package kotlin.collections.jdk8;

import java.util.Map;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;

@C11314h(name = "CollectionsJDK8Kt")
/* renamed from: kotlin.collections.jdk8.a */
public final class C10951a {
    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: a */
    public static final <K, V> V m40995a(Map<? extends K, ? extends V> map, K k, V v) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.getOrDefault(k, v);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: b */
    public static final <K, V> boolean m40996b(Map<? extends K, ? extends V> map, K k, V v) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return C11370u0.m43695k(map).remove(k, v);
    }
}
