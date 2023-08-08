package kotlin.ranges;

import java.lang.Comparable;
import kotlin.C11665v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11665v0(version = "1.1")
/* renamed from: kotlin.ranges.f */
public interface C11457f<T extends Comparable<? super T>> extends C11459g<T> {

    /* renamed from: kotlin.ranges.f$a */
    public static final class C11458a {
        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m44241a(@C12579k C11457f<T> fVar, @C12579k T t) {
            Intrinsics.checkNotNullParameter(t, "value");
            if (!fVar.mo23029i(fVar.getStart(), t) || !fVar.mo23029i(t, fVar.mo23013q())) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static <T extends Comparable<? super T>> boolean m44242b(@C12579k C11457f<T> fVar) {
            return !fVar.mo23029i(fVar.getStart(), fVar.mo23013q());
        }
    }

    /* renamed from: e */
    boolean mo23006e(@C12579k T t);

    /* renamed from: i */
    boolean mo23029i(@C12579k T t, @C12579k T t2);

    boolean isEmpty();
}
