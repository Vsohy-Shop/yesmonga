package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.properties.b */
public final class C11424b<T> implements C11428f<Object, T> {
    @C12580l

    /* renamed from: a */
    public T f28557a;

    @C12579k
    /* renamed from: a */
    public T mo22938a(@C12580l Object obj, @C12579k C11510n<?> nVar) {
        Intrinsics.checkNotNullParameter(nVar, "property");
        T t = this.f28557a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + nVar.getName() + " should be initialized before get.");
    }

    /* renamed from: b */
    public void mo22939b(@C12580l Object obj, @C12579k C11510n<?> nVar, @C12579k T t) {
        Intrinsics.checkNotNullParameter(nVar, "property");
        Intrinsics.checkNotNullParameter(t, "value");
        this.f28557a = t;
    }
}
