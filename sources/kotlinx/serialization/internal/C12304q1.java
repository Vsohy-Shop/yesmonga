package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.C11359p0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.q1 */
public final class C12304q1 extends C12277h1<Short, short[], C12301p1> implements C12248g<short[]> {
    @C12579k

    /* renamed from: c */
    public static final C12304q1 f30108c = new C12304q1();

    public C12304q1() {
        super(C12197a.m48799E(C11359p0.f28487a));
    }

    /* renamed from: A */
    public void mo25053v(@C12579k C12239d dVar, @C12579k short[] sArr, int i) {
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(sArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.mo24900E(getDescriptor(), i2, sArr[i2]);
        }
    }

    /* renamed from: w */
    public int mo25007e(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @C12579k
    /* renamed from: x */
    public short[] mo25051r() {
        return new short[0];
    }

    /* renamed from: y */
    public void mo25052t(@C12579k C12236c cVar, int i, @C12579k C12301p1 p1Var, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        Intrinsics.checkNotNullParameter(p1Var, "builder");
        p1Var.mo25132e(cVar.mo24868E(getDescriptor(), i));
    }

    @C12579k
    /* renamed from: z */
    public C12301p1 mo25012k(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new C12301p1(sArr);
    }
}
