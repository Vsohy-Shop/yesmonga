package kotlinx.serialization.descriptors;

import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.internal.C12292m1;
import kotlinx.serialization.modules.C12433d;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.descriptors.b */
public final class C12202b {
    @C12580l
    /* renamed from: a */
    public static final C11494d<?> m48874a(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof C12203c) {
            return ((C12203c) fVar).f29990b;
        }
        if (fVar instanceof C12292m1) {
            return m48874a(((C12292m1) fVar).mo25108j());
        }
        return null;
    }

    @C12200d
    /* renamed from: b */
    public static /* synthetic */ void m48875b(C12217f fVar) {
    }

    @C12580l
    @C12200d
    /* renamed from: c */
    public static final C12217f m48876c(@C12579k C12434e eVar, @C12579k C12217f fVar) {
        C12248g d;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        C11494d<?> a = m48874a(fVar);
        if (a == null || (d = C12434e.m50280d(eVar, a, (List) null, 2, (Object) null)) == null) {
            return null;
        }
        return d.getDescriptor();
    }

    @C12200d
    @C12579k
    /* renamed from: d */
    public static final List<C12217f> m48877d(@C12579k C12434e eVar, @C12579k C12217f fVar) {
        Collection collection;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        C11494d<?> a = m48874a(fVar);
        if (a == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        Map map = ((C12433d) eVar).f30374b.get(a);
        if (map == null) {
            collection = null;
        } else {
            collection = map.values();
        }
        if (collection == null) {
            collection = CollectionsKt__CollectionsKt.m40441E();
        }
        Iterable<C12248g> iterable = collection;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C12248g descriptor : iterable) {
            arrayList.add(descriptor.getDescriptor());
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: e */
    public static final C12217f m48878e(@C12579k C12217f fVar, @C12579k C11494d<?> dVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(dVar, C9175a.f24932Y);
        return new C12203c(fVar, dVar);
    }
}
