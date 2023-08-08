package kotlin;

import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.c0 */
public class C10869c0 extends C10864b0 {
    @C11110f
    /* renamed from: d */
    public static final <T> T m38753d(C11677z<? extends T> zVar, Object obj, C11510n<?> nVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(nVar, "property");
        return zVar.getValue();
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C11677z<T> m38754e(T t) {
        return new InitializedLazyImpl(t);
    }
}
