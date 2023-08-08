package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

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
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11944n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$onViewCreated$$inlined$processState$1", mo22502f = "SecretCodeFragment.kt", mo22503i = {}, mo22504l = {169}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H@¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/u$d;", "S", "Lcom/carrefour/fid/android/shared/base/u$b;", "I", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "com/carrefour/fid/android/shared/extension/FragmentKt$processState$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$processState$1\n*L\n1#1,261:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$onViewCreated$$inlined$processState$1 */
public final class SecretCodeFragment$onViewCreated$$inlined$processState$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ SecretCodeFragment $receiver$inlined;
    final /* synthetic */ Fragment $this_processState;
    final /* synthetic */ BaseMVIViewModel $viewModel;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$onViewCreated$$inlined$processState$1$1", mo22502f = "SecretCodeFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H@¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/u$d;", "S", "Lcom/carrefour/fid/android/shared/base/u$b;", "I", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "com/carrefour/fid/android/shared/extension/FragmentKt$processState$1$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$processState$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,261:1\n53#2:262\n55#2:266\n50#3:263\n55#3:265\n106#4:264\n*S KotlinDebug\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$processState$1$1\n*L\n170#1:262\n170#1:266\n170#1:263\n170#1:265\n170#1:264\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$onViewCreated$$inlined$processState$1$1 */
    public static final class C245731 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C245731 r0 = new C245731(baseMVIViewModel, cVar, secretCodeFragment);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                final C11944n uiState = baseMVIViewModel.getUiState();
                final SecretCodeFragment secretCodeFragment = secretCodeFragment;
                C11909g.m47412V0(new C11907e<C11079d2>() {
                    @C12580l
                    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
                        C11907e eVar = uiState;
                        final SecretCodeFragment secretCodeFragment = secretCodeFragment;
                        Object collect = eVar.collect(new C11908f() {
                            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                            @org.jetbrains.annotations.C12580l
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r6) {
                                /*
                                    r4 = this;
                                    boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.SecretCodeFragment$onViewCreated$$inlined$processState$1.C245731.C245741.C245752.C245761
                                    if (r0 == 0) goto L_0x0013
                                    r0 = r6
                                    com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$onViewCreated$$inlined$processState$1$1$1$2$1 r0 = (com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.SecretCodeFragment$onViewCreated$$inlined$processState$1.C245731.C245741.C245752.C245761) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L_0x0013
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L_0x0018
                                L_0x0013:
                                    com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$onViewCreated$$inlined$processState$1$1$1$2$1 r0 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$onViewCreated$$inlined$processState$1$1$1$2$1
                                    r0.<init>(r4, r6)
                                L_0x0018:
                                    java.lang.Object r6 = r0.result
                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                    int r2 = r0.label
                                    r3 = 1
                                    if (r2 == 0) goto L_0x0031
                                    if (r2 != r3) goto L_0x0029
                                    kotlin.C11661u0.m45747n(r6)
                                    goto L_0x004a
                                L_0x0029:
                                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                    r5.<init>(r6)
                                    throw r5
                                L_0x0031:
                                    kotlin.C11661u0.m45747n(r6)
                                    kotlinx.coroutines.flow.f r6 = r4
                                    com.carrefour.fid.android.shared.base.u$d r5 = (com.carrefour.fid.android.shared.base.C28505u.C28509d) r5
                                    com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UIState r5 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode.UIState) r5
                                    com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment r2 = r2
                                    r2.mo71830n1(r5)
                                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                                    r0.label = r3
                                    java.lang.Object r5 = r6.emit(r5, r0)
                                    if (r5 != r1) goto L_0x004a
                                    return r1
                                L_0x004a:
                                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                                    return r5
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.SecretCodeFragment$onViewCreated$$inlined$processState$1.C245731.C245741.C245752.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
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
            return ((C245731) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecretCodeFragment$onViewCreated$$inlined$processState$1(Fragment fragment, BaseMVIViewModel baseMVIViewModel, C11045c cVar, SecretCodeFragment secretCodeFragment) {
        super(2, cVar);
        this.$this_processState = fragment;
        this.$viewModel = baseMVIViewModel;
        this.$receiver$inlined = secretCodeFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SecretCodeFragment$onViewCreated$$inlined$processState$1(this.$this_processState, this.$viewModel, cVar, this.$receiver$inlined);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Lifecycle lifecycle = this.$this_processState.getViewLifecycleOwner().getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            final BaseMVIViewModel baseMVIViewModel = this.$viewModel;
            final SecretCodeFragment secretCodeFragment = this.$receiver$inlined;
            C245731 r3 = new C245731((C11045c) null);
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
        return ((SecretCodeFragment$onViewCreated$$inlined$processState$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
