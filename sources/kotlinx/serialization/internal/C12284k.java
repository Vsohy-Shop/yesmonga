package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.C11354n;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.k */
public final class C12284k extends C12277h1<Byte, byte[], C12281j> implements C12248g<byte[]> {
    @C12579k

    /* renamed from: c */
    public static final C12284k f30079c = new C12284k();

    public C12284k() {
        super(C12197a.m48825y(C11354n.f28470a));
    }

    /* renamed from: A */
    public void mo25053v(@C12579k C12239d dVar, @C12579k byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(bArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.mo24920q(getDescriptor(), i2, bArr[i2]);
        }
    }

    /* renamed from: w */
    public int mo25007e(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @C12579k
    /* renamed from: x */
    public byte[] mo25051r() {
        return new byte[0];
    }

    /* renamed from: y */
    public void mo25052t(@C12579k C12236c cVar, int i, @C12579k C12281j jVar, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        Intrinsics.checkNotNullParameter(jVar, "builder");
        jVar.mo25076e(cVar.mo24865B(getDescriptor(), i));
    }

    @C12579k
    /* renamed from: z */
    public C12281j mo25012k(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new C12281j(bArr);
    }
}
