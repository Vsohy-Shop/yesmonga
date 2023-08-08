package kotlin;

import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11504k;
import kotlin.reflect.C11506l;
import kotlin.reflect.C11510n;
import kotlin.reflect.C11514o;
import kotlin.reflect.C11516p;

/* renamed from: kotlin.r0 */
public final class C11434r0 {
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: a */
    public static final <V> V m44062a(C11514o<? extends V> oVar, Object obj, C11510n<?> nVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(nVar, "property");
        return oVar.get();
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: b */
    public static final <T, V> V m44063b(C11516p<T, ? extends V> pVar, T t, C11510n<?> nVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(nVar, "property");
        return pVar.get(t);
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: c */
    public static final <V> void m44064c(C11504k<V> kVar, Object obj, C11510n<?> nVar, V v) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(nVar, "property");
        kVar.set(v);
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: d */
    public static final <T, V> void m44065d(C11506l<T, V> lVar, T t, C11510n<?> nVar, V v) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(nVar, "property");
        lVar.mo22735K1(t, v);
    }
}
