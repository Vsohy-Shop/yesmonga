package androidx.compose.foundation.shape;

import androidx.compose.p004ui.platform.C15977u0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCornerSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerSize.kt\nandroidx/compose/foundation/shape/DpCornerSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* renamed from: androidx.compose.foundation.shape.j */
public final class C2689j implements C2684f, C15977u0 {

    /* renamed from: a */
    public final float f7051a;

    public /* synthetic */ C2689j(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: f */
    public static /* synthetic */ C2689j m12137f(C2689j jVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = jVar.f7051a;
        }
        return jVar.mo9182d(f);
    }

    /* renamed from: a */
    public float mo9173a(long j, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return dVar.mo7425g5(this.f7051a);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo9174b() {
        return C16483g.m74451w(mo9184h());
    }

    /* renamed from: c */
    public final float mo9181c() {
        return this.f7051a;
    }

    @C12579k
    /* renamed from: d */
    public final C2689j mo9182d(float f) {
        return new C2689j(f, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2689j) && C16483g.m74440e0(this.f7051a, ((C2689j) obj).f7051a);
    }

    /* renamed from: h */
    public float mo9184h() {
        return this.f7051a;
    }

    public int hashCode() {
        return C16483g.m74442h0(this.f7051a);
    }

    @C12579k
    public String toString() {
        return "CornerSize(size = " + this.f7051a + ".dp)";
    }

    public C2689j(float f) {
        this.f7051a = f;
    }
}
