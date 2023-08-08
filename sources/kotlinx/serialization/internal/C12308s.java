package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.C11369u;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.s */
public final class C12308s extends C12277h1<Double, double[], C12305r> implements C12248g<double[]> {
    @C12579k

    /* renamed from: c */
    public static final C12308s f30115c = new C12308s();

    public C12308s() {
        super(C12197a.m48795A(C11369u.f28505a));
    }

    /* renamed from: A */
    public void mo25053v(@C12579k C12239d dVar, @C12579k double[] dArr, int i) {
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(dArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.mo24901F(getDescriptor(), i2, dArr[i2]);
        }
    }

    /* renamed from: w */
    public int mo25007e(@C12579k double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @C12579k
    /* renamed from: x */
    public double[] mo25051r() {
        return new double[0];
    }

    /* renamed from: y */
    public void mo25052t(@C12579k C12236c cVar, int i, @C12579k C12305r rVar, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        Intrinsics.checkNotNullParameter(rVar, "builder");
        rVar.mo25139e(cVar.mo24869F(getDescriptor(), i));
    }

    @C12579k
    /* renamed from: z */
    public C12305r mo25012k(@C12579k double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new C12305r(dArr);
    }
}
