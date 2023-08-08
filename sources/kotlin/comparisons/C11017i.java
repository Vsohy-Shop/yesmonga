package kotlin.comparisons;

import java.util.Comparator;
import kotlin.C11665v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.comparisons.i */
public class C11017i extends C11016h {
    @C11665v0(version = "1.4")
    /* renamed from: A0 */
    public static final <T> T m42481A0(T t, @C12579k T[] tArr, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    @C11665v0(version = "1.1")
    /* renamed from: B0 */
    public static final <T> T m42482B0(T t, T t2, T t3, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return m42483C0(t, m42483C0(t2, t3, comparator), comparator);
    }

    @C11665v0(version = "1.1")
    /* renamed from: C0 */
    public static final <T> T m42483C0(T t, T t2, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (comparator.compare(t, t2) <= 0) {
            return t;
        }
        return t2;
    }

    @C11665v0(version = "1.4")
    /* renamed from: D0 */
    public static final <T> T m42484D0(T t, @C12579k T[] tArr, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    @C11665v0(version = "1.1")
    /* renamed from: y0 */
    public static final <T> T m42485y0(T t, T t2, T t3, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return m42486z0(t, m42486z0(t2, t3, comparator), comparator);
    }

    @C11665v0(version = "1.1")
    /* renamed from: z0 */
    public static final <T> T m42486z0(T t, T t2, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (comparator.compare(t, t2) >= 0) {
            return t;
        }
        return t2;
    }
}
