package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.internal.location.C41802u0;
import com.google.android.gms.internal.location.C41811z;

/* renamed from: com.google.android.gms.location.a */
public class C30311a {
    @RecentlyNonNull

    /* renamed from: a */
    public static final String f72763a = "activity_recognition";
    @RecentlyNonNull

    /* renamed from: b */
    public static final C40477a<C40477a.C40481d.C40485d> f72764b;
    @RecentlyNonNull
    @Deprecated

    /* renamed from: c */
    public static final C30315b f72765c = new C41802u0();

    /* renamed from: d */
    public static final C40477a.C40490g<C41811z> f72766d;

    /* renamed from: e */
    public static final C40477a.C40478a<C41811z, C40477a.C40481d.C40485d> f72767e;

    static {
        C40477a.C40490g<C41811z> gVar = new C40477a.C40490g<>();
        f72766d = gVar;
        C30385t tVar = new C30385t();
        f72767e = tVar;
        f72764b = new C40477a<>("ActivityRecognition.API", tVar, gVar);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C30319c m122109a(@RecentlyNonNull Activity activity) {
        return new C30319c(activity);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static C30319c m122110b(@RecentlyNonNull Context context) {
        return new C30319c(context);
    }
}
