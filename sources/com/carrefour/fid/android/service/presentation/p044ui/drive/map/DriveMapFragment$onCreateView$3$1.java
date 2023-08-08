package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import android.location.Location;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel;
import com.google.android.gms.maps.C30412c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$onCreateView$3$1 */
public final class DriveMapFragment$onCreateView$3$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ DriveMapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveMapFragment$onCreateView$3$1(DriveMapFragment driveMapFragment) {
        super(2);
        this.this$0 = driveMapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1341383016, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment.onCreateView.<anonymous>.<anonymous> (DriveMapFragment.kt:233)");
            }
            final DriveMapFragment driveMapFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 157059205, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(157059205, i, -1, "com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (DriveMapFragment.kt:234)");
                        }
                        if (driveMapFragment.getDriveCarouselVisible()) {
                            DriveMapViewModel access$getViewModel = driveMapFragment.getViewModel();
                            List n2 = CollectionsKt___CollectionsKt.m40664n2(driveMapFragment.getMarkerForDrive().keySet());
                            Location access$getLastLocation = driveMapFragment.getLastLocation();
                            C284151 r3 = new C11300l<DrivePoint, C11079d2>(driveMapFragment) {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((DrivePoint) obj);
                                    return C11079d2.f28267a;
                                }

                                public final void invoke(@C12579k DrivePoint drivePoint) {
                                    Intrinsics.checkNotNullParameter(drivePoint, "p0");
                                    DriveMapFragment.centerOnDrive$default((DriveMapFragment) this.receiver, drivePoint, false, 2, (Object) null);
                                }
                            };
                            final DriveMapFragment driveMapFragment = driveMapFragment;
                            DriveCarouselStatefulKt.DriveCarouselStateful(access$getViewModel, n2, access$getLastLocation, r3, new C11300l<DrivePoint, C11079d2>() {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((DrivePoint) obj);
                                    return C11079d2.f28267a;
                                }

                                public final void invoke(@C12579k DrivePoint drivePoint) {
                                    Intrinsics.checkNotNullParameter(drivePoint, "it");
                                    Location access$getLastLocation = driveMapFragment.getLastLocation();
                                    float computeDistanceInMeters = access$getLastLocation != null ? StoreLocUtilsKt.computeDistanceInMeters(drivePoint, access$getLastLocation) : -1.0f;
                                    C30412c access$getMapView$p = driveMapFragment.mapView;
                                    if (access$getMapView$p != null) {
                                        access$getMapView$p.mo85914j();
                                    }
                                    driveMapFragment.getViewModel().onDriveSelected(drivePoint, computeDistanceInMeters);
                                }
                            }, oVar, 584, 0);
                        }
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
