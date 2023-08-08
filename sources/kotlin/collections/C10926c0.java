package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.c0 */
public abstract class C10926c0 implements Iterator<Float>, C11345a {
    @C12579k
    /* renamed from: b */
    public final Float mo22241b() {
        return Float.valueOf(mo22242c());
    }

    /* renamed from: c */
    public abstract float mo22242c();

    public /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(mo22242c());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
