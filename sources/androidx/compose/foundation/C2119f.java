package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(31)
/* renamed from: androidx.compose.foundation.f */
public final class C2119f {
    @C12579k

    /* renamed from: a */
    public static final C2119f f5808a = new C2119f();

    @C12579k
    @C0373u
    /* renamed from: a */
    public final EdgeEffect mo7300a(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        try {
            C2115e.m9124a();
            return C2112d.m9122a(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    @C0373u
    /* renamed from: b */
    public final float mo7301b(@C12579k EdgeEffect edgeEffect) {
        Intrinsics.checkNotNullParameter(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    @C0373u
    /* renamed from: c */
    public final float mo7302c(@C12579k EdgeEffect edgeEffect, float f, float f2) {
        Intrinsics.checkNotNullParameter(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
