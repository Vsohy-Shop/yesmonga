package com.urbanairship.automation.storage;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.util.C9665n;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.storage.f */
public class C8947f extends C9665n {

    /* renamed from: e */
    public static final int f23970e = 6;

    /* renamed from: f */
    public static final String f23971f = "SELECT * FROM action_schedules a LEFT OUTER JOIN triggers b ON a.s_id=b.t_s_id";

    /* renamed from: com.urbanairship.automation.storage.f$a */
    public interface C8948a {

        /* renamed from: a */
        public static final String f23972a = "action_schedules";

        /* renamed from: b */
        public static final String f23973b = "s_id";

        /* renamed from: c */
        public static final String f23974c = "s_metadata";

        /* renamed from: d */
        public static final String f23975d = "s_data";

        /* renamed from: e */
        public static final String f23976e = "s_limit";

        /* renamed from: f */
        public static final String f23977f = "s_priority";

        /* renamed from: g */
        public static final String f23978g = "s_group";

        /* renamed from: h */
        public static final String f23979h = "s_start";

        /* renamed from: i */
        public static final String f23980i = "s_end";

        /* renamed from: j */
        public static final String f23981j = "s_edit_grace_period";

        /* renamed from: k */
        public static final String f23982k = "s_interval";

        /* renamed from: l */
        public static final String f23983l = "d_seconds";

        /* renamed from: m */
        public static final String f23984m = "d_screen";

        /* renamed from: n */
        public static final String f23985n = "d_app_state";

        /* renamed from: o */
        public static final String f23986o = "d_region_id";

        /* renamed from: p */
        public static final String f23987p = "s_execution_state";

        /* renamed from: q */
        public static final String f23988q = "s_execution_state_change_date";

        /* renamed from: r */
        public static final String f23989r = "s_pending_execution_date";

        /* renamed from: s */
        public static final String f23990s = "s_count";

        /* renamed from: t */
        public static final String f23991t = "s_row_id";

        /* renamed from: u */
        public static final String f23992u = "s_trigger_context";
    }

    /* renamed from: com.urbanairship.automation.storage.f$b */
    public interface C8949b {

        /* renamed from: a */
        public static final String f23993a = "t_row_id";

        /* renamed from: b */
        public static final String f23994b = "triggers";

        /* renamed from: c */
        public static final String f23995c = "t_type";

        /* renamed from: d */
        public static final String f23996d = "t_s_id";

        /* renamed from: e */
        public static final String f23997e = "t_predicate";

        /* renamed from: f */
        public static final String f23998f = "t_progress";

        /* renamed from: g */
        public static final String f23999g = "t_goal";

        /* renamed from: h */
        public static final String f24000h = "t_cancellation";
    }

    public C8947f(@C0359n0 Context context, @C0359n0 String str, @C0359n0 String str2) {
        super(context, str, str2, 6);
    }

    @TargetApi(16)
    /* renamed from: j */
    public void mo17671j(@C0359n0 SQLiteDatabase sQLiteDatabase) {
        super.mo17671j(sQLiteDatabase);
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    /* renamed from: k */
    public void mo17672k(@C0359n0 SQLiteDatabase sQLiteDatabase) {
        C36059m.m148406b("Creating automation database", new Object[0]);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS action_schedules (s_row_id INTEGER PRIMARY KEY AUTOINCREMENT,s_id TEXT UNIQUE,s_metadata TEXT,s_data TEXT,s_start INTEGER,s_end INTEGER,s_edit_grace_period INTEGER,s_execution_state_change_date INTEGER,s_count INTEGER,s_limit INTEGER,s_priority INTEGER,s_group TEXT,s_execution_state INTEGER,s_pending_execution_date DOUBLE,d_app_state INTEGER,d_region_id TEXT,d_screen TEXT,d_seconds DOUBLE,s_interval INTEGER,s_trigger_context TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS triggers (t_row_id INTEGER PRIMARY KEY AUTOINCREMENT,t_type INTEGER,t_cancellation INTEGER,t_s_id TEXT,t_predicate TEXT,t_progress DOUBLE,t_goal DOUBLE,FOREIGN KEY(t_s_id) REFERENCES action_schedules(s_id) ON DELETE CASCADE);");
        C36059m.m148406b("Automation database created", new Object[0]);
    }

    /* renamed from: l */
    public void mo17673l(@C0359n0 SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C36059m.m148406b("Dropping automation database. Downgrading from version %s to %s", Integer.valueOf(i), Integer.valueOf(i2));
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS triggers");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS action_schedules");
        mo17672k(sQLiteDatabase);
    }

    /* renamed from: n */
    public void mo17674n(@C0359n0 SQLiteDatabase sQLiteDatabase, int i, int i2) {
        SQLiteDatabase sQLiteDatabase2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
        int i3 = i;
        String str17 = "DROP TABLE ";
        String str18 = " FROM ";
        String str19 = ", 0, ";
        String str20 = C8948a.f23983l;
        String str21 = C8948a.f23984m;
        String str22 = ", ";
        String str23 = C8948a.f23986o;
        String str24 = C8948a.f23985n;
        String str25 = C8948a.f23989r;
        String str26 = "s_is_pending_execution";
        if (i3 == 1) {
            sQLiteDatabase3.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase3.execSQL("ALTER TABLE action_schedules RENAME TO " + "temp_schedule_entry_table" + ";");
            sQLiteDatabase3.execSQL("ALTER TABLE triggers RENAME TO " + "temp_triggers_entry_table" + ";");
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE action_schedules (s_row_id INTEGER PRIMARY KEY AUTOINCREMENT,s_id TEXT UNIQUE,");
            sb.append("s_actions");
            sb.append(" TEXT,");
            sb.append(C8948a.f23979h);
            str3 = "ALTER TABLE triggers RENAME TO ";
            sb.append(" INTEGER,");
            sb.append(C8948a.f23980i);
            sb.append(" INTEGER,");
            sb.append(C8948a.f23990s);
            sb.append(" INTEGER,");
            sb.append(C8948a.f23976e);
            sb.append(" INTEGER,");
            sb.append(C8948a.f23978g);
            sb.append(" TEXT,");
            str4 = "ALTER TABLE action_schedules RENAME TO ";
            str11 = str26;
            sb.append(str11);
            sb.append(" INTEGER,");
            str13 = str25;
            sb.append(str13);
            str5 = "COMMIT;";
            sb.append(" DOUBLE,");
            String str27 = str24;
            sb.append(str27);
            sb.append(" INTEGER,");
            String str28 = str23;
            sb.append(str28);
            sb.append(" TEXT,");
            String str29 = str21;
            sb.append(str29);
            sb.append(" TEXT,");
            String str30 = str20;
            sb.append(str30);
            sb.append(" DOUBLE);");
            sQLiteDatabase3.execSQL(sb.toString());
            sQLiteDatabase3.execSQL("CREATE TABLE triggers(t_row_id INTEGER PRIMARY KEY AUTOINCREMENT,t_type INTEGER,t_cancellation INTEGER,t_s_id TEXT,t_predicate TEXT,t_progress DOUBLE,t_goal DOUBLE,FOREIGN KEY(t_s_id) REFERENCES action_schedules(s_id) ON DELETE CASCADE);");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("INSERT INTO action_schedules(s_row_id, s_id, ");
            sb2.append("s_actions");
            str10 = str22;
            sb2.append(str10);
            sb2.append(C8948a.f23979h);
            sb2.append(str10);
            sb2.append(C8948a.f23980i);
            sb2.append(str10);
            sb2.append(C8948a.f23990s);
            sb2.append(str10);
            sb2.append(C8948a.f23976e);
            sb2.append(str10);
            sb2.append(C8948a.f23977f);
            sb2.append(str10);
            sb2.append(C8948a.f23978g);
            sb2.append(str10);
            sb2.append(str11);
            sb2.append(str10);
            sb2.append(str13);
            sb2.append(str10);
            sb2.append(str27);
            sb2.append(str10);
            sb2.append(str28);
            sb2.append(str10);
            sb2.append(str29);
            sb2.append(str10);
            sb2.append(str30);
            sb2.append(") SELECT ");
            sb2.append("_id");
            sb2.append(str10);
            str7 = str30;
            sb2.append(C8948a.f23973b);
            sb2.append(str10);
            sb2.append("s_actions");
            sb2.append(str10);
            sb2.append(C8948a.f23979h);
            sb2.append(str10);
            sb2.append(C8948a.f23980i);
            sb2.append(str10);
            sb2.append(C8948a.f23990s);
            sb2.append(str10);
            sb2.append(C8948a.f23976e);
            sb2.append(str10);
            sb2.append(C8948a.f23978g);
            sb2.append(", 0, 0.0, 1, NULL, NULL, 0 FROM ");
            sb2.append("temp_schedule_entry_table");
            str9 = ";";
            sb2.append(str9);
            str8 = str29;
            sQLiteDatabase2 = sQLiteDatabase;
            sQLiteDatabase2.execSQL(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            str6 = str28;
            sb3.append("INSERT INTO triggers(t_row_id, t_type, t_cancellation, t_s_id, t_predicate, t_progress, t_goal) SELECT ");
            sb3.append("_id");
            sb3.append(str10);
            sb3.append(C8949b.f23995c);
            str16 = str19;
            sb3.append(str16);
            sb3.append(C8949b.f23996d);
            sb3.append(str10);
            sb3.append(C8949b.f23997e);
            sb3.append(str10);
            sb3.append(C8949b.f23998f);
            sb3.append(str10);
            sb3.append(C8949b.f23999g);
            sb3.append(str18);
            str12 = "temp_triggers_entry_table";
            sb3.append(str12);
            sb3.append(str9);
            sQLiteDatabase2.execSQL(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            str14 = str17;
            sb4.append(str14);
            sb4.append("temp_schedule_entry_table");
            sb4.append(str9);
            sQLiteDatabase2.execSQL(sb4.toString());
            sQLiteDatabase2.execSQL(str14 + str12 + str9);
            sQLiteDatabase2.execSQL(str5);
            str15 = "BEGIN TRANSACTION;";
        } else if (i3 == 2) {
            str15 = "BEGIN TRANSACTION;";
            str3 = "ALTER TABLE triggers RENAME TO ";
            str4 = "ALTER TABLE action_schedules RENAME TO ";
            str9 = ";";
            str12 = "temp_triggers_entry_table";
            str10 = str22;
            str6 = str23;
            str13 = str25;
            str11 = str26;
            sQLiteDatabase2 = sQLiteDatabase3;
            str5 = "COMMIT;";
            str14 = str17;
            str16 = str19;
            String str31 = str21;
            str7 = str20;
            str8 = str31;
        } else if (i3 == 3) {
            sQLiteDatabase2 = sQLiteDatabase3;
            str2 = "COMMIT;";
            str = "BEGIN TRANSACTION;";
            sQLiteDatabase2.execSQL(str);
            sQLiteDatabase2.execSQL("ALTER TABLE action_schedules ADD COLUMN s_execution_state_change_date INTEGER;");
            sQLiteDatabase2.execSQL("ALTER TABLE action_schedules ADD COLUMN s_edit_grace_period INTEGER;");
            sQLiteDatabase2.execSQL("ALTER TABLE action_schedules ADD COLUMN s_interval INTEGER;");
            sQLiteDatabase2.execSQL(str2);
            sQLiteDatabase2.execSQL(str);
            sQLiteDatabase2.execSQL("ALTER TABLE action_schedules ADD COLUMN s_metadata TEXT;");
            sQLiteDatabase2.execSQL(str2);
        } else if (i3 == 4) {
            sQLiteDatabase2 = sQLiteDatabase3;
            str2 = "COMMIT;";
            str = "BEGIN TRANSACTION;";
            sQLiteDatabase2.execSQL(str);
            sQLiteDatabase2.execSQL("ALTER TABLE action_schedules ADD COLUMN s_metadata TEXT;");
            sQLiteDatabase2.execSQL(str2);
        } else if (i3 != 5) {
            sQLiteDatabase3.execSQL("DROP TABLE IF EXISTS action_schedules");
            sQLiteDatabase3.execSQL("DROP TABLE IF EXISTS triggers");
            mo17672k(sQLiteDatabase);
            return;
        } else {
            sQLiteDatabase3.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase3.execSQL("ALTER TABLE action_schedules ADD COLUMN s_trigger_context TEXT;");
            sQLiteDatabase3.execSQL("COMMIT;");
            return;
        }
        sQLiteDatabase2.execSQL(str15);
        String str32 = str15;
        sQLiteDatabase2.execSQL(str4 + "temp_schedule_entry_table" + str9);
        sQLiteDatabase2.execSQL(str3 + str12 + str9);
        sQLiteDatabase2.execSQL("CREATE TABLE action_schedules (s_row_id INTEGER PRIMARY KEY AUTOINCREMENT,s_id TEXT UNIQUE,s_data TEXT,s_start INTEGER,s_end INTEGER,s_count INTEGER,s_limit INTEGER,s_priority INTEGER,s_group TEXT,s_execution_state INTEGER,s_pending_execution_date DOUBLE,d_app_state INTEGER,d_region_id TEXT,d_screen TEXT,d_seconds DOUBLE);");
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS triggers (t_row_id INTEGER PRIMARY KEY AUTOINCREMENT,t_type INTEGER,t_cancellation INTEGER,t_s_id TEXT,t_predicate TEXT,t_progress DOUBLE,t_goal DOUBLE,FOREIGN KEY(t_s_id) REFERENCES action_schedules(s_id) ON DELETE CASCADE);");
        sQLiteDatabase2.execSQL("INSERT INTO action_schedules(s_row_id, s_id, s_data, s_start, s_end, s_count, s_limit, s_priority, s_group, s_execution_state, s_pending_execution_date, d_app_state, d_region_id, d_screen, d_seconds) SELECT s_row_id, s_id, " + "s_actions" + str10 + C8948a.f23979h + str10 + C8948a.f23980i + str10 + C8948a.f23990s + str10 + C8948a.f23976e + str16 + C8948a.f23978g + str10 + str11 + str10 + str13 + str10 + str24 + str10 + str6 + str10 + str8 + str10 + str7 + str18 + "temp_schedule_entry_table" + str9);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("INSERT INTO triggers(t_row_id, t_type, t_cancellation, t_s_id, t_predicate, t_progress, t_goal) SELECT t_row_id, t_type, t_cancellation, t_s_id, t_predicate, t_progress, t_goal FROM ");
        sb5.append(str12);
        sb5.append(str9);
        sQLiteDatabase2.execSQL(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        String str33 = str14;
        sb6.append(str33);
        sb6.append("temp_schedule_entry_table");
        sb6.append(str9);
        sQLiteDatabase2.execSQL(sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(str33);
        sb7.append(str12);
        sb7.append(str9);
        sQLiteDatabase2.execSQL(sb7.toString());
        str2 = str5;
        sQLiteDatabase2.execSQL(str2);
        str = str32;
        sQLiteDatabase2.execSQL(str);
        sQLiteDatabase2.execSQL("ALTER TABLE action_schedules ADD COLUMN s_execution_state_change_date INTEGER;");
        sQLiteDatabase2.execSQL("ALTER TABLE action_schedules ADD COLUMN s_edit_grace_period INTEGER;");
        sQLiteDatabase2.execSQL("ALTER TABLE action_schedules ADD COLUMN s_interval INTEGER;");
        sQLiteDatabase2.execSQL(str2);
        sQLiteDatabase2.execSQL(str);
        sQLiteDatabase2.execSQL("ALTER TABLE action_schedules ADD COLUMN s_metadata TEXT;");
        sQLiteDatabase2.execSQL(str2);
    }

    /* renamed from: s */
    public void mo17675s() {
        try {
            SQLiteDatabase g = mo19635g();
            g.execSQL("DROP TABLE IF EXISTS triggers");
            g.execSQL("DROP TABLE IF EXISTS action_schedules");
            g.close();
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to delete schedules.", new Object[0]);
        }
    }

    /* renamed from: t */
    public Cursor mo17676t() {
        try {
            return mo19640q(f23971f, (String[]) null);
        } catch (SQLException e) {
            C36059m.m148411g(e, "LegacyAutomationDataManager - Unable to get schedules.", new Object[0]);
            return null;
        }
    }
}
