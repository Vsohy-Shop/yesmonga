package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.C1866a;
import androidx.lifecycle.LiveData;
import androidx.room.C20357q;
import androidx.room.C20361r;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.C20376a;
import androidx.room.util.C20378b;
import androidx.room.util.C20382e;
import androidx.sqlite.p031db.C20492k;
import androidx.work.BackoffPolicy;
import androidx.work.C21087c;
import androidx.work.C21091d;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.model.C21249u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: androidx.work.impl.model.w */
public final class C21254w implements C21253v {

    /* renamed from: a */
    public final RoomDatabase f54833a;

    /* renamed from: b */
    public final C20361r<C21249u> f54834b;

    /* renamed from: c */
    public final C20357q<C21249u> f54835c;

    /* renamed from: d */
    public final SharedSQLiteStatement f54836d;

    /* renamed from: e */
    public final SharedSQLiteStatement f54837e;

    /* renamed from: f */
    public final SharedSQLiteStatement f54838f;

    /* renamed from: g */
    public final SharedSQLiteStatement f54839g;

    /* renamed from: h */
    public final SharedSQLiteStatement f54840h;

    /* renamed from: i */
    public final SharedSQLiteStatement f54841i;

    /* renamed from: j */
    public final SharedSQLiteStatement f54842j;

    /* renamed from: k */
    public final SharedSQLiteStatement f54843k;

    /* renamed from: l */
    public final SharedSQLiteStatement f54844l;

    /* renamed from: m */
    public final SharedSQLiteStatement f54845m;

    /* renamed from: n */
    public final SharedSQLiteStatement f54846n;

    /* renamed from: androidx.work.impl.model.w$a */
    public class C21255a extends SharedSQLiteStatement {
        public C21255a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.w$b */
    public class C21256b extends SharedSQLiteStatement {
        public C21256b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: androidx.work.impl.model.w$c */
    public class C21257c extends SharedSQLiteStatement {
        public C21257c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* renamed from: androidx.work.impl.model.w$d */
    public class C21258d extends SharedSQLiteStatement {
        public C21258d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.w$e */
    public class C21259e implements Callable<List<String>> {

        /* renamed from: a */
        public final /* synthetic */ C20400v1 f54851a;

        public C21259e(C20400v1 v1Var) {
            this.f54851a = v1Var;
        }

        /* renamed from: a */
        public List<String> call() throws Exception {
            Cursor f;
            String str;
            C21254w.this.f54833a.mo60905e();
            try {
                f = C20378b.m95145f(C21254w.this.f54833a, this.f54851a, false, (CancellationSignal) null);
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    if (f.isNull(0)) {
                        str = null;
                    } else {
                        str = f.getString(0);
                    }
                    arrayList.add(str);
                }
                C21254w.this.f54833a.mo60901O();
                f.close();
                C21254w.this.f54833a.mo60908k();
                return arrayList;
            } catch (Throwable th) {
                C21254w.this.f54833a.mo60908k();
                throw th;
            }
        }

        public void finalize() {
            this.f54851a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.w$f */
    public class C21260f implements Callable<List<C21249u.C21252c>> {

        /* renamed from: a */
        public final /* synthetic */ C20400v1 f54853a;

        public C21260f(C20400v1 v1Var) {
            this.f54853a = v1Var;
        }

        /* renamed from: a */
        public List<C21249u.C21252c> call() throws Exception {
            Cursor f;
            String str;
            byte[] bArr;
            C21254w.this.f54833a.mo60905e();
            try {
                f = C20378b.m95145f(C21254w.this.f54833a, this.f54853a, true, (CancellationSignal) null);
                C1866a aVar = new C1866a();
                C1866a aVar2 = new C1866a();
                while (f.moveToNext()) {
                    String string = f.getString(0);
                    if (((ArrayList) aVar.get(string)) == null) {
                        aVar.put(string, new ArrayList());
                    }
                    String string2 = f.getString(0);
                    if (((ArrayList) aVar2.get(string2)) == null) {
                        aVar2.put(string2, new ArrayList());
                    }
                }
                f.moveToPosition(-1);
                C21254w.this.mo63555L(aVar);
                C21254w.this.mo63554K(aVar2);
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    if (f.isNull(0)) {
                        str = null;
                    } else {
                        str = f.getString(0);
                    }
                    int i = f.getInt(1);
                    C21212b0 b0Var = C21212b0.f54739a;
                    WorkInfo.State f2 = C21212b0.m98013f(i);
                    if (f.isNull(2)) {
                        bArr = null;
                    } else {
                        bArr = f.getBlob(2);
                    }
                    C21091d m = C21091d.m97587m(bArr);
                    int i2 = f.getInt(3);
                    int i3 = f.getInt(4);
                    ArrayList arrayList2 = (ArrayList) aVar.get(f.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) aVar2.get(f.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new C21249u.C21252c(str, f2, m, i2, i3, arrayList3, arrayList4));
                }
                C21254w.this.f54833a.mo60901O();
                f.close();
                C21254w.this.f54833a.mo60908k();
                return arrayList;
            } catch (Throwable th) {
                C21254w.this.f54833a.mo60908k();
                throw th;
            }
        }

        public void finalize() {
            this.f54853a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.w$g */
    public class C21261g implements Callable<List<C21249u.C21252c>> {

        /* renamed from: a */
        public final /* synthetic */ C20400v1 f54855a;

        public C21261g(C20400v1 v1Var) {
            this.f54855a = v1Var;
        }

        /* renamed from: a */
        public List<C21249u.C21252c> call() throws Exception {
            Cursor f;
            String str;
            byte[] bArr;
            C21254w.this.f54833a.mo60905e();
            try {
                f = C20378b.m95145f(C21254w.this.f54833a, this.f54855a, true, (CancellationSignal) null);
                C1866a aVar = new C1866a();
                C1866a aVar2 = new C1866a();
                while (f.moveToNext()) {
                    String string = f.getString(0);
                    if (((ArrayList) aVar.get(string)) == null) {
                        aVar.put(string, new ArrayList());
                    }
                    String string2 = f.getString(0);
                    if (((ArrayList) aVar2.get(string2)) == null) {
                        aVar2.put(string2, new ArrayList());
                    }
                }
                f.moveToPosition(-1);
                C21254w.this.mo63555L(aVar);
                C21254w.this.mo63554K(aVar2);
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    if (f.isNull(0)) {
                        str = null;
                    } else {
                        str = f.getString(0);
                    }
                    int i = f.getInt(1);
                    C21212b0 b0Var = C21212b0.f54739a;
                    WorkInfo.State f2 = C21212b0.m98013f(i);
                    if (f.isNull(2)) {
                        bArr = null;
                    } else {
                        bArr = f.getBlob(2);
                    }
                    C21091d m = C21091d.m97587m(bArr);
                    int i2 = f.getInt(3);
                    int i3 = f.getInt(4);
                    ArrayList arrayList2 = (ArrayList) aVar.get(f.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) aVar2.get(f.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new C21249u.C21252c(str, f2, m, i2, i3, arrayList3, arrayList4));
                }
                C21254w.this.f54833a.mo60901O();
                f.close();
                C21254w.this.f54833a.mo60908k();
                return arrayList;
            } catch (Throwable th) {
                C21254w.this.f54833a.mo60908k();
                throw th;
            }
        }

        public void finalize() {
            this.f54855a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.w$h */
    public class C21262h implements Callable<List<C21249u.C21252c>> {

        /* renamed from: a */
        public final /* synthetic */ C20400v1 f54857a;

        public C21262h(C20400v1 v1Var) {
            this.f54857a = v1Var;
        }

        /* renamed from: a */
        public List<C21249u.C21252c> call() throws Exception {
            Cursor f;
            String str;
            byte[] bArr;
            C21254w.this.f54833a.mo60905e();
            try {
                f = C20378b.m95145f(C21254w.this.f54833a, this.f54857a, true, (CancellationSignal) null);
                C1866a aVar = new C1866a();
                C1866a aVar2 = new C1866a();
                while (f.moveToNext()) {
                    String string = f.getString(0);
                    if (((ArrayList) aVar.get(string)) == null) {
                        aVar.put(string, new ArrayList());
                    }
                    String string2 = f.getString(0);
                    if (((ArrayList) aVar2.get(string2)) == null) {
                        aVar2.put(string2, new ArrayList());
                    }
                }
                f.moveToPosition(-1);
                C21254w.this.mo63555L(aVar);
                C21254w.this.mo63554K(aVar2);
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    if (f.isNull(0)) {
                        str = null;
                    } else {
                        str = f.getString(0);
                    }
                    int i = f.getInt(1);
                    C21212b0 b0Var = C21212b0.f54739a;
                    WorkInfo.State f2 = C21212b0.m98013f(i);
                    if (f.isNull(2)) {
                        bArr = null;
                    } else {
                        bArr = f.getBlob(2);
                    }
                    C21091d m = C21091d.m97587m(bArr);
                    int i2 = f.getInt(3);
                    int i3 = f.getInt(4);
                    ArrayList arrayList2 = (ArrayList) aVar.get(f.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) aVar2.get(f.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new C21249u.C21252c(str, f2, m, i2, i3, arrayList3, arrayList4));
                }
                C21254w.this.f54833a.mo60901O();
                f.close();
                C21254w.this.f54833a.mo60908k();
                return arrayList;
            } catch (Throwable th) {
                C21254w.this.f54833a.mo60908k();
                throw th;
            }
        }

        public void finalize() {
            this.f54857a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.w$i */
    public class C21263i implements Callable<Long> {

        /* renamed from: a */
        public final /* synthetic */ C20400v1 f54859a;

        public C21263i(C20400v1 v1Var) {
            this.f54859a = v1Var;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            long j;
            Cursor f = C20378b.m95145f(C21254w.this.f54833a, this.f54859a, false, (CancellationSignal) null);
            try {
                if (f.moveToFirst()) {
                    j = f.getLong(0);
                } else {
                    j = 0;
                }
                return Long.valueOf(j);
            } finally {
                f.close();
            }
        }

        public void finalize() {
            this.f54859a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.w$j */
    public class C21264j extends C20361r<C21249u> {
        public C21264j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C21249u uVar) {
            String str = uVar.f54804a;
            if (str == null) {
                kVar.mo60800u3(1);
            } else {
                kVar.mo60801v2(1, str);
            }
            C21212b0 b0Var = C21212b0.f54739a;
            kVar.mo60790S2(2, (long) C21212b0.m98017j(uVar.f54805b));
            String str2 = uVar.f54806c;
            if (str2 == null) {
                kVar.mo60800u3(3);
            } else {
                kVar.mo60801v2(3, str2);
            }
            String str3 = uVar.f54807d;
            if (str3 == null) {
                kVar.mo60800u3(4);
            } else {
                kVar.mo60801v2(4, str3);
            }
            byte[] F = C21091d.m97574F(uVar.f54808e);
            if (F == null) {
                kVar.mo60800u3(5);
            } else {
                kVar.mo60791a3(5, F);
            }
            byte[] F2 = C21091d.m97574F(uVar.f54809f);
            if (F2 == null) {
                kVar.mo60800u3(6);
            } else {
                kVar.mo60791a3(6, F2);
            }
            kVar.mo60790S2(7, uVar.f54810g);
            kVar.mo60790S2(8, uVar.f54811h);
            kVar.mo60790S2(9, uVar.f54812i);
            kVar.mo60790S2(10, (long) uVar.f54814k);
            kVar.mo60790S2(11, (long) C21212b0.m98008a(uVar.f54815l));
            kVar.mo60790S2(12, uVar.f54816m);
            kVar.mo60790S2(13, uVar.f54817n);
            kVar.mo60790S2(14, uVar.f54818o);
            kVar.mo60790S2(15, uVar.f54819p);
            kVar.mo60790S2(16, uVar.f54820q ? 1 : 0);
            kVar.mo60790S2(17, (long) C21212b0.m98015h(uVar.f54821r));
            kVar.mo60790S2(18, (long) uVar.mo63453A());
            kVar.mo60790S2(19, (long) uVar.mo63486z());
            C21087c cVar = uVar.f54813j;
            if (cVar != null) {
                kVar.mo60790S2(20, (long) C21212b0.m98014g(cVar.mo63128d()));
                kVar.mo60790S2(21, cVar.mo63132g() ? 1 : 0);
                kVar.mo60790S2(22, cVar.mo63133h() ? 1 : 0);
                kVar.mo60790S2(23, cVar.mo63131f() ? 1 : 0);
                kVar.mo60790S2(24, cVar.mo63135i() ? 1 : 0);
                kVar.mo60790S2(25, cVar.mo63126b());
                kVar.mo60790S2(26, cVar.mo63125a());
                byte[] i = C21212b0.m98016i(cVar.mo63127c());
                if (i == null) {
                    kVar.mo60800u3(27);
                } else {
                    kVar.mo60791a3(27, i);
                }
            } else {
                kVar.mo60800u3(20);
                kVar.mo60800u3(21);
                kVar.mo60800u3(22);
                kVar.mo60800u3(23);
                kVar.mo60800u3(24);
                kVar.mo60800u3(25);
                kVar.mo60800u3(26);
                kVar.mo60800u3(27);
            }
        }
    }

    /* renamed from: androidx.work.impl.model.w$k */
    public class C21265k extends C20357q<C21249u> {
        public C21265k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        /* renamed from: m */
        public void mo17586i(C20492k kVar, C21249u uVar) {
            String str = uVar.f54804a;
            if (str == null) {
                kVar.mo60800u3(1);
            } else {
                kVar.mo60801v2(1, str);
            }
            C21212b0 b0Var = C21212b0.f54739a;
            kVar.mo60790S2(2, (long) C21212b0.m98017j(uVar.f54805b));
            String str2 = uVar.f54806c;
            if (str2 == null) {
                kVar.mo60800u3(3);
            } else {
                kVar.mo60801v2(3, str2);
            }
            String str3 = uVar.f54807d;
            if (str3 == null) {
                kVar.mo60800u3(4);
            } else {
                kVar.mo60801v2(4, str3);
            }
            byte[] F = C21091d.m97574F(uVar.f54808e);
            if (F == null) {
                kVar.mo60800u3(5);
            } else {
                kVar.mo60791a3(5, F);
            }
            byte[] F2 = C21091d.m97574F(uVar.f54809f);
            if (F2 == null) {
                kVar.mo60800u3(6);
            } else {
                kVar.mo60791a3(6, F2);
            }
            kVar.mo60790S2(7, uVar.f54810g);
            kVar.mo60790S2(8, uVar.f54811h);
            kVar.mo60790S2(9, uVar.f54812i);
            kVar.mo60790S2(10, (long) uVar.f54814k);
            kVar.mo60790S2(11, (long) C21212b0.m98008a(uVar.f54815l));
            kVar.mo60790S2(12, uVar.f54816m);
            kVar.mo60790S2(13, uVar.f54817n);
            kVar.mo60790S2(14, uVar.f54818o);
            kVar.mo60790S2(15, uVar.f54819p);
            kVar.mo60790S2(16, uVar.f54820q ? 1 : 0);
            kVar.mo60790S2(17, (long) C21212b0.m98015h(uVar.f54821r));
            kVar.mo60790S2(18, (long) uVar.mo63453A());
            kVar.mo60790S2(19, (long) uVar.mo63486z());
            C21087c cVar = uVar.f54813j;
            if (cVar != null) {
                kVar.mo60790S2(20, (long) C21212b0.m98014g(cVar.mo63128d()));
                kVar.mo60790S2(21, cVar.mo63132g() ? 1 : 0);
                kVar.mo60790S2(22, cVar.mo63133h() ? 1 : 0);
                kVar.mo60790S2(23, cVar.mo63131f() ? 1 : 0);
                kVar.mo60790S2(24, cVar.mo63135i() ? 1 : 0);
                kVar.mo60790S2(25, cVar.mo63126b());
                kVar.mo60790S2(26, cVar.mo63125a());
                byte[] i = C21212b0.m98016i(cVar.mo63127c());
                if (i == null) {
                    kVar.mo60800u3(27);
                } else {
                    kVar.mo60791a3(27, i);
                }
            } else {
                kVar.mo60800u3(20);
                kVar.mo60800u3(21);
                kVar.mo60800u3(22);
                kVar.mo60800u3(23);
                kVar.mo60800u3(24);
                kVar.mo60800u3(25);
                kVar.mo60800u3(26);
                kVar.mo60800u3(27);
            }
            String str4 = uVar.f54804a;
            if (str4 == null) {
                kVar.mo60800u3(28);
            } else {
                kVar.mo60801v2(28, str4);
            }
        }
    }

    /* renamed from: androidx.work.impl.model.w$l */
    public class C21266l extends SharedSQLiteStatement {
        public C21266l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.w$m */
    public class C21267m extends SharedSQLiteStatement {
        public C21267m(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.w$n */
    public class C21268n extends SharedSQLiteStatement {
        public C21268n(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.w$o */
    public class C21269o extends SharedSQLiteStatement {
        public C21269o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.w$p */
    public class C21270p extends SharedSQLiteStatement {
        public C21270p(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.w$q */
    public class C21271q extends SharedSQLiteStatement {
        public C21271q(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.w$r */
    public class C21272r extends SharedSQLiteStatement {
        public C21272r(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public C21254w(RoomDatabase roomDatabase) {
        this.f54833a = roomDatabase;
        this.f54834b = new C21264j(roomDatabase);
        this.f54835c = new C21265k(roomDatabase);
        this.f54836d = new C21266l(roomDatabase);
        this.f54837e = new C21267m(roomDatabase);
        this.f54838f = new C21268n(roomDatabase);
        this.f54839g = new C21269o(roomDatabase);
        this.f54840h = new C21270p(roomDatabase);
        this.f54841i = new C21271q(roomDatabase);
        this.f54842j = new C21272r(roomDatabase);
        this.f54843k = new C21255a(roomDatabase);
        this.f54844l = new C21256b(roomDatabase);
        this.f54845m = new C21257c(roomDatabase);
        this.f54846n = new C21258d(roomDatabase);
    }

    /* renamed from: P */
    public static List<Class<?>> m98219P() {
        return Collections.emptyList();
    }

    /* renamed from: A */
    public List<C21249u> mo63518A() {
        C20400v1 v1Var;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        byte[] bArr3;
        C20400v1 d = C20400v1.m95183d("SELECT * FROM workspec WHERE state=1", 0);
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            int e = C20376a.m95137e(f, "id");
            int e2 = C20376a.m95137e(f, "state");
            int e3 = C20376a.m95137e(f, "worker_class_name");
            int e4 = C20376a.m95137e(f, "input_merger_class_name");
            int e5 = C20376a.m95137e(f, "input");
            int e6 = C20376a.m95137e(f, "output");
            int e7 = C20376a.m95137e(f, "initial_delay");
            int e8 = C20376a.m95137e(f, "interval_duration");
            int e9 = C20376a.m95137e(f, "flex_duration");
            int e10 = C20376a.m95137e(f, "run_attempt_count");
            int e11 = C20376a.m95137e(f, "backoff_policy");
            int e12 = C20376a.m95137e(f, "backoff_delay_duration");
            int e13 = C20376a.m95137e(f, "last_enqueue_time");
            int e14 = C20376a.m95137e(f, "minimum_retention_duration");
            v1Var = d;
            try {
                int e15 = C20376a.m95137e(f, "schedule_requested_at");
                int e16 = C20376a.m95137e(f, "run_in_foreground");
                int e17 = C20376a.m95137e(f, "out_of_quota_policy");
                int e18 = C20376a.m95137e(f, "period_count");
                int e19 = C20376a.m95137e(f, "generation");
                int e20 = C20376a.m95137e(f, "required_network_type");
                int e21 = C20376a.m95137e(f, "requires_charging");
                int e22 = C20376a.m95137e(f, "requires_device_idle");
                int e23 = C20376a.m95137e(f, "requires_battery_not_low");
                int e24 = C20376a.m95137e(f, "requires_storage_not_low");
                int e25 = C20376a.m95137e(f, "trigger_content_update_delay");
                int e26 = C20376a.m95137e(f, "trigger_max_content_delay");
                int e27 = C20376a.m95137e(f, "content_uri_triggers");
                int i6 = e14;
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    if (f.isNull(e)) {
                        str = null;
                    } else {
                        str = f.getString(e);
                    }
                    int i7 = f.getInt(e2);
                    C21212b0 b0Var = C21212b0.f54739a;
                    WorkInfo.State f2 = C21212b0.m98013f(i7);
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
                        bArr = null;
                    } else {
                        bArr = f.getBlob(e5);
                    }
                    C21091d m = C21091d.m97587m(bArr);
                    if (f.isNull(e6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = f.getBlob(e6);
                    }
                    C21091d m2 = C21091d.m97587m(bArr2);
                    long j = f.getLong(e7);
                    long j2 = f.getLong(e8);
                    long j3 = f.getLong(e9);
                    int i8 = f.getInt(e10);
                    BackoffPolicy c = C21212b0.m98010c(f.getInt(e11));
                    long j4 = f.getLong(e12);
                    long j5 = f.getLong(e13);
                    int i9 = i6;
                    long j6 = f.getLong(i9);
                    int i10 = e;
                    int i11 = e15;
                    long j7 = f.getLong(i11);
                    e15 = i11;
                    int i12 = e16;
                    if (f.getInt(i12) != 0) {
                        e16 = i12;
                        i = e17;
                        z = true;
                    } else {
                        e16 = i12;
                        i = e17;
                        z = false;
                    }
                    OutOfQuotaPolicy e28 = C21212b0.m98012e(f.getInt(i));
                    e17 = i;
                    int i13 = e18;
                    int i14 = f.getInt(i13);
                    e18 = i13;
                    int i15 = e19;
                    int i16 = f.getInt(i15);
                    e19 = i15;
                    int i17 = e20;
                    NetworkType d2 = C21212b0.m98011d(f.getInt(i17));
                    e20 = i17;
                    int i18 = e21;
                    if (f.getInt(i18) != 0) {
                        e21 = i18;
                        i2 = e22;
                        z2 = true;
                    } else {
                        e21 = i18;
                        i2 = e22;
                        z2 = false;
                    }
                    if (f.getInt(i2) != 0) {
                        e22 = i2;
                        i3 = e23;
                        z3 = true;
                    } else {
                        e22 = i2;
                        i3 = e23;
                        z3 = false;
                    }
                    if (f.getInt(i3) != 0) {
                        e23 = i3;
                        i4 = e24;
                        z4 = true;
                    } else {
                        e23 = i3;
                        i4 = e24;
                        z4 = false;
                    }
                    if (f.getInt(i4) != 0) {
                        e24 = i4;
                        i5 = e25;
                        z5 = true;
                    } else {
                        e24 = i4;
                        i5 = e25;
                        z5 = false;
                    }
                    long j8 = f.getLong(i5);
                    e25 = i5;
                    int i19 = e26;
                    long j9 = f.getLong(i19);
                    e26 = i19;
                    int i20 = e27;
                    if (f.isNull(i20)) {
                        bArr3 = null;
                    } else {
                        bArr3 = f.getBlob(i20);
                    }
                    e27 = i20;
                    arrayList.add(new C21249u(str, f2, str2, str3, m, m2, j, j2, j3, new C21087c(d2, z2, z3, z4, z5, j8, j9, C21212b0.m98009b(bArr3)), i8, c, j4, j5, j6, j7, z, e28, i14, i16));
                    e = i10;
                    i6 = i9;
                }
                f.close();
                v1Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                f.close();
                v1Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v1Var = d;
            f.close();
            v1Var.release();
            throw th;
        }
    }

    /* renamed from: B */
    public LiveData<List<C21249u.C21252c>> mo63519B(String str) {
        C20400v1 d = C20400v1.m95183d("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        return this.f54833a.mo60912p().mo61015e(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new C21261g(d));
    }

    /* renamed from: C */
    public List<String> mo63520C() {
        String str;
        C20400v1 d = C20400v1.m95183d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str = null;
                } else {
                    str = f.getString(0);
                }
                arrayList.add(str);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: D */
    public boolean mo63521D() {
        boolean z = false;
        C20400v1 d = C20400v1.m95183d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            if (f.moveToFirst() && f.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: E */
    public int mo63522E(String str) {
        this.f54833a.mo60904d();
        C20492k b = this.f54842j.mo60958b();
        if (str == null) {
            b.mo60800u3(1);
        } else {
            b.mo60801v2(1, str);
        }
        this.f54833a.mo60905e();
        try {
            int y0 = b.mo60802y0();
            this.f54833a.mo60901O();
            return y0;
        } finally {
            this.f54833a.mo60908k();
            this.f54842j.mo60963h(b);
        }
    }

    /* renamed from: F */
    public List<C21249u.C21252c> mo63523F(String str) {
        Cursor f;
        String str2;
        byte[] bArr;
        String str3 = str;
        C20400v1 d = C20400v1.m95183d("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str3 == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str3);
        }
        this.f54833a.mo60904d();
        this.f54833a.mo60905e();
        try {
            f = C20378b.m95145f(this.f54833a, d, true, (CancellationSignal) null);
            C1866a aVar = new C1866a();
            C1866a aVar2 = new C1866a();
            while (f.moveToNext()) {
                String string = f.getString(0);
                if (((ArrayList) aVar.get(string)) == null) {
                    aVar.put(string, new ArrayList());
                }
                String string2 = f.getString(0);
                if (((ArrayList) aVar2.get(string2)) == null) {
                    aVar2.put(string2, new ArrayList());
                }
            }
            f.moveToPosition(-1);
            mo63555L(aVar);
            mo63554K(aVar2);
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = f.getString(0);
                }
                int i = f.getInt(1);
                C21212b0 b0Var = C21212b0.f54739a;
                WorkInfo.State f2 = C21212b0.m98013f(i);
                if (f.isNull(2)) {
                    bArr = null;
                } else {
                    bArr = f.getBlob(2);
                }
                C21091d m = C21091d.m97587m(bArr);
                int i2 = f.getInt(3);
                int i3 = f.getInt(4);
                ArrayList arrayList2 = (ArrayList) aVar.get(f.getString(0));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = (ArrayList) aVar2.get(f.getString(0));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList.add(new C21249u.C21252c(str2, f2, m, i2, i3, arrayList3, arrayList4));
            }
            this.f54833a.mo60901O();
            f.close();
            d.release();
            this.f54833a.mo60908k();
            return arrayList;
        } catch (Throwable th) {
            this.f54833a.mo60908k();
            throw th;
        }
    }

    /* renamed from: G */
    public LiveData<List<C21249u.C21252c>> mo63524G(List<String> list) {
        StringBuilder d = C20382e.m95158d();
        d.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = list.size();
        C20382e.m95155a(d, size);
        d.append(")");
        C20400v1 d2 = C20400v1.m95183d(d.toString(), size + 0);
        int i = 1;
        for (String next : list) {
            if (next == null) {
                d2.mo60800u3(i);
            } else {
                d2.mo60801v2(i, next);
            }
            i++;
        }
        return this.f54833a.mo60912p().mo61015e(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new C21260f(d2));
    }

    /* renamed from: H */
    public int mo63525H(String str) {
        this.f54833a.mo60904d();
        C20492k b = this.f54841i.mo60958b();
        if (str == null) {
            b.mo60800u3(1);
        } else {
            b.mo60801v2(1, str);
        }
        this.f54833a.mo60905e();
        try {
            int y0 = b.mo60802y0();
            this.f54833a.mo60901O();
            return y0;
        } finally {
            this.f54833a.mo60908k();
            this.f54841i.mo60963h(b);
        }
    }

    /* renamed from: I */
    public List<C21249u.C21252c> mo63526I(List<String> list) {
        Cursor f;
        String str;
        byte[] bArr;
        StringBuilder d = C20382e.m95158d();
        d.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = list.size();
        C20382e.m95155a(d, size);
        d.append(")");
        C20400v1 d2 = C20400v1.m95183d(d.toString(), size + 0);
        int i = 1;
        for (String next : list) {
            if (next == null) {
                d2.mo60800u3(i);
            } else {
                d2.mo60801v2(i, next);
            }
            i++;
        }
        this.f54833a.mo60904d();
        this.f54833a.mo60905e();
        try {
            f = C20378b.m95145f(this.f54833a, d2, true, (CancellationSignal) null);
            C1866a aVar = new C1866a();
            C1866a aVar2 = new C1866a();
            while (f.moveToNext()) {
                String string = f.getString(0);
                if (((ArrayList) aVar.get(string)) == null) {
                    aVar.put(string, new ArrayList());
                }
                String string2 = f.getString(0);
                if (((ArrayList) aVar2.get(string2)) == null) {
                    aVar2.put(string2, new ArrayList());
                }
            }
            f.moveToPosition(-1);
            mo63555L(aVar);
            mo63554K(aVar2);
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str = null;
                } else {
                    str = f.getString(0);
                }
                int i2 = f.getInt(1);
                C21212b0 b0Var = C21212b0.f54739a;
                WorkInfo.State f2 = C21212b0.m98013f(i2);
                if (f.isNull(2)) {
                    bArr = null;
                } else {
                    bArr = f.getBlob(2);
                }
                C21091d m = C21091d.m97587m(bArr);
                int i3 = f.getInt(3);
                int i4 = f.getInt(4);
                ArrayList arrayList2 = (ArrayList) aVar.get(f.getString(0));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = (ArrayList) aVar2.get(f.getString(0));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList.add(new C21249u.C21252c(str, f2, m, i3, i4, arrayList3, arrayList4));
            }
            this.f54833a.mo60901O();
            f.close();
            d2.release();
            this.f54833a.mo60908k();
            return arrayList;
        } catch (Throwable th) {
            this.f54833a.mo60908k();
            throw th;
        }
    }

    /* renamed from: J */
    public List<String> mo63527J() {
        String str;
        C20400v1 d = C20400v1.m95183d("SELECT id FROM workspec", 0);
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str = null;
                } else {
                    str = f.getString(0);
                }
                arrayList.add(str);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: K */
    public final void mo63554K(C1866a<String, ArrayList<C21091d>> aVar) {
        byte[] bArr;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                C1866a aVar2 = new C1866a(999);
                int size = aVar.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    aVar2.put(aVar.mo6334j(i), aVar.mo6338o(i));
                    i++;
                    i2++;
                    if (i2 == 999) {
                        mo63554K(aVar2);
                        aVar2 = new C1866a(999);
                        i2 = 0;
                    }
                }
                if (i2 > 0) {
                    mo63554K(aVar2);
                    return;
                }
                return;
            }
            StringBuilder d = C20382e.m95158d();
            d.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C20382e.m95155a(d, size2);
            d.append(")");
            C20400v1 d2 = C20400v1.m95183d(d.toString(), size2 + 0);
            int i3 = 1;
            for (String next : keySet) {
                if (next == null) {
                    d2.mo60800u3(i3);
                } else {
                    d2.mo60801v2(i3, next);
                }
                i3++;
            }
            Cursor f = C20378b.m95145f(this.f54833a, d2, false, (CancellationSignal) null);
            try {
                int d3 = C20376a.m95136d(f, "work_spec_id");
                if (d3 != -1) {
                    while (f.moveToNext()) {
                        ArrayList arrayList = aVar.get(f.getString(d3));
                        if (arrayList != null) {
                            if (f.isNull(0)) {
                                bArr = null;
                            } else {
                                bArr = f.getBlob(0);
                            }
                            arrayList.add(C21091d.m97587m(bArr));
                        }
                    }
                    f.close();
                }
            } finally {
                f.close();
            }
        }
    }

    /* renamed from: L */
    public final void mo63555L(C1866a<String, ArrayList<String>> aVar) {
        String str;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                C1866a aVar2 = new C1866a(999);
                int size = aVar.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    aVar2.put(aVar.mo6334j(i), aVar.mo6338o(i));
                    i++;
                    i2++;
                    if (i2 == 999) {
                        mo63555L(aVar2);
                        aVar2 = new C1866a(999);
                        i2 = 0;
                    }
                }
                if (i2 > 0) {
                    mo63555L(aVar2);
                    return;
                }
                return;
            }
            StringBuilder d = C20382e.m95158d();
            d.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C20382e.m95155a(d, size2);
            d.append(")");
            C20400v1 d2 = C20400v1.m95183d(d.toString(), size2 + 0);
            int i3 = 1;
            for (String next : keySet) {
                if (next == null) {
                    d2.mo60800u3(i3);
                } else {
                    d2.mo60801v2(i3, next);
                }
                i3++;
            }
            Cursor f = C20378b.m95145f(this.f54833a, d2, false, (CancellationSignal) null);
            try {
                int d3 = C20376a.m95136d(f, "work_spec_id");
                if (d3 != -1) {
                    while (f.moveToNext()) {
                        ArrayList arrayList = aVar.get(f.getString(d3));
                        if (arrayList != null) {
                            if (f.isNull(0)) {
                                str = null;
                            } else {
                                str = f.getString(0);
                            }
                            arrayList.add(str);
                        }
                    }
                    f.close();
                }
            } finally {
                f.close();
            }
        }
    }

    /* renamed from: a */
    public void mo63528a(C21249u uVar) {
        this.f54833a.mo60904d();
        this.f54833a.mo60905e();
        try {
            this.f54835c.mo61150j(uVar);
            this.f54833a.mo60901O();
        } finally {
            this.f54833a.mo60908k();
        }
    }

    /* renamed from: b */
    public void mo63529b(String str) {
        this.f54833a.mo60904d();
        C20492k b = this.f54836d.mo60958b();
        if (str == null) {
            b.mo60800u3(1);
        } else {
            b.mo60801v2(1, str);
        }
        this.f54833a.mo60905e();
        try {
            b.mo60802y0();
            this.f54833a.mo60901O();
        } finally {
            this.f54833a.mo60908k();
            this.f54836d.mo60963h(b);
        }
    }

    /* renamed from: c */
    public void mo63530c() {
        this.f54833a.mo60904d();
        C20492k b = this.f54845m.mo60958b();
        this.f54833a.mo60905e();
        try {
            b.mo60802y0();
            this.f54833a.mo60901O();
        } finally {
            this.f54833a.mo60908k();
            this.f54845m.mo60963h(b);
        }
    }

    /* renamed from: d */
    public void mo63531d(String str) {
        this.f54833a.mo60904d();
        C20492k b = this.f54838f.mo60958b();
        if (str == null) {
            b.mo60800u3(1);
        } else {
            b.mo60801v2(1, str);
        }
        this.f54833a.mo60905e();
        try {
            b.mo60802y0();
            this.f54833a.mo60901O();
        } finally {
            this.f54833a.mo60908k();
            this.f54838f.mo60963h(b);
        }
    }

    /* renamed from: e */
    public void mo63532e(String str) {
        this.f54833a.mo60904d();
        C20492k b = this.f54846n.mo60958b();
        if (str == null) {
            b.mo60800u3(1);
        } else {
            b.mo60801v2(1, str);
        }
        this.f54833a.mo60905e();
        try {
            b.mo60802y0();
            this.f54833a.mo60901O();
        } finally {
            this.f54833a.mo60908k();
            this.f54846n.mo60963h(b);
        }
    }

    /* renamed from: f */
    public List<C21249u> mo63533f(long j) {
        C20400v1 v1Var;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        byte[] bArr3;
        C20400v1 d = C20400v1.m95183d("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        d.mo60790S2(1, j);
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            int e = C20376a.m95137e(f, "id");
            int e2 = C20376a.m95137e(f, "state");
            int e3 = C20376a.m95137e(f, "worker_class_name");
            int e4 = C20376a.m95137e(f, "input_merger_class_name");
            int e5 = C20376a.m95137e(f, "input");
            int e6 = C20376a.m95137e(f, "output");
            int e7 = C20376a.m95137e(f, "initial_delay");
            int e8 = C20376a.m95137e(f, "interval_duration");
            int e9 = C20376a.m95137e(f, "flex_duration");
            int e10 = C20376a.m95137e(f, "run_attempt_count");
            int e11 = C20376a.m95137e(f, "backoff_policy");
            int e12 = C20376a.m95137e(f, "backoff_delay_duration");
            int e13 = C20376a.m95137e(f, "last_enqueue_time");
            int e14 = C20376a.m95137e(f, "minimum_retention_duration");
            v1Var = d;
            try {
                int e15 = C20376a.m95137e(f, "schedule_requested_at");
                int e16 = C20376a.m95137e(f, "run_in_foreground");
                int e17 = C20376a.m95137e(f, "out_of_quota_policy");
                int e18 = C20376a.m95137e(f, "period_count");
                int e19 = C20376a.m95137e(f, "generation");
                int e20 = C20376a.m95137e(f, "required_network_type");
                int e21 = C20376a.m95137e(f, "requires_charging");
                int e22 = C20376a.m95137e(f, "requires_device_idle");
                int e23 = C20376a.m95137e(f, "requires_battery_not_low");
                int e24 = C20376a.m95137e(f, "requires_storage_not_low");
                int e25 = C20376a.m95137e(f, "trigger_content_update_delay");
                int e26 = C20376a.m95137e(f, "trigger_max_content_delay");
                int e27 = C20376a.m95137e(f, "content_uri_triggers");
                int i6 = e14;
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    if (f.isNull(e)) {
                        str = null;
                    } else {
                        str = f.getString(e);
                    }
                    int i7 = f.getInt(e2);
                    C21212b0 b0Var = C21212b0.f54739a;
                    WorkInfo.State f2 = C21212b0.m98013f(i7);
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
                        bArr = null;
                    } else {
                        bArr = f.getBlob(e5);
                    }
                    C21091d m = C21091d.m97587m(bArr);
                    if (f.isNull(e6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = f.getBlob(e6);
                    }
                    C21091d m2 = C21091d.m97587m(bArr2);
                    long j2 = f.getLong(e7);
                    long j3 = f.getLong(e8);
                    long j4 = f.getLong(e9);
                    int i8 = f.getInt(e10);
                    BackoffPolicy c = C21212b0.m98010c(f.getInt(e11));
                    long j5 = f.getLong(e12);
                    long j6 = f.getLong(e13);
                    int i9 = i6;
                    long j7 = f.getLong(i9);
                    int i10 = e;
                    int i11 = e15;
                    long j8 = f.getLong(i11);
                    e15 = i11;
                    int i12 = e16;
                    if (f.getInt(i12) != 0) {
                        e16 = i12;
                        i = e17;
                        z = true;
                    } else {
                        e16 = i12;
                        i = e17;
                        z = false;
                    }
                    OutOfQuotaPolicy e28 = C21212b0.m98012e(f.getInt(i));
                    e17 = i;
                    int i13 = e18;
                    int i14 = f.getInt(i13);
                    e18 = i13;
                    int i15 = e19;
                    int i16 = f.getInt(i15);
                    e19 = i15;
                    int i17 = e20;
                    NetworkType d2 = C21212b0.m98011d(f.getInt(i17));
                    e20 = i17;
                    int i18 = e21;
                    if (f.getInt(i18) != 0) {
                        e21 = i18;
                        i2 = e22;
                        z2 = true;
                    } else {
                        e21 = i18;
                        i2 = e22;
                        z2 = false;
                    }
                    if (f.getInt(i2) != 0) {
                        e22 = i2;
                        i3 = e23;
                        z3 = true;
                    } else {
                        e22 = i2;
                        i3 = e23;
                        z3 = false;
                    }
                    if (f.getInt(i3) != 0) {
                        e23 = i3;
                        i4 = e24;
                        z4 = true;
                    } else {
                        e23 = i3;
                        i4 = e24;
                        z4 = false;
                    }
                    if (f.getInt(i4) != 0) {
                        e24 = i4;
                        i5 = e25;
                        z5 = true;
                    } else {
                        e24 = i4;
                        i5 = e25;
                        z5 = false;
                    }
                    long j9 = f.getLong(i5);
                    e25 = i5;
                    int i19 = e26;
                    long j10 = f.getLong(i19);
                    e26 = i19;
                    int i20 = e27;
                    if (f.isNull(i20)) {
                        bArr3 = null;
                    } else {
                        bArr3 = f.getBlob(i20);
                    }
                    e27 = i20;
                    arrayList.add(new C21249u(str, f2, str2, str3, m, m2, j2, j3, j4, new C21087c(d2, z2, z3, z4, z5, j9, j10, C21212b0.m98009b(bArr3)), i8, c, j5, j6, j7, j8, z, e28, i14, i16));
                    e = i10;
                    i6 = i9;
                }
                f.close();
                v1Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                f.close();
                v1Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v1Var = d;
            f.close();
            v1Var.release();
            throw th;
        }
    }

    /* renamed from: g */
    public void mo63534g(C21249u uVar) {
        this.f54833a.mo60904d();
        this.f54833a.mo60905e();
        try {
            this.f54834b.mo61158k(uVar);
            this.f54833a.mo60901O();
        } finally {
            this.f54833a.mo60908k();
        }
    }

    /* renamed from: h */
    public List<C21249u> mo63535h() {
        C20400v1 v1Var;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        byte[] bArr3;
        C20400v1 d = C20400v1.m95183d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            int e = C20376a.m95137e(f, "id");
            int e2 = C20376a.m95137e(f, "state");
            int e3 = C20376a.m95137e(f, "worker_class_name");
            int e4 = C20376a.m95137e(f, "input_merger_class_name");
            int e5 = C20376a.m95137e(f, "input");
            int e6 = C20376a.m95137e(f, "output");
            int e7 = C20376a.m95137e(f, "initial_delay");
            int e8 = C20376a.m95137e(f, "interval_duration");
            int e9 = C20376a.m95137e(f, "flex_duration");
            int e10 = C20376a.m95137e(f, "run_attempt_count");
            int e11 = C20376a.m95137e(f, "backoff_policy");
            int e12 = C20376a.m95137e(f, "backoff_delay_duration");
            int e13 = C20376a.m95137e(f, "last_enqueue_time");
            int e14 = C20376a.m95137e(f, "minimum_retention_duration");
            v1Var = d;
            try {
                int e15 = C20376a.m95137e(f, "schedule_requested_at");
                int e16 = C20376a.m95137e(f, "run_in_foreground");
                int e17 = C20376a.m95137e(f, "out_of_quota_policy");
                int e18 = C20376a.m95137e(f, "period_count");
                int e19 = C20376a.m95137e(f, "generation");
                int e20 = C20376a.m95137e(f, "required_network_type");
                int e21 = C20376a.m95137e(f, "requires_charging");
                int e22 = C20376a.m95137e(f, "requires_device_idle");
                int e23 = C20376a.m95137e(f, "requires_battery_not_low");
                int e24 = C20376a.m95137e(f, "requires_storage_not_low");
                int e25 = C20376a.m95137e(f, "trigger_content_update_delay");
                int e26 = C20376a.m95137e(f, "trigger_max_content_delay");
                int e27 = C20376a.m95137e(f, "content_uri_triggers");
                int i6 = e14;
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    if (f.isNull(e)) {
                        str = null;
                    } else {
                        str = f.getString(e);
                    }
                    int i7 = f.getInt(e2);
                    C21212b0 b0Var = C21212b0.f54739a;
                    WorkInfo.State f2 = C21212b0.m98013f(i7);
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
                        bArr = null;
                    } else {
                        bArr = f.getBlob(e5);
                    }
                    C21091d m = C21091d.m97587m(bArr);
                    if (f.isNull(e6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = f.getBlob(e6);
                    }
                    C21091d m2 = C21091d.m97587m(bArr2);
                    long j = f.getLong(e7);
                    long j2 = f.getLong(e8);
                    long j3 = f.getLong(e9);
                    int i8 = f.getInt(e10);
                    BackoffPolicy c = C21212b0.m98010c(f.getInt(e11));
                    long j4 = f.getLong(e12);
                    long j5 = f.getLong(e13);
                    int i9 = i6;
                    long j6 = f.getLong(i9);
                    int i10 = e;
                    int i11 = e15;
                    long j7 = f.getLong(i11);
                    e15 = i11;
                    int i12 = e16;
                    if (f.getInt(i12) != 0) {
                        e16 = i12;
                        i = e17;
                        z = true;
                    } else {
                        e16 = i12;
                        i = e17;
                        z = false;
                    }
                    OutOfQuotaPolicy e28 = C21212b0.m98012e(f.getInt(i));
                    e17 = i;
                    int i13 = e18;
                    int i14 = f.getInt(i13);
                    e18 = i13;
                    int i15 = e19;
                    int i16 = f.getInt(i15);
                    e19 = i15;
                    int i17 = e20;
                    NetworkType d2 = C21212b0.m98011d(f.getInt(i17));
                    e20 = i17;
                    int i18 = e21;
                    if (f.getInt(i18) != 0) {
                        e21 = i18;
                        i2 = e22;
                        z2 = true;
                    } else {
                        e21 = i18;
                        i2 = e22;
                        z2 = false;
                    }
                    if (f.getInt(i2) != 0) {
                        e22 = i2;
                        i3 = e23;
                        z3 = true;
                    } else {
                        e22 = i2;
                        i3 = e23;
                        z3 = false;
                    }
                    if (f.getInt(i3) != 0) {
                        e23 = i3;
                        i4 = e24;
                        z4 = true;
                    } else {
                        e23 = i3;
                        i4 = e24;
                        z4 = false;
                    }
                    if (f.getInt(i4) != 0) {
                        e24 = i4;
                        i5 = e25;
                        z5 = true;
                    } else {
                        e24 = i4;
                        i5 = e25;
                        z5 = false;
                    }
                    long j8 = f.getLong(i5);
                    e25 = i5;
                    int i19 = e26;
                    long j9 = f.getLong(i19);
                    e26 = i19;
                    int i20 = e27;
                    if (f.isNull(i20)) {
                        bArr3 = null;
                    } else {
                        bArr3 = f.getBlob(i20);
                    }
                    e27 = i20;
                    arrayList.add(new C21249u(str, f2, str2, str3, m, m2, j, j2, j3, new C21087c(d2, z2, z3, z4, z5, j8, j9, C21212b0.m98009b(bArr3)), i8, c, j4, j5, j6, j7, z, e28, i14, i16));
                    e = i10;
                    i6 = i9;
                }
                f.close();
                v1Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                f.close();
                v1Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v1Var = d;
            f.close();
            v1Var.release();
            throw th;
        }
    }

    /* renamed from: i */
    public List<String> mo63536i(String str) {
        String str2;
        C20400v1 d = C20400v1.m95183d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = f.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: androidx.work.impl.model.u$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r9v4, types: [androidx.work.impl.model.u$c] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.work.impl.model.C21249u.C21252c mo63537j(java.lang.String r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id=?"
            r3 = 1
            androidx.room.v1 r2 = androidx.room.C20400v1.m95183d(r2, r3)
            if (r0 != 0) goto L_0x0011
            r2.mo60800u3(r3)
            goto L_0x0014
        L_0x0011:
            r2.mo60801v2(r3, r0)
        L_0x0014:
            androidx.room.RoomDatabase r0 = r1.f54833a
            r0.mo60904d()
            androidx.room.RoomDatabase r0 = r1.f54833a
            r0.mo60905e()
            androidx.room.RoomDatabase r0 = r1.f54833a     // Catch:{ all -> 0x00e4 }
            r4 = 0
            android.database.Cursor r5 = androidx.room.util.C20378b.m95145f(r0, r2, r3, r4)     // Catch:{ all -> 0x00e4 }
            androidx.collection.a r0 = new androidx.collection.a     // Catch:{ all -> 0x00dc }
            r0.<init>()     // Catch:{ all -> 0x00dc }
            androidx.collection.a r6 = new androidx.collection.a     // Catch:{ all -> 0x00dc }
            r6.<init>()     // Catch:{ all -> 0x00dc }
        L_0x002f:
            boolean r7 = r5.moveToNext()     // Catch:{ all -> 0x00dc }
            r8 = 0
            if (r7 == 0) goto L_0x005f
            java.lang.String r7 = r5.getString(r8)     // Catch:{ all -> 0x00dc }
            java.lang.Object r9 = r0.get(r7)     // Catch:{ all -> 0x00dc }
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x00dc }
            if (r9 != 0) goto L_0x004a
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00dc }
            r9.<init>()     // Catch:{ all -> 0x00dc }
            r0.put(r7, r9)     // Catch:{ all -> 0x00dc }
        L_0x004a:
            java.lang.String r7 = r5.getString(r8)     // Catch:{ all -> 0x00dc }
            java.lang.Object r8 = r6.get(r7)     // Catch:{ all -> 0x00dc }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00dc }
            if (r8 != 0) goto L_0x002f
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00dc }
            r8.<init>()     // Catch:{ all -> 0x00dc }
            r6.put(r7, r8)     // Catch:{ all -> 0x00dc }
            goto L_0x002f
        L_0x005f:
            r7 = -1
            r5.moveToPosition(r7)     // Catch:{ all -> 0x00dc }
            r1.mo63555L(r0)     // Catch:{ all -> 0x00dc }
            r1.mo63554K(r6)     // Catch:{ all -> 0x00dc }
            boolean r7 = r5.moveToFirst()     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x00cb
            boolean r7 = r5.isNull(r8)     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x0077
            r10 = r4
            goto L_0x007c
        L_0x0077:
            java.lang.String r7 = r5.getString(r8)     // Catch:{ all -> 0x00dc }
            r10 = r7
        L_0x007c:
            int r3 = r5.getInt(r3)     // Catch:{ all -> 0x00dc }
            androidx.work.impl.model.b0 r7 = androidx.work.impl.model.C21212b0.f54739a     // Catch:{ all -> 0x00dc }
            androidx.work.WorkInfo$State r11 = androidx.work.impl.model.C21212b0.m98013f(r3)     // Catch:{ all -> 0x00dc }
            r3 = 2
            boolean r7 = r5.isNull(r3)     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            byte[] r4 = r5.getBlob(r3)     // Catch:{ all -> 0x00dc }
        L_0x0092:
            androidx.work.d r12 = androidx.work.C21091d.m97587m(r4)     // Catch:{ all -> 0x00dc }
            r3 = 3
            int r13 = r5.getInt(r3)     // Catch:{ all -> 0x00dc }
            r3 = 4
            int r14 = r5.getInt(r3)     // Catch:{ all -> 0x00dc }
            java.lang.String r3 = r5.getString(r8)     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00dc }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x00b1
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00dc }
            r0.<init>()     // Catch:{ all -> 0x00dc }
        L_0x00b1:
            r15 = r0
            java.lang.String r0 = r5.getString(r8)     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x00dc }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x00c3
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00dc }
            r0.<init>()     // Catch:{ all -> 0x00dc }
        L_0x00c3:
            r16 = r0
            androidx.work.impl.model.u$c r4 = new androidx.work.impl.model.u$c     // Catch:{ all -> 0x00dc }
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00dc }
        L_0x00cb:
            androidx.room.RoomDatabase r0 = r1.f54833a     // Catch:{ all -> 0x00dc }
            r0.mo60901O()     // Catch:{ all -> 0x00dc }
            r5.close()     // Catch:{ all -> 0x00e4 }
            r2.release()     // Catch:{ all -> 0x00e4 }
            androidx.room.RoomDatabase r0 = r1.f54833a
            r0.mo60908k()
            return r4
        L_0x00dc:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00e4 }
            r2.release()     // Catch:{ all -> 0x00e4 }
            throw r0     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            androidx.room.RoomDatabase r2 = r1.f54833a
            r2.mo60908k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.C21254w.mo63537j(java.lang.String):androidx.work.impl.model.u$c");
    }

    /* renamed from: k */
    public WorkInfo.State mo63538k(String str) {
        Integer num;
        C20400v1 d = C20400v1.m95183d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54833a.mo60904d();
        WorkInfo.State state = null;
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            if (f.moveToFirst()) {
                if (f.isNull(0)) {
                    num = null;
                } else {
                    num = Integer.valueOf(f.getInt(0));
                }
                if (num != null) {
                    C21212b0 b0Var = C21212b0.f54739a;
                    state = C21212b0.m98013f(num.intValue());
                }
            }
            return state;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: l */
    public C21249u mo63539l(String str) {
        C20400v1 v1Var;
        C21249u uVar;
        String str2;
        String str3;
        String str4;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        byte[] bArr3;
        String str5 = str;
        C20400v1 d = C20400v1.m95183d("SELECT * FROM workspec WHERE id=?", 1);
        if (str5 == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str5);
        }
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            int e = C20376a.m95137e(f, "id");
            int e2 = C20376a.m95137e(f, "state");
            int e3 = C20376a.m95137e(f, "worker_class_name");
            int e4 = C20376a.m95137e(f, "input_merger_class_name");
            int e5 = C20376a.m95137e(f, "input");
            int e6 = C20376a.m95137e(f, "output");
            int e7 = C20376a.m95137e(f, "initial_delay");
            int e8 = C20376a.m95137e(f, "interval_duration");
            int e9 = C20376a.m95137e(f, "flex_duration");
            int e10 = C20376a.m95137e(f, "run_attempt_count");
            int e11 = C20376a.m95137e(f, "backoff_policy");
            int e12 = C20376a.m95137e(f, "backoff_delay_duration");
            int e13 = C20376a.m95137e(f, "last_enqueue_time");
            int e14 = C20376a.m95137e(f, "minimum_retention_duration");
            v1Var = d;
            try {
                int e15 = C20376a.m95137e(f, "schedule_requested_at");
                int e16 = C20376a.m95137e(f, "run_in_foreground");
                int e17 = C20376a.m95137e(f, "out_of_quota_policy");
                int e18 = C20376a.m95137e(f, "period_count");
                int e19 = C20376a.m95137e(f, "generation");
                int e20 = C20376a.m95137e(f, "required_network_type");
                int e21 = C20376a.m95137e(f, "requires_charging");
                int e22 = C20376a.m95137e(f, "requires_device_idle");
                int e23 = C20376a.m95137e(f, "requires_battery_not_low");
                int e24 = C20376a.m95137e(f, "requires_storage_not_low");
                int e25 = C20376a.m95137e(f, "trigger_content_update_delay");
                int e26 = C20376a.m95137e(f, "trigger_max_content_delay");
                int e27 = C20376a.m95137e(f, "content_uri_triggers");
                if (f.moveToFirst()) {
                    if (f.isNull(e)) {
                        str2 = null;
                    } else {
                        str2 = f.getString(e);
                    }
                    int i6 = f.getInt(e2);
                    C21212b0 b0Var = C21212b0.f54739a;
                    WorkInfo.State f2 = C21212b0.m98013f(i6);
                    if (f.isNull(e3)) {
                        str3 = null;
                    } else {
                        str3 = f.getString(e3);
                    }
                    if (f.isNull(e4)) {
                        str4 = null;
                    } else {
                        str4 = f.getString(e4);
                    }
                    if (f.isNull(e5)) {
                        bArr = null;
                    } else {
                        bArr = f.getBlob(e5);
                    }
                    C21091d m = C21091d.m97587m(bArr);
                    if (f.isNull(e6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = f.getBlob(e6);
                    }
                    C21091d m2 = C21091d.m97587m(bArr2);
                    long j = f.getLong(e7);
                    long j2 = f.getLong(e8);
                    long j3 = f.getLong(e9);
                    int i7 = f.getInt(e10);
                    BackoffPolicy c = C21212b0.m98010c(f.getInt(e11));
                    long j4 = f.getLong(e12);
                    long j5 = f.getLong(e13);
                    long j6 = f.getLong(e14);
                    long j7 = f.getLong(e15);
                    if (f.getInt(e16) != 0) {
                        i = e17;
                        z = true;
                    } else {
                        i = e17;
                        z = false;
                    }
                    OutOfQuotaPolicy e28 = C21212b0.m98012e(f.getInt(i));
                    int i8 = f.getInt(e18);
                    int i9 = f.getInt(e19);
                    NetworkType d2 = C21212b0.m98011d(f.getInt(e20));
                    if (f.getInt(e21) != 0) {
                        i2 = e22;
                        z2 = true;
                    } else {
                        i2 = e22;
                        z2 = false;
                    }
                    if (f.getInt(i2) != 0) {
                        i3 = e23;
                        z3 = true;
                    } else {
                        i3 = e23;
                        z3 = false;
                    }
                    if (f.getInt(i3) != 0) {
                        i4 = e24;
                        z4 = true;
                    } else {
                        i4 = e24;
                        z4 = false;
                    }
                    if (f.getInt(i4) != 0) {
                        i5 = e25;
                        z5 = true;
                    } else {
                        i5 = e25;
                        z5 = false;
                    }
                    long j8 = f.getLong(i5);
                    long j9 = f.getLong(e26);
                    if (f.isNull(e27)) {
                        bArr3 = null;
                    } else {
                        bArr3 = f.getBlob(e27);
                    }
                    uVar = new C21249u(str2, f2, str3, str4, m, m2, j, j2, j3, new C21087c(d2, z2, z3, z4, z5, j8, j9, C21212b0.m98009b(bArr3)), i7, c, j4, j5, j6, j7, z, e28, i8, i9);
                } else {
                    uVar = null;
                }
                f.close();
                v1Var.release();
                return uVar;
            } catch (Throwable th) {
                th = th;
                f.close();
                v1Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v1Var = d;
            f.close();
            v1Var.release();
            throw th;
        }
    }

    /* renamed from: m */
    public void mo63540m(String str, long j) {
        this.f54833a.mo60904d();
        C20492k b = this.f54840h.mo60958b();
        b.mo60790S2(1, j);
        if (str == null) {
            b.mo60800u3(2);
        } else {
            b.mo60801v2(2, str);
        }
        this.f54833a.mo60905e();
        try {
            b.mo60802y0();
            this.f54833a.mo60901O();
        } finally {
            this.f54833a.mo60908k();
            this.f54840h.mo60963h(b);
        }
    }

    /* renamed from: n */
    public LiveData<Long> mo63541n(String str) {
        C20400v1 d = C20400v1.m95183d("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        return this.f54833a.mo60912p().mo61015e(new String[]{"workspec"}, false, new C21263i(d));
    }

    /* renamed from: o */
    public List<String> mo63542o(String str) {
        String str2;
        C20400v1 d = C20400v1.m95183d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = f.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: p */
    public List<C21091d> mo63543p(String str) {
        byte[] bArr;
        C20400v1 d = C20400v1.m95183d("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    bArr = null;
                } else {
                    bArr = f.getBlob(0);
                }
                arrayList.add(C21091d.m97587m(bArr));
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: q */
    public List<C21249u.C21252c> mo63544q(String str) {
        Cursor f;
        String str2;
        byte[] bArr;
        String str3 = str;
        C20400v1 d = C20400v1.m95183d("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str3 == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str3);
        }
        this.f54833a.mo60904d();
        this.f54833a.mo60905e();
        try {
            f = C20378b.m95145f(this.f54833a, d, true, (CancellationSignal) null);
            C1866a aVar = new C1866a();
            C1866a aVar2 = new C1866a();
            while (f.moveToNext()) {
                String string = f.getString(0);
                if (((ArrayList) aVar.get(string)) == null) {
                    aVar.put(string, new ArrayList());
                }
                String string2 = f.getString(0);
                if (((ArrayList) aVar2.get(string2)) == null) {
                    aVar2.put(string2, new ArrayList());
                }
            }
            f.moveToPosition(-1);
            mo63555L(aVar);
            mo63554K(aVar2);
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = f.getString(0);
                }
                int i = f.getInt(1);
                C21212b0 b0Var = C21212b0.f54739a;
                WorkInfo.State f2 = C21212b0.m98013f(i);
                if (f.isNull(2)) {
                    bArr = null;
                } else {
                    bArr = f.getBlob(2);
                }
                C21091d m = C21091d.m97587m(bArr);
                int i2 = f.getInt(3);
                int i3 = f.getInt(4);
                ArrayList arrayList2 = (ArrayList) aVar.get(f.getString(0));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = (ArrayList) aVar2.get(f.getString(0));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList.add(new C21249u.C21252c(str2, f2, m, i2, i3, arrayList3, arrayList4));
            }
            this.f54833a.mo60901O();
            f.close();
            d.release();
            this.f54833a.mo60908k();
            return arrayList;
        } catch (Throwable th) {
            this.f54833a.mo60908k();
            throw th;
        }
    }

    /* renamed from: r */
    public List<C21249u> mo63545r(int i) {
        C20400v1 v1Var;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        byte[] bArr3;
        C20400v1 d = C20400v1.m95183d("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        d.mo60790S2(1, (long) i);
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            int e = C20376a.m95137e(f, "id");
            int e2 = C20376a.m95137e(f, "state");
            int e3 = C20376a.m95137e(f, "worker_class_name");
            int e4 = C20376a.m95137e(f, "input_merger_class_name");
            int e5 = C20376a.m95137e(f, "input");
            int e6 = C20376a.m95137e(f, "output");
            int e7 = C20376a.m95137e(f, "initial_delay");
            int e8 = C20376a.m95137e(f, "interval_duration");
            int e9 = C20376a.m95137e(f, "flex_duration");
            int e10 = C20376a.m95137e(f, "run_attempt_count");
            int e11 = C20376a.m95137e(f, "backoff_policy");
            int e12 = C20376a.m95137e(f, "backoff_delay_duration");
            int e13 = C20376a.m95137e(f, "last_enqueue_time");
            int e14 = C20376a.m95137e(f, "minimum_retention_duration");
            v1Var = d;
            try {
                int e15 = C20376a.m95137e(f, "schedule_requested_at");
                int e16 = C20376a.m95137e(f, "run_in_foreground");
                int e17 = C20376a.m95137e(f, "out_of_quota_policy");
                int e18 = C20376a.m95137e(f, "period_count");
                int e19 = C20376a.m95137e(f, "generation");
                int e20 = C20376a.m95137e(f, "required_network_type");
                int e21 = C20376a.m95137e(f, "requires_charging");
                int e22 = C20376a.m95137e(f, "requires_device_idle");
                int e23 = C20376a.m95137e(f, "requires_battery_not_low");
                int e24 = C20376a.m95137e(f, "requires_storage_not_low");
                int e25 = C20376a.m95137e(f, "trigger_content_update_delay");
                int e26 = C20376a.m95137e(f, "trigger_max_content_delay");
                int e27 = C20376a.m95137e(f, "content_uri_triggers");
                int i7 = e14;
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    if (f.isNull(e)) {
                        str = null;
                    } else {
                        str = f.getString(e);
                    }
                    int i8 = f.getInt(e2);
                    C21212b0 b0Var = C21212b0.f54739a;
                    WorkInfo.State f2 = C21212b0.m98013f(i8);
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
                        bArr = null;
                    } else {
                        bArr = f.getBlob(e5);
                    }
                    C21091d m = C21091d.m97587m(bArr);
                    if (f.isNull(e6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = f.getBlob(e6);
                    }
                    C21091d m2 = C21091d.m97587m(bArr2);
                    long j = f.getLong(e7);
                    long j2 = f.getLong(e8);
                    long j3 = f.getLong(e9);
                    int i9 = f.getInt(e10);
                    BackoffPolicy c = C21212b0.m98010c(f.getInt(e11));
                    long j4 = f.getLong(e12);
                    long j5 = f.getLong(e13);
                    int i10 = i7;
                    long j6 = f.getLong(i10);
                    int i11 = e;
                    int i12 = e15;
                    long j7 = f.getLong(i12);
                    e15 = i12;
                    int i13 = e16;
                    if (f.getInt(i13) != 0) {
                        e16 = i13;
                        i2 = e17;
                        z = true;
                    } else {
                        e16 = i13;
                        i2 = e17;
                        z = false;
                    }
                    OutOfQuotaPolicy e28 = C21212b0.m98012e(f.getInt(i2));
                    e17 = i2;
                    int i14 = e18;
                    int i15 = f.getInt(i14);
                    e18 = i14;
                    int i16 = e19;
                    int i17 = f.getInt(i16);
                    e19 = i16;
                    int i18 = e20;
                    NetworkType d2 = C21212b0.m98011d(f.getInt(i18));
                    e20 = i18;
                    int i19 = e21;
                    if (f.getInt(i19) != 0) {
                        e21 = i19;
                        i3 = e22;
                        z2 = true;
                    } else {
                        e21 = i19;
                        i3 = e22;
                        z2 = false;
                    }
                    if (f.getInt(i3) != 0) {
                        e22 = i3;
                        i4 = e23;
                        z3 = true;
                    } else {
                        e22 = i3;
                        i4 = e23;
                        z3 = false;
                    }
                    if (f.getInt(i4) != 0) {
                        e23 = i4;
                        i5 = e24;
                        z4 = true;
                    } else {
                        e23 = i4;
                        i5 = e24;
                        z4 = false;
                    }
                    if (f.getInt(i5) != 0) {
                        e24 = i5;
                        i6 = e25;
                        z5 = true;
                    } else {
                        e24 = i5;
                        i6 = e25;
                        z5 = false;
                    }
                    long j8 = f.getLong(i6);
                    e25 = i6;
                    int i20 = e26;
                    long j9 = f.getLong(i20);
                    e26 = i20;
                    int i21 = e27;
                    if (f.isNull(i21)) {
                        bArr3 = null;
                    } else {
                        bArr3 = f.getBlob(i21);
                    }
                    e27 = i21;
                    arrayList.add(new C21249u(str, f2, str2, str3, m, m2, j, j2, j3, new C21087c(d2, z2, z3, z4, z5, j8, j9, C21212b0.m98009b(bArr3)), i9, c, j4, j5, j6, j7, z, e28, i15, i17));
                    e = i11;
                    i7 = i10;
                }
                f.close();
                v1Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                f.close();
                v1Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v1Var = d;
            f.close();
            v1Var.release();
            throw th;
        }
    }

    /* renamed from: s */
    public int mo63546s() {
        this.f54833a.mo60904d();
        C20492k b = this.f54844l.mo60958b();
        this.f54833a.mo60905e();
        try {
            int y0 = b.mo60802y0();
            this.f54833a.mo60901O();
            return y0;
        } finally {
            this.f54833a.mo60908k();
            this.f54844l.mo60963h(b);
        }
    }

    /* renamed from: t */
    public int mo63547t(String str, long j) {
        this.f54833a.mo60904d();
        C20492k b = this.f54843k.mo60958b();
        b.mo60790S2(1, j);
        if (str == null) {
            b.mo60800u3(2);
        } else {
            b.mo60801v2(2, str);
        }
        this.f54833a.mo60905e();
        try {
            int y0 = b.mo60802y0();
            this.f54833a.mo60901O();
            return y0;
        } finally {
            this.f54833a.mo60908k();
            this.f54843k.mo60963h(b);
        }
    }

    /* renamed from: u */
    public List<C21249u.C21251b> mo63548u(String str) {
        String str2;
        C20400v1 d = C20400v1.m95183d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = f.getString(0);
                }
                int i = f.getInt(1);
                C21212b0 b0Var = C21212b0.f54739a;
                arrayList.add(new C21249u.C21251b(str2, C21212b0.m98013f(i)));
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: v */
    public List<C21249u> mo63549v(int i) {
        C20400v1 v1Var;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        byte[] bArr3;
        C20400v1 d = C20400v1.m95183d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        d.mo60790S2(1, (long) i);
        this.f54833a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54833a, d, false, (CancellationSignal) null);
        try {
            int e = C20376a.m95137e(f, "id");
            int e2 = C20376a.m95137e(f, "state");
            int e3 = C20376a.m95137e(f, "worker_class_name");
            int e4 = C20376a.m95137e(f, "input_merger_class_name");
            int e5 = C20376a.m95137e(f, "input");
            int e6 = C20376a.m95137e(f, "output");
            int e7 = C20376a.m95137e(f, "initial_delay");
            int e8 = C20376a.m95137e(f, "interval_duration");
            int e9 = C20376a.m95137e(f, "flex_duration");
            int e10 = C20376a.m95137e(f, "run_attempt_count");
            int e11 = C20376a.m95137e(f, "backoff_policy");
            int e12 = C20376a.m95137e(f, "backoff_delay_duration");
            int e13 = C20376a.m95137e(f, "last_enqueue_time");
            int e14 = C20376a.m95137e(f, "minimum_retention_duration");
            v1Var = d;
            try {
                int e15 = C20376a.m95137e(f, "schedule_requested_at");
                int e16 = C20376a.m95137e(f, "run_in_foreground");
                int e17 = C20376a.m95137e(f, "out_of_quota_policy");
                int e18 = C20376a.m95137e(f, "period_count");
                int e19 = C20376a.m95137e(f, "generation");
                int e20 = C20376a.m95137e(f, "required_network_type");
                int e21 = C20376a.m95137e(f, "requires_charging");
                int e22 = C20376a.m95137e(f, "requires_device_idle");
                int e23 = C20376a.m95137e(f, "requires_battery_not_low");
                int e24 = C20376a.m95137e(f, "requires_storage_not_low");
                int e25 = C20376a.m95137e(f, "trigger_content_update_delay");
                int e26 = C20376a.m95137e(f, "trigger_max_content_delay");
                int e27 = C20376a.m95137e(f, "content_uri_triggers");
                int i7 = e14;
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    if (f.isNull(e)) {
                        str = null;
                    } else {
                        str = f.getString(e);
                    }
                    int i8 = f.getInt(e2);
                    C21212b0 b0Var = C21212b0.f54739a;
                    WorkInfo.State f2 = C21212b0.m98013f(i8);
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
                        bArr = null;
                    } else {
                        bArr = f.getBlob(e5);
                    }
                    C21091d m = C21091d.m97587m(bArr);
                    if (f.isNull(e6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = f.getBlob(e6);
                    }
                    C21091d m2 = C21091d.m97587m(bArr2);
                    long j = f.getLong(e7);
                    long j2 = f.getLong(e8);
                    long j3 = f.getLong(e9);
                    int i9 = f.getInt(e10);
                    BackoffPolicy c = C21212b0.m98010c(f.getInt(e11));
                    long j4 = f.getLong(e12);
                    long j5 = f.getLong(e13);
                    int i10 = i7;
                    long j6 = f.getLong(i10);
                    int i11 = e;
                    int i12 = e15;
                    long j7 = f.getLong(i12);
                    e15 = i12;
                    int i13 = e16;
                    if (f.getInt(i13) != 0) {
                        e16 = i13;
                        i2 = e17;
                        z = true;
                    } else {
                        e16 = i13;
                        i2 = e17;
                        z = false;
                    }
                    OutOfQuotaPolicy e28 = C21212b0.m98012e(f.getInt(i2));
                    e17 = i2;
                    int i14 = e18;
                    int i15 = f.getInt(i14);
                    e18 = i14;
                    int i16 = e19;
                    int i17 = f.getInt(i16);
                    e19 = i16;
                    int i18 = e20;
                    NetworkType d2 = C21212b0.m98011d(f.getInt(i18));
                    e20 = i18;
                    int i19 = e21;
                    if (f.getInt(i19) != 0) {
                        e21 = i19;
                        i3 = e22;
                        z2 = true;
                    } else {
                        e21 = i19;
                        i3 = e22;
                        z2 = false;
                    }
                    if (f.getInt(i3) != 0) {
                        e22 = i3;
                        i4 = e23;
                        z3 = true;
                    } else {
                        e22 = i3;
                        i4 = e23;
                        z3 = false;
                    }
                    if (f.getInt(i4) != 0) {
                        e23 = i4;
                        i5 = e24;
                        z4 = true;
                    } else {
                        e23 = i4;
                        i5 = e24;
                        z4 = false;
                    }
                    if (f.getInt(i5) != 0) {
                        e24 = i5;
                        i6 = e25;
                        z5 = true;
                    } else {
                        e24 = i5;
                        i6 = e25;
                        z5 = false;
                    }
                    long j8 = f.getLong(i6);
                    e25 = i6;
                    int i20 = e26;
                    long j9 = f.getLong(i20);
                    e26 = i20;
                    int i21 = e27;
                    if (f.isNull(i21)) {
                        bArr3 = null;
                    } else {
                        bArr3 = f.getBlob(i21);
                    }
                    e27 = i21;
                    arrayList.add(new C21249u(str, f2, str2, str3, m, m2, j, j2, j3, new C21087c(d2, z2, z3, z4, z5, j8, j9, C21212b0.m98009b(bArr3)), i9, c, j4, j5, j6, j7, z, e28, i15, i17));
                    e = i11;
                    i7 = i10;
                }
                f.close();
                v1Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                f.close();
                v1Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v1Var = d;
            f.close();
            v1Var.release();
            throw th;
        }
    }

    /* renamed from: w */
    public int mo63550w(WorkInfo.State state, String str) {
        this.f54833a.mo60904d();
        C20492k b = this.f54837e.mo60958b();
        C21212b0 b0Var = C21212b0.f54739a;
        b.mo60790S2(1, (long) C21212b0.m98017j(state));
        if (str == null) {
            b.mo60800u3(2);
        } else {
            b.mo60801v2(2, str);
        }
        this.f54833a.mo60905e();
        try {
            int y0 = b.mo60802y0();
            this.f54833a.mo60901O();
            return y0;
        } finally {
            this.f54833a.mo60908k();
            this.f54837e.mo60963h(b);
        }
    }

    /* renamed from: x */
    public void mo63551x(String str, C21091d dVar) {
        this.f54833a.mo60904d();
        C20492k b = this.f54839g.mo60958b();
        byte[] F = C21091d.m97574F(dVar);
        if (F == null) {
            b.mo60800u3(1);
        } else {
            b.mo60791a3(1, F);
        }
        if (str == null) {
            b.mo60800u3(2);
        } else {
            b.mo60801v2(2, str);
        }
        this.f54833a.mo60905e();
        try {
            b.mo60802y0();
            this.f54833a.mo60901O();
        } finally {
            this.f54833a.mo60908k();
            this.f54839g.mo60963h(b);
        }
    }

    /* renamed from: y */
    public LiveData<List<String>> mo63552y() {
        return this.f54833a.mo60912p().mo61015e(new String[]{"workspec"}, true, new C21259e(C20400v1.m95183d("SELECT id FROM workspec", 0)));
    }

    /* renamed from: z */
    public LiveData<List<C21249u.C21252c>> mo63553z(String str) {
        C20400v1 d = C20400v1.m95183d("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        return this.f54833a.mo60912p().mo61015e(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new C21262h(d));
    }
}
