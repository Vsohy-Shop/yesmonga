package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.k0 */
public abstract class C10953k0 implements Iterator<Integer>, C11345a {
    @C12579k
    /* renamed from: b */
    public final Integer mo22327b() {
        return Integer.valueOf(mo6374c());
    }

    /* renamed from: c */
    public abstract int mo6374c();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(mo6374c());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
