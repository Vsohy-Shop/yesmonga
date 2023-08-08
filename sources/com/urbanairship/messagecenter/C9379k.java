package com.urbanairship.messagecenter;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C20361r;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.C20376a;
import androidx.room.util.C20378b;
import androidx.room.util.C20382e;
import androidx.sqlite.p031db.C20492k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.urbanairship.messagecenter.k */
public final class C9379k extends C9378j {

    /* renamed from: a */
    public final RoomDatabase f25654a;

    /* renamed from: b */
    public final C20361r<C9383m> f25655b;

    /* renamed from: c */
    public final SharedSQLiteStatement f25656c;

    /* renamed from: com.urbanairship.messagecenter.k$a */
    public class C9380a extends C20361r<C9383m> {
        public C9380a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR REPLACE INTO `richpush` (`_id`,`message_id`,`message_url`,`message_body_url`,`message_read_url`,`title`,`extra`,`unread`,`unread_orig`,`deleted`,`timestamp`,`raw_message_object`,`expiration_timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C9383m mVar) {
            kVar.mo60790S2(1, (long) mVar.f25661a);
            String str = mVar.f25662b;
            if (str == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60801v2(2, str);
            }
            String str2 = mVar.f25663c;
            if (str2 == null) {
                kVar.mo60800u3(3);
            } else {
                kVar.mo60801v2(3, str2);
            }
            String str3 = mVar.f25664d;
            if (str3 == null) {
                kVar.mo60800u3(4);
            } else {
                kVar.mo60801v2(4, str3);
            }
            String str4 = mVar.f25665e;
            if (str4 == null) {
                kVar.mo60800u3(5);
            } else {
                kVar.mo60801v2(5, str4);
            }
            String str5 = mVar.f25666f;
            if (str5 == null) {
                kVar.mo60800u3(6);
            } else {
                kVar.mo60801v2(6, str5);
            }
            String str6 = mVar.f25667g;
            if (str6 == null) {
                kVar.mo60800u3(7);
            } else {
                kVar.mo60801v2(7, str6);
            }
            kVar.mo60790S2(8, mVar.f25668h ? 1 : 0);
            kVar.mo60790S2(9, mVar.f25669i ? 1 : 0);
            kVar.mo60790S2(10, mVar.f25670j ? 1 : 0);
            String str7 = mVar.f25671k;
            if (str7 == null) {
                kVar.mo60800u3(11);
            } else {
                kVar.mo60801v2(11, str7);
            }
            String str8 = mVar.f25672l;
            if (str8 == null) {
                kVar.mo60800u3(12);
            } else {
                kVar.mo60801v2(12, str8);
            }
            String str9 = mVar.f25673m;
            if (str9 == null) {
                kVar.mo60800u3(13);
            } else {
                kVar.mo60801v2(13, str9);
            }
        }
    }

    /* renamed from: com.urbanairship.messagecenter.k$b */
    public class C9381b extends SharedSQLiteStatement {
        public C9381b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM richpush";
        }
    }

    public C9379k(RoomDatabase roomDatabase) {
        this.f25654a = roomDatabase;
        this.f25655b = new C9380a(roomDatabase);
        this.f25656c = new C9381b(roomDatabase);
    }

    /* renamed from: E */
    public static List<Class<?>> m35302E() {
        return Collections.emptyList();
    }

    /* renamed from: A */
    public void mo19010A(List<String> list) {
        this.f25654a.mo60904d();
        StringBuilder d = C20382e.m95158d();
        d.append("UPDATE richpush SET unread = 1 WHERE message_id IN (");
        C20382e.m95155a(d, list.size());
        d.append(")");
        C20492k h = this.f25654a.mo60907h(d.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                h.mo60800u3(i);
            } else {
                h.mo60801v2(i, next);
            }
            i++;
        }
        this.f25654a.mo60905e();
        try {
            h.mo60802y0();
            this.f25654a.mo60901O();
        } finally {
            this.f25654a.mo60908k();
        }
    }

    /* renamed from: C */
    public boolean mo19012C(String str) {
        boolean z = true;
        C20400v1 d = C20400v1.m95183d("SELECT EXISTS (SELECT 1 FROM richpush WHERE message_id = ?)", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f25654a.mo60904d();
        boolean z2 = false;
        Cursor f = C20378b.m95145f(this.f25654a, d, false, (CancellationSignal) null);
        try {
            if (f.moveToFirst()) {
                if (f.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: c */
    public void mo19014c() {
        this.f25654a.mo60904d();
        C20492k b = this.f25656c.mo60958b();
        this.f25654a.mo60905e();
        try {
            b.mo60802y0();
            this.f25654a.mo60901O();
        } finally {
            this.f25654a.mo60908k();
            this.f25656c.mo60963h(b);
        }
    }

    /* renamed from: e */
    public void mo19016e(List<String> list) {
        this.f25654a.mo60904d();
        StringBuilder d = C20382e.m95158d();
        d.append("DELETE FROM richpush WHERE message_id IN (");
        C20382e.m95155a(d, list.size());
        d.append(")");
        C20492k h = this.f25654a.mo60907h(d.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                h.mo60800u3(i);
            } else {
                h.mo60801v2(i, next);
            }
            i++;
        }
        this.f25654a.mo60905e();
        try {
            h.mo60802y0();
            this.f25654a.mo60901O();
        } finally {
            this.f25654a.mo60908k();
        }
    }

    /* renamed from: f */
    public void mo19017f(List<String> list) {
        this.f25654a.mo60905e();
        try {
            super.mo19017f(list);
            this.f25654a.mo60901O();
        } finally {
            this.f25654a.mo60908k();
        }
    }

    /* renamed from: h */
    public List<C9383m> mo19019h() {
        C20400v1 v1Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        boolean z2;
        boolean z3;
        String str7;
        String str8;
        String str9;
        C9379k kVar = this;
        C20400v1 d = C20400v1.m95183d("SELECT * FROM richpush WHERE deleted = 1", 0);
        kVar.f25654a.mo60904d();
        kVar.f25654a.mo60905e();
        try {
            Cursor f = C20378b.m95145f(kVar.f25654a, d, false, (CancellationSignal) null);
            try {
                int e = C20376a.m95137e(f, "_id");
                int e2 = C20376a.m95137e(f, "message_id");
                int e3 = C20376a.m95137e(f, "message_url");
                int e4 = C20376a.m95137e(f, "message_body_url");
                int e5 = C20376a.m95137e(f, "message_read_url");
                int e6 = C20376a.m95137e(f, "title");
                int e7 = C20376a.m95137e(f, "extra");
                int e8 = C20376a.m95137e(f, "unread");
                int e9 = C20376a.m95137e(f, MessageDatabase.f25507A);
                int e10 = C20376a.m95137e(f, MessageDatabase.f25508B);
                int e11 = C20376a.m95137e(f, "timestamp");
                int e12 = C20376a.m95137e(f, MessageDatabase.f25510D);
                int e13 = C20376a.m95137e(f, MessageDatabase.f25511E);
                v1Var = d;
                try {
                    try {
                        ArrayList arrayList = new ArrayList(f.getCount());
                        while (f.moveToNext()) {
                            if (f.isNull(e2)) {
                                str = null;
                            } else {
                                str = f.getString(e2);
                            }
                            if (f.isNull(e3)) {
                                str2 = null;
                            } else {
                                str2 = f.getString(e3);
                            }
                            if (f.isNull(e4)) {
                                str3 = null;
                            } else {
                                str3 = f.getString(e4);
                            }
                            if (f.isNull(e5)) {
                                str4 = null;
                            } else {
                                str4 = f.getString(e5);
                            }
                            if (f.isNull(e6)) {
                                str5 = null;
                            } else {
                                str5 = f.getString(e6);
                            }
                            if (f.isNull(e7)) {
                                str6 = null;
                            } else {
                                str6 = f.getString(e7);
                            }
                            if (f.getInt(e8) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (f.getInt(e9) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (f.getInt(e10) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (f.isNull(e11)) {
                                str7 = null;
                            } else {
                                str7 = f.getString(e11);
                            }
                            if (f.isNull(e12)) {
                                str8 = null;
                            } else {
                                str8 = f.getString(e12);
                            }
                            if (f.isNull(e13)) {
                                str9 = null;
                            } else {
                                str9 = f.getString(e13);
                            }
                            C9383m mVar = new C9383m(str, str2, str3, str4, str5, str6, z, z2, z3, str7, str8, str9);
                            int i = e12;
                            mVar.f25661a = f.getInt(e);
                            arrayList.add(mVar);
                            e12 = i;
                        }
                        kVar = this;
                        kVar.f25654a.mo60901O();
                        f.close();
                        v1Var.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        kVar = this;
                        f.close();
                        v1Var.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    f.close();
                    v1Var.release();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                v1Var = d;
                f.close();
                v1Var.release();
                throw th;
            }
        } finally {
            kVar.f25654a.mo60908k();
        }
    }

    /* renamed from: j */
    public List<C9383m> mo19021j() {
        C20400v1 v1Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        boolean z2;
        boolean z3;
        String str7;
        String str8;
        String str9;
        C9379k kVar = this;
        C20400v1 d = C20400v1.m95183d("SELECT * FROM richpush WHERE unread = 0 AND unread <> unread_orig", 0);
        kVar.f25654a.mo60904d();
        kVar.f25654a.mo60905e();
        try {
            Cursor f = C20378b.m95145f(kVar.f25654a, d, false, (CancellationSignal) null);
            try {
                int e = C20376a.m95137e(f, "_id");
                int e2 = C20376a.m95137e(f, "message_id");
                int e3 = C20376a.m95137e(f, "message_url");
                int e4 = C20376a.m95137e(f, "message_body_url");
                int e5 = C20376a.m95137e(f, "message_read_url");
                int e6 = C20376a.m95137e(f, "title");
                int e7 = C20376a.m95137e(f, "extra");
                int e8 = C20376a.m95137e(f, "unread");
                int e9 = C20376a.m95137e(f, MessageDatabase.f25507A);
                int e10 = C20376a.m95137e(f, MessageDatabase.f25508B);
                int e11 = C20376a.m95137e(f, "timestamp");
                int e12 = C20376a.m95137e(f, MessageDatabase.f25510D);
                int e13 = C20376a.m95137e(f, MessageDatabase.f25511E);
                v1Var = d;
                try {
                    try {
                        ArrayList arrayList = new ArrayList(f.getCount());
                        while (f.moveToNext()) {
                            if (f.isNull(e2)) {
                                str = null;
                            } else {
                                str = f.getString(e2);
                            }
                            if (f.isNull(e3)) {
                                str2 = null;
                            } else {
                                str2 = f.getString(e3);
                            }
                            if (f.isNull(e4)) {
                                str3 = null;
                            } else {
                                str3 = f.getString(e4);
                            }
                            if (f.isNull(e5)) {
                                str4 = null;
                            } else {
                                str4 = f.getString(e5);
                            }
                            if (f.isNull(e6)) {
                                str5 = null;
                            } else {
                                str5 = f.getString(e6);
                            }
                            if (f.isNull(e7)) {
                                str6 = null;
                            } else {
                                str6 = f.getString(e7);
                            }
                            if (f.getInt(e8) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (f.getInt(e9) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (f.getInt(e10) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (f.isNull(e11)) {
                                str7 = null;
                            } else {
                                str7 = f.getString(e11);
                            }
                            if (f.isNull(e12)) {
                                str8 = null;
                            } else {
                                str8 = f.getString(e12);
                            }
                            if (f.isNull(e13)) {
                                str9 = null;
                            } else {
                                str9 = f.getString(e13);
                            }
                            C9383m mVar = new C9383m(str, str2, str3, str4, str5, str6, z, z2, z3, str7, str8, str9);
                            int i = e12;
                            mVar.f25661a = f.getInt(e);
                            arrayList.add(mVar);
                            e12 = i;
                        }
                        kVar = this;
                        kVar.f25654a.mo60901O();
                        f.close();
                        v1Var.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        kVar = this;
                        f.close();
                        v1Var.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    f.close();
                    v1Var.release();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                v1Var = d;
                f.close();
                v1Var.release();
                throw th;
            }
        } finally {
            kVar.f25654a.mo60908k();
        }
    }

    /* renamed from: l */
    public List<String> mo19023l() {
        Cursor f;
        String str;
        C20400v1 d = C20400v1.m95183d("SELECT message_id FROM richpush", 0);
        this.f25654a.mo60904d();
        this.f25654a.mo60905e();
        try {
            f = C20378b.m95145f(this.f25654a, d, false, (CancellationSignal) null);
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str = null;
                } else {
                    str = f.getString(0);
                }
                arrayList.add(str);
            }
            this.f25654a.mo60901O();
            f.close();
            d.release();
            this.f25654a.mo60908k();
            return arrayList;
        } catch (Throwable th) {
            this.f25654a.mo60908k();
            throw th;
        }
    }

    /* renamed from: n */
    public List<C9383m> mo19025n() {
        C20400v1 v1Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        boolean z2;
        boolean z3;
        String str7;
        String str8;
        String str9;
        C9379k kVar = this;
        C20400v1 d = C20400v1.m95183d("SELECT * FROM richpush", 0);
        kVar.f25654a.mo60904d();
        kVar.f25654a.mo60905e();
        try {
            Cursor f = C20378b.m95145f(kVar.f25654a, d, false, (CancellationSignal) null);
            try {
                int e = C20376a.m95137e(f, "_id");
                int e2 = C20376a.m95137e(f, "message_id");
                int e3 = C20376a.m95137e(f, "message_url");
                int e4 = C20376a.m95137e(f, "message_body_url");
                int e5 = C20376a.m95137e(f, "message_read_url");
                int e6 = C20376a.m95137e(f, "title");
                int e7 = C20376a.m95137e(f, "extra");
                int e8 = C20376a.m95137e(f, "unread");
                int e9 = C20376a.m95137e(f, MessageDatabase.f25507A);
                int e10 = C20376a.m95137e(f, MessageDatabase.f25508B);
                int e11 = C20376a.m95137e(f, "timestamp");
                int e12 = C20376a.m95137e(f, MessageDatabase.f25510D);
                int e13 = C20376a.m95137e(f, MessageDatabase.f25511E);
                v1Var = d;
                try {
                    try {
                        ArrayList arrayList = new ArrayList(f.getCount());
                        while (f.moveToNext()) {
                            if (f.isNull(e2)) {
                                str = null;
                            } else {
                                str = f.getString(e2);
                            }
                            if (f.isNull(e3)) {
                                str2 = null;
                            } else {
                                str2 = f.getString(e3);
                            }
                            if (f.isNull(e4)) {
                                str3 = null;
                            } else {
                                str3 = f.getString(e4);
                            }
                            if (f.isNull(e5)) {
                                str4 = null;
                            } else {
                                str4 = f.getString(e5);
                            }
                            if (f.isNull(e6)) {
                                str5 = null;
                            } else {
                                str5 = f.getString(e6);
                            }
                            if (f.isNull(e7)) {
                                str6 = null;
                            } else {
                                str6 = f.getString(e7);
                            }
                            if (f.getInt(e8) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (f.getInt(e9) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (f.getInt(e10) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (f.isNull(e11)) {
                                str7 = null;
                            } else {
                                str7 = f.getString(e11);
                            }
                            if (f.isNull(e12)) {
                                str8 = null;
                            } else {
                                str8 = f.getString(e12);
                            }
                            if (f.isNull(e13)) {
                                str9 = null;
                            } else {
                                str9 = f.getString(e13);
                            }
                            C9383m mVar = new C9383m(str, str2, str3, str4, str5, str6, z, z2, z3, str7, str8, str9);
                            int i = e12;
                            mVar.f25661a = f.getInt(e);
                            arrayList.add(mVar);
                            e12 = i;
                        }
                        kVar = this;
                        kVar.f25654a.mo60901O();
                        f.close();
                        v1Var.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        kVar = this;
                        f.close();
                        v1Var.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    f.close();
                    v1Var.release();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                v1Var = d;
                f.close();
                v1Var.release();
                throw th;
            }
        } finally {
            kVar.f25654a.mo60908k();
        }
    }

    /* renamed from: p */
    public void mo19027p(C9383m mVar) {
        this.f25654a.mo60904d();
        this.f25654a.mo60905e();
        try {
            this.f25655b.mo61158k(mVar);
            this.f25654a.mo60901O();
        } finally {
            this.f25654a.mo60908k();
        }
    }

    /* renamed from: r */
    public void mo19029r(List<C9383m> list) {
        this.f25654a.mo60904d();
        this.f25654a.mo60905e();
        try {
            this.f25655b.mo61157j(list);
            this.f25654a.mo60901O();
        } finally {
            this.f25654a.mo60908k();
        }
    }

    /* renamed from: u */
    public void mo19031u(List<String> list) {
        this.f25654a.mo60904d();
        StringBuilder d = C20382e.m95158d();
        d.append("UPDATE richpush SET deleted = 1 WHERE message_id IN (");
        C20382e.m95155a(d, list.size());
        d.append(")");
        C20492k h = this.f25654a.mo60907h(d.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                h.mo60800u3(i);
            } else {
                h.mo60801v2(i, next);
            }
            i++;
        }
        this.f25654a.mo60905e();
        try {
            h.mo60802y0();
            this.f25654a.mo60901O();
        } finally {
            this.f25654a.mo60908k();
        }
    }

    /* renamed from: w */
    public void mo19033w(List<String> list) {
        this.f25654a.mo60904d();
        StringBuilder d = C20382e.m95158d();
        d.append("UPDATE richpush SET unread = 0 WHERE message_id IN (");
        C20382e.m95155a(d, list.size());
        d.append(")");
        C20492k h = this.f25654a.mo60907h(d.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                h.mo60800u3(i);
            } else {
                h.mo60801v2(i, next);
            }
            i++;
        }
        this.f25654a.mo60905e();
        try {
            h.mo60802y0();
            this.f25654a.mo60901O();
        } finally {
            this.f25654a.mo60908k();
        }
    }

    /* renamed from: y */
    public void mo19035y(List<String> list) {
        this.f25654a.mo60904d();
        StringBuilder d = C20382e.m95158d();
        d.append("UPDATE richpush SET unread_orig = 0 WHERE message_id IN (");
        C20382e.m95155a(d, list.size());
        d.append(")");
        C20492k h = this.f25654a.mo60907h(d.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                h.mo60800u3(i);
            } else {
                h.mo60801v2(i, next);
            }
            i++;
        }
        this.f25654a.mo60905e();
        try {
            h.mo60802y0();
            this.f25654a.mo60901O();
        } finally {
            this.f25654a.mo60908k();
        }
    }
}
