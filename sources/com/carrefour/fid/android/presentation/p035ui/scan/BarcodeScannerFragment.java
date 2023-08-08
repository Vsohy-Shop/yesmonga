package com.carrefour.fid.android.presentation.p035ui.scan;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19259o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.core.type.SearchType;
import com.carrefour.fid.android.databinding.C36799q0;
import com.carrefour.fid.android.design.components.widgets.C37185a;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27264a;
import com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel;
import com.carrefour.fid.android.presentation.viewmodels.scan.C27400d;
import com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a;
import com.carrefour.fid.android.scan.core.constants.C28255a;
import com.carrefour.fid.android.scan.core.constants.ScanType;
import com.carrefour.fid.android.scan.presentation.p042ui.ScannerFragment;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.carrefour.fid.android.shared.p046io.ProductDetailsThrowable;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bB\u0010CJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u0014\u0010\u001b\u001a\u00020\u00072\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002R\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006D"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/scan/BarcodeScannerFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/q0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "initHeader", "Lcom/carrefour/fid/android/presentation/viewmodels/scan/mvi/a$b;", "uiState", "d1", "Lcom/carrefour/fid/android/presentation/viewmodels/scan/mvi/a$a;", "event", "b1", "", "barcodeResult", "Y0", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offerProductModel", "a1", "", "exception", "Z0", "Lcom/carrefour/fid/android/design/components/widgets/a;", "backDrop", "h1", "Lcom/carrefour/fid/android/presentation/viewmodels/scan/BarcodeScannerViewModel;", "f", "Lkotlin/z;", "X0", "()Lcom/carrefour/fid/android/presentation/viewmodels/scan/BarcodeScannerViewModel;", "viewModel", "Lcom/carrefour/fid/android/shared/navigation/c;", "g", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;", "v", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;", "V0", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;", "f1", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;)V", "productSearchAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/scan/d;", "w", "Lcom/carrefour/fid/android/presentation/viewmodels/scan/d;", "W0", "()Lcom/carrefour/fid/android/presentation/viewmodels/scan/d;", "g1", "(Lcom/carrefour/fid/android/presentation/viewmodels/scan/d;)V", "scanBarCodeAnalyticsViewModel", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "x", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "U0", "()Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "e1", "(Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;)V", "appPreferencesStorage", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBarcodeScannerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeScannerFragment.kt\ncom/carrefour/fid/android/presentation/ui/scan/BarcodeScannerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,175:1\n106#2,15:176\n168#3,7:191\n183#3,6:198\n*S KotlinDebug\n*F\n+ 1 BarcodeScannerFragment.kt\ncom/carrefour/fid/android/presentation/ui/scan/BarcodeScannerFragment\n*L\n46#1:176,15\n78#1:191,7\n79#1:198,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.scan.BarcodeScannerFragment */
public final class BarcodeScannerFragment extends C25716f<C36799q0> {

    /* renamed from: y */
    public static final int f62984y = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f62985f;
    @Inject

    /* renamed from: g */
    public C28796c f62986g;
    @Inject

    /* renamed from: v */
    public C27264a f62987v;
    @Inject

    /* renamed from: w */
    public C27400d f62988w;
    @Inject

    /* renamed from: x */
    public AppPreferencesStorage f62989x;

    /* renamed from: com.carrefour.fid.android.presentation.ui.scan.BarcodeScannerFragment$a */
    public /* synthetic */ class C25691a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.carrefour.fid.android.domain.models.offer.OfferAvailability[] r0 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.offer.OfferAvailability r1 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.offer.OfferAvailability r1 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.NOT_IN_STORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.offer.OfferAvailability r1 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.offer.OfferAvailability r1 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.scan.BarcodeScannerFragment.C25691a.<clinit>():void");
        }
    }

    public BarcodeScannerFragment() {
        super(C256901.f62990a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new BarcodeScannerFragment$special$$inlined$viewModels$default$2(new BarcodeScannerFragment$special$$inlined$viewModels$default$1(this)));
        this.f62985f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(BarcodeScannerViewModel.class), new BarcodeScannerFragment$special$$inlined$viewModels$default$3(b), new BarcodeScannerFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new BarcodeScannerFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: c1 */
    public static final void m110366c1(BarcodeScannerFragment barcodeScannerFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(barcodeScannerFragment, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        barcodeScannerFragment.mo74639Y0(String.valueOf(bundle.getString(C28255a.f68403c)));
        C19259o.m90348c(barcodeScannerFragment, C28255a.f68402b);
    }

    @C12579k
    /* renamed from: U0 */
    public final AppPreferencesStorage mo74635U0() {
        AppPreferencesStorage appPreferencesStorage = this.f62989x;
        if (appPreferencesStorage != null) {
            return appPreferencesStorage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appPreferencesStorage");
        return null;
    }

    @C12579k
    /* renamed from: V0 */
    public final C27264a mo74636V0() {
        C27264a aVar = this.f62987v;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productSearchAnalyticsViewModel");
        return null;
    }

    @C12579k
    /* renamed from: W0 */
    public final C27400d mo74637W0() {
        C27400d dVar = this.f62988w;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scanBarCodeAnalyticsViewModel");
        return null;
    }

    /* renamed from: X0 */
    public final BarcodeScannerViewModel mo74638X0() {
        return (BarcodeScannerViewModel) this.f62985f.getValue();
    }

    /* renamed from: Y0 */
    public final void mo74639Y0(String str) {
        mo74638X0().sendIntent(new C27402a.C27413c.C27414a(str));
    }

    /* renamed from: Z0 */
    public final void mo74640Z0(Throwable th) {
        if (th instanceof NetworkException) {
            mo74637W0().mo79696c();
            C19232h activity = getActivity();
            if (activity != null) {
                NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
                String string = getString(R.string.general_error_no_network_message);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…error_no_network_message)");
                ActivityKt.m118716z(activity, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                return;
            }
            return;
        }
        C19232h activity2 = getActivity();
        if (activity2 != null) {
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string2 = getString(R.string.general_error_parameters_server_not_responding_02);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gener…server_not_responding_02)");
            ActivityKt.m118716z(activity2, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: a1 */
    public final void mo74641a1(OfferProductModel offerProductModel) {
        int i = C25691a.$EnumSwitchMapping$0[offerProductModel.mo121509g().ordinal()];
        if (i == 1 || i == 2) {
            mo74636V0().mo79294b(SearchType.EVENT_SEARCH_SCAN);
            mo74637W0().mo79697d();
            mo74638X0().sendIntent(new C27402a.C27413c.C27416c(offerProductModel));
        } else if (i == 3 || i == 4) {
            mo74640Z0(new ProductDetailsThrowable((String) null, 1, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: b1 */
    public final void mo74642b1(C27402a.C27403a aVar) {
        if (aVar instanceof C27402a.C27403a.C27404a) {
            mo74640Z0(((C27402a.C27403a.C27404a) aVar).mo79701d());
        } else if (aVar instanceof C27402a.C27403a.C27406c) {
            mo74641a1(((C27402a.C27403a.C27406c) aVar).mo79715d());
        } else if (aVar instanceof C27402a.C27403a.C27405b) {
            C27402a.C27403a.C27405b bVar = (C27402a.C27403a.C27405b) aVar;
            getNavigator().mo83838n(C19736g.m91827a(this), OfferProductModelKt.m159574W(bVar.mo79710f()), bVar.mo79708e());
        }
    }

    /* renamed from: d1 */
    public final void mo74643d1(C27402a.C27407b bVar) {
        if (Intrinsics.areEqual((Object) bVar, (Object) C27402a.C27407b.C27410c.f66493b)) {
            mo74648h1(new ScanOnBoardingFragment());
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C27402a.C27407b.C27411d.f66495b)) {
            mo74637W0().mo79695b();
            mo74648h1(new ScanErrorBottomSheetDialogFragment());
        }
    }

    /* renamed from: e1 */
    public final void mo74644e1(@C12579k AppPreferencesStorage appPreferencesStorage) {
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "<set-?>");
        this.f62989x = appPreferencesStorage;
    }

    /* renamed from: f1 */
    public final void mo74645f1(@C12579k C27264a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f62987v = aVar;
    }

    /* renamed from: g1 */
    public final void mo74646g1(@C12579k C27400d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f62988w = dVar;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f62986g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final void mo74648h1(C37185a<?> aVar) {
        aVar.show(requireActivity().mo57175g0(), (String) null);
        FragmentKt.m118835w(this, (String) null, new BarcodeScannerFragment$showBackdrop$1(this), 1, (Object) null);
    }

    public final void initHeader() {
        FragmentExtensionKt.m58757h(this);
        ((C36799q0) getBinding()).f91517b.setContent(C8553b.m31049c(710341952, true, new BarcodeScannerFragment$initHeader$1(this)));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        initHeader();
        mo74637W0().mo79694a();
        getChildFragmentManager().mo56909u().mo57201C(((C36799q0) getBinding()).f91519d.getId(), ScannerFragment.f68459v.mo82270a(ScanType.PRODUCT)).mo57052q();
        getChildFragmentManager().mo56861b(C28255a.f68402b, getViewLifecycleOwner(), new C25708a(this));
        BarcodeScannerViewModel X0 = mo74638X0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new BarcodeScannerFragment$onViewCreated$$inlined$processState$1(this, X0, (C11045c) null, this), 3, (Object) null);
        BarcodeScannerViewModel X02 = mo74638X0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new BarcodeScannerFragment$onViewCreated$$inlined$processEvent$1(this, X02, (C11045c) null, this), 3, (Object) null);
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f62986g = cVar;
    }
}
