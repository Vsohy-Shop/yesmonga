package kotlinx.serialization;

import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.exifinterface.media.C19135a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11520r;
import kotlinx.serialization.internal.C12279i0;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.l */
public final class C12426l {
    /* renamed from: a */
    public static final /* synthetic */ <T> T m50241a(C12195a aVar, byte[] bArr) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        C12434e a = aVar.mo25277a();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return aVar.mo24817e(C12442r.m50317h(a, (C11520r) null), bArr);
    }

    /* renamed from: b */
    public static final /* synthetic */ <T> T m50242b(C12195a aVar, String str) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "hex");
        C12434e a = aVar.mo25277a();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return m50243c(aVar, C12442r.m50317h(a, (C11520r) null), str);
    }

    /* renamed from: c */
    public static final <T> T m50243c(@C12579k C12195a aVar, @C12579k C12199c<T> cVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        Intrinsics.checkNotNullParameter(str, "hex");
        return aVar.mo24817e(cVar, C12279i0.f30072a.mo25073b(str));
    }

    /* renamed from: d */
    public static final /* synthetic */ <T> T m50244d(C12445u uVar, String str) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        C12434e a = uVar.mo25277a();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return uVar.mo25278b(C12442r.m50317h(a, (C11520r) null), str);
    }

    /* renamed from: e */
    public static final /* synthetic */ <T> byte[] m50245e(C12195a aVar, T t) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        C12434e a = aVar.mo25277a();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return aVar.mo24816c(C12442r.m50317h(a, (C11520r) null), t);
    }

    /* renamed from: f */
    public static final /* synthetic */ <T> String m50246f(C12195a aVar, T t) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        C12434e a = aVar.mo25277a();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return m50247g(aVar, C12442r.m50317h(a, (C11520r) null), t);
    }

    @C12579k
    /* renamed from: g */
    public static final <T> String m50247g(@C12579k C12195a aVar, @C12579k C12440p<? super T> pVar, T t) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        return C12279i0.f30072a.mo25074c(aVar.mo24816c(pVar, t), true);
    }

    /* renamed from: h */
    public static final /* synthetic */ <T> String m50248h(C12445u uVar, T t) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        C12434e a = uVar.mo25277a();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return uVar.mo25279d(C12442r.m50317h(a, (C11520r) null), t);
    }
}
