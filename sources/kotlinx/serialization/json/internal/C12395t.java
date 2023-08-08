package kotlinx.serialization.json.internal;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12403k;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.internal.t */
public final class C12395t extends AbstractJsonTreeEncoder {
    @C12580l

    /* renamed from: f */
    public C12403k f30331f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12395t(@C12579k C12341a aVar, @C12579k C11300l<? super C12403k, C11079d2> lVar) {
        super(aVar, lVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(lVar, "nodeConsumer");
        mo25179b0(TreeJsonEncoderKt.f30234a);
    }

    @C12579k
    /* renamed from: u0 */
    public C12403k mo25389u0() {
        C12403k kVar = this.f30331f;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }

    /* renamed from: v0 */
    public void mo25390v0(@C12579k String str, @C12579k C12403k kVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(kVar, "element");
        boolean z2 = true;
        if (str == TreeJsonEncoderKt.f30234a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f30331f != null) {
                z2 = false;
            }
            if (z2) {
                this.f30331f = kVar;
                return;
            }
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
    }
}
