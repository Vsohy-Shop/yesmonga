package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.C10934f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.a */
public abstract class C8467a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C10934f<E> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo15775h((Map.Entry) obj);
    }

    /* renamed from: h */
    public final boolean mo15775h(@C12579k E e) {
        E e2;
        Intrinsics.checkNotNullParameter(e, "element");
        if (e instanceof Object) {
            e2 = e;
        } else {
            e2 = null;
        }
        if (!(e2 instanceof Map.Entry)) {
            return false;
        }
        return mo15776i(e);
    }

    /* renamed from: i */
    public abstract boolean mo15776i(@C12579k Map.Entry<? extends K, ? extends V> entry);

    /* renamed from: q */
    public final boolean mo15777q(@C12579k E e) {
        E e2;
        Intrinsics.checkNotNullParameter(e, "element");
        if (e instanceof Object) {
            e2 = e;
        } else {
            e2 = null;
        }
        if (!(e2 instanceof Map.Entry)) {
            return false;
        }
        return mo15778r(e);
    }

    /* renamed from: r */
    public abstract boolean mo15778r(@C12579k Map.Entry<? extends K, ? extends V> entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo15777q((Map.Entry) obj);
    }
}
