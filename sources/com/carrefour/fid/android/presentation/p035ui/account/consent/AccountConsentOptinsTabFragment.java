package com.carrefour.fid.android.presentation.p035ui.account.consent;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36848v;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.consent.ChoiceOptIn;
import com.carrefour.fid.android.domain.models.consent.ConsentName;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22934l;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.C25786e;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10978t;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001e\u0010\u0013\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/consent/AccountConsentOptinsTabFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/v;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "", "tabTitleId", "Lcom/carrefour/fid/android/presentation/ui/account/consent/l;", "action", "V0", "", "Lcom/carrefour/fid/android/domain/models/consent/ConsentName;", "consentNames", "Lcom/carrefour/fid/android/domain/models/consent/ChoiceOptIn;", "choice", "W0", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "f", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "T0", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "Y0", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "environment", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountConsentOptinsTabViewModel;", "g", "Lkotlin/z;", "U0", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountConsentOptinsTabViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/e;", "v", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/e;", "S0", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/e;", "X0", "(Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/e;)V", "analyticsViewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountConsentOptinsTabFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountConsentOptinsTabFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/consent/AccountConsentOptinsTabFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n106#2,15:107\n1549#3:122\n1620#3,3:123\n1855#3,2:126\n*S KotlinDebug\n*F\n+ 1 AccountConsentOptinsTabFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/consent/AccountConsentOptinsTabFragment\n*L\n33#1:107,15\n85#1:122\n85#1:123,3\n93#1:126,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentOptinsTabFragment */
public final class AccountConsentOptinsTabFragment extends C22941o<C36848v> {

    /* renamed from: w */
    public static final int f58497w = 8;
    @Inject

    /* renamed from: f */
    public AppEnvironment f58498f;
    @C12579k

    /* renamed from: g */
    public final C11677z f58499g;
    @Inject

    /* renamed from: v */
    public C25786e f58500v;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentOptinsTabFragment$a */
    public /* synthetic */ class C22908a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.domain.models.consent.ConsentName[] r0 = com.carrefour.fid.android.domain.models.consent.ConsentName.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.consent.AccountConsentOptinsTabFragment.C22908a.<clinit>():void");
        }
    }

    public AccountConsentOptinsTabFragment() {
        super(C229071.f58501a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C22910x5c0d83a5(new C22909x5c0d83a4(this)));
        this.f58499g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AccountConsentOptinsTabViewModel.class), new C22911x5c0d83a6(b), new C22912x5c0d83a7((C11289a) null, b), new C22913x5c0d83a8(this, b));
    }

    @C12579k
    /* renamed from: S0 */
    public final C25786e mo67385S0() {
        C25786e eVar = this.f58500v;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    @C12579k
    /* renamed from: T0 */
    public final AppEnvironment mo67386T0() {
        AppEnvironment appEnvironment = this.f58498f;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException(C28534f.f69167m0);
        return null;
    }

    /* renamed from: U0 */
    public final AccountConsentOptinsTabViewModel mo67387U0() {
        return (AccountConsentOptinsTabViewModel) this.f58499g.getValue();
    }

    /* renamed from: V0 */
    public final void mo67388V0(C22934l lVar) {
        C22934l lVar2 = lVar;
        if (lVar2 instanceof C22934l.C22935a) {
            C22934l.C22935a aVar = (C22934l.C22935a) lVar2;
            mo67389W0(aVar.mo67449f(), aVar.mo67447e());
        } else if (lVar2 instanceof C22934l.C22936b) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(((C22934l.C22936b) lVar2).mo67454d());
            Intrinsics.checkNotNullExpressionValue(string, "getString(action.errorMessageRes)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (lVar2 instanceof C22934l.C22937c) {
            FragmentKt.m118829q(this, (String) null, (String) null, new AccountConsentOptinsTabFragment$handleAction$1(this, lVar2), 3, (Object) null);
        } else if (Intrinsics.areEqual((Object) lVar2, (Object) C22934l.C22938d.f58537a)) {
            C19232h requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            ActivityKt.m118702l(requireActivity);
            mo67385S0().mo74858h();
        }
    }

    /* renamed from: W0 */
    public final void mo67389W0(List<? extends ConsentName> list, ChoiceOptIn choiceOptIn) {
        AccountConsentOptinsTabViewModel U0 = mo67387U0();
        Iterable<ConsentName> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (ConsentName consentOptIn : iterable) {
            arrayList.add(new ConsentOptIn(consentOptIn, choiceOptIn, false, 4, (DefaultConstructorMarker) null));
        }
        U0.sendIntent(new C25774a.C25777b.C25779b(arrayList));
        for (ConsentName ordinal : iterable) {
            int i = C22908a.$EnumSwitchMapping$0[ordinal.ordinal()];
            if (i == 1) {
                mo67385S0().mo74853c(choiceOptIn.mo117315r());
            } else if (i == 2) {
                mo67385S0().mo74852b(choiceOptIn.mo117315r());
            }
        }
    }

    /* renamed from: X0 */
    public final void mo67390X0(@C12579k C25786e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f58500v = eVar;
    }

    /* renamed from: Y0 */
    public final void mo67391Y0(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f58498f = appEnvironment;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        ((C36848v) getBinding()).getRoot().setContent(C8553b.m31049c(2093064272, true, new AccountConsentOptinsTabFragment$onViewCreated$1(this)));
        mo67387U0().sendIntent(C25774a.C25777b.C25778a.f63141a);
        mo67385S0().mo74857g();
    }

    public int tabTitleId() {
        return R.string.account_notifications_pager_one_title;
    }
}
