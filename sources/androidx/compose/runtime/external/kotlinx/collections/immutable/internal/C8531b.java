package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b */
public final class C8531b {

    /* renamed from: a */
    public int f22971a;

    public C8531b() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C8531b m30953c(C8531b bVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.f22971a;
        }
        return bVar.mo16114b(i);
    }

    /* renamed from: a */
    public final int mo16113a() {
        return this.f22971a;
    }

    @C12579k
    /* renamed from: b */
    public final C8531b mo16114b(int i) {
        return new C8531b(i);
    }

    /* renamed from: d */
    public final int mo16115d() {
        return this.f22971a;
    }

    /* renamed from: e */
    public final void mo16116e(int i) {
        this.f22971a += i;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8531b) && this.f22971a == ((C8531b) obj).f22971a;
    }

    /* renamed from: f */
    public final void mo16118f(int i) {
        this.f22971a = i;
    }

    public int hashCode() {
        return Integer.hashCode(this.f22971a);
    }

    @C12579k
    public String toString() {
        return "DeltaCounter(count=" + this.f22971a + ')';
    }

    public C8531b(int i) {
        this.f22971a = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8531b(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
