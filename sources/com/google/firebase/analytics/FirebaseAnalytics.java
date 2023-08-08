package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0380x0;
import androidx.annotation.C0386z0;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.measurement.C41979h3;
import com.google.android.gms.measurement.internal.C30831o7;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.installations.C33084j;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class FirebaseAnalytics {

    /* renamed from: c */
    public static volatile FirebaseAnalytics f78869c;

    /* renamed from: a */
    public final C41979h3 f78870a;

    /* renamed from: b */
    public ExecutorService f78871b;

    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$a */
    public static class C32531a {
        @C0359n0

        /* renamed from: A */
        public static final String f78878A = "screen_view";
        @C0359n0

        /* renamed from: B */
        public static final String f78879B = "remove_from_cart";
        @C0359n0

        /* renamed from: C */
        public static final String f78880C = "add_shipping_info";
        @C0359n0

        /* renamed from: D */
        public static final String f78881D = "purchase";
        @C0359n0

        /* renamed from: E */
        public static final String f78882E = "refund";
        @C0359n0

        /* renamed from: F */
        public static final String f78883F = "select_item";
        @C0359n0

        /* renamed from: G */
        public static final String f78884G = "select_promotion";
        @C0359n0

        /* renamed from: H */
        public static final String f78885H = "view_cart";
        @C0359n0

        /* renamed from: I */
        public static final String f78886I = "view_promotion";
        @C0359n0

        /* renamed from: a */
        public static final String f78887a = "ad_impression";
        @C0359n0

        /* renamed from: b */
        public static final String f78888b = "add_payment_info";
        @C0359n0

        /* renamed from: c */
        public static final String f78889c = "add_to_cart";
        @C0359n0

        /* renamed from: d */
        public static final String f78890d = "add_to_wishlist";
        @C0359n0

        /* renamed from: e */
        public static final String f78891e = "app_open";
        @C0359n0

        /* renamed from: f */
        public static final String f78892f = "begin_checkout";
        @C0359n0

        /* renamed from: g */
        public static final String f78893g = "campaign_details";
        @C0359n0

        /* renamed from: h */
        public static final String f78894h = "generate_lead";
        @C0359n0

        /* renamed from: i */
        public static final String f78895i = "join_group";
        @C0359n0

        /* renamed from: j */
        public static final String f78896j = "level_end";
        @C0359n0

        /* renamed from: k */
        public static final String f78897k = "level_start";
        @C0359n0

        /* renamed from: l */
        public static final String f78898l = "level_up";
        @C0359n0

        /* renamed from: m */
        public static final String f78899m = "login";
        @C0359n0

        /* renamed from: n */
        public static final String f78900n = "post_score";
        @C0359n0

        /* renamed from: o */
        public static final String f78901o = "search";
        @C0359n0

        /* renamed from: p */
        public static final String f78902p = "select_content";
        @C0359n0

        /* renamed from: q */
        public static final String f78903q = "share";
        @C0359n0

        /* renamed from: r */
        public static final String f78904r = "sign_up";
        @C0359n0

        /* renamed from: s */
        public static final String f78905s = "spend_virtual_currency";
        @C0359n0

        /* renamed from: t */
        public static final String f78906t = "tutorial_begin";
        @C0359n0

        /* renamed from: u */
        public static final String f78907u = "tutorial_complete";
        @C0359n0

        /* renamed from: v */
        public static final String f78908v = "unlock_achievement";
        @C0359n0

        /* renamed from: w */
        public static final String f78909w = "view_item";
        @C0359n0

        /* renamed from: x */
        public static final String f78910x = "view_item_list";
        @C0359n0

        /* renamed from: y */
        public static final String f78911y = "view_search_results";
        @C0359n0

        /* renamed from: z */
        public static final String f78912z = "earn_virtual_currency";
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$b */
    public static class C32532b {
        @C0359n0

        /* renamed from: A */
        public static final String f78913A = "origin";
        @C0359n0

        /* renamed from: B */
        public static final String f78914B = "price";
        @C0359n0

        /* renamed from: C */
        public static final String f78915C = "quantity";
        @C0359n0

        /* renamed from: D */
        public static final String f78916D = "score";
        @C0359n0

        /* renamed from: E */
        public static final String f78917E = "shipping";
        @C0359n0

        /* renamed from: F */
        public static final String f78918F = "transaction_id";
        @C0359n0

        /* renamed from: G */
        public static final String f78919G = "search_term";
        @C0359n0

        /* renamed from: H */
        public static final String f78920H = "success";
        @C0359n0

        /* renamed from: I */
        public static final String f78921I = "tax";
        @C0359n0

        /* renamed from: J */
        public static final String f78922J = "value";
        @C0359n0

        /* renamed from: K */
        public static final String f78923K = "virtual_currency_name";
        @C0359n0

        /* renamed from: L */
        public static final String f78924L = "campaign";
        @C0359n0

        /* renamed from: M */
        public static final String f78925M = "source";
        @C0359n0

        /* renamed from: N */
        public static final String f78926N = "medium";
        @C0359n0

        /* renamed from: O */
        public static final String f78927O = "term";
        @C0359n0

        /* renamed from: P */
        public static final String f78928P = "content";
        @C0359n0

        /* renamed from: Q */
        public static final String f78929Q = "aclid";
        @C0359n0

        /* renamed from: R */
        public static final String f78930R = "cp1";
        @C0359n0

        /* renamed from: S */
        public static final String f78931S = "item_brand";
        @C0359n0

        /* renamed from: T */
        public static final String f78932T = "item_variant";
        @C0359n0

        /* renamed from: U */
        public static final String f78933U = "creative_name";
        @C0359n0

        /* renamed from: V */
        public static final String f78934V = "creative_slot";
        @C0359n0

        /* renamed from: W */
        public static final String f78935W = "affiliation";
        @C0359n0

        /* renamed from: X */
        public static final String f78936X = "index";
        @C0359n0

        /* renamed from: Y */
        public static final String f78937Y = "discount";
        @C0359n0

        /* renamed from: Z */
        public static final String f78938Z = "item_category2";
        @C0359n0

        /* renamed from: a */
        public static final String f78939a = "achievement_id";
        @C0359n0

        /* renamed from: a0 */
        public static final String f78940a0 = "item_category3";
        @C0359n0

        /* renamed from: b */
        public static final String f78941b = "ad_format";
        @C0359n0

        /* renamed from: b0 */
        public static final String f78942b0 = "item_category4";
        @C0359n0

        /* renamed from: c */
        public static final String f78943c = "ad_platform";
        @C0359n0

        /* renamed from: c0 */
        public static final String f78944c0 = "item_category5";
        @C0359n0

        /* renamed from: d */
        public static final String f78945d = "ad_source";
        @C0359n0

        /* renamed from: d0 */
        public static final String f78946d0 = "item_list_id";
        @C0359n0

        /* renamed from: e */
        public static final String f78947e = "ad_unit_name";
        @C0359n0

        /* renamed from: e0 */
        public static final String f78948e0 = "item_list_name";
        @C0359n0

        /* renamed from: f */
        public static final String f78949f = "character";
        @C0359n0

        /* renamed from: f0 */
        public static final String f78950f0 = "items";
        @C0359n0

        /* renamed from: g */
        public static final String f78951g = "travel_class";
        @C0359n0

        /* renamed from: g0 */
        public static final String f78952g0 = "location_id";
        @C0359n0

        /* renamed from: h */
        public static final String f78953h = "content_type";
        @C0359n0

        /* renamed from: h0 */
        public static final String f78954h0 = "payment_type";
        @C0359n0

        /* renamed from: i */
        public static final String f78955i = "currency";
        @C0359n0

        /* renamed from: i0 */
        public static final String f78956i0 = "promotion_id";
        @C0359n0

        /* renamed from: j */
        public static final String f78957j = "coupon";
        @C0359n0

        /* renamed from: j0 */
        public static final String f78958j0 = "promotion_name";
        @C0359n0

        /* renamed from: k */
        public static final String f78959k = "start_date";
        @C0359n0

        /* renamed from: k0 */
        public static final String f78960k0 = "screen_class";
        @C0359n0

        /* renamed from: l */
        public static final String f78961l = "end_date";
        @C0359n0

        /* renamed from: l0 */
        public static final String f78962l0 = "screen_name";
        @C0359n0

        /* renamed from: m */
        public static final String f78963m = "extend_session";
        @C0359n0

        /* renamed from: m0 */
        public static final String f78964m0 = "shipping_tier";
        @C0359n0

        /* renamed from: n */
        public static final String f78965n = "flight_number";
        @C0359n0

        /* renamed from: o */
        public static final String f78966o = "group_id";
        @C0359n0

        /* renamed from: p */
        public static final String f78967p = "item_category";
        @C0359n0

        /* renamed from: q */
        public static final String f78968q = "item_id";
        @C0359n0

        /* renamed from: r */
        public static final String f78969r = "item_name";
        @C0359n0

        /* renamed from: s */
        public static final String f78970s = "location";
        @C0359n0

        /* renamed from: t */
        public static final String f78971t = "level";
        @C0359n0

        /* renamed from: u */
        public static final String f78972u = "level_name";
        @C0359n0

        /* renamed from: v */
        public static final String f78973v = "method";
        @C0359n0

        /* renamed from: w */
        public static final String f78974w = "number_of_nights";
        @C0359n0

        /* renamed from: x */
        public static final String f78975x = "number_of_passengers";
        @C0359n0

        /* renamed from: y */
        public static final String f78976y = "number_of_rooms";
        @C0359n0

        /* renamed from: z */
        public static final String f78977z = "destination";
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$c */
    public static class C32533c {
        @C0359n0

        /* renamed from: a */
        public static final String f78978a = "sign_up_method";
        @C0359n0

        /* renamed from: b */
        public static final String f78979b = "allow_personalized_ads";
    }

    public FirebaseAnalytics(C41979h3 h3Var) {
        C40843u.m166202l(h3Var);
        this.f78870a = h3Var;
    }

    @C0380x0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @C0359n0
    @Keep
    public static FirebaseAnalytics getInstance(@C0359n0 Context context) {
        if (f78869c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f78869c == null) {
                    f78869c = new FirebaseAnalytics(C41979h3.m170032D(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f78869c;
    }

    @C0363p0
    @Keep
    public static C30831o7 getScionFrontendApiImplementation(Context context, @C0363p0 Bundle bundle) {
        C41979h3 D = C41979h3.m170032D(context, (String) null, (String) null, (String) null, bundle);
        if (D == null) {
            return null;
        }
        return new C32553d(D);
    }

    @C0359n0
    /* renamed from: a */
    public C31047k<String> mo94630a() {
        try {
            return C31053n.m124522d(mo94641l(), new C32535b(this));
        } catch (RuntimeException e) {
            this.f78870a.mo136911b(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            return C31053n.m124524f(e);
        }
    }

    @C0359n0
    /* renamed from: b */
    public C31047k<Long> mo94631b() {
        try {
            return C31053n.m124522d(mo94641l(), new C32536c(this));
        } catch (RuntimeException e) {
            this.f78870a.mo136911b(5, "Failed to schedule task for getSessionId", (Object) null, (Object) null, (Object) null);
            return C31053n.m124524f(e);
        }
    }

    /* renamed from: c */
    public void mo94632c(@C0359n0 @C0386z0(max = 40, min = 1) String str, @C0363p0 Bundle bundle) {
        this.f78870a.mo136908V(str, bundle);
    }

    /* renamed from: d */
    public void mo94633d() {
        this.f78870a.mo136913d();
    }

    /* renamed from: e */
    public void mo94634e(boolean z) {
        this.f78870a.mo136921l(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public void mo94635f(@C0359n0 Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int ordinal = consentStatus.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int ordinal2 = consentStatus2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        this.f78870a.mo136916g(bundle);
    }

    /* renamed from: g */
    public void mo94636g(@C0363p0 Bundle bundle) {
        this.f78870a.mo136919j(bundle);
    }

    @C0359n0
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C31053n.m124520b(C33084j.m133440u().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: h */
    public void mo94638h(long j) {
        this.f78870a.mo136922m(j);
    }

    /* renamed from: i */
    public void mo94639i(@C0363p0 String str) {
        this.f78870a.mo136923n(str);
    }

    /* renamed from: j */
    public void mo94640j(@C0359n0 @C0386z0(max = 24, min = 1) String str, @C0363p0 @C0386z0(max = 36) String str2) {
        this.f78870a.mo136924o((String) null, str, str2, false);
    }

    @EnsuresNonNull({"this.executor"})
    /* renamed from: l */
    public final ExecutorService mo94641l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.f78871b == null) {
                this.f78871b = new C32534a(this, 0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f78871b;
        }
        return executorService;
    }

    @C0353k0
    @Deprecated
    @Keep
    public void setCurrentScreen(@C0359n0 Activity activity, @C0363p0 @C0386z0(max = 36, min = 1) String str, @C0363p0 @C0386z0(max = 36, min = 1) String str2) {
        this.f78870a.mo136917h(activity, str, str2);
    }
}
