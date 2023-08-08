package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.C17735w;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.android.volley.C21755g;
import com.carrefour.fid.android.domain.models.LatLon;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.databinding.FragmentDriveMapBinding;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a;
import com.carrefour.fid.android.shared.util.C28951s;
import com.google.android.gms.location.C30327e;
import com.google.android.gms.location.LocationRequest;
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
import com.google.android.gms.tasks.C31047k;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.maps.android.clustering.C33750a;
import com.google.maps.android.clustering.C33764c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.C11677z;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002«\u0001\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0012\u0004\u0012\u00020\u00070\b:\u0002¸\u0001B\t¢\u0006\u0006\b¶\u0001\u0010·\u0001J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\tH\u0002J\b\u0010\u0016\u001a\u00020\tH\u0002J\u001a\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002J\u0016\u0010\u001c\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001aH\u0002J1\u0010 \u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001e\u0010%\u001a\u00020$2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020$H\u0002J\u0010\u0010(\u001a\u00020\t2\u0006\u0010&\u001a\u00020\"H\u0002J\b\u0010)\u001a\u00020\tH\u0002J\u0016\u0010*\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001aH\u0002J8\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0,2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020\rH\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0018\u00103\u001a\u0002022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00101\u001a\u000200H\u0002J\u0018\u00106\u001a\u0002002\u0006\u00105\u001a\u0002042\u0006\u0010+\u001a\u00020\rH\u0002J\b\u00107\u001a\u00020\tH\u0003J\b\u00108\u001a\u00020\tH\u0002J\b\u00109\u001a\u00020\tH\u0002J\u0010\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u000204H\u0002JS\u0010C\u001a\u00020\t2\u0006\u0010=\u001a\u00020<2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0>2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0>2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\t0?H\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u0012\u0010F\u001a\u00020\t2\b\u0010E\u001a\u0004\u0018\u00010DH\u0016J$\u0010L\u001a\u00020K2\u0006\u0010H\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010I2\b\u0010E\u001a\u0004\u0018\u00010DH\u0016J\u0010\u0010O\u001a\u00020\t2\u0006\u0010N\u001a\u00020MH\u0016J\b\u0010P\u001a\u00020\tH\u0016J\u0010\u0010S\u001a\u00020\t2\u0006\u0010R\u001a\u00020QH\u0017J\u0018\u0010\u000e\u001a\u00020\r2\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010TH\u0016J\u0012\u0010W\u001a\u00020\r2\b\u0010V\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010Y\u001a\u00020\t2\u0006\u0010X\u001a\u000200H\u0016J\b\u0010Z\u001a\u00020\tH\u0016R\u0014\u0010[\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002XD¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u0002008\u0002XD¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010b\u001a\u0002008\u0002XD¢\u0006\u0006\n\u0004\bb\u0010aR\"\u0010d\u001a\u00020c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010k\u001a\u00020j8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001b\u0010v\u001a\u00020q8BX\u0002¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001b\u0010z\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\bw\u0010s\u001a\u0004\bx\u0010yR\u0018\u0010{\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001e\u0010~\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010}8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b~\u0010RQ\u0010\u0001\u001a\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000b0\u00012\u0016\u0010\u0001\u001a\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000b0\u00018B@BX\u0002¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R?\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8B@BX\u0002¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010aR\u0019\u0010\u0001\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R3\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8B@BX\u0002¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R9\u0010¡\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00018B@BX\u0002¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010 \u0001R\u0016\u0010¢\u0001\u001a\u0002008\u0002X\u0004¢\u0006\u0007\n\u0005\b¢\u0001\u0010aR\u0016\u0010£\u0001\u001a\u0002008\u0002X\u0004¢\u0006\u0007\n\u0005\b£\u0001\u0010aR\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\"\u0010©\u0001\u001a\r ¨\u0001*\u0005\u0018\u00010§\u00010§\u00018\u0002X\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010¬\u0001\u001a\u00030«\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010­\u0001R \u0010²\u0001\u001a\u00030®\u00018BX\u0002¢\u0006\u000f\n\u0005\b¯\u0001\u0010s\u001a\u0006\b°\u0001\u0010±\u0001R\u0019\u0010³\u0001\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u0001R\u001c\u0010\u0014\u001a\t\u0012\u0004\u0012\u0002040´\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010µ\u0001\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006¹\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/map/DriveMapFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Lcom/google/android/gms/maps/g;", "Lcom/google/android/gms/maps/f;", "Lcom/google/android/gms/maps/c$g;", "Lcom/google/android/gms/maps/c$d;", "Lcom/google/maps/android/clustering/c$c;", "Lcom/carrefour/fid/android/service/presentation/model/DrivePoint;", "Lcom/google/maps/android/clustering/c$f;", "Lkotlin/d2;", "initGoogleMap", "Lcom/google/android/gms/maps/model/h;", "marker", "", "onClusterClick", "drivePoint", "onDriveClick", "Landroid/content/Context;", "context", "isLocationEnabled", "requestPermission", "initListeners", "centerOnUserLocation", "isDriveSelected", "centerOnDrive", "clearCurrentSelection", "", "drivePoints", "displayDrives", "", "latitude", "longitude", "adjustScaleForDriveList", "(Ljava/util/List;DDLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/google/android/gms/maps/model/LatLng;", "center", "Lcom/google/android/gms/maps/model/LatLngBounds;", "getBoundsAroundPosition", "location", "zoomToBounds", "zoomToLocation", "clearAll", "addAllDrives", "isSelected", "Lkotlin/Result;", "updateMarkerIcon-0E7RQCE", "(Lcom/google/android/gms/maps/model/h;Lcom/carrefour/fid/android/service/presentation/model/DrivePoint;Z)Ljava/lang/Object;", "updateMarkerIcon", "", "vectorResId", "Lcom/google/android/gms/maps/model/a;", "vectorToBitmap", "", "type", "getIcon", "enableLocationButtonOnMap", "hideCarousel", "showCarousel", "search", "performSearch", "Landroidx/compose/ui/geometry/f;", "e", "Lkotlin/Function1;", "Lkotlin/Function0;", "onMapClick", "findNearestDriveOrCluster-M_7yMNQ", "(JLkotlin/jvm/functions/l;Lkotlin/jvm/functions/l;Lkotlin/jvm/functions/a;)V", "findNearestDriveOrCluster", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "Lcom/google/android/gms/maps/MapsInitializer$Renderer;", "renderer", "onMapsSdkInitialized", "onDestroyView", "Lcom/google/android/gms/maps/c;", "map", "onMapReady", "Lcom/google/maps/android/clustering/a;", "cluster", "item", "onClusterItemClick", "reason", "onCameraMoveStarted", "onCameraIdle", "defaultLatLon", "Lcom/google/android/gms/maps/model/LatLng;", "", "defaultZoomLvl", "F", "boundsPadding", "I", "distanceThreshold", "Landroid/app/Application;", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "Lcom/carrefour/fid/android/shared/navigation/c;", "navigator", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel;", "viewModel$delegate", "Lkotlin/z;", "getViewModel", "()Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel;", "viewModel", "bottomPadding$delegate", "getBottomPadding", "()I", "bottomPadding", "mapView", "Lcom/google/android/gms/maps/c;", "Lcom/google/maps/android/clustering/c;", "clusterManager", "Lcom/google/maps/android/clustering/c;", "", "<set-?>", "markerForDrive$delegate", "Landroidx/compose/runtime/z0;", "getMarkerForDrive", "()Ljava/util/Map;", "setMarkerForDrive", "(Ljava/util/Map;)V", "markerForDrive", "clusterMarkers$delegate", "getClusterMarkers", "()Ljava/util/List;", "setClusterMarkers", "(Ljava/util/List;)V", "clusterMarkers", "Lcom/carrefour/fid/android/service/databinding/FragmentDriveMapBinding;", "binding", "Lcom/carrefour/fid/android/service/databinding/FragmentDriveMapBinding;", "cameraMoveStartedReason", "hasAdjustedScaleOnLaunch", "Z", "driveCarouselVisible$delegate", "getDriveCarouselVisible", "()Z", "setDriveCarouselVisible", "(Z)V", "driveCarouselVisible", "Landroid/location/Location;", "lastLocation$delegate", "getLastLocation", "()Landroid/location/Location;", "setLastLocation", "(Landroid/location/Location;)V", "lastLocation", "pinWidth", "pinHeight", "Lcom/google/android/gms/location/e;", "fusedLocationProvider", "Lcom/google/android/gms/location/e;", "Lcom/google/android/gms/location/LocationRequest;", "kotlin.jvm.PlatformType", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "com/carrefour/fid/android/service/presentation/ui/drive/map/DriveMapFragment$locationCallback$1", "locationCallback", "Lcom/carrefour/fid/android/service/presentation/ui/drive/map/DriveMapFragment$locationCallback$1;", "Landroid/location/Geocoder;", "geocoder$delegate", "getGeocoder", "()Landroid/location/Geocoder;", "geocoder", "hasPermission", "Landroidx/activity/result/g;", "Landroidx/activity/result/g;", "<init>", "()V", "Geom", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveMapFragment.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/DriveMapFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,712:1\n56#2,10:713\n76#3:723\n102#3,2:724\n76#3:726\n102#3,2:727\n76#3:729\n102#3,2:730\n76#3:732\n102#3,2:733\n1549#4:735\n1620#4,3:736\n1045#4:739\n1855#4,2:740\n1194#4,2:742\n1222#4,4:744\n1194#4,2:748\n1222#4,4:750\n766#4:754\n857#4,2:755\n2333#4,14:757\n766#4:771\n857#4,2:772\n2333#4,14:774\n*S KotlinDebug\n*F\n+ 1 DriveMapFragment.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/DriveMapFragment\n*L\n102#1:713,10\n107#1:723\n107#1:724,2\n108#1:726\n108#1:727,2\n113#1:729\n113#1:730,2\n114#1:732\n114#1:733,2\n459#1:735\n459#1:736,3\n462#1:739\n489#1:740,2\n619#1:742,2\n619#1:744,4\n632#1:748,2\n632#1:750,4\n645#1:754\n645#1:755,2\n648#1:757,14\n652#1:771\n652#1:772,2\n656#1:774,14\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment */
public final class DriveMapFragment extends Hilt_DriveMapFragment implements C30450g, C30447f, C30412c.C30419g, C30412c.C30416d, C33764c.C33767c<DrivePoint>, C33764c.C33770f<DrivePoint> {
    @Inject
    public Application application;
    @C12580l
    private FragmentDriveMapBinding binding;
    @C12579k
    private final C11677z bottomPadding$delegate;
    private final int boundsPadding = 100;
    private int cameraMoveStartedReason;
    @C12580l
    private C33764c<DrivePoint> clusterManager;
    @C12579k
    private final C8700z0 clusterMarkers$delegate;
    @C12579k
    private final LatLng defaultLatLon = new LatLng(45.0605516d, 2.89497932d);
    private final float defaultZoomLvl = 5.0f;
    private final int distanceThreshold = C21755g.f56277e;
    @C12579k
    private final C8700z0 driveCarouselVisible$delegate;
    /* access modifiers changed from: private */
    @C12580l
    public C30327e fusedLocationProvider;
    @C12579k
    private final C11677z geocoder$delegate;
    /* access modifiers changed from: private */
    public boolean hasAdjustedScaleOnLaunch;
    /* access modifiers changed from: private */
    public boolean hasPermission;
    @C12579k
    private final C8700z0 lastLocation$delegate;
    /* access modifiers changed from: private */
    @C12579k
    public final DriveMapFragment$locationCallback$1 locationCallback;
    /* access modifiers changed from: private */
    public final LocationRequest locationRequest;
    /* access modifiers changed from: private */
    @C12580l
    public C30412c mapView;
    @C12579k
    private final C8700z0 markerForDrive$delegate;
    @Inject
    public C28796c navigator;
    private final int pinHeight;
    private final int pinWidth;
    @SuppressLint({"MissingPermission"})
    @C12579k
    private final C0302g<String> requestPermission;
    @C12579k
    private final C11677z viewModel$delegate;

    @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/map/DriveMapFragment$Geom;", "", "rectF", "Landroid/graphics/RectF;", "centerX", "", "centerY", "(Landroid/graphics/RectF;II)V", "getCenterX", "()I", "getCenterY", "getRectF", "()Landroid/graphics/RectF;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom */
    public static final class Geom {
        private final int centerX;
        private final int centerY;
        @C12579k
        private final RectF rectF;

        public Geom(@C12579k RectF rectF2, int i, int i2) {
            Intrinsics.checkNotNullParameter(rectF2, "rectF");
            this.rectF = rectF2;
            this.centerX = i;
            this.centerY = i2;
        }

        public static /* synthetic */ Geom copy$default(Geom geom, RectF rectF2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                rectF2 = geom.rectF;
            }
            if ((i3 & 2) != 0) {
                i = geom.centerX;
            }
            if ((i3 & 4) != 0) {
                i2 = geom.centerY;
            }
            return geom.copy(rectF2, i, i2);
        }

        @C12579k
        public final RectF component1() {
            return this.rectF;
        }

        public final int component2() {
            return this.centerX;
        }

        public final int component3() {
            return this.centerY;
        }

        @C12579k
        public final Geom copy(@C12579k RectF rectF2, int i, int i2) {
            Intrinsics.checkNotNullParameter(rectF2, "rectF");
            return new Geom(rectF2, i, i2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Geom)) {
                return false;
            }
            Geom geom = (Geom) obj;
            return Intrinsics.areEqual((Object) this.rectF, (Object) geom.rectF) && this.centerX == geom.centerX && this.centerY == geom.centerY;
        }

        public final int getCenterX() {
            return this.centerX;
        }

        public final int getCenterY() {
            return this.centerY;
        }

        @C12579k
        public final RectF getRectF() {
            return this.rectF;
        }

        public int hashCode() {
            return (((this.rectF.hashCode() * 31) + Integer.hashCode(this.centerX)) * 31) + Integer.hashCode(this.centerY);
        }

        @C12579k
        public String toString() {
            RectF rectF2 = this.rectF;
            int i = this.centerX;
            int i2 = this.centerY;
            return "Geom(rectF=" + rectF2 + ", centerX=" + i + ", centerY=" + i2 + ")";
        }
    }

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$WhenMappings */
    public /* synthetic */ class WhenMappings {
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
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment.WhenMappings.<clinit>():void");
        }
    }

    public DriveMapFragment() {
        DriveMapFragment$special$$inlined$viewModels$default$1 driveMapFragment$special$$inlined$viewModels$default$1 = new DriveMapFragment$special$$inlined$viewModels$default$1(this);
        this.viewModel$delegate = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(DriveMapViewModel.class), new DriveMapFragment$special$$inlined$viewModels$default$2(driveMapFragment$special$$inlined$viewModels$default$1), new DriveMapFragment$special$$inlined$viewModels$default$3(driveMapFragment$special$$inlined$viewModels$default$1, this));
        this.bottomPadding$delegate = C10864b0.m38748c(new DriveMapFragment$bottomPadding$2(this));
        this.markerForDrive$delegate = C8539f2.m30981g(C10977s0.m41492z(), (C8410b2) null, 2, (Object) null);
        this.clusterMarkers$delegate = C8539f2.m30981g(CollectionsKt__CollectionsKt.m40441E(), (C8410b2) null, 2, (Object) null);
        this.driveCarouselVisible$delegate = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
        this.lastLocation$delegate = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.pinWidth = ViewKt.m119002o(48.0f);
        this.pinHeight = ViewKt.m119002o(50.0f);
        LocationRequest M = LocationRequest.m122055M();
        M.mo85574G1(100);
        M.mo85586j1(10000);
        M.mo85578N0(2000);
        this.locationRequest = M;
        this.locationCallback = new DriveMapFragment$locationCallback$1(this);
        this.geocoder$delegate = C10864b0.m38748c(new DriveMapFragment$geocoder$2(this));
        this.requestPermission = FragmentKt.m118833u(this, new DriveMapFragment$requestPermission$1(this), new DriveMapFragment$requestPermission$2(this));
    }

    private final void addAllDrives(List<DrivePoint> list) {
        C33764c<DrivePoint> cVar = this.clusterManager;
        if (cVar != null) {
            cVar.mo98067d(list);
        }
        C33764c<DrivePoint> cVar2 = this.clusterManager;
        if (cVar2 != null) {
            cVar2.mo98069f();
        }
    }

    /* access modifiers changed from: private */
    public final Object adjustScaleForDriveList(List<DrivePoint> list, double d, double d2, C11045c<? super C11079d2> cVar) {
        Iterable<DrivePoint> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (DrivePoint drivePoint : iterable) {
            double d3 = d;
            arrayList.add(new Pair(drivePoint, C11064a.m42619e(StoreLocUtilsKt.computeDistanceInMeters(drivePoint, d, d2))));
        }
        double d4 = d;
        double d5 = d2;
        List p5 = CollectionsKt___CollectionsKt.m40675p5(arrayList, new DriveMapFragment$adjustScaleForDriveList$$inlined$sortedBy$1());
        List i = C10976s.m41417i();
        Iterator it = p5.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            DrivePoint drivePoint2 = (DrivePoint) pair.mo21846a();
            if (((Number) pair.mo21847b()).floatValue() < ((float) this.distanceThreshold) || i2 == 0) {
                i.add(drivePoint2);
                i2++;
            } else if (i2 > 0) {
                break;
            }
        }
        Object h = C11965h.m47673h(C11768d1.m46783e(), new DriveMapFragment$adjustScaleForDriveList$2(C10976s.m41409a(i), this, d, d2, (C11045c<? super DriveMapFragment$adjustScaleForDriveList$2>) null), cVar);
        if (h == C11063b.m42612h()) {
            return h;
        }
        return C11079d2.f28267a;
    }

    private final void centerOnDrive(DrivePoint drivePoint, boolean z) {
        C30587h hVar = getMarkerForDrive().get(drivePoint);
        if (hVar != null) {
            hVar.mo86553A(1.0f);
            if (z) {
                clearCurrentSelection();
                getViewModel().setDriveSelection(drivePoint);
                m172903updateMarkerIcon0E7RQCE(hVar, drivePoint, true);
            }
            zoomToLocation(new LatLng(drivePoint.getLatitude(), drivePoint.getLongitude()));
        }
    }

    public static /* synthetic */ void centerOnDrive$default(DriveMapFragment driveMapFragment, DrivePoint drivePoint, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        driveMapFragment.centerOnDrive(drivePoint, z);
    }

    private final void centerOnUserLocation() {
        Location lastLocation = getLastLocation();
        if (lastLocation != null) {
            zoomToLocation(new LatLng(lastLocation.getLatitude(), lastLocation.getLongitude()));
            getViewModel().fetchDrivePointThrottled(new LatLon(lastLocation.getLatitude(), lastLocation.getLongitude()));
        }
    }

    private final void clearAll() {
        C33764c<DrivePoint> cVar = this.clusterManager;
        if (cVar != null) {
            cVar.mo98068e();
        }
    }

    /* access modifiers changed from: private */
    public final void clearCurrentSelection() {
        DrivePoint value = getViewModel().getSelectedDrive$service_release().getValue();
        if (value != null) {
            getViewModel().setDriveSelection((DrivePoint) null);
            C30587h hVar = getMarkerForDrive().get(value);
            if (hVar != null) {
                hVar.mo86553A(0.0f);
                m172903updateMarkerIcon0E7RQCE(hVar, value, false);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void displayDrives(List<DrivePoint> list) {
        Location lastLocation;
        if (!list.isEmpty()) {
            clearAll();
            addAllDrives(list);
            if (!this.hasAdjustedScaleOnLaunch && (lastLocation = getLastLocation()) != null) {
                C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new DriveMapFragment$displayDrives$1$1(this, list, lastLocation, (C11045c<? super DriveMapFragment$displayDrives$1$1>) null), 3, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void enableLocationButtonOnMap() {
        C30412c cVar = this.mapView;
        if (cVar != null) {
            cVar.mo85878I(true);
            cVar.mo85923r().mo86696o(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.lang.Object} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: findNearestDriveOrCluster-M_7yMNQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m172902findNearestDriveOrClusterM_7yMNQ(long r18, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.service.presentation.model.DrivePoint, kotlin.C11079d2> r20, kotlin.jvm.functions.C11300l<? super com.google.android.gms.maps.model.C30587h, kotlin.C11079d2> r21, kotlin.jvm.functions.C11289a<kotlin.C11079d2> r22) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.gms.maps.c r1 = r0.mapView
            if (r1 == 0) goto L_0x02e5
            com.google.android.gms.maps.i r1 = r1.mo85922q()
            if (r1 != 0) goto L_0x000e
            goto L_0x02e5
        L_0x000e:
            java.util.Map r2 = r17.getMarkerForDrive()
            java.util.Set r2 = r2.keySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40664n2(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 10
            int r4 = kotlin.collections.C10978t.m41495Y(r2, r3)
            int r4 = kotlin.collections.C10975r0.m41400j(r4)
            r5 = 16
            int r4 = kotlin.ranges.C11479u.m44447u(r4, r5)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0037:
            boolean r4 = r2.hasNext()
            r7 = 2
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r2.next()
            r8 = r4
            com.carrefour.fid.android.service.presentation.model.DrivePoint r8 = (com.carrefour.fid.android.service.presentation.model.DrivePoint) r8
            com.google.android.gms.maps.model.LatLng r8 = r8.getPosition()
            android.graphics.Point r8 = r1.mo86008c(r8)
            java.lang.String r9 = "projection.toScreenLocation(drivePoint.position)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            android.graphics.RectF r9 = new android.graphics.RectF
            int r10 = r8.x
            int r11 = r0.pinWidth
            int r12 = r11 / 2
            int r12 = r10 - r12
            float r12 = (float) r12
            int r13 = r8.y
            int r14 = r0.pinHeight
            int r14 = r13 - r14
            float r14 = (float) r14
            int r11 = r11 / r7
            int r10 = r10 + r11
            float r10 = (float) r10
            float r11 = (float) r13
            r9.<init>(r12, r14, r10, r11)
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom r10 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom
            int r11 = r8.x
            int r8 = r8.y
            int r12 = r0.pinHeight
            int r12 = r12 / r7
            int r8 = r8 - r12
            r10.<init>(r9, r11, r8)
            r6.put(r10, r4)
            goto L_0x0037
        L_0x007c:
            java.util.List r2 = r17.getClusterMarkers()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r3 = kotlin.collections.C10978t.m41495Y(r2, r3)
            int r3 = kotlin.collections.C10975r0.m41400j(r3)
            int r3 = kotlin.ranges.C11479u.m44447u(r3, r5)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0097:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00df
            java.lang.Object r3 = r2.next()
            r5 = r3
            com.google.android.gms.maps.model.h r5 = (com.google.android.gms.maps.model.C30587h) r5
            com.google.android.gms.maps.model.LatLng r5 = r5.mo86557c()
            android.graphics.Point r5 = r1.mo86008c(r5)
            java.lang.String r8 = "projection.toScreenLocation(marker.position)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            android.graphics.RectF r8 = new android.graphics.RectF
            int r9 = r5.x
            int r10 = r0.pinWidth
            int r11 = r10 / 2
            int r11 = r9 - r11
            float r11 = (float) r11
            int r12 = r5.y
            int r13 = r0.pinHeight
            int r14 = r13 / 2
            int r14 = r12 - r14
            float r14 = (float) r14
            int r10 = r10 / r7
            int r9 = r9 + r10
            float r9 = (float) r9
            int r13 = r13 / r7
            int r12 = r12 + r13
            float r10 = (float) r12
            r8.<init>(r11, r14, r9, r10)
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom r9 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom
            int r10 = r5.x
            int r5 = r5.y
            int r11 = r0.pinHeight
            int r11 = r11 / r7
            int r5 = r5 - r11
            r9.<init>(r8, r10, r5)
            r4.put(r9, r3)
            goto L_0x0097
        L_0x00df:
            java.util.Set r1 = r6.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00ee:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0111
            java.lang.Object r3 = r1.next()
            r5 = r3
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom r5 = (com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment.Geom) r5
            android.graphics.RectF r5 = r5.getRectF()
            float r8 = androidx.compose.p004ui.geometry.C15094f.m64880p(r18)
            float r9 = androidx.compose.p004ui.geometry.C15094f.m64882r(r18)
            boolean r5 = r5.contains(r8, r9)
            if (r5 == 0) goto L_0x00ee
            r2.add(r3)
            goto L_0x00ee
        L_0x0111:
            java.util.Iterator r1 = r2.iterator()
            boolean r2 = r1.hasNext()
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r2 != 0) goto L_0x0120
            r9 = r4
            r2 = 0
            goto L_0x018e
        L_0x0120:
            java.lang.Object r2 = r1.next()
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L_0x012c
            r9 = r4
            goto L_0x018e
        L_0x012c:
            r5 = r2
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom r5 = (com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment.Geom) r5
            float r10 = androidx.compose.p004ui.geometry.C15094f.m64880p(r18)
            int r11 = r5.getCenterX()
            float r11 = (float) r11
            float r10 = r10 - r11
            double r10 = (double) r10
            double r12 = (double) r7
            double r10 = java.lang.Math.pow(r10, r12)
            float r14 = androidx.compose.p004ui.geometry.C15094f.m64882r(r18)
            int r5 = r5.getCenterY()
            float r5 = (float) r5
            float r14 = r14 - r5
            double r14 = (double) r14
            double r14 = java.lang.Math.pow(r14, r8)
            double r10 = r10 + r14
            double r10 = java.lang.Math.sqrt(r10)
        L_0x0153:
            java.lang.Object r5 = r1.next()
            r14 = r5
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom r14 = (com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment.Geom) r14
            float r15 = androidx.compose.p004ui.geometry.C15094f.m64880p(r18)
            int r3 = r14.getCenterX()
            float r3 = (float) r3
            float r15 = r15 - r3
            double r7 = (double) r15
            double r7 = java.lang.Math.pow(r7, r12)
            float r9 = androidx.compose.p004ui.geometry.C15094f.m64882r(r18)
            int r14 = r14.getCenterY()
            float r14 = (float) r14
            float r9 = r9 - r14
            double r14 = (double) r9
            r9 = r4
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = java.lang.Math.pow(r14, r3)
            double r7 = r7 + r14
            double r3 = java.lang.Math.sqrt(r7)
            int r7 = java.lang.Double.compare(r10, r3)
            if (r7 <= 0) goto L_0x0188
            r10 = r3
            r2 = r5
        L_0x0188:
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L_0x02dd
        L_0x018e:
            r4 = r2
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom r4 = (com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment.Geom) r4
            java.util.Set r1 = r9.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01a0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01c3
            java.lang.Object r3 = r1.next()
            r5 = r3
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom r5 = (com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment.Geom) r5
            android.graphics.RectF r5 = r5.getRectF()
            float r7 = androidx.compose.p004ui.geometry.C15094f.m64880p(r18)
            float r8 = androidx.compose.p004ui.geometry.C15094f.m64882r(r18)
            boolean r5 = r5.contains(r7, r8)
            if (r5 == 0) goto L_0x01a0
            r2.add(r3)
            goto L_0x01a0
        L_0x01c3:
            java.util.Iterator r5 = r2.iterator()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L_0x01d2
            r16 = r4
            r3 = 0
            goto L_0x024a
        L_0x01d2:
            java.lang.Object r1 = r5.next()
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L_0x01e0
            r3 = r1
            r16 = r4
            goto L_0x024a
        L_0x01e0:
            r2 = r1
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom r2 = (com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment.Geom) r2
            float r3 = androidx.compose.p004ui.geometry.C15094f.m64880p(r18)
            int r7 = r2.getCenterX()
            float r7 = (float) r7
            float r3 = r3 - r7
            double r7 = (double) r3
            r3 = 2
            double r14 = (double) r3
            double r7 = java.lang.Math.pow(r7, r14)
            float r10 = androidx.compose.p004ui.geometry.C15094f.m64882r(r18)
            int r2 = r2.getCenterY()
            float r2 = (float) r2
            float r10 = r10 - r2
            double r10 = (double) r10
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = java.lang.Math.pow(r10, r12)
            double r7 = r7 + r10
            double r7 = java.lang.Math.sqrt(r7)
        L_0x020a:
            java.lang.Object r2 = r5.next()
            r10 = r2
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom r10 = (com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment.Geom) r10
            float r11 = androidx.compose.p004ui.geometry.C15094f.m64880p(r18)
            int r12 = r10.getCenterX()
            float r12 = (float) r12
            float r11 = r11 - r12
            double r11 = (double) r11
            double r11 = java.lang.Math.pow(r11, r14)
            float r13 = androidx.compose.p004ui.geometry.C15094f.m64882r(r18)
            int r10 = r10.getCenterY()
            float r10 = (float) r10
            float r13 = r13 - r10
            r16 = r4
            double r3 = (double) r13
            r13 = r1
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r3, r0)
            double r11 = r11 + r3
            double r0 = java.lang.Math.sqrt(r11)
            int r3 = java.lang.Double.compare(r7, r0)
            if (r3 <= 0) goto L_0x0242
            r7 = r0
            r1 = r2
            goto L_0x0243
        L_0x0242:
            r1 = r13
        L_0x0243:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x02d3
            r3 = r1
        L_0x024a:
            r0 = r3
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$Geom r0 = (com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment.Geom) r0
            if (r16 != 0) goto L_0x0256
            if (r0 != 0) goto L_0x0256
            r22.invoke()
            goto L_0x02d2
        L_0x0256:
            r1 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            if (r16 == 0) goto L_0x0285
            float r3 = androidx.compose.p004ui.geometry.C15094f.m64880p(r18)
            int r4 = r16.getCenterX()
            float r4 = (float) r4
            float r3 = r3 - r4
            double r4 = (double) r3
            r3 = 2
            double r7 = (double) r3
            double r4 = java.lang.Math.pow(r4, r7)
            float r7 = androidx.compose.p004ui.geometry.C15094f.m64882r(r18)
            int r8 = r16.getCenterY()
            float r8 = (float) r8
            float r7 = r7 - r8
            double r7 = (double) r7
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = java.lang.Math.pow(r7, r10)
            double r4 = r4 + r7
            double r4 = java.lang.Math.sqrt(r4)
            goto L_0x0286
        L_0x0285:
            r4 = r1
        L_0x0286:
            if (r0 == 0) goto L_0x02af
            float r1 = androidx.compose.p004ui.geometry.C15094f.m64880p(r18)
            int r2 = r0.getCenterX()
            float r2 = (float) r2
            float r1 = r1 - r2
            double r1 = (double) r1
            r3 = 2
            double r7 = (double) r3
            double r1 = java.lang.Math.pow(r1, r7)
            float r3 = androidx.compose.p004ui.geometry.C15094f.m64882r(r18)
            int r7 = r0.getCenterY()
            float r7 = (float) r7
            float r3 = r3 - r7
            double r7 = (double) r3
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = java.lang.Math.pow(r7, r10)
            double r1 = r1 + r7
            double r1 = java.lang.Math.sqrt(r1)
        L_0x02af:
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x02c4
            r4 = r16
            java.lang.Object r0 = r6.get(r4)
            com.carrefour.fid.android.service.presentation.model.DrivePoint r0 = (com.carrefour.fid.android.service.presentation.model.DrivePoint) r0
            if (r0 != 0) goto L_0x02be
            return
        L_0x02be:
            r2 = r20
            r2.invoke(r0)
            goto L_0x02d2
        L_0x02c4:
            java.lang.Object r0 = r9.get(r0)
            com.google.android.gms.maps.model.h r0 = (com.google.android.gms.maps.model.C30587h) r0
            if (r0 != 0) goto L_0x02cd
            return
        L_0x02cd:
            r12 = r21
            r12.invoke(r0)
        L_0x02d2:
            return
        L_0x02d3:
            r2 = r20
            r12 = r21
            r0 = r17
            r4 = r16
            goto L_0x020a
        L_0x02dd:
            r0 = r17
            r4 = r9
            r7 = 2
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            goto L_0x0153
        L_0x02e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment.m172902findNearestDriveOrClusterM_7yMNQ(long, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.a):void");
    }

    private final int getBottomPadding() {
        return ((Number) this.bottomPadding$delegate.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public final LatLngBounds getBoundsAroundPosition(List<DrivePoint> list, LatLng latLng) {
        Integer num;
        double d;
        TapInterceptor tapInterceptor;
        LatLngBounds.C30570a M = LatLngBounds.m123046M();
        Intrinsics.checkNotNullExpressionValue(M, "builder()");
        for (DrivePoint drivePoint : list) {
            double latitude = drivePoint.getLatitude() - latLng.f73028a;
            double longitude = drivePoint.getLongitude() - latLng.f73029b;
            M.mo86351b(new LatLng(drivePoint.getLatitude(), drivePoint.getLongitude()));
            M.mo86351b(new LatLng(latLng.f73028a - latitude, latLng.f73029b - longitude));
        }
        FragmentDriveMapBinding fragmentDriveMapBinding = this.binding;
        if (fragmentDriveMapBinding == null || (tapInterceptor = fragmentDriveMapBinding.tapInterceptor) == null) {
            num = null;
        } else {
            num = Integer.valueOf(tapInterceptor.getHeight());
        }
        double d2 = 0.0d;
        if (num == null || num.intValue() <= 0) {
            d = 0.0d;
        } else {
            C28951s sVar = C28951s.f70964a;
            Context applicationContext = getApplication().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "application.applicationContext");
            d = ((double) sVar.mo84277c(160, applicationContext)) / ((double) num.intValue());
        }
        if (num != null && num.intValue() > 0) {
            C28951s sVar2 = C28951s.f70964a;
            Context applicationContext2 = getApplication().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "application.applicationContext");
            d2 = ((double) sVar2.mo84277c(80, applicationContext2)) / ((double) num.intValue());
        }
        LatLngBounds a = M.mo86350a();
        Intrinsics.checkNotNullExpressionValue(a, "boundsBuilder.build()");
        double d3 = (double) 1;
        return new LatLngBounds(new LatLng(a.mo86343X().f73028a + ((a.f73030a.f73028a - a.mo86343X().f73028a) * (d3 / (d3 - d2))), a.f73030a.f73029b), new LatLng(a.mo86343X().f73028a + ((a.f73031b.f73028a - a.mo86343X().f73028a) * (d3 / (d3 - d))), a.f73031b.f73029b));
    }

    private final List<C30587h> getClusterMarkers() {
        return (List) this.clusterMarkers$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final boolean getDriveCarouselVisible() {
        return ((Boolean) this.driveCarouselVisible$delegate.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final Geocoder getGeocoder() {
        return (Geocoder) this.geocoder$delegate.getValue();
    }

    private final int getIcon(String str, boolean z) {
        return C28855a.f70682a.mo83976b(str, z);
    }

    /* access modifiers changed from: private */
    public final Location getLastLocation() {
        return (Location) this.lastLocation$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final Map<DrivePoint, C30587h> getMarkerForDrive() {
        return (Map) this.markerForDrive$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final DriveMapViewModel getViewModel() {
        return (DriveMapViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void hideCarousel() {
        setDriveCarouselVisible(false);
        C30412c cVar = this.mapView;
        if (cVar != null) {
            cVar.mo85907f0(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: private */
    public final void initGoogleMap() {
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().mo56900r0(C28330R.C28334id.map);
        if (supportMapFragment != null) {
            supportMapFragment.mo85862I0(this);
        }
    }

    private final void initListeners() {
        FloatingActionButton floatingActionButton;
        FragmentDriveMapBinding fragmentDriveMapBinding = this.binding;
        if (fragmentDriveMapBinding != null && (floatingActionButton = fragmentDriveMapBinding.centerOnLocationFab) != null) {
            floatingActionButton.setOnClickListener(new C28422b(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void initListeners$lambda$5(DriveMapFragment driveMapFragment, View view) {
        Intrinsics.checkNotNullParameter(driveMapFragment, "this$0");
        driveMapFragment.centerOnUserLocation();
    }

    private final boolean isLocationEnabled(Context context) {
        Object systemService = context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return C17735w.m81001g((LocationManager) systemService);
    }

    /* access modifiers changed from: private */
    public final void onDriveClick(DrivePoint drivePoint) {
        centerOnDrive$default(this, drivePoint, false, 2, (Object) null);
        showCarousel();
    }

    /* access modifiers changed from: private */
    public static final void onMapReady$lambda$4(DriveMapFragment driveMapFragment, C31047k kVar) {
        Intrinsics.checkNotNullParameter(driveMapFragment, "this$0");
        Intrinsics.checkNotNullParameter(kVar, "it");
        Location location = (Location) kVar.mo87734r();
        if (location == null) {
            location = null;
        }
        if (location != null) {
            driveMapFragment.setLastLocation(location);
            driveMapFragment.centerOnUserLocation();
        }
    }

    /* access modifiers changed from: private */
    public final void performSearch(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new DriveMapFragment$performSearch$1(this, str, (C11045c<? super DriveMapFragment$performSearch$1>) null), 3, (Object) null);
        }
    }

    private final void requestPermission() {
        this.requestPermission.mo960b("android.permission.ACCESS_FINE_LOCATION");
    }

    /* access modifiers changed from: private */
    public final void setClusterMarkers(List<C30587h> list) {
        this.clusterMarkers$delegate.setValue(list);
    }

    private final void setDriveCarouselVisible(boolean z) {
        this.driveCarouselVisible$delegate.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    public final void setLastLocation(Location location) {
        this.lastLocation$delegate.setValue(location);
    }

    /* access modifiers changed from: private */
    public final void setMarkerForDrive(Map<DrivePoint, C30587h> map) {
        this.markerForDrive$delegate.setValue(map);
    }

    private final void showCarousel() {
        setDriveCarouselVisible(true);
        C30412c cVar = this.mapView;
        if (cVar != null) {
            cVar.mo85907f0(0, 0, 0, getBottomPadding());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: updateMarkerIcon-0E7RQCE  reason: not valid java name */
    public final Object m172903updateMarkerIcon0E7RQCE(C30587h hVar, DrivePoint drivePoint, boolean z) {
        try {
            Result.C10852a aVar = Result.f28060a;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            hVar.mo86575s(vectorToBitmap(requireContext, getIcon(drivePoint.getFormat(), z)));
            return Result.m38702b(C11079d2.f28267a);
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(th));
        }
    }

    /* renamed from: updateMarkerIcon-0E7RQCE$default  reason: not valid java name */
    public static /* synthetic */ Object m172904updateMarkerIcon0E7RQCE$default(DriveMapFragment driveMapFragment, C30587h hVar, DrivePoint drivePoint, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return driveMapFragment.m172903updateMarkerIcon0E7RQCE(hVar, drivePoint, z);
    }

    private final C30573a vectorToBitmap(Context context, int i) {
        Drawable b = C0507a.m2346b(context, i);
        Intrinsics.checkNotNull(b);
        b.setBounds(0, 0, b.getIntrinsicWidth(), b.getIntrinsicHeight());
        Bitmap createBitmap = Bitmap.createBitmap(b.getIntrinsicWidth(), b.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        b.draw(new Canvas(createBitmap));
        C30573a d = C30575b.m123158d(createBitmap);
        Intrinsics.checkNotNullExpressionValue(d, "fromBitmap(bitmap)");
        return d;
    }

    /* access modifiers changed from: private */
    public final void zoomToBounds(LatLngBounds latLngBounds) {
        C30412c cVar = this.mapView;
        if (cVar != null) {
            cVar.mo85908g(C30409b.m122331c(latLngBounds, this.boundsPadding));
        }
    }

    private final void zoomToLocation(LatLng latLng) {
        C30412c cVar = this.mapView;
        if (cVar != null) {
            cVar.mo85908g(C30409b.m122330b(latLng));
        }
    }

    @C12579k
    public final Application getApplication() {
        Application application2 = this.application;
        if (application2 != null) {
            return application2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("application");
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

    public void onCameraIdle() {
        C33764c<DrivePoint> cVar = this.clusterManager;
        if (cVar != null) {
            cVar.onCameraIdle();
        }
        C30412c cVar2 = this.mapView;
        if (cVar2 != null && this.cameraMoveStartedReason == 1) {
            LatLng latLng = cVar2.mo85916k().f72990a;
            Intrinsics.checkNotNullExpressionValue(latLng, "mapView.cameraPosition.target");
            getViewModel().fetchDrivePointThrottled(new LatLon(latLng.f73028a, latLng.f73029b));
        }
    }

    public void onCameraMoveStarted(int i) {
        this.cameraMoveStartedReason = i;
        if (i == 1) {
            clearCurrentSelection();
            hideCarousel();
        }
    }

    public boolean onClusterClick(@C12580l C33750a<DrivePoint> aVar) {
        return true;
    }

    public boolean onClusterItemClick(@C12580l DrivePoint drivePoint) {
        return true;
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new DriveMapFragment$onCreate$1(this, (C11045c<? super DriveMapFragment$onCreate$1>) null), 3, (Object) null);
        MapsInitializer.m122290b(requireContext().getApplicationContext(), MapsInitializer.Renderer.LATEST, this);
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        FragmentDriveMapBinding fragmentDriveMapBinding;
        LayoutInflater layoutInflater2 = layoutInflater;
        Intrinsics.checkNotNullParameter(layoutInflater2, "inflater");
        FragmentDriveMapBinding inflate = FragmentDriveMapBinding.inflate(layoutInflater2, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        inflate.tapInterceptor.setOnSingleTap(new DriveMapFragment$onCreateView$1(this, inflate));
        ComposeView composeView = inflate.driveHeader;
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner));
        composeView.setContent(C8553b.m31049c(-1809653583, true, new DriveMapFragment$onCreateView$2$1(this)));
        ComposeView composeView2 = inflate.driveCarousel;
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        composeView2.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner2));
        composeView2.setContent(C8553b.m31049c(1341383016, true, new DriveMapFragment$onCreateView$3$1(this)));
        ComposeView composeView3 = inflate.searchDrive;
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        composeView3.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner3));
        composeView3.setContent(C8553b.m31049c(637520041, true, new DriveMapFragment$onCreateView$4$1(this)));
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        if (!isLocationEnabled(requireContext)) {
            String string = getString(C28330R.string.location_disabled_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.location_disabled_title)");
            String string2 = getString(C28330R.string.location_disabled_warning);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.location_disabled_warning)");
            fragmentDriveMapBinding = inflate;
            FragmentKt.m118838z(this, string, string2, (String) null, (C11289a) null, (String) null, false, (C11289a) null, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, 4092, (Object) null);
        } else {
            fragmentDriveMapBinding = inflate;
        }
        requestPermission();
        initListeners();
        ConstraintLayout root = fragmentDriveMapBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
        this.mapView = null;
    }

    @SuppressLint({"MissingPermission"})
    public void onMapReady(@C12579k C30412c cVar) {
        C31047k<Location> I;
        Intrinsics.checkNotNullParameter(cVar, "map");
        cVar.mo85923r().mo86695n(false);
        cVar.mo85923r().mo86697p(false);
        C33764c<DrivePoint> cVar2 = new C33764c<>(getContext(), cVar);
        this.clusterManager = cVar2;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        cVar2.mo98086w(new CustomClusterRenderer(requireContext, cVar, cVar2, getViewModel().getSelectedDrive$service_release(), new DriveMapFragment$onMapReady$1(this), new DriveMapFragment$onMapReady$2(this, cVar2)));
        cVar2.mo98080q(this);
        cVar2.mo98083t(this);
        this.mapView = cVar;
        cVar.mo85883N(this);
        cVar.mo85880K(this);
        if (this.hasPermission) {
            enableLocationButtonOnMap();
            C30327e eVar = this.fusedLocationProvider;
            if (!(eVar == null || (I = eVar.mo85674I()) == null)) {
                I.mo87721e(new C28421a(this));
            }
        } else {
            cVar.mo85928w(C30409b.m122333e(this.defaultLatLon, this.defaultZoomLvl));
        }
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new DriveMapFragment$onMapReady$4(this, (C11045c<? super DriveMapFragment$onMapReady$4>) null), 3, (Object) null);
    }

    public void onMapsSdkInitialized(@C12579k MapsInitializer.Renderer renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        int i = WhenMappings.$EnumSwitchMapping$0[renderer.ordinal()];
    }

    public final void setApplication(@C12579k Application application2) {
        Intrinsics.checkNotNullParameter(application2, "<set-?>");
        this.application = application2;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.navigator = cVar;
    }

    /* access modifiers changed from: private */
    public final boolean onClusterClick(C30587h hVar) {
        C30412c cVar = this.mapView;
        if (cVar == null) {
            return false;
        }
        cVar.mo85910h(C30409b.m122333e(hVar.mo86557c(), (float) Math.floor((double) (cVar.mo85916k().f72991b + ((float) 1)))), 300, (C30412c.C30413a) null);
        return true;
    }
}
