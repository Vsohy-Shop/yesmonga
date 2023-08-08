package androidx.compose.p004ui.platform;

import android.graphics.Rect;
import androidx.compose.p004ui.semantics.SemanticsNode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.platform.u3 */
public final class C15981u3 {
    @C12579k

    /* renamed from: a */
    public final SemanticsNode f39678a;
    @C12579k

    /* renamed from: b */
    public final Rect f39679b;

    public C15981u3(@C12579k SemanticsNode semanticsNode, @C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
        Intrinsics.checkNotNullParameter(rect, "adjustedBounds");
        this.f39678a = semanticsNode;
        this.f39679b = rect;
    }

    @C12579k
    /* renamed from: a */
    public final Rect mo45968a() {
        return this.f39679b;
    }

    @C12579k
    /* renamed from: b */
    public final SemanticsNode mo45969b() {
        return this.f39678a;
    }
}
