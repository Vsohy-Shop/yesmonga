package androidx.compose.p004ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(28)
/* renamed from: androidx.compose.ui.text.android.a0 */
public final class C16054a0 {
    @C12579k

    /* renamed from: a */
    public static final C16054a0 f39946a = new C16054a0();

    @C0373u
    @C11384m
    /* renamed from: a */
    public static final void m72408a(@C12579k StaticLayout.Builder builder, boolean z) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        StaticLayout.Builder unused = builder.setUseLineSpacingFromFallbacks(z);
    }
}
