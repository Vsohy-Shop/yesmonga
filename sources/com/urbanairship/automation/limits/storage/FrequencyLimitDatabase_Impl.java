package com.urbanairship.automation.limits.storage;

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
import com.urbanairship.automation.C8970v;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class FrequencyLimitDatabase_Impl extends FrequencyLimitDatabase {

    /* renamed from: q */
    public volatile C8916b f23891q;

    /* renamed from: com.urbanairship.automation.limits.storage.FrequencyLimitDatabase_Impl$a */
    public class C8914a extends C20372u1.C20374b {
        public C8914a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo17567a(C20466f fVar) {
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `constraints` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `constraintId` TEXT, `count` INTEGER NOT NULL, `range` INTEGER NOT NULL)");
            fVar.mo60782s0("CREATE UNIQUE INDEX IF NOT EXISTS `index_constraints_constraintId` ON `constraints` (`constraintId`)");
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `occurrences` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `parentConstraintId` TEXT, `timeStamp` INTEGER NOT NULL, FOREIGN KEY(`parentConstraintId`) REFERENCES `constraints`(`constraintId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            fVar.mo60782s0("CREATE INDEX IF NOT EXISTS `index_occurrences_parentConstraintId` ON `occurrences` (`parentConstraintId`)");
            fVar.mo60782s0(C20369t1.f52542g);
            fVar.mo60782s0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '35dc8997e1e42159a519f7f02410cda8')");
        }

        /* renamed from: b */
        public void mo17568b(C20466f fVar) {
            fVar.mo60782s0("DROP TABLE IF EXISTS `constraints`");
            fVar.mo60782s0("DROP TABLE IF EXISTS `occurrences`");
            if (FrequencyLimitDatabase_Impl.this.f52286h != null) {
                int size = FrequencyLimitDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) FrequencyLimitDatabase_Impl.this.f52286h.get(i)).mo60945b(fVar);
                }
            }
        }

        /* renamed from: c */
        public void mo17569c(C20466f fVar) {
            if (FrequencyLimitDatabase_Impl.this.f52286h != null) {
                int size = FrequencyLimitDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) FrequencyLimitDatabase_Impl.this.f52286h.get(i)).mo60944a(fVar);
                }
            }
        }

        /* renamed from: d */
        public void mo17570d(C20466f fVar) {
            C20466f unused = FrequencyLimitDatabase_Impl.this.f52279a = fVar;
            fVar.mo60782s0("PRAGMA foreign_keys = ON");
            FrequencyLimitDatabase_Impl.this.mo60892D(fVar);
            if (FrequencyLimitDatabase_Impl.this.f52286h != null) {
                int size = FrequencyLimitDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) FrequencyLimitDatabase_Impl.this.f52286h.get(i)).mo60946c(fVar);
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
            HashMap hashMap = new HashMap(4);
            hashMap.put("id", new C20383f.C20384a("id", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("constraintId", new C20383f.C20384a("constraintId", "TEXT", false, 0, (String) null, 1));
            hashMap.put("count", new C20383f.C20384a("count", "INTEGER", true, 0, (String) null, 1));
            hashMap.put(C8970v.f24100k, new C20383f.C20384a(C8970v.f24100k, "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C20383f.C20390f("index_constraints_constraintId", true, Arrays.asList(new String[]{"constraintId"}), Arrays.asList(new String[]{"ASC"})));
            C20383f fVar3 = new C20383f("constraints", hashMap, hashSet, hashSet2);
            C20383f a = C20383f.m95160a(fVar2, "constraints");
            if (!fVar3.equals(a)) {
                return new C20372u1.C20375c(false, "constraints(com.urbanairship.automation.limits.storage.ConstraintEntity).\n Expected:\n" + fVar3 + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(3);
            hashMap2.put("id", new C20383f.C20384a("id", "INTEGER", true, 1, (String) null, 1));
            hashMap2.put("parentConstraintId", new C20383f.C20384a("parentConstraintId", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("timeStamp", new C20383f.C20384a("timeStamp", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new C20383f.C20388d("constraints", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"parentConstraintId"}), Arrays.asList(new String[]{"constraintId"})));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new C20383f.C20390f("index_occurrences_parentConstraintId", false, Arrays.asList(new String[]{"parentConstraintId"}), Arrays.asList(new String[]{"ASC"})));
            C20383f fVar4 = new C20383f("occurrences", hashMap2, hashSet3, hashSet4);
            C20383f a2 = C20383f.m95160a(fVar2, "occurrences");
            if (fVar4.equals(a2)) {
                return new C20372u1.C20375c(true, (String) null);
            }
            return new C20372u1.C20375c(false, "occurrences(com.urbanairship.automation.limits.storage.OccurrenceEntity).\n Expected:\n" + fVar4 + "\n Found:\n" + a2);
        }
    }

    /* renamed from: R */
    public C8916b mo17560R() {
        C8916b bVar;
        if (this.f23891q != null) {
            return this.f23891q;
        }
        synchronized (this) {
            if (this.f23891q == null) {
                this.f23891q = new C8917c(this);
            }
            bVar = this.f23891q;
        }
        return bVar;
    }

    /* renamed from: f */
    public void mo17561f() {
        super.mo60903c();
        C20466f d3 = super.mo60913s().mo18117d3();
        try {
            super.mo60905e();
            d3.mo60782s0("PRAGMA defer_foreign_keys = TRUE");
            d3.mo60782s0("DELETE FROM `constraints`");
            d3.mo60782s0("DELETE FROM `occurrences`");
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
        return new C20295e0(this, new HashMap(0), new HashMap(0), "constraints", "occurrences");
    }

    /* renamed from: j */
    public C20481g mo17563j(C20320i iVar) {
        return iVar.f52453c.mo18120a(C20481g.C20484b.m95489a(iVar.f52451a).mo61412d(iVar.f52452b).mo61411c(new C20372u1(iVar, new C8914a(1), "35dc8997e1e42159a519f7f02410cda8", "400933b7a06a2d0cdaabbefb93b3eecc")).mo61410b());
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
        hashMap.put(C8916b.class, C8917c.m33104i());
        return hashMap;
    }
}
