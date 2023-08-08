package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.geometry.C15094f;
import org.jetbrains.annotations.C12579k;

@C8761g
/* renamed from: androidx.compose.ui.layout.y */
public interface C15617y extends C15588o {
    /* renamed from: i0 */
    static /* synthetic */ long m69455i0(C15617y yVar, C15617y yVar2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = C15094f.f37256b.mo42248e();
            }
            return yVar.mo44495j(yVar2, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-R5De75A");
    }

    /* renamed from: j */
    long mo44495j(@C12579k C15617y yVar, long j);
}
