package kotlinx.serialization.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.internal.g1 */
public final class C12274g1 extends C12300p0 {
    @C12579k

    /* renamed from: c */
    public final String f30065c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12274g1(@C12579k C12217f fVar) {
        super(fVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(fVar, TreeJsonEncoderKt.f30234a);
        this.f30065c = Intrinsics.stringPlus(fVar.mo24830h(), "Array");
    }

    @C12579k
    /* renamed from: h */
    public String mo24830h() {
        return this.f30065c;
    }
}
