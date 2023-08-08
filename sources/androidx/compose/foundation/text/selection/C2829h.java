package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.text.C16156d;
import kotlin.Pair;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.text.selection.h */
public interface C2829h {
    /* renamed from: d */
    static /* synthetic */ Pair m13054d(C2829h hVar, long j, long j2, C15094f fVar, boolean z, C15588o oVar, SelectionAdjustment selectionAdjustment, C2830i iVar, int i, Object obj) {
        if (obj == null) {
            return hVar.mo9864k(j, j2, fVar, (i & 8) != 0 ? true : z, oVar, selectionAdjustment, (i & 64) != 0 ? null : iVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelection-qCDeeow");
    }

    @C12579k
    /* renamed from: a */
    C16156d mo9855a();

    @C12579k
    /* renamed from: c */
    C15098i mo9857c(int i);

    @C12580l
    /* renamed from: e */
    C15588o mo9858e();

    /* renamed from: f */
    long mo9859f(@C12579k C2830i iVar, boolean z);

    /* renamed from: g */
    int mo9860g();

    /* renamed from: h */
    long mo9861h();

    @C12580l
    /* renamed from: i */
    C2830i mo9862i();

    /* renamed from: j */
    long mo9863j(int i);

    @C12579k
    /* renamed from: k */
    Pair<C2830i, Boolean> mo9864k(long j, long j2, @C12580l C15094f fVar, boolean z, @C12579k C15588o oVar, @C12579k SelectionAdjustment selectionAdjustment, @C12580l C2830i iVar);
}
