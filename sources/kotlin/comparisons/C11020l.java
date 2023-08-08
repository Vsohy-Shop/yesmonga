package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.comparisons.l */
public final class C11020l<T> implements Comparator<T> {
    @C12579k

    /* renamed from: a */
    public final Comparator<T> f28232a;

    public C11020l(@C12579k Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.f28232a = comparator;
    }

    @C12579k
    /* renamed from: a */
    public final Comparator<T> mo22464a() {
        return this.f28232a;
    }

    public int compare(T t, T t2) {
        return this.f28232a.compare(t2, t);
    }

    @C12579k
    public final Comparator<T> reversed() {
        return this.f28232a;
    }
}
