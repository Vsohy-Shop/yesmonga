package com.urbanairship;

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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PreferenceDataDatabase_Impl extends PreferenceDataDatabase {

    /* renamed from: x */
    public volatile C36066s f87254x;

    /* renamed from: com.urbanairship.PreferenceDataDatabase_Impl$a */
    public class C35440a extends C20372u1.C20374b {
        public C35440a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo17567a(C20466f fVar) {
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `preferences` (`_id` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`_id`))");
            fVar.mo60782s0(C20369t1.f52542g);
            fVar.mo60782s0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1146f4c5ff2c986072906aee3af2535f')");
        }

        /* renamed from: b */
        public void mo17568b(C20466f fVar) {
            fVar.mo60782s0("DROP TABLE IF EXISTS `preferences`");
            if (PreferenceDataDatabase_Impl.this.f52286h != null) {
                int size = PreferenceDataDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) PreferenceDataDatabase_Impl.this.f52286h.get(i)).mo60945b(fVar);
                }
            }
        }

        /* renamed from: c */
        public void mo17569c(C20466f fVar) {
            if (PreferenceDataDatabase_Impl.this.f52286h != null) {
                int size = PreferenceDataDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) PreferenceDataDatabase_Impl.this.f52286h.get(i)).mo60944a(fVar);
                }
            }
        }

        /* renamed from: d */
        public void mo17570d(C20466f fVar) {
            C20466f unused = PreferenceDataDatabase_Impl.this.f52279a = fVar;
            PreferenceDataDatabase_Impl.this.mo60892D(fVar);
            if (PreferenceDataDatabase_Impl.this.f52286h != null) {
                int size = PreferenceDataDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) PreferenceDataDatabase_Impl.this.f52286h.get(i)).mo60946c(fVar);
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
            HashMap hashMap = new HashMap(2);
            hashMap.put("_id", new C20383f.C20384a("_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("value", new C20383f.C20384a("value", "TEXT", false, 0, (String) null, 1));
            C20383f fVar2 = new C20383f(PreferenceDataDatabase.f87249s, hashMap, new HashSet(0), new HashSet(0));
            C20383f a = C20383f.m95160a(fVar, PreferenceDataDatabase.f87249s);
            if (fVar2.equals(a)) {
                return new C20372u1.C20375c(true, (String) null);
            }
            return new C20372u1.C20375c(false, "preferences(com.urbanairship.PreferenceData).\n Expected:\n" + fVar2 + "\n Found:\n" + a);
        }
    }

    /* renamed from: T */
    public C36066s mo106199T() {
        C36066s sVar;
        if (this.f87254x != null) {
            return this.f87254x;
        }
        synchronized (this) {
            if (this.f87254x == null) {
                this.f87254x = new C36067t(this);
            }
            sVar = this.f87254x;
        }
        return sVar;
    }

    /* renamed from: f */
    public void mo17561f() {
        super.mo60903c();
        C20466f d3 = super.mo60913s().mo18117d3();
        try {
            super.mo60905e();
            d3.mo60782s0("DELETE FROM `preferences`");
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
        return new C20295e0(this, new HashMap(0), new HashMap(0), PreferenceDataDatabase.f87249s);
    }

    /* renamed from: j */
    public C20481g mo17563j(C20320i iVar) {
        return iVar.f52453c.mo18120a(C20481g.C20484b.m95489a(iVar.f52451a).mo61412d(iVar.f52452b).mo61411c(new C20372u1(iVar, new C35440a(2), "1146f4c5ff2c986072906aee3af2535f", "4bfc112e4986489ec8dd7db647ee82f8")).mo61410b());
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
        hashMap.put(C36066s.class, C36067t.m148450g());
        return hashMap;
    }
}
