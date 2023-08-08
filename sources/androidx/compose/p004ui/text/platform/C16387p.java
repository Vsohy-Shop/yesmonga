package androidx.compose.p004ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.platform.p */
public final class C16387p implements C16385n {
    @C12579k

    /* renamed from: a */
    public final Typeface f40641a;
    @C12580l

    /* renamed from: b */
    public final C16242u f40642b;

    public C16387p(@C12579k Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f40641a = typeface;
    }

    @C12580l
    /* renamed from: a */
    public C16242u mo47020a() {
        return this.f40642b;
    }

    @C12579k
    /* renamed from: b */
    public Typeface mo47534b(@C12579k C16209i0 i0Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        return this.f40641a;
    }

    @C12579k
    /* renamed from: c */
    public final Typeface mo47558c() {
        return this.f40641a;
    }
}
