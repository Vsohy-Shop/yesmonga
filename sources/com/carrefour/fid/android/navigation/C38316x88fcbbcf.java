package com.carrefour.fid.android.navigation;

import androidx.appcompat.app.C0475e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.navigation.BottomNavActivity$onResume$$inlined$launchAndRepeatWithViewLifecycle$1", mo22502f = "BottomNavActivity.kt", mo22503i = {}, mo22504l = {225}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H@¨\u0006\u0002"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "com/carrefour/fid/android/shared/extension/ActivityKt$launchAndRepeatWithViewLifecycle$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activity.kt\ncom/carrefour/fid/android/shared/extension/ActivityKt$launchAndRepeatWithViewLifecycle$1\n*L\n1#1,311:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.navigation.BottomNavActivity$onResume$$inlined$launchAndRepeatWithViewLifecycle$1 */
public final class C38316x88fcbbcf extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Lifecycle.State $lifecycleState;
    final /* synthetic */ C0475e $this_launchAndRepeatWithViewLifecycle;
    int label;
    final /* synthetic */ BottomNavActivity this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.navigation.BottomNavActivity$onResume$$inlined$launchAndRepeatWithViewLifecycle$1$1", mo22502f = "BottomNavActivity.kt", mo22503i = {}, mo22504l = {312}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H@¨\u0006\u0002"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "com/carrefour/fid/android/shared/extension/ActivityKt$launchAndRepeatWithViewLifecycle$1$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activity.kt\ncom/carrefour/fid/android/shared/extension/ActivityKt$launchAndRepeatWithViewLifecycle$1$1\n+ 2 BottomNavActivity.kt\ncom/carrefour/fid/android/navigation/BottomNavActivity\n*L\n1#1,311:1\n234#2:312\n*E\n"})
    /* renamed from: com.carrefour.fid.android.navigation.BottomNavActivity$onResume$$inlined$launchAndRepeatWithViewLifecycle$1$1 */
    public static final class C383171 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C383171 r0 = new C383171(cVar, bottomNavActivity);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C12074o0 o0Var = (C12074o0) this.L$0;
                C11952u<Integer> x0 = bottomNavActivity.mo121093F1().mo76832x0();
                BottomNavActivity.C38308e eVar = new BottomNavActivity.C38308e(bottomNavActivity);
                this.label = 1;
                if (x0.collect(eVar, this) == h) {
                    return h;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C11661u0.m45747n(obj);
            }
            throw new KotlinNothingValueException();
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C383171) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38316x88fcbbcf(C0475e eVar, Lifecycle.State state, C11045c cVar, BottomNavActivity bottomNavActivity) {
        super(2, cVar);
        this.$this_launchAndRepeatWithViewLifecycle = eVar;
        this.$lifecycleState = state;
        this.this$0 = bottomNavActivity;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new C38316x88fcbbcf(this.$this_launchAndRepeatWithViewLifecycle, this.$lifecycleState, cVar, this.this$0);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C0475e eVar = this.$this_launchAndRepeatWithViewLifecycle;
            Lifecycle.State state = this.$lifecycleState;
            final BottomNavActivity bottomNavActivity = this.this$0;
            C383171 r3 = new C383171((C11045c) null);
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
        return ((C38316x88fcbbcf) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
