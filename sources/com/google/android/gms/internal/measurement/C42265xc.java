package com.google.android.gms.internal.measurement;

import android.support.p002v4.media.session.PlaybackStateCompat;
import com.urbanairship.AirshipConfigOptions;

/* renamed from: com.google.android.gms.internal.measurement.xc */
public final class C42265xc implements C42248wc {

    /* renamed from: A */
    public static final C41983h7 f106496A;

    /* renamed from: B */
    public static final C41983h7 f106497B;

    /* renamed from: C */
    public static final C41983h7 f106498C;

    /* renamed from: D */
    public static final C41983h7 f106499D;

    /* renamed from: E */
    public static final C41983h7 f106500E;

    /* renamed from: F */
    public static final C41983h7 f106501F;

    /* renamed from: G */
    public static final C41983h7 f106502G;

    /* renamed from: H */
    public static final C41983h7 f106503H;

    /* renamed from: I */
    public static final C41983h7 f106504I;

    /* renamed from: J */
    public static final C41983h7 f106505J;

    /* renamed from: K */
    public static final C41983h7 f106506K;

    /* renamed from: L */
    public static final C41983h7 f106507L;

    /* renamed from: M */
    public static final C41983h7 f106508M;

    /* renamed from: N */
    public static final C41983h7 f106509N;

    /* renamed from: O */
    public static final C41983h7 f106510O;

    /* renamed from: P */
    public static final C41983h7 f106511P;

    /* renamed from: a */
    public static final C41983h7 f106512a;

    /* renamed from: b */
    public static final C41983h7 f106513b;

    /* renamed from: c */
    public static final C41983h7 f106514c;

    /* renamed from: d */
    public static final C41983h7 f106515d;

    /* renamed from: e */
    public static final C41983h7 f106516e;

    /* renamed from: f */
    public static final C41983h7 f106517f;

    /* renamed from: g */
    public static final C41983h7 f106518g;

    /* renamed from: h */
    public static final C41983h7 f106519h;

    /* renamed from: i */
    public static final C41983h7 f106520i;

    /* renamed from: j */
    public static final C41983h7 f106521j;

    /* renamed from: k */
    public static final C41983h7 f106522k;

    /* renamed from: l */
    public static final C41983h7 f106523l;

    /* renamed from: m */
    public static final C41983h7 f106524m;

    /* renamed from: n */
    public static final C41983h7 f106525n;

    /* renamed from: o */
    public static final C41983h7 f106526o;

    /* renamed from: p */
    public static final C41983h7 f106527p;

    /* renamed from: q */
    public static final C41983h7 f106528q;

    /* renamed from: r */
    public static final C41983h7 f106529r;

    /* renamed from: s */
    public static final C41983h7 f106530s;

    /* renamed from: t */
    public static final C41983h7 f106531t;

    /* renamed from: u */
    public static final C41983h7 f106532u;

    /* renamed from: v */
    public static final C41983h7 f106533v;

    /* renamed from: w */
    public static final C41983h7 f106534w;

    /* renamed from: x */
    public static final C41983h7 f106535x;

    /* renamed from: y */
    public static final C41983h7 f106536y;

    /* renamed from: z */
    public static final C41983h7 f106537z;

    static {
        C41911d7 a = new C41911d7(C42225v6.m170951a("com.google.android.gms.measurement")).mo136681a();
        f106512a = a.mo136684d("measurement.ad_id_cache_time", 10000);
        f106513b = a.mo136684d("measurement.app_uninstalled_additional_ad_id_cache_time", 0);
        f106514c = a.mo136684d("measurement.max_bundles_per_iteration", 100);
        f106515d = a.mo136684d("measurement.config.cache_time", 86400000);
        f106516e = a.mo136685e("measurement.log_tag", "FA");
        f106517f = a.mo136685e("measurement.config.url_authority", "app-measurement.com");
        f106518g = a.mo136685e("measurement.config.url_scheme", "https");
        f106519h = a.mo136684d("measurement.upload.debug_upload_interval", 1000);
        f106520i = a.mo136684d("measurement.id.app_uninstalled_additional_ad_id_cache_time", 0);
        f106521j = a.mo136684d("measurement.lifetimevalue.max_currency_tracked", 4);
        f106522k = a.mo136684d("measurement.store.max_stored_events_per_app", 100000);
        f106523l = a.mo136684d("measurement.experiment.max_ids", 50);
        f106524m = a.mo136684d("measurement.audience.filter_result_max_count", 200);
        f106525n = a.mo136684d("measurement.upload.max_item_scoped_custom_parameters", 27);
        f106526o = a.mo136684d("measurement.alarm_manager.minimum_interval", AirshipConfigOptions.f87111Y);
        f106527p = a.mo136684d("measurement.upload.minimum_delay", 500);
        f106528q = a.mo136684d("measurement.monitoring.sample_period_millis", 86400000);
        f106529r = a.mo136684d("measurement.upload.realtime_upload_interval", 10000);
        f106530s = a.mo136684d("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        f106531t = a.mo136684d("measurement.config.cache_time.service", 3600000);
        f106532u = a.mo136684d("measurement.service_client.idle_disconnect_millis", 5000);
        f106533v = a.mo136685e("measurement.log_tag.service", "FA-SVC");
        f106534w = a.mo136684d("measurement.upload.stale_data_deletion_interval", 86400000);
        f106535x = a.mo136684d("measurement.sdk.attribution.cache.ttl", 604800000);
        f106536y = a.mo136684d("measurement.redaction.app_instance_id.ttl", 7200000);
        f106537z = a.mo136684d("measurement.upload.backoff_period", 43200000);
        f106496A = a.mo136684d("measurement.upload.initial_upload_delay_time", 15000);
        f106497B = a.mo136684d("measurement.upload.interval", 3600000);
        f106498C = a.mo136684d("measurement.upload.max_bundle_size", PlaybackStateCompat.f476R0);
        f106499D = a.mo136684d("measurement.upload.max_bundles", 100);
        f106500E = a.mo136684d("measurement.upload.max_conversions_per_day", 500);
        f106501F = a.mo136684d("measurement.upload.max_error_events_per_day", 1000);
        f106502G = a.mo136684d("measurement.upload.max_events_per_bundle", 1000);
        f106503H = a.mo136684d("measurement.upload.max_events_per_day", 100000);
        f106504I = a.mo136684d("measurement.upload.max_public_events_per_day", 50000);
        f106505J = a.mo136684d("measurement.upload.max_queue_time", 2419200000L);
        f106506K = a.mo136684d("measurement.upload.max_realtime_events_per_day", 10);
        f106507L = a.mo136684d("measurement.upload.max_batch_size", PlaybackStateCompat.f476R0);
        f106508M = a.mo136684d("measurement.upload.retry_count", 6);
        f106509N = a.mo136684d("measurement.upload.retry_time", 1800000);
        f106510O = a.mo136685e("measurement.upload.url", "https://app-measurement.com/a");
        f106511P = a.mo136684d("measurement.upload.window_interval", 3600000);
    }

    /* renamed from: D */
    public final long mo137407D() {
        return ((Long) f106502G.mo137007b()).longValue();
    }

    /* renamed from: F */
    public final long mo137408F() {
        return ((Long) f106501F.mo137007b()).longValue();
    }

    /* renamed from: G0 */
    public final long mo137409G0() {
        return ((Long) f106496A.mo137007b()).longValue();
    }

    /* renamed from: J */
    public final long mo137410J() {
        return ((Long) f106499D.mo137007b()).longValue();
    }

    /* renamed from: M */
    public final long mo137411M() {
        return ((Long) f106532u.mo137007b()).longValue();
    }

    /* renamed from: P */
    public final long mo137412P() {
        return ((Long) f106503H.mo137007b()).longValue();
    }

    /* renamed from: Q0 */
    public final long mo137413Q0() {
        return ((Long) f106536y.mo137007b()).longValue();
    }

    /* renamed from: R */
    public final long mo137414R() {
        return ((Long) f106497B.mo137007b()).longValue();
    }

    /* renamed from: S */
    public final long mo137415S() {
        return ((Long) f106507L.mo137007b()).longValue();
    }

    /* renamed from: U */
    public final long mo137416U() {
        return ((Long) f106500E.mo137007b()).longValue();
    }

    /* renamed from: V0 */
    public final long mo137417V0() {
        return ((Long) f106537z.mo137007b()).longValue();
    }

    /* renamed from: X */
    public final long mo137418X() {
        return ((Long) f106508M.mo137007b()).longValue();
    }

    /* renamed from: a */
    public final String mo137419a() {
        return (String) f106517f.mo137007b();
    }

    /* renamed from: a0 */
    public final long mo137420a0() {
        return ((Long) f106498C.mo137007b()).longValue();
    }

    /* renamed from: b */
    public final String mo137421b() {
        return (String) f106518g.mo137007b();
    }

    /* renamed from: c */
    public final long mo137422c() {
        return ((Long) f106509N.mo137007b()).longValue();
    }

    /* renamed from: d */
    public final long mo137423d() {
        return ((Long) f106514c.mo137007b()).longValue();
    }

    /* renamed from: e */
    public final long mo137424e() {
        return ((Long) f106515d.mo137007b()).longValue();
    }

    /* renamed from: f */
    public final long mo137425f() {
        return ((Long) f106519h.mo137007b()).longValue();
    }

    /* renamed from: g */
    public final long mo137426g() {
        return ((Long) f106511P.mo137007b()).longValue();
    }

    /* renamed from: h */
    public final long mo137427h() {
        return ((Long) f106522k.mo137007b()).longValue();
    }

    /* renamed from: i */
    public final long mo137428i() {
        return ((Long) f106535x.mo137007b()).longValue();
    }

    /* renamed from: j */
    public final long mo137429j() {
        return ((Long) f106523l.mo137007b()).longValue();
    }

    /* renamed from: k */
    public final long mo137430k() {
        return ((Long) f106524m.mo137007b()).longValue();
    }

    /* renamed from: l */
    public final String mo137431l() {
        return (String) f106510O.mo137007b();
    }

    /* renamed from: o */
    public final long mo137432o() {
        return ((Long) f106521j.mo137007b()).longValue();
    }

    /* renamed from: p */
    public final long mo137433p() {
        return ((Long) f106525n.mo137007b()).longValue();
    }

    /* renamed from: q */
    public final long mo137434q() {
        return ((Long) f106527p.mo137007b()).longValue();
    }

    /* renamed from: r */
    public final long mo137435r() {
        return ((Long) f106528q.mo137007b()).longValue();
    }

    /* renamed from: s */
    public final long mo137436s() {
        return ((Long) f106529r.mo137007b()).longValue();
    }

    /* renamed from: t */
    public final long mo137437t() {
        return ((Long) f106526o.mo137007b()).longValue();
    }

    /* renamed from: u */
    public final long mo137438u() {
        return ((Long) f106530s.mo137007b()).longValue();
    }

    /* renamed from: v */
    public final long mo137439v() {
        return ((Long) f106534w.mo137007b()).longValue();
    }

    /* renamed from: w */
    public final long mo137440w() {
        return ((Long) f106505J.mo137007b()).longValue();
    }

    /* renamed from: x */
    public final long mo137441x() {
        return ((Long) f106506K.mo137007b()).longValue();
    }

    /* renamed from: y */
    public final long mo137442y() {
        return ((Long) f106504I.mo137007b()).longValue();
    }

    public final long zza() {
        return ((Long) f106512a.mo137007b()).longValue();
    }

    public final long zzb() {
        return ((Long) f106513b.mo137007b()).longValue();
    }
}
