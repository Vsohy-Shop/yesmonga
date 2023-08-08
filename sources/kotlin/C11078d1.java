package kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "TuplesKt")
/* renamed from: kotlin.d1 */
public final class C11078d1 {
    @C12579k
    /* renamed from: a */
    public static final <A, B> Pair<A, B> m42659a(A a, B b) {
        return new Pair<>(a, b);
    }

    @C12579k
    /* renamed from: b */
    public static final <T> List<T> m42660b(@C12579k Pair<? extends T, ? extends T> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return CollectionsKt__CollectionsKt.m40448L(pair.mo21849e(), pair.mo21851f());
    }

    @C12579k
    /* renamed from: c */
    public static final <T> List<T> m42661c(@C12579k Triple<? extends T, ? extends T, ? extends T> triple) {
        Intrinsics.checkNotNullParameter(triple, "<this>");
        return CollectionsKt__CollectionsKt.m40448L(triple.mo21872f(), triple.mo21873g(), triple.mo21874h());
    }
}
