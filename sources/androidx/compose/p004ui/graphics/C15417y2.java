package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.graphics.colorspace.C15138c;
import androidx.compose.p004ui.graphics.colorspace.C15144g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.y2 */
public final class C15417y2 {
    @C12579k
    /* renamed from: a */
    public static final C15403w2 m67303a(int i, int i2, int i3, boolean z, @C12579k C15138c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "colorSpace");
        return C15247k0.m66137a(i, i2, i3, z, cVar);
    }

    /* renamed from: b */
    public static /* synthetic */ C15403w2 m67304b(int i, int i2, int i3, boolean z, C15138c cVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = C15410x2.f38097b.mo43577b();
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            cVar = C15144g.f37408a.mo42612x();
        }
        return m67303a(i, i2, i3, z, cVar);
    }

    @C12579k
    /* renamed from: c */
    public static final C15282o3 m67305c(@C12579k C15403w2 w2Var, int i, int i2, int i3, int i4, @C12579k int[] iArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(w2Var, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "buffer");
        w2Var.mo42785b(iArr, i, i2, i3, i4, i5, i6);
        return new C15282o3(iArr, i3, i4, i5, i6);
    }

    /* renamed from: d */
    public static /* synthetic */ C15282o3 m67306d(C15403w2 w2Var, int i, int i2, int i3, int i4, int[] iArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = 0;
        }
        if ((i7 & 2) != 0) {
            i2 = 0;
        }
        if ((i7 & 4) != 0) {
            i3 = w2Var.getWidth();
        }
        if ((i7 & 8) != 0) {
            i4 = w2Var.getHeight();
        }
        if ((i7 & 16) != 0) {
            iArr = new int[(i3 * i4)];
        }
        if ((i7 & 32) != 0) {
            i5 = 0;
        }
        if ((i7 & 64) != 0) {
            i6 = i3;
        }
        return m67305c(w2Var, i, i2, i3, i4, iArr, i5, i6);
    }
}
