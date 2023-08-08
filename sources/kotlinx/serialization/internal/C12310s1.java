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
/* renamed from: kotlinx.serialization.internal.s1 */
public final class C12310s1 implements C12248g<String> {
    @C12579k

    /* renamed from: a */
    public static final C12310s1 f30117a = new C12310s1();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30118b = new C12283j1("kotlin.String", C12207e.C12216i.f30002a);

    @C12579k
    /* renamed from: a */
    public String deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return eVar.mo24896z();
    }

    /* renamed from: b */
    public void serialize(@C12579k C12244g gVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(str, "value");
        gVar.mo24903H(str);
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30118b;
    }
}
