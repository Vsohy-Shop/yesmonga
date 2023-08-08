package kotlinx.serialization.json.internal;

import kotlin.C11531s;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11627y;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12234a;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;

@C11531s
/* renamed from: kotlinx.serialization.json.internal.m */
public final class C12386m extends C12234a {
    @C12579k

    /* renamed from: d */
    public final C12359a f30318d;
    @C12579k

    /* renamed from: e */
    public final C12434e f30319e;

    public C12386m(@C12579k C12359a aVar, @C12579k C12341a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "lexer");
        Intrinsics.checkNotNullParameter(aVar2, "json");
        this.f30318d = aVar;
        this.f30319e = aVar2.mo25277a();
    }

    /* renamed from: H */
    public byte mo24871H() {
        C12359a aVar = this.f30318d;
        String r = aVar.mo25449r();
        try {
            return C11627y.m45378e(r);
        } catch (IllegalArgumentException unused) {
            C12359a.m49866x(aVar, "Failed to parse type '" + "UByte" + "' for input '" + r + '\'', 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    @C12579k
    /* renamed from: a */
    public C12434e mo24933a() {
        return this.f30319e;
    }

    /* renamed from: h */
    public int mo24879h() {
        C12359a aVar = this.f30318d;
        String r = aVar.mo25449r();
        try {
            return C11627y.m45382i(r);
        } catch (IllegalArgumentException unused) {
            C12359a.m49866x(aVar, "Failed to parse type '" + "UInt" + "' for input '" + r + '\'', 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: l */
    public long mo24883l() {
        C12359a aVar = this.f30318d;
        String r = aVar.mo25449r();
        try {
            return C11627y.m45386m(r);
        } catch (IllegalArgumentException unused) {
            C12359a.m49866x(aVar, "Failed to parse type '" + "ULong" + "' for input '" + r + '\'', 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: o */
    public int mo24931o(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    /* renamed from: s */
    public short mo24889s() {
        C12359a aVar = this.f30318d;
        String r = aVar.mo25449r();
        try {
            return C11627y.m45390q(r);
        } catch (IllegalArgumentException unused) {
            C12359a.m49866x(aVar, "Failed to parse type '" + "UShort" + "' for input '" + r + '\'', 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }
}
