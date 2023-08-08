package com.carrefour.fid.android.presentation.p035ui.account.consent;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.navigation.C19766m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36858w;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.shared.base.BaseViewPagerAdapter;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.tabs.C31624d;
import com.google.android.material.tabs.TabLayout;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/consent/AccountConsentParameterFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/w;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "Lcom/carrefour/fid/android/presentation/ui/account/consent/j;", "f", "Landroidx/navigation/m;", "R0", "()Lcom/carrefour/fid/android/presentation/ui/account/consent/j;", "arguments", "Lcom/google/android/material/tabs/d;", "g", "Lcom/google/android/material/tabs/d;", "tabLayoutMediator", "Lcom/carrefour/fid/android/shared/base/BaseViewPagerAdapter;", "v", "Lkotlin/z;", "S0", "()Lcom/carrefour/fid/android/shared/base/BaseViewPagerAdapter;", "viewPagerAdapter", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountConsentParameterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountConsentParameterFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/consent/AccountConsentParameterFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,77:1\n42#2,3:78\n*S KotlinDebug\n*F\n+ 1 AccountConsentParameterFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/consent/AccountConsentParameterFragment\n*L\n21#1:78,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentParameterFragment */
public final class AccountConsentParameterFragment extends C22942p<C36858w> {

    /* renamed from: w */
    public static final int f58502w = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f58503f = new C19766m(C11342l0.m43547d(C22931j.class), new AccountConsentParameterFragment$special$$inlined$navArgs$1(this));
    @C12580l

    /* renamed from: g */
    public C31624d f58504g;
    @C12579k

    /* renamed from: v */
    public final C11677z f58505v = C10864b0.m38748c(new AccountConsentParameterFragment$viewPagerAdapter$2(this));

    public AccountConsentParameterFragment() {
        super(C229161.f58506a);
    }

    /* renamed from: T0 */
    public static final void m103231T0(AccountConsentParameterFragment accountConsentParameterFragment, TabLayout.C31615i iVar, int i) {
        Intrinsics.checkNotNullParameter(accountConsentParameterFragment, "this$0");
        Intrinsics.checkNotNullParameter(iVar, "tab");
        RecyclerView.Adapter adapter = ((C36858w) accountConsentParameterFragment.getBinding()).f91829c.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.carrefour.fid.android.shared.base.BaseViewPagerAdapter");
        iVar.mo91419D(((BaseViewPagerAdapter) adapter).mo83348F()[i]);
    }

    /* renamed from: R0 */
    public final C22931j mo67398R0() {
        return (C22931j) this.f58503f.getValue();
    }

    /* renamed from: S0 */
    public final BaseViewPagerAdapter mo67399S0() {
        return (BaseViewPagerAdapter) this.f58505v.getValue();
    }

    public void onDestroyView() {
        C31624d dVar = this.f58504g;
        if (dVar != null) {
            dVar.mo91447b();
        }
        super.onDestroyView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        String str = null;
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, AccountConsentParameterFragment$onViewCreated$1$1.f58507f, 1, (Object) null);
        }
        ViewPager2 viewPager2 = ((C36858w) getBinding()).f91829c;
        viewPager2.setSaveEnabled(false);
        if (viewPager2.getAdapter() == null) {
            BaseViewPagerAdapter S0 = mo67399S0();
            S0.mo83350H(CollectionsKt__CollectionsKt.m40448L(new AccountConsentOptinsTabFragment(), new AccountConsentDataTabFragment()));
            viewPager2.setAdapter(S0);
        } else {
            RecyclerView.Adapter adapter = viewPager2.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
        C22931j R0 = mo67398R0();
        if (R0 != null) {
            str = R0.mo67436e();
        }
        if (Intrinsics.areEqual((Object) str, (Object) getString(R.string.deeplink_parameter_personal_data))) {
            ((C36858w) getBinding()).f91829c.setCurrentItem(1);
        }
        C31624d dVar = new C31624d(((C36858w) getBinding()).f91828b, ((C36858w) getBinding()).f91829c, new C22930i(this));
        this.f58504g = dVar;
        dVar.mo91446a();
    }
}
