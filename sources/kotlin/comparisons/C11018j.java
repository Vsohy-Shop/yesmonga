package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.comparisons.j */
public final class C11018j implements Comparator<Comparable<? super Object>> {
    @C12579k

    /* renamed from: a */
    public static final C11018j f28230a = new C11018j();

    /* renamed from: a */
    public int compare(@C12579k Comparable<Object> comparable, @C12579k Comparable<Object> comparable2) {
        Intrinsics.checkNotNullParameter(comparable, "a");
        Intrinsics.checkNotNullParameter(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @C12579k
    public final Comparator<Comparable<Object>> reversed() {
        return C11019k.f28231a;
    }
}
