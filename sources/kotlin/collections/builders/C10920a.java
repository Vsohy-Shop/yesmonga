package kotlin.collections.builders;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.C10934f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.builders.a */
public abstract class C10920a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C10934f<E> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo22210h((Map.Entry) obj);
    }

    /* renamed from: h */
    public final boolean mo22210h(@C12579k E e) {
        Intrinsics.checkNotNullParameter(e, "element");
        return mo22211i(e);
    }

    /* renamed from: i */
    public abstract boolean mo22211i(@C12579k Map.Entry<? extends K, ? extends V> entry);

    /* renamed from: q */
    public /* bridge */ boolean mo22212q(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo22212q((Map.Entry) obj);
    }
}
