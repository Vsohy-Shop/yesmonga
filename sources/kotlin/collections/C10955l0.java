package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.l0 */
public abstract class C10955l0 implements Iterator<Long>, C11345a {
    @C12579k
    /* renamed from: b */
    public final Long mo22330b() {
        return Long.valueOf(mo6234c());
    }

    /* renamed from: c */
    public abstract long mo6234c();

    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(mo6234c());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
