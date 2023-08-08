package kotlinx.serialization.json.internal;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.C12403k;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lkotlinx/serialization/json/k;", "node", "Lkotlin/d2;", "a", "(Lkotlinx/serialization/json/k;)V"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class AbstractJsonTreeEncoder$beginStructure$consumer$1 extends Lambda implements C11300l<C12403k, C11079d2> {
    final /* synthetic */ AbstractJsonTreeEncoder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractJsonTreeEncoder$beginStructure$consumer$1(AbstractJsonTreeEncoder abstractJsonTreeEncoder) {
        super(1);
        this.this$0 = abstractJsonTreeEncoder;
    }

    /* renamed from: a */
    public final void mo25392a(@C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "node");
        AbstractJsonTreeEncoder abstractJsonTreeEncoder = this.this$0;
        abstractJsonTreeEncoder.mo25390v0(AbstractJsonTreeEncoder.m49775g0(abstractJsonTreeEncoder), kVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo25392a((C12403k) obj);
        return C11079d2.f28267a;
    }
}
