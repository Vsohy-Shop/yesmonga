package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.w */
public final class C12321w extends C12277h1<Float, float[], C12318v> implements C12248g<float[]> {
    @C12579k

    /* renamed from: c */
    public static final C12321w f30142c = new C12321w();

    public C12321w() {
        super(C12197a.m48796B(C11377x.f28521a));
    }

    /* renamed from: A */
    public void mo25053v(@C12579k C12239d dVar, @C12579k float[] fArr, int i) {
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(fArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.mo24923t(getDescriptor(), i2, fArr[i2]);
        }
    }

    /* renamed from: w */
    public int mo25007e(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @C12579k
    /* renamed from: x */
    public float[] mo25051r() {
        return new float[0];
    }

    /* renamed from: y */
    public void mo25052t(@C12579k C12236c cVar, int i, @C12579k C12318v vVar, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        Intrinsics.checkNotNullParameter(vVar, "builder");
        vVar.mo25190e(cVar.mo24891u(getDescriptor(), i));
    }

    @C12579k
    /* renamed from: z */
    public C12318v mo25012k(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new C12318v(fArr);
    }
}
