package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.C11341l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.h */
public final class C12275h extends C12277h1<Boolean, boolean[], C12272g> implements C12248g<boolean[]> {
    @C12579k

    /* renamed from: c */
    public static final C12275h f30066c = new C12275h();

    public C12275h() {
        super(C12197a.m48824x(C11341l.f28464a));
    }

    /* renamed from: A */
    public void mo25053v(@C12579k C12239d dVar, @C12579k boolean[] zArr, int i) {
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(zArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.mo24928y(getDescriptor(), i2, zArr[i2]);
        }
    }

    /* renamed from: w */
    public int mo25007e(@C12579k boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @C12579k
    /* renamed from: x */
    public boolean[] mo25051r() {
        return new boolean[0];
    }

    /* renamed from: y */
    public void mo25052t(@C12579k C12236c cVar, int i, @C12579k C12272g gVar, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        Intrinsics.checkNotNullParameter(gVar, "builder");
        gVar.mo25048e(cVar.mo24866C(getDescriptor(), i));
    }

    @C12579k
    /* renamed from: z */
    public C12272g mo25012k(@C12579k boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new C12272g(zArr);
    }
}
