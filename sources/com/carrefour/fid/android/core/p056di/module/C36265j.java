package com.carrefour.fid.android.core.p056di.module;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.app.C17180n4;
import com.CritizrSDK.C21424c;
import com.carrefour.fid.android.app.C13824a;
import com.carrefour.fid.android.app.utils.C13835a;
import com.carrefour.fid.android.app.utils.C13836b;
import com.carrefour.fid.android.data.logm.AppLogMAppContext;
import com.carrefour.fid.android.logm.C38243b;
import com.carrefour.fid.android.navigation.AppNavigator;
import com.carrefour.fid.android.shared.app.C28443a;
import com.carrefour.fid.android.shared.constant.C28543h;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28903a;
import com.carrefour.fid.android.shared.util.C28936j;
import com.google.android.play.core.review.C32121c;
import com.google.android.play.core.review.C32122d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.C32554a;
import com.google.firebase.ktx.C33135b;
import com.google.firebase.remoteconfig.C33563l;
import com.google.firebase.remoteconfig.ktx.C33562c;
import com.google.gson.C33614e;
import com.urbanairship.iam.events.C9175a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.android.qualifiers.C10255b;
import dagger.hilt.components.C10265a;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.di.module.j */
public final class C36265j {

    /* renamed from: a */
    public static final int f89568a = 0;

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: a */
    public final C28903a mo108252a() {
        return new C13835a();
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: b */
    public final C28443a mo108253b() {
        return new C13824a();
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: c */
    public final C21424c mo108254c() {
        C21424c c = C21424c.m98769c(C28543h.f69286a);
        Intrinsics.checkNotNullExpressionValue(c, "getInstance(APP_ENV_CRITIZR_API_KEY)");
        return c;
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: d */
    public final FirebaseAnalytics mo108255d() {
        return C32554a.m131585b(C33135b.f80374a);
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: e */
    public final C33563l mo108256e() {
        return C33562c.m135249b(C33135b.f80374a);
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: f */
    public final C28936j mo108257f() {
        return new C13836b();
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: g */
    public final C33614e mo108258g() {
        return new C33614e();
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: h */
    public final C38243b mo108259h(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return new AppLogMAppContext(context);
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: i */
    public final C28796c mo108260i() {
        return new AppNavigator();
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: j */
    public final C17180n4 mo108261j(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C17180n4 p = C17180n4.m79433p(context);
        Intrinsics.checkNotNullExpressionValue(p, "from(context)");
        return p;
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: k */
    public final C32121c mo108262k(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C32121c a = C32122d.m130038a(context);
        Intrinsics.checkNotNullExpressionValue(a, "create(context)");
        return a;
    }
}
