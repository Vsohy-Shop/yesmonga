package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.properties.c */
public abstract class C11425c<V> implements C11428f<Object, V> {

    /* renamed from: a */
    public V f28558a;

    public C11425c(V v) {
        this.f28558a = v;
    }

    /* renamed from: a */
    public V mo22938a(@C12580l Object obj, @C12579k C11510n<?> nVar) {
        Intrinsics.checkNotNullParameter(nVar, "property");
        return this.f28558a;
    }

    /* renamed from: b */
    public void mo22939b(@C12580l Object obj, @C12579k C11510n<?> nVar, V v) {
        Intrinsics.checkNotNullParameter(nVar, "property");
        V v2 = this.f28558a;
        if (mo22937d(nVar, v2, v)) {
            this.f28558a = v;
            mo22936c(nVar, v2, v);
        }
    }

    /* renamed from: c */
    public void mo22936c(@C12579k C11510n<?> nVar, V v, V v2) {
        Intrinsics.checkNotNullParameter(nVar, "property");
    }

    /* renamed from: d */
    public boolean mo22937d(@C12579k C11510n<?> nVar, V v, V v2) {
        Intrinsics.checkNotNullParameter(nVar, "property");
        return true;
    }
}
