package kotlin.collections;

import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.v */
public class C10990v extends C10981u {
    /* renamed from: d0 */
    public static final <T> void m42327d0(@C12579k Iterator<? extends T> it, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "operation");
        while (it.hasNext()) {
            lVar.invoke(it.next());
        }
    }

    @C11110f
    /* renamed from: e0 */
    public static final <T> Iterator<T> m42328e0(Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return it;
    }

    @C12579k
    /* renamed from: f0 */
    public static final <T> Iterator<C10942h0<T>> m42329f0(@C12579k Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return new C10949j0(it);
    }
}
