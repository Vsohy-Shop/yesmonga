package com.carrefour.fid.android.consent.presentation.p055ui;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.Group;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.consent.C36099R;
import com.carrefour.fid.android.consent.databinding.FragmentConfigureConsentOptinsBinding;
import com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel;
import com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.C28936j;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\u001a\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/ui/ConfigureConsentOptinsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/consent/databinding/FragmentConfigureConsentOptinsBinding;", "Lkotlin/d2;", "initHeader", "", "text", "Landroid/widget/TextView;", "textView", "initTextWithHyperLink", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UIState;", "state", "renderUiState", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UiEvent;", "event", "handleEvent", "showLoadingScreen", "showContent", "handleUserConsentDisplay", "initListener", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/ConfigureConsentOptinsViewModel;", "viewModelConfigure$delegate", "Lkotlin/z;", "getViewModelConfigure", "()Lcom/carrefour/fid/android/consent/presentation/viewmodels/ConfigureConsentOptinsViewModel;", "viewModelConfigure", "Lcom/carrefour/fid/android/shared/util/j;", "fragmentUtil", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "<init>", "()V", "Companion", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nConfigureConsentOptinsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigureConsentOptinsFragment.kt\ncom/carrefour/fid/android/consent/presentation/ui/ConfigureConsentOptinsFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,216:1\n48#2,9:217\n168#3,7:226\n183#3,6:233\n262#4,2:239\n262#4,2:241\n262#4,2:243\n262#4,2:245\n260#4:247\n260#4:248\n*S KotlinDebug\n*F\n+ 1 ConfigureConsentOptinsFragment.kt\ncom/carrefour/fid/android/consent/presentation/ui/ConfigureConsentOptinsFragment\n*L\n47#1:217,9\n65#1:226,7\n66#1:233,6\n178#1:239,2\n183#1:241,2\n187#1:243,2\n192#1:245,2\n203#1:247\n207#1:248\n*E\n"})
/* renamed from: com.carrefour.fid.android.consent.presentation.ui.ConfigureConsentOptinsFragment */
public final class ConfigureConsentOptinsFragment extends Hilt_ConfigureConsentOptinsFragment<FragmentConfigureConsentOptinsBinding> {
    public static final int $stable = 8;
    @C12579k
    public static final String CONFIGURE_CONSENT_REQUEST_KEY = "CONFIGURE_CONSENT_REQUEST_KEY";
    @C12579k
    public static final String CONFIGURE_CONSENT_SHOW_BACKDROP_RESULT_KEY = "CONFIGURE_CONSENT_SHOW_BACKDROP_RESULT_KEY";
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Inject
    public C28936j fragmentUtil;
    @C12579k
    private final C11677z viewModelConfigure$delegate;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/ui/ConfigureConsentOptinsFragment$Companion;", "", "()V", "CONFIGURE_CONSENT_REQUEST_KEY", "", "CONFIGURE_CONSENT_SHOW_BACKDROP_RESULT_KEY", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.consent.presentation.ui.ConfigureConsentOptinsFragment$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ConfigureConsentOptinsFragment() {
        super(C361121.INSTANCE);
        C11677z c = C10864b0.m38748c(new C36123x228053d(this, C36099R.C36103id.consent_optins_graph));
        this.viewModelConfigure$delegate = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(ConfigureConsentOptinsViewModel.class), new C36124x228053e(c, (C11510n) null), new C36125x228053f(this, c, (C11510n) null));
    }

    /* access modifiers changed from: private */
    public final ConfigureConsentOptinsViewModel getViewModelConfigure() {
        return (ConfigureConsentOptinsViewModel) this.viewModelConfigure$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void handleEvent(ConsentOptinsMVI.UiEvent uiEvent) {
        if (uiEvent instanceof ConsentOptinsMVI.UiEvent.CloseScreen) {
            C19736g.m91827a(this).mo58152q0();
            if (((ConsentOptinsMVI.UiEvent.CloseScreen) uiEvent).getDisplayConsentBackDrop()) {
                requireActivity().mo57175g0().mo56857a(CONFIGURE_CONSENT_REQUEST_KEY, C17779d.m81164b(C11078d1.m42659a(CONFIGURE_CONSENT_SHOW_BACKDROP_RESULT_KEY, Boolean.TRUE)));
            }
        }
    }

    private final void handleUserConsentDisplay(ConsentOptinsMVI.UIState uIState) {
        FragmentConfigureConsentOptinsBinding fragmentConfigureConsentOptinsBinding = (FragmentConfigureConsentOptinsBinding) getBinding();
        if (uIState.isPersonalizedAdsOptinAvailable()) {
            Group group = fragmentConfigureConsentOptinsBinding.configureConsentOptinsPersonalizedAdsGroup;
            Intrinsics.checkNotNullExpressionValue(group, "configureConsentOptinsPersonalizedAdsGroup");
            group.setVisibility(0);
            if (uIState.isPersonalizedAdsOptinRefused()) {
                fragmentConfigureConsentOptinsBinding.configureConsentOptinsPersonalizedAdsRadioGroup.check(C36099R.C36103id.configure_consent_optins_personalized_ads_decline_radio);
            }
        } else {
            Group group2 = fragmentConfigureConsentOptinsBinding.configureConsentOptinsPersonalizedAdsGroup;
            Intrinsics.checkNotNullExpressionValue(group2, "configureConsentOptinsPersonalizedAdsGroup");
            group2.setVisibility(8);
        }
        if (uIState.isSharingToPartnersOptinAvailable()) {
            Group group3 = fragmentConfigureConsentOptinsBinding.configureConsentOptinsSharingToPartnersGroup;
            Intrinsics.checkNotNullExpressionValue(group3, "configureConsentOptinsSharingToPartnersGroup");
            group3.setVisibility(0);
            if (uIState.isSharingToPartnersOptinRefused()) {
                fragmentConfigureConsentOptinsBinding.configureConsentOptinsSharingToPartnersRadioGroup.check(C36099R.C36103id.configure_consent_optins_sharing_to_partners_decline_radio);
                return;
            }
            return;
        }
        Group group4 = fragmentConfigureConsentOptinsBinding.configureConsentOptinsSharingToPartnersGroup;
        Intrinsics.checkNotNullExpressionValue(group4, "configureConsentOptinsSharingToPartnersGroup");
        group4.setVisibility(8);
    }

    private final void initHeader() {
        getFragmentUtil().mo32776b(this);
        ((FragmentConfigureConsentOptinsBinding) getBinding()).configureConsentOptinsHeader.setContent(C8553b.m31049c(726679349, true, new ConfigureConsentOptinsFragment$initHeader$1(this)));
    }

    private final void initListener() {
        FragmentConfigureConsentOptinsBinding fragmentConfigureConsentOptinsBinding = (FragmentConfigureConsentOptinsBinding) getBinding();
        fragmentConfigureConsentOptinsBinding.configureConsentOptinsSave.setOnClickListener(new C36140a(this, fragmentConfigureConsentOptinsBinding));
    }

    /* access modifiers changed from: private */
    public static final void initListener$lambda$3$lambda$2(ConfigureConsentOptinsFragment configureConsentOptinsFragment, FragmentConfigureConsentOptinsBinding fragmentConfigureConsentOptinsBinding, View view) {
        boolean z;
        Boolean bool;
        Intrinsics.checkNotNullParameter(configureConsentOptinsFragment, "this$0");
        Intrinsics.checkNotNullParameter(fragmentConfigureConsentOptinsBinding, "$this_apply");
        ConfigureConsentOptinsViewModel viewModelConfigure = configureConsentOptinsFragment.getViewModelConfigure();
        RadioGroup radioGroup = fragmentConfigureConsentOptinsBinding.configureConsentOptinsPersonalizedAdsRadioGroup;
        Intrinsics.checkNotNullExpressionValue(radioGroup, "configureConsentOptinsPersonalizedAdsRadioGroup");
        boolean z2 = false;
        if (radioGroup.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool2 = null;
        if (z) {
            View childAt = fragmentConfigureConsentOptinsBinding.configureConsentOptinsPersonalizedAdsRadioGroup.getChildAt(1);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
            bool = Boolean.valueOf(((RadioButton) childAt).isChecked());
        } else {
            bool = null;
        }
        RadioGroup radioGroup2 = fragmentConfigureConsentOptinsBinding.configureConsentOptinsSharingToPartnersRadioGroup;
        Intrinsics.checkNotNullExpressionValue(radioGroup2, "configureConsentOptinsSharingToPartnersRadioGroup");
        if (radioGroup2.getVisibility() == 0) {
            z2 = true;
        }
        if (z2) {
            View childAt2 = fragmentConfigureConsentOptinsBinding.configureConsentOptinsSharingToPartnersRadioGroup.getChildAt(1);
            Intrinsics.checkNotNull(childAt2, "null cannot be cast to non-null type android.widget.RadioButton");
            bool2 = Boolean.valueOf(((RadioButton) childAt2).isChecked());
        }
        viewModelConfigure.sendIntent(new ConsentOptinsMVI.UserAction.SaveChoices(bool, bool2));
    }

    private final void initTextWithHyperLink(int i, TextView textView) {
        String string = getString(C36099R.string.f89171xc2aaf363);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.conse…data_with_partners_part1)");
        String string2 = getString(C36099R.string.f89172xc2aaf364);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.conse…data_with_partners_part2)");
        String string3 = getString(i);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(text)");
        String string4 = getString(C36099R.string.account_notification_share_data_to_partners_url);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.accou…are_data_to_partners_url)");
        String str = string + " " + string2 + string3;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C36128x4b7009b3(this, string4), string.length() + 1, str.length() - string3.length(), 33);
        spannableString.setSpan(new StyleSpan(1), string.length() + 1, str.length() - string3.length(), 33);
        textView.setText(spannableString);
        textView.setMovementMethod(new LinkMovementMethod());
    }

    /* access modifiers changed from: private */
    public final void renderUiState(ConsentOptinsMVI.UIState uIState) {
        if (uIState.isLoading()) {
            showLoadingScreen();
            return;
        }
        showContent();
        if (uIState.getErrorMessageRes() != null) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(uIState.getErrorMessageRes().intValue());
            Intrinsics.checkNotNullExpressionValue(string, "getString(state.errorMessageRes)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            return;
        }
        handleUserConsentDisplay(uIState);
    }

    private final void showContent() {
        hideLoading();
        ((FragmentConfigureConsentOptinsBinding) getBinding()).configureConsentOptinsContent.setVisibility(0);
        ((FragmentConfigureConsentOptinsBinding) getBinding()).configureConsentOptinsSave.setVisibility(0);
    }

    private final void showLoadingScreen() {
        ((FragmentConfigureConsentOptinsBinding) getBinding()).configureConsentOptinsContent.setVisibility(8);
        ((FragmentConfigureConsentOptinsBinding) getBinding()).configureConsentOptinsSave.setVisibility(8);
        showLoading();
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.fragmentUtil;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((FragmentConfigureConsentOptinsBinding) getBinding()).configureConsentOptinsShimmer;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.configureConsentOptinsShimmer");
        return shimmerFrameLayout;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        initHeader();
        int i = C36099R.string.f89173xc2aaf365;
        TextView textView = ((FragmentConfigureConsentOptinsBinding) getBinding()).configureConsentOptinsSharingToPartnersText;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.configureConsent…tinsSharingToPartnersText");
        initTextWithHyperLink(i, textView);
        int i2 = C36099R.string.consent_config_notification_personalized_advertisement;
        TextView textView2 = ((FragmentConfigureConsentOptinsBinding) getBinding()).configureConsentOptinsPersonalizedAdsText;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.configureConsentOptinsPersonalizedAdsText");
        initTextWithHyperLink(i2, textView2);
        ConfigureConsentOptinsViewModel viewModelConfigure = getViewModelConfigure();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C36118x6f471467(this, viewModelConfigure, (C11045c) null, this), 3, (Object) null);
        ConfigureConsentOptinsViewModel viewModelConfigure2 = getViewModelConfigure();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C36113x8e4f6430(this, viewModelConfigure2, (C11045c) null, this), 3, (Object) null);
        getViewModelConfigure().sendIntent(ConsentOptinsMVI.UserAction.FetchRefusedAndMissingConsents.INSTANCE);
        initListener();
        FragmentKt.m118815c(this, new ConfigureConsentOptinsFragment$onViewCreated$3(this));
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.fragmentUtil = jVar;
    }
}
