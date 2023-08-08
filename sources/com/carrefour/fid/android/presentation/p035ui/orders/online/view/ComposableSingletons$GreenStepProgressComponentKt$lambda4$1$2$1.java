package com.carrefour.fid.android.presentation.p035ui.orders.online.view;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.orders.online.view.ComposableSingletons$GreenStepProgressComponentKt$lambda-4$1$2$1", mo22502f = "GreenStepProgressComponent.kt", mo22503i = {}, mo22504l = {128}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.ComposableSingletons$GreenStepProgressComponentKt$lambda-4$1$2$1  reason: invalid class name */
public final class ComposableSingletons$GreenStepProgressComponentKt$lambda4$1$2$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C8700z0<Integer> $targetStep$delegate;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$GreenStepProgressComponentKt$lambda4$1$2$1(C8700z0<Integer> z0Var, C11045c<? super ComposableSingletons$GreenStepProgressComponentKt$lambda4$1$2$1> cVar) {
        super(2, cVar);
        this.$targetStep$delegate = z0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ComposableSingletons$GreenStepProgressComponentKt$lambda4$1$2$1(this.$targetStep$delegate, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            this.label = 1;
            if (DelayKt.m45925b(5000, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ComposableSingletons$GreenStepProgressComponentKt$lambda4$1.m109266d(this.$targetStep$delegate, 2);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ComposableSingletons$GreenStepProgressComponentKt$lambda4$1$2$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
