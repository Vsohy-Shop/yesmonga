package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/DataIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3443:1\n1#2:3444\n*E\n"})
/* renamed from: androidx.compose.runtime.z */
public final class C8699z implements Iterable<Object>, Iterator<Object>, C11345a {
    @C12579k

    /* renamed from: a */
    public final C8692w1 f23307a;

    /* renamed from: b */
    public final int f23308b;

    /* renamed from: c */
    public final int f23309c;

    /* renamed from: d */
    public final int f23310d;

    /* renamed from: e */
    public int f23311e;

    public C8699z(@C12579k C8692w1 w1Var, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(w1Var, "table");
        this.f23307a = w1Var;
        this.f23308b = i;
        int f = C8698y1.m32069L(w1Var.mo16859p0(), i);
        this.f23309c = f;
        if (i + 1 < w1Var.mo16860r0()) {
            i2 = C8698y1.m32069L(w1Var.mo16859p0(), i + 1);
        } else {
            i2 = w1Var.mo16847W();
        }
        this.f23310d = i2;
        this.f23311e = f;
    }

    /* renamed from: e */
    public final int mo16883e() {
        return this.f23310d;
    }

    /* renamed from: h */
    public final int mo16884h() {
        return this.f23308b;
    }

    public boolean hasNext() {
        return this.f23311e < this.f23310d;
    }

    @C12579k
    public Iterator<Object> iterator() {
        return this;
    }

    @C12580l
    public Object next() {
        Object obj;
        int i = this.f23311e;
        if (i < 0 || i >= this.f23307a.mo16861s0().length) {
            obj = null;
        } else {
            obj = this.f23307a.mo16861s0()[this.f23311e];
        }
        this.f23311e++;
        return obj;
    }

    /* renamed from: q */
    public final int mo16888q() {
        return this.f23311e;
    }

    /* renamed from: r */
    public final int mo16889r() {
        return this.f23309c;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    /* renamed from: w */
    public final C8692w1 mo16891w() {
        return this.f23307a;
    }

    /* renamed from: y */
    public final void mo16892y(int i) {
        this.f23311e = i;
    }
}
