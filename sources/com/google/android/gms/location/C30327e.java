package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.C0344h1;
import androidx.annotation.C0380x0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40504h;
import com.google.android.gms.common.api.internal.C40513a0;
import com.google.android.gms.common.api.internal.C40519b;
import com.google.android.gms.common.api.internal.C40520b0;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.common.api.internal.C40599o;
import com.google.android.gms.common.api.internal.C40629u;
import com.google.android.gms.common.api.internal.C40650y;
import com.google.android.gms.internal.location.C41771h0;
import com.google.android.gms.internal.location.C41811z;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.tasks.C31027a;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.location.e */
public class C30327e extends C40504h<C40477a.C40481d.C40485d> {
    @RecentlyNonNull

    /* renamed from: k */
    public static final String f72776k = "mockLocation";
    @RecentlyNonNull

    /* renamed from: l */
    public static final String f72777l = "verticalAccuracy";

    @C0344h1(otherwise = 3)
    public C30327e(@RecentlyNonNull Activity activity) {
        super(activity, C30362m.f72826a, C40477a.C40481d.f103198G, (C40650y) new C40519b());
    }

    @RecentlyNonNull
    /* renamed from: G */
    public C31047k<Void> mo85672G() {
        return mo133727u(C40513a0.m164879a().mo133816c(C30353j2.f72814a).mo133819f(2422).mo133814a());
    }

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: H */
    public C31047k<Location> mo85673H(int i, @RecentlyNonNull C31027a aVar) {
        LocationRequest M = LocationRequest.m122055M();
        M.mo85574G1(i);
        M.mo85586j1(0);
        M.mo85578N0(0);
        M.mo85573C0(30000);
        zzba M2 = zzba.m169191M((String) null, M);
        M2.mo136273X(true);
        M2.mo136271Q(10000);
        C31047k<Location> o = mo133721o(C40513a0.m164879a().mo133816c(new C30391v(this, aVar, M2)).mo133818e(C30345h2.f72803d).mo133819f(2415).mo133814a());
        if (aVar == null) {
            return o;
        }
        C31049l lVar = new C31049l(aVar);
        o.mo87731o(new C30394w(lVar));
        return lVar.mo87741a();
    }

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: I */
    public C31047k<Location> mo85674I() {
        return mo133721o(C40513a0.m164879a().mo133816c(new C30349i2(this)).mo133819f(2414).mo133814a());
    }

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: J */
    public C31047k<LocationAvailability> mo85675J() {
        return mo133721o(C40513a0.m164879a().mo133816c(C30397x.f72862a).mo133819f(2416).mo133814a());
    }

    @RecentlyNonNull
    /* renamed from: K */
    public C31047k<Void> mo85676K(@RecentlyNonNull PendingIntent pendingIntent) {
        return mo133727u(C40513a0.m164879a().mo133816c(new C30312a0(pendingIntent)).mo133819f(2418).mo133814a());
    }

    @RecentlyNonNull
    /* renamed from: L */
    public C31047k<Void> mo85677L(@RecentlyNonNull C30354k kVar) {
        return C40520b0.m164938c(mo133724r(C40599o.m165306c(kVar, C30354k.class.getSimpleName())));
    }

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: M */
    public C31047k<Void> mo85678M(@RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull PendingIntent pendingIntent) {
        return mo133727u(C40513a0.m164879a().mo133816c(new C30403z(this, zzba.m169191M((String) null, locationRequest), pendingIntent)).mo133819f(2417).mo133814a());
    }

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: N */
    public C31047k<Void> mo85679N(@RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull C30354k kVar, @RecentlyNonNull Looper looper) {
        return mo85686U(zzba.m169191M((String) null, locationRequest), kVar, looper, (C30343h0) null, 2436);
    }

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: O */
    public C31047k<Void> mo85680O(@RecentlyNonNull Location location) {
        return mo133727u(C40513a0.m164879a().mo133816c(new C30320c0(location)).mo133819f(2421).mo133814a());
    }

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: P */
    public C31047k<Void> mo85681P(boolean z) {
        return mo133727u(C40513a0.m164879a().mo133816c(new C30316b0(z)).mo133819f(2420).mo133814a());
    }

    /* renamed from: Q */
    public final /* synthetic */ void mo85682Q(zzba zzba, PendingIntent pendingIntent, C41811z zVar, C31049l lVar) throws RemoteException {
        C30347i0 i0Var = new C30347i0(lVar);
        zzba.mo136272W(mo133730x());
        zVar.mo136268y0(zzba, pendingIntent, i0Var);
    }

    /* renamed from: R */
    public final /* synthetic */ void mo85683R(C30351j0 j0Var, C30354k kVar, C30343h0 h0Var, zzba zzba, C40592n nVar, C41811z zVar, C31049l lVar) throws RemoteException {
        C30339g0 g0Var = new C30339g0(lVar, new C30357k2(this, j0Var, kVar, h0Var));
        zzba.mo136272W(mo133730x());
        zVar.mo136266w0(zzba, nVar, g0Var);
    }

    /* renamed from: S */
    public final /* synthetic */ void mo85684S(C31027a aVar, zzba zzba, C41811z zVar, C31049l lVar) throws RemoteException {
        C30324d0 d0Var = new C30324d0(this, lVar);
        if (aVar != null) {
            aVar.mo87706b(new C30361l2(this, d0Var));
        }
        mo85686U(zzba, d0Var, Looper.getMainLooper(), new C30365m2(lVar), 2437).mo87731o(new C30388u(lVar));
    }

    /* renamed from: T */
    public final /* synthetic */ void mo85685T(C41811z zVar, C31049l lVar) throws RemoteException {
        lVar.mo87743c(zVar.mo136264Q0(mo133730x()));
    }

    /* renamed from: U */
    public final C31047k<Void> mo85686U(zzba zzba, C30354k kVar, Looper looper, C30343h0 h0Var, int i) {
        C40592n a = C40599o.m165304a(kVar, C41771h0.m169042a(looper), C30354k.class.getSimpleName());
        C30328e0 e0Var = new C30328e0(this, a);
        return mo133723q(C40629u.m165390a().mo134035c(new C30400y(this, e0Var, kVar, h0Var, zzba, a)).mo134039g(e0Var).mo134040h(a).mo134038f(i).mo134033a());
    }

    @C0344h1(otherwise = 3)
    public C30327e(@RecentlyNonNull Context context) {
        super(context, C30362m.f72826a, C40477a.C40481d.f103198G, (C40650y) new C40519b());
    }
}
