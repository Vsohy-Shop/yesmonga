package com.carrefour.fid.android.legalnotice.p059ui.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.C20171k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.app.listeners.C13830b;
import com.carrefour.fid.android.databinding.C36721i2;
import com.carrefour.fid.android.legalnotice.p059ui.fragments.adapter.C38236a;
import com.carrefour.fid.android.legalnotice.presenters.C38233a;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.viewmodels.privacy.PrivacyViewModel;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, mo22516d2 = {"Lcom/carrefour/fid/android/legalnotice/ui/fragments/LegalNoticeFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/i2;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "Lkotlin/Function0;", "action", "Y0", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "f", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "T0", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "W0", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "environment", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "g", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "U0", "()Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "X0", "(Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;)V", "loginRepository", "Lcom/carrefour/fid/android/presentation/viewmodels/privacy/PrivacyViewModel;", "v", "Lkotlin/z;", "V0", "()Lcom/carrefour/fid/android/presentation/viewmodels/privacy/PrivacyViewModel;", "privacyViewModel", "Lcom/carrefour/fid/android/legalnotice/presenters/a;", "w", "Lcom/carrefour/fid/android/legalnotice/presenters/a;", "mPresenter", "Lcom/carrefour/fid/android/app/listeners/b;", "x", "Lcom/carrefour/fid/android/app/listeners/b;", "itemClickListener", "Lcom/carrefour/fid/android/app/listeners/b$a;", "y", "Lcom/carrefour/fid/android/app/listeners/b$a;", "clickListener", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLegalNoticeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegalNoticeFragment.kt\ncom/carrefour/fid/android/legalnotice/ui/fragments/LegalNoticeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,136:1\n106#2,15:137\n*S KotlinDebug\n*F\n+ 1 LegalNoticeFragment.kt\ncom/carrefour/fid/android/legalnotice/ui/fragments/LegalNoticeFragment\n*L\n40#1:137,15\n*E\n"})
/* renamed from: com.carrefour.fid.android.legalnotice.ui.fragments.LegalNoticeFragment */
public final class LegalNoticeFragment extends C38235a<C36721i2> {

    /* renamed from: z */
    public static final int f96888z = 8;
    @Inject

    /* renamed from: f */
    public AppEnvironment f96889f;
    @Inject

    /* renamed from: g */
    public LoginRepository f96890g;
    @C12579k

    /* renamed from: v */
    public final C11677z f96891v;
    @C12579k

    /* renamed from: w */
    public final C38233a f96892w = new C38233a((C13783a) null, 1, (DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: x */
    public C13830b f96893x;
    @C12579k

    /* renamed from: y */
    public final C13830b.C13831a f96894y = new LegalNoticeFragment$clickListener$1(this);

    public LegalNoticeFragment() {
        super(C382341.f96895a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new LegalNoticeFragment$special$$inlined$viewModels$default$2(new LegalNoticeFragment$special$$inlined$viewModels$default$1(this)));
        this.f96891v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(PrivacyViewModel.class), new LegalNoticeFragment$special$$inlined$viewModels$default$3(b), new LegalNoticeFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new LegalNoticeFragment$special$$inlined$viewModels$default$5(this, b));
    }

    @C12579k
    /* renamed from: T0 */
    public final AppEnvironment mo119690T0() {
        AppEnvironment appEnvironment = this.f96889f;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException(C28534f.f69167m0);
        return null;
    }

    @C12579k
    /* renamed from: U0 */
    public final LoginRepository mo119691U0() {
        LoginRepository loginRepository = this.f96890g;
        if (loginRepository != null) {
            return loginRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginRepository");
        return null;
    }

    /* renamed from: V0 */
    public final PrivacyViewModel mo119692V0() {
        return (PrivacyViewModel) this.f96891v.getValue();
    }

    /* renamed from: W0 */
    public final void mo119693W0(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f96889f = appEnvironment;
    }

    /* renamed from: X0 */
    public final void mo119694X0(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "<set-?>");
        this.f96890g = loginRepository;
    }

    /* renamed from: Y0 */
    public final void mo119695Y0(C11289a<C11079d2> aVar) {
        FragmentKt.m118829q(this, (String) null, (String) null, aVar, 3, (Object) null);
    }

    public void onDestroyView() {
        RecyclerView recyclerView = ((C36721i2) getBinding()).f91009b;
        recyclerView.setAdapter((RecyclerView.Adapter) null);
        recyclerView.setLayoutManager((RecyclerView.C20076o) null);
        C13830b bVar = this.f96893x;
        if (bVar != null) {
            recyclerView.mo59651u1(bVar);
        }
        this.f96893x = null;
        super.onDestroyView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        this.f96892w.mo119681b();
        RecyclerView recyclerView = ((C36721i2) getBinding()).f91009b;
        String[] stringArray = recyclerView.getResources().getStringArray(R.array.legal_notice_list);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray….array.legal_notice_list)");
        List uz = ArraysKt___ArraysKt.m40265uz(stringArray);
        if (!C13181d.m57146e(mo119691U0().mo31354f())) {
            uz.add(getString(R.string.legal_notice_list_add_when_not_logged));
        }
        recyclerView.setAdapter(new C38236a(uz));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.mo59589n(new C20171k(recyclerView.getContext(), 1));
        Intrinsics.checkNotNullExpressionValue(recyclerView, "this");
        C13830b bVar = new C13830b(recyclerView, this.f96894y, (C13830b.C13832b) null, 4, (DefaultConstructorMarker) null);
        recyclerView.mo59607p(bVar);
        this.f96893x = bVar;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.account_not_logged_link_info_legale);
            ToolBarDefaultView.m158944r0(bottomNavActivity.mo121107M1(), true, (C11300l) null, false, 6, (Object) null);
        }
    }
}
