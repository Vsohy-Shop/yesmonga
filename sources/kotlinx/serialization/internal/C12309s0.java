package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.C11332g0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.s0 */
public final class C12309s0 extends C12277h1<Long, long[], C12306r0> implements C12248g<long[]> {
    @C12579k

    /* renamed from: c */
    public static final C12309s0 f30116c = new C12309s0();

    public C12309s0() {
        super(C12197a.m48798D(C11332g0.f28449a));
    }

    /* renamed from: A */
    public void mo25053v(@C12579k C12239d dVar, @C12579k long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(jArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.mo24902G(getDescriptor(), i2, jArr[i2]);
        }
    }

    /* renamed from: w */
    public int mo25007e(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @C12579k
    /* renamed from: x */
    public long[] mo25051r() {
        return new long[0];
    }

    /* renamed from: y */
    public void mo25052t(@C12579k C12236c cVar, int i, @C12579k C12306r0 r0Var, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        Intrinsics.checkNotNullParameter(r0Var, "builder");
        r0Var.mo25141e(cVar.mo24878f(getDescriptor(), i));
    }

    @C12579k
    /* renamed from: z */
    public C12306r0 mo25012k(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new C12306r0(jArr);
    }
}
