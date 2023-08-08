package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.x */
public final class C12324x implements C12248g<Float> {
    @C12579k

    /* renamed from: a */
    public static final C12324x f30145a = new C12324x();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30146b = new C12283j1("kotlin.Float", C12207e.C12212e.f29998a);

    @C12579k
    /* renamed from: a */
    public Float deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return Float.valueOf(eVar.mo24890t());
    }

    /* renamed from: b */
    public void mo25210b(@C12579k C12244g gVar, float f) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24924u(f);
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30146b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo25210b(gVar, ((Number) obj).floatValue());
    }
}
