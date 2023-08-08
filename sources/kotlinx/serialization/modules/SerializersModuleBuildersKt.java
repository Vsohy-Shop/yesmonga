package kotlinx.serialization.modules;

import androidx.exifinterface.media.C19135a;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.C12248g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SerializersModuleBuildersKt {
    @C12579k
    /* renamed from: a */
    public static final C12434e m50249a(@C12579k C11300l<? super C12435f, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        C12435f fVar = new C12435f();
        lVar.invoke(fVar);
        return fVar.mo25583g();
    }

    /* renamed from: b */
    public static final /* synthetic */ <T> void m50250b(C12435f fVar, C12248g<T> gVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(gVar, "serializer");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        fVar.mo25478c(C11342l0.m43547d(Object.class), gVar);
    }

    /* renamed from: c */
    public static final <Base> void m50251c(@C12579k C12435f fVar, @C12579k C11494d<Base> dVar, @C12580l C12248g<Base> gVar, @C12579k C11300l<? super C12431b<? super Base>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        C12431b bVar = new C12431b(dVar, gVar);
        lVar.invoke(bVar);
        bVar.mo25574a(fVar);
    }

    /* renamed from: d */
    public static /* synthetic */ void m50252d(C12435f fVar, C11494d dVar, C12248g gVar, C11300l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            gVar = null;
        }
        if ((i & 4) != 0) {
            lVar = SerializersModuleBuildersKt$polymorphic$1.f30365f;
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        C12431b bVar = new C12431b(dVar, gVar);
        lVar.invoke(bVar);
        bVar.mo25574a(fVar);
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C12434e m50253e(@C12579k C11494d<T> dVar, @C12579k C12248g<T> gVar) {
        Intrinsics.checkNotNullParameter(dVar, "kClass");
        Intrinsics.checkNotNullParameter(gVar, "serializer");
        C12435f fVar = new C12435f();
        fVar.mo25478c(dVar, gVar);
        return fVar.mo25583g();
    }

    /* renamed from: f */
    public static final /* synthetic */ <T> C12434e m50254f(C12248g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "serializer");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        return m50253e(C11342l0.m43547d(Object.class), gVar);
    }
}
