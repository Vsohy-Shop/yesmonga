package androidx.sqlite.p031db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.lifecycle.C19456p0;
import androidx.sqlite.p031db.C20456b;
import androidx.sqlite.p031db.C20458c;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20489i;
import androidx.sqlite.p031db.C20492k;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteDatabase */
public final class FrameworkSQLiteDatabase implements C20466f {
    @C12579k

    /* renamed from: c */
    public static final C20468b f52760c = new C20468b((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public static final String[] f52761d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    @C12579k

    /* renamed from: e */
    public static final String[] f52762e = new String[0];
    @C12579k

    /* renamed from: a */
    public final SQLiteDatabase f52763a;
    @C12580l

    /* renamed from: b */
    public final List<Pair<String, String>> f52764b;

    @C0376v0(30)
    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$a */
    public static final class C20467a {
        @C12579k

        /* renamed from: a */
        public static final C20467a f52765a = new C20467a();

        @C0373u
        /* renamed from: a */
        public final void mo61380a(@C12579k SQLiteDatabase sQLiteDatabase, @C12579k String str, @C12580l Object[] objArr) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(str, "sql");
            sQLiteDatabase.execPerConnectionSQL(str, objArr);
        }
    }

    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$b */
    public static final class C20468b {
        public /* synthetic */ C20468b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C20468b() {
        }
    }

    public FrameworkSQLiteDatabase(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "delegate");
        this.f52763a = sQLiteDatabase;
        this.f52764b = sQLiteDatabase.getAttachedDbs();
    }

    /* renamed from: d */
    public static final Cursor m95400d(C11306r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(rVar, "$tmp0");
        return (Cursor) rVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* renamed from: f */
    public static final Cursor m95401f(C20489i iVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(iVar, "$query");
        Intrinsics.checkNotNull(sQLiteQuery);
        iVar.mo61234c(new C20478f(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* renamed from: A3 */
    public boolean mo60748A3() {
        return this.f52763a.inTransaction();
    }

    /* renamed from: C1 */
    public boolean mo60749C1(int i) {
        return this.f52763a.needUpgrade(i);
    }

    @C12579k
    /* renamed from: C2 */
    public C20492k mo60750C2(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "sql");
        SQLiteStatement compileStatement = this.f52763a.compileStatement(str);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new C20479g(compileStatement);
    }

    @C12579k
    /* renamed from: I1 */
    public Cursor mo60751I1(@C12579k C20489i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "query");
        Cursor rawQueryWithFactory = this.f52763a.rawQueryWithFactory(new C20474b(new FrameworkSQLiteDatabase$query$cursorFactory$1(iVar)), iVar.mo61233b(), f52762e, (String) null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    /* renamed from: K1 */
    public void mo60752K1(@C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f52763a.setLocale(locale);
    }

    @C0376v0(api = 16)
    /* renamed from: K3 */
    public boolean mo60753K3() {
        return C20458c.C20459a.m95350e(this.f52763a);
    }

    /* renamed from: L2 */
    public boolean mo60754L2() {
        return this.f52763a.isReadOnly();
    }

    /* renamed from: L3 */
    public void mo60755L3(int i) {
        this.f52763a.setMaxSqlCacheSize(i);
    }

    @C0376v0(16)
    @C12579k
    /* renamed from: M0 */
    public Cursor mo60756M0(@C12579k C20489i iVar, @C12580l CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(iVar, "query");
        SQLiteDatabase sQLiteDatabase = this.f52763a;
        String b = iVar.mo61233b();
        String[] strArr = f52762e;
        Intrinsics.checkNotNull(cancellationSignal);
        return C20458c.C20459a.m95351f(sQLiteDatabase, b, strArr, (String) null, cancellationSignal, new C20473a(iVar));
    }

    /* renamed from: N3 */
    public void mo60757N3(long j) {
        this.f52763a.setPageSize(j);
    }

    @C0376v0(api = 16)
    /* renamed from: P2 */
    public void mo60758P2(boolean z) {
        C20458c.C20459a.m95352g(this.f52763a, z);
    }

    /* renamed from: U2 */
    public long mo60759U2() {
        return this.f52763a.getMaximumSize();
    }

    /* renamed from: V2 */
    public int mo60760V2(@C12579k String str, int i, @C12579k ContentValues contentValues, @C12580l String str2, @C12580l Object[] objArr) {
        boolean z;
        int i2;
        String str3;
        Intrinsics.checkNotNullParameter(str, "table");
        Intrinsics.checkNotNullParameter(contentValues, C19456p0.f49833g);
        int i3 = 0;
        if (contentValues.size() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int size = contentValues.size();
            if (objArr == null) {
                i2 = size;
            } else {
                i2 = objArr.length + size;
            }
            Object[] objArr2 = new Object[i2];
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ");
            sb.append(f52761d[i]);
            sb.append(str);
            sb.append(" SET ");
            for (String next : contentValues.keySet()) {
                if (i3 > 0) {
                    str3 = ",";
                } else {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(next);
                objArr2[i3] = contentValues.get(next);
                sb.append("=?");
                i3++;
            }
            if (objArr != null) {
                for (int i4 = size; i4 < i2; i4++) {
                    objArr2[i4] = objArr[i4 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            C20492k C2 = mo60750C2(sb2);
            C20456b.f52752c.mo61376b(C2, objArr2);
            return C2.mo60802y0();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    /* renamed from: a2 */
    public void mo61001a2(@C12579k String str, @C12580l Object[] objArr) {
        Intrinsics.checkNotNullParameter(str, "sql");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            C20467a.f52765a.mo61380a(this.f52763a, str, objArr);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + i);
    }

    /* renamed from: c */
    public final boolean mo61377c(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
        return Intrinsics.areEqual((Object) this.f52763a, (Object) sQLiteDatabase);
    }

    public void close() throws IOException {
        this.f52763a.close();
    }

    /* renamed from: d1 */
    public boolean mo60763d1() {
        return this.f52763a.enableWriteAheadLogging();
    }

    /* renamed from: e1 */
    public void mo60764e1() {
        this.f52763a.setTransactionSuccessful();
    }

    /* renamed from: e3 */
    public boolean mo60765e3() {
        return this.f52763a.yieldIfContendedSafely();
    }

    /* renamed from: f1 */
    public void mo60766f1(@C12579k String str, @C12579k Object[] objArr) throws SQLException {
        Intrinsics.checkNotNullParameter(str, "sql");
        Intrinsics.checkNotNullParameter(objArr, "bindArgs");
        this.f52763a.execSQL(str, objArr);
    }

    /* renamed from: g */
    public void mo61379g(long j) {
        this.f52763a.setMaximumSize(j);
    }

    public long getPageSize() {
        return this.f52763a.getPageSize();
    }

    @C12580l
    public String getPath() {
        return this.f52763a.getPath();
    }

    public int getVersion() {
        return this.f52763a.getVersion();
    }

    /* renamed from: h1 */
    public void mo60770h1() {
        this.f52763a.beginTransactionNonExclusive();
    }

    @C12579k
    /* renamed from: h3 */
    public Cursor mo60771h3(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "query");
        return mo60751I1(new C20456b(str));
    }

    /* renamed from: i0 */
    public int mo60772i0(@C12579k String str, @C12580l String str2, @C12580l Object[] objArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "table");
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        C20492k C2 = mo60750C2(sb2);
        C20456b.f52752c.mo61376b(C2, objArr);
        return C2.mo60802y0();
    }

    /* renamed from: i1 */
    public long mo60773i1(long j) {
        this.f52763a.setMaximumSize(j);
        return this.f52763a.getMaximumSize();
    }

    public boolean isOpen() {
        return this.f52763a.isOpen();
    }

    /* renamed from: j0 */
    public void mo60775j0() {
        this.f52763a.beginTransaction();
    }

    /* renamed from: j3 */
    public long mo60776j3(@C12579k String str, int i, @C12579k ContentValues contentValues) throws SQLException {
        Intrinsics.checkNotNullParameter(str, "table");
        Intrinsics.checkNotNullParameter(contentValues, C19456p0.f49833g);
        return this.f52763a.insertWithOnConflict(str, (String) null, contentValues, i);
    }

    @C12580l
    /* renamed from: o0 */
    public List<Pair<String, String>> mo60777o0() {
        return this.f52764b;
    }

    /* renamed from: p1 */
    public void mo60778p1(@C12579k SQLiteTransactionListener sQLiteTransactionListener) {
        Intrinsics.checkNotNullParameter(sQLiteTransactionListener, "transactionListener");
        this.f52763a.beginTransactionWithListener(sQLiteTransactionListener);
    }

    /* renamed from: p2 */
    public boolean mo60779p2(long j) {
        return this.f52763a.yieldIfContendedSafely(j);
    }

    @C0376v0(api = 16)
    /* renamed from: r0 */
    public void mo60780r0() {
        C20458c.C20459a.m95349d(this.f52763a);
    }

    /* renamed from: r1 */
    public boolean mo61003r1() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @C12579k
    /* renamed from: r2 */
    public Cursor mo60781r2(@C12579k String str, @C12579k Object[] objArr) {
        Intrinsics.checkNotNullParameter(str, "query");
        Intrinsics.checkNotNullParameter(objArr, "bindArgs");
        return mo60751I1(new C20456b(str, objArr));
    }

    /* renamed from: s0 */
    public void mo60782s0(@C12579k String str) throws SQLException {
        Intrinsics.checkNotNullParameter(str, "sql");
        this.f52763a.execSQL(str);
    }

    /* renamed from: s1 */
    public boolean mo60783s1() {
        return this.f52763a.isDbLockedByCurrentThread();
    }

    /* renamed from: t1 */
    public void mo60784t1() {
        this.f52763a.endTransaction();
    }

    /* renamed from: u2 */
    public void mo60785u2(int i) {
        this.f52763a.setVersion(i);
    }

    /* renamed from: v0 */
    public boolean mo60786v0() {
        return this.f52763a.isDatabaseIntegrityOk();
    }

    /* renamed from: z3 */
    public void mo60787z3(@C12579k SQLiteTransactionListener sQLiteTransactionListener) {
        Intrinsics.checkNotNullParameter(sQLiteTransactionListener, "transactionListener");
        this.f52763a.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }
}
