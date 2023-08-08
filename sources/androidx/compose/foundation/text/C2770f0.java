package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.input.C16281c0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.f0 */
public final class C2770f0 implements C16281c0 {
    @C12579k

    /* renamed from: b */
    public final C16281c0 f7277b;

    /* renamed from: c */
    public final int f7278c;

    /* renamed from: d */
    public final int f7279d;

    public C2770f0(@C12579k C16281c0 c0Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(c0Var, "delegate");
        this.f7277b = c0Var;
        this.f7278c = i;
        this.f7279d = i2;
    }

    /* renamed from: a */
    public int mo9513a(int i) {
        int a = this.f7277b.mo9513a(i);
        boolean z = false;
        if (a >= 0 && a <= this.f7278c) {
            z = true;
        }
        if (z) {
            return a;
        }
        throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i + " -> " + a + " is not in range of original text [0, " + this.f7278c + C12361b.f30261l).toString());
    }

    /* renamed from: b */
    public int mo9514b(int i) {
        int b = this.f7277b.mo9514b(i);
        boolean z = false;
        if (b >= 0 && b <= this.f7279d) {
            z = true;
        }
        if (z) {
            return b;
        }
        throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i + " -> " + b + " is not in range of transformed text [0, " + this.f7279d + C12361b.f30261l).toString());
    }
}
