package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.domain.models.account.C37947a;
import com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11944n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$2", mo22502f = "CreateLoyaltyCardStepTwoFragment.kt", mo22503i = {}, mo22504l = {79}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$2 */
public final class CreateLoyaltyCardStepTwoFragment$validateUserInput$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ CreateLoyaltyCardStepTwoFragment this$0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$2$a */
    public static final class C24348a implements C11908f<C37947a> {

        /* renamed from: a */
        public final /* synthetic */ CreateLoyaltyCardStepTwoFragment f60781a;

        public C24348a(CreateLoyaltyCardStepTwoFragment createLoyaltyCardStepTwoFragment) {
            this.f60781a = createLoyaltyCardStepTwoFragment;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C37947a aVar, @C12579k C11045c<? super C11079d2> cVar) {
            LoyaltyMembershipConsentModel initialAddress = this.f60781a.mo71181M0().getInitialAddress();
            if (initialAddress != null) {
                initialAddress.mo117850q(aVar.mo116774e());
            }
            C19736g.m91827a(this.f60781a).mo58156s0();
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLoyaltyCardStepTwoFragment$validateUserInput$2(CreateLoyaltyCardStepTwoFragment createLoyaltyCardStepTwoFragment, C11045c<? super CreateLoyaltyCardStepTwoFragment$validateUserInput$2> cVar) {
        super(2, cVar);
        this.this$0 = createLoyaltyCardStepTwoFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CreateLoyaltyCardStepTwoFragment$validateUserInput$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11944n<C37947a> a = this.this$0.mo71181M0().getAddressTunnelDataProvider().mo31415a();
            C24348a aVar = new C24348a(this.this$0);
            this.label = 1;
            if (a.collect(aVar, this) == h) {
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
        return ((CreateLoyaltyCardStepTwoFragment$validateUserInput$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
