package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.CreateOrAttachCardViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.mvi.CreateLoyaltyCard;
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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateOrAttachCardFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1", mo22502f = "CreateOrAttachCardFragment.kt", mo22503i = {}, mo22504l = {155}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H@¨\u0006\u0002"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "com/carrefour/fid/android/shared/extension/FragmentKt$launchAndRepeatWithViewLifecycle$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$launchAndRepeatWithViewLifecycle$1\n*L\n1#1,261:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateOrAttachCardFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1 */
public final class C24351xe37831ca extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Lifecycle.State $lifecycleState;
    final /* synthetic */ Fragment $this_launchAndRepeatWithViewLifecycle;
    int label;
    final /* synthetic */ CreateOrAttachCardFragment this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateOrAttachCardFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1$1", mo22502f = "CreateOrAttachCardFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H@¨\u0006\u0002"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "com/carrefour/fid/android/shared/extension/FragmentKt$launchAndRepeatWithViewLifecycle$1$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt$launchAndRepeatWithViewLifecycle$1$1\n+ 2 CreateOrAttachCardFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateOrAttachCardFragment\n*L\n1#1,261:1\n45#2,13:262\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateOrAttachCardFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1$1 */
    public static final class C243521 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C243521 r0 = new C243521(cVar, createOrAttachCardFragment);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C12074o0 o0Var = (C12074o0) this.L$0;
                CreateOrAttachCardViewModel T0 = createOrAttachCardFragment.mo71200c1();
                T0.sendIntent(new CreateLoyaltyCard.GetCardType(CreateOrAttachCardFragment.m106930S0(createOrAttachCardFragment).f92009k.getCurrentItem()));
                Bundle arguments = createOrAttachCardFragment.getArguments();
                boolean z = false;
                if (arguments != null) {
                    z = arguments.getBoolean(C38212b.f96814v, false);
                }
                T0.sendIntent(new CreateLoyaltyCard.CheckAttachCard(z));
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C243521) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24351xe37831ca(Fragment fragment, Lifecycle.State state, C11045c cVar, CreateOrAttachCardFragment createOrAttachCardFragment) {
        super(2, cVar);
        this.$this_launchAndRepeatWithViewLifecycle = fragment;
        this.$lifecycleState = state;
        this.this$0 = createOrAttachCardFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new C24351xe37831ca(this.$this_launchAndRepeatWithViewLifecycle, this.$lifecycleState, cVar, this.this$0);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Lifecycle lifecycle = this.$this_launchAndRepeatWithViewLifecycle.getViewLifecycleOwner().getLifecycle();
            Lifecycle.State state = this.$lifecycleState;
            final CreateOrAttachCardFragment createOrAttachCardFragment = this.this$0;
            C243521 r3 = new C243521((C11045c) null);
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
        return ((C24351xe37831ca) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
