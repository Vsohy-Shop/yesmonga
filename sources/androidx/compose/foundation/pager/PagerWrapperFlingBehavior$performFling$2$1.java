package androidx.compose.foundation.pager;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "remainingScrollOffset", "Lkotlin/d2;", "a", "(F)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PagerWrapperFlingBehavior$performFling$2$1 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ PagerWrapperFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerWrapperFlingBehavior$performFling$2$1(PagerWrapperFlingBehavior pagerWrapperFlingBehavior) {
        super(1);
        this.this$0 = pagerWrapperFlingBehavior;
    }

    /* renamed from: a */
    public final void mo9107a(float f) {
        this.this$0.mo9106c().mo9088X(f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9107a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
