package com.urbanairship.analytics.data;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;
import androidx.room.C20316h;
import androidx.room.C20319h2;
import androidx.room.C20366s1;
import androidx.room.RoomDatabase;
import androidx.room.migration.C20343b;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20481g;
import com.google.android.datatransport.runtime.scheduling.persistence.C40298u0;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.urbanairship.C36059m;
import com.urbanairship.config.C9061a;
import com.urbanairship.json.C9334f;
import java.io.File;

@C20316h(entities = {C35543e.class}, version = 3)
@C20319h2({C9334f.class})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class AnalyticsDatabase extends RoomDatabase {

    /* renamed from: q */
    public static final String f87633q = "com.urbanairship.databases";

    /* renamed from: r */
    public static final String f87634r = "ua_analytics.db";

    /* renamed from: s */
    public static final C20343b f87635s = new C35530a(1, 2);

    /* renamed from: t */
    public static final C20343b f87636t = new C35531b(2, 3);

    /* renamed from: com.urbanairship.analytics.data.AnalyticsDatabase$a */
    public class C35530a extends C20343b {

        /* renamed from: c */
        public static final String f87637c = "events";

        /* renamed from: d */
        public static final String f87638d = "_id";

        /* renamed from: e */
        public static final String f87639e = "type";

        /* renamed from: f */
        public static final String f87640f = "event_id";

        /* renamed from: g */
        public static final String f87641g = "time";

        /* renamed from: h */
        public static final String f87642h = "data";

        /* renamed from: i */
        public static final String f87643i = "session_id";

        /* renamed from: j */
        public static final String f87644j = "event_size";

        /* renamed from: k */
        public static final String f87645k = "events_new";

        /* renamed from: l */
        public static final String f87646l = "id";

        /* renamed from: m */
        public static final String f87647m = "type";

        /* renamed from: n */
        public static final String f87648n = "eventId";

        /* renamed from: o */
        public static final String f87649o = "time";

        /* renamed from: p */
        public static final String f87650p = "data";

        /* renamed from: q */
        public static final String f87651q = "sessionId";

        /* renamed from: r */
        public static final String f87652r = "eventSize";

        public C35530a(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo17636a(@C0359n0 C20466f fVar) {
            fVar.mo60782s0("CREATE TABLE events_new (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, type TEXT, eventId TEXT, time TEXT, data TEXT, sessionId TEXT, eventSize INTEGER NOT NULL);");
            fVar.mo60782s0("INSERT INTO events_new (id, type, eventId, time, data, sessionId, eventSize) SELECT _id, type, event_id, time, data, session_id, event_size FROM events");
            fVar.mo60782s0(C40298u0.f102664w);
            fVar.mo60782s0("ALTER TABLE events_new RENAME TO events");
        }
    }

    /* renamed from: com.urbanairship.analytics.data.AnalyticsDatabase$b */
    public class C35531b extends C20343b {

        /* renamed from: c */
        public static final String f87653c = "events";

        /* renamed from: d */
        public static final String f87654d = "id";

        /* renamed from: e */
        public static final String f87655e = "eventId";

        /* renamed from: f */
        public static final String f87656f = "index_events_eventId";

        public C35531b(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo17636a(@C0359n0 C20466f fVar) {
            fVar.mo60782s0("DELETE FROM events WHERE id NOT IN (SELECT MIN(id) FROM events GROUP BY eventId)");
            fVar.mo60782s0("CREATE UNIQUE INDEX IF NOT EXISTS `index_events_eventId` ON `events` (`eventId`)");
        }
    }

    /* renamed from: Q */
    public static AnalyticsDatabase m146584Q(@C0359n0 Context context, @C0359n0 C9061a aVar) {
        return C20366s1.m95111a(context, AnalyticsDatabase.class, m146586U(context, aVar)).mo60923c(f87635s, f87636t).mo60936p().mo60926f();
    }

    @C0344h1
    /* renamed from: R */
    public static AnalyticsDatabase m146585R(@C0359n0 Context context) {
        return C20366s1.m95113c(context, AnalyticsDatabase.class).mo60925e().mo60926f();
    }

    /* renamed from: U */
    public static String m146586U(@C0359n0 Context context, @C0359n0 C9061a aVar) {
        File file = new File(C17318d.m79730m(context), "com.urbanairship.databases");
        File file2 = new File(file, aVar.mo17958a().f87128a + C32920e.f79928l + f87634r);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.mo17958a().f87128a);
        sb.append("_analytics");
        File file3 = new File(C17318d.m79730m(context), sb.toString());
        if (file2.exists() && !file3.exists() && !file2.renameTo(file3)) {
            C36059m.m148421q("Failed to move analytics db: %s -> %s", file2.getPath(), file3.getPath());
        }
        return file3.getAbsolutePath();
    }

    /* renamed from: S */
    public boolean mo106451S(Context context) {
        C20481g s = mo60913s();
        if (s.getDatabaseName() == null || context.getDatabasePath(s.getDatabaseName()).exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public abstract C35536c mo106452T();
}
