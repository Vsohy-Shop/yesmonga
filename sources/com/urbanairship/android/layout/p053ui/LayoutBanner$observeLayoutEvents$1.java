package com.urbanairship.android.layout.p053ui;

import com.urbanairship.android.layout.environment.LayoutEvent;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.ui.LayoutBanner$observeLayoutEvents$1", mo22502f = "LayoutBanner.kt", mo22503i = {}, mo22504l = {256}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
/* renamed from: com.urbanairship.android.layout.ui.LayoutBanner$observeLayoutEvents$1 */
public final class LayoutBanner$observeLayoutEvents$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11907e<LayoutEvent> $events;
    int label;
    final /* synthetic */ LayoutBanner this$0;

    /* renamed from: com.urbanairship.android.layout.ui.LayoutBanner$observeLayoutEvents$1$a */
    public static final class C35877a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ LayoutBanner f88737a;

        public C35877a(LayoutBanner layoutBanner) {
            this.f88737a = layoutBanner;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k LayoutEvent.C35585a aVar, @C12579k C11045c<? super C11079d2> cVar) {
            LayoutBanner.m147964i(this.f88737a, false, false, 3, (Object) null);
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutBanner$observeLayoutEvents$1(C11907e<? extends LayoutEvent> eVar, LayoutBanner layoutBanner, C11045c<? super LayoutBanner$observeLayoutEvents$1> cVar) {
        super(2, cVar);
        this.$events = eVar;
        this.this$0 = layoutBanner;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LayoutBanner$observeLayoutEvents$1(this.$events, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C35874x4d0d407b layoutBanner$observeLayoutEvents$1$invokeSuspend$$inlined$filterIsInstance$1 = new C35874x4d0d407b(this.$events);
            C35877a aVar = new C35877a(this.this$0);
            this.label = 1;
            if (layoutBanner$observeLayoutEvents$1$invokeSuspend$$inlined$filterIsInstance$1.collect(aVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LayoutBanner$observeLayoutEvents$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
