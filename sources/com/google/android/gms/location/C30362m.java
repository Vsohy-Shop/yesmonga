package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.location.C41764f;
import com.google.android.gms.internal.location.C41768g0;
import com.google.android.gms.internal.location.C41784l1;
import com.google.android.gms.internal.location.C41811z;

/* renamed from: com.google.android.gms.location.m */
public class C30362m {
    @RecentlyNonNull

    /* renamed from: a */
    public static final C40477a<C40477a.C40481d.C40485d> f72826a;
    @RecentlyNonNull
    @Deprecated

    /* renamed from: b */
    public static final C30323d f72827b = new C41784l1();
    @RecentlyNonNull
    @Deprecated

    /* renamed from: c */
    public static final C30342h f72828c = new C41764f();
    @RecentlyNonNull
    @Deprecated

    /* renamed from: d */
    public static final C30379r f72829d = new C41768g0();

    /* renamed from: e */
    public static final C40477a.C40490g<C41811z> f72830e;

    /* renamed from: f */
    public static final C40477a.C40478a<C41811z, C40477a.C40481d.C40485d> f72831f;

    static {
        C40477a.C40490g<C41811z> gVar = new C40477a.C40490g<>();
        f72830e = gVar;
        C30321c1 c1Var = new C30321c1();
        f72831f = c1Var;
        f72826a = new C40477a<>("LocationServices.API", c1Var, gVar);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C30327e m122187a(@RecentlyNonNull Activity activity) {
        return new C30327e(activity);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static C30327e m122188b(@RecentlyNonNull Context context) {
        return new C30327e(context);
    }

    @RecentlyNonNull
    /* renamed from: c */
    public static C30346i m122189c(@RecentlyNonNull Activity activity) {
        return new C30346i(activity);
    }

    @RecentlyNonNull
    /* renamed from: d */
    public static C30346i m122190d(@RecentlyNonNull Context context) {
        return new C30346i(context);
    }

    @RecentlyNonNull
    /* renamed from: e */
    public static C30382s m122191e(@RecentlyNonNull Activity activity) {
        return new C30382s(activity);
    }

    @RecentlyNonNull
    /* renamed from: f */
    public static C30382s m122192f(@RecentlyNonNull Context context) {
        return new C30382s(context);
    }

    /* renamed from: g */
    public static C41811z m122193g(C40507i iVar) {
        boolean z;
        boolean z2 = true;
        if (iVar != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166192b(z, "GoogleApiClient parameter is required.");
        C41811z zVar = (C41811z) iVar.mo133754o(f72830e);
        if (zVar == null) {
            z2 = false;
        }
        C40843u.m166209s(z2, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zVar;
    }
}
