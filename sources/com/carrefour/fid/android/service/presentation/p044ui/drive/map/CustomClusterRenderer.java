package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import android.content.Context;
import androidx.compose.p004ui.graphics.C15258l2;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import com.carrefour.fid.android.shared.util.DebounceKt;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.model.C30587h;
import com.google.maps.android.clustering.C33750a;
import com.google.maps.android.clustering.C33764c;
import com.google.maps.android.clustering.view.C33778f;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.C11763t;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\"\u001a\u00020!\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0011\u0012K\u0010\u0019\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00060\u0014\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060%¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013RY\u0010\u0019\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006)"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/map/CustomClusterRenderer;", "Lcom/google/maps/android/clustering/view/f;", "Lcom/carrefour/fid/android/service/presentation/model/DrivePoint;", "drivePoint", "Lcom/google/android/gms/maps/model/h;", "marker", "Lkotlin/d2;", "onClusterItemRendered", "Lcom/google/maps/android/clustering/a;", "cluster", "onClusterRendered", "", "clusterSize", "getColor", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lkotlinx/coroutines/flow/u;", "selectedDrive", "Lkotlinx/coroutines/flow/u;", "Lkotlin/Function3;", "Lkotlin/n0;", "name", "", "isSelected", "onUpdateMarkerIcon", "Lkotlin/jvm/functions/q;", "Lkotlinx/coroutines/o0;", "scope", "Lkotlinx/coroutines/o0;", "Lkotlinx/coroutines/channels/t;", "channel", "Lkotlinx/coroutines/channels/t;", "Lcom/google/android/gms/maps/c;", "map", "Lcom/google/maps/android/clustering/c;", "clusterManager", "Lkotlin/Function0;", "onDrivesNotClusteredChanged", "<init>", "(Landroid/content/Context;Lcom/google/android/gms/maps/c;Lcom/google/maps/android/clustering/c;Lkotlinx/coroutines/flow/u;Lkotlin/jvm/functions/q;Lkotlin/jvm/functions/a;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.CustomClusterRenderer */
public final class CustomClusterRenderer extends C33778f<DrivePoint> {
    /* access modifiers changed from: private */
    @C12579k
    public final C11763t<C11079d2> channel;
    @C12579k
    private final Context context;
    @C12579k
    private final C11305q<C30587h, DrivePoint, Boolean, C11079d2> onUpdateMarkerIcon;
    @C12579k
    private final C12074o0 scope;
    @C12579k
    private final C11952u<DrivePoint> selectedDrive;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomClusterRenderer(@C12579k Context context2, @C12579k C30412c cVar, @C12579k C33764c<DrivePoint> cVar2, @C12579k C11952u<DrivePoint> uVar, @C12579k C11305q<? super C30587h, ? super DrivePoint, ? super Boolean, C11079d2> qVar, @C12579k C11289a<C11079d2> aVar) {
        super(context2, cVar, cVar2);
        Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(cVar, "map");
        Intrinsics.checkNotNullParameter(cVar2, "clusterManager");
        Intrinsics.checkNotNullParameter(uVar, "selectedDrive");
        Intrinsics.checkNotNullParameter(qVar, "onUpdateMarkerIcon");
        Intrinsics.checkNotNullParameter(aVar, "onDrivesNotClusteredChanged");
        this.context = context2;
        this.selectedDrive = uVar;
        this.onUpdateMarkerIcon = qVar;
        C12074o0 a = C12079p0.m48260a(C11768d1.m46783e());
        this.scope = a;
        this.channel = DebounceKt.m119481a(a, 50, new CustomClusterRenderer$channel$1(aVar));
    }

    public int getColor(int i) {
        return C15258l2.m66193r(C37475b.f94185a.mo114242j());
    }

    public void onClusterRendered(@C12579k C33750a<DrivePoint> aVar, @C12579k C30587h hVar) {
        Intrinsics.checkNotNullParameter(aVar, "cluster");
        Intrinsics.checkNotNullParameter(hVar, "marker");
        hVar.mo86572p(0.5f, 0.5f);
        hVar.mo86581y(this.context.getString(C28330R.string.accessibility_cluster_click));
        hVar.mo86565i();
        super.onClusterRendered(aVar, hVar);
    }

    public void onClusterItemRendered(@C12579k DrivePoint drivePoint, @C12579k C30587h hVar) {
        Intrinsics.checkNotNullParameter(drivePoint, "drivePoint");
        Intrinsics.checkNotNullParameter(hVar, "marker");
        hVar.mo86580x(drivePoint);
        C11305q<C30587h, DrivePoint, Boolean, C11079d2> qVar = this.onUpdateMarkerIcon;
        DrivePoint value = this.selectedDrive.getValue();
        qVar.invoke(hVar, drivePoint, Boolean.valueOf(Intrinsics.areEqual((Object) value != null ? value.getStoreId() : null, (Object) drivePoint.getStoreId())));
        hVar.mo86565i();
        C11723c2 unused = C12038j.m48061f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new CustomClusterRenderer$onClusterItemRendered$1(this, (C11045c<? super CustomClusterRenderer$onClusterItemRendered$1>) null), 3, (Object) null);
    }
}
