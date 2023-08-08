package androidx.compose.p004ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.p */
public final class C16104p {

    /* renamed from: h */
    public static final int f40055h = 8;
    @C12579k

    /* renamed from: a */
    public final CharSequence f40056a;
    @C12579k

    /* renamed from: b */
    public final TextPaint f40057b;

    /* renamed from: c */
    public final int f40058c;

    /* renamed from: d */
    public float f40059d = Float.NaN;

    /* renamed from: e */
    public float f40060e = Float.NaN;
    @C12580l

    /* renamed from: f */
    public BoringLayout.Metrics f40061f;

    /* renamed from: g */
    public boolean f40062g;

    public C16104p(@C12579k CharSequence charSequence, @C12579k TextPaint textPaint, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        this.f40056a = charSequence;
        this.f40057b = textPaint;
        this.f40058c = i;
    }

    @C12580l
    /* renamed from: a */
    public final BoringLayout.Metrics mo46523a() {
        if (!this.f40062g) {
            this.f40061f = C16074g.f39963a.mo46351d(this.f40056a, this.f40057b, C16082i1.m72473i(this.f40058c));
            this.f40062g = true;
        }
        return this.f40061f;
    }

    /* renamed from: b */
    public final float mo46524b() {
        Float f;
        if (!Float.isNaN(this.f40059d)) {
            return this.f40059d;
        }
        BoringLayout.Metrics a = mo46523a();
        if (a != null) {
            f = Float.valueOf((float) a.width);
        } else {
            f = null;
        }
        if (f == null) {
            CharSequence charSequence = this.f40056a;
            f = Float.valueOf((float) Math.ceil((double) Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f40057b)));
        }
        if (C16108r.m72551e(f.floatValue(), this.f40056a, this.f40057b)) {
            f = Float.valueOf(f.floatValue() + 0.5f);
        }
        float floatValue = f.floatValue();
        this.f40059d = floatValue;
        return floatValue;
    }

    /* renamed from: c */
    public final float mo46525c() {
        if (!Float.isNaN(this.f40060e)) {
            return this.f40060e;
        }
        float c = C16108r.m72549c(this.f40056a, this.f40057b);
        this.f40060e = c;
        return c;
    }
}
