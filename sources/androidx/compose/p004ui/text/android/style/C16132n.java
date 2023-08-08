package androidx.compose.p004ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.style.n */
public final class C16132n extends CharacterStyle {

    /* renamed from: c */
    public static final int f40128c = 0;

    /* renamed from: a */
    public final boolean f40129a;

    /* renamed from: b */
    public final boolean f40130b;

    public C16132n(boolean z, boolean z2) {
        this.f40129a = z;
        this.f40130b = z2;
    }

    /* renamed from: a */
    public final boolean mo46584a() {
        return this.f40130b;
    }

    /* renamed from: b */
    public final boolean mo46585b() {
        return this.f40129a;
    }

    public void updateDrawState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f40129a);
        textPaint.setStrikeThruText(this.f40130b);
    }
}
