package kotlinx.serialization;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C11626x;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12201a;
import kotlinx.serialization.descriptors.C12202b;
import kotlinx.serialization.descriptors.C12204d;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "T", "Lkotlinx/serialization/descriptors/f;", "a", "()Lkotlinx/serialization/descriptors/f;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class PolymorphicSerializer$descriptor$2 extends Lambda implements C11289a<C12217f> {
    final /* synthetic */ PolymorphicSerializer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PolymorphicSerializer$descriptor$2(PolymorphicSerializer<T> polymorphicSerializer) {
        super(0);
        this.this$0 = polymorphicSerializer;
    }

    @C12579k
    /* renamed from: a */
    public final C12217f invoke() {
        final PolymorphicSerializer<T> polymorphicSerializer = this.this$0;
        return C12202b.m48878e(SerialDescriptorsKt.m48845e("kotlinx.serialization.Polymorphic", C12204d.C12205a.f29992a, new C12217f[0], new C11300l<C12201a, C11079d2>() {
            /* renamed from: a */
            public final void mo24810a(@C12579k C12201a aVar) {
                C12201a aVar2 = aVar;
                Intrinsics.checkNotNullParameter(aVar2, "$this$buildSerialDescriptor");
                C12201a.m48861b(aVar, "type", C12197a.m48800F(C11368t0.f28504a).getDescriptor(), (List) null, false, 12, (Object) null);
                C12201a.m48861b(aVar, "value", SerialDescriptorsKt.m48846f("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.mo24807d().mo22848s() + C11626x.f28915f, C12224h.C12225a.f30009a, new C12217f[0], (C11300l) null, 8, (Object) null), (List) null, false, 12, (Object) null);
                aVar2.mo24847l(polymorphicSerializer.f29957b);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo24810a((C12201a) obj);
                return C11079d2.f28267a;
            }
        }), this.this$0.mo24807d());
    }
}
