package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.font.C16201h0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.font.r */
public final class C16234r {
    @C12579k
    /* renamed from: a */
    public static final C16238t m73141a(@C12579k String str, @C12579k C16209i0 i0Var, int i, @C12579k C16201h0.C16206e eVar) {
        Intrinsics.checkNotNullParameter(str, "familyName");
        Intrinsics.checkNotNullParameter(i0Var, "weight");
        Intrinsics.checkNotNullParameter(eVar, "variationSettings");
        return new C16232q(str, i0Var, i, eVar, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ C16238t m73142b(String str, C16209i0 i0Var, int i, C16201h0.C16206e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i0Var = C16209i0.f40292b.mo46952m();
        }
        if ((i2 & 4) != 0) {
            i = C16190e0.f40252b.mo46883b();
        }
        if ((i2 & 8) != 0) {
            eVar = new C16201h0.C16206e(new C16201h0.C16202a[0]);
        }
        return m73141a(str, i0Var, i, eVar);
    }
}
