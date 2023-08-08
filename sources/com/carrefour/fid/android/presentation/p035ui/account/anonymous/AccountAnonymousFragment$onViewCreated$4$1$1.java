package com.carrefour.fid.android.presentation.p035ui.account.anonymous;

import android.content.Context;
import android.widget.TextView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.data.datastore.pref.C28631e;
import com.carrefour.fid.android.shared.extension.C28775q;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.account.anonymous.AccountAnonymousFragment$onViewCreated$4$1$1", mo22502f = "AccountAnonymousFragment.kt", mo22503i = {}, mo22504l = {80}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.anonymous.AccountAnonymousFragment$onViewCreated$4$1$1 */
public final class AccountAnonymousFragment$onViewCreated$4$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ TextView $this_apply;
    int label;
    final /* synthetic */ AccountAnonymousFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountAnonymousFragment$onViewCreated$4$1$1(AccountAnonymousFragment accountAnonymousFragment, TextView textView, C11045c<? super AccountAnonymousFragment$onViewCreated$4$1$1> cVar) {
        super(2, cVar);
        this.this$0 = accountAnonymousFragment;
        this.$this_apply = textView;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AccountAnonymousFragment$onViewCreated$4$1$1(this.this$0, this.$this_apply, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            BaseAppPreferencesStorage V0 = this.this$0.mo67346V0();
            this.label = 1;
            obj = V0.mo83495c(this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String d = ((C28631e) obj).mo83520d();
        Context context = this.$this_apply.getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        C28775q.m119093a(context, d, R.string.id_copied);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AccountAnonymousFragment$onViewCreated$4$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
