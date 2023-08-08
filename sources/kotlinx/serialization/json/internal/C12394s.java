package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12403k;
import kotlinx.serialization.json.C12421x;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.s */
public final class C12394s extends C12363c {
    @C12579k

    /* renamed from: i */
    public final C12421x f30330i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12394s(@C12579k C12341a aVar, @C12579k C12421x xVar) {
        super(aVar, xVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(xVar, "value");
        this.f30330i = xVar;
        mo24996d0(TreeJsonEncoderKt.f30234a);
    }

    @C12579k
    /* renamed from: D0 */
    public C12421x mo25399A0() {
        return this.f30330i;
    }

    @C12579k
    /* renamed from: k0 */
    public C12403k mo25403k0(@C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "tag");
        if (str == TreeJsonEncoderKt.f30234a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo25399A0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    /* renamed from: o */
    public int mo24931o(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return 0;
    }
}
