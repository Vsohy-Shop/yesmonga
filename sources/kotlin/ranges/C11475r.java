package kotlin.ranges;

import java.lang.Comparable;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11429q
@C11665v0(version = "1.7")
/* renamed from: kotlin.ranges.r */
public interface C11475r<T extends Comparable<? super T>> {

    /* renamed from: kotlin.ranges.r$a */
    public static final class C11476a {
        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m44299a(@C12579k C11475r<T> rVar, @C12579k T t) {
            Intrinsics.checkNotNullParameter(t, "value");
            if (t.compareTo(rVar.getStart()) < 0 || t.compareTo(rVar.mo23010h()) >= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static <T extends Comparable<? super T>> boolean m44300b(@C12579k C11475r<T> rVar) {
            return rVar.getStart().compareTo(rVar.mo23010h()) >= 0;
        }
    }

    /* renamed from: e */
    boolean mo23006e(@C12579k T t);

    @C12579k
    T getStart();

    @C12579k
    /* renamed from: h */
    T mo23010h();

    boolean isEmpty();
}
