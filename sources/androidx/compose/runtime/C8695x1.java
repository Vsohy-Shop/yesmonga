package androidx.compose.runtime;

import androidx.compose.runtime.tooling.C8680b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,3443:1\n146#2,8:3444\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3016#1:3444,8\n*E\n"})
/* renamed from: androidx.compose.runtime.x1 */
public final class C8695x1 implements C8680b, Iterable<C8680b>, C11345a {
    @C12579k

    /* renamed from: a */
    public final C8692w1 f23278a;

    /* renamed from: b */
    public final int f23279b;

    /* renamed from: c */
    public final int f23280c;

    public C8695x1(@C12579k C8692w1 w1Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(w1Var, "table");
        this.f23278a = w1Var;
        this.f23279b = i;
        this.f23280c = i2;
    }

    @C12579k
    /* renamed from: Q */
    public Object mo16761Q() {
        mo16873f0();
        C8689v1 F0 = this.f23278a.mo16836F0();
        try {
            return F0.mo16802a(this.f23279b);
        } finally {
            F0.mo16808e();
        }
    }

    /* renamed from: W */
    public int mo16762W() {
        int i;
        int w = this.f23279b + mo16767w();
        if (w < this.f23278a.mo16860r0()) {
            i = C8698y1.m32069L(this.f23278a.mo16859p0(), w);
        } else {
            i = this.f23278a.mo16847W();
        }
        return i - C8698y1.m32069L(this.f23278a.mo16859p0(), this.f23279b);
    }

    @C12579k
    /* renamed from: X */
    public final C8692w1 mo16871X() {
        return this.f23278a;
    }

    @C12580l
    /* renamed from: e */
    public C8680b mo16758e(@C12579k Object obj) {
        C8412c cVar;
        int X;
        int i;
        Intrinsics.checkNotNullParameter(obj, "identityToFind");
        if (obj instanceof C8412c) {
            cVar = (C8412c) obj;
        } else {
            cVar = null;
        }
        if (cVar == null || !this.f23278a.mo16838H0(cVar) || (X = this.f23278a.mo16848X(cVar)) < (i = this.f23279b) || X - i >= C8698y1.m32074Q(this.f23278a.mo16859p0(), this.f23279b)) {
            return null;
        }
        return new C8695x1(this.f23278a, X, this.f23280c);
    }

    /* renamed from: e0 */
    public final int mo16872e0() {
        return this.f23280c;
    }

    /* renamed from: f0 */
    public final void mo16873f0() {
        if (this.f23278a.mo16862t0() != this.f23280c) {
            throw new ConcurrentModificationException();
        }
    }

    @C12579k
    public Iterable<Object> getData() {
        return new C8699z(this.f23278a, this.f23279b);
    }

    @C12579k
    public Object getKey() {
        if (!C8698y1.m32079V(this.f23278a.mo16859p0(), this.f23279b)) {
            return Integer.valueOf(C8698y1.m32082Y(this.f23278a.mo16859p0(), this.f23279b));
        }
        Object obj = this.f23278a.mo16861s0()[C8698y1.m32097g0(this.f23278a.mo16859p0(), this.f23279b)];
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    @C12580l
    public String getSourceInfo() {
        if (!C8698y1.m32077T(this.f23278a.mo16859p0(), this.f23279b)) {
            return null;
        }
        Object obj = this.f23278a.mo16861s0()[C8698y1.m32065H(this.f23278a.mo16859p0(), this.f23279b)];
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @C12579k
    /* renamed from: h */
    public Iterable<C8680b> mo16759h() {
        return this;
    }

    /* renamed from: i */
    public final int mo16874i() {
        return this.f23279b;
    }

    public boolean isEmpty() {
        return C8698y1.m32074Q(this.f23278a.mo16859p0(), this.f23279b) == 0;
    }

    @C12579k
    public Iterator<C8680b> iterator() {
        mo16873f0();
        C8692w1 w1Var = this.f23278a;
        int i = this.f23279b;
        return new C8571j0(w1Var, i + 1, i + C8698y1.m32074Q(w1Var.mo16859p0(), this.f23279b));
    }

    @C12580l
    /* renamed from: q */
    public Object mo16766q() {
        if (C8698y1.m32081X(this.f23278a.mo16859p0(), this.f23279b)) {
            return this.f23278a.mo16861s0()[C8698y1.m32095f0(this.f23278a.mo16859p0(), this.f23279b)];
        }
        return null;
    }

    /* renamed from: w */
    public int mo16767w() {
        return C8698y1.m32074Q(this.f23278a.mo16859p0(), this.f23279b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8695x1(C8692w1 w1Var, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(w1Var, i, (i3 & 4) != 0 ? w1Var.mo16862t0() : i2);
    }
}
