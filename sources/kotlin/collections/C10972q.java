package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.q */
public abstract class C10972q implements Iterator<Character>, C11345a {
    @C12579k
    /* renamed from: b */
    public final Character mo22394b() {
        return Character.valueOf(mo22395c());
    }

    /* renamed from: c */
    public abstract char mo22395c();

    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(mo22395c());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
