package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.C20784a;
import androidx.viewpager.widget.ViewPager;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36888z1;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.loyalty.presentation.models.HomeLoyaltyModel;
import com.carrefour.fid.android.loyalty.presentation.models.LoyaltyBenefitModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.CreateOrAttachCardViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.mvi.CreateLoyaltyCard;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.loyalty.adapters.C24223a;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.C24421n;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
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
@C11076d0(mo22515d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0007*\u0001\u001c\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0002R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateOrAttachCardFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/z1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "e1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UIState;", "uiState", "f1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/CreateLoyaltyCard$UiEvent;", "uiEvent", "d1", "Lcom/carrefour/fid/android/loyalty/presentation/models/HomeLoyaltyModel;", "cardModel", "W0", "a1", "b1", "Z0", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/CreateOrAttachCardViewModel;", "f", "Lkotlin/z;", "c1", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/CreateOrAttachCardViewModel;", "viewModel", "com/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateOrAttachCardFragment$a", "g", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateOrAttachCardFragment$a;", "onPageChangeListener", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCreateOrAttachCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateOrAttachCardFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateOrAttachCardFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,198:1\n106#2,15:199\n168#3,7:214\n183#3,6:221\n154#3,6:227\n*S KotlinDebug\n*F\n+ 1 CreateOrAttachCardFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateOrAttachCardFragment\n*L\n33#1:199,15\n40#1:214,7\n41#1:221,6\n44#1:227,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateOrAttachCardFragment */
public final class CreateOrAttachCardFragment extends C24434v<C36888z1> {

    /* renamed from: v */
    public static final int f60784v = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f60785f;
    @C12579k

    /* renamed from: g */
    public final C24350a f60786g = new C24350a(this);

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateOrAttachCardFragment$a */
    public static final class C24350a implements ViewPager.C20779j {

        /* renamed from: a */
        public final /* synthetic */ CreateOrAttachCardFragment f60788a;

        public C24350a(CreateOrAttachCardFragment createOrAttachCardFragment) {
            this.f60788a = createOrAttachCardFragment;
        }

        /* renamed from: d */
        public void mo30672d(int i, float f, int i2) {
        }

        /* renamed from: e */
        public void mo30673e(int i) {
        }

        /* renamed from: f */
        public void mo30674f(int i) {
            this.f60788a.mo71200c1().sendIntent(new CreateLoyaltyCard.GetCardType(i));
        }
    }

    public CreateOrAttachCardFragment() {
        super(C243491.f60787a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new CreateOrAttachCardFragment$special$$inlined$viewModels$default$2(new CreateOrAttachCardFragment$special$$inlined$viewModels$default$1(this)));
        this.f60785f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(CreateOrAttachCardViewModel.class), new CreateOrAttachCardFragment$special$$inlined$viewModels$default$3(b), new CreateOrAttachCardFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new CreateOrAttachCardFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: S0 */
    public static final /* synthetic */ C36888z1 m106930S0(CreateOrAttachCardFragment createOrAttachCardFragment) {
        return (C36888z1) createOrAttachCardFragment.getBinding();
    }

    /* renamed from: X0 */
    public static final void m106934X0(HomeLoyaltyModel homeLoyaltyModel, View view) {
        Intrinsics.checkNotNullParameter(homeLoyaltyModel, "$cardModel");
        homeLoyaltyModel.getAttachCardCallback().invoke();
    }

    /* renamed from: Y0 */
    public static final void m106935Y0(HomeLoyaltyModel homeLoyaltyModel, View view) {
        Intrinsics.checkNotNullParameter(homeLoyaltyModel, "$cardModel");
        homeLoyaltyModel.getSecondActionCallback().invoke();
    }

    /* renamed from: W0 */
    public final void mo71196W0(HomeLoyaltyModel homeLoyaltyModel) {
        mo71198a1(homeLoyaltyModel);
        Button button = ((C36888z1) getBinding()).f92000b;
        button.setText(getString(homeLoyaltyModel.getAttachCardButtonLabelId()));
        button.setOnClickListener(new C24417k(homeLoyaltyModel));
        Button button2 = ((C36888z1) getBinding()).f92001c;
        button2.setText(getString(homeLoyaltyModel.getSecondActionButtonLabelId()));
        button2.setOnClickListener(new C24418l(homeLoyaltyModel));
    }

    /* renamed from: Z0 */
    public final void mo71197Z0() {
        ViewPager viewPager = ((C36888z1) getBinding()).f92009k;
        viewPager.setAdapter(new C24223a((List) null, 1, (DefaultConstructorMarker) null));
        viewPager.mo62329c(this.f60786g);
        ((C36888z1) getBinding()).f92002d.setupWithViewPager(viewPager, true);
    }

    /* renamed from: a1 */
    public final void mo71198a1(HomeLoyaltyModel homeLoyaltyModel) {
        C36888z1 z1Var = (C36888z1) getBinding();
        LoyaltyBenefitModel loyaltyBenefitModel = (LoyaltyBenefitModel) CollectionsKt___CollectionsKt.m40559R2(homeLoyaltyModel.getLoyaltyBenefits(), 0);
        if (loyaltyBenefitModel != null) {
            z1Var.f92003e.setVisibility(0);
            TextView textView = z1Var.f92003e;
            Intrinsics.checkNotNullExpressionValue(textView, "textFragmentHomeLoyalty1");
            String string = getString(loyaltyBenefitModel.getMessageId());
            Intrinsics.checkNotNullExpressionValue(string, "getString(messageId)");
            TextViewKt.m118961l(textView, string, loyaltyBenefitModel.getIconId(), 0, 0, 0, 28, (Object) null);
        } else {
            z1Var.f92003e.setVisibility(8);
            C11079d2 d2Var = C11079d2.f28267a;
        }
        LoyaltyBenefitModel loyaltyBenefitModel2 = (LoyaltyBenefitModel) CollectionsKt___CollectionsKt.m40559R2(homeLoyaltyModel.getLoyaltyBenefits(), 1);
        if (loyaltyBenefitModel2 != null) {
            z1Var.f92004f.setVisibility(0);
            TextView textView2 = z1Var.f92004f;
            Intrinsics.checkNotNullExpressionValue(textView2, "textFragmentHomeLoyalty2");
            String string2 = getString(loyaltyBenefitModel2.getMessageId());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(messageId)");
            TextViewKt.m118961l(textView2, string2, loyaltyBenefitModel2.getIconId(), 0, 0, 0, 28, (Object) null);
        } else {
            z1Var.f92004f.setVisibility(8);
            C11079d2 d2Var2 = C11079d2.f28267a;
        }
        LoyaltyBenefitModel loyaltyBenefitModel3 = (LoyaltyBenefitModel) CollectionsKt___CollectionsKt.m40559R2(homeLoyaltyModel.getLoyaltyBenefits(), 2);
        if (loyaltyBenefitModel3 != null) {
            z1Var.f92005g.setVisibility(0);
            TextView textView3 = z1Var.f92005g;
            Intrinsics.checkNotNullExpressionValue(textView3, "textFragmentHomeLoyalty3");
            String string3 = getString(loyaltyBenefitModel3.getMessageId());
            Intrinsics.checkNotNullExpressionValue(string3, "getString(messageId)");
            TextViewKt.m118961l(textView3, string3, loyaltyBenefitModel3.getIconId(), 0, 0, 0, 28, (Object) null);
        } else {
            z1Var.f92005g.setVisibility(8);
            C11079d2 d2Var3 = C11079d2.f28267a;
        }
        LoyaltyBenefitModel loyaltyBenefitModel4 = (LoyaltyBenefitModel) CollectionsKt___CollectionsKt.m40559R2(homeLoyaltyModel.getLoyaltyBenefits(), 3);
        if (loyaltyBenefitModel4 != null) {
            z1Var.f92006h.setVisibility(0);
            TextView textView4 = z1Var.f92006h;
            Intrinsics.checkNotNullExpressionValue(textView4, "textFragmentHomeLoyalty4");
            String string4 = getString(loyaltyBenefitModel4.getMessageId());
            Intrinsics.checkNotNullExpressionValue(string4, "getString(messageId)");
            TextViewKt.m118961l(textView4, string4, loyaltyBenefitModel4.getIconId(), 0, 0, 0, 28, (Object) null);
            return;
        }
        z1Var.f92006h.setVisibility(8);
        C11079d2 d2Var4 = C11079d2.f28267a;
    }

    /* renamed from: b1 */
    public final void mo71199b1(CreateLoyaltyCard.UIState uIState) {
        C20784a adapter = ((C36888z1) getBinding()).f92009k.getAdapter();
        C24223a aVar = adapter instanceof C24223a ? (C24223a) adapter : null;
        if (aVar != null) {
            aVar.mo70893v(uIState.getCards());
        }
    }

    /* renamed from: c1 */
    public final CreateOrAttachCardViewModel mo71200c1() {
        return (CreateOrAttachCardViewModel) this.f60785f.getValue();
    }

    /* renamed from: d1 */
    public final void mo71201d1(CreateLoyaltyCard.UiEvent uiEvent) {
        CreateLoyaltyCard.UiEvent uiEvent2 = uiEvent;
        if (Intrinsics.areEqual((Object) uiEvent2, (Object) CreateLoyaltyCard.AttachCard.INSTANCE)) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putBoolean(C38212b.f96814v, false);
            }
            FragmentKt.m118823k(this, C24421n.f60899a.mo71454c());
        } else if (Intrinsics.areEqual((Object) uiEvent2, (Object) CreateLoyaltyCard.NavigateToCreateFidCard.INSTANCE)) {
            FragmentKt.m118823k(this, C24421n.C24424c.m107193b(C24421n.f60899a, false, false, (String) null, 7, (Object) null));
        } else if (Intrinsics.areEqual((Object) uiEvent2, (Object) CreateLoyaltyCard.NavigateToInitSecretCode.INSTANCE)) {
            FragmentKt.m118823k(this, C24421n.C24424c.m107194e(C24421n.f60899a, false, false, (String) null, 7, (Object) null));
        } else if (Intrinsics.areEqual((Object) uiEvent2, (Object) CreateLoyaltyCard.NavigateToDiscoverPassCard.INSTANCE)) {
            String string = getString(R.string.general_information);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_information)");
            String string2 = getString(R.string.customer_dialog_text);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.customer_dialog_text)");
            FragmentKt.m118838z(this, string, string2, getString(R.string.general_cancel), (C11289a) null, getString(R.string.general_see), false, new CreateOrAttachCardFragment$handleEvent$1(this), (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, 4008, (Object) null);
        }
    }

    /* renamed from: e1 */
    public final void mo71202e1() {
        ToolBarDefaultView M1;
        C19232h activity = getActivity();
        BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
        if (bottomNavActivity != null && (M1 = bottomNavActivity.mo121107M1()) != null) {
            ToolBarDefaultView.setup$default(M1, (C11300l) null, CreateOrAttachCardFragment$initToolbar$1.f60797f, 1, (Object) null);
        }
    }

    /* renamed from: f1 */
    public final void mo71203f1(CreateLoyaltyCard.UIState uIState) {
        HomeLoyaltyModel loyaltyCardInfo = uIState.getLoyaltyCardInfo();
        if (loyaltyCardInfo != null) {
            mo71196W0(loyaltyCardInfo);
        }
        mo71199b1(uIState);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo71202e1();
        CreateOrAttachCardViewModel c1 = mo71200c1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new CreateOrAttachCardFragment$onViewCreated$$inlined$processState$1(this, c1, (C11045c) null, this), 3, (Object) null);
        CreateOrAttachCardViewModel c12 = mo71200c1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new CreateOrAttachCardFragment$onViewCreated$$inlined$processEvent$1(this, c12, (C11045c) null, this), 3, (Object) null);
        mo71197Z0();
        mo71200c1().sendScreenView();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        C11723c2 unused3 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner3), (CoroutineContext) null, (CoroutineStart) null, new C24351xe37831ca(this, state, (C11045c) null, this), 3, (Object) null);
    }
}
