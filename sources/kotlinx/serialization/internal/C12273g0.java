package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.C11324c0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.g0 */
public final class C12273g0 extends C12277h1<Integer, int[], C12270f0> implements C12248g<int[]> {
    @C12579k

    /* renamed from: c */
    public static final C12273g0 f30064c = new C12273g0();

    public C12273g0() {
        super(C12197a.m48797C(C11324c0.f28435a));
    }

    /* renamed from: A */
    public void mo25053v(@C12579k C12239d dVar, @C12579k int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(iArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.mo24927x(getDescriptor(), i2, iArr[i2]);
        }
    }

    /* renamed from: w */
    public int mo25007e(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @C12579k
    /* renamed from: x */
    public int[] mo25051r() {
        return new int[0];
    }

    /* renamed from: y */
    public void mo25052t(@C12579k C12236c cVar, int i, @C12579k C12270f0 f0Var, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        Intrinsics.checkNotNullParameter(f0Var, "builder");
        f0Var.mo25046e(cVar.mo24880i(getDescriptor(), i));
    }

    @C12579k
    /* renamed from: z */
    public C12270f0 mo25012k(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new C12270f0(iArr);
    }
}
