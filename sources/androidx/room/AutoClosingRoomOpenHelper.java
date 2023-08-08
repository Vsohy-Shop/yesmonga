package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.C0376v0;
import androidx.lifecycle.C19456p0;
import androidx.sqlite.p031db.C20458c;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20481g;
import androidx.sqlite.p031db.C20489i;
import androidx.sqlite.p031db.C20492k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class AutoClosingRoomOpenHelper implements C20481g, C20331k {
    @C12579k

    /* renamed from: a */
    public final C20481g f52226a;
    @C12579k
    @C11287e

    /* renamed from: b */
    public final C20285c f52227b;
    @C12579k

    /* renamed from: c */
    public final AutoClosingSupportSQLiteDatabase f52228c;

    public static final class AutoClosingSupportSQLiteDatabase implements C20466f {
        @C12579k

        /* renamed from: a */
        public final C20285c f52229a;

        public AutoClosingSupportSQLiteDatabase(@C12579k C20285c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "autoCloser");
            this.f52229a = cVar;
        }

        /* renamed from: A3 */
        public boolean mo60748A3() {
            if (this.f52229a.mo60982h() == null) {
                return false;
            }
            return ((Boolean) this.f52229a.mo60981g(C20241x5693171d.f52236a)).booleanValue();
        }

        /* renamed from: C1 */
        public boolean mo60749C1(int i) {
            return ((Boolean) this.f52229a.mo60981g(new C20248xfb73a9ca(i))).booleanValue();
        }

        @C12579k
        /* renamed from: C2 */
        public C20492k mo60750C2(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "sql");
            return new AutoClosingSupportSqliteStatement(str, this.f52229a);
        }

        @C12579k
        /* renamed from: I1 */
        public Cursor mo60751I1(@C12579k C20489i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "query");
            try {
                return new C20236a(this.f52229a.mo60988n().mo60751I1(iVar), this.f52229a);
            } catch (Throwable th) {
                this.f52229a.mo60980e();
                throw th;
            }
        }

        /* renamed from: K1 */
        public void mo60752K1(@C12579k Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.f52229a.mo60981g(new C20254xf1df5ec0(locale));
        }

        @C0376v0(api = 16)
        /* renamed from: K3 */
        public boolean mo60753K3() {
            return ((Boolean) this.f52229a.mo60981g(C20246x1aa74a04.f52240f)).booleanValue();
        }

        /* renamed from: L2 */
        public boolean mo60754L2() {
            return ((Boolean) this.f52229a.mo60981g(C20245x928ac242.f52239f)).booleanValue();
        }

        /* renamed from: L3 */
        public void mo60755L3(int i) {
            this.f52229a.mo60981g(new C20255x9778840d(i));
        }

        @C0376v0(api = 24)
        @C12579k
        /* renamed from: M0 */
        public Cursor mo60756M0(@C12579k C20489i iVar, @C12580l CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(iVar, "query");
            try {
                return new C20236a(this.f52229a.mo60988n().mo60756M0(iVar, cancellationSignal), this.f52229a);
            } catch (Throwable th) {
                this.f52229a.mo60980e();
                throw th;
            }
        }

        /* renamed from: N3 */
        public void mo60757N3(long j) {
            this.f52229a.mo60981g(new C20250x65399d07(j));
        }

        @C0376v0(api = 16)
        /* renamed from: P2 */
        public void mo60758P2(boolean z) {
            this.f52229a.mo60981g(new C20253xeb7db11c(z));
        }

        /* renamed from: U2 */
        public long mo60759U2() {
            return ((Number) this.f52229a.mo60981g(C20247xb75cb4a5.f52241a)).longValue();
        }

        /* renamed from: V2 */
        public int mo60760V2(@C12579k String str, int i, @C12579k ContentValues contentValues, @C12580l String str2, @C12580l Object[] objArr) {
            Intrinsics.checkNotNullParameter(str, "table");
            Intrinsics.checkNotNullParameter(contentValues, C19456p0.f49833g);
            return ((Number) this.f52229a.mo60981g(new C20257xc522ba9f(str, i, contentValues, str2, objArr))).intValue();
        }

        /* renamed from: a */
        public final void mo60761a() {
            this.f52229a.mo60981g(C20252x1a023a99.f52244f);
        }

        public void close() throws IOException {
            this.f52229a.mo60979d();
        }

        /* renamed from: d1 */
        public boolean mo60763d1() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        /* renamed from: e1 */
        public void mo60764e1() {
            C11079d2 d2Var;
            C20466f h = this.f52229a.mo60982h();
            if (h != null) {
                h.mo60764e1();
                d2Var = C11079d2.f28267a;
            } else {
                d2Var = null;
            }
            if (d2Var == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        /* renamed from: e3 */
        public boolean mo60765e3() {
            return ((Boolean) this.f52229a.mo60981g(C20260x2da6dfee.f52246a)).booleanValue();
        }

        /* renamed from: f1 */
        public void mo60766f1(@C12579k String str, @C12579k Object[] objArr) throws SQLException {
            Intrinsics.checkNotNullParameter(str, "sql");
            Intrinsics.checkNotNullParameter(objArr, "bindArgs");
            this.f52229a.mo60981g(new C20240x106d7262(str, objArr));
        }

        public long getPageSize() {
            return ((Number) this.f52229a.mo60981g(C20249x65399d06.f52242a)).longValue();
        }

        @C12580l
        public String getPath() {
            return (String) this.f52229a.mo60981g(C20251x4ec8cd3b.f52243f);
        }

        public int getVersion() {
            return ((Number) this.f52229a.mo60981g(C20258xff8530fc.f52245a)).intValue();
        }

        /* renamed from: h1 */
        public void mo60770h1() {
            try {
                this.f52229a.mo60988n().mo60770h1();
            } catch (Throwable th) {
                this.f52229a.mo60980e();
                throw th;
            }
        }

        @C12579k
        /* renamed from: h3 */
        public Cursor mo60771h3(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "query");
            try {
                return new C20236a(this.f52229a.mo60988n().mo60771h3(str), this.f52229a);
            } catch (Throwable th) {
                this.f52229a.mo60980e();
                throw th;
            }
        }

        /* renamed from: i0 */
        public int mo60772i0(@C12579k String str, @C12580l String str2, @C12580l Object[] objArr) {
            Intrinsics.checkNotNullParameter(str, "table");
            return ((Number) this.f52229a.mo60981g(new C20238xa7295701(str, str2, objArr))).intValue();
        }

        /* renamed from: i1 */
        public long mo60773i1(long j) {
            return ((Number) this.f52229a.mo60981g(new C20256xd48b87d5(j))).longValue();
        }

        public boolean isOpen() {
            C20466f h = this.f52229a.mo60982h();
            if (h == null) {
                return false;
            }
            return h.isOpen();
        }

        /* renamed from: j0 */
        public void mo60775j0() {
            try {
                this.f52229a.mo60988n().mo60775j0();
            } catch (Throwable th) {
                this.f52229a.mo60980e();
                throw th;
            }
        }

        /* renamed from: j3 */
        public long mo60776j3(@C12579k String str, int i, @C12579k ContentValues contentValues) throws SQLException {
            Intrinsics.checkNotNullParameter(str, "table");
            Intrinsics.checkNotNullParameter(contentValues, C19456p0.f49833g);
            return ((Number) this.f52229a.mo60981g(new C20242x9698888f(str, i, contentValues))).longValue();
        }

        @C12580l
        /* renamed from: o0 */
        public List<Pair<String, String>> mo60777o0() {
            return (List) this.f52229a.mo60981g(C20237x882a29d5.f52235f);
        }

        /* renamed from: p1 */
        public void mo60778p1(@C12579k SQLiteTransactionListener sQLiteTransactionListener) {
            Intrinsics.checkNotNullParameter(sQLiteTransactionListener, "transactionListener");
            try {
                this.f52229a.mo60988n().mo60778p1(sQLiteTransactionListener);
            } catch (Throwable th) {
                this.f52229a.mo60980e();
                throw th;
            }
        }

        /* renamed from: p2 */
        public boolean mo60779p2(long j) {
            return ((Boolean) this.f52229a.mo60981g(C20261x2da6dfef.f52247a)).booleanValue();
        }

        /* renamed from: r0 */
        public void mo60780r0() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @C12579k
        /* renamed from: r2 */
        public Cursor mo60781r2(@C12579k String str, @C12579k Object[] objArr) {
            Intrinsics.checkNotNullParameter(str, "query");
            Intrinsics.checkNotNullParameter(objArr, "bindArgs");
            try {
                return new C20236a(this.f52229a.mo60988n().mo60781r2(str, objArr), this.f52229a);
            } catch (Throwable th) {
                this.f52229a.mo60980e();
                throw th;
            }
        }

        /* renamed from: s0 */
        public void mo60782s0(@C12579k String str) throws SQLException {
            Intrinsics.checkNotNullParameter(str, "sql");
            this.f52229a.mo60981g(new C20239x106d7261(str));
        }

        /* renamed from: s1 */
        public boolean mo60783s1() {
            if (this.f52229a.mo60982h() == null) {
                return false;
            }
            return ((Boolean) this.f52229a.mo60981g(C20244xa0ea6de.f52238a)).booleanValue();
        }

        /* renamed from: t1 */
        public void mo60784t1() {
            if (this.f52229a.mo60982h() != null) {
                try {
                    C20466f h = this.f52229a.mo60982h();
                    Intrinsics.checkNotNull(h);
                    h.mo60784t1();
                } finally {
                    this.f52229a.mo60980e();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null".toString());
            }
        }

        /* renamed from: u2 */
        public void mo60785u2(int i) {
            this.f52229a.mo60981g(new C20259xff8530fd(i));
        }

        /* renamed from: v0 */
        public boolean mo60786v0() {
            return ((Boolean) this.f52229a.mo60981g(C20243x7d1b80e8.f52237f)).booleanValue();
        }

        /* renamed from: z3 */
        public void mo60787z3(@C12579k SQLiteTransactionListener sQLiteTransactionListener) {
            Intrinsics.checkNotNullParameter(sQLiteTransactionListener, "transactionListener");
            try {
                this.f52229a.mo60988n().mo60787z3(sQLiteTransactionListener);
            } catch (Throwable th) {
                this.f52229a.mo60980e();
                throw th;
            }
        }
    }

    public static final class AutoClosingSupportSqliteStatement implements C20492k {
        @C12579k

        /* renamed from: a */
        public final String f52230a;
        @C12579k

        /* renamed from: b */
        public final C20285c f52231b;
        @C12579k

        /* renamed from: c */
        public final ArrayList<Object> f52232c = new ArrayList<>();

        public AutoClosingSupportSqliteStatement(@C12579k String str, @C12579k C20285c cVar) {
            Intrinsics.checkNotNullParameter(str, "sql");
            Intrinsics.checkNotNullParameter(cVar, "autoCloser");
            this.f52230a = str;
            this.f52231b = cVar;
        }

        /* renamed from: G0 */
        public void mo60788G0(int i, double d) {
            mo60796f(i, Double.valueOf(d));
        }

        /* renamed from: O3 */
        public void mo60789O3() {
            this.f52232c.clear();
        }

        /* renamed from: S2 */
        public void mo60790S2(int i, long j) {
            mo60796f(i, Long.valueOf(j));
        }

        /* renamed from: a3 */
        public void mo60791a3(int i, @C12579k byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "value");
            mo60796f(i, bArr);
        }

        /* renamed from: c */
        public final void mo60792c(C20492k kVar) {
            Iterator<T> it = this.f52232c.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                Object obj = this.f52232c.get(i);
                if (obj == null) {
                    kVar.mo60800u3(i2);
                } else if (obj instanceof Long) {
                    kVar.mo60790S2(i2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.mo60788G0(i2, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.mo60801v2(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.mo60791a3(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        public void close() throws IOException {
        }

        /* renamed from: d */
        public final <T> T mo60794d(C11300l<? super C20492k, ? extends T> lVar) {
            return this.f52231b.mo60981g(new C20264xdd6c1cf2(this, lVar));
        }

        public void execute() {
            mo60794d(C20262xc356304d.f52248f);
        }

        /* renamed from: f */
        public final void mo60796f(int i, Object obj) {
            int size;
            int i2 = i - 1;
            if (i2 >= this.f52232c.size() && (size = this.f52232c.size()) <= i2) {
                while (true) {
                    this.f52232c.add((Object) null);
                    if (size == i2) {
                        break;
                    }
                    size++;
                }
            }
            this.f52232c.set(i2, obj);
        }

        /* renamed from: h2 */
        public long mo60797h2() {
            return ((Number) mo60794d(C20263xe79bbce6.f52249f)).longValue();
        }

        @C12580l
        /* renamed from: m1 */
        public String mo60798m1() {
            return (String) mo60794d(C20267xa8feac86.f52252f);
        }

        /* renamed from: q2 */
        public long mo60799q2() {
            return ((Number) mo60794d(C20266x6100e31.f52251f)).longValue();
        }

        /* renamed from: u3 */
        public void mo60800u3(int i) {
            mo60796f(i, (Object) null);
        }

        /* renamed from: v2 */
        public void mo60801v2(int i, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            mo60796f(i, str);
        }

        /* renamed from: y0 */
        public int mo60802y0() {
            return ((Number) mo60794d(C20265x7fb2e741.f52250f)).intValue();
        }
    }

    /* renamed from: androidx.room.AutoClosingRoomOpenHelper$a */
    public static final class C20236a implements Cursor {
        @C12579k

        /* renamed from: a */
        public final Cursor f52233a;
        @C12579k

        /* renamed from: b */
        public final C20285c f52234b;

        public C20236a(@C12579k Cursor cursor, @C12579k C20285c cVar) {
            Intrinsics.checkNotNullParameter(cursor, "delegate");
            Intrinsics.checkNotNullParameter(cVar, "autoCloser");
            this.f52233a = cursor;
            this.f52234b = cVar;
        }

        public void close() {
            this.f52233a.close();
            this.f52234b.mo60980e();
        }

        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.f52233a.copyStringToBuffer(i, charArrayBuffer);
        }

        @C11395k(message = "Deprecated in Java")
        public void deactivate() {
            this.f52233a.deactivate();
        }

        public byte[] getBlob(int i) {
            return this.f52233a.getBlob(i);
        }

        public int getColumnCount() {
            return this.f52233a.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.f52233a.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) {
            return this.f52233a.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i) {
            return this.f52233a.getColumnName(i);
        }

        public String[] getColumnNames() {
            return this.f52233a.getColumnNames();
        }

        public int getCount() {
            return this.f52233a.getCount();
        }

        public double getDouble(int i) {
            return this.f52233a.getDouble(i);
        }

        public Bundle getExtras() {
            return this.f52233a.getExtras();
        }

        public float getFloat(int i) {
            return this.f52233a.getFloat(i);
        }

        public int getInt(int i) {
            return this.f52233a.getInt(i);
        }

        public long getLong(int i) {
            return this.f52233a.getLong(i);
        }

        @C0376v0(api = 19)
        @C12579k
        public Uri getNotificationUri() {
            return C20458c.C20460b.m95354a(this.f52233a);
        }

        @C0376v0(api = 29)
        @C12579k
        public List<Uri> getNotificationUris() {
            return C20458c.C20463e.m95358a(this.f52233a);
        }

        public int getPosition() {
            return this.f52233a.getPosition();
        }

        public short getShort(int i) {
            return this.f52233a.getShort(i);
        }

        public String getString(int i) {
            return this.f52233a.getString(i);
        }

        public int getType(int i) {
            return this.f52233a.getType(i);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.f52233a.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.f52233a.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.f52233a.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.f52233a.isClosed();
        }

        public boolean isFirst() {
            return this.f52233a.isFirst();
        }

        public boolean isLast() {
            return this.f52233a.isLast();
        }

        public boolean isNull(int i) {
            return this.f52233a.isNull(i);
        }

        public boolean move(int i) {
            return this.f52233a.move(i);
        }

        public boolean moveToFirst() {
            return this.f52233a.moveToFirst();
        }

        public boolean moveToLast() {
            return this.f52233a.moveToLast();
        }

        public boolean moveToNext() {
            return this.f52233a.moveToNext();
        }

        public boolean moveToPosition(int i) {
            return this.f52233a.moveToPosition(i);
        }

        public boolean moveToPrevious() {
            return this.f52233a.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.f52233a.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f52233a.registerDataSetObserver(dataSetObserver);
        }

        @C11395k(message = "Deprecated in Java")
        public boolean requery() {
            return this.f52233a.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.f52233a.respond(bundle);
        }

        @C0376v0(api = 23)
        public void setExtras(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "extras");
            C20458c.C20462d.m95357a(this.f52233a, bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f52233a.setNotificationUri(contentResolver, uri);
        }

        @C0376v0(api = 29)
        public void setNotificationUris(@C12579k ContentResolver contentResolver, @C12579k List<? extends Uri> list) {
            Intrinsics.checkNotNullParameter(contentResolver, "cr");
            Intrinsics.checkNotNullParameter(list, "uris");
            C20458c.C20463e.m95359b(this.f52233a, contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f52233a.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f52233a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public AutoClosingRoomOpenHelper(@C12579k C20481g gVar, @C12579k C20285c cVar) {
        Intrinsics.checkNotNullParameter(gVar, "delegate");
        Intrinsics.checkNotNullParameter(cVar, "autoCloser");
        this.f52226a = gVar;
        this.f52227b = cVar;
        cVar.mo60989o(getDelegate());
        this.f52228c = new AutoClosingSupportSQLiteDatabase(cVar);
    }

    @C0376v0(api = 24)
    @C12579k
    /* renamed from: Z2 */
    public C20466f mo18111Z2() {
        this.f52228c.mo60761a();
        return this.f52228c;
    }

    public void close() {
        this.f52228c.close();
    }

    @C0376v0(api = 24)
    @C12579k
    /* renamed from: d3 */
    public C20466f mo18117d3() {
        this.f52228c.mo60761a();
        return this.f52228c;
    }

    @C12580l
    public String getDatabaseName() {
        return this.f52226a.getDatabaseName();
    }

    @C12579k
    public C20481g getDelegate() {
        return this.f52226a;
    }

    @C0376v0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f52226a.setWriteAheadLoggingEnabled(z);
    }
}
