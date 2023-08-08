package com.carrefour.fid.android.presentation.p035ui.account.consent;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.app.C17018b;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.databinding.C36868x;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.presentation.trackers.account.C38531a;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel;
import com.carrefour.fid.android.presentation.viewmodels.privacy.PrivacyViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.C28951s;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\nH\u0002R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/consent/AccountConsentDataTabFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/x;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "", "tabTitleId", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountDataViewModel$a;", "state", "d1", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountDataViewModel$LocationPermissionStatus;", "status", "a1", "initListener", "U0", "permission", "V0", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "f", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "W0", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "f1", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "environment", "Lcom/carrefour/fid/android/presentation/viewmodels/privacy/PrivacyViewModel;", "g", "Lkotlin/z;", "X0", "()Lcom/carrefour/fid/android/presentation/viewmodels/privacy/PrivacyViewModel;", "privacyViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountDataViewModel;", "v", "Z0", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountDataViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/trackers/account/a;", "w", "Lcom/carrefour/fid/android/presentation/trackers/account/a;", "Y0", "()Lcom/carrefour/fid/android/presentation/trackers/account/a;", "g1", "(Lcom/carrefour/fid/android/presentation/trackers/account/a;)V", "tracker", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountConsentDataTabFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountConsentDataTabFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/consent/AccountConsentDataTabFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n106#2,15:148\n106#2,15:163\n168#3,7:178\n1#4:185\n*S KotlinDebug\n*F\n+ 1 AccountConsentDataTabFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/consent/AccountConsentDataTabFragment\n*L\n39#1:148,15\n40#1:163,15\n47#1:178,7\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentDataTabFragment */
public final class AccountConsentDataTabFragment extends C22940n<C36868x> {

    /* renamed from: x */
    public static final int f58487x = 8;
    @Inject

    /* renamed from: f */
    public AppEnvironment f58488f;
    @C12579k

    /* renamed from: g */
    public final C11677z f58489g;
    @C12579k

    /* renamed from: v */
    public final C11677z f58490v;
    @Inject

    /* renamed from: w */
    public C38531a f58491w;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentDataTabFragment$a */
    public /* synthetic */ class C22890a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel$LocationPermissionStatus[] r0 = com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel.LocationPermissionStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel$LocationPermissionStatus r1 = com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel.LocationPermissionStatus.GRANTED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel$LocationPermissionStatus r1 = com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel.LocationPermissionStatus.DENIED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel$LocationPermissionStatus r1 = com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel.LocationPermissionStatus.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.consent.AccountConsentDataTabFragment.C22890a.<clinit>():void");
        }
    }

    public AccountConsentDataTabFragment() {
        super(C228891.f58492a);
        C22896x62e9a0f5 accountConsentDataTabFragment$special$$inlined$viewModels$default$1 = new C22896x62e9a0f5(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        C11677z b = C10864b0.m38747b(lazyThreadSafetyMode, new C22898x62e9a0f6(accountConsentDataTabFragment$special$$inlined$viewModels$default$1));
        this.f58489g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(PrivacyViewModel.class), new C22899x62e9a0f7(b), new C22900x62e9a0f8((C11289a) null, b), new C22901x62e9a0f9(this, b));
        C11677z b2 = C10864b0.m38747b(lazyThreadSafetyMode, new C22903x62e9a0fb(new C22902x62e9a0fa(this)));
        this.f58490v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AccountDataViewModel.class), new C22904x62e9a0fc(b2), new C22905x62e9a0fd((C11289a) null, b2), new C22897xfa4a7ddb(this, b2));
    }

    /* renamed from: b1 */
    public static final void m103198b1(AccountConsentDataTabFragment accountConsentDataTabFragment, View view) {
        Intrinsics.checkNotNullParameter(accountConsentDataTabFragment, "this$0");
        C19232h activity = accountConsentDataTabFragment.getActivity();
        if (activity == null) {
            return;
        }
        if (C28951s.f70964a.mo84281g(activity)) {
            FragmentExtensionKt.m58768s(accountConsentDataTabFragment, C36168a.f89276d, new AccountConsentDataTabFragment$initListener$1$1$1(accountConsentDataTabFragment));
            return;
        }
        NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
        String string = accountConsentDataTabFragment.getString(R.string.general_error_no_network_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…error_no_network_message)");
        FragmentKt.m118811B(accountConsentDataTabFragment, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    /* renamed from: c1 */
    public static final void m103199c1(AccountConsentDataTabFragment accountConsentDataTabFragment, View view) {
        Intrinsics.checkNotNullParameter(accountConsentDataTabFragment, "this$0");
        PrivacyViewModel X0 = accountConsentDataTabFragment.mo67367X0();
        C19232h requireActivity = accountConsentDataTabFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        X0.mo78967s0(requireActivity);
    }

    /* renamed from: e1 */
    public static final void m103200e1(AccountConsentDataTabFragment accountConsentDataTabFragment, AccountDataViewModel.C25768a aVar, View view) {
        Intrinsics.checkNotNullParameter(accountConsentDataTabFragment, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$state");
        accountConsentDataTabFragment.mo67364U0(aVar);
    }

    /* renamed from: U0 */
    public final void mo67364U0(AccountDataViewModel.C25768a aVar) {
        if (aVar.mo74823k() == AccountDataViewModel.LocationPermissionStatus.GRANTED || aVar.mo74822j()) {
            C19232h requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            Uri fromParts = Uri.fromParts(C22925d.f58520a, requireActivity().getPackageName(), (String) null);
            Intrinsics.checkNotNullExpressionValue(fromParts, "fromParts(\n             …   null\n                )");
            C13825a.m58776e(requireActivity, fromParts, "android.settings.APPLICATION_DETAILS_SETTINGS");
            return;
        }
        C17018b.m78743J(requireActivity(), new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1);
        mo67369Z0().sendIntent(AccountDataViewModel.C25770b.C25771a.f63123a);
    }

    /* renamed from: V0 */
    public final void mo67365V0(int i) {
        C28505u.C28507b bVar;
        if (i == -1) {
            bVar = AccountDataViewModel.C25770b.C25772b.f63125a;
        } else if (i != 0) {
            bVar = null;
        } else {
            bVar = AccountDataViewModel.C25770b.C25773c.f63127a;
        }
        if (bVar != null) {
            mo67369Z0().sendIntent(bVar);
        }
    }

    @C12579k
    /* renamed from: W0 */
    public final AppEnvironment mo67366W0() {
        AppEnvironment appEnvironment = this.f58488f;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException(C28534f.f69167m0);
        return null;
    }

    /* renamed from: X0 */
    public final PrivacyViewModel mo67367X0() {
        return (PrivacyViewModel) this.f58489g.getValue();
    }

    @C12579k
    /* renamed from: Y0 */
    public final C38531a mo67368Y0() {
        C38531a aVar = this.f58491w;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tracker");
        return null;
    }

    /* renamed from: Z0 */
    public final AccountDataViewModel mo67369Z0() {
        return (AccountDataViewModel) this.f58490v.getValue();
    }

    /* renamed from: a1 */
    public final void mo67370a1(AccountDataViewModel.LocationPermissionStatus locationPermissionStatus) {
        int i = C22890a.$EnumSwitchMapping$0[locationPermissionStatus.ordinal()];
        if (i == 1) {
            TextView textView = ((C36868x) getBinding()).f91882d;
            textView.setVisibility(0);
            textView.setText(getString(R.string.account_data_permission_location_granted));
        } else if (i == 2) {
            TextView textView2 = ((C36868x) getBinding()).f91882d;
            textView2.setVisibility(0);
            textView2.setText(getString(R.string.account_data_permission_location_denied));
        } else if (i == 3) {
            ((C36868x) getBinding()).f91882d.setVisibility(8);
        }
    }

    /* renamed from: d1 */
    public final void mo67371d1(AccountDataViewModel.C25768a aVar) {
        mo67370a1(aVar.mo74823k());
        ((C36868x) getBinding()).f91881c.setOnClickListener(new C22922a(this, aVar));
    }

    /* renamed from: f1 */
    public final void mo67372f1(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f58488f = appEnvironment;
    }

    /* renamed from: g1 */
    public final void mo67373g1(@C12579k C38531a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f58491w = aVar;
    }

    public final void initListener() {
        ((C36868x) getBinding()).f91880b.setOnClickListener(new C22923b(this));
        ((C36868x) getBinding()).f91883e.setOnClickListener(new C22924c(this));
    }

    public void onResume() {
        super.onResume();
        mo67365V0(C17318d.m79718a(requireContext(), "android.permission.ACCESS_FINE_LOCATION"));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        AccountDataViewModel Z0 = mo67369Z0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C22891xa33d13b6(this, Z0, (C11045c) null, this), 3, (Object) null);
        initListener();
        mo67368Y0().mo122187a();
    }

    public int tabTitleId() {
        return R.string.account_notifications_pager_two_title;
    }
}
