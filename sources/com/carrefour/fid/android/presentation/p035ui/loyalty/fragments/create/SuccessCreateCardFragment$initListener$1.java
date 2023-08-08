package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.SuccessCreateCardFragment$initListener$1", mo22502f = "SuccessCreateCardFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.SuccessCreateCardFragment$initListener$1 */
public final class SuccessCreateCardFragment$initListener$1 extends SuspendLambda implements C11304p<C11079d2, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ SuccessCreateCardFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuccessCreateCardFragment$initListener$1(SuccessCreateCardFragment successCreateCardFragment, C11045c<? super SuccessCreateCardFragment$initListener$1> cVar) {
        super(2, cVar);
        this.this$0 = successCreateCardFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SuccessCreateCardFragment$initListener$1(this.this$0, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11079d2 d2Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SuccessCreateCardFragment$initListener$1) create(d2Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            SuccessCreateCardViewModel Q0 = this.this$0.mo71231W0();
            Q0.sendTagOnClickGo();
            Q0.sendAppsFlyerTagCardCreation();
            CreateSecretCodeFragment createSecretCodeFragment = (CreateSecretCodeFragment) FragmentKt.m148916b(this.this$0, CreateSecretCodeFragment.class);
            if (createSecretCodeFragment != null) {
                CreateSecretCodeFragment.m106953W0(createSecretCodeFragment, false, 1, (Object) null);
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
