package kotlinx.serialization.descriptors;

import androidx.exifinterface.media.C19135a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11520r;
import kotlin.text.C11622t;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12247f;
import kotlinx.serialization.C12442r;
import kotlinx.serialization.descriptors.C12227i;
import kotlinx.serialization.internal.C12257b0;
import kotlinx.serialization.internal.C12265e;
import kotlinx.serialization.internal.C12286k1;
import kotlinx.serialization.internal.C12292m1;
import kotlinx.serialization.internal.C12331z;
import org.jetbrains.annotations.C12579k;

public final class SerialDescriptorsKt {
    @C12579k
    /* renamed from: a */
    public static final C12217f m48841a(@C12579k String str, @C12579k C12207e eVar) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(eVar, "kind");
        if (!C11622t.isBlank(str)) {
            return C12286k1.m49371a(str, eVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    @C12200d
    @C12579k
    /* renamed from: b */
    public static final C12217f m48842b(@C12579k String str, @C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(fVar, "original");
        if (!(!C11622t.isBlank(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        } else if (!(!(fVar.getKind() instanceof C12207e))) {
            throw new IllegalArgumentException("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead".toString());
        } else if (!Intrinsics.areEqual((Object) str, (Object) fVar.mo24830h())) {
            return new C12232j(str, fVar);
        } else {
            throw new IllegalArgumentException(("The name of the wrapped descriptor (" + str + ") cannot be the same as the name of the original descriptor (" + fVar.mo24830h() + ')').toString());
        }
    }

    @C12579k
    /* renamed from: c */
    public static final C12217f m48843c(@C12579k String str, @C12579k C12217f[] fVarArr, @C12579k C11300l<? super C12201a, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(fVarArr, "typeParameters");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        if (!C11622t.isBlank(str)) {
            C12201a aVar = new C12201a(str);
            lVar.invoke(aVar);
            return new SerialDescriptorImpl(str, C12227i.C12228a.f30011a, aVar.mo24843g().size(), ArraysKt___ArraysKt.m39955kz(fVarArr), aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* renamed from: d */
    public static /* synthetic */ C12217f m48844d(String str, C12217f[] fVarArr, C11300l lVar, int i, Object obj) {
        if ((i & 4) != 0) {
            lVar = SerialDescriptorsKt$buildClassSerialDescriptor$1.f29979f;
        }
        return m48843c(str, fVarArr, lVar);
    }

    @C12247f
    @C12579k
    /* renamed from: e */
    public static final C12217f m48845e(@C12579k String str, @C12579k C12224h hVar, @C12579k C12217f[] fVarArr, @C12579k C11300l<? super C12201a, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(hVar, "kind");
        Intrinsics.checkNotNullParameter(fVarArr, "typeParameters");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        if (!(!C11622t.isBlank(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        } else if (!Intrinsics.areEqual((Object) hVar, (Object) C12227i.C12228a.f30011a)) {
            C12201a aVar = new C12201a(str);
            lVar.invoke(aVar);
            return new SerialDescriptorImpl(str, hVar, aVar.mo24843g().size(), ArraysKt___ArraysKt.m39955kz(fVarArr), aVar);
        } else {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
    }

    /* renamed from: f */
    public static /* synthetic */ C12217f m48846f(String str, C12224h hVar, C12217f[] fVarArr, C11300l lVar, int i, Object obj) {
        if ((i & 8) != 0) {
            lVar = SerialDescriptorsKt$buildSerialDescriptor$1.f29980f;
        }
        return m48845e(str, hVar, fVarArr, lVar);
    }

    /* renamed from: g */
    public static final /* synthetic */ <T> void m48847g(C12201a aVar, String str, List<? extends Annotation> list, boolean z) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "elementName");
        Intrinsics.checkNotNullParameter(list, "annotations");
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        aVar.mo24839a(str, C12442r.m50314e((C11520r) null).getDescriptor(), list, z);
    }

    /* renamed from: h */
    public static /* synthetic */ void m48848h(C12201a aVar, String str, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "elementName");
        Intrinsics.checkNotNullParameter(list, "annotations");
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        aVar.mo24839a(str, C12442r.m50314e((C11520r) null).getDescriptor(), list, z);
    }

    @C12579k
    /* renamed from: i */
    public static final C12217f m48849i(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar.mo24821b()) {
            return fVar;
        }
        return new C12292m1(fVar);
    }

    /* renamed from: j */
    public static /* synthetic */ void m48850j(C12217f fVar) {
    }

    @C12200d
    @C12579k
    /* renamed from: l */
    public static final C12217f m48852l(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "elementDescriptor");
        return new C12265e(fVar);
    }

    @C12200d
    /* renamed from: m */
    public static final /* synthetic */ <K, V> C12217f m48853m() {
        Intrinsics.reifiedOperationMarker(6, "K");
        C12217f descriptor = C12442r.m50314e((C11520r) null).getDescriptor();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48877X4);
        return m48854n(descriptor, C12442r.m50314e((C11520r) null).getDescriptor());
    }

    @C12200d
    @C12579k
    /* renamed from: n */
    public static final C12217f m48854n(@C12579k C12217f fVar, @C12579k C12217f fVar2) {
        Intrinsics.checkNotNullParameter(fVar, "keyDescriptor");
        Intrinsics.checkNotNullParameter(fVar2, "valueDescriptor");
        return new C12331z(fVar, fVar2);
    }

    @C12579k
    /* renamed from: p */
    public static final C12217f m48856p(@C12579k C11520r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "type");
        return C12442r.m50314e(rVar).getDescriptor();
    }

    @C12200d
    @C12579k
    /* renamed from: r */
    public static final C12217f m48858r(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "elementDescriptor");
        return new C12257b0(fVar);
    }
}
