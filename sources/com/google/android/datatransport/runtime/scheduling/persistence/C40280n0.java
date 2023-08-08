package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.C40189i;
import com.google.android.datatransport.runtime.C40190j;
import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.firebase.transport.C40177a;
import com.google.android.datatransport.runtime.firebase.transport.C40179b;
import com.google.android.datatransport.runtime.firebase.transport.C40181c;
import com.google.android.datatransport.runtime.firebase.transport.C40183d;
import com.google.android.datatransport.runtime.firebase.transport.C40185e;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.C40195a;
import com.google.android.datatransport.runtime.synchronization.C40306a;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.time.C40309a;
import com.google.android.datatransport.runtime.time.C40310b;
import com.google.android.datatransport.runtime.time.C40318h;
import com.google.android.datatransport.runtime.util.C40321a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;

@C0348i1
@Singleton
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.n0 */
public class C40280n0 implements C40255d, C40306a, C40253c {

    /* renamed from: f */
    public static final String f102620f = "SQLiteEventStore";

    /* renamed from: g */
    public static final int f102621g = 16;

    /* renamed from: v */
    public static final int f102622v = 50;

    /* renamed from: w */
    public static final C40041c f102623w = C40041c.m163048b("proto");

    /* renamed from: a */
    public final C40298u0 f102624a;

    /* renamed from: b */
    public final C40309a f102625b;

    /* renamed from: c */
    public final C40309a f102626c;

    /* renamed from: d */
    public final C40257e f102627d;

    /* renamed from: e */
    public final Provider<String> f102628e;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.n0$b */
    public interface C40282b<T, U> {
        U apply(T t);
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.n0$c */
    public static class C40283c {

        /* renamed from: a */
        public final String f102629a;

        /* renamed from: b */
        public final String f102630b;

        public C40283c(String str, String str2) {
            this.f102629a = str;
            this.f102630b = str2;
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.n0$d */
    public interface C40284d<T> {
        /* renamed from: a */
        T mo132943a();
    }

    @Inject
    public C40280n0(@C40318h C40309a aVar, @C40310b C40309a aVar2, C40257e eVar, C40298u0 u0Var, @Named("PACKAGE_NAME") Provider<String> provider) {
        this.f102624a = u0Var;
        this.f102625b = aVar;
        this.f102626c = aVar2;
        this.f102627d = eVar;
        this.f102628e = provider;
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ Object m163693A0(List list, C40203r rVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            C40190j.C40191a k = C40190j.m163460a().mo132692j(cursor.getString(1)).mo132691i(cursor.getLong(2)).mo132693k(cursor.getLong(3));
            if (z) {
                k.mo132690h(new C40189i(m163725j1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.mo132690h(new C40189i(m163725j1(cursor.getString(4)), mo132961c1(j)));
            }
            if (!cursor.isNull(6)) {
                k.mo132689g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C40273k.m163688a(j, rVar, k.mo132686d()));
        }
        return null;
    }

    /* renamed from: C0 */
    public static /* synthetic */ Object m163696C0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C40283c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public /* synthetic */ Long m163698D0(C40190j jVar, C40203r rVar, SQLiteDatabase sQLiteDatabase) {
        boolean z;
        byte[] bArr;
        if (mo132956T()) {
            mo132925d(1, LogEventDropped.Reason.CACHE_FULL, jVar.mo132683l());
            return -1L;
        }
        long L = mo132947L(sQLiteDatabase, rVar);
        int e = this.f102627d.mo132905e();
        byte[] a = jVar.mo132679e().mo132829a();
        if (a.length <= e) {
            z = true;
        } else {
            z = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(L));
        contentValues.put("transport_name", jVar.mo132683l());
        contentValues.put("timestamp_ms", Long.valueOf(jVar.mo132681f()));
        contentValues.put("uptime_ms", Long.valueOf(jVar.mo132684m()));
        contentValues.put("payload_encoding", jVar.mo132679e().mo132830b().mo132549a());
        contentValues.put("code", jVar.mo132678d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        if (z) {
            bArr = a;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a.length) / ((double) e));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e, Math.min(i * e, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : jVar.mo132837i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: E0 */
    public static /* synthetic */ byte[] m163700E0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public /* synthetic */ Object m163702F0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo132925d((long) i, LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public /* synthetic */ Object m163704H0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m163732n1(sQLiteDatabase.rawQuery(str2, (String[]) null), new C40289q(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: K0 */
    public static /* synthetic */ Boolean m163705K0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* renamed from: L0 */
    public static /* synthetic */ Object m163706L0(String str, LogEventDropped.Reason reason, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m163732n1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())}), new C40274k0())).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(reason.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())});
        }
        return null;
    }

    /* renamed from: N0 */
    public static /* synthetic */ Object m163707N0(long j, C40203r rVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{rVar.mo132737b(), String.valueOf(C40321a.m163826a(rVar.mo132739d()))}) < 1) {
            contentValues.put("backend_name", rVar.mo132737b());
            contentValues.put("priority", Integer.valueOf(C40321a.m163826a(rVar.mo132739d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public /* synthetic */ Object m163708O0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f102625b.getTime()).execute();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ Object m163709V(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo132925d((long) i, LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ Integer m163710W(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m163732n1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C40254c0(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* renamed from: X */
    public static /* synthetic */ Object m163711X(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("events", (String) null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", (String) null, new String[0]);
        return null;
    }

    /* renamed from: Z0 */
    public static byte[] m163713Z0(@C0363p0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: a0 */
    public static /* synthetic */ Object m163714a0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: b0 */
    public static /* synthetic */ SQLiteDatabase m163715b0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* renamed from: c0 */
    public static /* synthetic */ Long m163716c0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* renamed from: e0 */
    public static /* synthetic */ C40185e m163718e0(long j, SQLiteDatabase sQLiteDatabase) {
        return (C40185e) m163732n1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C40256d0(j));
    }

    /* renamed from: f0 */
    public static /* synthetic */ Long m163720f0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ Boolean m163722g0(C40203r rVar, SQLiteDatabase sQLiteDatabase) {
        Long R = mo132953R(sQLiteDatabase, rVar);
        if (R == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m163732n1(mo132949N().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{R.toString()}), new C40304y());
    }

    /* renamed from: j1 */
    public static C40041c m163725j1(@C0363p0 String str) {
        if (str == null) {
            return f102623w;
        }
        return C40041c.m163048b(str);
    }

    /* renamed from: k1 */
    public static String m163727k1(Iterable<C40273k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C40273k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo132918c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: n0 */
    public static /* synthetic */ List m163731n0(SQLiteDatabase sQLiteDatabase) {
        return (List) m163732n1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C40250a0());
    }

    @C0344h1
    /* renamed from: n1 */
    public static <T> T m163732n1(Cursor cursor, C40282b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: p0 */
    public static /* synthetic */ List m163735p0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(C40203r.m163518a().mo132743b(cursor.getString(1)).mo132745d(C40321a.m163827b(cursor.getInt(2))).mo132744c(m163713Z0(cursor.getString(3))).mo132742a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ List m163737q0(C40203r rVar, SQLiteDatabase sQLiteDatabase) {
        List<C40273k> R0 = mo132954R0(sQLiteDatabase, rVar, this.f102627d.mo132904d());
        for (Priority priority : Priority.values()) {
            if (priority != rVar.mo132739d()) {
                int d = this.f102627d.mo132904d() - R0.size();
                if (d <= 0) {
                    break;
                }
                R0.addAll(mo132954R0(sQLiteDatabase, rVar.mo132851f(priority), d));
            }
        }
        return mo132957U(R0, mo132958U0(sQLiteDatabase, R0));
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public /* synthetic */ C40177a m163741t0(Map map, C40177a.C40178a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason J = mo132945J(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(LogEventDropped.m163407d().mo132794c(J).mo132793b(j).mo132792a());
        }
        mo132959a1(aVar, map);
        aVar.mo132808f(mo132952Q());
        aVar.mo132806d(mo132950O());
        aVar.mo132805c(this.f102628e.get());
        return aVar.mo132804b();
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ C40177a m163746x0(String str, Map map, C40177a.C40178a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C40177a) m163732n1(sQLiteDatabase.rawQuery(str, new String[0]), new C40269i0(this, map, aVar));
    }

    @C0363p0
    /* renamed from: D3 */
    public C40273k mo132926D3(C40203r rVar, C40190j jVar) {
        C40195a.m163494e(f102620f, "Storing event with priority=%s, name=%s for destination %s", rVar.mo132739d(), jVar.mo132683l(), rVar.mo132737b());
        long longValue = ((Long) mo132955S(new C40278m0(this, jVar, rVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C40273k.m163688a(longValue, rVar, jVar);
    }

    /* renamed from: E2 */
    public Iterable<C40273k> mo132927E2(C40203r rVar) {
        return (Iterable) mo132955S(new C40305z(this, rVar));
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: I */
    public void mo132944I() {
        mo132955S(new C40275l());
    }

    /* renamed from: I0 */
    public void mo132928I0(C40203r rVar, long j) {
        mo132955S(new C40291r(j, rVar));
    }

    /* renamed from: J */
    public final LogEventDropped.Reason mo132945J(int i) {
        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
        if (i == reason.getNumber()) {
            return reason;
        }
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
        if (i == reason2.getNumber()) {
            return reason2;
        }
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        if (i == reason3.getNumber()) {
            return reason3;
        }
        LogEventDropped.Reason reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        if (i == reason4.getNumber()) {
            return reason4;
        }
        LogEventDropped.Reason reason5 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
        if (i == reason5.getNumber()) {
            return reason5;
        }
        LogEventDropped.Reason reason6 = LogEventDropped.Reason.INVALID_PAYLOD;
        if (i == reason6.getNumber()) {
            return reason6;
        }
        LogEventDropped.Reason reason7 = LogEventDropped.Reason.SERVER_ERROR;
        if (i == reason7.getNumber()) {
            return reason7;
        }
        C40195a.m163492c(f102620f, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return reason;
    }

    /* renamed from: K */
    public final void mo132946K(SQLiteDatabase sQLiteDatabase) {
        mo132963g1(new C40300v(sQLiteDatabase), new C40303x());
    }

    /* renamed from: L */
    public final long mo132947L(SQLiteDatabase sQLiteDatabase, C40203r rVar) {
        Long R = mo132953R(sQLiteDatabase, rVar);
        if (R != null) {
            return R.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", rVar.mo132737b());
        contentValues.put("priority", Integer.valueOf(C40321a.m163826a(rVar.mo132739d())));
        contentValues.put("next_request_ms", 0);
        if (rVar.mo132738c() != null) {
            contentValues.put("extras", Base64.encodeToString(rVar.mo132738c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    @C0344h1
    /* renamed from: M */
    public long mo132948M() {
        return mo132951P() * getPageSize();
    }

    @C0344h1
    /* renamed from: N */
    public SQLiteDatabase mo132949N() {
        C40298u0 u0Var = this.f102624a;
        Objects.requireNonNull(u0Var);
        return (SQLiteDatabase) mo132963g1(new C40279n(u0Var), new C40285o());
    }

    /* renamed from: O */
    public final C40179b mo132950O() {
        return C40179b.m163430d().mo132812b(C40183d.m163444d().mo132822b(mo132948M()).mo132823c(C40257e.f102598f.mo132907f()).mo132821a()).mo132811a();
    }

    /* renamed from: P */
    public final long mo132951P() {
        return mo132949N().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: P0 */
    public Iterable<C40203r> mo132929P0() {
        return (Iterable) mo132955S(new C40272j0());
    }

    /* renamed from: Q */
    public final C40185e mo132952Q() {
        return (C40185e) mo132955S(new C40266h0(this.f102625b.getTime()));
    }

    @C0363p0
    /* renamed from: R */
    public final Long mo132953R(SQLiteDatabase sQLiteDatabase, C40203r rVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{rVar.mo132737b(), String.valueOf(C40321a.m163826a(rVar.mo132739d()))}));
        if (rVar.mo132738c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(rVar.mo132738c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m163732n1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), new C40259e0());
    }

    /* renamed from: R0 */
    public final List<C40273k> mo132954R0(SQLiteDatabase sQLiteDatabase, C40203r rVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long R = mo132953R(sQLiteDatabase, rVar);
        if (R == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m163732n1(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{R.toString()}, (String) null, (String) null, (String) null, String.valueOf(i)), new C40295t(this, arrayList, rVar));
        return arrayList;
    }

    @C0344h1
    /* renamed from: S */
    public <T> T mo132955S(C40282b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase N = mo132949N();
        N.beginTransaction();
        try {
            T apply = bVar.apply(N);
            N.setTransactionSuccessful();
            return apply;
        } finally {
            N.endTransaction();
        }
    }

    /* renamed from: S1 */
    public long mo132930S1(C40203r rVar) {
        return ((Long) m163732n1(mo132949N().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{rVar.mo132737b(), String.valueOf(C40321a.m163826a(rVar.mo132739d()))}), new C40287p())).longValue();
    }

    /* renamed from: T */
    public final boolean mo132956T() {
        if (mo132951P() * getPageSize() >= this.f102627d.mo132907f()) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public final List<C40273k> mo132957U(List<C40273k> list, Map<Long, Set<C40283c>> map) {
        ListIterator<C40273k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C40273k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo132918c()))) {
                C40190j.C40191a n = next.mo132917b().mo132840n();
                for (C40283c cVar : map.get(Long.valueOf(next.mo132918c()))) {
                    n.mo132843c(cVar.f102629a, cVar.f102630b);
                }
                listIterator.set(C40273k.m163688a(next.mo132918c(), next.mo132919d(), n.mo132686d()));
            }
        }
        return list;
    }

    /* renamed from: U0 */
    public final Map<Long, Set<C40283c>> mo132958U0(SQLiteDatabase sQLiteDatabase, List<C40273k> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo132918c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m163732n1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new C40302w(hashMap));
        return hashMap;
    }

    /* renamed from: W1 */
    public boolean mo132931W1(C40203r rVar) {
        return ((Boolean) mo132955S(new C40276l0(this, rVar))).booleanValue();
    }

    /* renamed from: Z1 */
    public void mo132932Z1(Iterable<C40273k> iterable) {
        if (iterable.iterator().hasNext()) {
            mo132955S(new C40252b0(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m163727k1(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* renamed from: a */
    public void mo132923a() {
        mo132955S(new C40293s(this));
    }

    /* renamed from: a1 */
    public final void mo132959a1(C40177a.C40178a aVar, Map<String, List<LogEventDropped>> map) {
        for (Map.Entry next : map.entrySet()) {
            aVar.mo132803a(C40181c.m163436d().mo132818d((String) next.getKey()).mo132817c((List) next.getValue()).mo132816b());
        }
    }

    /* renamed from: b */
    public <T> T mo132960b(C40306a.C40307a<T> aVar) {
        SQLiteDatabase N = mo132949N();
        mo132946K(N);
        try {
            T execute = aVar.execute();
            N.setTransactionSuccessful();
            return execute;
        } finally {
            N.endTransaction();
        }
    }

    /* renamed from: c */
    public C40177a mo132924c() {
        return (C40177a) mo132955S(new C40264g0(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), C40177a.m163414h()));
    }

    /* renamed from: c1 */
    public final byte[] mo132961c1(long j) {
        return (byte[]) m163732n1(mo132949N().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), new C40261f0());
    }

    public void close() {
        this.f102624a.close();
    }

    /* renamed from: d */
    public void mo132925d(long j, LogEventDropped.Reason reason, String str) {
        mo132955S(new C40277m(str, reason, j));
    }

    /* renamed from: g1 */
    public final <T> T mo132963g1(C40284d<T> dVar, C40282b<Throwable, T> bVar) {
        long time = this.f102626c.getTime();
        while (true) {
            try {
                return dVar.mo132943a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f102626c.getTime() >= ((long) this.f102627d.mo132902b()) + time) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public final long getPageSize() {
        return mo132949N().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: k0 */
    public int mo132933k0() {
        return ((Integer) mo132955S(new C40297u(this, this.f102625b.getTime() - this.f102627d.mo132903c()))).intValue();
    }

    /* renamed from: l0 */
    public void mo132934l0(Iterable<C40273k> iterable) {
        if (iterable.iterator().hasNext()) {
            mo132949N().compileStatement("DELETE FROM events WHERE _id in " + m163727k1(iterable)).execute();
        }
    }
}
