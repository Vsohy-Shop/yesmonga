package kotlinx.serialization;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.descriptors.C12202b;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12258b1;
import kotlinx.serialization.internal.C12268e1;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12200d
public final class ContextualSerializer<T> implements C12248g<T> {
    @C12579k

    /* renamed from: a */
    public final C11494d<T> f29949a;
    @C12580l

    /* renamed from: b */
    public final C12248g<T> f29950b;
    @C12579k

    /* renamed from: c */
    public final List<C12248g<?>> f29951c;
    @C12579k

    /* renamed from: d */
    public final C12217f f29952d;

    public ContextualSerializer(@C12579k C11494d<T> dVar, @C12580l C12248g<T> gVar, @C12579k C12248g<?>[] gVarArr) {
        Intrinsics.checkNotNullParameter(dVar, "serializableClass");
        Intrinsics.checkNotNullParameter(gVarArr, "typeArgumentsSerializers");
        this.f29949a = dVar;
        this.f29950b = gVar;
        this.f29951c = C10956m.m41290t(gVarArr);
        this.f29952d = C12202b.m48878e(SerialDescriptorsKt.m48845e("kotlinx.serialization.ContextualSerializer", C12224h.C12225a.f30009a, new C12217f[0], new ContextualSerializer$descriptor$1(this)), dVar);
    }

    /* renamed from: b */
    public final C12248g<T> mo24801b(C12434e eVar) {
        C12248g<T> c = eVar.mo25579c(this.f29949a, this.f29951c);
        if (c != null || (c = this.f29950b) != null) {
            return c;
        }
        C12258b1.m49236i(this.f29949a);
        throw new KotlinNothingValueException();
    }

    @C12579k
    public T deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return eVar.mo24870G(mo24801b(eVar.mo24933a()));
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f29952d;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k T t) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(t, "value");
        gVar.mo24908e(mo24801b(gVar.mo24934a()), t);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContextualSerializer(@C12579k C11494d<T> dVar) {
        this(dVar, (C12248g) null, C12268e1.f30058a);
        Intrinsics.checkNotNullParameter(dVar, "serializableClass");
    }
}
