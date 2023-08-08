package androidx.work.impl;

import androidx.annotation.C0359n0;
import androidx.preference.Preference;
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
import androidx.work.impl.model.C21208a0;
import androidx.work.impl.model.C21211b;
import androidx.work.impl.model.C21218c;
import androidx.work.impl.model.C21222e;
import androidx.work.impl.model.C21223f;
import androidx.work.impl.model.C21226g;
import androidx.work.impl.model.C21227h;
import androidx.work.impl.model.C21230j;
import androidx.work.impl.model.C21232k;
import androidx.work.impl.model.C21239o;
import androidx.work.impl.model.C21240p;
import androidx.work.impl.model.C21243r;
import androidx.work.impl.model.C21244s;
import androidx.work.impl.model.C21253v;
import androidx.work.impl.model.C21254w;
import androidx.work.impl.model.C21275z;
import androidx.work.impl.utils.C21342t;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: r */
    public volatile C21253v f54451r;

    /* renamed from: s */
    public volatile C21211b f54452s;

    /* renamed from: t */
    public volatile C21275z f54453t;

    /* renamed from: u */
    public volatile C21230j f54454u;

    /* renamed from: v */
    public volatile C21239o f54455v;

    /* renamed from: w */
    public volatile C21243r f54456w;

    /* renamed from: x */
    public volatile C21222e f54457x;

    /* renamed from: y */
    public volatile C21226g f54458y;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    public class C21099a extends C20372u1.C20374b {
        public C21099a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo17567a(C20466f fVar) {
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fVar.mo60782s0("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            fVar.mo60782s0("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            fVar.mo60782s0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            fVar.mo60782s0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fVar.mo60782s0("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fVar.mo60782s0("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fVar.mo60782s0(C21342t.f55050c);
            fVar.mo60782s0(C20369t1.f52542g);
            fVar.mo60782s0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        /* renamed from: b */
        public void mo17568b(C20466f fVar) {
            fVar.mo60782s0("DROP TABLE IF EXISTS `Dependency`");
            fVar.mo60782s0("DROP TABLE IF EXISTS `WorkSpec`");
            fVar.mo60782s0("DROP TABLE IF EXISTS `WorkTag`");
            fVar.mo60782s0("DROP TABLE IF EXISTS `SystemIdInfo`");
            fVar.mo60782s0("DROP TABLE IF EXISTS `WorkName`");
            fVar.mo60782s0("DROP TABLE IF EXISTS `WorkProgress`");
            fVar.mo60782s0("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f52286h != null) {
                int size = WorkDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) WorkDatabase_Impl.this.f52286h.get(i)).mo60945b(fVar);
                }
            }
        }

        /* renamed from: c */
        public void mo17569c(C20466f fVar) {
            if (WorkDatabase_Impl.this.f52286h != null) {
                int size = WorkDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) WorkDatabase_Impl.this.f52286h.get(i)).mo60944a(fVar);
                }
            }
        }

        /* renamed from: d */
        public void mo17570d(C20466f fVar) {
            C20466f unused = WorkDatabase_Impl.this.f52279a = fVar;
            fVar.mo60782s0("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.mo60892D(fVar);
            if (WorkDatabase_Impl.this.f52286h != null) {
                int size = WorkDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) WorkDatabase_Impl.this.f52286h.get(i)).mo60946c(fVar);
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
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C20383f.C20384a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new C20383f.C20384a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C20383f.C20388d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new C20383f.C20388d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C20383f.C20390f("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            hashSet2.add(new C20383f.C20390f("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
            C20383f fVar3 = new C20383f("Dependency", hashMap, hashSet, hashSet2);
            C20383f a = C20383f.m95160a(fVar2, "Dependency");
            if (!fVar3.equals(a)) {
                return new C20372u1.C20375c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar3 + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put("id", new C20383f.C20384a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new C20383f.C20384a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new C20383f.C20384a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new C20383f.C20384a("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("input", new C20383f.C20384a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new C20383f.C20384a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new C20383f.C20384a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new C20383f.C20384a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new C20383f.C20384a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new C20383f.C20384a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new C20383f.C20384a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new C20383f.C20384a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("last_enqueue_time", new C20383f.C20384a("last_enqueue_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new C20383f.C20384a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new C20383f.C20384a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new C20383f.C20384a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new C20383f.C20384a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_count", new C20383f.C20384a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new C20383f.C20384a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("required_network_type", new C20383f.C20384a("required_network_type", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_charging", new C20383f.C20384a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new C20383f.C20384a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new C20383f.C20384a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new C20383f.C20384a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new C20383f.C20384a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new C20383f.C20384a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new C20383f.C20384a("content_uri_triggers", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C20383f.C20390f("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
            hashSet4.add(new C20383f.C20390f("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
            C20383f fVar4 = new C20383f("WorkSpec", hashMap2, hashSet3, hashSet4);
            C20383f a2 = C20383f.m95160a(fVar2, "WorkSpec");
            if (!fVar4.equals(a2)) {
                return new C20372u1.C20375c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar4 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C20383f.C20384a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new C20383f.C20384a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C20383f.C20388d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C20383f.C20390f("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            C20383f fVar5 = new C20383f("WorkTag", hashMap3, hashSet5, hashSet6);
            C20383f a3 = C20383f.m95160a(fVar2, "WorkTag");
            if (!fVar5.equals(a3)) {
                return new C20372u1.C20375c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar5 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new C20383f.C20384a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("generation", new C20383f.C20384a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new C20383f.C20384a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C20383f.C20388d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C20383f fVar6 = new C20383f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C20383f a4 = C20383f.m95160a(fVar2, "SystemIdInfo");
            if (!fVar6.equals(a4)) {
                return new C20372u1.C20375c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar6 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C20383f.C20384a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new C20383f.C20384a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C20383f.C20388d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C20383f.C20390f("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            C20383f fVar7 = new C20383f("WorkName", hashMap5, hashSet8, hashSet9);
            C20383f a5 = C20383f.m95160a(fVar2, "WorkName");
            if (!fVar7.equals(a5)) {
                return new C20372u1.C20375c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar7 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C20383f.C20384a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new C20383f.C20384a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C20383f.C20388d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C20383f fVar8 = new C20383f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C20383f a6 = C20383f.m95160a(fVar2, "WorkProgress");
            if (!fVar8.equals(a6)) {
                return new C20372u1.C20375c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar8 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C20383f.C20384a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new C20383f.C20384a("long_value", "INTEGER", false, 0, (String) null, 1));
            C20383f fVar9 = new C20383f(Preference.f50843h1, hashMap7, new HashSet(0), new HashSet(0));
            C20383f a7 = C20383f.m95160a(fVar2, Preference.f50843h1);
            if (fVar9.equals(a7)) {
                return new C20372u1.C20375c(true, (String) null);
            }
            return new C20372u1.C20375c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar9 + "\n Found:\n" + a7);
        }
    }

    /* renamed from: R */
    public C21211b mo63201R() {
        C21211b bVar;
        if (this.f54452s != null) {
            return this.f54452s;
        }
        synchronized (this) {
            if (this.f54452s == null) {
                this.f54452s = new C21218c(this);
            }
            bVar = this.f54452s;
        }
        return bVar;
    }

    /* renamed from: S */
    public C21222e mo63202S() {
        C21222e eVar;
        if (this.f54457x != null) {
            return this.f54457x;
        }
        synchronized (this) {
            if (this.f54457x == null) {
                this.f54457x = new C21223f(this);
            }
            eVar = this.f54457x;
        }
        return eVar;
    }

    /* renamed from: T */
    public C21226g mo63203T() {
        C21226g gVar;
        if (this.f54458y != null) {
            return this.f54458y;
        }
        synchronized (this) {
            if (this.f54458y == null) {
                this.f54458y = new C21227h(this);
            }
            gVar = this.f54458y;
        }
        return gVar;
    }

    /* renamed from: U */
    public C21230j mo63204U() {
        C21230j jVar;
        if (this.f54454u != null) {
            return this.f54454u;
        }
        synchronized (this) {
            if (this.f54454u == null) {
                this.f54454u = new C21232k(this);
            }
            jVar = this.f54454u;
        }
        return jVar;
    }

    /* renamed from: V */
    public C21239o mo63205V() {
        C21239o oVar;
        if (this.f54455v != null) {
            return this.f54455v;
        }
        synchronized (this) {
            if (this.f54455v == null) {
                this.f54455v = new C21240p(this);
            }
            oVar = this.f54455v;
        }
        return oVar;
    }

    /* renamed from: W */
    public C21243r mo63206W() {
        C21243r rVar;
        if (this.f54456w != null) {
            return this.f54456w;
        }
        synchronized (this) {
            if (this.f54456w == null) {
                this.f54456w = new C21244s(this);
            }
            rVar = this.f54456w;
        }
        return rVar;
    }

    /* renamed from: X */
    public C21253v mo63207X() {
        C21253v vVar;
        if (this.f54451r != null) {
            return this.f54451r;
        }
        synchronized (this) {
            if (this.f54451r == null) {
                this.f54451r = new C21254w(this);
            }
            vVar = this.f54451r;
        }
        return vVar;
    }

    /* renamed from: Y */
    public C21275z mo63208Y() {
        C21275z zVar;
        if (this.f54453t != null) {
            return this.f54453t;
        }
        synchronized (this) {
            if (this.f54453t == null) {
                this.f54453t = new C21208a0(this);
            }
            zVar = this.f54453t;
        }
        return zVar;
    }

    /* renamed from: f */
    public void mo17561f() {
        super.mo60903c();
        C20466f d3 = super.mo60913s().mo18117d3();
        try {
            super.mo60905e();
            d3.mo60782s0("PRAGMA defer_foreign_keys = TRUE");
            d3.mo60782s0("DELETE FROM `Dependency`");
            d3.mo60782s0("DELETE FROM `WorkSpec`");
            d3.mo60782s0("DELETE FROM `WorkTag`");
            d3.mo60782s0("DELETE FROM `SystemIdInfo`");
            d3.mo60782s0("DELETE FROM `WorkName`");
            d3.mo60782s0("DELETE FROM `WorkProgress`");
            d3.mo60782s0("DELETE FROM `Preference`");
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
        return new C20295e0(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", Preference.f50843h1);
    }

    /* renamed from: j */
    public C20481g mo17563j(C20320i iVar) {
        return iVar.f52453c.mo18120a(C20481g.C20484b.m95489a(iVar.f52451a).mo61412d(iVar.f52452b).mo61411c(new C20372u1(iVar, new C21099a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).mo61410b());
    }

    /* renamed from: m */
    public List<C20343b> mo17564m(@C0359n0 Map<Class<? extends C20342a>, C20342a> map) {
        return Arrays.asList(new C20343b[]{new C21177e0(), new C21179f0()});
    }

    /* renamed from: u */
    public Set<Class<? extends C20342a>> mo17565u() {
        return new HashSet();
    }

    /* renamed from: v */
    public Map<Class<?>, List<Class<?>>> mo17566v() {
        HashMap hashMap = new HashMap();
        hashMap.put(C21253v.class, C21254w.m98219P());
        hashMap.put(C21211b.class, C21218c.m98018f());
        hashMap.put(C21275z.class, C21208a0.m97993f());
        hashMap.put(C21230j.class, C21232k.m98071h());
        hashMap.put(C21239o.class, C21240p.m98096d());
        hashMap.put(C21243r.class, C21244s.m98109e());
        hashMap.put(C21222e.class, C21223f.m98037e());
        hashMap.put(C21226g.class, C21227h.m98050h());
        return hashMap;
    }
}
