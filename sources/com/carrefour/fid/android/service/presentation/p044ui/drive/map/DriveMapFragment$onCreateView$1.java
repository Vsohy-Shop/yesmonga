package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.p004ui.geometry.C15096g;
import com.carrefour.fid.android.service.databinding.FragmentDriveMapBinding;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.google.android.gms.maps.model.C30587h;
import com.google.zxing.client.android.C34651e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/view/MotionEvent;", "e", "Lkotlin/d2;", "invoke", "(Landroid/view/MotionEvent;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$onCreateView$1 */
public final class DriveMapFragment$onCreateView$1 extends Lambda implements C11300l<MotionEvent, C11079d2> {
    final /* synthetic */ FragmentDriveMapBinding $binding;
    final /* synthetic */ DriveMapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveMapFragment$onCreateView$1(DriveMapFragment driveMapFragment, FragmentDriveMapBinding fragmentDriveMapBinding) {
        super(1);
        this.this$0 = driveMapFragment;
        this.$binding = fragmentDriveMapBinding;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, C34651e.f83829d);
        DriveMapFragment driveMapFragment = this.this$0;
        long a = C15096g.m64898a(motionEvent.getX(), motionEvent.getY() - this.$binding.map.getY());
        C284091 r4 = new C11300l<DrivePoint, C11079d2>(this.this$0) {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrivePoint) obj);
                return C11079d2.f28267a;
            }

            public final void invoke(@C12579k DrivePoint drivePoint) {
                Intrinsics.checkNotNullParameter(drivePoint, "p0");
                ((DriveMapFragment) this.receiver).onDriveClick(drivePoint);
            }
        };
        C284102 r5 = new C11300l<C30587h, C11079d2>(this.this$0) {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C30587h) obj);
                return C11079d2.f28267a;
            }

            public final void invoke(@C12579k C30587h hVar) {
                Intrinsics.checkNotNullParameter(hVar, "p0");
                boolean unused = ((DriveMapFragment) this.receiver).onClusterClick(hVar);
            }
        };
        final DriveMapFragment driveMapFragment2 = this.this$0;
        driveMapFragment.m172902findNearestDriveOrClusterM_7yMNQ(a, r4, r5, new C11289a<C11079d2>() {
            public final void invoke() {
                View view = driveMapFragment2.getView();
                if (view != null) {
                    ViewKt.m119012y(view);
                }
                driveMapFragment2.clearCurrentSelection();
                driveMapFragment2.hideCarousel();
            }
        });
    }
}
