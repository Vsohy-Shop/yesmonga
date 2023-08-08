package com.carrefour.fid.android.shared.util.events;

import androidx.compose.runtime.C8415c2;
import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$2", mo22502f = "SingleEventCoroutineLauncher.kt", mo22503i = {}, mo22504l = {20}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSingleEventCoroutineLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleEventCoroutineLauncher.kt\ncom/carrefour/fid/android/shared/util/events/SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,26:1\n21#2:27\n23#2:31\n50#3:28\n55#3:30\n106#4:29\n*S KotlinDebug\n*F\n+ 1 SingleEventCoroutineLauncher.kt\ncom/carrefour/fid/android/shared/util/events/SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$2\n*L\n18#1:27\n18#1:31\n18#1:28\n18#1:30\n18#1:29\n*E\n"})
public final class SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11289a<Boolean> $completeAction;
    final /* synthetic */ C11289a<Boolean> $filterCondition;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ T $state;
    int label;

    /* renamed from: com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$2$a */
    public static final class C28925a implements C11908f<T> {

        /* renamed from: a */
        public final /* synthetic */ C11289a<Boolean> f70873a;

        /* renamed from: b */
        public final /* synthetic */ C12074o0 f70874b;

        public C28925a(C11289a<Boolean> aVar, C12074o0 o0Var) {
            this.f70873a = aVar;
            this.f70874b = o0Var;
        }

        @C12580l
        public final Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
            if (!this.f70873a.invoke().booleanValue()) {
                return C11079d2.f28267a;
            }
            C12079p0.m48265f(this.f70874b, (CancellationException) null, 1, (Object) null);
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$2(T t, C11289a<Boolean> aVar, C11289a<Boolean> aVar2, C12074o0 o0Var, C11045c<? super SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$2> cVar) {
        super(2, cVar);
        this.$state = t;
        this.$filterCondition = aVar;
        this.$completeAction = aVar2;
        this.$scope = o0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$2(this.$state, this.$filterCondition, this.$completeAction, this.$scope, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final T t = this.$state;
            C11907e g0 = C11909g.m47451g0(new C28921xb9cbfb67(C8415c2.m30253v(new C11289a<T>() {
                public final T invoke() {
                    return t;
                }
            }), this.$filterCondition));
            C28925a aVar = new C28925a(this.$completeAction, this.$scope);
            this.label = 1;
            if (g0.collect(aVar, this) == h) {
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
        return ((SingleEventCoroutineLauncherKt$SingleEventCoroutineLauncher$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
