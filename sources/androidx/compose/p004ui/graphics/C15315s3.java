package androidx.compose.p004ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.unit.C16497o;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.s3 */
public final class C15315s3 {
    @C11395k(message = "Converting Rect to android.graphics.Rect is lossy, and requires rounding. The behavior of toAndroidRect() truncates to an integral Rect, but you should choose the method of rounding most suitable for your use case.", replaceWith = @C11587t0(expression = "android.graphics.Rect(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())", imports = {}))
    @C12579k
    /* renamed from: a */
    public static final Rect m66543a(@C12579k C15098i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new Rect((int) iVar.mo42279t(), (int) iVar.mo42249B(), (int) iVar.mo42283x(), (int) iVar.mo42271j());
    }

    @C12579k
    /* renamed from: b */
    public static final Rect m66544b(@C12579k C16497o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return new Rect(oVar.mo47886t(), oVar.mo47858B(), oVar.mo47890x(), oVar.mo47878j());
    }

    @C12579k
    /* renamed from: c */
    public static final RectF m66545c(@C12579k C15098i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new RectF(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42283x(), iVar.mo42271j());
    }

    @C12579k
    /* renamed from: d */
    public static final C16497o m66546d(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new C16497o(rect.left, rect.top, rect.right, rect.bottom);
    }

    @C12579k
    /* renamed from: e */
    public static final C15098i m66547e(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new C15098i((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }
}
