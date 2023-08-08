package com.carrefour.fid.android.shared.extension;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11944n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.FragmentKt$processEvent$1", mo22502f = "Fragment.kt", mo22503i = {}, mo22504l = {184}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/u$a;", "E", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$processEvent$1\n*L\n1#1,261:1\n*E\n"})
public final class FragmentKt$processEvent$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<E, C11079d2> $action;
    final /* synthetic */ Fragment $this_processEvent;
    final /* synthetic */ BaseMVIViewModel<?, ?> $viewModel;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.FragmentKt$processEvent$1$1", mo22502f = "Fragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/u$a;", "E", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$processEvent$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,261:1\n53#2:262\n55#2:266\n50#3:263\n55#3:265\n106#4:264\n*S KotlinDebug\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$processEvent$1$1\n*L\n185#1:262\n185#1:266\n185#1:263\n185#1:265\n185#1:264\n*E\n"})
    /* renamed from: com.carrefour.fid.android.shared.extension.FragmentKt$processEvent$1$1 */
    public static final class C287211 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C287211 r0 = new C287211(r4, r5, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object mo83696g(@C12579k Object obj) {
            C11944n<C28505u.C28506a> uiEvent = r4.getUiEvent();
            C11300l<E, C11079d2> lVar = r5;
            Intrinsics.needClassReification();
            C11909g.m47412V0(new FragmentKt$processEvent$1$1$invokeSuspend$$inlined$map$1(uiEvent, lVar), (C12074o0) this.L$0);
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C11944n<C28505u.C28506a> uiEvent = r4.getUiEvent();
                C11300l<E, C11079d2> lVar = r5;
                Intrinsics.needClassReification();
                C11909g.m47412V0(new FragmentKt$processEvent$1$1$invokeSuspend$$inlined$map$1(uiEvent, lVar), (C12074o0) this.L$0);
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C287211) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentKt$processEvent$1(Fragment fragment, BaseMVIViewModel<?, ?> baseMVIViewModel, C11300l<? super E, C11079d2> lVar, C11045c<? super FragmentKt$processEvent$1> cVar) {
        super(2, cVar);
        this.$this_processEvent = fragment;
        this.$viewModel = baseMVIViewModel;
        this.$action = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FragmentKt$processEvent$1(this.$this_processEvent, this.$viewModel, this.$action, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo83694g(@C12579k Object obj) {
        Lifecycle lifecycle = this.$this_processEvent.getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        Intrinsics.needClassReification();
        final BaseMVIViewModel<?, ?> baseMVIViewModel = this.$viewModel;
        final C11300l<E, C11079d2> lVar = this.$action;
        C287211 r1 = new C287211((C11045c<? super C287211>) null);
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
            Lifecycle lifecycle = this.$this_processEvent.getViewLifecycleOwner().getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            Intrinsics.needClassReification();
            final BaseMVIViewModel<?, ?> baseMVIViewModel = this.$viewModel;
            final C11300l<E, C11079d2> lVar = this.$action;
            C287211 r3 = new C287211((C11045c<? super C287211>) null);
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
        return ((FragmentKt$processEvent$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
