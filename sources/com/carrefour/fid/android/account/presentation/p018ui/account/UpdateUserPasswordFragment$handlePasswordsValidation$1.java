package com.carrefour.fid.android.account.presentation.p018ui.account;

import com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.UpdateUserPasswordFragment$handlePasswordsValidation$1 */
public final class UpdateUserPasswordFragment$handlePasswordsValidation$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ UpdateUserPassword.C13615b.C13619d $uiState;
    final /* synthetic */ UpdateUserPasswordFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateUserPasswordFragment$handlePasswordsValidation$1(UpdateUserPassword.C13615b.C13619d dVar, UpdateUserPasswordFragment updateUserPasswordFragment) {
        super(0);
        this.$uiState = dVar;
        this.this$0 = updateUserPasswordFragment;
    }

    public final void invoke() {
        if (this.$uiState.mo32328k() && this.$uiState.mo32329l()) {
            this.this$0.mo31705W0().sendIntent(new UpdateUserPassword.C13620c.C13621a(UpdateUserPasswordFragment.m57714R0(this.this$0).f32511g.getText().toString(), UpdateUserPasswordFragment.m57714R0(this.this$0).f32507c.getText().toString()));
        }
    }
}
