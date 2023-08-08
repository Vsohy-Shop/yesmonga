package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.C20492k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.room.l1 */
public final class C20337l1 implements C20492k {
    @C12579k

    /* renamed from: a */
    public final C20492k f52506a;
    @C12579k

    /* renamed from: b */
    public final String f52507b;
    @C12579k

    /* renamed from: c */
    public final Executor f52508c;
    @C12579k

    /* renamed from: d */
    public final RoomDatabase.C20275f f52509d;
    @C12579k

    /* renamed from: e */
    public final List<Object> f52510e = new ArrayList();

    public C20337l1(@C12579k C20492k kVar, @C12579k String str, @C12579k Executor executor, @C12579k RoomDatabase.C20275f fVar) {
        Intrinsics.checkNotNullParameter(kVar, "delegate");
        Intrinsics.checkNotNullParameter(str, "sqlStatement");
        Intrinsics.checkNotNullParameter(executor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(fVar, "queryCallback");
        this.f52506a = kVar;
        this.f52507b = str;
        this.f52508c = executor;
        this.f52509d = fVar;
    }

    /* renamed from: g */
    public static final void m95057g(C20337l1 l1Var) {
        Intrinsics.checkNotNullParameter(l1Var, "this$0");
        l1Var.f52509d.mo60955a(l1Var.f52507b, l1Var.f52510e);
    }

    /* renamed from: i */
    public static final void m95058i(C20337l1 l1Var) {
        Intrinsics.checkNotNullParameter(l1Var, "this$0");
        l1Var.f52509d.mo60955a(l1Var.f52507b, l1Var.f52510e);
    }

    /* renamed from: j */
    public static final void m95059j(C20337l1 l1Var) {
        Intrinsics.checkNotNullParameter(l1Var, "this$0");
        l1Var.f52509d.mo60955a(l1Var.f52507b, l1Var.f52510e);
    }

    /* renamed from: l */
    public static final void m95060l(C20337l1 l1Var) {
        Intrinsics.checkNotNullParameter(l1Var, "this$0");
        l1Var.f52509d.mo60955a(l1Var.f52507b, l1Var.f52510e);
    }

    /* renamed from: m */
    public static final void m95061m(C20337l1 l1Var) {
        Intrinsics.checkNotNullParameter(l1Var, "this$0");
        l1Var.f52509d.mo60955a(l1Var.f52507b, l1Var.f52510e);
    }

    /* renamed from: G0 */
    public void mo60788G0(int i, double d) {
        mo61116k(i, Double.valueOf(d));
        this.f52506a.mo60788G0(i, d);
    }

    /* renamed from: O3 */
    public void mo60789O3() {
        this.f52510e.clear();
        this.f52506a.mo60789O3();
    }

    /* renamed from: S2 */
    public void mo60790S2(int i, long j) {
        mo61116k(i, Long.valueOf(j));
        this.f52506a.mo60790S2(i, j);
    }

    /* renamed from: a3 */
    public void mo60791a3(int i, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "value");
        mo61116k(i, bArr);
        this.f52506a.mo60791a3(i, bArr);
    }

    public void close() {
        this.f52506a.close();
    }

    public void execute() {
        this.f52508c.execute(new C20318h1(this));
        this.f52506a.execute();
    }

    /* renamed from: h2 */
    public long mo60797h2() {
        this.f52508c.execute(new C20322i1(this));
        return this.f52506a.mo60797h2();
    }

    /* renamed from: k */
    public final void mo61116k(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.f52510e.size()) {
            int size = (i2 - this.f52510e.size()) + 1;
            for (int i3 = 0; i3 < size; i3++) {
                this.f52510e.add((Object) null);
            }
        }
        this.f52510e.set(i2, obj);
    }

    @C12580l
    /* renamed from: m1 */
    public String mo60798m1() {
        this.f52508c.execute(new C20329j1(this));
        return this.f52506a.mo60798m1();
    }

    /* renamed from: q2 */
    public long mo60799q2() {
        this.f52508c.execute(new C20333k1(this));
        return this.f52506a.mo60799q2();
    }

    /* renamed from: u3 */
    public void mo60800u3(int i) {
        Object[] array = this.f52510e.toArray(new Object[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        mo61116k(i, Arrays.copyOf(array, array.length));
        this.f52506a.mo60800u3(i);
    }

    /* renamed from: v2 */
    public void mo60801v2(int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        mo61116k(i, str);
        this.f52506a.mo60801v2(i, str);
    }

    /* renamed from: y0 */
    public int mo60802y0() {
        this.f52508c.execute(new C20314g1(this));
        return this.f52506a.mo60802y0();
    }
}
