package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0302g;
import androidx.appcompat.content.res.C0507a;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36652b3;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23614a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.location.C30327e;
import com.google.android.gms.location.C30354k;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.C30409b;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.C30447f;
import com.google.android.gms.maps.C30450g;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.C30573a;
import com.google.android.gms.maps.model.C30575b;
import com.google.android.gms.maps.model.C30587h;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.C31047k;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import dagger.hilt.android.C10164b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
@C11076d0(mo22515d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002\u0001\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\t¢\u0006\u0006\b¢\u0001\u0010£\u0001J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u001a\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\u0016\u0010\u0014\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0002J\u0016\u0010\u0016\u001a\u00020\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0002J\u0016\u0010\u001c\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0002J\"\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u0007H\u0003J\u0018\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002J \u0010+\u001a\u00020$2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\b\u0010,\u001a\u00020\u0007H\u0002J\b\u0010-\u001a\u00020\u0007H\u0002J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020(H\u0002J\u0012\u00102\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u000100H\u0016J$\u00108\u001a\u0002072\u0006\u00104\u001a\u0002032\b\u00106\u001a\u0004\u0018\u0001052\b\u00101\u001a\u0004\u0018\u000100H\u0016J\u0010\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0016J\b\u0010<\u001a\u00020\u0007H\u0016J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=H\u0017J\u0010\u0010@\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010B\u001a\u00020\u00072\u0006\u0010A\u001a\u00020$H\u0016J\b\u0010C\u001a\u00020\u0007H\u0016R\u0014\u0010F\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002XD¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020$8\u0002XD¢\u0006\u0006\n\u0004\bK\u0010LR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001d0N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001b\u0010g\u001a\u00020b8BX\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001b\u0010m\u001a\u00020h8BX\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0016\u0010o\u001a\u00020G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bn\u0010IR\u001b\u0010s\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\bp\u0010d\u001a\u0004\bq\u0010rR\u0018\u0010v\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010|\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b{\u0010LR\u0016\u0010~\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b}\u0010pR2\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\u001a\u00020\u000e8B@BX\u0002¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\r \u0001*\u0005\u0018\u00010\u00010\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010d\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010pR\u001d\u0010\t\u001a\t\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001¨\u0006¤\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/map/PickupPointsMapFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Lcom/google/android/gms/maps/g;", "Lcom/google/android/gms/maps/f;", "Lcom/google/android/gms/maps/c$g;", "Lcom/google/android/gms/maps/c$d;", "Lcom/google/android/gms/maps/c$q;", "Lkotlin/d2;", "initGoogleMap", "requestPermission", "initListeners", "centerOnUserLocation", "Lcom/carrefour/fid/android/domain/models/pickup/a;", "pickupPoint", "", "isPickupSelected", "a1", "clearCurrentSelection", "", "pickupPoints", "c1", "Lcom/google/android/gms/maps/model/LatLngBounds;", "e1", "location", "zoomToBounds", "Lcom/google/android/gms/maps/model/LatLng;", "zoomToLocation", "clearAll", "Z0", "Lcom/google/android/gms/maps/model/h;", "marker", "isSelected", "o1", "enableLocationButtonOnMap", "Landroid/content/Context;", "context", "", "vectorResId", "Lcom/google/android/gms/maps/model/a;", "vectorToBitmap", "", "type", "isCarrefour", "h1", "hideCarousel", "showCarousel", "search", "performSearch", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "Lcom/google/android/gms/maps/MapsInitializer$Renderer;", "renderer", "onMapsSdkInitialized", "onDestroyView", "Lcom/google/android/gms/maps/c;", "map", "onMapReady", "p0", "reason", "onCameraMoveStarted", "onCameraIdle", "f", "Lcom/google/android/gms/maps/model/LatLng;", "defaultLatLon", "", "g", "F", "defaultZoomLvl", "v", "I", "boundsPadding", "", "w", "Ljava/util/Map;", "markersByPickupId", "Landroid/app/Application;", "x", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "application", "Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/analytics/a;", "y", "Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/analytics/a;", "f1", "()Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/analytics/a;", "m1", "(Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/analytics/a;)V", "nonFoodCheckoutStep2Analytics", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/PickupPointsMapViewModel;", "z", "Lkotlin/z;", "i1", "()Lcom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/PickupPointsMapViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/map/e;", "X", "Landroidx/navigation/m;", "d1", "()Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/map/e;", "args", "Y", "externalPickupPrice", "Z", "getBottomPadding", "()I", "bottomPadding", "E0", "Lcom/google/android/gms/maps/c;", "mapView", "Lcom/carrefour/fid/android/databinding/b3;", "F0", "Lcom/carrefour/fid/android/databinding/b3;", "binding", "G0", "cameraMoveStartedReason", "H0", "cameraMoved", "<set-?>", "I0", "Landroidx/compose/runtime/z0;", "g1", "()Z", "n1", "(Z)V", "pickupCarouselVisible", "Lcom/google/android/gms/location/e;", "J0", "Lcom/google/android/gms/location/e;", "fusedLocationProvider", "Lcom/google/android/gms/location/LocationRequest;", "kotlin.jvm.PlatformType", "K0", "Lcom/google/android/gms/location/LocationRequest;", "locationRequest", "Landroid/location/Location;", "L0", "Landroid/location/Location;", "lastLocation", "com/carrefour/fid/android/presentation/ui/checkout/nal/step2/map/PickupPointsMapFragment$b", "M0", "Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step2/map/PickupPointsMapFragment$b;", "locationCallback", "Landroid/location/Geocoder;", "N0", "getGeocoder", "()Landroid/location/Geocoder;", "geocoder", "O0", "hasPermission", "Landroidx/activity/result/g;", "P0", "Landroidx/activity/result/g;", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPickupPointsMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickupPointsMapFragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/map/PickupPointsMapFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,490:1\n106#2,15:491\n42#3,3:506\n76#4:509\n102#4,2:510\n1#5:512\n1855#6,2:513\n*S KotlinDebug\n*F\n+ 1 PickupPointsMapFragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/map/PickupPointsMapFragment\n*L\n88#1:491,15\n89#1:506,3\n98#1:509\n98#1:510,2\n366#1:513,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment */
public final class PickupPointsMapFragment extends C23690a implements C30450g, C30447f, C30412c.C30419g, C30412c.C30416d, C30412c.C30429q {

    /* renamed from: Q0 */
    public static final int f59732Q0 = 8;
    @C12580l

    /* renamed from: E0 */
    public C30412c f59733E0;
    @C12580l

    /* renamed from: F0 */
    public C36652b3 f59734F0;

    /* renamed from: G0 */
    public int f59735G0;

    /* renamed from: H0 */
    public boolean f59736H0;
    @C12579k

    /* renamed from: I0 */
    public final C8700z0 f59737I0;
    @C12580l

    /* renamed from: J0 */
    public C30327e f59738J0;

    /* renamed from: K0 */
    public final LocationRequest f59739K0;
    @C12580l

    /* renamed from: L0 */
    public Location f59740L0;
    @C12579k

    /* renamed from: M0 */
    public final C23681b f59741M0;
    @C12579k

    /* renamed from: N0 */
    public final C11677z f59742N0;

    /* renamed from: O0 */
    public boolean f59743O0;
    @SuppressLint({"MissingPermission"})
    @C12579k

    /* renamed from: P0 */
    public final C0302g<String> f59744P0;
    @C12579k

    /* renamed from: X */
    public final C19766m f59745X;

    /* renamed from: Y */
    public float f59746Y;
    @C12579k

    /* renamed from: Z */
    public final C11677z f59747Z;
    @C12579k

    /* renamed from: f */
    public final LatLng f59748f = new LatLng(45.0605516d, 2.89497932d);

    /* renamed from: g */
    public final float f59749g = 5.0f;

    /* renamed from: v */
    public final int f59750v = 100;
    @C12579k

    /* renamed from: w */
    public final Map<String, C30587h> f59751w = new LinkedHashMap();
    @Inject

    /* renamed from: x */
    public Application f59752x;
    @Inject

    /* renamed from: y */
    public C23614a f59753y;
    @C12579k

    /* renamed from: z */
    public final C11677z f59754z;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment$a */
    public /* synthetic */ class C23680a {
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
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map.PickupPointsMapFragment.C23680a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment$b */
    public static final class C23681b extends C30354k {

        /* renamed from: a */
        public final /* synthetic */ PickupPointsMapFragment f59755a;

        public C23681b(PickupPointsMapFragment pickupPointsMapFragment) {
            this.f59755a = pickupPointsMapFragment;
        }

        public void onLocationResult(@C12579k LocationResult locationResult) {
            Intrinsics.checkNotNullParameter(locationResult, "locationResult");
            Location location = locationResult.mo85594X().get(0);
            if (location != null) {
                this.f59755a.f59740L0 = location;
            }
        }
    }

    public PickupPointsMapFragment() {
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new PickupPointsMapFragment$special$$inlined$viewModels$default$2(new PickupPointsMapFragment$special$$inlined$viewModels$default$1(this)));
        this.f59754z = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(PickupPointsMapViewModel.class), new PickupPointsMapFragment$special$$inlined$viewModels$default$3(b), new PickupPointsMapFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new PickupPointsMapFragment$special$$inlined$viewModels$default$5(this, b));
        this.f59745X = new C19766m(C11342l0.m43547d(C23694e.class), new PickupPointsMapFragment$special$$inlined$navArgs$1(this));
        this.f59747Z = C10864b0.m38748c(new PickupPointsMapFragment$bottomPadding$2(this));
        this.f59737I0 = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
        LocationRequest M = LocationRequest.m122055M();
        M.mo85574G1(100);
        M.mo85586j1(10000);
        M.mo85578N0(2000);
        this.f59739K0 = M;
        this.f59741M0 = new C23681b(this);
        this.f59742N0 = C10864b0.m38748c(new PickupPointsMapFragment$geocoder$2(this));
        this.f59744P0 = FragmentKt.m118833u(this, new PickupPointsMapFragment$requestPermission$1(this), new PickupPointsMapFragment$requestPermission$2(this));
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m105165b1(PickupPointsMapFragment pickupPointsMapFragment, C38080a aVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        pickupPointsMapFragment.mo69424a1(aVar, z);
    }

    /* renamed from: j1 */
    public static final void m105166j1(PickupPointsMapFragment pickupPointsMapFragment, View view) {
        Intrinsics.checkNotNullParameter(pickupPointsMapFragment, "this$0");
        pickupPointsMapFragment.centerOnUserLocation();
    }

    /* renamed from: k1 */
    public static final void m105167k1(PickupPointsMapFragment pickupPointsMapFragment, LatLng latLng) {
        Intrinsics.checkNotNullParameter(pickupPointsMapFragment, "this$0");
        Intrinsics.checkNotNullParameter(latLng, "it");
        View view = pickupPointsMapFragment.getView();
        if (view != null) {
            ViewKt.m119012y(view);
        }
        pickupPointsMapFragment.clearCurrentSelection();
        pickupPointsMapFragment.hideCarousel();
    }

    /* renamed from: l1 */
    public static final void m105168l1(PickupPointsMapFragment pickupPointsMapFragment, C31047k kVar) {
        Intrinsics.checkNotNullParameter(pickupPointsMapFragment, "this$0");
        Intrinsics.checkNotNullParameter(kVar, "it");
        Location location = (Location) kVar.mo87734r();
        if (location == null) {
            location = null;
        }
        if (location != null) {
            pickupPointsMapFragment.f59740L0 = location;
            pickupPointsMapFragment.centerOnUserLocation();
        }
    }

    /* renamed from: p1 */
    public static /* synthetic */ void m105169p1(PickupPointsMapFragment pickupPointsMapFragment, C30587h hVar, C38080a aVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        pickupPointsMapFragment.mo69444o1(hVar, aVar, z);
    }

    /* renamed from: Z0 */
    public final void mo69423Z0(List<C38080a> list) {
        String str;
        C38080a value = mo69439i1().mo76069f0().getValue();
        for (C38080a next : list) {
            LatLng latLng = new LatLng(next.mo118288p(), next.mo118289q());
            C30412c cVar = this.f59733E0;
            if (cVar != null) {
                MarkerOptions Y1 = new MarkerOptions().mo86366Y1(latLng);
                Application application = getApplication();
                String r = next.mo118290r();
                boolean v = next.mo118295v();
                String u = next.mo118294u();
                if (value != null) {
                    str = value.mo118294u();
                } else {
                    str = null;
                }
                C30587h c = cVar.mo85900c(Y1.mo86354A1(vectorToBitmap(application, mo69437h1(r, v, Intrinsics.areEqual((Object) u, (Object) str)))).mo86373l2(next.mo118290r()));
                if (c != null) {
                    c.mo86580x(next);
                }
                if (c != null) {
                    this.f59751w.put(next.mo118294u(), c);
                }
            }
        }
    }

    /* renamed from: a1 */
    public final void mo69424a1(C38080a aVar, boolean z) {
        C30587h hVar = this.f59751w.get(aVar.mo118294u());
        if (hVar != null) {
            if (z) {
                clearCurrentSelection();
                mo69439i1().mo76071h0(aVar);
                mo69444o1(hVar, aVar, true);
            }
            zoomToLocation(new LatLng(aVar.mo118288p(), aVar.mo118289q()));
        }
    }

    /* renamed from: c1 */
    public final void mo69425c1(List<C38080a> list) {
        if (!list.isEmpty()) {
            clearAll();
            mo69423Z0(list);
            if (!this.f59736H0) {
                if (list.size() > 1) {
                    zoomToBounds(mo69430e1(list));
                    return;
                }
                C38080a aVar = (C38080a) CollectionsKt___CollectionsKt.m40706w2(list);
                zoomToLocation(new LatLng(aVar.mo118288p(), aVar.mo118289q()));
            }
        }
    }

    public final void centerOnUserLocation() {
        Location location = this.f59740L0;
        if (location != null) {
            zoomToLocation(new LatLng(location.getLatitude(), location.getLongitude()));
            C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new PickupPointsMapFragment$centerOnUserLocation$1$1(this, location, (C11045c<? super PickupPointsMapFragment$centerOnUserLocation$1$1>) null), 3, (Object) null);
        }
    }

    public final void clearAll() {
        this.f59751w.clear();
        C30412c cVar = this.f59733E0;
        if (cVar != null) {
            cVar.mo85914j();
        }
    }

    public final void clearCurrentSelection() {
        C30587h hVar;
        C38080a value = mo69439i1().mo76069f0().getValue();
        if (value != null && (hVar = this.f59751w.get(value.mo118294u())) != null) {
            mo69444o1(hVar, value, false);
        }
    }

    /* renamed from: d1 */
    public final C23694e mo69429d1() {
        return (C23694e) this.f59745X.getValue();
    }

    /* renamed from: e1 */
    public final LatLngBounds mo69430e1(List<C38080a> list) {
        LatLngBounds.C30570a M = LatLngBounds.m123046M();
        Intrinsics.checkNotNullExpressionValue(M, "builder()");
        for (C38080a aVar : list) {
            M.mo86351b(new LatLng(aVar.mo118288p(), aVar.mo118289q()));
        }
        LatLngBounds a = M.mo86350a();
        Intrinsics.checkNotNullExpressionValue(a, "boundsBuilder.build()");
        return a;
    }

    @SuppressLint({"MissingPermission"})
    public final void enableLocationButtonOnMap() {
        C30412c cVar = this.f59733E0;
        if (cVar != null) {
            cVar.mo85878I(true);
            cVar.mo85923r().mo86696o(false);
        }
    }

    @C12579k
    /* renamed from: f1 */
    public final C23614a mo69432f1() {
        C23614a aVar = this.f59753y;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nonFoodCheckoutStep2Analytics");
        return null;
    }

    /* renamed from: g1 */
    public final boolean mo69433g1() {
        return ((Boolean) this.f59737I0.getValue()).booleanValue();
    }

    @C12579k
    public final Application getApplication() {
        Application application = this.f59752x;
        if (application != null) {
            return application;
        }
        Intrinsics.throwUninitializedPropertyAccessException("application");
        return null;
    }

    public final int getBottomPadding() {
        return ((Number) this.f59747Z.getValue()).intValue();
    }

    public final Geocoder getGeocoder() {
        return (Geocoder) this.f59742N0.getValue();
    }

    /* renamed from: h1 */
    public final int mo69437h1(String str, boolean z, boolean z2) {
        return z ? C28855a.f70682a.mo83978e(str, z2) : z2 ? R.drawable.ic_pin_retrait_active : R.drawable.ic_pin_retrait_default;
    }

    public final void hideCarousel() {
        mo69443n1(false);
        C30412c cVar = this.f59733E0;
        if (cVar != null) {
            cVar.mo85907f0(0, 0, 0, 0);
        }
    }

    /* renamed from: i1 */
    public final PickupPointsMapViewModel mo69439i1() {
        return (PickupPointsMapViewModel) this.f59754z.getValue();
    }

    public final void initGoogleMap() {
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().mo56900r0(R.id.map);
        if (supportMapFragment != null) {
            supportMapFragment.mo85862I0(this);
        }
    }

    public final void initListeners() {
        FloatingActionButton floatingActionButton;
        C36652b3 b3Var = this.f59734F0;
        if (b3Var != null && (floatingActionButton = b3Var.f90599b) != null) {
            floatingActionButton.setOnClickListener(new C23693d(this));
        }
    }

    /* renamed from: m1 */
    public final void mo69442m1(@C12579k C23614a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f59753y = aVar;
    }

    /* renamed from: n1 */
    public final void mo69443n1(boolean z) {
        this.f59737I0.setValue(Boolean.valueOf(z));
    }

    /* renamed from: o1 */
    public final void mo69444o1(C30587h hVar, C38080a aVar, boolean z) {
        try {
            hVar.mo86575s(vectorToBitmap(getApplication(), mo69437h1(aVar.mo118290r(), aVar.mo118295v(), z)));
        } catch (IllegalArgumentException e) {
            C28935i.m119705e(C28935i.f70940a, "marker setIcon unmanaged", e, 0, 4, (Object) null);
        }
    }

    public void onCameraIdle() {
        C30412c cVar = this.f59733E0;
        if (cVar != null && this.f59735G0 == 1) {
            LatLng latLng = cVar.mo85916k().f72990a;
            Intrinsics.checkNotNullExpressionValue(latLng, "mapView.cameraPosition.target");
            C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new PickupPointsMapFragment$onCameraIdle$1(this, latLng, (C11045c<? super PickupPointsMapFragment$onCameraIdle$1>) null), 3, (Object) null);
        }
    }

    public void onCameraMoveStarted(int i) {
        this.f59735G0 = i;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f59736H0 = z;
        if (z) {
            hideCarousel();
        }
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        this.f59746Y = mo69429d1().mo69484e();
        MapsInitializer.m122290b(requireContext().getApplicationContext(), MapsInitializer.Renderer.LATEST, this);
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        C36652b3 d = C36652b3.m150339d(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(inflater, container, false)");
        this.f59734F0 = d;
        ComposeView composeView = d.f90602e;
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner));
        composeView.setContent(C8553b.m31049c(568436695, true, new PickupPointsMapFragment$onCreateView$1$1(this)));
        ComposeView composeView2 = d.f90601d;
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        composeView2.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner2));
        composeView2.setContent(C8553b.m31049c(522249664, true, new PickupPointsMapFragment$onCreateView$2$1(this)));
        ComposeView composeView3 = d.f90603f;
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        composeView3.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner3));
        composeView3.setContent(C8553b.m31049c(-1749218081, true, new PickupPointsMapFragment$onCreateView$3$1(this)));
        requestPermission();
        initListeners();
        mo69432f1().mo69145g();
        ConstraintLayout b = d.getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f59734F0 = null;
        this.f59733E0 = null;
    }

    @SuppressLint({"MissingPermission"})
    public void onMapReady(@C12579k C30412c cVar) {
        C31047k<Location> I;
        Intrinsics.checkNotNullParameter(cVar, "map");
        this.f59733E0 = cVar;
        cVar.mo85893X(this);
        cVar.mo85883N(this);
        cVar.mo85880K(this);
        cVar.mo85890U(new C23691b(this));
        if (this.f59743O0) {
            enableLocationButtonOnMap();
            C30327e eVar = this.f59738J0;
            if (!(eVar == null || (I = eVar.mo85674I()) == null)) {
                I.mo87721e(new C23692c(this));
            }
        } else {
            cVar.mo85928w(C30409b.m122333e(this.f59748f, this.f59749g));
        }
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new PickupPointsMapFragment$onMapReady$3(this, (C11045c<? super PickupPointsMapFragment$onMapReady$3>) null), 3, (Object) null);
    }

    public void onMapsSdkInitialized(@C12579k MapsInitializer.Renderer renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        int i = C23680a.$EnumSwitchMapping$0[renderer.ordinal()];
    }

    /* renamed from: p0 */
    public boolean mo69449p0(@C12579k C30587h hVar) {
        C38080a aVar;
        Intrinsics.checkNotNullParameter(hVar, "marker");
        String g = hVar.mo86562g();
        if (g == null) {
            g = getString(R.string.drive_summary_title);
        }
        Intrinsics.checkNotNullExpressionValue(g, "marker.title ?: getStrin…ring.drive_summary_title)");
        FragmentKt.m118816d(this, g);
        clearCurrentSelection();
        Object f = hVar.mo86561f();
        if (f instanceof C38080a) {
            aVar = (C38080a) f;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return true;
        }
        mo69439i1().mo76071h0(aVar);
        mo69444o1(hVar, aVar, true);
        showCarousel();
        return true;
    }

    public final void performSearch(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new PickupPointsMapFragment$performSearch$1(this, str, (C11045c<? super PickupPointsMapFragment$performSearch$1>) null), 3, (Object) null);
        }
    }

    public final void requestPermission() {
        this.f59744P0.mo960b("android.permission.ACCESS_FINE_LOCATION");
    }

    public final void setApplication(@C12579k Application application) {
        Intrinsics.checkNotNullParameter(application, "<set-?>");
        this.f59752x = application;
    }

    public final void showCarousel() {
        mo69443n1(true);
        C30412c cVar = this.f59733E0;
        if (cVar != null) {
            cVar.mo85907f0(0, 0, 0, getBottomPadding());
        }
    }

    public final C30573a vectorToBitmap(Context context, int i) {
        Drawable b = C0507a.m2346b(context, i);
        Intrinsics.checkNotNull(b);
        b.setBounds(0, 0, b.getIntrinsicWidth(), b.getIntrinsicHeight());
        Bitmap createBitmap = Bitmap.createBitmap(b.getIntrinsicWidth(), b.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        b.draw(new Canvas(createBitmap));
        C30573a d = C30575b.m123158d(createBitmap);
        Intrinsics.checkNotNullExpressionValue(d, "fromBitmap(bitmap)");
        return d;
    }

    public final void zoomToBounds(LatLngBounds latLngBounds) {
        C30412c cVar = this.f59733E0;
        if (cVar != null) {
            cVar.mo85908g(C30409b.m122331c(latLngBounds, this.f59750v));
        }
    }

    public final void zoomToLocation(LatLng latLng) {
        C30412c cVar = this.f59733E0;
        if (cVar != null) {
            cVar.mo85908g(C30409b.m122330b(latLng));
        }
    }
}
