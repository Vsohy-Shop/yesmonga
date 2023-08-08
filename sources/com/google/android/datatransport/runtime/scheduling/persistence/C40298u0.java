package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.u0 */
public final class C40298u0 extends SQLiteOpenHelper {

    /* renamed from: E0 */
    public static final String f102645E0 = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: F0 */
    public static final String f102646F0 = "DROP TABLE IF EXISTS log_event_dropped";

    /* renamed from: G0 */
    public static final String f102647G0 = "DROP TABLE IF EXISTS global_log_event_state";

    /* renamed from: H0 */
    public static int f102648H0 = 5;

    /* renamed from: I0 */
    public static final C40299a f102649I0;

    /* renamed from: J0 */
    public static final C40299a f102650J0;

    /* renamed from: K0 */
    public static final C40299a f102651K0;

    /* renamed from: L0 */
    public static final C40299a f102652L0;

    /* renamed from: M0 */
    public static final C40299a f102653M0;

    /* renamed from: N0 */
    public static final List<C40299a> f102654N0;

    /* renamed from: X */
    public static final String f102655X = "DROP TABLE IF EXISTS event_payloads";

    /* renamed from: Y */
    public static final String f102656Y = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";

    /* renamed from: Z */
    public static final String f102657Z = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";

    /* renamed from: c */
    public static final String f102658c = "com.google.android.datatransport.events";

    /* renamed from: d */
    public static final String f102659d = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";

    /* renamed from: e */
    public static final String f102660e = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";

    /* renamed from: f */
    public static final String f102661f = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";

    /* renamed from: g */
    public static final String f102662g = "CREATE INDEX events_backend_id on events(context_id)";

    /* renamed from: v */
    public static final String f102663v = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";

    /* renamed from: w */
    public static final String f102664w = "DROP TABLE events";

    /* renamed from: x */
    public static final String f102665x = "DROP TABLE event_metadata";

    /* renamed from: y */
    public static final String f102666y = "DROP TABLE transport_contexts";

    /* renamed from: z */
    public static final String f102667z = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";

    /* renamed from: a */
    public final int f102668a;

    /* renamed from: b */
    public boolean f102669b = false;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.u0$a */
    public interface C40299a {
        /* renamed from: a */
        void mo132966a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C40288p0 p0Var = new C40288p0();
        f102649I0 = p0Var;
        C40290q0 q0Var = new C40290q0();
        f102650J0 = q0Var;
        C40292r0 r0Var = new C40292r0();
        f102651K0 = r0Var;
        C40294s0 s0Var = new C40294s0();
        f102652L0 = s0Var;
        C40296t0 t0Var = new C40296t0();
        f102653M0 = t0Var;
        f102654N0 = Arrays.asList(new C40299a[]{p0Var, q0Var, r0Var, s0Var, t0Var});
    }

    @Inject
    public C40298u0(Context context, @Named("SQLITE_DB_NAME") String str, @Named("SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f102668a = i;
    }

    /* renamed from: i */
    public static /* synthetic */ void m163794i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f102659d);
        sQLiteDatabase.execSQL(f102660e);
        sQLiteDatabase.execSQL(f102661f);
        sQLiteDatabase.execSQL(f102662g);
        sQLiteDatabase.execSQL(f102663v);
    }

    /* renamed from: j */
    public static /* synthetic */ void m163795j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: l */
    public static /* synthetic */ void m163797l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL(f102655X);
        sQLiteDatabase.execSQL(f102667z);
    }

    /* renamed from: m */
    public static /* synthetic */ void m163798m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f102646F0);
        sQLiteDatabase.execSQL(f102647G0);
        sQLiteDatabase.execSQL(f102656Y);
        sQLiteDatabase.execSQL(f102657Z);
        sQLiteDatabase.execSQL(f102645E0);
    }

    /* renamed from: g */
    public final void mo132967g(SQLiteDatabase sQLiteDatabase) {
        if (!this.f102669b) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* renamed from: n */
    public final void mo132968n(SQLiteDatabase sQLiteDatabase, int i) {
        mo132967g(sQLiteDatabase);
        mo132969o(sQLiteDatabase, 0, i);
    }

    /* renamed from: o */
    public final void mo132969o(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<C40299a> list = f102654N0;
        if (i2 <= list.size()) {
            while (i < i2) {
                f102654N0.get(i).mo132966a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f102669b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        mo132968n(sQLiteDatabase, this.f102668a);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(f102664w);
        sQLiteDatabase.execSQL(f102665x);
        sQLiteDatabase.execSQL(f102666y);
        sQLiteDatabase.execSQL(f102655X);
        sQLiteDatabase.execSQL(f102646F0);
        sQLiteDatabase.execSQL(f102647G0);
        mo132968n(sQLiteDatabase, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        mo132967g(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        mo132967g(sQLiteDatabase);
        mo132969o(sQLiteDatabase, i, i2);
    }
}
