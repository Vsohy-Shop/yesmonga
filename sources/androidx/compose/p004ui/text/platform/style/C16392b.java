package androidx.compose.p004ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15127c4;
import androidx.compose.p004ui.text.platform.C16384m;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,57:1\n159#2:58\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n41#1:58\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.style.b */
public final class C16392b extends CharacterStyle implements UpdateAppearance {
    @C12579k

    /* renamed from: a */
    public final C15127c4 f40645a;

    /* renamed from: b */
    public final float f40646b;

    /* renamed from: c */
    public long f40647c = C15104m.f37280b.mo42316a();
    @C12580l

    /* renamed from: d */
    public Pair<C15104m, ? extends Shader> f40648d;

    public C16392b(@C12579k C15127c4 c4Var, float f) {
        Intrinsics.checkNotNullParameter(c4Var, "shaderBrush");
        this.f40645a = c4Var;
        this.f40646b = f;
    }

    /* renamed from: a */
    public final float mo47564a() {
        return this.f40646b;
    }

    @C12579k
    /* renamed from: b */
    public final C15127c4 mo47565b() {
        return this.f40645a;
    }

    /* renamed from: c */
    public final long mo47566c() {
        return this.f40647c;
    }

    /* renamed from: d */
    public final void mo47567d(long j) {
        this.f40647c = j;
    }

    public void updateDrawState(@C12579k TextPaint textPaint) {
        boolean z;
        Shader shader;
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        C16384m.m73954a(textPaint, this.f40646b);
        if (this.f40647c == C15104m.f37280b.mo42316a()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Pair<C15104m, ? extends Shader> pair = this.f40648d;
            if (pair == null || !C15104m.m65014k(pair.mo21849e().mo42315y(), this.f40647c)) {
                shader = this.f40645a.mo42412c(this.f40647c);
            } else {
                shader = (Shader) pair.mo21851f();
            }
            textPaint.setShader(shader);
            this.f40648d = C11078d1.m42659a(C15104m.m65006c(this.f40647c), shader);
        }
    }
}
