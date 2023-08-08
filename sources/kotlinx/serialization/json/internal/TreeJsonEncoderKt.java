package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.C19135a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12403k;
import org.jetbrains.annotations.C12579k;

public final class TreeJsonEncoderKt {
    @C12579k

    /* renamed from: a */
    public static final String f30234a = "primitive";

    /* renamed from: b */
    public static final /* synthetic */ <T extends C12403k> T m49859b(C12403k kVar, C12217f fVar) {
        Intrinsics.checkNotNullParameter(kVar, "value");
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
        if (kVar instanceof C12403k) {
            return kVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        sb.append(C11342l0.m43547d(C12403k.class));
        sb.append(" as the serialized body of ");
        sb.append(fVar.mo24830h());
        sb.append(", but had ");
        sb.append(C11342l0.m43547d(kVar.getClass()));
        throw C12388n.m50106e(-1, sb.toString());
    }

    /* renamed from: c */
    public static final boolean m49860c(C12217f fVar) {
        return (fVar.getKind() instanceof C12207e) || fVar.getKind() == C12224h.C12226b.f30010a;
    }

    @C12579k
    /* renamed from: d */
    public static final <T> C12403k m49861d(@C12579k C12341a aVar, T t, @C12579k C12440p<? super T> pVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new C12398w(aVar, new TreeJsonEncoderKt$writeJson$encoder$1(objectRef)).mo24908e(pVar, t);
        T t2 = objectRef.element;
        if (t2 != null) {
            return (C12403k) t2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("result");
        return null;
    }
}
