package com.urbanairship.analytics.data;

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
import com.urbanairship.analytics.data.AnalyticsDatabase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AnalyticsDatabase_Impl extends AnalyticsDatabase {

    /* renamed from: u */
    public volatile C35536c f87657u;

    /* renamed from: com.urbanairship.analytics.data.AnalyticsDatabase_Impl$a */
    public class C35532a extends C20372u1.C20374b {
        public C35532a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo17567a(C20466f fVar) {
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT, `eventId` TEXT, `time` TEXT, `data` TEXT, `sessionId` TEXT, `eventSize` INTEGER NOT NULL)");
            fVar.mo60782s0("CREATE UNIQUE INDEX IF NOT EXISTS `index_events_eventId` ON `events` (`eventId`)");
            fVar.mo60782s0(C20369t1.f52542g);
            fVar.mo60782s0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '207c96f5c0531578ea783ce59c607d01')");
        }

        /* renamed from: b */
        public void mo17568b(C20466f fVar) {
            fVar.mo60782s0("DROP TABLE IF EXISTS `events`");
            if (AnalyticsDatabase_Impl.this.f52286h != null) {
                int size = AnalyticsDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) AnalyticsDatabase_Impl.this.f52286h.get(i)).mo60945b(fVar);
                }
            }
        }

        /* renamed from: c */
        public void mo17569c(C20466f fVar) {
            if (AnalyticsDatabase_Impl.this.f52286h != null) {
                int size = AnalyticsDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) AnalyticsDatabase_Impl.this.f52286h.get(i)).mo60944a(fVar);
                }
            }
        }

        /* renamed from: d */
        public void mo17570d(C20466f fVar) {
            C20466f unused = AnalyticsDatabase_Impl.this.f52279a = fVar;
            AnalyticsDatabase_Impl.this.mo60892D(fVar);
            if (AnalyticsDatabase_Impl.this.f52286h != null) {
                int size = AnalyticsDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) AnalyticsDatabase_Impl.this.f52286h.get(i)).mo60946c(fVar);
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
            HashMap hashMap = new HashMap(7);
            hashMap.put("id", new C20383f.C20384a("id", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("type", new C20383f.C20384a("type", "TEXT", false, 0, (String) null, 1));
            hashMap.put("eventId", new C20383f.C20384a("eventId", "TEXT", false, 0, (String) null, 1));
            hashMap.put("time", new C20383f.C20384a("time", "TEXT", false, 0, (String) null, 1));
            hashMap.put("data", new C20383f.C20384a("data", "TEXT", false, 0, (String) null, 1));
            hashMap.put("sessionId", new C20383f.C20384a("sessionId", "TEXT", false, 0, (String) null, 1));
            hashMap.put(AnalyticsDatabase.C35530a.f87652r, new C20383f.C20384a(AnalyticsDatabase.C35530a.f87652r, "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C20383f.C20390f(AnalyticsDatabase.C35531b.f87656f, true, Arrays.asList(new String[]{"eventId"}), Arrays.asList(new String[]{"ASC"})));
            C20383f fVar2 = new C20383f("events", hashMap, hashSet, hashSet2);
            C20383f a = C20383f.m95160a(fVar, "events");
            if (fVar2.equals(a)) {
                return new C20372u1.C20375c(true, (String) null);
            }
            return new C20372u1.C20375c(false, "events(com.urbanairship.analytics.data.EventEntity).\n Expected:\n" + fVar2 + "\n Found:\n" + a);
        }
    }

    /* renamed from: T */
    public C35536c mo106452T() {
        C35536c cVar;
        if (this.f87657u != null) {
            return this.f87657u;
        }
        synchronized (this) {
            if (this.f87657u == null) {
                this.f87657u = new C35537d(this);
            }
            cVar = this.f87657u;
        }
        return cVar;
    }

    /* renamed from: f */
    public void mo17561f() {
        super.mo60903c();
        C20466f d3 = super.mo60913s().mo18117d3();
        try {
            super.mo60905e();
            d3.mo60782s0("DELETE FROM `events`");
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
        return new C20295e0(this, new HashMap(0), new HashMap(0), "events");
    }

    /* renamed from: j */
    public C20481g mo17563j(C20320i iVar) {
        return iVar.f52453c.mo18120a(C20481g.C20484b.m95489a(iVar.f52451a).mo61412d(iVar.f52452b).mo61411c(new C20372u1(iVar, new C35532a(3), "207c96f5c0531578ea783ce59c607d01", "93e1ac461cee9254319cdc372fa539bf")).mo61410b());
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
        hashMap.put(C35536c.class, C35537d.m146636p());
        return hashMap;
    }
}
