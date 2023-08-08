package kotlin.collections;

import java.util.List;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.y */
public class C10996y extends C10994x {
    @C12579k
    /* renamed from: W0 */
    public static final <T> List<T> m42381W0(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new C10999z0(list);
    }

    @C11314h(name = "asReversedMutable")
    @C12579k
    /* renamed from: X0 */
    public static final <T> List<T> m42382X0(@C12579k List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new C10997y0(list);
    }

    /* renamed from: Y0 */
    public static final int m42383Y0(List<?> list, int i) {
        if (new C11466l(0, CollectionsKt__CollectionsKt.m40443G(list)).mo23056Q(i)) {
            return CollectionsKt__CollectionsKt.m40443G(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new C11466l(0, CollectionsKt__CollectionsKt.m40443G(list)) + "].");
    }

    /* renamed from: Z0 */
    public static final int m42384Z0(List<?> list, int i) {
        if (new C11466l(0, list.size()).mo23056Q(i)) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new C11466l(0, list.size()) + "].");
    }
}
