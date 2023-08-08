package androidx.compose.material3;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C8251n0
@C8585m0
/* renamed from: androidx.compose.material3.c2 */
public final class C8183c2 {

    /* renamed from: e */
    public static final int f20034e = 0;

    /* renamed from: a */
    public final long f20035a;

    /* renamed from: b */
    public final long f20036b;

    /* renamed from: c */
    public final long f20037c;

    /* renamed from: d */
    public final long f20038d;

    public /* synthetic */ C8183c2(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    /* renamed from: a */
    public final long mo12505a() {
        return this.f20038d;
    }

    /* renamed from: b */
    public final long mo12506b() {
        return this.f20035a;
    }

    /* renamed from: c */
    public final long mo12507c() {
        return this.f20036b;
    }

    /* renamed from: d */
    public final long mo12508d() {
        return this.f20037c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8183c2)) {
            return false;
        }
        C8183c2 c2Var = (C8183c2) obj;
        if (C15240j2.m66082y(this.f20035a, c2Var.f20035a) && C15240j2.m66082y(this.f20036b, c2Var.f20036b) && C15240j2.m66082y(this.f20037c, c2Var.f20037c) && C15240j2.m66082y(this.f20038d, c2Var.f20038d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((C15240j2.m66056K(this.f20035a) * 31) + C15240j2.m66056K(this.f20036b)) * 31) + C15240j2.m66056K(this.f20037c)) * 31) + C15240j2.m66056K(this.f20038d);
    }

    public C8183c2(long j, long j2, long j3, long j4) {
        this.f20035a = j;
        this.f20036b = j2;
        this.f20037c = j3;
        this.f20038d = j4;
    }
}
