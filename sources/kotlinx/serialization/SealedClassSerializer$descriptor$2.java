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
import kotlinx.serialization.descriptors.C12204d;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "T", "Lkotlinx/serialization/descriptors/f;", "a", "()Lkotlinx/serialization/descriptors/f;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class SealedClassSerializer$descriptor$2 extends Lambda implements C11289a<C12217f> {
    final /* synthetic */ String $serialName;
    final /* synthetic */ C12248g<? extends T>[] $subclassSerializers;
    final /* synthetic */ SealedClassSerializer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer$descriptor$2(String str, SealedClassSerializer<T> sealedClassSerializer, C12248g<? extends T>[] gVarArr) {
        super(0);
        this.$serialName = str;
        this.this$0 = sealedClassSerializer;
        this.$subclassSerializers = gVarArr;
    }

    @C12579k
    /* renamed from: a */
    public final C12217f invoke() {
        final SealedClassSerializer<T> sealedClassSerializer = this.this$0;
        final C12248g<? extends T>[] gVarArr = this.$subclassSerializers;
        return SerialDescriptorsKt.m48845e(this.$serialName, C12204d.C12206b.f29993a, new C12217f[0], new C11300l<C12201a, C11079d2>() {
            /* renamed from: a */
            public final void mo24814a(@C12579k C12201a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$buildSerialDescriptor");
                C12201a.m48861b(aVar, "type", C12197a.m48800F(C11368t0.f28504a).getDescriptor(), (List) null, false, 12, (Object) null);
                C12201a.m48861b(aVar, "value", SerialDescriptorsKt.m48845e("kotlinx.serialization.Sealed<" + sealedClassSerializer.mo24807d().mo22848s() + C11626x.f28915f, C12224h.C12225a.f30009a, new C12217f[0], new SealedClassSerializer$descriptor$2$1$elementDescriptor$1(gVarArr)), (List) null, false, 12, (Object) null);
                aVar.mo24847l(sealedClassSerializer.f29960b);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo24814a((C12201a) obj);
                return C11079d2.f28267a;
            }
        });
    }
}
