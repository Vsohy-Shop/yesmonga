package com.carrefour.fid.android.storelocator.presentation.presenters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.core.p057io.OneAppServiceException;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37830b;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.C38166m;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import com.carrefour.fid.android.domain.models.service.models.StoreCoordinates;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.carrefour.fid.android.storelocator.p048ui.contracts.C28968a;
import com.carrefour.fid.android.storelocator.presentation.contracts.C28961c;
import com.carrefour.fid.android.utils.C22712k;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.gms.location.C30327e;
import com.google.android.gms.location.C30354k;
import com.google.android.gms.location.C30366n;
import com.google.android.gms.location.C30382s;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.C31047k;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.C10262b;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nFacilitiesSearchPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacilitiesSearchPresenter.kt\ncom/carrefour/fid/android/storelocator/presentation/presenters/FacilitiesSearchPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
public final class FacilitiesSearchPresenter implements C28961c, LocationListener {

    /* renamed from: s */
    public static final int f71000s = 8;
    @C12579k

    /* renamed from: a */
    public final C12074o0 f71001a;
    @C12579k

    /* renamed from: b */
    public C13783a f71002b;
    @C12579k

    /* renamed from: c */
    public C30327e f71003c;
    @C12579k

    /* renamed from: d */
    public final C11677z f71004d;
    @C12579k

    /* renamed from: e */
    public final String f71005e;
    @C12579k

    /* renamed from: f */
    public final String f71006f;
    @C12579k

    /* renamed from: g */
    public C28968a f71007g;
    @C12579k

    /* renamed from: h */
    public LocationManager f71008h;
    @C12579k

    /* renamed from: i */
    public LatLng f71009i;
    @C12580l

    /* renamed from: j */
    public LatLng f71010j;
    @C12580l

    /* renamed from: k */
    public Location f71011k;
    @C12579k

    /* renamed from: l */
    public Context f71012l;
    @C12579k

    /* renamed from: m */
    public C30354k f71013m;

    /* renamed from: n */
    public LocationRequest f71014n;
    @C12579k

    /* renamed from: o */
    public final LocationSettingsRequest.C30310a f71015o;

    /* renamed from: p */
    public final LocationSettingsRequest f71016p;

    /* renamed from: q */
    public C31047k<C30366n> f71017q;

    /* renamed from: r */
    public boolean f71018r;

    /* renamed from: com.carrefour.fid.android.storelocator.presentation.presenters.FacilitiesSearchPresenter$a */
    public static final class C28963a extends C30354k {

        /* renamed from: a */
        public final /* synthetic */ FacilitiesSearchPresenter f71019a;

        public C28963a(FacilitiesSearchPresenter facilitiesSearchPresenter) {
            this.f71019a = facilitiesSearchPresenter;
        }

        public void onLocationResult(@C12580l LocationResult locationResult) {
            Location location;
            List<Location> X;
            if (this.f71019a.f71007g.mo84347M() && !this.f71019a.mo84318B()) {
                FacilitiesSearchPresenter facilitiesSearchPresenter = this.f71019a;
                if (locationResult == null || (X = locationResult.mo85594X()) == null) {
                    location = null;
                } else {
                    location = X.get(0);
                }
                facilitiesSearchPresenter.mo84327L(location);
            }
        }
    }

    @C10267e({C10265a.class})
    @C10262b
    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/storelocator/presentation/presenters/FacilitiesSearchPresenter$b;", "", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/b;", "n", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.storelocator.presentation.presenters.FacilitiesSearchPresenter$b */
    public interface C28964b {
        @C12579k
        /* renamed from: n */
        C37830b mo34028n();
    }

    /* renamed from: com.carrefour.fid.android.storelocator.presentation.presenters.FacilitiesSearchPresenter$c */
    public /* synthetic */ class C28965c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.core.io.OneAppServiceException$Kind[] r0 = com.carrefour.fid.android.core.p057io.OneAppServiceException.Kind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.core.io.OneAppServiceException$Kind r1 = com.carrefour.fid.android.core.p057io.OneAppServiceException.Kind.NETWORK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.core.io.OneAppServiceException$Kind r1 = com.carrefour.fid.android.core.p057io.OneAppServiceException.Kind.HTTP_WITH_BODY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.core.io.OneAppServiceException$Kind r1 = com.carrefour.fid.android.core.p057io.OneAppServiceException.Kind.HTTP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.storelocator.presentation.presenters.FacilitiesSearchPresenter.C28965c.<clinit>():void");
        }
    }

    public FacilitiesSearchPresenter(@C12579k C28968a aVar, @C12579k C12074o0 o0Var, @C12579k LocationManager locationManager, @C12579k Context context, @C12579k C13783a aVar2, @C12579k C30327e eVar, @C12579k C30382s sVar) {
        Intrinsics.checkNotNullParameter(aVar, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar2, "mAnalyticManager");
        Intrinsics.checkNotNullParameter(eVar, "mFusedLocationProviderClient");
        Intrinsics.checkNotNullParameter(sVar, "mSettingsClient");
        this.f71001a = o0Var;
        this.f71002b = aVar2;
        this.f71003c = eVar;
        this.f71004d = C10864b0.m38748c(FacilitiesSearchPresenter$entryPoint$2.f71020f);
        this.f71005e = "store-locator";
        this.f71006f = "me-geolocaliser";
        this.f71007g = aVar;
        this.f71008h = locationManager;
        this.f71009i = C22712k.C22713a.f58204a.mo67131a();
        this.f71012l = context;
        LocationRequest M = LocationRequest.m122055M();
        M.mo85574G1(100);
        M.mo85586j1(10000);
        M.mo85578N0(2000);
        this.f71014n = M;
        LocationSettingsRequest.C30310a b = new LocationSettingsRequest.C30310a().mo85601b(this.f71014n);
        Intrinsics.checkNotNullExpressionValue(b, "Builder().addLocationRequest(mLocationRequest)");
        this.f71015o = b;
        LocationSettingsRequest c = b.mo85602c();
        this.f71016p = c;
        this.f71017q = sVar.mo85753G(c);
        this.f71013m = new C28963a(this);
    }

    /* renamed from: E */
    public static final void m119803E(FacilitiesSearchPresenter facilitiesSearchPresenter, Exception exc) {
        Intrinsics.checkNotNullParameter(facilitiesSearchPresenter, "this$0");
        Intrinsics.checkNotNullParameter(exc, "it");
        facilitiesSearchPresenter.f71007g.mo84348O(exc);
    }

    /* renamed from: M */
    public static /* synthetic */ void m119804M(FacilitiesSearchPresenter facilitiesSearchPresenter, Location location, int i, Object obj) {
        if ((i & 1) != 0) {
            location = facilitiesSearchPresenter.mo84338y();
        }
        facilitiesSearchPresenter.mo84327L(location);
    }

    @C12579k
    /* renamed from: A */
    public final Context mo84317A() {
        return this.f71012l;
    }

    /* renamed from: B */
    public final boolean mo84318B() {
        return this.f71018r;
    }

    @C12580l
    /* renamed from: C */
    public final Location mo84319C() {
        return this.f71011k;
    }

    /* renamed from: D */
    public final void mo84320D() {
        this.f71017q.mo87724h(new C28967b(this));
    }

    /* renamed from: F */
    public final void mo84321F(double d, double d2, boolean z) {
        LatLng latLng = new LatLng(d, d2);
        this.f71009i = latLng;
        mo84301e(z, latLng);
    }

    /* renamed from: G */
    public final void mo84322G(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f71002b = aVar;
    }

    /* renamed from: H */
    public final void mo84323H(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.f71012l = context;
    }

    /* renamed from: I */
    public final void mo84324I(boolean z) {
        this.f71018r = z;
    }

    /* renamed from: J */
    public final void mo84325J(@C12580l Location location) {
        this.f71011k = location;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: K */
    public final void mo84326K() {
        this.f71003c.mo85679N(this.f71014n, this.f71013m, (Looper) null);
    }

    /* renamed from: L */
    public final void mo84327L(Location location) {
        C11079d2 d2Var;
        if (location != null) {
            this.f71011k = location;
            this.f71007g.mo84350q(location);
            mo84321F(location.getLatitude(), location.getLongitude(), false);
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            mo84326K();
        }
    }

    /* renamed from: N */
    public final void mo84328N(StoreCoordinates storeCoordinates, boolean z, LatLngBounds latLngBounds) {
        this.f71010j = new LatLng(Double.parseDouble(storeCoordinates.mo119145e()), Double.parseDouble(storeCoordinates.mo119147f()));
        if (!z && latLngBounds != null) {
            this.f71007g.mo84346A0(latLngBounds);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void mo84297a(@C12579k String str) {
        boolean z;
        List<Address> list;
        Intrinsics.checkNotNullParameter(str, "value");
        try {
            boolean z2 = true;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                list = new Geocoder(this.f71012l).getFromLocationName(str + " france", 1);
            } else {
                list = Collections.emptyList();
            }
            Collection collection = list;
            if (collection != null) {
                if (!collection.isEmpty()) {
                    z2 = false;
                }
            }
            if (!z2) {
                Address address = (Address) CollectionsKt___CollectionsKt.m40706w2(list);
                mo84310n(new LatLng(address.getLatitude(), address.getLongitude()));
                return;
            }
            String string = this.f71012l.getString(R.string.general_no_result);
            C28968a aVar = this.f71007g;
            Intrinsics.checkNotNullExpressionValue(string, "it");
            aVar.mo84345A(string, false);
        } catch (Exception unused) {
            String string2 = this.f71012l.getString(R.string.general_no_result);
            C28968a aVar2 = this.f71007g;
            Intrinsics.checkNotNullExpressionValue(string2, "it");
            aVar2.mo84345A(string2, false);
        }
    }

    /* renamed from: b */
    public void mo84298b() {
        C13783a.m58668o(this.f71002b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, this.f71005e), C11078d1.m42659a("screen_name", this.f71006f), C11078d1.m42659a(C28526d.f68929i, this.f71005e), C11078d1.m42659a(C28526d.f68933j, C28531e0.f69083m)), false, 2, (Object) null);
    }

    /* renamed from: c */
    public void mo84299c() {
        this.f71003c.mo85677L(this.f71013m);
    }

    /* renamed from: d */
    public void mo84300d(boolean z) {
        Pair pair;
        C13783a aVar = this.f71002b;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, this.f71005e);
        pairArr[2] = C11078d1.m42659a("screen_name", this.f71006f);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, this.f71005e);
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, "me-geolocaliser");
        if (z) {
            pair = C11078d1.m42659a(C28526d.f68937k, C28531e0.f69089s);
        } else {
            pair = C11078d1.m42659a(C28526d.f68937k, C28531e0.f69091u);
        }
        pairArr[5] = pair;
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: e */
    public void mo84301e(boolean z, @C12579k LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "geoCoordinates");
        C11723c2 unused = C12038j.m48061f(this.f71001a, (CoroutineContext) null, (CoroutineStart) null, new FacilitiesSearchPresenter$fetchStoreByCoordinates$1(this, latLng, z, (C11045c<? super FacilitiesSearchPresenter$fetchStoreByCoordinates$1>) null), 3, (Object) null);
    }

    /* renamed from: f */
    public void mo84302f() {
        mo84305i(this.f71008h.isProviderEnabled("gps"));
    }

    /* renamed from: g */
    public void mo84303g(@C12580l OneAppServiceException oneAppServiceException) {
        OneAppServiceException.Kind kind;
        int i;
        if (oneAppServiceException != null) {
            kind = oneAppServiceException.mo108364e();
        } else {
            kind = null;
        }
        if (kind == null) {
            i = -1;
        } else {
            i = C28965c.$EnumSwitchMapping$0[kind.ordinal()];
        }
        if (i == 1) {
            C28968a aVar = this.f71007g;
            String string = this.f71012l.getString(R.string.general_error_parameters_server_not_responding_02);
            Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(R.str…server_not_responding_02)");
            aVar.mo84345A(string, true);
        } else if (i == 2 || i == 3) {
            C28968a aVar2 = this.f71007g;
            String string2 = this.f71012l.getString(R.string.general_no_result);
            Intrinsics.checkNotNullExpressionValue(string2, "mContext.getString(\n    …_result\n                )");
            aVar2.mo84345A(string2, true);
        } else {
            C28968a aVar3 = this.f71007g;
            String string3 = this.f71012l.getString(R.string.general_error_parameters_server_not_responding_02);
            Intrinsics.checkNotNullExpressionValue(string3, "mContext.getString(R.str…server_not_responding_02)");
            aVar3.mo84345A(string3, true);
        }
    }

    /* renamed from: h */
    public void mo84304h() {
        C13783a.m58668o(this.f71002b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, this.f71005e), C11078d1.m42659a("screen_name", this.f71006f), C11078d1.m42659a(C28526d.f68929i, this.f71005e), C11078d1.m42659a(C28526d.f68933j, "me-geolocaliser"), C11078d1.m42659a(C28526d.f68937k, C28531e0.f69088r)), false, 2, (Object) null);
    }

    /* renamed from: i */
    public void mo84305i(boolean z) {
        if (z) {
            m119804M(this, (Location) null, 1, (Object) null);
        } else {
            mo84320D();
        }
    }

    /* renamed from: j */
    public void mo84306j() {
    }

    /* renamed from: k */
    public void mo84307k(boolean z) {
        this.f71018r = z;
    }

    /* renamed from: l */
    public void mo84308l(@C12580l LatLng latLng) {
        if (mo84333t(latLng) && latLng != null) {
            mo84321F(latLng.f73028a, latLng.f73029b, true);
        }
    }

    /* renamed from: m */
    public void mo84309m() {
        if (this.f71008h.isProviderEnabled("gps")) {
            m119804M(this, (Location) null, 1, (Object) null);
        }
    }

    /* renamed from: n */
    public void mo84310n(@C12579k LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        C11723c2 unused = C12038j.m48061f(this.f71001a, (CoroutineContext) null, (CoroutineStart) null, new FacilitiesSearchPresenter$onSearchStoreClicked$1(this, latLng, (C11045c<? super FacilitiesSearchPresenter$onSearchStoreClicked$1>) null), 3, (Object) null);
    }

    public void onLocationChanged(@C12579k Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        Location location2 = this.f71011k;
        if (location2 != null && !Intrinsics.areEqual((Object) location2, (Object) location)) {
            m119804M(this, (Location) null, 1, (Object) null);
        }
    }

    public void onProviderDisabled(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "alertMessage");
        mo84320D();
    }

    @SuppressLint({"MissingPermission"})
    public void onProviderEnabled(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "alertMessage");
        m119804M(this, (Location) null, 1, (Object) null);
    }

    public void onStatusChanged(@C12580l String str, int i, @C12580l Bundle bundle) {
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f71002b, "store-locator", "me-geolocaliser", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: t */
    public final boolean mo84333t(LatLng latLng) {
        float[] fArr = new float[1];
        LatLng latLng2 = this.f71010j;
        if (latLng2 != null) {
            Intrinsics.checkNotNull(latLng2);
            double d = latLng2.f73028a;
            LatLng latLng3 = this.f71010j;
            Intrinsics.checkNotNull(latLng3);
            double d2 = latLng3.f73029b;
            Intrinsics.checkNotNull(latLng);
            Location.distanceBetween(d, d2, latLng.f73028a, latLng.f73029b, fArr);
        }
        if (this.f71010j != null && fArr[0] <= 1500.0f) {
            return false;
        }
        this.f71010j = latLng;
        return true;
    }

    /* renamed from: u */
    public final void mo84334u(C38166m mVar, boolean z) {
        StoreAddress v;
        StoreCoordinates k;
        List<C38163l> d = mVar.mo119402d();
        if (d == null) {
            d = CollectionsKt__CollectionsKt.m40441E();
        }
        if (!d.isEmpty()) {
            LatLngBounds v2 = mo84335v(d);
            this.f71007g.mo84349a0();
            this.f71007g.mo84352z0(d);
            this.f71007g.mo84351s();
            C38163l lVar = (C38163l) CollectionsKt___CollectionsKt.m40479B2(d);
            if (!(lVar == null || (v = lVar.mo119392v()) == null || (k = v.mo119130k()) == null)) {
                mo84328N(k, z, v2);
                return;
            }
        }
        String string = this.f71012l.getString(R.string.general_no_result);
        C28968a aVar = this.f71007g;
        Intrinsics.checkNotNullExpressionValue(string, "it");
        aVar.mo84345A(string, false);
    }

    /* renamed from: v */
    public final LatLngBounds mo84335v(List<C38163l> list) {
        StoreCoordinates k;
        if (list == null) {
            return null;
        }
        LatLngBounds.C30570a M = LatLngBounds.m123046M();
        Intrinsics.checkNotNullExpressionValue(M, "builder()");
        for (C38163l v : list) {
            StoreAddress v2 = v.mo119392v();
            if (!(v2 == null || (k = v2.mo119130k()) == null)) {
                M.mo86351b(new LatLng(Double.parseDouble(k.mo119145e()), Double.parseDouble(k.mo119147f())));
            }
        }
        return M.mo86350a();
    }

    @C12579k
    /* renamed from: w */
    public final LocationSettingsRequest.C30310a mo84336w() {
        return this.f71015o;
    }

    /* renamed from: x */
    public final C28964b mo84337x() {
        return (C28964b) this.f71004d.getValue();
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: y */
    public final Location mo84338y() {
        List<String> providers = this.f71008h.getProviders(true);
        Intrinsics.checkNotNullExpressionValue(providers, "mLocManager.getProviders(true)");
        Location location = null;
        for (String lastKnownLocation : providers) {
            Location lastKnownLocation2 = this.f71008h.getLastKnownLocation(lastKnownLocation);
            if (lastKnownLocation2 != null && (location == null || lastKnownLocation2.getAccuracy() < location.getAccuracy())) {
                location = lastKnownLocation2;
            }
        }
        return location;
    }

    @C12579k
    /* renamed from: z */
    public final C13783a mo84339z() {
        return this.f71002b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FacilitiesSearchPresenter(com.carrefour.fid.android.storelocator.p048ui.contracts.C28968a r10, kotlinx.coroutines.C12074o0 r11, android.location.LocationManager r12, android.content.Context r13, com.carrefour.fid.android.analytics.data.analytics.C13783a r14, com.google.android.gms.location.C30327e r15, com.google.android.gms.location.C30382s r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 16
            if (r0 == 0) goto L_0x0010
            com.carrefour.fid.android.OneAppApplication$a r0 = com.carrefour.fid.android.OneAppApplication.f32244w
            com.carrefour.fid.android.OneAppApplication r0 = r0.mo30856a()
            com.carrefour.fid.android.analytics.data.analytics.a r0 = r0.mo30844d()
            r6 = r0
            goto L_0x0011
        L_0x0010:
            r6 = r14
        L_0x0011:
            r0 = r17 & 32
            if (r0 == 0) goto L_0x0020
            com.google.android.gms.location.e r0 = com.google.android.gms.location.C30362m.m122188b(r13)
            java.lang.String r1 = "getFusedLocationProviderClient(context)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r7 = r0
            goto L_0x0021
        L_0x0020:
            r7 = r15
        L_0x0021:
            r0 = r17 & 64
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.location.s r0 = com.google.android.gms.location.C30362m.m122192f(r13)
            java.lang.String r1 = "getSettingsClient(context)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r8 = r0
            goto L_0x0032
        L_0x0030:
            r8 = r16
        L_0x0032:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.storelocator.presentation.presenters.FacilitiesSearchPresenter.<init>(com.carrefour.fid.android.storelocator.ui.contracts.a, kotlinx.coroutines.o0, android.location.LocationManager, android.content.Context, com.carrefour.fid.android.analytics.data.analytics.a, com.google.android.gms.location.e, com.google.android.gms.location.s, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
