package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.collection.C1866a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.f */
public final class C33180f {

    /* renamed from: a */
    public static final String f80560a = "FirebaseMessaging";

    /* renamed from: b */
    public static final String f80561b = "wake:com.google.firebase.messaging";

    /* renamed from: c */
    public static final long f80562c = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: d */
    public static final String f80563d = "error";

    /* renamed from: com.google.firebase.messaging.f$a */
    public static final class C33181a {

        /* renamed from: a */
        public static final String f80564a = "google.c.a.";

        /* renamed from: b */
        public static final String f80565b = "google.c.a.e";

        /* renamed from: c */
        public static final String f80566c = "google.c.a.c_id";

        /* renamed from: d */
        public static final String f80567d = "google.c.a.c_l";

        /* renamed from: e */
        public static final String f80568e = "google.c.a.ts";

        /* renamed from: f */
        public static final String f80569f = "google.c.a.udt";

        /* renamed from: g */
        public static final String f80570g = "google.c.a.tc";

        /* renamed from: h */
        public static final String f80571h = "google.c.a.abt";

        /* renamed from: i */
        public static final String f80572i = "google.c.a.m_l";

        /* renamed from: j */
        public static final String f80573j = "google.c.a.m_c";
    }

    /* renamed from: com.google.firebase.messaging.f$b */
    public static final class C33182b {

        /* renamed from: a */
        public static final String f80574a = "FCM_CLIENT_EVENT_LOGGING";
    }

    /* renamed from: com.google.firebase.messaging.f$c */
    public static final class C33183c {

        /* renamed from: A */
        public static final String f80575A = "gcm.n.click_action";

        /* renamed from: B */
        public static final String f80576B = "gcm.n.link";

        /* renamed from: C */
        public static final String f80577C = "gcm.n.link_android";

        /* renamed from: D */
        public static final String f80578D = "gcm.n.android_channel_id";

        /* renamed from: E */
        public static final String f80579E = "gcm.n.analytics_data";

        /* renamed from: F */
        public static final String f80580F = "_loc_key";

        /* renamed from: G */
        public static final String f80581G = "_loc_args";

        /* renamed from: a */
        public static final String f80582a = "gcm.";

        /* renamed from: b */
        public static final String f80583b = "gcm.n.";

        /* renamed from: c */
        public static final String f80584c = "gcm.notification.";

        /* renamed from: d */
        public static final String f80585d = "gcm.n.e";

        /* renamed from: e */
        public static final String f80586e = "gcm.n.dnp";

        /* renamed from: f */
        public static final String f80587f = "gcm.n.noui";

        /* renamed from: g */
        public static final String f80588g = "gcm.n.title";

        /* renamed from: h */
        public static final String f80589h = "gcm.n.body";

        /* renamed from: i */
        public static final String f80590i = "gcm.n.icon";

        /* renamed from: j */
        public static final String f80591j = "gcm.n.image";

        /* renamed from: k */
        public static final String f80592k = "gcm.n.tag";

        /* renamed from: l */
        public static final String f80593l = "gcm.n.color";

        /* renamed from: m */
        public static final String f80594m = "gcm.n.ticker";

        /* renamed from: n */
        public static final String f80595n = "gcm.n.local_only";

        /* renamed from: o */
        public static final String f80596o = "gcm.n.sticky";

        /* renamed from: p */
        public static final String f80597p = "gcm.n.notification_priority";

        /* renamed from: q */
        public static final String f80598q = "gcm.n.default_sound";

        /* renamed from: r */
        public static final String f80599r = "gcm.n.default_vibrate_timings";

        /* renamed from: s */
        public static final String f80600s = "gcm.n.default_light_settings";

        /* renamed from: t */
        public static final String f80601t = "gcm.n.notification_count";

        /* renamed from: u */
        public static final String f80602u = "gcm.n.visibility";

        /* renamed from: v */
        public static final String f80603v = "gcm.n.vibrate_timings";

        /* renamed from: w */
        public static final String f80604w = "gcm.n.light_settings";

        /* renamed from: x */
        public static final String f80605x = "gcm.n.event_time";

        /* renamed from: y */
        public static final String f80606y = "gcm.n.sound2";

        /* renamed from: z */
        public static final String f80607z = "gcm.n.sound";
    }

    /* renamed from: com.google.firebase.messaging.f$d */
    public static final class C33184d {

        /* renamed from: a */
        public static final String f80608a = "google.";

        /* renamed from: b */
        public static final String f80609b = "from";

        /* renamed from: c */
        public static final String f80610c = "rawData";

        /* renamed from: d */
        public static final String f80611d = "message_type";

        /* renamed from: e */
        public static final String f80612e = "collapse_key";

        /* renamed from: f */
        public static final String f80613f = "message_id";

        /* renamed from: g */
        public static final String f80614g = "google.to";

        /* renamed from: h */
        public static final String f80615h = "google.message_id";

        /* renamed from: i */
        public static final String f80616i = "google.ttl";

        /* renamed from: j */
        public static final String f80617j = "google.sent_time";

        /* renamed from: k */
        public static final String f80618k = "google.original_priority";

        /* renamed from: l */
        public static final String f80619l = "google.delivered_priority";

        /* renamed from: m */
        public static final String f80620m = "google.priority";

        /* renamed from: n */
        public static final String f80621n = "google.priority_reduced";

        /* renamed from: o */
        public static final String f80622o = "google.c.";

        /* renamed from: p */
        public static final String f80623p = "google.c.sender.id";

        /* renamed from: a */
        public static C1866a<String, String> m133857a(Bundle bundle) {
            C1866a<String, String> aVar = new C1866a<>();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith(f80608a) && !next.startsWith(C33183c.f80582a) && !next.equals("from") && !next.equals(f80611d) && !next.equals(f80612e)) {
                        aVar.put(next, str);
                    }
                }
            }
            return aVar;
        }
    }

    /* renamed from: com.google.firebase.messaging.f$e */
    public static final class C33185e {

        /* renamed from: a */
        public static final String f80624a = "gcm";

        /* renamed from: b */
        public static final String f80625b = "deleted_messages";

        /* renamed from: c */
        public static final String f80626c = "send_event";

        /* renamed from: d */
        public static final String f80627d = "send_error";
    }

    /* renamed from: com.google.firebase.messaging.f$f */
    public static final class C33186f {

        /* renamed from: a */
        public static final String f80628a = "fcm";

        /* renamed from: b */
        public static final String f80629b = "source";

        /* renamed from: c */
        public static final String f80630c = "medium";

        /* renamed from: d */
        public static final String f80631d = "label";

        /* renamed from: e */
        public static final String f80632e = "_nt";

        /* renamed from: f */
        public static final String f80633f = "campaign";

        /* renamed from: g */
        public static final String f80634g = "_nmn";

        /* renamed from: h */
        public static final String f80635h = "_nmt";

        /* renamed from: i */
        public static final String f80636i = "_ndt";

        /* renamed from: j */
        public static final String f80637j = "message_channel";

        /* renamed from: k */
        public static final String f80638k = "_nmc";

        /* renamed from: l */
        public static final String f80639l = "_cmp";

        /* renamed from: m */
        public static final String f80640m = "_nr";

        /* renamed from: n */
        public static final String f80641n = "_no";

        /* renamed from: o */
        public static final String f80642o = "_nd";

        /* renamed from: p */
        public static final String f80643p = "_nf";

        /* renamed from: q */
        public static final String f80644q = "_ln";

        /* renamed from: r */
        public static final String f80645r = "_nmid";

        /* renamed from: com.google.firebase.messaging.f$f$a */
        public @interface C33187a {

            /* renamed from: X2 */
            public static final String f80646X2 = "data";

            /* renamed from: Y2 */
            public static final String f80647Y2 = "display";
        }
    }
}
