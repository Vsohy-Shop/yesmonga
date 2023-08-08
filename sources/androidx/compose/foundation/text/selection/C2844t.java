package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.foundation.text.selection.t */
public final class C2844t {

    /* renamed from: c */
    public static final int f7469c = 0;

    /* renamed from: a */
    public final long f7470a;

    /* renamed from: b */
    public final long f7471b;

    public /* synthetic */ C2844t(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: a */
    public final long mo9906a() {
        return this.f7471b;
    }

    /* renamed from: b */
    public final long mo9907b() {
        return this.f7470a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2844t)) {
            return false;
        }
        C2844t tVar = (C2844t) obj;
        if (C15240j2.m66082y(this.f7470a, tVar.f7470a) && C15240j2.m66082y(this.f7471b, tVar.f7471b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C15240j2.m66056K(this.f7470a) * 31) + C15240j2.m66056K(this.f7471b);
    }

    @C12579k
    public String toString() {
        return "SelectionColors(selectionHandleColor=" + C15240j2.m66057L(this.f7470a) + ", selectionBackgroundColor=" + C15240j2.m66057L(this.f7471b) + ')';
    }

    public C2844t(long j, long j2) {
        this.f7470a = j;
        this.f7471b = j2;
    }
}
