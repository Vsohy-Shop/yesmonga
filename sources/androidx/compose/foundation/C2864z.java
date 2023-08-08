package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.p004ui.unit.C16475a;
import androidx.compose.p004ui.unit.C16483g;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nEdgeEffectCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeEffectCompat.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,156:1\n1#2:157\n154#3:158\n*S KotlinDebug\n*F\n+ 1 EdgeEffectCompat.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n*L\n88#1:158\n*E\n"})
/* renamed from: androidx.compose.foundation.z */
public final class C2864z extends EdgeEffect {

    /* renamed from: a */
    public final float f7493a;

    /* renamed from: b */
    public float f7494b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2864z(@C12579k Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f7493a = C16475a.m74346a(context).mo7425g5(C16483g.m74435M((float) 1));
    }

    /* renamed from: a */
    public final void mo9940a(float f) {
        float f2 = this.f7494b + f;
        this.f7494b = f2;
        if (Math.abs(f2) > this.f7493a) {
            onRelease();
        }
    }

    public void onAbsorb(int i) {
        this.f7494b = 0.0f;
        super.onAbsorb(i);
    }

    public void onPull(float f, float f2) {
        this.f7494b = 0.0f;
        super.onPull(f, f2);
    }

    public void onRelease() {
        this.f7494b = 0.0f;
        super.onRelease();
    }

    public void onPull(float f) {
        this.f7494b = 0.0f;
        super.onPull(f);
    }
}
