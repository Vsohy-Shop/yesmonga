package com.carrefour.fid.android.account.presentation.p018ui.account;

import com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo;
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

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.ui.account.UpdateUserInfoFragment$initListeners$2$2", mo22502f = "UpdateUserInfoFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.UpdateUserInfoFragment$initListeners$2$2 */
public final class UpdateUserInfoFragment$initListeners$2$2 extends SuspendLambda implements C11304p<Boolean, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ UpdateUserInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateUserInfoFragment$initListeners$2$2(UpdateUserInfoFragment updateUserInfoFragment, C11045c<? super UpdateUserInfoFragment$initListeners$2$2> cVar) {
        super(2, cVar);
        this.this$0 = updateUserInfoFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new UpdateUserInfoFragment$initListeners$2$2(this.this$0, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo31703g(boolean z, @C12580l C11045c<? super C11079d2> cVar) {
        return ((UpdateUserInfoFragment$initListeners$2$2) create(Boolean.valueOf(z), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo31703g(((Boolean) obj).booleanValue(), (C11045c) obj2);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.this$0.mo31679Y0().sendIntent(new UpdateUserInfo.C13605d.C13606a(UpdateUserInfoFragment.m57690T0(this.this$0).f32496g.getText().toString()));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
