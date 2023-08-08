package com.carrefour.fid.android.storelocator.p048ui.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0302g;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.view.C18124b2;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C19501x;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.navigation.C19761k0;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.C14065q0;
import com.carrefour.fid.android.OneAppApplication;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36832t3;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import com.carrefour.fid.android.domain.models.service.models.StoreCoordinates;
import com.carrefour.fid.android.ecommerce.utils.C38215e;
import com.carrefour.fid.android.shared.base.C28494o;
import com.carrefour.fid.android.shared.constant.C28513a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.shared.util.C28944n;
import com.carrefour.fid.android.shared.util.ImageUtils;
import com.carrefour.fid.android.storelocator.p048ui.contracts.C28968a;
import com.carrefour.fid.android.storelocator.presentation.contracts.C28961c;
import com.carrefour.fid.android.storelocator.presentation.presenters.FacilitiesSearchPresenter;
import com.carrefour.fid.android.utils.C22712k;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.C30327e;
import com.google.android.gms.location.C30382s;
import com.google.android.gms.maps.C30409b;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.C30447f;
import com.google.android.gms.maps.C30450g;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.C30573a;
import com.google.android.gms.maps.model.C30587h;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\bn\u0010oJ\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\tH\u0002J&\u0010\u0014\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020\tH\u0016J\b\u0010'\u001a\u00020\tH\u0016J\u0010\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H\u0016J\u0010\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0015H\u0017J\u0010\u00100\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u00102\u001a\u00020\t2\u0006\u0010.\u001a\u000201H\u0016J\u0010\u00105\u001a\u00020\t2\u0006\u00104\u001a\u000203H\u0016J\b\u00106\u001a\u00020\tH\u0016J\u0016\u00109\u001a\u00020\t2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001007H\u0016J\b\u0010:\u001a\u00020\tH\u0016J\u0018\u0010>\u001a\u00020\t2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u0012H\u0016J\u0014\u0010B\u001a\u00020\t2\n\u0010A\u001a\u00060?j\u0002`@H\u0016J\b\u0010C\u001a\u00020\tH\u0016J\b\u0010D\u001a\u00020\u0012H\u0016J\u0006\u0010E\u001a\u00020\tR\u001b\u0010K\u001a\u00020F8BX\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010f\u001a\u00020c8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020;0g8\u0002X\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020;078\u0002X\u0004¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006p"}, mo22516d2 = {"Lcom/carrefour/fid/android/storelocator/ui/fragments/FacilitiesSearchFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/t3;", "Lcom/carrefour/fid/android/storelocator/ui/contracts/a;", "Lcom/google/android/gms/maps/g;", "Lcom/google/android/gms/maps/f;", "Lcom/google/android/gms/maps/c$q;", "Lcom/google/android/gms/maps/c$g;", "Lcom/google/android/gms/maps/c$d;", "Lkotlin/d2;", "initHeader", "initListeners", "a1", "initGoogleMap", "Lcom/google/android/gms/maps/model/h;", "marker", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "", "isZoomedSize", "U0", "Landroid/location/Location;", "lastLocation", "W0", "Y0", "()Lkotlin/d2;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "onStart", "onPause", "onDestroyView", "Lcom/google/android/gms/maps/MapsInitializer$Renderer;", "renderer", "onMapsSdkInitialized", "Lcom/google/android/gms/maps/c;", "map", "onMapReady", "location", "q", "p0", "Lcom/google/android/gms/maps/model/LatLngBounds;", "A0", "", "reason", "onCameraMoveStarted", "onCameraIdle", "", "storeList", "z0", "a0", "", "message", "isError", "A", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "O", "s", "M", "H", "Lcom/carrefour/fid/android/q0;", "a", "Landroidx/navigation/m;", "X0", "()Lcom/carrefour/fid/android/q0;", "args", "Lcom/carrefour/fid/android/storelocator/ui/fragments/StoreFacilitiesBottomSheetFragment;", "b", "Lcom/carrefour/fid/android/storelocator/ui/fragments/StoreFacilitiesBottomSheetFragment;", "bottomSheetFragment", "c", "Lcom/google/android/gms/maps/c;", "mapView", "Lcom/google/android/gms/maps/SupportMapFragment;", "d", "Lcom/google/android/gms/maps/SupportMapFragment;", "mapFragment", "e", "I", "cameraMoveStartedReason", "f", "Lcom/google/android/gms/maps/model/h;", "lastMarker", "g", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "lastStore", "v", "Landroid/location/Location;", "lastPositionUser", "Lcom/carrefour/fid/android/storelocator/presentation/contracts/c;", "w", "Lcom/carrefour/fid/android/storelocator/presentation/contracts/c;", "facilitiesPresenter", "Landroidx/activity/result/g;", "x", "Landroidx/activity/result/g;", "requestPermission", "y", "Ljava/util/List;", "listAcceptedBanner", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nFacilitiesSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacilitiesSearchFragment.kt\ncom/carrefour/fid/android/storelocator/ui/fragments/FacilitiesSearchFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,364:1\n42#2,3:365\n766#3:368\n857#3:369\n1747#3,3:370\n858#3:373\n*S KotlinDebug\n*F\n+ 1 FacilitiesSearchFragment.kt\ncom/carrefour/fid/android/storelocator/ui/fragments/FacilitiesSearchFragment\n*L\n70#1:365,3\n216#1:368\n216#1:369\n216#1:370,3\n216#1:373\n*E\n"})
/* renamed from: com.carrefour.fid.android.storelocator.ui.fragments.FacilitiesSearchFragment */
public final class FacilitiesSearchFragment extends C28494o<C36832t3> implements C28968a, C30450g, C30447f, C30412c.C30429q, C30412c.C30419g, C30412c.C30416d {

    /* renamed from: z */
    public static final int f71042z = 8;
    @C12579k

    /* renamed from: a */
    public final C19766m f71043a = new C19766m(C11342l0.m43547d(C14065q0.class), new FacilitiesSearchFragment$special$$inlined$navArgs$1(this));
    @C12580l

    /* renamed from: b */
    public StoreFacilitiesBottomSheetFragment f71044b;
    @C12580l

    /* renamed from: c */
    public C30412c f71045c;
    @C12580l

    /* renamed from: d */
    public SupportMapFragment f71046d;

    /* renamed from: e */
    public int f71047e;
    @C12580l

    /* renamed from: f */
    public C30587h f71048f;
    @C12580l

    /* renamed from: g */
    public C38163l f71049g;
    @C12580l

    /* renamed from: v */
    public Location f71050v;

    /* renamed from: w */
    public C28961c f71051w;
    @C12579k

    /* renamed from: x */
    public final C0302g<String> f71052x = FragmentKt.m118833u(this, new FacilitiesSearchFragment$requestPermission$1(this), FacilitiesSearchFragment$requestPermission$2.f71055f);
    @C12579k

    /* renamed from: y */
    public final List<String> f71053y = CollectionsKt__CollectionsKt.m40448L(C28513a.f68671i, "carrefour city", "carrefour express", "bon app", "carrefour market", C28526d.f68995y1, "carrefour contact", "carrefour contact marche", C38215e.f96826c, "carrefour montagne");

    /* renamed from: com.carrefour.fid.android.storelocator.ui.fragments.FacilitiesSearchFragment$a */
    public /* synthetic */ class C28975a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.google.android.gms.maps.MapsInitializer$Renderer[] r0 = com.google.android.gms.maps.MapsInitializer.Renderer.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.android.gms.maps.MapsInitializer$Renderer r1 = com.google.android.gms.maps.MapsInitializer.Renderer.LATEST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.google.android.gms.maps.MapsInitializer$Renderer r1 = com.google.android.gms.maps.MapsInitializer.Renderer.LEGACY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.storelocator.p048ui.fragments.FacilitiesSearchFragment.C28975a.<clinit>():void");
        }
    }

    public FacilitiesSearchFragment() {
        super(C289741.f71054a);
    }

    /* renamed from: S0 */
    public static final /* synthetic */ C36832t3 m119882S0(FacilitiesSearchFragment facilitiesSearchFragment) {
        return (C36832t3) facilitiesSearchFragment.getBinding();
    }

    /* renamed from: V0 */
    public static /* synthetic */ void m119884V0(FacilitiesSearchFragment facilitiesSearchFragment, C30587h hVar, C38163l lVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        facilitiesSearchFragment.mo84379U0(hVar, lVar, z);
    }

    /* renamed from: Z0 */
    public static final void m119885Z0(FacilitiesSearchFragment facilitiesSearchFragment, View view) {
        Intrinsics.checkNotNullParameter(facilitiesSearchFragment, "this$0");
        C28961c cVar = facilitiesSearchFragment.f71051w;
        C28961c cVar2 = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("facilitiesPresenter");
            cVar = null;
        }
        cVar.mo84307k(false);
        facilitiesSearchFragment.f71052x.mo960b("android.permission.ACCESS_FINE_LOCATION");
        C28961c cVar3 = facilitiesSearchFragment.f71051w;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("facilitiesPresenter");
        } else {
            cVar2 = cVar3;
        }
        cVar2.mo84304h();
    }

    /* renamed from: b1 */
    public static final void m119886b1(FacilitiesSearchFragment facilitiesSearchFragment, LatLng latLng) {
        Intrinsics.checkNotNullParameter(facilitiesSearchFragment, "this$0");
        Intrinsics.checkNotNullParameter(latLng, "it");
        View view = facilitiesSearchFragment.getView();
        if (view != null) {
            ViewKt.m119012y(view);
        }
        facilitiesSearchFragment.mo84379U0(facilitiesSearchFragment.f71048f, facilitiesSearchFragment.f71049g, false);
        facilitiesSearchFragment.mo84382Y0();
    }

    /* renamed from: A */
    public void mo84345A(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "message");
        if (z) {
            FragmentKt.m118811B(this, NotificationComponent.Variant.ERROR, str, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            return;
        }
        FragmentKt.m118811B(this, NotificationComponent.Variant.WARNING, str, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    /* renamed from: A0 */
    public void mo84346A0(@C12579k LatLngBounds latLngBounds) {
        Intrinsics.checkNotNullParameter(latLngBounds, "location");
        C30412c cVar = this.f71045c;
        if (cVar != null) {
            cVar.mo85908g(C30409b.m122331c(latLngBounds, 100));
        }
    }

    /* renamed from: H */
    public final void mo84378H() {
        NotificationComponent.Variant variant = NotificationComponent.Variant.SUCCESS;
        String string = getString(R.string.facilities_store_added);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.facilities_store_added)");
        FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        C19736g.m91827a(this).mo58132X(mo84381X0().mo34329e(), (Bundle) null, C19761k0.C19762a.m91893k(new C19761k0.C19762a(), mo84381X0().mo34329e(), true, false, 4, (Object) null).mo58463a());
    }

    /* renamed from: M */
    public boolean mo84347M() {
        StoreFacilitiesBottomSheetFragment storeFacilitiesBottomSheetFragment = this.f71044b;
        if (storeFacilitiesBottomSheetFragment != null) {
            return storeFacilitiesBottomSheetFragment.mo84399Z0();
        }
        return true;
    }

    /* renamed from: O */
    public void mo84348O(@C12579k Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "exception");
        if (exc instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exc).mo133639e(requireActivity(), 1);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    /* renamed from: U0 */
    public final void mo84379U0(C30587h hVar, C38163l lVar, boolean z) {
        C30573a aVar;
        if (hVar != null && lVar != null) {
            if (z) {
                try {
                    aVar = ImageUtils.f70796a.mo84111q(OneAppApplication.f32244w.mo30856a(), C28855a.f70682a.mo83977d(lVar.mo119394x()));
                } catch (IllegalArgumentException e) {
                    C28935i.m119705e(C28935i.f70940a, "marker setIcon unmanaged", e, 0, 4, (Object) null);
                    return;
                }
            } else {
                aVar = ImageUtils.f70796a.mo84112r(OneAppApplication.f32244w.mo30856a(), C28855a.f70682a.mo83977d(lVar.mo119394x()));
            }
            hVar.mo86575s(aVar);
        }
    }

    /* renamed from: W0 */
    public final void mo84380W0(Location location, C38163l lVar) {
        C11079d2 d2Var;
        StoreFacilitiesBottomSheetFragment storeFacilitiesBottomSheetFragment = this.f71044b;
        if (storeFacilitiesBottomSheetFragment != null) {
            storeFacilitiesBottomSheetFragment.mo84357g0(lVar, location);
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            StoreFacilitiesBottomSheetFragment b = StoreFacilitiesBottomSheetFragment.f71060z.mo84406b(location);
            b.mo84402c1(lVar);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            C13825a.m58779h(childFragmentManager, b, R.id.bottom_sheet_container, false, (String) null, 0, 0, false, 0, 0, C18124b2.f46739r, (Object) null);
            this.f71044b = b;
        }
    }

    /* renamed from: X0 */
    public final C14065q0 mo84381X0() {
        return (C14065q0) this.f71043a.getValue();
    }

    /* renamed from: Y0 */
    public final C11079d2 mo84382Y0() {
        StoreFacilitiesBottomSheetFragment storeFacilitiesBottomSheetFragment = this.f71044b;
        if (storeFacilitiesBottomSheetFragment == null) {
            return null;
        }
        storeFacilitiesBottomSheetFragment.mo84393Q0();
        return C11079d2.f28267a;
    }

    /* renamed from: a0 */
    public void mo84349a0() {
        C30412c cVar = this.f71045c;
        if (cVar != null) {
            cVar.mo85914j();
        }
    }

    /* renamed from: a1 */
    public final void mo84383a1() {
        Object obj;
        C19232h activity = getActivity();
        if (activity != null) {
            obj = activity.getSystemService("location");
        } else {
            obj = null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) obj;
        LifecycleCoroutineScope a = C19501x.m90847a(this);
        Context context = getContext();
        if (context == null) {
            context = OneAppApplication.f32244w.mo30856a();
        }
        Context context2 = context;
        Intrinsics.checkNotNullExpressionValue(context2, "context\n                …eAppApplication.sInstance");
        this.f71051w = new FacilitiesSearchPresenter(this, a, locationManager, context2, (C13783a) null, (C30327e) null, (C30382s) null, 112, (DefaultConstructorMarker) null);
    }

    public final void initGoogleMap() {
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().mo56900r0(R.id.map);
        this.f71046d = supportMapFragment;
        if (supportMapFragment != null) {
            supportMapFragment.mo85862I0(this);
        }
    }

    public final void initHeader() {
        FragmentExtensionKt.m58757h(this);
        ((C36832t3) getBinding()).f91674c.setContent(C8553b.m31049c(-248100461, true, new FacilitiesSearchFragment$initHeader$1(this)));
    }

    public final void initListeners() {
        ((C36832t3) getBinding()).f91675d.setOnClickListener(new C28985d(this));
    }

    public void onCameraIdle() {
        C30412c cVar = this.f71045c;
        if (cVar != null && this.f71047e == 1) {
            C28961c cVar2 = this.f71051w;
            C28961c cVar3 = null;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("facilitiesPresenter");
                cVar2 = null;
            }
            cVar2.mo84307k(true);
            C28961c cVar4 = this.f71051w;
            if (cVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("facilitiesPresenter");
            } else {
                cVar3 = cVar4;
            }
            cVar3.mo84308l(cVar.mo85916k().f72990a);
        }
    }

    public void onCameraMoveStarted(int i) {
        this.f71047e = i;
        mo84379U0(this.f71048f, this.f71049g, false);
        this.f71048f = null;
        this.f71049g = null;
        mo84382Y0();
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        MapsInitializer.m122290b(requireContext().getApplicationContext(), MapsInitializer.Renderer.LATEST, this);
    }

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        mo84383a1();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroyView() {
        super.onDestroyView();
        C28961c cVar = this.f71051w;
        C28961c cVar2 = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("facilitiesPresenter");
            cVar = null;
        }
        cVar.mo84306j();
        C28961c cVar3 = this.f71051w;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("facilitiesPresenter");
        } else {
            cVar2 = cVar3;
        }
        cVar2.mo84299c();
    }

    public void onMapReady(@C12579k C30412c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "map");
        this.f71045c = cVar;
        cVar.mo85893X(this);
        cVar.mo85883N(this);
        cVar.mo85880K(this);
        cVar.mo85890U(new C28984c(this));
        cVar.mo85928w(C30409b.m122333e(C22712k.C22713a.f58204a.mo67131a(), 5.0f));
    }

    public void onMapsSdkInitialized(@C12579k MapsInitializer.Renderer renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        int i = C28975a.$EnumSwitchMapping$0[renderer.ordinal()];
    }

    public void onPause() {
        super.onPause();
        C28961c cVar = this.f71051w;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("facilitiesPresenter");
            cVar = null;
        }
        cVar.mo84299c();
    }

    public void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        if (C28944n.m119740c(requireContext)) {
            C28961c cVar = this.f71051w;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("facilitiesPresenter");
                cVar = null;
            }
            cVar.mo84309m();
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C28961c cVar = this.f71051w;
        C28961c cVar2 = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("facilitiesPresenter");
            cVar = null;
        }
        cVar.sendScreenView();
        initHeader();
        initGoogleMap();
        initListeners();
        this.f71052x.mo960b("android.permission.ACCESS_FINE_LOCATION");
        C28961c cVar3 = this.f71051w;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("facilitiesPresenter");
        } else {
            cVar2 = cVar3;
        }
        cVar2.mo84304h();
        C22757a.m102929c(false);
    }

    /* renamed from: p0 */
    public boolean mo69449p0(@C12579k C30587h hVar) {
        C38163l lVar;
        Intrinsics.checkNotNullParameter(hVar, "marker");
        mo84379U0(this.f71048f, this.f71049g, false);
        this.f71048f = hVar;
        Object f = hVar.mo86561f();
        if (f instanceof C38163l) {
            lVar = (C38163l) f;
        } else {
            lVar = null;
        }
        this.f71049g = lVar;
        mo84379U0(this.f71048f, lVar, true);
        Location location = this.f71050v;
        Object f2 = hVar.mo86561f();
        Intrinsics.checkNotNull(f2, "null cannot be cast to non-null type com.carrefour.fid.android.domain.models.service.models.Store");
        mo84380W0(location, (C38163l) f2);
        return true;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: q */
    public void mo84350q(@C12579k Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f71050v = location;
        C30412c cVar = this.f71045c;
        if (cVar != null) {
            cVar.mo85878I(true);
            cVar.mo85923r().mo86696o(false);
        }
    }

    /* renamed from: s */
    public void mo84351s() {
        View view = getView();
        if (view != null) {
            ViewKt.m119012y(view);
        }
    }

    /* renamed from: z0 */
    public void mo84352z0(@C12579k List<C38163l> list) {
        StoreCoordinates k;
        C30587h c;
        Intrinsics.checkNotNullParameter(list, "storeList");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C38163l lVar = (C38163l) next;
            Iterable iterable = this.f71053y;
            boolean z = false;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C11622t.equals(lVar.mo119394x(), (String) it.next(), true)) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                arrayList.add(next);
            }
        }
        for (C38163l lVar2 : CollectionsKt___CollectionsKt.m40497E5(arrayList, 10)) {
            StoreAddress v = lVar2.mo119392v();
            if (!(v == null || (k = v.mo119130k()) == null)) {
                LatLng latLng = new LatLng(Double.parseDouble(k.mo119145e()), Double.parseDouble(k.mo119147f()));
                C30412c cVar = this.f71045c;
                if (!(cVar == null || (c = cVar.mo85900c(new MarkerOptions().mo86366Y1(latLng).mo86354A1(ImageUtils.f70796a.mo84112r(OneAppApplication.f32244w.mo30856a(), C28855a.f70682a.mo83977d(lVar2.mo119394x()))))) == null)) {
                    c.mo86580x(lVar2);
                }
            }
        }
    }
}
