package com.urbanairship.automation.storage;

import androidx.annotation.C0359n0;
import androidx.room.C20295e0;
import androidx.room.C20320i;
import androidx.room.C20369t1;
import androidx.room.C20372u1;
import androidx.room.RoomDatabase;
import androidx.room.migration.C20342a;
import androidx.room.migration.C20343b;
import androidx.room.util.C20378b;
import androidx.room.util.C20383f;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20481g;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.automation.ScheduleDelay;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AutomationDatabase_Impl extends AutomationDatabase {

    /* renamed from: t */
    public volatile C8937a f23952t;

    /* renamed from: com.urbanairship.automation.storage.AutomationDatabase_Impl$a */
    public class C8936a extends C20372u1.C20374b {
        public C8936a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo17567a(C20466f fVar) {
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `schedules` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scheduleId` TEXT, `group` TEXT, `metadata` TEXT, `limit` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `scheduleStart` INTEGER NOT NULL, `scheduleEnd` INTEGER NOT NULL, `editGracePeriod` INTEGER NOT NULL, `interval` INTEGER NOT NULL, `scheduleType` TEXT, `data` TEXT, `count` INTEGER NOT NULL, `executionState` INTEGER NOT NULL, `executionStateChangeDate` INTEGER NOT NULL, `triggerContext` TEXT, `appState` INTEGER NOT NULL, `screens` TEXT, `seconds` INTEGER NOT NULL, `regionId` TEXT, `audience` TEXT, `campaigns` TEXT, `reportingContext` TEXT, `frequencyConstraintIds` TEXT)");
            fVar.mo60782s0("CREATE UNIQUE INDEX IF NOT EXISTS `index_schedules_scheduleId` ON `schedules` (`scheduleId`)");
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `triggers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `triggerType` INTEGER NOT NULL, `goal` REAL NOT NULL, `jsonPredicate` TEXT, `isCancellation` INTEGER NOT NULL, `progress` REAL NOT NULL, `parentScheduleId` TEXT, FOREIGN KEY(`parentScheduleId`) REFERENCES `schedules`(`scheduleId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            fVar.mo60782s0("CREATE INDEX IF NOT EXISTS `index_triggers_parentScheduleId` ON `triggers` (`parentScheduleId`)");
            fVar.mo60782s0(C20369t1.f52542g);
            fVar.mo60782s0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0b164dc96b9371ee1a040ba59e4aa9cf')");
        }

        /* renamed from: b */
        public void mo17568b(C20466f fVar) {
            fVar.mo60782s0("DROP TABLE IF EXISTS `schedules`");
            fVar.mo60782s0("DROP TABLE IF EXISTS `triggers`");
            if (AutomationDatabase_Impl.this.f52286h != null) {
                int size = AutomationDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) AutomationDatabase_Impl.this.f52286h.get(i)).mo60945b(fVar);
                }
            }
        }

        /* renamed from: c */
        public void mo17569c(C20466f fVar) {
            if (AutomationDatabase_Impl.this.f52286h != null) {
                int size = AutomationDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) AutomationDatabase_Impl.this.f52286h.get(i)).mo60944a(fVar);
                }
            }
        }

        /* renamed from: d */
        public void mo17570d(C20466f fVar) {
            C20466f unused = AutomationDatabase_Impl.this.f52279a = fVar;
            fVar.mo60782s0("PRAGMA foreign_keys = ON");
            AutomationDatabase_Impl.this.mo60892D(fVar);
            if (AutomationDatabase_Impl.this.f52286h != null) {
                int size = AutomationDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) AutomationDatabase_Impl.this.f52286h.get(i)).mo60946c(fVar);
                }
            }
        }

        /* renamed from: e */
        public void mo17571e(C20466f fVar) {
        }

        /* renamed from: f */
        public void mo17572f(C20466f fVar) {
            C20378b.m95141b(fVar);
        }

        /* renamed from: g */
        public C20372u1.C20375c mo17573g(C20466f fVar) {
            C20466f fVar2 = fVar;
            HashMap hashMap = new HashMap(24);
            hashMap.put("id", new C20383f.C20384a("id", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("scheduleId", new C20383f.C20384a("scheduleId", "TEXT", false, 0, (String) null, 1));
            hashMap.put("group", new C20383f.C20384a("group", "TEXT", false, 0, (String) null, 1));
            hashMap.put("metadata", new C20383f.C20384a("metadata", "TEXT", false, 0, (String) null, 1));
            hashMap.put("limit", new C20383f.C20384a("limit", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("priority", new C20383f.C20384a("priority", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("scheduleStart", new C20383f.C20384a("scheduleStart", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("scheduleEnd", new C20383f.C20384a("scheduleEnd", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("editGracePeriod", new C20383f.C20384a("editGracePeriod", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("interval", new C20383f.C20384a("interval", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("scheduleType", new C20383f.C20384a("scheduleType", "TEXT", false, 0, (String) null, 1));
            hashMap.put("data", new C20383f.C20384a("data", "TEXT", false, 0, (String) null, 1));
            hashMap.put("count", new C20383f.C20384a("count", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("executionState", new C20383f.C20384a("executionState", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("executionStateChangeDate", new C20383f.C20384a("executionStateChangeDate", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("triggerContext", new C20383f.C20384a("triggerContext", "TEXT", false, 0, (String) null, 1));
            hashMap.put("appState", new C20383f.C20384a("appState", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("screens", new C20383f.C20384a("screens", "TEXT", false, 0, (String) null, 1));
            hashMap.put(ScheduleDelay.f23498f, new C20383f.C20384a(ScheduleDelay.f23498f, "INTEGER", true, 0, (String) null, 1));
            hashMap.put(C28534f.f69112A0, new C20383f.C20384a(C28534f.f69112A0, "TEXT", false, 0, (String) null, 1));
            hashMap.put("audience", new C20383f.C20384a("audience", "TEXT", false, 0, (String) null, 1));
            hashMap.put("campaigns", new C20383f.C20384a("campaigns", "TEXT", false, 0, (String) null, 1));
            hashMap.put("reportingContext", new C20383f.C20384a("reportingContext", "TEXT", false, 0, (String) null, 1));
            hashMap.put("frequencyConstraintIds", new C20383f.C20384a("frequencyConstraintIds", "TEXT", false, 0, (String) null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C20383f.C20390f("index_schedules_scheduleId", true, Arrays.asList(new String[]{"scheduleId"}), Arrays.asList(new String[]{"ASC"})));
            C20383f fVar3 = new C20383f("schedules", hashMap, hashSet, hashSet2);
            C20383f a = C20383f.m95160a(fVar2, "schedules");
            if (!fVar3.equals(a)) {
                return new C20372u1.C20375c(false, "schedules(com.urbanairship.automation.storage.ScheduleEntity).\n Expected:\n" + fVar3 + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("id", new C20383f.C20384a("id", "INTEGER", true, 1, (String) null, 1));
            hashMap2.put("triggerType", new C20383f.C20384a("triggerType", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("goal", new C20383f.C20384a("goal", "REAL", true, 0, (String) null, 1));
            hashMap2.put("jsonPredicate", new C20383f.C20384a("jsonPredicate", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("isCancellation", new C20383f.C20384a("isCancellation", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("progress", new C20383f.C20384a("progress", "REAL", true, 0, (String) null, 1));
            hashMap2.put("parentScheduleId", new C20383f.C20384a("parentScheduleId", "TEXT", false, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new C20383f.C20388d("schedules", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"parentScheduleId"}), Arrays.asList(new String[]{"scheduleId"})));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new C20383f.C20390f("index_triggers_parentScheduleId", false, Arrays.asList(new String[]{"parentScheduleId"}), Arrays.asList(new String[]{"ASC"})));
            C20383f fVar4 = new C20383f("triggers", hashMap2, hashSet3, hashSet4);
            C20383f a2 = C20383f.m95160a(fVar2, "triggers");
            if (fVar4.equals(a2)) {
                return new C20372u1.C20375c(true, (String) null);
            }
            return new C20372u1.C20375c(false, "triggers(com.urbanairship.automation.storage.TriggerEntity).\n Expected:\n" + fVar4 + "\n Found:\n" + a2);
        }
    }

    /* renamed from: R */
    public C8937a mo17635R() {
        C8937a aVar;
        if (this.f23952t != null) {
            return this.f23952t;
        }
        synchronized (this) {
            if (this.f23952t == null) {
                this.f23952t = new C8939c(this);
            }
            aVar = this.f23952t;
        }
        return aVar;
    }

    /* renamed from: f */
    public void mo17561f() {
        super.mo60903c();
        C20466f d3 = super.mo60913s().mo18117d3();
        try {
            super.mo60905e();
            d3.mo60782s0("PRAGMA defer_foreign_keys = TRUE");
            d3.mo60782s0("DELETE FROM `schedules`");
            d3.mo60782s0("DELETE FROM `triggers`");
            super.mo60901O();
        } finally {
            super.mo60908k();
            d3.mo60771h3("PRAGMA wal_checkpoint(FULL)").close();
            if (!d3.mo60748A3()) {
                d3.mo60782s0("VACUUM");
            }
        }
    }

    /* renamed from: i */
    public C20295e0 mo17562i() {
        return new C20295e0(this, new HashMap(0), new HashMap(0), "schedules", "triggers");
    }

    /* renamed from: j */
    public C20481g mo17563j(C20320i iVar) {
        return iVar.f52453c.mo18120a(C20481g.C20484b.m95489a(iVar.f52451a).mo61412d(iVar.f52452b).mo61411c(new C20372u1(iVar, new C8936a(4), "0b164dc96b9371ee1a040ba59e4aa9cf", "b1efdcdf0bd9f4db72a4651af9c481ba")).mo61410b());
    }

    /* renamed from: m */
    public List<C20343b> mo17564m(@C0359n0 Map<Class<? extends C20342a>, C20342a> map) {
        return Arrays.asList(new C20343b[0]);
    }

    /* renamed from: u */
    public Set<Class<? extends C20342a>> mo17565u() {
        return new HashSet();
    }

    /* renamed from: v */
    public Map<Class<?>, List<Class<?>>> mo17566v() {
        HashMap hashMap = new HashMap();
        hashMap.put(C8937a.class, C8939c.m33279B());
        return hashMap;
    }
}
