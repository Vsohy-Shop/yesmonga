package androidx.compose.material3;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C8585m0
/* renamed from: androidx.compose.material3.g2 */
public final class C8205g2 {

    /* renamed from: d */
    public static final int f20142d = 0;

    /* renamed from: a */
    public final long f20143a;

    /* renamed from: b */
    public final long f20144b;
    @C12579k

    /* renamed from: c */
    public final C8189d3 f20145c;

    public /* synthetic */ C8205g2(long j, long j2, C8189d3 d3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, d3Var);
    }

    /* renamed from: a */
    public final long mo12612a() {
        return this.f20143a;
    }

    /* renamed from: b */
    public final long mo12613b() {
        return this.f20144b;
    }

    @C12579k
    /* renamed from: c */
    public final C8189d3 mo12614c() {
        return this.f20145c;
    }

    public boolean equals(@C12580l Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<C8205g2> cls2 = C8205g2.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual((Object) cls2, (Object) cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.material3.SearchBarColors");
        C8205g2 g2Var = (C8205g2) obj;
        if (C15240j2.m66082y(this.f20143a, g2Var.f20143a) && C15240j2.m66082y(this.f20144b, g2Var.f20144b) && Intrinsics.areEqual((Object) this.f20145c, (Object) g2Var.f20145c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((C15240j2.m66056K(this.f20143a) * 31) + C15240j2.m66056K(this.f20144b)) * 31) + this.f20145c.hashCode();
    }

    public C8205g2(long j, long j2, C8189d3 d3Var) {
        Intrinsics.checkNotNullParameter(d3Var, "inputFieldColors");
        this.f20143a = j;
        this.f20144b = j2;
        this.f20145c = d3Var;
    }
}
