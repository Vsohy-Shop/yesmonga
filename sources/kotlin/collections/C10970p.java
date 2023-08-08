package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.p */
public abstract class C10970p implements Iterator<Byte>, C11345a {
    @C12579k
    /* renamed from: b */
    public final Byte mo22390b() {
        return Byte.valueOf(nextByte());
    }

    public /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public abstract byte nextByte();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
