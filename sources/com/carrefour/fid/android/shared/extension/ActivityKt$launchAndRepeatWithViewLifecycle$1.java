package com.carrefour.fid.android.shared.extension;

import androidx.appcompat.app.C0475e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.ActivityKt$launchAndRepeatWithViewLifecycle$1", mo22502f = "Activity.kt", mo22503i = {}, mo22504l = {225}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activity.kt\ncom/carrefour/fid/android/shared/extension/ActivityKt$launchAndRepeatWithViewLifecycle$1\n*L\n1#1,311:1\n*E\n"})
public final class ActivityKt$launchAndRepeatWithViewLifecycle$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<C12074o0, C11045c<? super C11079d2>, Object> $block;
    final /* synthetic */ Lifecycle.State $lifecycleState;
    final /* synthetic */ C0475e $this_launchAndRepeatWithViewLifecycle;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.ActivityKt$launchAndRepeatWithViewLifecycle$1$1", mo22502f = "Activity.kt", mo22503i = {}, mo22504l = {226}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activity.kt\ncom/carrefour/fid/android/shared/extension/ActivityKt$launchAndRepeatWithViewLifecycle$1$1\n*L\n1#1,311:1\n*E\n"})
    /* renamed from: com.carrefour.fid.android.shared.extension.ActivityKt$launchAndRepeatWithViewLifecycle$1$1 */
    public static final class C287001 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C287001 r0 = new C287001(r4, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object mo83650g(@C12579k Object obj) {
            r4.invoke((C12074o0) this.L$0, this);
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11304p<C12074o0, C11045c<? super C11079d2>, Object> pVar = r4;
                this.label = 1;
                if (pVar.invoke((C12074o0) this.L$0, this) == h) {
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
            return ((C287001) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityKt$launchAndRepeatWithViewLifecycle$1(C0475e eVar, Lifecycle.State state, C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar, C11045c<? super ActivityKt$launchAndRepeatWithViewLifecycle$1> cVar) {
        super(2, cVar);
        this.$this_launchAndRepeatWithViewLifecycle = eVar;
        this.$lifecycleState = state;
        this.$block = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ActivityKt$launchAndRepeatWithViewLifecycle$1(this.$this_launchAndRepeatWithViewLifecycle, this.$lifecycleState, this.$block, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo83648g(@C12579k Object obj) {
        C0475e eVar = this.$this_launchAndRepeatWithViewLifecycle;
        Lifecycle.State state = this.$lifecycleState;
        final C11304p<C12074o0, C11045c<? super C11079d2>, Object> pVar = this.$block;
        C287001 r1 = new C287001((C11045c<? super C287001>) null);
        C11322b0.m43482e(0);
        RepeatOnLifecycleKt.m90582b(eVar, state, r1, this);
        C11322b0.m43482e(1);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C0475e eVar = this.$this_launchAndRepeatWithViewLifecycle;
            Lifecycle.State state = this.$lifecycleState;
            final C11304p<C12074o0, C11045c<? super C11079d2>, Object> pVar = this.$block;
            C287001 r3 = new C287001((C11045c<? super C287001>) null);
            this.label = 1;
            if (RepeatOnLifecycleKt.m90582b(eVar, state, r3, this) == h) {
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
        return ((ActivityKt$launchAndRepeatWithViewLifecycle$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
