package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.q */
public final class C2658q {
    @C12579k

    /* renamed from: a */
    public static final C2658q f7030a = new C2658q();

    @C12579k
    /* renamed from: a */
    public final EdgeEffect mo9119a(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (Build.VERSION.SDK_INT >= 31) {
            return C2119f.f5808a.mo7300a(context, attributeSet);
        }
        return new C2864z(context);
    }

    /* renamed from: b */
    public final float mo9120b(@C12579k EdgeEffect edgeEffect) {
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C2119f.f5808a.mo7301b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final void mo9121c(@C12579k EdgeEffect edgeEffect, int i) {
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    /* renamed from: d */
    public final float mo9122d(@C12579k EdgeEffect edgeEffect, float f, float f2) {
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C2119f.f5808a.mo7302c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* renamed from: e */
    public final void mo9123e(@C12579k EdgeEffect edgeEffect, float f) {
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (edgeEffect instanceof C2864z) {
            ((C2864z) edgeEffect).mo9940a(f);
        } else {
            edgeEffect.onRelease();
        }
    }
}
