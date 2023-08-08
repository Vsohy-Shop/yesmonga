package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C8585m0
@C8761g
/* renamed from: androidx.compose.ui.input.pointer.e */
public final class C15471e {

    /* renamed from: c */
    public static final int f38485c = 0;

    /* renamed from: a */
    public final long f38486a;

    /* renamed from: b */
    public final long f38487b;

    public /* synthetic */ C15471e(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: a */
    public final long mo44040a() {
        return this.f38487b;
    }

    /* renamed from: b */
    public final long mo44041b() {
        return this.f38486a;
    }

    @C12579k
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f38486a + ", position=" + C15094f.m64889y(this.f38487b) + ')';
    }

    public C15471e(long j, long j2) {
        this.f38486a = j;
        this.f38487b = j2;
    }
}
