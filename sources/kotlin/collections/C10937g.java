package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.C11665v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.1")
/* renamed from: kotlin.collections.g */
public abstract class C10937g<E> extends AbstractCollection<E> implements Set<E>, C11345a {
    @C12579k

    /* renamed from: a */
    public static final C10938a f28166a = new C10938a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.collections.g$a */
    public static final class C10938a {
        public /* synthetic */ C10938a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo22258a(@C12579k Set<?> set, @C12579k Set<?> set2) {
            Intrinsics.checkNotNullParameter(set, "c");
            Intrinsics.checkNotNullParameter(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        /* renamed from: b */
        public final int mo22259b(@C12579k Collection<?> collection) {
            int i;
            Intrinsics.checkNotNullParameter(collection, "c");
            int i2 = 0;
            for (Object next : collection) {
                if (next != null) {
                    i = next.hashCode();
                } else {
                    i = 0;
                }
                i2 += i;
            }
            return i2;
        }

        public C10938a() {
        }
    }

    public boolean equals(@C12580l Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return f28166a.mo22258a(this, (Set) obj);
    }

    public int hashCode() {
        return f28166a.mo22259b(this);
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
