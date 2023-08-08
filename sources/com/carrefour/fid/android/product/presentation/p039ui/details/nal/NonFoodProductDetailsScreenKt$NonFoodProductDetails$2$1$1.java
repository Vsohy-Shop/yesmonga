package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$1 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ C8700z0<Float> $scrollToPosition$delegate;

    @C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$1$1", mo22502f = "NonFoodProductDetailsScreen.kt", mo22503i = {}, mo22504l = {502}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$1$1 */
    public static final class C278361 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C278361(scrollState, z0Var, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                ScrollState scrollState = scrollState;
                int L0 = C11409d.m43851L0(NonFoodProductDetailsScreenKt.m116860j(z0Var));
                this.label = 1;
                if (ScrollState.m9070n(scrollState, L0, (C1968g) null, this, 2, (Object) null) == h) {
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
            return ((C278361) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$1(C12074o0 o0Var, ScrollState scrollState, C8700z0<Float> z0Var) {
        super(0);
        this.$coroutineScope = o0Var;
        this.$scrollState = scrollState;
        this.$scrollToPosition$delegate = z0Var;
    }

    public final void invoke() {
        C12074o0 o0Var = this.$coroutineScope;
        final ScrollState scrollState = this.$scrollState;
        final C8700z0<Float> z0Var = this.$scrollToPosition$delegate;
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C278361((C11045c<? super C278361>) null), 3, (Object) null);
    }
}
