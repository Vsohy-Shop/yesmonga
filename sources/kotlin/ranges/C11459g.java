package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.ranges.g */
public interface C11459g<T extends Comparable<? super T>> {

    /* renamed from: kotlin.ranges.g$a */
    public static final class C11460a {
        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m44245a(@C12579k C11459g<T> gVar, @C12579k T t) {
            Intrinsics.checkNotNullParameter(t, "value");
            if (t.compareTo(gVar.getStart()) < 0 || t.compareTo(gVar.mo23013q()) > 0) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static <T extends Comparable<? super T>> boolean m44246b(@C12579k C11459g<T> gVar) {
            return gVar.getStart().compareTo(gVar.mo23013q()) > 0;
        }
    }

    /* renamed from: e */
    boolean mo23006e(@C12579k T t);

    @C12579k
    T getStart();

    boolean isEmpty();

    @C12579k
    /* renamed from: q */
    T mo23013q();
}
