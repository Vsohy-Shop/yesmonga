package com.carrefour.fid.android.service.presentation.p044ui.selection;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.res.C17465i;
import com.carrefour.fid.android.design.components.extension.C37113e;
import com.carrefour.fid.android.design.components.widgets.StoreSetComponent;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.databinding.FragmentServiceSelectionBackdropBinding;
import com.carrefour.fid.android.service.presentation.analytics.selection.ServiceSelectionBackdropAnalyticsReporter;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0005H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/selection/ServiceSelectionBackDropFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/service/databinding/FragmentServiceSelectionBackdropBinding;", "Lkotlin/d2;", "initUi", "Lcom/carrefour/fid/android/design/components/widgets/StoreSetComponent;", "setRipple", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lcom/carrefour/fid/android/shared/navigation/c;", "navigator", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "Lcom/carrefour/fid/android/service/presentation/analytics/selection/ServiceSelectionBackdropAnalyticsReporter;", "analytics", "Lcom/carrefour/fid/android/service/presentation/analytics/selection/ServiceSelectionBackdropAnalyticsReporter;", "getAnalytics$service_release", "()Lcom/carrefour/fid/android/service/presentation/analytics/selection/ServiceSelectionBackdropAnalyticsReporter;", "setAnalytics$service_release", "(Lcom/carrefour/fid/android/service/presentation/analytics/selection/ServiceSelectionBackdropAnalyticsReporter;)V", "<init>", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.selection.ServiceSelectionBackDropFragment */
public final class ServiceSelectionBackDropFragment extends Hilt_ServiceSelectionBackDropFragment<FragmentServiceSelectionBackdropBinding> {
    public static final int $stable = 8;
    @Inject
    public ServiceSelectionBackdropAnalyticsReporter analytics;
    @Inject
    public C28796c navigator;

    public ServiceSelectionBackDropFragment() {
        super(C284301.INSTANCE, C284312.INSTANCE, true);
    }

    private final void initUi() {
        StoreSetComponent storeSetComponent = ((FragmentServiceSelectionBackdropBinding) getBinding()).serviceSelectionDriveButton;
        int i = C28330R.string.service_selection_drive_button;
        String string = getString(i);
        String string2 = getString(C28330R.string.service_selection_drive_description);
        StoreSetComponent.StoreSetErrorType storeSetErrorType = StoreSetComponent.StoreSetErrorType.NOTHING;
        String string3 = getString(i);
        int i2 = C28330R.C28331color.ds_grey_5;
        int i3 = C28330R.C28332drawable.ds_il_drive_active;
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.service_selection_drive_button)");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.service_selection_drive_button)");
        StoreSetComponent.C37179a aVar = r3;
        StoreSetComponent.C37179a aVar2 = new StoreSetComponent.C37179a(string, string2, false, storeSetErrorType, false, string3, (String) null, new ServiceSelectionBackDropFragment$initUi$1(this), i2, ServiceSelectionBackDropFragment$initUi$2.INSTANCE, Integer.valueOf(i3), 64, (DefaultConstructorMarker) null);
        storeSetComponent.mo113183C(aVar);
        StoreSetComponent storeSetComponent2 = ((FragmentServiceSelectionBackdropBinding) getBinding()).serviceSelectionDeliveryButton;
        String string4 = getString(C28330R.string.service_selection_delivery_button);
        String string5 = getString(C28330R.string.service_selection_delivery_description);
        String string6 = getString(i);
        int i4 = C28330R.C28332drawable.ds_il_delivery_active;
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.servi…election_delivery_button)");
        String str = "getString(R.string.service_selection_drive_button)";
        Intrinsics.checkNotNullExpressionValue(string6, str);
        StoreSetComponent.StoreSetErrorType storeSetErrorType2 = storeSetErrorType;
        int i5 = i2;
        storeSetComponent2.mo113183C(new StoreSetComponent.C37179a(string4, string5, false, storeSetErrorType2, false, string6, (String) null, new ServiceSelectionBackDropFragment$initUi$3(this), i5, ServiceSelectionBackDropFragment$initUi$4.INSTANCE, Integer.valueOf(i4), 64, (DefaultConstructorMarker) null));
        StoreSetComponent storeSetComponent3 = ((FragmentServiceSelectionBackdropBinding) getBinding()).serviceSelectionDeliveryH1h3Button;
        String string7 = getString(C28330R.string.service_selection_delivery_h1h3_button);
        String string8 = getString(C28330R.string.service_selection_delivery_h1h3_description);
        String string9 = getString(i);
        int i6 = C28330R.C28332drawable.ds_il_delivery_h1h3_active;
        Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.servi…ion_delivery_h1h3_button)");
        Intrinsics.checkNotNullExpressionValue(string9, str);
        storeSetComponent3.mo113183C(new StoreSetComponent.C37179a(string7, string8, false, storeSetErrorType2, false, string9, (String) null, new ServiceSelectionBackDropFragment$initUi$5(this), i5, ServiceSelectionBackDropFragment$initUi$6.INSTANCE, Integer.valueOf(i6), 64, (DefaultConstructorMarker) null));
        StoreSetComponent storeSetComponent4 = ((FragmentServiceSelectionBackdropBinding) getBinding()).serviceSelectionDriveButton;
        Intrinsics.checkNotNullExpressionValue(storeSetComponent4, "binding.serviceSelectionDriveButton");
        setRipple(storeSetComponent4);
        StoreSetComponent storeSetComponent5 = ((FragmentServiceSelectionBackdropBinding) getBinding()).serviceSelectionDeliveryButton;
        Intrinsics.checkNotNullExpressionValue(storeSetComponent5, "binding.serviceSelectionDeliveryButton");
        setRipple(storeSetComponent5);
        StoreSetComponent storeSetComponent6 = ((FragmentServiceSelectionBackdropBinding) getBinding()).serviceSelectionDeliveryH1h3Button;
        Intrinsics.checkNotNullExpressionValue(storeSetComponent6, "binding.serviceSelectionDeliveryH1h3Button");
        setRipple(storeSetComponent6);
    }

    private final void setRipple(StoreSetComponent storeSetComponent) {
        Resources.Theme theme;
        Resources resources = storeSetComponent.getResources();
        int i = C28330R.C28331color.ds_primary;
        Context context = storeSetComponent.getContext();
        Resources.Theme theme2 = null;
        if (context != null) {
            theme = context.getTheme();
        } else {
            theme = null;
        }
        int color = resources.getColor(i, theme);
        Resources resources2 = storeSetComponent.getResources();
        int i2 = C28330R.C28332drawable.background_standard_pickers_service_selection;
        Context context2 = storeSetComponent.getContext();
        if (context2 != null) {
            theme2 = context2.getTheme();
        }
        storeSetComponent.setBackground(C37113e.m152155b(C17465i.m80175g(resources2, i2, theme2), color));
    }

    @C12579k
    public final ServiceSelectionBackdropAnalyticsReporter getAnalytics$service_release() {
        ServiceSelectionBackdropAnalyticsReporter serviceSelectionBackdropAnalyticsReporter = this.analytics;
        if (serviceSelectionBackdropAnalyticsReporter != null) {
            return serviceSelectionBackdropAnalyticsReporter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
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

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        getAnalytics$service_release().sendScreenView();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        initUi();
    }

    public final void setAnalytics$service_release(@C12579k ServiceSelectionBackdropAnalyticsReporter serviceSelectionBackdropAnalyticsReporter) {
        Intrinsics.checkNotNullParameter(serviceSelectionBackdropAnalyticsReporter, "<set-?>");
        this.analytics = serviceSelectionBackdropAnalyticsReporter;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.navigator = cVar;
    }
}
