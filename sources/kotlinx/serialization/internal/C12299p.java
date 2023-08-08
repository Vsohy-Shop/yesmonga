package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.p */
public final class C12299p implements C12248g<Character> {
    @C12579k

    /* renamed from: a */
    public static final C12299p f30095a = new C12299p();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30096b = new C12283j1("kotlin.Char", C12207e.C12210c.f29996a);

    @C12579k
    /* renamed from: a */
    public Character deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return Character.valueOf(eVar.mo24894x());
    }

    /* renamed from: b */
    public void mo25127b(@C12579k C12244g gVar, char c) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        gVar.mo24925v(c);
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30096b;
    }

    public /* bridge */ /* synthetic */ void serialize(C12244g gVar, Object obj) {
        mo25127b(gVar, ((Character) obj).charValue());
    }
}
