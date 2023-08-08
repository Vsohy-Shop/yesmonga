package com.carrefour.fid.android.presentation.p035ui.account.list.home;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.databinding.C36659c0;
import com.carrefour.fid.android.presentation.models.extension.C38462a;
import com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.home.adapter.C22960c;
import com.carrefour.fid.android.presentation.viewmodels.account.list.home.AccountListHomeViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.list.home.C25807a;
import com.carrefour.fid.android.shared.presentation.components.decoration.C28852a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/list/home/AccountListHomeFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/c0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "", "memo", "T0", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/home/a;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/home/a;", "R0", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/list/home/a;", "V0", "(Lcom/carrefour/fid/android/presentation/viewmodels/account/list/home/a;)V", "accountListHomeAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/home/AccountListHomeViewModel;", "g", "Lkotlin/z;", "S0", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/list/home/AccountListHomeViewModel;", "accountListHomeViewModel", "Lcom/carrefour/fid/android/presentation/ui/account/list/home/adapter/c$a;", "v", "Lcom/carrefour/fid/android/presentation/ui/account/list/home/adapter/c$a;", "callback", "<init>", "()V", "w", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountListHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountListHomeFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/list/home/AccountListHomeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,80:1\n106#2,15:81\n*S KotlinDebug\n*F\n+ 1 AccountListHomeFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/list/home/AccountListHomeFragment\n*L\n40#1:81,15\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.home.AccountListHomeFragment */
public final class AccountListHomeFragment extends C22965c<C36659c0> {
    @C12579k

    /* renamed from: w */
    public static final C22953a f58575w = new C22953a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f58576x = 8;
    @C12579k

    /* renamed from: y */
    public static final String f58577y = "AccountListHomeFragment";
    @Inject

    /* renamed from: f */
    public C25807a f58578f;
    @C12579k

    /* renamed from: g */
    public final C11677z f58579g;
    @C12579k

    /* renamed from: v */
    public final C22960c.C22961a f58580v = new C22954b(this);

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.home.AccountListHomeFragment$a */
    public static final class C22953a {
        public /* synthetic */ C22953a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ AccountListHomeFragment m103351b(C22953a aVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            return aVar.mo67514a(bundle);
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final AccountListHomeFragment mo67514a(@C12580l Bundle bundle) {
            AccountListHomeFragment accountListHomeFragment = new AccountListHomeFragment();
            accountListHomeFragment.setArguments(bundle);
            return accountListHomeFragment;
        }

        public C22953a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.home.AccountListHomeFragment$b */
    public static final class C22954b implements C22960c.C22961a {

        /* renamed from: a */
        public final /* synthetic */ AccountListHomeFragment f58582a;

        public C22954b(AccountListHomeFragment accountListHomeFragment) {
            this.f58582a = accountListHomeFragment;
        }

        /* renamed from: a */
        public final void mo67515a(@C12579k AccountListType accountListType) {
            Intrinsics.checkNotNullParameter(accountListType, "type");
            AccountListFragment accountListFragment = (AccountListFragment) FragmentKt.m148916b(this.f58582a, AccountListFragment.class);
            if (accountListFragment != null) {
                AccountListFragment.m103308U0(accountListFragment, accountListType, (Bundle) null, 2, (Object) null);
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.home.AccountListHomeFragment$c */
    public /* synthetic */ class C22955c implements C19426h0, C11379z {
        public C22955c() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo4590a(Object obj) {
            mo67516b(((Boolean) obj).booleanValue());
        }

        /* renamed from: b */
        public final void mo67516b(boolean z) {
            AccountListHomeFragment.this.mo67511T0(z);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, AccountListHomeFragment.this, AccountListHomeFragment.class, "memoRemoteConfigHandleResult", "memoRemoteConfigHandleResult(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public AccountListHomeFragment() {
        super(C229521.f58581a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new AccountListHomeFragment$special$$inlined$viewModels$default$2(new AccountListHomeFragment$special$$inlined$viewModels$default$1(this)));
        this.f58579g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AccountListHomeViewModel.class), new AccountListHomeFragment$special$$inlined$viewModels$default$3(b), new AccountListHomeFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new AccountListHomeFragment$special$$inlined$viewModels$default$5(this, b));
    }

    @C12579k
    @C11384m
    /* renamed from: U0 */
    public static final AccountListHomeFragment m103345U0(@C12580l Bundle bundle) {
        return f58575w.mo67514a(bundle);
    }

    @C12579k
    /* renamed from: R0 */
    public final C25807a mo67509R0() {
        C25807a aVar = this.f58578f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountListHomeAnalyticsViewModel");
        return null;
    }

    /* renamed from: S0 */
    public final AccountListHomeViewModel mo67510S0() {
        return (AccountListHomeViewModel) this.f58579g.getValue();
    }

    /* renamed from: T0 */
    public final void mo67511T0(boolean z) {
        ((C36659c0) getBinding()).getRoot().setAdapter(new C22960c(this.f58580v, C38462a.m159614a(z)));
    }

    /* renamed from: V0 */
    public final void mo67512V0(@C12579k C25807a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f58578f = aVar;
    }

    public void onResume() {
        super.onResume();
        AccountListFragment accountListFragment = (AccountListFragment) FragmentKt.m148916b(this, AccountListFragment.class);
        if (accountListFragment != null) {
            accountListFragment.mo67476V0(false);
            AccountListFragment.m103309Y0(accountListFragment, R.string.shopping_list_all_list_title, (String) null, 2, (Object) null);
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo67509R0().mo74912a();
        AccountListHomeViewModel S0 = mo67510S0();
        S0.mo74909j0().mo57491k(getViewLifecycleOwner(), new C22955c());
        S0.mo74910k0();
        RecyclerView b = ((C36659c0) getBinding()).getRoot();
        b.setItemAnimator((RecyclerView.C20069l) null);
        b.setLayoutManager(new LinearLayoutManager(b.getContext(), 1, false));
        b.mo59589n(new C28852a(1, true, 0, 4, (DefaultConstructorMarker) null));
    }
}
