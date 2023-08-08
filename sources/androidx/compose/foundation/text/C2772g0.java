package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.C16334z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.g0 */
public final class C2772g0 {
    @C12579k

    /* renamed from: a */
    public static final C16281c0 f7280a = new C2770f0(C16281c0.f40467a.mo47176a(), 0, 0);

    @C12579k
    /* renamed from: a */
    public static final C16334z0 m12578a(@C12579k C16275a1 a1Var, @C12579k C16156d dVar) {
        Intrinsics.checkNotNullParameter(a1Var, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "text");
        C16334z0 a = a1Var.mo12556a(dVar);
        return new C16334z0(a.mo47343b(), new C2770f0(a.mo47342a(), dVar.length(), a.mo47343b().length()));
    }

    @C12579k
    /* renamed from: b */
    public static final C16281c0 m12579b() {
        return f7280a;
    }
}
