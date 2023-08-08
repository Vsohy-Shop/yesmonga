package kotlin;

import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.e */
public final class C11080e {
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: a */
    public static final <T> int m42662a(Comparable<? super T> comparable, T t) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        return comparable.compareTo(t);
    }
}
