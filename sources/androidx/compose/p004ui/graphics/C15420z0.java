package androidx.compose.p004ui.graphics;

import android.graphics.Canvas;
import androidx.compose.p004ui.graphics.C15302q4;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.z0 */
public final class C15420z0 {
    @C12579k
    /* renamed from: a */
    public static final Canvas.VertexMode m67309a(int i) {
        C15302q4.C15303a aVar = C15302q4.f37653b;
        if (C15302q4.m66463g(i, aVar.mo42982c())) {
            return Canvas.VertexMode.TRIANGLES;
        }
        if (C15302q4.m66463g(i, aVar.mo42981b())) {
            return Canvas.VertexMode.TRIANGLE_STRIP;
        }
        if (C15302q4.m66463g(i, aVar.mo42980a())) {
            return Canvas.VertexMode.TRIANGLE_FAN;
        }
        return Canvas.VertexMode.TRIANGLES;
    }
}
