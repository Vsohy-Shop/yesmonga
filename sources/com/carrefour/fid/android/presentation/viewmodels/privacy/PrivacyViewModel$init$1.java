package com.carrefour.fid.android.presentation.viewmodels.privacy;

import com.carrefour.fid.android.domain.interactors.privacy.PrivacyUseCase;
import com.carrefour.fid.android.domain.models.C38183u;
import com.carrefour.fid.android.shared.util.C28935i;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.privacy.PrivacyViewModel$init$1", mo22502f = "PrivacyViewModel.kt", mo22503i = {}, mo22504l = {136}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PrivacyViewModel$init$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ PrivacyViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrivacyViewModel$init$1(PrivacyViewModel privacyViewModel, C11045c<? super PrivacyViewModel$init$1> cVar) {
        super(2, cVar);
        this.this$0 = privacyViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PrivacyViewModel$init$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            PrivacyUseCase i0 = this.this$0.f66046d;
            this.label = 1;
            obj2 = i0.m172987invokeIoAF18A(this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PrivacyViewModel privacyViewModel = this.this$0;
        Throwable e = Result.m38705e(obj2);
        if (e == null) {
            privacyViewModel.f66051i.mo57493o(privacyViewModel.f66047e.mo72340a((C38183u) obj2));
        } else {
            privacyViewModel.mo78969u0();
            C28935i iVar = C28935i.f70940a;
            String message = e.getMessage();
            C28935i.m119705e(iVar, "error or already pop in displayed : " + message, (Throwable) null, 0, 6, (Object) null);
            privacyViewModel.f66051i.mo57493o(null);
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PrivacyViewModel$init$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
