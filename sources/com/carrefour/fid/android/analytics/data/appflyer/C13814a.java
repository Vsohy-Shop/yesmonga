package com.carrefour.fid.android.analytics.data.appflyer;

import android.content.Context;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.carrefour.fid.android.analytics.C13760b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.interactors.account.C37518d;
import com.carrefour.fid.android.shared.constant.C28564m1;
import com.carrefour.fid.android.shared.constant.PrivacyConsentCategory;
import com.carrefour.fid.android.shared.p045di.annotation.C28659c;
import com.carrefour.fid.android.shared.privacy.C28876b;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.maps.internal.C30519p1;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
/* renamed from: com.carrefour.fid.android.analytics.data.appflyer.a */
public final class C13814a implements C28876b {
    @C12579k

    /* renamed from: E0 */
    public static final String f33682E0 = "af_loyalty_primes_type";
    @C12579k

    /* renamed from: F0 */
    public static final String f33683F0 = "af_loyalty_card";
    @C12579k

    /* renamed from: G0 */
    public static final String f33684G0 = "af_loyalty_card_creation";
    @C12579k

    /* renamed from: H0 */
    public static final String f33685H0 = "af_new_customer";
    @C12579k

    /* renamed from: I0 */
    public static final String f33686I0 = "af_revenue";
    @C12579k

    /* renamed from: J0 */
    public static final String f33687J0 = "af_serviceCRF";
    @C12579k

    /* renamed from: K0 */
    public static final String f33688K0 = "DRIVE";
    @C12579k

    /* renamed from: L0 */
    public static final String f33689L0 = "MKTP";
    @C12579k

    /* renamed from: M0 */
    public static final String f33690M0 = "R2H";
    @C12579k

    /* renamed from: N0 */
    public static final String f33691N0 = "CLCV";
    @C12579k

    /* renamed from: O0 */
    public static final String f33692O0 = "af_content_type";
    @C12579k

    /* renamed from: P0 */
    public static final String f33693P0 = "product";
    @C12579k

    /* renamed from: Q0 */
    public static final String f33694Q0 = "af_order_id";
    @C12579k

    /* renamed from: R0 */
    public static final String f33695R0 = "af_content_id";
    @C12579k

    /* renamed from: S0 */
    public static final String f33696S0 = "af_quantity";
    @C12579k

    /* renamed from: T0 */
    public static final String f33697T0 = "af_price";
    @C12579k

    /* renamed from: U0 */
    public static final String f33698U0 = "af_currency";
    @C12579k

    /* renamed from: V0 */
    public static final String f33699V0 = "EUR";
    @C12579k

    /* renamed from: W0 */
    public static final String f33700W0 = "af_content";
    @C12579k

    /* renamed from: X */
    public static final String f33701X = "af_content_view";
    @C12579k

    /* renamed from: X0 */
    public static final String f33702X0 = "content_id";
    @C12579k

    /* renamed from: Y */
    public static final String f33703Y = "af_add_to_cart";
    @C12579k

    /* renamed from: Y0 */
    public static final String f33704Y0 = "quantity";
    @C12579k

    /* renamed from: Z */
    public static final String f33705Z = "af_loyalty_primes";
    @C12579k

    /* renamed from: Z0 */
    public static final String f33706Z0 = "brand";
    @C12579k

    /* renamed from: f */
    public static final C13815a f33707f = new C13815a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: g */
    public static final String f33708g = "install";
    @C12579k

    /* renamed from: v */
    public static final String f33709v = "open";
    @C12579k

    /* renamed from: w */
    public static final String f33710w = "Oui";
    @C12579k

    /* renamed from: x */
    public static final String f33711x = "af_login";
    @C12579k

    /* renamed from: y */
    public static final String f33712y = "completed_purchase";
    @C12579k

    /* renamed from: z */
    public static final String f33713z = "af_purchase";
    @C12579k

    /* renamed from: a */
    public final C12074o0 f33714a;
    @C12579k

    /* renamed from: b */
    public final AppsFlyerLib f33715b;
    @C12579k

    /* renamed from: c */
    public final C13783a f33716c;
    @C12579k

    /* renamed from: d */
    public final C37518d f33717d;
    @C12579k

    /* renamed from: e */
    public final Context f33718e;

    /* renamed from: com.carrefour.fid.android.analytics.data.appflyer.a$a */
    public static final class C13815a {
        public /* synthetic */ C13815a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C13815a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.analytics.data.appflyer.a$b */
    public static final class C13816b implements AppsFlyerConversionListener {
        public void onAppOpenAttribution(@C12580l Map<String, String> map) {
        }

        public void onAttributionFailure(@C12580l String str) {
        }

        public void onConversionDataFail(@C12580l String str) {
        }

        public void onConversionDataSuccess(@C12580l Map<String, Object> map) {
        }
    }

    /* renamed from: com.carrefour.fid.android.analytics.data.appflyer.a$c */
    public static final class C13817c implements AppsFlyerRequestListener {
        public void onError(int i, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C30519p1.f72971a);
            C28935i iVar = C28935i.f70940a;
            C28935i.m119704b(iVar, "appFlyers not sent with error " + str, (Throwable) null, 0, 6, (Object) null);
        }

        public void onSuccess() {
            C28935i.m119704b(C28935i.f70940a, "appFlyers event sent with success", (Throwable) null, 0, 6, (Object) null);
        }
    }

    @Inject
    public C13814a(@C28659c @C12579k C12074o0 o0Var, @C12579k AppsFlyerLib appsFlyerLib, @C12579k C13783a aVar, @C12579k C37518d dVar, @C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(o0Var, "coroutineScope");
        Intrinsics.checkNotNullParameter(appsFlyerLib, "appsFlyerLib");
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(dVar, "getUserUidIamUseCase");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f33714a = o0Var;
        this.f33715b = appsFlyerLib;
        this.f33716c = aVar;
        this.f33717d = dVar;
        this.f33718e = context;
    }

    /* renamed from: a */
    public void mo32686a() {
        mo32731b();
        if (mo32689f(this.f33718e)) {
            mo32735i(this.f33718e, "open", C10975r0.m41401k(C11078d1.m42659a("open", "open")));
        }
    }

    /* renamed from: b */
    public final void mo32731b() {
        String string = this.f33718e.getString(C13760b.C13778r.app_flayer_key);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.app_flayer_key)");
        this.f33715b.init(string, new C13816b(), this.f33718e);
        mo32734h(this.f33718e);
        mo32733g(this.f33717d.invoke());
        HashMap hashMap = new HashMap();
        hashMap.put(C28564m1.f69584r, String.valueOf(AppsFlyerLib.getInstance().getAppsFlyerUID(this.f33718e)));
        this.f33716c.mo32708k(hashMap);
    }

    @C12579k
    /* renamed from: c */
    public String mo32687c() {
        return PrivacyConsentCategory.APPS_FLYER.mo83424q();
    }

    /* renamed from: d */
    public final void mo32732d() {
        mo32735i(this.f33718e, f33708g, C10975r0.m41401k(C11078d1.m42659a(f33708g, f33708g)));
    }

    /* renamed from: e */
    public void mo32688e() {
        this.f33715b.stop(true, this.f33718e);
    }

    /* renamed from: f */
    public boolean mo32689f(@C12579k Context context) {
        return C28876b.C28877a.m119433a(this, context);
    }

    /* renamed from: g */
    public final void mo32733g(String str) {
        this.f33715b.setCustomerUserId(str);
    }

    /* renamed from: h */
    public final void mo32734h(Context context) {
        this.f33715b.start(context);
    }

    /* renamed from: i */
    public final void mo32735i(@C12579k Context context, @C12579k String str, @C12580l Map<String, String> map) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "eventName");
        this.f33715b.logEvent(context, str, map, new C13817c());
    }
}
