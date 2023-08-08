package kotlinx.serialization.internal;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12201a;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"K", "V", "Lkotlinx/serialization/descriptors/a;", "Lkotlin/d2;", "a", "(Lkotlinx/serialization/descriptors/a;)V"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class PairSerializer$descriptor$1 extends Lambda implements C11300l<C12201a, C11079d2> {
    final /* synthetic */ C12248g<K> $keySerializer;
    final /* synthetic */ C12248g<V> $valueSerializer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairSerializer$descriptor$1(C12248g<K> gVar, C12248g<V> gVar2) {
        super(1);
        this.$keySerializer = gVar;
        this.$valueSerializer = gVar2;
    }

    /* renamed from: a */
    public final void mo24965a(@C12579k C12201a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$buildClassSerialDescriptor");
        C12201a aVar2 = aVar;
        C12201a.m48861b(aVar2, "first", this.$keySerializer.getDescriptor(), (List) null, false, 12, (Object) null);
        C12201a.m48861b(aVar2, "second", this.$valueSerializer.getDescriptor(), (List) null, false, 12, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo24965a((C12201a) obj);
        return C11079d2.f28267a;
    }
}
