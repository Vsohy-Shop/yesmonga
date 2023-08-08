package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.C0376v0;
import androidx.lifecycle.C19456p0;
import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20489i;
import androidx.sqlite.p031db.C20492k;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.room.c1 */
public final class C20288c1 implements C20466f {
    @C12579k

    /* renamed from: a */
    public final C20466f f52361a;
    @C12579k

    /* renamed from: b */
    public final Executor f52362b;
    @C12579k

    /* renamed from: c */
    public final RoomDatabase.C20275f f52363c;

    public C20288c1(@C12579k C20466f fVar, @C12579k Executor executor, @C12579k RoomDatabase.C20275f fVar2) {
        Intrinsics.checkNotNullParameter(fVar, "delegate");
        Intrinsics.checkNotNullParameter(executor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(fVar2, "queryCallback");
        this.f52361a = fVar;
        this.f52362b = executor;
        this.f52363c = fVar2;
    }

    /* renamed from: o */
    public static final void m94908o(C20288c1 c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "this$0");
        c1Var.f52363c.mo60955a("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt__CollectionsKt.m40441E());
    }

    /* renamed from: p */
    public static final void m94909p(C20288c1 c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "this$0");
        c1Var.f52363c.mo60955a("BEGIN DEFERRED TRANSACTION", CollectionsKt__CollectionsKt.m40441E());
    }

    /* renamed from: q */
    public static final void m94910q(C20288c1 c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "this$0");
        c1Var.f52363c.mo60955a("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt__CollectionsKt.m40441E());
    }

    /* renamed from: r */
    public static final void m94911r(C20288c1 c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "this$0");
        c1Var.f52363c.mo60955a("BEGIN DEFERRED TRANSACTION", CollectionsKt__CollectionsKt.m40441E());
    }

    /* renamed from: s */
    public static final void m94912s(C20288c1 c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "this$0");
        c1Var.f52363c.mo60955a("END TRANSACTION", CollectionsKt__CollectionsKt.m40441E());
    }

    /* renamed from: t */
    public static final void m94913t(C20288c1 c1Var, String str) {
        Intrinsics.checkNotNullParameter(c1Var, "this$0");
        Intrinsics.checkNotNullParameter(str, "$sql");
        c1Var.f52363c.mo60955a(str, CollectionsKt__CollectionsKt.m40441E());
    }

    /* renamed from: u */
    public static final void m94914u(C20288c1 c1Var, String str, List list) {
        Intrinsics.checkNotNullParameter(c1Var, "this$0");
        Intrinsics.checkNotNullParameter(str, "$sql");
        Intrinsics.checkNotNullParameter(list, "$inputArguments");
        c1Var.f52363c.mo60955a(str, list);
    }

    /* renamed from: v */
    public static final void m94915v(C20288c1 c1Var, String str) {
        Intrinsics.checkNotNullParameter(c1Var, "this$0");
        Intrinsics.checkNotNullParameter(str, "$query");
        c1Var.f52363c.mo60955a(str, CollectionsKt__CollectionsKt.m40441E());
    }

    /* renamed from: w */
    public static final void m94916w(C20288c1 c1Var, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(c1Var, "this$0");
        Intrinsics.checkNotNullParameter(str, "$query");
        Intrinsics.checkNotNullParameter(objArr, "$bindArgs");
        c1Var.f52363c.mo60955a(str, ArraysKt___ArraysKt.m39955kz(objArr));
    }

    /* renamed from: x */
    public static final void m94917x(C20288c1 c1Var, C20489i iVar, C20310f1 f1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "this$0");
        Intrinsics.checkNotNullParameter(iVar, "$query");
        Intrinsics.checkNotNullParameter(f1Var, "$queryInterceptorProgram");
        c1Var.f52363c.mo60955a(iVar.mo61233b(), f1Var.mo61065a());
    }

    /* renamed from: y */
    public static final void m94918y(C20288c1 c1Var, C20489i iVar, C20310f1 f1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "this$0");
        Intrinsics.checkNotNullParameter(iVar, "$query");
        Intrinsics.checkNotNullParameter(f1Var, "$queryInterceptorProgram");
        c1Var.f52363c.mo60955a(iVar.mo61233b(), f1Var.mo61065a());
    }

    /* renamed from: z */
    public static final void m94919z(C20288c1 c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "this$0");
        c1Var.f52363c.mo60955a("TRANSACTION SUCCESSFUL", CollectionsKt__CollectionsKt.m40441E());
    }

    /* renamed from: A3 */
    public boolean mo60748A3() {
        return this.f52361a.mo60748A3();
    }

    /* renamed from: C1 */
    public boolean mo60749C1(int i) {
        return this.f52361a.mo60749C1(i);
    }

    @C12579k
    /* renamed from: C2 */
    public C20492k mo60750C2(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "sql");
        return new C20337l1(this.f52361a.mo60750C2(str), str, this.f52362b, this.f52363c);
    }

    @C12579k
    /* renamed from: I1 */
    public Cursor mo60751I1(@C12579k C20489i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "query");
        C20310f1 f1Var = new C20310f1();
        iVar.mo61234c(f1Var);
        this.f52362b.execute(new C20408x0(this, iVar, f1Var));
        return this.f52361a.mo60751I1(iVar);
    }

    /* renamed from: K1 */
    public void mo60752K1(@C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f52361a.mo60752K1(locale);
    }

    @C0376v0(api = 16)
    /* renamed from: K3 */
    public boolean mo60753K3() {
        return this.f52361a.mo60753K3();
    }

    /* renamed from: L2 */
    public boolean mo60754L2() {
        return this.f52361a.mo60754L2();
    }

    /* renamed from: L3 */
    public void mo60755L3(int i) {
        this.f52361a.mo60755L3(i);
    }

    @C12579k
    /* renamed from: M0 */
    public Cursor mo60756M0(@C12579k C20489i iVar, @C12580l CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(iVar, "query");
        C20310f1 f1Var = new C20310f1();
        iVar.mo61234c(f1Var);
        this.f52362b.execute(new C20368t0(this, iVar, f1Var));
        return this.f52361a.mo60751I1(iVar);
    }

    /* renamed from: N3 */
    public void mo60757N3(long j) {
        this.f52361a.mo60757N3(j);
    }

    @C0376v0(api = 16)
    /* renamed from: P2 */
    public void mo60758P2(boolean z) {
        this.f52361a.mo60758P2(z);
    }

    /* renamed from: U2 */
    public long mo60759U2() {
        return this.f52361a.mo60759U2();
    }

    /* renamed from: V2 */
    public int mo60760V2(@C12579k String str, int i, @C12579k ContentValues contentValues, @C12580l String str2, @C12580l Object[] objArr) {
        Intrinsics.checkNotNullParameter(str, "table");
        Intrinsics.checkNotNullParameter(contentValues, C19456p0.f49833g);
        return this.f52361a.mo60760V2(str, i, contentValues, str2, objArr);
    }

    /* renamed from: a2 */
    public void mo61001a2(@C12579k String str, @C12580l @SuppressLint({"ArrayReturn"}) Object[] objArr) {
        Intrinsics.checkNotNullParameter(str, "sql");
        this.f52361a.mo61001a2(str, objArr);
    }

    public void close() {
        this.f52361a.close();
    }

    /* renamed from: d1 */
    public boolean mo60763d1() {
        return this.f52361a.mo60763d1();
    }

    /* renamed from: e1 */
    public void mo60764e1() {
        this.f52362b.execute(new C20399v0(this));
        this.f52361a.mo60764e1();
    }

    /* renamed from: e3 */
    public boolean mo60765e3() {
        return this.f52361a.mo60765e3();
    }

    /* renamed from: f1 */
    public void mo60766f1(@C12579k String str, @C12579k Object[] objArr) {
        Intrinsics.checkNotNullParameter(str, "sql");
        Intrinsics.checkNotNullParameter(objArr, "bindArgs");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C10976s.m41419k(objArr));
        this.f52362b.execute(new C20283b1(this, str, arrayList));
        this.f52361a.mo60766f1(str, new List[]{arrayList});
    }

    public long getPageSize() {
        return this.f52361a.getPageSize();
    }

    @C12580l
    public String getPath() {
        return this.f52361a.getPath();
    }

    public int getVersion() {
        return this.f52361a.getVersion();
    }

    /* renamed from: h1 */
    public void mo60770h1() {
        this.f52362b.execute(new C20358q0(this));
        this.f52361a.mo60770h1();
    }

    @C12579k
    /* renamed from: h3 */
    public Cursor mo60771h3(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "query");
        this.f52362b.execute(new C20421z0(this, str));
        return this.f52361a.mo60771h3(str);
    }

    /* renamed from: i0 */
    public int mo60772i0(@C12579k String str, @C12580l String str2, @C12580l Object[] objArr) {
        Intrinsics.checkNotNullParameter(str, "table");
        return this.f52361a.mo60772i0(str, str2, objArr);
    }

    /* renamed from: i1 */
    public long mo60773i1(long j) {
        return this.f52361a.mo60773i1(j);
    }

    public boolean isOpen() {
        return this.f52361a.isOpen();
    }

    /* renamed from: j0 */
    public void mo60775j0() {
        this.f52362b.execute(new C20414y0(this));
        this.f52361a.mo60775j0();
    }

    /* renamed from: j3 */
    public long mo60776j3(@C12579k String str, int i, @C12579k ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(str, "table");
        Intrinsics.checkNotNullParameter(contentValues, C19456p0.f49833g);
        return this.f52361a.mo60776j3(str, i, contentValues);
    }

    @C12580l
    /* renamed from: o0 */
    public List<Pair<String, String>> mo60777o0() {
        return this.f52361a.mo60777o0();
    }

    /* renamed from: p1 */
    public void mo60778p1(@C12579k SQLiteTransactionListener sQLiteTransactionListener) {
        Intrinsics.checkNotNullParameter(sQLiteTransactionListener, "transactionListener");
        this.f52362b.execute(new C20365s0(this));
        this.f52361a.mo60778p1(sQLiteTransactionListener);
    }

    /* renamed from: p2 */
    public boolean mo60779p2(long j) {
        return this.f52361a.mo60779p2(j);
    }

    @C0376v0(api = 16)
    /* renamed from: r0 */
    public void mo60780r0() {
        this.f52361a.mo60780r0();
    }

    /* renamed from: r1 */
    public boolean mo61003r1() {
        return this.f52361a.mo61003r1();
    }

    @C12579k
    /* renamed from: r2 */
    public Cursor mo60781r2(@C12579k String str, @C12579k Object[] objArr) {
        Intrinsics.checkNotNullParameter(str, "query");
        Intrinsics.checkNotNullParameter(objArr, "bindArgs");
        this.f52362b.execute(new C20371u0(this, str, objArr));
        return this.f52361a.mo60781r2(str, objArr);
    }

    /* renamed from: s0 */
    public void mo60782s0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "sql");
        this.f52362b.execute(new C20362r0(this, str));
        this.f52361a.mo60782s0(str);
    }

    /* renamed from: s1 */
    public boolean mo60783s1() {
        return this.f52361a.mo60783s1();
    }

    /* renamed from: t1 */
    public void mo60784t1() {
        this.f52362b.execute(new C20278a1(this));
        this.f52361a.mo60784t1();
    }

    /* renamed from: u2 */
    public void mo60785u2(int i) {
        this.f52361a.mo60785u2(i);
    }

    /* renamed from: v0 */
    public boolean mo60786v0() {
        return this.f52361a.mo60786v0();
    }

    /* renamed from: z3 */
    public void mo60787z3(@C12579k SQLiteTransactionListener sQLiteTransactionListener) {
        Intrinsics.checkNotNullParameter(sQLiteTransactionListener, "transactionListener");
        this.f52362b.execute(new C20405w0(this));
        this.f52361a.mo60787z3(sQLiteTransactionListener);
    }
}
