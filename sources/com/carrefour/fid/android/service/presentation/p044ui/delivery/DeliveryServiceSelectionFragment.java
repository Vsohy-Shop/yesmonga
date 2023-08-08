package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.components.divider.C37094b;
import com.carrefour.fid.android.design.components.type.C37130b;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.databinding.FragmentDeliveryServiceSelectionBinding;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliveryServiceSelectionSideEffect;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryService;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelection;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.H1h3Service;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002J\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0002J\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0002J\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u001b\u0010%\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0006@\u0006X.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006A"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/service/databinding/FragmentDeliveryServiceSelectionBinding;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UiState;", "state", "Lkotlin/d2;", "renderUiState", "initHeader", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect;", "sideEffect", "processSideEffects", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryService;", "Lcom/carrefour/fid/android/design/components/widgets/ServiceInfoComponent$UiModel;", "toServiceInfoUiModel", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/ClcvService;", "Landroid/text/SpannableString;", "getDetailsText", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/H1h3Service;", "", "visible", "setBottomButtonsVisibility", "showError", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "Landroid/view/ViewStub;", "errorMessageLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelectionViewModel;", "viewModel$delegate", "Lkotlin/z;", "getViewModel", "()Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelectionViewModel;", "viewModel", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionFragmentArgs;", "args$delegate", "Landroidx/navigation/m;", "getArgs", "()Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionFragmentArgs;", "args", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/ServiceInfoAdapter;", "adapter", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/ServiceInfoAdapter;", "hasNavigatedToAddressInput", "Z", "Lcom/carrefour/fid/android/shared/navigation/c;", "navigator", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "Lcom/carrefour/fid/android/shared/util/j;", "fragmentUtil", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "<init>", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nDeliveryServiceSelectionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryServiceSelectionFragment.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,237:1\n48#2,9:238\n42#3,3:247\n168#4,7:250\n1549#5:257\n1620#5,3:258\n1#6:261\n*S KotlinDebug\n*F\n+ 1 DeliveryServiceSelectionFragment.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionFragment\n*L\n46#1:238,9\n47#1:247,3\n88#1:250,7\n108#1:257\n108#1:258,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragment */
public final class DeliveryServiceSelectionFragment extends Hilt_DeliveryServiceSelectionFragment<FragmentDeliveryServiceSelectionBinding> {
    public static final int $stable = 8;
    @C12579k
    private final ServiceInfoAdapter adapter = new ServiceInfoAdapter();
    @C12579k
    private final C19766m args$delegate = new C19766m(C11342l0.m43547d(DeliveryServiceSelectionFragmentArgs.class), new DeliveryServiceSelectionFragment$special$$inlined$navArgs$1(this));
    @Inject
    public C28936j fragmentUtil;
    private boolean hasNavigatedToAddressInput;
    @Inject
    public C28796c navigator;
    @C12579k
    private final C11677z viewModel$delegate;

    public DeliveryServiceSelectionFragment() {
        super(C283611.INSTANCE);
        C11677z c = C10864b0.m38748c(new C28367x867e30d9(this, C28330R.C28334id.delivery_graph));
        this.viewModel$delegate = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(DeliveryServiceSelectionViewModel.class), new C28368x867e30da(c, (C11510n) null), new C28369x867e30db(this, c, (C11510n) null));
    }

    private final DeliveryServiceSelectionFragmentArgs getArgs() {
        return (DeliveryServiceSelectionFragmentArgs) this.args$delegate.getValue();
    }

    private final SpannableString getDetailsText(ClcvService clcvService) {
        if (!clcvService.isAvailable()) {
            return null;
        }
        C11368t0 t0Var = C11368t0.f28504a;
        String string = getString(C28330R.string.delivery_service_clcv_details_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.deliv…ervice_clcv_details_text)");
        String format = String.format(string, Arrays.copyOf(new Object[]{C28782t.m119105b(Double.valueOf(clcvService.getMinOrderAmount()))}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        if (clcvService.getFreeOrderThreshold() != null && clcvService.getFreeOrderThreshold().doubleValue() > 0.0d) {
            String string2 = getString(C28330R.string.delivery_service_clcv_details_text_free_delivery);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.deliv…tails_text_free_delivery)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{C28782t.m119105b(clcvService.getFreeOrderThreshold())}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
            format = format + format2;
        }
        return new SpannableString(Html.fromHtml(format, 63));
    }

    /* access modifiers changed from: private */
    public final DeliveryServiceSelectionViewModel getViewModel() {
        return (DeliveryServiceSelectionViewModel) this.viewModel$delegate.getValue();
    }

    private final void initHeader() {
        getFragmentUtil().mo32776b(this);
        ((FragmentDeliveryServiceSelectionBinding) getBinding()).deliveryServiceSelectionHeader.setContent(C8553b.m31049c(1342531280, true, new DeliveryServiceSelectionFragment$initHeader$1(this)));
    }

    /* access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(DeliveryServiceSelectionFragment deliveryServiceSelectionFragment, View view) {
        Intrinsics.checkNotNullParameter(deliveryServiceSelectionFragment, "this$0");
        deliveryServiceSelectionFragment.getViewModel().getAnalytics().tagChangeAddress();
        deliveryServiceSelectionFragment.getViewModel().sendIntent(new DeliveryServiceSelection.UserAction.ChangeAddress(deliveryServiceSelectionFragment.getArgs().getDeliveryType(), new DeliveryServiceSelectionFragment$onViewCreated$1$1(deliveryServiceSelectionFragment)));
    }

    /* access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(DeliveryServiceSelectionFragment deliveryServiceSelectionFragment, View view) {
        Intrinsics.checkNotNullParameter(deliveryServiceSelectionFragment, "this$0");
        deliveryServiceSelectionFragment.getViewModel().sendIntent(DeliveryServiceSelection.UserAction.SwitchToDrive.INSTANCE);
    }

    /* access modifiers changed from: private */
    public final void processSideEffects(DeliveryServiceSelectionSideEffect deliveryServiceSelectionSideEffect) {
        if (deliveryServiceSelectionSideEffect instanceof DeliveryServiceSelectionSideEffect.NavigateToAddressInput) {
            DeliveryServiceSelectionSideEffect.NavigateToAddressInput navigateToAddressInput = (DeliveryServiceSelectionSideEffect.NavigateToAddressInput) deliveryServiceSelectionSideEffect;
            getNavigator().mo83840p(C19736g.m91827a(this), false, true, navigateToAddressInput.getDeliveryAddress(), navigateToAddressInput.getPhone());
        } else if (Intrinsics.areEqual((Object) deliveryServiceSelectionSideEffect, (Object) DeliveryServiceSelectionSideEffect.NavigateToDrive.INSTANCE)) {
            getNavigator().mo83829e(C19736g.m91827a(this), true);
        } else if (deliveryServiceSelectionSideEffect instanceof DeliveryServiceSelectionSideEffect.NavigateToDeliveryServiceSummary) {
            DeliveryServiceSelectionSideEffect.NavigateToDeliveryServiceSummary navigateToDeliveryServiceSummary = (DeliveryServiceSelectionSideEffect.NavigateToDeliveryServiceSummary) deliveryServiceSelectionSideEffect;
            C19736g.m91827a(this).mo58142g0(DeliveryServiceSelectionFragmentDirections.Companion.mo82863x4f383761(navigateToDeliveryServiceSummary.getDeliveryType(), navigateToDeliveryServiceSummary.getAddressModel(), navigateToDeliveryServiceSummary.m172887getTelephoneeg0BugQ(), navigateToDeliveryServiceSummary.getHasSkippedSelection()));
        } else if (Intrinsics.areEqual((Object) deliveryServiceSelectionSideEffect, (Object) DeliveryServiceSelectionSideEffect.NetworkError.INSTANCE)) {
            showError();
        }
    }

    /* access modifiers changed from: private */
    public final void renderUiState(DeliveryServiceSelection.UiState uiState) {
        hideLoading();
        if (uiState instanceof DeliveryServiceSelection.UiState.AvailableServices) {
            ServiceInfoAdapter serviceInfoAdapter = this.adapter;
            Iterable<DeliveryService> services = ((DeliveryServiceSelection.UiState.AvailableServices) uiState).getServices();
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(services, 10));
            for (DeliveryService serviceInfoUiModel : services) {
                arrayList.add(toServiceInfoUiModel(serviceInfoUiModel));
            }
            serviceInfoAdapter.setList(arrayList);
            setBottomButtonsVisibility(true);
        } else if (Intrinsics.areEqual((Object) uiState, (Object) DeliveryServiceSelection.UiState.AwaitingAddressValidation.INSTANCE)) {
            if (!this.hasNavigatedToAddressInput) {
                getViewModel().sendIntent(new DeliveryServiceSelection.UserAction.ChangeAddress(getArgs().getDeliveryType(), new DeliveryServiceSelectionFragment$renderUiState$2(this, C19736g.m91827a(this))));
                this.hasNavigatedToAddressInput = true;
            }
        } else if (Intrinsics.areEqual((Object) uiState, (Object) DeliveryServiceSelection.UiState.Loading.INSTANCE)) {
            showLoading();
            setBottomButtonsVisibility(false);
        }
    }

    private final void setBottomButtonsVisibility(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        ((FragmentDeliveryServiceSelectionBinding) getBinding()).changeAddressButton.setVisibility(i);
        ((FragmentDeliveryServiceSelectionBinding) getBinding()).moveToDriveButton.setVisibility(i);
    }

    private final void showError() {
        Drawable i = C17318d.m79726i(requireContext(), C28330R.C28332drawable.ic_erreur_reseau);
        String string = getString(C28330R.string.general_error_parameters_server_not_responding_01);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…server_not_responding_01)");
        C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i, string, (String) null, (String) null, (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), (C11289a) null, (C11289a) null, (C11289a) null, 14, (Object) null);
        C28500r.C28501a.m118423e(this, false, 1, (Object) null);
    }

    private final ServiceInfoComponent.UiModel toServiceInfoUiModel(DeliveryService deliveryService) {
        C37130b.C37131a aVar = null;
        if (deliveryService instanceof ClcvService) {
            ServiceInfoComponent.UiModel.Companion companion = ServiceInfoComponent.UiModel.f93171c;
            ClcvService clcvService = (ClcvService) deliveryService;
            ServiceInfoComponent.UiModel.Availability a = ServiceInfoComponent.UiModel.Availability.f93175a.mo113087a(clcvService.isAvailable());
            SpannableString detailsText = getDetailsText(clcvService);
            if (detailsText != null) {
                aVar = new C37130b.C37131a(detailsText);
            }
            return companion.mo113088a(a, aVar, new DeliveryServiceSelectionFragment$toServiceInfoUiModel$2(this, deliveryService));
        } else if (deliveryService instanceof H1h3Service) {
            ServiceInfoComponent.UiModel.Companion companion2 = ServiceInfoComponent.UiModel.f93171c;
            H1h3Service h1h3Service = (H1h3Service) deliveryService;
            ServiceInfoComponent.UiModel.Availability a2 = ServiceInfoComponent.UiModel.Availability.f93175a.mo113087a(h1h3Service.isAvailable());
            SpannableString detailsText2 = getDetailsText(h1h3Service);
            if (detailsText2 != null) {
                aVar = new C37130b.C37131a(detailsText2);
            }
            return companion2.mo113089b(a2, aVar, new DeliveryServiceSelectionFragment$toServiceInfoUiModel$4(this, deliveryService));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((FragmentDeliveryServiceSelectionBinding) getBinding()).stubDeliveryServiceSelectionError;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubDeliveryServiceSelectionError");
        return viewStub;
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
    public final C28796c getNavigator() {
        C28796c cVar = this.navigator;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((FragmentDeliveryServiceSelectionBinding) getBinding()).loadingLayout;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.loadingLayout");
        return shimmerFrameLayout;
    }

    public void onResume() {
        super.onResume();
        getViewModel().getAnalytics().sendScreenView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        initHeader();
        ((FragmentDeliveryServiceSelectionBinding) getBinding()).serviceInfoList.setAdapter(this.adapter);
        ((FragmentDeliveryServiceSelectionBinding) getBinding()).serviceInfoList.setLayoutManager(new LinearLayoutManager(requireContext()));
        Resources resources = getResources();
        int i = C28330R.dimen.ds_spacing_s;
        resources.getDimension(i);
        ((FragmentDeliveryServiceSelectionBinding) getBinding()).serviceInfoList.mo59589n(new C37094b(1, getResources().getDimensionPixelSize(i), true));
        ((FragmentDeliveryServiceSelectionBinding) getBinding()).changeAddressButton.setOnClickListener(new C28385a(this));
        ((FragmentDeliveryServiceSelectionBinding) getBinding()).moveToDriveButton.setOnClickListener(new C28386b(this));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new DeliveryServiceSelectionFragment$onViewCreated$3(this, (C11045c<? super DeliveryServiceSelectionFragment$onViewCreated$3>) null), 3, (Object) null);
        DeliveryServiceSelectionViewModel viewModel = getViewModel();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C28362xeedb6e03(this, viewModel, (C11045c) null, this), 3, (Object) null);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.fragmentUtil = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.navigator = cVar;
    }

    private final SpannableString getDetailsText(H1h3Service h1h3Service) {
        if (!h1h3Service.isAvailable()) {
            return null;
        }
        C11368t0 t0Var = C11368t0.f28504a;
        String string = getString(C28330R.string.delivery_service_h1h3_details_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.deliv…ervice_h1h3_details_text)");
        String format = String.format(string, Arrays.copyOf(new Object[]{C28782t.m119105b(Double.valueOf(h1h3Service.getMinOrderAmount())), C28782t.m119105b(Double.valueOf(h1h3Service.getDeliveryCost()))}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return new SpannableString(Html.fromHtml(format, 63));
    }
}
