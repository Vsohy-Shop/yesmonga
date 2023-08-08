package com.carrefour.fid.android.consent.presentation.p055ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.compose.C19714d;
import com.carrefour.fid.android.consent.databinding.FragmentConsentBackDropBinding;
import com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel;
import com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentBackDropMVI;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/ui/ConsentBackDropFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/consent/databinding/FragmentConsentBackDropBinding;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UIState;", "state", "Lkotlin/d2;", "renderState", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UiEvent;", "event", "processUiEvent", "updateConsentDisplay", "initUi", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/ConsentBackDropViewModel;", "consentBackDropViewModel$delegate", "Lkotlin/z;", "getConsentBackDropViewModel", "()Lcom/carrefour/fid/android/consent/presentation/viewmodels/ConsentBackDropViewModel;", "consentBackDropViewModel", "Lcom/carrefour/fid/android/shared/navigation/c;", "navigator", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "<init>", "()V", "Companion", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nConsentBackDropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentBackDropFragment.kt\ncom/carrefour/fid/android/consent/presentation/ui/ConsentBackDropFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,121:1\n56#2,10:122\n168#3,7:132\n183#3,6:139\n262#4,2:145\n262#4,2:147\n262#4,2:149\n262#4,2:151\n262#4,2:153\n262#4,2:155\n262#4,2:157\n262#4,2:159\n262#4,2:161\n262#4,2:163\n262#4,2:165\n262#4,2:167\n262#4,2:169\n*S KotlinDebug\n*F\n+ 1 ConsentBackDropFragment.kt\ncom/carrefour/fid/android/consent/presentation/ui/ConsentBackDropFragment\n*L\n27#1:122,10\n34#1:132,7\n35#1:139,6\n60#1:145,2\n61#1:147,2\n62#1:149,2\n64#1:151,2\n65#1:153,2\n66#1:155,2\n70#1:157,2\n71#1:159,2\n73#1:161,2\n74#1:163,2\n77#1:165,2\n78#1:167,2\n79#1:169,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.consent.presentation.ui.ConsentBackDropFragment */
public final class ConsentBackDropFragment extends Hilt_ConsentBackDropFragment<FragmentConsentBackDropBinding> {
    public static final int $stable = 8;
    @C12579k
    public static final String ARG_COLUMN_COUNT = "column-count";
    @C12579k
    public static final String ARG_ITEM_COUNT = "item-count";
    @C12579k
    public static final String CONSENT_ON_DISMISS = "CONSENT_ON_DISMISS";
    @C12579k
    public static final String CONSENT_REDIRECT_TO_CONFIGURE_CONSENT_PAGE = "CONSENT_REDIRECT_TO_CONFIGURE_CONSENT_PAGE";
    @C12579k
    public static final String CONSENT_REQUEST_KEY = "CONSENT_REQUEST_KEY";
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private final C11677z consentBackDropViewModel$delegate;
    @Inject
    public C28796c navigator;

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/ui/ConsentBackDropFragment$Companion;", "", "()V", "ARG_COLUMN_COUNT", "", "ARG_ITEM_COUNT", "CONSENT_ON_DISMISS", "CONSENT_REDIRECT_TO_CONFIGURE_CONSENT_PAGE", "CONSENT_REQUEST_KEY", "newInstance", "Lcom/carrefour/fid/android/consent/presentation/ui/ConsentBackDropFragment;", "columnCount", "", "itemCount", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.consent.presentation.ui.ConsentBackDropFragment$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ConsentBackDropFragment newInstance$default(Companion companion, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 1;
            }
            if ((i3 & 2) != 0) {
                i2 = 1;
            }
            return companion.newInstance(i, i2);
        }

        @C12579k
        @C11384m
        public final ConsentBackDropFragment newInstance(int i, int i2) {
            ConsentBackDropFragment consentBackDropFragment = new ConsentBackDropFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(ConsentBackDropFragment.ARG_COLUMN_COUNT, i);
            bundle.putInt(ConsentBackDropFragment.ARG_ITEM_COUNT, i2);
            consentBackDropFragment.setArguments(bundle);
            return consentBackDropFragment;
        }

        private Companion() {
        }
    }

    public ConsentBackDropFragment() {
        super(C361301.INSTANCE, C361312.INSTANCE, true);
        ConsentBackDropFragment$special$$inlined$viewModels$default$1 consentBackDropFragment$special$$inlined$viewModels$default$1 = new ConsentBackDropFragment$special$$inlined$viewModels$default$1(this);
        this.consentBackDropViewModel$delegate = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(ConsentBackDropViewModel.class), new ConsentBackDropFragment$special$$inlined$viewModels$default$2(consentBackDropFragment$special$$inlined$viewModels$default$1), new ConsentBackDropFragment$special$$inlined$viewModels$default$3(consentBackDropFragment$special$$inlined$viewModels$default$1, this));
    }

    private final ConsentBackDropViewModel getConsentBackDropViewModel() {
        return (ConsentBackDropViewModel) this.consentBackDropViewModel$delegate.getValue();
    }

    private final void initUi() {
        ((FragmentConsentBackDropBinding) getBinding()).consentBackDropDismissButton.setOnClickListener(new C36141b(this));
        ((FragmentConsentBackDropBinding) getBinding()).consentConfigureButton.setOnClickListener(new C36142c(this));
        ((FragmentConsentBackDropBinding) getBinding()).consentAcceptAllButton.setOnClickListener(new C36143d(this));
    }

    /* access modifiers changed from: private */
    public static final void initUi$lambda$1(ConsentBackDropFragment consentBackDropFragment, View view) {
        Intrinsics.checkNotNullParameter(consentBackDropFragment, "this$0");
        consentBackDropFragment.getConsentBackDropViewModel().sendIntent(ConsentBackDropMVI.UserAction.SkipConsents.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static final void initUi$lambda$2(ConsentBackDropFragment consentBackDropFragment, View view) {
        Intrinsics.checkNotNullParameter(consentBackDropFragment, "this$0");
        consentBackDropFragment.getConsentBackDropViewModel().sendIntent(ConsentBackDropMVI.UserAction.ConfigureConsents.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static final void initUi$lambda$3(ConsentBackDropFragment consentBackDropFragment, View view) {
        Intrinsics.checkNotNullParameter(consentBackDropFragment, "this$0");
        consentBackDropFragment.getConsentBackDropViewModel().sendIntent(ConsentBackDropMVI.UserAction.AcceptAllConsents.INSTANCE);
    }

    @C12579k
    @C11384m
    public static final ConsentBackDropFragment newInstance(int i, int i2) {
        return Companion.newInstance(i, i2);
    }

    /* access modifiers changed from: private */
    public final void processUiEvent(ConsentBackDropMVI.UiEvent uiEvent) {
        if (uiEvent instanceof ConsentBackDropMVI.UiEvent.DismissBackDrop) {
            dismiss();
        } else if (uiEvent instanceof ConsentBackDropMVI.UiEvent.OpenConfigureConsentPage) {
            requireActivity().mo57175g0().mo56857a(CONSENT_REQUEST_KEY, C17779d.m81164b(C11078d1.m42659a(CONSENT_REDIRECT_TO_CONFIGURE_CONSENT_PAGE, Boolean.TRUE)));
        }
    }

    /* access modifiers changed from: private */
    public final void renderState(ConsentBackDropMVI.UIState uIState) {
        updateConsentDisplay(uIState);
    }

    private final void updateConsentDisplay(ConsentBackDropMVI.UIState uIState) {
        int i;
        if (uIState.getDisplayCarrefourAdsContent()) {
            TextView textView = ((FragmentConsentBackDropBinding) getBinding()).consentBackDropCarrefourAdsTitle;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.consentBackDropCarrefourAdsTitle");
            textView.setVisibility(0);
            TextView textView2 = ((FragmentConsentBackDropBinding) getBinding()).consentBackDropCarrefourAdsDescription;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.consentBackDropCarrefourAdsDescription");
            textView2.setVisibility(0);
            View view = ((FragmentConsentBackDropBinding) getBinding()).consentBackDropCarrefourAdsSeparator;
            Intrinsics.checkNotNullExpressionValue(view, "binding.consentBackDropCarrefourAdsSeparator");
            if (uIState.getDisplayPartnerAdsContent()) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        } else {
            TextView textView3 = ((FragmentConsentBackDropBinding) getBinding()).consentBackDropCarrefourAdsTitle;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.consentBackDropCarrefourAdsTitle");
            textView3.setVisibility(8);
            TextView textView4 = ((FragmentConsentBackDropBinding) getBinding()).consentBackDropCarrefourAdsDescription;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.consentBackDropCarrefourAdsDescription");
            textView4.setVisibility(8);
            View view2 = ((FragmentConsentBackDropBinding) getBinding()).consentBackDropCarrefourAdsSeparator;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.consentBackDropCarrefourAdsSeparator");
            view2.setVisibility(8);
        }
        if (uIState.getDisplayPartnerAdsContent()) {
            TextView textView5 = ((FragmentConsentBackDropBinding) getBinding()).consentBackDropPartnersAdsTitle;
            Intrinsics.checkNotNullExpressionValue(textView5, "binding.consentBackDropPartnersAdsTitle");
            textView5.setVisibility(0);
            TextView textView6 = ((FragmentConsentBackDropBinding) getBinding()).consentBackDropPartnersAdsDescription;
            Intrinsics.checkNotNullExpressionValue(textView6, "binding.consentBackDropPartnersAdsDescription");
            textView6.setVisibility(0);
        } else {
            TextView textView7 = ((FragmentConsentBackDropBinding) getBinding()).consentBackDropPartnersAdsTitle;
            Intrinsics.checkNotNullExpressionValue(textView7, "binding.consentBackDropPartnersAdsTitle");
            textView7.setVisibility(8);
            TextView textView8 = ((FragmentConsentBackDropBinding) getBinding()).consentBackDropPartnersAdsDescription;
            Intrinsics.checkNotNullExpressionValue(textView8, "binding.consentBackDropPartnersAdsDescription");
            textView8.setVisibility(8);
        }
        MaterialButton materialButton = ((FragmentConsentBackDropBinding) getBinding()).consentAcceptAllButton;
        Intrinsics.checkNotNullExpressionValue(materialButton, "binding.consentAcceptAllButton");
        materialButton.setVisibility(0);
        MaterialButton materialButton2 = ((FragmentConsentBackDropBinding) getBinding()).consentConfigureButton;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "binding.consentConfigureButton");
        materialButton2.setVisibility(0);
        MaterialButton materialButton3 = ((FragmentConsentBackDropBinding) getBinding()).consentBackDropDismissButton;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "binding.consentBackDropDismissButton");
        materialButton3.setVisibility(0);
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.navigator;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public void onDismiss(@C12579k DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, C19714d.f50522e);
        requireActivity().mo57175g0().mo56857a(CONSENT_REQUEST_KEY, C17779d.m81164b(C11078d1.m42659a(CONSENT_ON_DISMISS, Boolean.TRUE)));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        ConsentBackDropViewModel consentBackDropViewModel = getConsentBackDropViewModel();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new ConsentBackDropFragment$onViewCreated$$inlined$processState$1(this, consentBackDropViewModel, (C11045c) null, this), 3, (Object) null);
        ConsentBackDropViewModel consentBackDropViewModel2 = getConsentBackDropViewModel();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new ConsentBackDropFragment$onViewCreated$$inlined$processEvent$1(this, consentBackDropViewModel2, (C11045c) null, this), 3, (Object) null);
        getConsentBackDropViewModel().sendIntent(ConsentBackDropMVI.UserAction.FetchNotCompletedConsents.INSTANCE);
        initUi();
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.navigator = cVar;
    }
}
