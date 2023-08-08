package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.snapshots.z */
public final class C8675z<K, V> extends C8673x<K, V> implements Iterator<V>, C11348d {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8675z(@C12579k C8667t<K, V> tVar, @C12579k Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(tVar, it);
        Intrinsics.checkNotNullParameter(tVar, "map");
        Intrinsics.checkNotNullParameter(it, "iterator");
    }

    public V next() {
        Map.Entry l = mo16749l();
        if (l != null) {
            mo16743d();
            return l.getValue();
        }
        throw new IllegalStateException();
    }
}
