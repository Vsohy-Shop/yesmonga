package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.u */
public class C10981u extends C10978t {

    /* renamed from: kotlin.collections.u$a */
    public static final class C10982a implements Iterator<T>, C11345a {

        /* renamed from: a */
        public final /* synthetic */ Enumeration<T> f28193a;

        public C10982a(Enumeration<T> enumeration) {
            this.f28193a = enumeration;
        }

        public boolean hasNext() {
            return this.f28193a.hasMoreElements();
        }

        public T next() {
            return this.f28193a.nextElement();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @C12579k
    /* renamed from: c0 */
    public static final <T> Iterator<T> m41503c0(@C12579k Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        return new C10982a(enumeration);
    }
}
