package androidx.compose.p004ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(26)
/* renamed from: androidx.compose.ui.text.android.y */
public final class C16144y {
    @C12579k

    /* renamed from: a */
    public static final C16144y f40134a = new C16144y();

    @C0373u
    @C11384m
    /* renamed from: a */
    public static final void m72620a(@C12579k StaticLayout.Builder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        StaticLayout.Builder unused = builder.setJustificationMode(i);
    }
}
