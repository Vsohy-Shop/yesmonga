package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.design.components.compose.C36995l;
import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$LongPressLaunchedEffect$1", mo22502f = "SearchBarComponent.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchBarComponentKt$LongPressLaunchedEffect$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<C36995l, C11079d2> $actioner;
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ C8578k2<Boolean> $isPressed$delegate;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$LongPressLaunchedEffect$1$1", mo22502f = "SearchBarComponent.kt", mo22503i = {}, mo22504l = {190}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.design.components.compose.SearchBarComponentKt$LongPressLaunchedEffect$1$1 */
    public static final class C369601 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C369601(lVar, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                this.label = 1;
                if (DelayKt.m45925b(400, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar.invoke(C36995l.C36998c.f92408a);
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C369601) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarComponentKt$LongPressLaunchedEffect$1(C12074o0 o0Var, C8578k2<Boolean> k2Var, C11300l<? super C36995l, C11079d2> lVar, C11045c<? super SearchBarComponentKt$LongPressLaunchedEffect$1> cVar) {
        super(2, cVar);
        this.$coroutineScope = o0Var;
        this.$isPressed$delegate = k2Var;
        this.$actioner = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SearchBarComponentKt$LongPressLaunchedEffect$1(this.$coroutineScope, this.$isPressed$delegate, this.$actioner, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            if (SearchBarComponentKt.m151596b(this.$isPressed$delegate)) {
                C12074o0 o0Var = this.$coroutineScope;
                final C11300l<C36995l, C11079d2> lVar = this.$actioner;
                SearchBarComponentKt.f92312c = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C369601((C11045c<? super C369601>) null), 3, (Object) null);
            } else {
                C11723c2 p = SearchBarComponentKt.f92312c;
                if (p != null) {
                    C11723c2.C11724a.m46184b(p, (CancellationException) null, 1, (Object) null);
                }
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SearchBarComponentKt$LongPressLaunchedEffect$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
