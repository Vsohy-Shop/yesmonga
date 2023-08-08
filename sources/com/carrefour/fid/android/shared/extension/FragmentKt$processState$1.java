package com.carrefour.fid.android.shared.extension;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.FragmentKt$processState$1", mo22502f = "Fragment.kt", mo22503i = {}, mo22504l = {169}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/u$d;", "S", "Lcom/carrefour/fid/android/shared/base/u$b;", "I", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$processState$1\n*L\n1#1,261:1\n*E\n"})
public final class FragmentKt$processState$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<S, C11079d2> $action;
    final /* synthetic */ Fragment $this_processState;
    final /* synthetic */ BaseMVIViewModel<S, I> $viewModel;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1", mo22502f = "Fragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/u$d;", "S", "Lcom/carrefour/fid/android/shared/base/u$b;", "I", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$processState$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,261:1\n53#2:262\n55#2:266\n50#3:263\n55#3:265\n106#4:264\n*S KotlinDebug\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$processState$1$1\n*L\n170#1:262\n170#1:266\n170#1:263\n170#1:265\n170#1:264\n*E\n"})
    /* renamed from: com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1 */
    public static final class C287221 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C287221 r0 = new C287221(r4, r5, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object mo83700g(@C12579k Object obj) {
            C11909g.m47412V0(new FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1(r4.getUiState(), r5), (C12074o0) this.L$0);
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C11909g.m47412V0(new FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1(r4.getUiState(), r5), (C12074o0) this.L$0);
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C287221) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentKt$processState$1(Fragment fragment, BaseMVIViewModel<S, I> baseMVIViewModel, C11300l<? super S, C11079d2> lVar, C11045c<? super FragmentKt$processState$1> cVar) {
        super(2, cVar);
        this.$this_processState = fragment;
        this.$viewModel = baseMVIViewModel;
        this.$action = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FragmentKt$processState$1(this.$this_processState, this.$viewModel, this.$action, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo83698g(@C12579k Object obj) {
        Lifecycle lifecycle = this.$this_processState.getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        final BaseMVIViewModel<S, I> baseMVIViewModel = this.$viewModel;
        final C11300l<S, C11079d2> lVar = this.$action;
        C287221 r1 = new C287221((C11045c<? super C287221>) null);
        C11322b0.m43482e(0);
        RepeatOnLifecycleKt.m90581a(lifecycle, state, r1, this);
        C11322b0.m43482e(1);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Lifecycle lifecycle = this.$this_processState.getViewLifecycleOwner().getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            final BaseMVIViewModel<S, I> baseMVIViewModel = this.$viewModel;
            final C11300l<S, C11079d2> lVar = this.$action;
            C287221 r3 = new C287221((C11045c<? super C287221>) null);
            this.label = 1;
            if (RepeatOnLifecycleKt.m90581a(lifecycle, state, r3, this) == h) {
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
        return ((FragmentKt$processState$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
