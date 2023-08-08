package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/list/AccountListFragment$ParentScreen;", "a", "()Lcom/carrefour/fid/android/presentation/ui/account/list/AccountListFragment$ParentScreen;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$parentScreen$2 */
public final class AccountListShoppingFragment$parentScreen$2 extends Lambda implements C11289a<AccountListFragment.ParentScreen> {
    final /* synthetic */ AccountListShoppingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountListShoppingFragment$parentScreen$2(AccountListShoppingFragment accountListShoppingFragment) {
        super(0);
        this.this$0 = accountListShoppingFragment;
    }

    @C12579k
    /* renamed from: a */
    public final AccountListFragment.ParentScreen invoke() {
        if (!(this.this$0.getParentFragment() instanceof NavHostFragment)) {
            return AccountListFragment.ParentScreen.ACCOUNT_LIST;
        }
        Fragment parentFragment = this.this$0.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        if (StringsKt__StringsKt.contains$default((CharSequence) ((NavHostFragment) parentFragment).mo58400k().mo58107K().toString(), (CharSequence) "basket_builder_sub_graph", false, 2, (Object) null)) {
            return AccountListFragment.ParentScreen.BASKET_BUILDER;
        }
        return AccountListFragment.ParentScreen.ACCOUNT_LIST;
    }
}
