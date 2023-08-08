package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus;

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
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11944n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.PrimeFidFragment$onViewCreated$$inlined$processEvent$1", mo22502f = "PrimeFidFragment.kt", mo22503i = {}, mo22504l = {184}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H@¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/u$a;", "E", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "com/carrefour/fid/android/shared/extension/FragmentKt$processEvent$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$processEvent$1\n*L\n1#1,261:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.PrimeFidFragment$onViewCreated$$inlined$processEvent$1 */
public final class PrimeFidFragment$onViewCreated$$inlined$processEvent$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ PrimeFidFragment $receiver$inlined;
    final /* synthetic */ Fragment $this_processEvent;
    final /* synthetic */ BaseMVIViewModel $viewModel;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.PrimeFidFragment$onViewCreated$$inlined$processEvent$1$1", mo22502f = "PrimeFidFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H@¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/u$a;", "E", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "com/carrefour/fid/android/shared/extension/FragmentKt$processEvent$1$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$processEvent$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,261:1\n53#2:262\n55#2:266\n50#3:263\n55#3:265\n106#4:264\n*S KotlinDebug\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$processEvent$1$1\n*L\n185#1:262\n185#1:266\n185#1:263\n185#1:265\n185#1:264\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.PrimeFidFragment$onViewCreated$$inlined$processEvent$1$1 */
    public static final class C242981 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C242981 r0 = new C242981(baseMVIViewModel, cVar, primeFidFragment);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                final C11944n<C28505u.C28506a> uiEvent = baseMVIViewModel.getUiEvent();
                final PrimeFidFragment primeFidFragment = primeFidFragment;
                C11909g.m47412V0(new C11907e<C11079d2>() {
                    @C12580l
                    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
                        C11907e eVar = uiEvent;
                        final PrimeFidFragment primeFidFragment = primeFidFragment;
                        Object collect = eVar.collect(new C11908f() {
                            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                            @org.jetbrains.annotations.C12580l
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r6) {
                                /*
                                    r4 = this;
                                    boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus.PrimeFidFragment$onViewCreated$$inlined$processEvent$1.C242981.C242991.C243002.C243011
                                    if (r0 == 0) goto L_0x0013
                                    r0 = r6
                                    com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.PrimeFidFragment$onViewCreated$$inlined$processEvent$1$1$1$2$1 r0 = (com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus.PrimeFidFragment$onViewCreated$$inlined$processEvent$1.C242981.C242991.C243002.C243011) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L_0x0013
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L_0x0018
                                L_0x0013:
                                    com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.PrimeFidFragment$onViewCreated$$inlined$processEvent$1$1$1$2$1 r0 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.PrimeFidFragment$onViewCreated$$inlined$processEvent$1$1$1$2$1
                                    r0.<init>(r4, r6)
                                L_0x0018:
                                    java.lang.Object r6 = r0.result
                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                    int r2 = r0.label
                                    r3 = 1
                                    if (r2 == 0) goto L_0x0031
                                    if (r2 != r3) goto L_0x0029
                                    kotlin.C11661u0.m45747n(r6)
                                    goto L_0x004c
                                L_0x0029:
                                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                    r5.<init>(r6)
                                    throw r5
                                L_0x0031:
                                    kotlin.C11661u0.m45747n(r6)
                                    kotlinx.coroutines.flow.f r6 = r4
                                    com.carrefour.fid.android.shared.base.u$a r5 = (com.carrefour.fid.android.shared.base.C28505u.C28506a) r5
                                    if (r5 == 0) goto L_0x004f
                                    com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b r5 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26527b) r5
                                    com.carrefour.fid.android.presentation.ui.loyalty.fragments.bonus.PrimeFidFragment r2 = r2
                                    r2.mo71095m1(r5)
                                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                                    r0.label = r3
                                    java.lang.Object r5 = r6.emit(r5, r0)
                                    if (r5 != r1) goto L_0x004c
                                    return r1
                                L_0x004c:
                                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                                    return r5
                                L_0x004f:
                                    java.lang.NullPointerException r5 = new java.lang.NullPointerException
                                    java.lang.String r6 = "null cannot be cast to non-null type com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.PrimeFid.UiEvent"
                                    r5.<init>(r6)
                                    throw r5
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus.PrimeFidFragment$onViewCreated$$inlined$processEvent$1.C242981.C242991.C243002.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                            }
                        }, cVar);
                        if (collect == C11063b.m42612h()) {
                            return collect;
                        }
                        return C11079d2.f28267a;
                    }
                }, (C12074o0) this.L$0);
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C242981) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrimeFidFragment$onViewCreated$$inlined$processEvent$1(Fragment fragment, BaseMVIViewModel baseMVIViewModel, C11045c cVar, PrimeFidFragment primeFidFragment) {
        super(2, cVar);
        this.$this_processEvent = fragment;
        this.$viewModel = baseMVIViewModel;
        this.$receiver$inlined = primeFidFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PrimeFidFragment$onViewCreated$$inlined$processEvent$1(this.$this_processEvent, this.$viewModel, cVar, this.$receiver$inlined);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Lifecycle lifecycle = this.$this_processEvent.getViewLifecycleOwner().getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            final BaseMVIViewModel baseMVIViewModel = this.$viewModel;
            final PrimeFidFragment primeFidFragment = this.$receiver$inlined;
            C242981 r3 = new C242981((C11045c) null);
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
        return ((PrimeFidFragment$onViewCreated$$inlined$processEvent$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
