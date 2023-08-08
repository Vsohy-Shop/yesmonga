package com.urbanairship.automation.limits.storage;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C20357q;
import androidx.room.C20361r;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.room.util.C20376a;
import androidx.room.util.C20378b;
import androidx.room.util.C20382e;
import androidx.sqlite.p031db.C20492k;
import com.urbanairship.automation.C8970v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.urbanairship.automation.limits.storage.c */
public final class C8917c implements C8916b {

    /* renamed from: a */
    public final RoomDatabase f23897a;

    /* renamed from: b */
    public final C20361r<C8915a> f23898b;

    /* renamed from: c */
    public final C20361r<C8922d> f23899c;

    /* renamed from: d */
    public final C20357q<C8915a> f23900d;

    /* renamed from: e */
    public final C20357q<C8915a> f23901e;

    /* renamed from: com.urbanairship.automation.limits.storage.c$a */
    public class C8918a extends C20361r<C8915a> {
        public C8918a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR IGNORE INTO `constraints` (`id`,`constraintId`,`count`,`range`) VALUES (nullif(?, 0),?,?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C8915a aVar) {
            kVar.mo60790S2(1, (long) aVar.f23893a);
            String str = aVar.f23894b;
            if (str == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60801v2(2, str);
            }
            kVar.mo60790S2(3, (long) aVar.f23895c);
            kVar.mo60790S2(4, aVar.f23896d);
        }
    }

    /* renamed from: com.urbanairship.automation.limits.storage.c$b */
    public class C8919b extends C20361r<C8922d> {
        public C8919b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR REPLACE INTO `occurrences` (`id`,`parentConstraintId`,`timeStamp`) VALUES (nullif(?, 0),?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C8922d dVar) {
            kVar.mo60790S2(1, (long) dVar.f23906a);
            String str = dVar.f23907b;
            if (str == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60801v2(2, str);
            }
            kVar.mo60790S2(3, dVar.f23908c);
        }
    }

    /* renamed from: com.urbanairship.automation.limits.storage.c$c */
    public class C8920c extends C20357q<C8915a> {
        public C8920c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM `constraints` WHERE `id` = ?";
        }

        /* renamed from: m */
        public void mo17586i(C20492k kVar, C8915a aVar) {
            kVar.mo60790S2(1, (long) aVar.f23893a);
        }
    }

    /* renamed from: com.urbanairship.automation.limits.storage.c$d */
    public class C8921d extends C20357q<C8915a> {
        public C8921d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE OR ABORT `constraints` SET `id` = ?,`constraintId` = ?,`count` = ?,`range` = ? WHERE `id` = ?";
        }

        /* renamed from: m */
        public void mo17586i(C20492k kVar, C8915a aVar) {
            kVar.mo60790S2(1, (long) aVar.f23893a);
            String str = aVar.f23894b;
            if (str == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60801v2(2, str);
            }
            kVar.mo60790S2(3, (long) aVar.f23895c);
            kVar.mo60790S2(4, aVar.f23896d);
            kVar.mo60790S2(5, (long) aVar.f23893a);
        }
    }

    public C8917c(RoomDatabase roomDatabase) {
        this.f23897a = roomDatabase;
        this.f23898b = new C8918a(roomDatabase);
        this.f23899c = new C8919b(roomDatabase);
        this.f23900d = new C8920c(roomDatabase);
        this.f23901e = new C8921d(roomDatabase);
    }

    /* renamed from: i */
    public static List<Class<?>> m33104i() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo17574a(C8915a aVar) {
        this.f23897a.mo60904d();
        this.f23897a.mo60905e();
        try {
            this.f23901e.mo61150j(aVar);
            this.f23897a.mo60901O();
        } finally {
            this.f23897a.mo60908k();
        }
    }

    /* renamed from: b */
    public void mo17575b(C8915a aVar) {
        this.f23897a.mo60904d();
        this.f23897a.mo60905e();
        try {
            this.f23898b.mo61158k(aVar);
            this.f23897a.mo60901O();
        } finally {
            this.f23897a.mo60908k();
        }
    }

    /* renamed from: c */
    public void mo17576c(C8915a aVar) {
        this.f23897a.mo60904d();
        this.f23897a.mo60905e();
        try {
            this.f23900d.mo61150j(aVar);
            this.f23897a.mo60901O();
        } finally {
            this.f23897a.mo60908k();
        }
    }

    /* renamed from: d */
    public void mo17577d(Collection<String> collection) {
        this.f23897a.mo60904d();
        StringBuilder d = C20382e.m95158d();
        d.append("DELETE FROM constraints WHERE (constraintId IN (");
        C20382e.m95155a(d, collection.size());
        d.append("))");
        C20492k h = this.f23897a.mo60907h(d.toString());
        int i = 1;
        for (String next : collection) {
            if (next == null) {
                h.mo60800u3(i);
            } else {
                h.mo60801v2(i, next);
            }
            i++;
        }
        this.f23897a.mo60905e();
        try {
            h.mo60802y0();
            this.f23897a.mo60901O();
        } finally {
            this.f23897a.mo60908k();
        }
    }

    /* renamed from: e */
    public List<C8915a> mo17578e() {
        C20400v1 d = C20400v1.m95183d("SELECT * FROM constraints", 0);
        this.f23897a.mo60904d();
        Cursor f = C20378b.m95145f(this.f23897a, d, false, (CancellationSignal) null);
        try {
            int e = C20376a.m95137e(f, "id");
            int e2 = C20376a.m95137e(f, "constraintId");
            int e3 = C20376a.m95137e(f, "count");
            int e4 = C20376a.m95137e(f, C8970v.f24100k);
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                C8915a aVar = new C8915a();
                aVar.f23893a = f.getInt(e);
                if (f.isNull(e2)) {
                    aVar.f23894b = null;
                } else {
                    aVar.f23894b = f.getString(e2);
                }
                aVar.f23895c = f.getInt(e3);
                aVar.f23896d = f.getLong(e4);
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: f */
    public List<C8922d> mo17579f(String str) {
        C20400v1 d = C20400v1.m95183d("SELECT * FROM occurrences WHERE parentConstraintId = ? ORDER BY timeStamp ASC", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f23897a.mo60904d();
        Cursor f = C20378b.m95145f(this.f23897a, d, false, (CancellationSignal) null);
        try {
            int e = C20376a.m95137e(f, "id");
            int e2 = C20376a.m95137e(f, "parentConstraintId");
            int e3 = C20376a.m95137e(f, "timeStamp");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                C8922d dVar = new C8922d();
                dVar.f23906a = f.getInt(e);
                if (f.isNull(e2)) {
                    dVar.f23907b = null;
                } else {
                    dVar.f23907b = f.getString(e2);
                }
                dVar.f23908c = f.getLong(e3);
                arrayList.add(dVar);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: g */
    public void mo17580g(C8922d dVar) {
        this.f23897a.mo60904d();
        this.f23897a.mo60905e();
        try {
            this.f23899c.mo61158k(dVar);
            this.f23897a.mo60901O();
        } finally {
            this.f23897a.mo60908k();
        }
    }

    /* renamed from: h */
    public List<C8915a> mo17581h(Collection<String> collection) {
        StringBuilder d = C20382e.m95158d();
        d.append("SELECT * FROM constraints WHERE (constraintId IN (");
        int size = collection.size();
        C20382e.m95155a(d, size);
        d.append("))");
        C20400v1 d2 = C20400v1.m95183d(d.toString(), size + 0);
        int i = 1;
        for (String next : collection) {
            if (next == null) {
                d2.mo60800u3(i);
            } else {
                d2.mo60801v2(i, next);
            }
            i++;
        }
        this.f23897a.mo60904d();
        Cursor f = C20378b.m95145f(this.f23897a, d2, false, (CancellationSignal) null);
        try {
            int e = C20376a.m95137e(f, "id");
            int e2 = C20376a.m95137e(f, "constraintId");
            int e3 = C20376a.m95137e(f, "count");
            int e4 = C20376a.m95137e(f, C8970v.f24100k);
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                C8915a aVar = new C8915a();
                aVar.f23893a = f.getInt(e);
                if (f.isNull(e2)) {
                    aVar.f23894b = null;
                } else {
                    aVar.f23894b = f.getString(e2);
                }
                aVar.f23895c = f.getInt(e3);
                aVar.f23896d = f.getLong(e4);
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            f.close();
            d2.release();
        }
    }
}
