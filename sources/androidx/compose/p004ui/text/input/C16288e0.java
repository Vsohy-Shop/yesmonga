package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.C11626x;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.e0 */
public final class C16288e0 implements C16275a1 {

    /* renamed from: c */
    public static final int f40480c = 0;

    /* renamed from: b */
    public final char f40481b;

    public C16288e0() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: a */
    public C16334z0 mo12556a(@C12579k C16156d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "text");
        return new C16334z0(new C16156d(C11622t.repeat(String.valueOf(this.f40481b), dVar.mo46683j().length()), (List) null, (List) null, 6, (DefaultConstructorMarker) null), C16281c0.f40467a.mo47176a());
    }

    /* renamed from: b */
    public final char mo47186b() {
        return this.f40481b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C16288e0) && this.f40481b == ((C16288e0) obj).f40481b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Character.hashCode(this.f40481b);
    }

    public C16288e0(char c) {
        this.f40481b = c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16288e0(char c, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C11626x.f28898E : c);
    }
}
