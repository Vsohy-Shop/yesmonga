package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19476v0;
import com.carrefour.fid.android.domain.events.checkout.C37494a;
import com.carrefour.fid.android.domain.interactors.utilities.C37887a;
import com.carrefour.fid.android.domain.models.LatLon;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.domain.models.pickup.C38081b;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;

@C10245a
@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\"\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001a8\u0000X\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/PickupPointsMapViewModel;", "Landroidx/lifecycle/v0;", "Lcom/carrefour/fid/android/domain/models/pickup/a;", "pickupPoint", "Lkotlin/d2;", "h0", "Lcom/carrefour/fid/android/domain/models/LatLon;", "latLon", "", "navigateToPickupPoints", "c0", "(Lcom/carrefour/fid/android/domain/models/LatLon;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "g0", "Lcom/carrefour/fid/android/domain/interactors/utilities/a;", "a", "Lcom/carrefour/fid/android/domain/interactors/utilities/a;", "getPickupPointsUseCase", "Lcom/carrefour/fid/android/domain/events/checkout/a;", "b", "Lcom/carrefour/fid/android/domain/events/checkout/a;", "pickupPointProvider", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/domain/models/pickup/b;", "c", "Lkotlinx/coroutines/flow/j;", "_pickupPoints", "Lkotlinx/coroutines/flow/u;", "d", "Lkotlinx/coroutines/flow/u;", "e0", "()Lkotlinx/coroutines/flow/u;", "pickupPoints", "e", "_selectedPickup", "f", "f0", "selectedPickup", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/utilities/a;Lcom/carrefour/fid/android/domain/events/checkout/a;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPickupPointsMapViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickupPointsMapViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/PickupPointsMapViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,41:1\n230#2,5:42\n230#2,5:47\n*S KotlinDebug\n*F\n+ 1 PickupPointsMapViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/PickupPointsMapViewModel\n*L\n28#1:42,5\n33#1:47,5\n*E\n"})
public final class PickupPointsMapViewModel extends C19476v0 {

    /* renamed from: g */
    public static final int f63991g = 8;
    @C12579k

    /* renamed from: a */
    public final C37887a f63992a;
    @C12579k

    /* renamed from: b */
    public final C37494a f63993b;
    @C12579k

    /* renamed from: c */
    public final C11940j<C38081b> f63994c;
    @C12579k

    /* renamed from: d */
    public final C11952u<C38081b> f63995d;
    @C12579k

    /* renamed from: e */
    public final C11940j<C38080a> f63996e;
    @C12579k

    /* renamed from: f */
    public final C11952u<C38080a> f63997f;

    @Inject
    public PickupPointsMapViewModel(@C12579k C37887a aVar, @C12579k C37494a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "getPickupPointsUseCase");
        Intrinsics.checkNotNullParameter(aVar2, "pickupPointProvider");
        this.f63992a = aVar;
        this.f63993b = aVar2;
        C11940j<C38081b> a = C11953v.m47628a(new C38081b(CollectionsKt__CollectionsKt.m40441E(), false));
        this.f63994c = a;
        this.f63995d = C11909g.m47470m(a);
        C11940j<C38080a> a2 = C11953v.m47628a(null);
        this.f63996e = a2;
        this.f63997f = C11909g.m47470m(a2);
    }

    /* renamed from: d0 */
    public static /* synthetic */ Object m111871d0(PickupPointsMapViewModel pickupPointsMapViewModel, LatLon latLon, boolean z, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return pickupPointsMapViewModel.mo76067c0(latLon, z, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76067c0(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.LatLon r5, boolean r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel$fetchPickupPoints$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel$fetchPickupPoints$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel$fetchPickupPoints$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel$fetchPickupPoints$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel$fetchPickupPoints$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            boolean r6 = r0.Z$0
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel) r5
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0050
        L_0x0035:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003d:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.utilities.a r7 = r4.f63992a
            r0.L$0 = r4
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m172966invokegIAlus(r5, r0)
            if (r7 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r5 = r4
        L_0x0050:
            boolean r0 = kotlin.Result.m38710j(r7)
            if (r0 == 0) goto L_0x006c
            java.util.List r7 = (java.util.List) r7
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.pickup.b> r5 = r5.f63994c
        L_0x005a:
            java.lang.Object r0 = r5.getValue()
            r1 = r0
            com.carrefour.fid.android.domain.models.pickup.b r1 = (com.carrefour.fid.android.domain.models.pickup.C38081b) r1
            com.carrefour.fid.android.domain.models.pickup.b r1 = new com.carrefour.fid.android.domain.models.pickup.b
            r1.<init>(r7, r6)
            boolean r0 = r5.mo24216e(r0, r1)
            if (r0 == 0) goto L_0x005a
        L_0x006c:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel.mo76067c0(com.carrefour.fid.android.domain.models.LatLon, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: e0 */
    public final C11952u<C38081b> mo76068e0() {
        return this.f63995d;
    }

    @C12579k
    /* renamed from: f0 */
    public final C11952u<C38080a> mo76069f0() {
        return this.f63997f;
    }

    /* renamed from: g0 */
    public final void mo76070g0(@C12579k C38080a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "pickupPoint");
        this.f63993b.mo114260b(aVar);
    }

    /* renamed from: h0 */
    public final void mo76071h0(@C12579k C38080a aVar) {
        C38080a value;
        Intrinsics.checkNotNullParameter(aVar, "pickupPoint");
        C11940j<C38080a> jVar = this.f63996e;
        do {
            value = jVar.getValue();
            C38080a aVar2 = value;
        } while (!jVar.mo24216e(value, aVar));
    }
}
