package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.f1 */
public abstract class C10936f1 implements Iterator<Short>, C11345a {
    @C12579k
    /* renamed from: b */
    public final Short mo22252b() {
        return Short.valueOf(mo22253c());
    }

    /* renamed from: c */
    public abstract short mo22253c();

    public /* bridge */ /* synthetic */ Object next() {
        return Short.valueOf(mo22253c());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
