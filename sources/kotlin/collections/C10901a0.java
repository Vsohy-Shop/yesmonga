package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.a0 */
public abstract class C10901a0 implements Iterator<Double>, C11345a {
    @C12579k
    /* renamed from: b */
    public final Double mo22043b() {
        return Double.valueOf(mo22044c());
    }

    /* renamed from: c */
    public abstract double mo22044c();

    public /* bridge */ /* synthetic */ Object next() {
        return Double.valueOf(mo22044c());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
