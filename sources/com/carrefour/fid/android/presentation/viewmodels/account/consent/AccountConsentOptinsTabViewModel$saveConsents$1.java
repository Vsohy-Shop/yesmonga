package com.carrefour.fid.android.presentation.viewmodels.account.consent;

import com.carrefour.fid.android.domain.interactors.consent.C37631c;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$saveConsents$1", mo22502f = "AccountConsentOptinsTabViewModel.kt", mo22503i = {}, mo22504l = {147}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAccountConsentOptinsTabViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountConsentOptinsTabViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountConsentOptinsTabViewModel$saveConsents$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n766#2:185\n857#2,2:186\n*S KotlinDebug\n*F\n+ 1 AccountConsentOptinsTabViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountConsentOptinsTabViewModel$saveConsents$1\n*L\n143#1:185\n143#1:186,2\n*E\n"})
public final class AccountConsentOptinsTabViewModel$saveConsents$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ AccountConsentOptinsTabViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountConsentOptinsTabViewModel$saveConsents$1(AccountConsentOptinsTabViewModel accountConsentOptinsTabViewModel, C11045c<? super AccountConsentOptinsTabViewModel$saveConsents$1> cVar) {
        super(2, cVar);
        this.this$0 = accountConsentOptinsTabViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AccountConsentOptinsTabViewModel$saveConsents$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            ArrayList arrayList = new ArrayList();
            for (Object next : AccountConsentOptinsTabViewModel.m110532e0(this.this$0).mo74836n()) {
                if (((ConsentOptIn) next).mo117325g()) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return C11079d2.f28267a;
            }
            C37631c i0 = this.this$0.f63100b;
            C37631c.C37632a aVar = new C37631c.C37632a(arrayList);
            this.label = 1;
            if (i0.m172966invokegIAlus(aVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AccountConsentOptinsTabViewModel$saveConsents$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
