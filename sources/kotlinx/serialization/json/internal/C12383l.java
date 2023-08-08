package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.internal.l */
public final class C12383l {
    @C12579k

    /* renamed from: a */
    public final Map<C12217f, Map<C12384a<Object>, Object>> f30317a = C12381k.m50080a(1);

    /* renamed from: kotlinx.serialization.json.internal.l$a */
    public static final class C12384a<T> {
    }

    @C12580l
    /* renamed from: a */
    public final <T> T mo25525a(@C12579k C12217f fVar, @C12579k C12384a<T> aVar) {
        T t;
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(aVar, "key");
        Map map = this.f30317a.get(fVar);
        if (map == null) {
            t = null;
        } else {
            t = map.get(aVar);
        }
        if (t != null) {
            return t;
        }
        return null;
    }

    @C12579k
    /* renamed from: b */
    public final <T> T mo25526b(@C12579k C12217f fVar, @C12579k C12384a<T> aVar, @C12579k C11289a<? extends T> aVar2) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(aVar, "key");
        Intrinsics.checkNotNullParameter(aVar2, "defaultValue");
        T a = mo25525a(fVar, aVar);
        if (a != null) {
            return a;
        }
        T invoke = aVar2.invoke();
        mo25527c(fVar, aVar, invoke);
        return invoke;
    }

    /* renamed from: c */
    public final <T> void mo25527c(@C12579k C12217f fVar, @C12579k C12384a<T> aVar, @C12579k T t) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(aVar, "key");
        Intrinsics.checkNotNullParameter(t, "value");
        Map<C12217f, Map<C12384a<Object>, Object>> map = this.f30317a;
        Map<C12384a<Object>, Object> map2 = map.get(fVar);
        if (map2 == null) {
            map2 = C12381k.m50080a(1);
            map.put(fVar, map2);
        }
        map2.put(aVar, t);
    }
}
