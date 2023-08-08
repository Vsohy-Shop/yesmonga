package kotlinx.serialization.internal;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.C12201a;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"A", "B", "C", "Lkotlinx/serialization/descriptors/a;", "Lkotlin/d2;", "a", "(Lkotlinx/serialization/descriptors/a;)V"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class TripleSerializer$descriptor$1 extends Lambda implements C11300l<C12201a, C11079d2> {
    final /* synthetic */ TripleSerializer<A, B, C> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TripleSerializer$descriptor$1(TripleSerializer<A, B, C> tripleSerializer) {
        super(1);
        this.this$0 = tripleSerializer;
    }

    /* renamed from: a */
    public final void mo25002a(@C12579k C12201a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$buildClassSerialDescriptor");
        C12201a aVar2 = aVar;
        C12201a.m48861b(aVar2, "first", this.this$0.f30049a.getDescriptor(), (List) null, false, 12, (Object) null);
        C12201a.m48861b(aVar2, "second", this.this$0.f30050b.getDescriptor(), (List) null, false, 12, (Object) null);
        C12201a.m48861b(aVar2, "third", this.this$0.f30051c.getDescriptor(), (List) null, false, 12, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo25002a((C12201a) obj);
        return C11079d2.f28267a;
    }
}
