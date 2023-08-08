package com.carrefour.fid.android.presentation.p035ui.account.list;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19234h0;
import androidx.navigation.C19766m;
import androidx.navigation.NavController;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.databinding.C36886z;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.account.list.home.AccountListHomeFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.memo.MemoListFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.order.AccountListOrderFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.AccountListShoppingFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.ShoppingListFragment;
import com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderFragment;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rJ\u001c\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\u001c\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/list/AccountListFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/z;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/core/type/AccountListType;", "type", "navigationArguments", "T0", "", "deleteButtonVisible", "V0", "", "titleResId", "", "subtitle", "W0", "S0", "title", "X0", "Lcom/carrefour/fid/android/presentation/ui/account/list/a;", "f", "Landroidx/navigation/m;", "R0", "()Lcom/carrefour/fid/android/presentation/ui/account/list/a;", "args", "<init>", "()V", "a", "ParentScreen", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountListFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/list/AccountListFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,150:1\n42#2,3:151\n*S KotlinDebug\n*F\n+ 1 AccountListFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/list/AccountListFragment\n*L\n32#1:151,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment */
public final class AccountListFragment extends C22951d<C36886z> {

    /* renamed from: g */
    public static final int f58554g = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f58555f = new C19766m(C11342l0.m43547d(C22945a.class), new AccountListFragment$special$$inlined$navArgs$1(this));

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/list/AccountListFragment$ParentScreen;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen */
    public enum ParentScreen {
        BASKET_BUILDER,
        ACCOUNT_LIST
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$a */
    public interface C22944a {
        /* renamed from: a */
        void mo67480a();
    }

    public AccountListFragment() {
        super(C229431.f58556a);
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m103308U0(AccountListFragment accountListFragment, AccountListType accountListType, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        accountListFragment.mo67475T0(accountListType, bundle);
    }

    /* renamed from: Y0 */
    public static /* synthetic */ void m103309Y0(AccountListFragment accountListFragment, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        accountListFragment.mo67477W0(i, str);
    }

    /* renamed from: Z0 */
    public static /* synthetic */ void m103310Z0(AccountListFragment accountListFragment, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        accountListFragment.mo67478X0(str, str2);
    }

    /* renamed from: R0 */
    public final C22945a mo67473R0() {
        return (C22945a) this.f58555f.getValue();
    }

    /* renamed from: S0 */
    public final void mo67474S0() {
        BottomNavActivity bottomNavActivity;
        NavController k;
        if (getChildFragmentManager().mo56786B0() > 1) {
            getChildFragmentManager().mo56901r1();
            return;
        }
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null && (k = bottomNavActivity.mo83823k()) != null) {
            k.mo58156s0();
        }
    }

    /* renamed from: T0 */
    public final void mo67475T0(@C12580l AccountListType accountListType, @C12580l Bundle bundle) {
        C19234h0 u = getChildFragmentManager().mo56909u();
        if (accountListType == null) {
            u.mo57212N(R.anim.fade_in_short, R.anim.fade_out_short, 0, 0);
        } else {
            u.mo57212N(R.anim.slide_in_right, R.anim.fade_out_short, R.anim.fade_in_short, R.anim.slide_out_right);
        }
        if (Intrinsics.areEqual((Object) accountListType, (Object) AccountListType.Shopping.f89774d)) {
            u.mo57202D(R.id.fragment_container_view_account_list, ShoppingListFragment.f58690v.mo67686a(getArguments()), AccountListShoppingFragment.f58659X);
            u.mo57225o(AccountListShoppingFragment.f58659X);
        } else if (Intrinsics.areEqual((Object) accountListType, (Object) AccountListType.Memos.f89768d)) {
            u.mo57202D(R.id.fragment_container_view_account_list, MemoListFragment.f58605x.mo67555a(getArguments()), MemoListFragment.f58607z);
            u.mo57225o(MemoListFragment.f58607z);
        } else if (Intrinsics.areEqual((Object) accountListType, (Object) AccountListType.Frequent.f89766d)) {
            u.mo57202D(R.id.fragment_container_view_account_list, BasketBuilderFragment.f58840w.mo67963a(), BasketBuilderFragment.f58842y);
            u.mo57225o(BasketBuilderFragment.f58842y);
        } else if (Intrinsics.areEqual((Object) accountListType, (Object) AccountListType.Order.f89772d)) {
            u.mo57202D(R.id.fragment_container_view_account_list, AccountListOrderFragment.f58634y.mo67602a(getArguments()), AccountListOrderFragment.f58631X);
            u.mo57225o(AccountListOrderFragment.f58631X);
        } else {
            u.mo57217g(R.id.fragment_container_view_account_list, AccountListHomeFragment.f58575w.mo67514a(getArguments()), AccountListHomeFragment.f58577y);
            u.mo57225o(AccountListHomeFragment.f58577y);
        }
        u.mo57052q();
    }

    /* renamed from: V0 */
    public final void mo67476V0(boolean z) {
        BottomNavActivity bottomNavActivity;
        ToolBarDefaultView M1;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null && (M1 = bottomNavActivity.mo121107M1()) != null) {
            ToolBarDefaultView.m158946v0(M1, z, (C11300l) null, 2, (Object) null);
        }
    }

    /* renamed from: W0 */
    public final void mo67477W0(@C0324b1 int i, @C12580l String str) {
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(titleResId)");
        mo67478X0(string, str);
    }

    /* renamed from: X0 */
    public final void mo67478X0(String str, String str2) {
        BottomNavActivity bottomNavActivity;
        ToolBarDefaultView M1;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null && (M1 = bottomNavActivity.mo121107M1()) != null) {
            ToolBarDefaultView.m158942o0(M1, str, str2, 0, 4, (Object) null);
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        BottomNavActivity bottomNavActivity;
        ToolBarDefaultView M1;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new AccountListFragment$onViewCreated$1(this));
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (!(bottomNavActivity == null || (M1 = bottomNavActivity.mo121107M1()) == null)) {
            ToolBarDefaultView.m158944r0(M1, true, (C11300l) null, false, 6, (Object) null);
            M1.mo121286u0(false, new AccountListFragment$onViewCreated$2$1(this));
        }
        if (getChildFragmentManager().mo56786B0() < 1) {
            m103309Y0(this, R.string.shopping_list_all_list_title, (String) null, 2, (Object) null);
            m103308U0(this, mo67473R0().mo67487g(), (Bundle) null, 2, (Object) null);
        }
    }
}
