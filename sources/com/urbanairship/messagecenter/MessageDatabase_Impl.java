package com.urbanairship.messagecenter;

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

public final class MessageDatabase_Impl extends MessageDatabase {

    /* renamed from: K */
    public volatile C9378j f25527K;

    /* renamed from: com.urbanairship.messagecenter.MessageDatabase_Impl$a */
    public class C9349a extends C20372u1.C20374b {
        public C9349a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo17567a(C20466f fVar) {
            fVar.mo60782s0("CREATE TABLE IF NOT EXISTS `richpush` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `message_id` TEXT, `message_url` TEXT, `message_body_url` TEXT, `message_read_url` TEXT, `title` TEXT, `extra` TEXT, `unread` INTEGER NOT NULL, `unread_orig` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `timestamp` TEXT, `raw_message_object` TEXT, `expiration_timestamp` TEXT)");
            fVar.mo60782s0("CREATE UNIQUE INDEX IF NOT EXISTS `index_richpush_message_id` ON `richpush` (`message_id`)");
            fVar.mo60782s0(C20369t1.f52542g);
            fVar.mo60782s0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '867ae7d13f0985895f1665a5fc7b7a17')");
        }

        /* renamed from: b */
        public void mo17568b(C20466f fVar) {
            fVar.mo60782s0("DROP TABLE IF EXISTS `richpush`");
            if (MessageDatabase_Impl.this.f52286h != null) {
                int size = MessageDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) MessageDatabase_Impl.this.f52286h.get(i)).mo60945b(fVar);
                }
            }
        }

        /* renamed from: c */
        public void mo17569c(C20466f fVar) {
            if (MessageDatabase_Impl.this.f52286h != null) {
                int size = MessageDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) MessageDatabase_Impl.this.f52286h.get(i)).mo60944a(fVar);
                }
            }
        }

        /* renamed from: d */
        public void mo17570d(C20466f fVar) {
            C20466f unused = MessageDatabase_Impl.this.f52279a = fVar;
            MessageDatabase_Impl.this.mo60892D(fVar);
            if (MessageDatabase_Impl.this.f52286h != null) {
                int size = MessageDatabase_Impl.this.f52286h.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.C20271b) MessageDatabase_Impl.this.f52286h.get(i)).mo60946c(fVar);
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
            HashMap hashMap = new HashMap(13);
            hashMap.put("_id", new C20383f.C20384a("_id", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("message_id", new C20383f.C20384a("message_id", "TEXT", false, 0, (String) null, 1));
            hashMap.put("message_url", new C20383f.C20384a("message_url", "TEXT", false, 0, (String) null, 1));
            hashMap.put("message_body_url", new C20383f.C20384a("message_body_url", "TEXT", false, 0, (String) null, 1));
            hashMap.put("message_read_url", new C20383f.C20384a("message_read_url", "TEXT", false, 0, (String) null, 1));
            hashMap.put("title", new C20383f.C20384a("title", "TEXT", false, 0, (String) null, 1));
            hashMap.put("extra", new C20383f.C20384a("extra", "TEXT", false, 0, (String) null, 1));
            hashMap.put("unread", new C20383f.C20384a("unread", "INTEGER", true, 0, (String) null, 1));
            hashMap.put(MessageDatabase.f25507A, new C20383f.C20384a(MessageDatabase.f25507A, "INTEGER", true, 0, (String) null, 1));
            hashMap.put(MessageDatabase.f25508B, new C20383f.C20384a(MessageDatabase.f25508B, "INTEGER", true, 0, (String) null, 1));
            hashMap.put("timestamp", new C20383f.C20384a("timestamp", "TEXT", false, 0, (String) null, 1));
            hashMap.put(MessageDatabase.f25510D, new C20383f.C20384a(MessageDatabase.f25510D, "TEXT", false, 0, (String) null, 1));
            hashMap.put(MessageDatabase.f25511E, new C20383f.C20384a(MessageDatabase.f25511E, "TEXT", false, 0, (String) null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C20383f.C20390f(C9382l.f25660d, true, Arrays.asList(new String[]{"message_id"}), Arrays.asList(new String[]{"ASC"})));
            C20383f fVar2 = new C20383f(MessageDatabase.f25518r, hashMap, hashSet, hashSet2);
            C20383f a = C20383f.m95160a(fVar, MessageDatabase.f25518r);
            if (fVar2.equals(a)) {
                return new C20372u1.C20375c(true, (String) null);
            }
            return new C20372u1.C20375c(false, "richpush(com.urbanairship.messagecenter.MessageEntity).\n Expected:\n" + fVar2 + "\n Found:\n" + a);
        }
    }

    /* renamed from: S */
    public C9378j mo18895S() {
        C9378j jVar;
        if (this.f25527K != null) {
            return this.f25527K;
        }
        synchronized (this) {
            if (this.f25527K == null) {
                this.f25527K = new C9379k(this);
            }
            jVar = this.f25527K;
        }
        return jVar;
    }

    /* renamed from: f */
    public void mo17561f() {
        super.mo60903c();
        C20466f d3 = super.mo60913s().mo18117d3();
        try {
            super.mo60905e();
            d3.mo60782s0("DELETE FROM `richpush`");
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
        return new C20295e0(this, new HashMap(0), new HashMap(0), MessageDatabase.f25518r);
    }

    /* renamed from: j */
    public C20481g mo17563j(C20320i iVar) {
        return iVar.f52453c.mo18120a(C20481g.C20484b.m95489a(iVar.f52451a).mo61412d(iVar.f52452b).mo61411c(new C20372u1(iVar, new C9349a(5), "867ae7d13f0985895f1665a5fc7b7a17", "d9f9d711f596d7f406febbe363d73f40")).mo61410b());
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
        hashMap.put(C9378j.class, C9379k.m35302E());
        return hashMap;
    }
}
