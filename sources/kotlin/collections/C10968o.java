package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.o */
public abstract class C10968o implements Iterator<Boolean>, C11345a {
    @C12579k
    /* renamed from: b */
    public final Boolean mo22367b() {
        return Boolean.valueOf(mo22368c());
    }

    /* renamed from: c */
    public abstract boolean mo22368c();

    public /* bridge */ /* synthetic */ Object next() {
        return Boolean.valueOf(mo22368c());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
