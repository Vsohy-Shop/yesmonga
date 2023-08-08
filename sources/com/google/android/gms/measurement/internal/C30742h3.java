package com.google.android.gms.measurement.internal;

import com.urbanairship.AirshipConfigOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.h3 */
public final class C30742h3 {

    /* renamed from: A */
    public static final C30729g3 f73486A = m123808a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C30700e0.f73348a);

    /* renamed from: A0 */
    public static final C30729g3 f73487A0;

    /* renamed from: B */
    public static final C30729g3 f73488B = m123808a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C30713f0.f73376a);

    /* renamed from: B0 */
    public static final C30729g3 f73489B0;

    /* renamed from: C */
    public static final C30729g3 f73490C = m123808a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C30726g0.f73408a);

    /* renamed from: C0 */
    public static final C30729g3 f73491C0;

    /* renamed from: D */
    public static final C30729g3 f73492D = m123808a("measurement.upload.retry_time", 1800000L, 1800000L, C30752i0.f73590a);

    /* renamed from: D0 */
    public static final C30729g3 f73493D0;

    /* renamed from: E */
    public static final C30729g3 f73494E = m123808a("measurement.upload.retry_count", 6, 6, C30764j0.f73621a);

    /* renamed from: E0 */
    public static final C30729g3 f73495E0;

    /* renamed from: F */
    public static final C30729g3 f73496F = m123808a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C30776k0.f73643a);

    /* renamed from: F0 */
    public static final C30729g3 f73497F0;

    /* renamed from: G */
    public static final C30729g3 f73498G = m123808a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C30800m0.f73738a);

    /* renamed from: G0 */
    public static final C30729g3 f73499G0;

    /* renamed from: H */
    public static final C30729g3 f73500H = m123808a("measurement.audience.filter_result_max_count", 200, 200, C30812n0.f73760a);

    /* renamed from: H0 */
    public static final C30729g3 f73501H0;

    /* renamed from: I */
    public static final C30729g3 f73502I = m123808a("measurement.upload.max_public_user_properties", 25, 25, (C30690d3) null);

    /* renamed from: I0 */
    public static final C30729g3 f73503I0;

    /* renamed from: J */
    public static final C30729g3 f73504J = m123808a("measurement.upload.max_event_name_cardinality", 500, 500, (C30690d3) null);

    /* renamed from: K */
    public static final C30729g3 f73505K = m123808a("measurement.upload.max_public_event_params", 25, 25, (C30690d3) null);

    /* renamed from: L */
    public static final C30729g3 f73506L = m123808a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C30824o0.f73825a);

    /* renamed from: M */
    public static final C30729g3 f73507M;

    /* renamed from: N */
    public static final C30729g3 f73508N = m123808a("measurement.test.string_flag", "---", "---", C30848q0.f73868a);

    /* renamed from: O */
    public static final C30729g3 f73509O = m123808a("measurement.test.long_flag", -1L, -1L, C30860r0.f73896a);

    /* renamed from: P */
    public static final C30729g3 f73510P = m123808a("measurement.test.int_flag", -2, -2, C30884t0.f73955a);

    /* renamed from: Q */
    public static final C30729g3 f73511Q;

    /* renamed from: R */
    public static final C30729g3 f73512R = m123808a("measurement.experiment.max_ids", 50, 50, C30908v0.f74015a);

    /* renamed from: S */
    public static final C30729g3 f73513S = m123808a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, C30920w0.f74039a);

    /* renamed from: T */
    public static final C30729g3 f73514T = m123808a("measurement.max_bundles_per_iteration", 100, 100, C30956z0.f74123a);

    /* renamed from: U */
    public static final C30729g3 f73515U = m123808a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C30649a1.f73216a);

    /* renamed from: V */
    public static final C30729g3 f73516V = m123808a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, C30662b1.f73238a);

    /* renamed from: W */
    public static final C30729g3 f73517W;

    /* renamed from: X */
    public static final C30729g3 f73518X;

    /* renamed from: Y */
    public static final C30729g3 f73519Y;

    /* renamed from: Z */
    public static final C30729g3 f73520Z;

    /* renamed from: a */
    public static final List f73521a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final C30729g3 f73522a0;

    /* renamed from: b */
    public static final Set f73523b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0 */
    public static final C30729g3 f73524b0;

    /* renamed from: c */
    public static final C30729g3 f73525c = m123808a("measurement.ad_id_cache_time", 10000L, 10000L, C30739h0.f73483a);

    /* renamed from: c0 */
    public static final C30729g3 f73526c0;

    /* renamed from: d */
    public static final C30729g3 f73527d = m123808a("measurement.app_uninstalled_additional_ad_id_cache_time", 0L, 0L, C30955z.f74122a);

    /* renamed from: d0 */
    public static final C30729g3 f73528d0;

    /* renamed from: e */
    public static final C30729g3 f73529e = m123808a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C30788l0.f73702a);

    /* renamed from: e0 */
    public static final C30729g3 f73530e0;

    /* renamed from: f */
    public static final C30729g3 f73531f = m123808a("measurement.config.cache_time", 86400000L, 3600000L, C30932x0.f74065a);

    /* renamed from: f0 */
    public static final C30729g3 f73532f0;

    /* renamed from: g */
    public static final C30729g3 f73533g = m123808a("measurement.config.url_scheme", "https", "https", C30777k1.f73644a);

    /* renamed from: g0 */
    public static final C30729g3 f73534g0;

    /* renamed from: h */
    public static final C30729g3 f73535h = m123808a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C30921w1.f74040a);

    /* renamed from: h0 */
    public static final C30729g3 f73536h0;

    /* renamed from: i */
    public static final C30729g3 f73537i = m123808a("measurement.upload.max_bundles", 100, 100, C30766j2.f73623a);

    /* renamed from: i0 */
    public static final C30729g3 f73538i0;

    /* renamed from: j */
    public static final C30729g3 f73539j = m123808a("measurement.upload.max_batch_size", 65536, 65536, C30910v2.f74017a);

    /* renamed from: j0 */
    public static final C30729g3 f73540j0 = m123808a("measurement.service.storage_consent_support_version", 203600, 203600, C30861r1.f73897a);

    /* renamed from: k */
    public static final C30729g3 f73541k = m123808a("measurement.upload.max_bundle_size", 65536, 65536, C30946y2.f74104a);

    /* renamed from: k0 */
    public static final C30729g3 f73542k0;

    /* renamed from: l */
    public static final C30729g3 f73543l = m123808a("measurement.upload.max_events_per_bundle", 1000, 1000, C30958z2.f74127a);

    /* renamed from: l0 */
    public static final C30729g3 f73544l0;

    /* renamed from: m */
    public static final C30729g3 f73545m = m123808a("measurement.upload.max_events_per_day", 100000, 100000, C30872s0.f73929a);

    /* renamed from: m0 */
    public static final C30729g3 f73546m0;

    /* renamed from: n */
    public static final C30729g3 f73547n = m123808a("measurement.upload.max_error_events_per_day", 1000, 1000, C30701e1.f73349a);

    /* renamed from: n0 */
    public static final C30729g3 f73548n0;

    /* renamed from: o */
    public static final C30729g3 f73549o = m123808a("measurement.upload.max_public_events_per_day", 50000, 50000, C30837p1.f73843a);

    /* renamed from: o0 */
    public static final C30729g3 f73550o0;

    /* renamed from: p */
    public static final C30729g3 f73551p = m123808a("measurement.upload.max_conversions_per_day", 10000, 10000, C30663b2.f73239a);

    /* renamed from: p0 */
    public static final C30729g3 f73552p0;

    /* renamed from: q */
    public static final C30729g3 f73553q = m123808a("measurement.upload.max_realtime_events_per_day", 10, 10, C30802m2.f73740a);

    /* renamed from: q0 */
    public static final C30729g3 f73554q0;

    /* renamed from: r */
    public static final C30729g3 f73555r = m123808a("measurement.store.max_stored_events_per_app", 100000, 100000, C30934x2.f74067a);

    /* renamed from: r0 */
    public static final C30729g3 f73556r0;

    /* renamed from: s */
    public static final C30729g3 f73557s = m123808a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C30664b3.f73240a);

    /* renamed from: s0 */
    public static final C30729g3 f73558s0;

    /* renamed from: t */
    public static final C30729g3 f73559t = m123808a("measurement.upload.backoff_period", 43200000L, 43200000L, C30677c3.f73252a);

    /* renamed from: t0 */
    public static final C30729g3 f73560t0;

    /* renamed from: u */
    public static final C30729g3 f73561u = m123808a("measurement.upload.window_interval", 3600000L, 3600000L, C30919w.f74038a);

    /* renamed from: u0 */
    public static final C30729g3 f73562u0;

    /* renamed from: v */
    public static final C30729g3 f73563v = m123808a("measurement.upload.interval", 3600000L, 3600000L, C30943y.f74100a);

    /* renamed from: v0 */
    public static final C30729g3 f73564v0;

    /* renamed from: w */
    public static final C30729g3 f73565w = m123808a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C30648a0.f73215a);

    /* renamed from: w0 */
    public static final C30729g3 f73566w0;

    /* renamed from: x */
    public static final C30729g3 f73567x = m123808a("measurement.upload.debug_upload_interval", 1000L, 1000L, C30661b0.f73237a);

    /* renamed from: x0 */
    public static final C30729g3 f73568x0;

    /* renamed from: y */
    public static final C30729g3 f73569y = m123808a("measurement.upload.minimum_delay", 500L, 500L, C30674c0.f73249a);

    /* renamed from: y0 */
    public static final C30729g3 f73570y0;

    /* renamed from: z */
    public static final C30729g3 f73571z;

    /* renamed from: z0 */
    public static final C30729g3 f73572z0;

    static {
        Long valueOf = Long.valueOf(AirshipConfigOptions.f87111Y);
        f73571z = m123808a("measurement.alarm_manager.minimum_interval", valueOf, valueOf, C30687d0.f73280a);
        Boolean bool = Boolean.FALSE;
        f73507M = m123808a("measurement.test.boolean_flag", bool, bool, C30836p0.f73842a);
        Double valueOf2 = Double.valueOf(-3.0d);
        f73511Q = m123808a("measurement.test.double_flag", valueOf2, valueOf2, C30896u0.f73972a);
        Boolean bool2 = Boolean.TRUE;
        f73517W = m123808a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C30675c1.f73250a);
        f73518X = m123808a("measurement.quality.checksum", bool, bool, (C30690d3) null);
        f73519Y = m123808a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C30688d1.f73281a);
        f73520Z = m123808a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C30714f1.f73377a);
        f73522a0 = m123808a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C30727g1.f73409a);
        f73524b0 = m123808a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C30740h1.f73484a);
        f73526c0 = m123808a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C30753i1.f73591a);
        f73528d0 = m123808a("measurement.lifecycle.app_in_background_parameter", bool, bool, C30765j1.f73622a);
        f73530e0 = m123808a("measurement.integration.disable_firebase_instance_id", bool, bool, C30789l1.f73703a);
        f73532f0 = m123808a("measurement.collection.service.update_with_analytics_fix", bool, bool, C30801m1.f73739a);
        f73534g0 = m123808a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C30813n1.f73761a);
        f73536h0 = m123808a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C30825o1.f73826a);
        f73538i0 = m123808a("measurement.collection.synthetic_data_mitigation", bool, bool, C30849q1.f73869a);
        f73542k0 = m123808a("measurement.client.click_identifier_control.dev", bool, bool, C30873s1.f73930a);
        f73544l0 = m123808a("measurement.service.click_identifier_control", bool, bool, C30885t1.f73956a);
        f73546m0 = m123808a("measurement.service.store_null_safelist", bool2, bool2, C30897u1.f73973a);
        f73548n0 = m123808a("measurement.service.store_safelist", bool2, bool2, C30909v1.f74016a);
        f73550o0 = m123808a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, C30933x1.f74066a);
        f73552p0 = m123808a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, C30945y1.f74103a);
        f73554q0 = m123808a("measurement.session_stitching_token_enabled", bool, bool, C30650a2.f73217a);
        f73556r0 = m123808a("measurement.sgtm.client.dev", bool, bool, C30676c2.f73251a);
        f73558s0 = m123808a("measurement.sgtm.service", bool, bool, C30689d2.f73282a);
        f73560t0 = m123808a("measurement.redaction.retain_major_os_version", bool2, bool2, C30702e2.f73350a);
        f73562u0 = m123808a("measurement.redaction.scion_payload_generator", bool2, bool2, C30715f2.f73378a);
        f73564v0 = m123808a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, C30728g2.f73410a);
        f73566w0 = m123808a("measurement.sessionid.enable_client_session_id", bool2, bool2, C30741h2.f73485a);
        f73568x0 = m123808a("measurement.sfmc.client", bool, bool, C30754i2.f73592a);
        f73570y0 = m123808a("measurement.sfmc.service", bool, bool, C30778k2.f73645a);
        f73572z0 = m123808a("measurement.gmscore_feature_tracking", bool2, bool2, C30790l2.f73704a);
        f73487A0 = m123808a("measurement.fix_health_monitor_stack_trace", bool2, bool2, C30814n2.f73762a);
        f73489B0 = m123808a("measurement.item_scoped_custom_parameters.client", bool2, bool2, C30826o2.f73827a);
        f73491C0 = m123808a("measurement.item_scoped_custom_parameters.service", bool, bool, C30838p2.f73844a);
        f73493D0 = m123808a("measurement.remove_app_background.client", bool, bool, C30850q2.f73870a);
        f73495E0 = m123808a("measurement.rb.attribution.service", bool, bool, C30862r2.f73898a);
        f73497F0 = m123808a("measurement.collection.client.log_target_api_version.dev", bool, bool, C30874s2.f73931a);
        f73499G0 = m123808a("measurement.collection.service.log_target_api_version", bool, bool, C30886t2.f73957a);
        f73501H0 = m123808a("measurement.client.deep_link_referrer_fix.dev", bool, bool, C30898u2.f73974a);
        f73503I0 = m123808a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, C30922w2.f74041a);
    }

    /* renamed from: a */
    public static C30729g3 m123808a(String str, Object obj, Object obj2, C30690d3 d3Var) {
        C30729g3 g3Var = new C30729g3(str, obj, obj2, d3Var, (C30716f3) null);
        f73521a.add(g3Var);
        return g3Var;
    }
}
