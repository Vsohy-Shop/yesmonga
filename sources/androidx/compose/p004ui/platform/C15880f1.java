package androidx.compose.p004ui.platform;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.platform.f1 */
public interface C15880f1<T extends Comparable<? super T>> {
    /* renamed from: e */
    boolean mo45715e(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "value");
        if (t.compareTo(getStart()) < 0 || t.compareTo(mo45718h()) >= 0) {
            return false;
        }
        return true;
    }

    @C12579k
    T getStart();

    @C12579k
    /* renamed from: h */
    T mo45718h();

    boolean isEmpty() {
        return getStart().compareTo(mo45718h()) >= 0;
    }
}
