package androidx.compose.p004ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.style.l */
public final class C16130l extends CharacterStyle {

    /* renamed from: e */
    public static final int f40121e = 0;

    /* renamed from: a */
    public final int f40122a;

    /* renamed from: b */
    public final float f40123b;

    /* renamed from: c */
    public final float f40124c;

    /* renamed from: d */
    public final float f40125d;

    public C16130l(int i, float f, float f2, float f3) {
        this.f40122a = i;
        this.f40123b = f;
        this.f40124c = f2;
        this.f40125d = f3;
    }

    /* renamed from: a */
    public final int mo46576a() {
        return this.f40122a;
    }

    /* renamed from: b */
    public final float mo46577b() {
        return this.f40123b;
    }

    /* renamed from: c */
    public final float mo46578c() {
        return this.f40124c;
    }

    /* renamed from: d */
    public final float mo46579d() {
        return this.f40125d;
    }

    public void updateDrawState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "tp");
        textPaint.setShadowLayer(this.f40125d, this.f40123b, this.f40124c, this.f40122a);
    }
}
