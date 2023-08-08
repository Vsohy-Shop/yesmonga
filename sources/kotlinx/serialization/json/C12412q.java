package kotlinx.serialization.json;

import androidx.exifinterface.media.C19135a;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11520r;
import kotlinx.serialization.C12442r;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.q */
public final class C12412q {
    @C12579k

    /* renamed from: a */
    public static final String f30348a = "    ";
    @C12579k

    /* renamed from: b */
    public static final String f30349b = "type";

    @C12579k
    /* renamed from: a */
    public static final C12341a m50211a(@C12579k C12341a aVar, @C12579k C11300l<? super C12351e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "from");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        C12351e eVar = new C12351e(aVar);
        lVar.invoke(eVar);
        return new C12411p(eVar.mo25332a(), eVar.mo25342m());
    }

    /* renamed from: b */
    public static /* synthetic */ C12341a m50212b(C12341a aVar, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = C12341a.f30174d;
        }
        return m50211a(aVar, lVar);
    }

    /* renamed from: c */
    public static final /* synthetic */ <T> T m50213c(C12341a aVar, C12403k kVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(kVar, "json");
        C12434e a = aVar.mo25277a();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return aVar.mo25280f(C12442r.m50317h(a, (C11520r) null), kVar);
    }

    /* renamed from: d */
    public static final /* synthetic */ <T> C12403k m50214d(C12341a aVar, T t) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        C12434e a = aVar.mo25277a();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return aVar.mo25281g(C12442r.m50317h(a, (C11520r) null), t);
    }
}
