package com.carrefour.fid.android.shared.util.environment;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.app.C28443a;
import com.carrefour.fid.android.shared.type.C28883c;
import com.carrefour.fid.android.shared.util.C28935i;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C8567o(parameters = 0)
public final class AppEnvironment implements C28443a {
    @C12579k

    /* renamed from: d */
    public static final C28911a f70823d = new C28911a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f70824e = 8;
    @C12579k

    /* renamed from: f */
    public static final String f70825f = "one_app_env";
    @C12579k

    /* renamed from: g */
    public static final String f70826g = "app_environment_type";
    @C12579k

    /* renamed from: a */
    public final C28443a f70827a;

    /* renamed from: b */
    public final SharedPreferences f70828b;
    @C12579k

    /* renamed from: c */
    public final C11677z f70829c = C10864b0.m38748c(new AppEnvironment$type$2(this));

    /* renamed from: com.carrefour.fid.android.shared.util.environment.AppEnvironment$a */
    public static final class C28911a {
        public /* synthetic */ C28911a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28911a() {
        }
    }

    @Inject
    public AppEnvironment(@C10255b @C12579k Context context, @C12579k C28443a aVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "appInfo");
        this.f70827a = aVar;
        this.f70828b = context.getSharedPreferences(f70825f, 0);
        C28935i iVar = C28935i.f70940a;
        String string = context.getString(mo84161H().mo84189b());
        C28935i.m119706i(iVar, "AppEnvironment: " + string, (Throwable) null, 0, 6, (Object) null);
    }

    @C12579k
    /* renamed from: A */
    public final String mo84154A() {
        return mo84161H().mo84190c().mo83460e0();
    }

    @C12579k
    /* renamed from: B */
    public final String mo84155B() {
        return mo84161H().mo84190c().mo83463f0();
    }

    @C12579k
    /* renamed from: C */
    public final String mo84156C() {
        return mo84161H().mo84190c().mo83467h0();
    }

    @C12579k
    /* renamed from: D */
    public final String mo84157D() {
        return mo84161H().mo84190c().mo83470i0();
    }

    @C12579k
    /* renamed from: E */
    public final String mo84158E() {
        return mo84161H().mo84190c().mo83472j0();
    }

    @C12579k
    /* renamed from: F */
    public final String mo84159F() {
        return mo84161H().mo84190c().mo83474k0();
    }

    @C12579k
    /* renamed from: G */
    public final String mo84160G() {
        return mo84161H().mo84190c().mo83476l0();
    }

    @C12579k
    /* renamed from: H */
    public final C28912a mo84161H() {
        return (C28912a) this.f70829c.getValue();
    }

    /* renamed from: I */
    public final void mo84162I() {
        this.f70828b.edit().clear().apply();
    }

    /* renamed from: J */
    public final void mo84163J(@C12580l C28912a aVar) {
        if (aVar == null) {
            mo84162I();
        } else {
            this.f70828b.edit().putInt(f70826g, aVar.mo84188a()).apply();
        }
    }

    @C12579k
    /* renamed from: a */
    public String mo32753a() {
        return this.f70827a.mo32753a();
    }

    @C12579k
    /* renamed from: b */
    public String mo32754b() {
        return this.f70827a.mo32754b();
    }

    @C12579k
    /* renamed from: d */
    public final String mo84164d() {
        return mo84161H().mo84190c().mo83432H();
    }

    @C12579k
    /* renamed from: e */
    public final String mo84165e() {
        return mo84161H().mo84190c().mo83433I();
    }

    @C12579k
    /* renamed from: f */
    public final String mo84166f() {
        return mo84161H().mo84190c().mo83434J();
    }

    @C12579k
    /* renamed from: g */
    public final String mo84167g() {
        return mo84161H().mo84190c().mo83435K();
    }

    @C12579k
    /* renamed from: h */
    public final String mo84168h() {
        return mo84161H().mo84190c().mo83436L();
    }

    @C12579k
    /* renamed from: i */
    public final String mo84169i() {
        return mo84161H().mo84190c().mo83437M();
    }

    @C12579k
    /* renamed from: j */
    public final String mo84170j() {
        return mo84161H().mo84190c().mo83438N();
    }

    @C12579k
    /* renamed from: k */
    public final String mo84171k() {
        return mo84161H().mo84190c().mo83439O();
    }

    @C12579k
    /* renamed from: l */
    public final String mo84172l() {
        return mo84161H().mo84190c().mo83440P();
    }

    @C12579k
    /* renamed from: m */
    public final String mo84173m() {
        return mo84161H().mo84190c().mo83441Q();
    }

    @C12579k
    /* renamed from: n */
    public final String mo84174n() {
        return mo84161H().mo84190c().mo83442R();
    }

    @C12579k
    /* renamed from: o */
    public final String mo84175o() {
        return mo84161H().mo84190c().mo83443S();
    }

    @C12579k
    /* renamed from: p */
    public final String mo84176p() {
        return mo84161H().mo84190c().mo83444T();
    }

    @C12579k
    /* renamed from: q */
    public final String mo84177q() {
        return mo84161H().mo84190c().mo83445U();
    }

    @C12579k
    /* renamed from: r */
    public final String mo84178r() {
        return mo84161H().mo84190c().mo83446V();
    }

    @C12579k
    /* renamed from: s */
    public final String mo84179s() {
        return mo84161H().mo84190c().mo83447W();
    }

    @C12579k
    /* renamed from: t */
    public final C28883c mo84180t() {
        return mo84161H().mo84190c().mo83448X();
    }

    @C12579k
    /* renamed from: u */
    public final String mo84181u() {
        return mo84161H().mo84190c().mo83449Y();
    }

    @C12579k
    /* renamed from: v */
    public final String mo84182v() {
        return mo84161H().mo84190c().mo83452a0();
    }

    @C12579k
    /* renamed from: w */
    public final String mo84183w() {
        return mo84161H().mo84190c().mo83454b0();
    }

    @C12579k
    /* renamed from: x */
    public final String mo84184x() {
        return mo84161H().mo84190c().mo83456c0();
    }

    @C12579k
    /* renamed from: y */
    public final String mo84185y() {
        return mo84161H().mo84190c().mo83465g0();
    }

    @C12579k
    /* renamed from: z */
    public final String mo84186z() {
        return mo84161H().mo84190c().mo83458d0();
    }
}
