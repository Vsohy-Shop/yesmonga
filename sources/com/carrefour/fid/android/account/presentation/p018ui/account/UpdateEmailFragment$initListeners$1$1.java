package com.carrefour.fid.android.account.presentation.p018ui.account;

import com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.C13623a;
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

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.ui.account.UpdateEmailFragment$initListeners$1$1", mo22502f = "UpdateEmailFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.UpdateEmailFragment$initListeners$1$1 */
public final class UpdateEmailFragment$initListeners$1$1 extends SuspendLambda implements C11304p<String, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UpdateEmailFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateEmailFragment$initListeners$1$1(UpdateEmailFragment updateEmailFragment, C11045c<? super UpdateEmailFragment$initListeners$1$1> cVar) {
        super(2, cVar);
        this.this$0 = updateEmailFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        UpdateEmailFragment$initListeners$1$1 updateEmailFragment$initListeners$1$1 = new UpdateEmailFragment$initListeners$1$1(this.this$0, cVar);
        updateEmailFragment$initListeners$1$1.L$0 = obj;
        return updateEmailFragment$initListeners$1$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k String str, @C12580l C11045c<? super C11079d2> cVar) {
        return ((UpdateEmailFragment$initListeners$1$1) create(str, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        boolean z;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            String str = (String) this.L$0;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.this$0.mo31660U0().sendIntent(new C13623a.C13628c.C13629a(str));
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
