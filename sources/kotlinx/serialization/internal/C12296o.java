package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.C11358p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.o */
public final class C12296o extends C12277h1<Character, char[], C12293n> implements C12248g<char[]> {
    @C12579k

    /* renamed from: c */
    public static final C12296o f30093c = new C12296o();

    public C12296o() {
        super(C12197a.m48826z(C11358p.f28476a));
    }

    /* renamed from: A */
    public void mo25053v(@C12579k C12239d dVar, @C12579k char[] cArr, int i) {
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(cArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.mo24918o(getDescriptor(), i2, cArr[i2]);
        }
    }

    /* renamed from: w */
    public int mo25007e(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @C12579k
    /* renamed from: x */
    public char[] mo25051r() {
        return new char[0];
    }

    /* renamed from: y */
    public void mo25052t(@C12579k C12236c cVar, int i, @C12579k C12293n nVar, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        Intrinsics.checkNotNullParameter(nVar, "builder");
        nVar.mo25110e(cVar.mo24864A(getDescriptor(), i));
    }

    @C12579k
    /* renamed from: z */
    public C12293n mo25012k(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new C12293n(cArr);
    }
}
