package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import com.urbanairship.iam.C9168d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.draw.l */
public final class C8754l {
    @C12579k
    /* renamed from: a */
    public static final C8767m m32555a(@C12579k C8767m mVar, @C12579k Painter painter, boolean z, @C12579k C8734c cVar, @C12579k C15541c cVar2, float f, @C12580l C15249k2 k2Var) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        Intrinsics.checkNotNullParameter(cVar2, "contentScale");
        return mVar.mo17224k3(new PainterModifierNodeElement(painter, z, cVar, cVar2, f, k2Var));
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m32556b(C8767m mVar, Painter painter, boolean z, C8734c cVar, C15541c cVar2, float f, C15249k2 k2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            cVar = C8734c.f23406a.mo17066i();
        }
        C8734c cVar3 = cVar;
        if ((i & 8) != 0) {
            cVar2 = C15541c.f38696a.mo44374k();
        }
        C15541c cVar4 = cVar2;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            k2Var = null;
        }
        return m32555a(mVar, painter, z2, cVar3, cVar4, f2, k2Var);
    }
}
