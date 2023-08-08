package androidx.sqlite.p031db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.C0376v0;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.sqlite.db.f */
public interface C20466f extends Closeable {
    /* renamed from: A3 */
    boolean mo60748A3();

    /* renamed from: C1 */
    boolean mo60749C1(int i);

    @C12579k
    /* renamed from: C2 */
    C20492k mo60750C2(@C12579k String str);

    @C12579k
    /* renamed from: I1 */
    Cursor mo60751I1(@C12579k C20489i iVar);

    /* renamed from: K1 */
    void mo60752K1(@C12579k Locale locale);

    @C0376v0(api = 16)
    /* renamed from: K3 */
    boolean mo60753K3();

    /* renamed from: L2 */
    boolean mo60754L2();

    /* renamed from: L3 */
    void mo60755L3(int i);

    @C0376v0(api = 16)
    @C12579k
    /* renamed from: M0 */
    Cursor mo60756M0(@C12579k C20489i iVar, @C12580l CancellationSignal cancellationSignal);

    /* renamed from: N3 */
    void mo60757N3(long j);

    @C0376v0(api = 16)
    /* renamed from: P2 */
    void mo60758P2(boolean z);

    /* renamed from: U2 */
    long mo60759U2();

    /* renamed from: V2 */
    int mo60760V2(@C12579k String str, int i, @C12579k ContentValues contentValues, @C12580l String str2, @C12580l Object[] objArr);

    /* renamed from: a2 */
    void mo61001a2(@C12579k String str, @C12580l @SuppressLint({"ArrayReturn"}) Object[] objArr) {
        Intrinsics.checkNotNullParameter(str, "sql");
        throw new UnsupportedOperationException();
    }

    /* renamed from: d1 */
    boolean mo60763d1();

    /* renamed from: e1 */
    void mo60764e1();

    /* renamed from: e3 */
    boolean mo60765e3();

    /* renamed from: f1 */
    void mo60766f1(@C12579k String str, @C12579k Object[] objArr) throws SQLException;

    long getPageSize();

    @C12580l
    String getPath();

    int getVersion();

    /* renamed from: h1 */
    void mo60770h1();

    @C12579k
    /* renamed from: h3 */
    Cursor mo60771h3(@C12579k String str);

    /* renamed from: i0 */
    int mo60772i0(@C12579k String str, @C12580l String str2, @C12580l Object[] objArr);

    /* renamed from: i1 */
    long mo60773i1(long j);

    boolean isOpen();

    /* renamed from: j0 */
    void mo60775j0();

    /* renamed from: j3 */
    long mo60776j3(@C12579k String str, int i, @C12579k ContentValues contentValues) throws SQLException;

    @C12580l
    /* renamed from: o0 */
    List<Pair<String, String>> mo60777o0();

    /* renamed from: p1 */
    void mo60778p1(@C12579k SQLiteTransactionListener sQLiteTransactionListener);

    /* renamed from: p2 */
    boolean mo60779p2(long j);

    @C0376v0(api = 16)
    /* renamed from: r0 */
    void mo60780r0();

    /* renamed from: r1 */
    boolean mo61003r1() {
        return false;
    }

    @C12579k
    /* renamed from: r2 */
    Cursor mo60781r2(@C12579k String str, @C12579k Object[] objArr);

    /* renamed from: s0 */
    void mo60782s0(@C12579k String str) throws SQLException;

    /* renamed from: s1 */
    boolean mo60783s1();

    /* renamed from: t1 */
    void mo60784t1();

    /* renamed from: u2 */
    void mo60785u2(int i);

    /* renamed from: v0 */
    boolean mo60786v0();

    /* renamed from: z3 */
    void mo60787z3(@C12579k SQLiteTransactionListener sQLiteTransactionListener);
}
