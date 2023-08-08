package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, mo22516d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "Landroidx/compose/ui/geometry/f;", "position", "Landroidx/compose/ui/geometry/i;", "bounds", "", "q", "(JLandroidx/compose/ui/geometry/i;)I", "start", "end", "", "r", "(Landroidx/compose/ui/geometry/i;JJ)Z", "<init>", "(Ljava/lang/String;I)V", "a", "b", "foundation_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum SelectionMode {
    ;

    @C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, mo22516d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode$Horizontal;", "Landroidx/compose/foundation/text/selection/SelectionMode;", "Landroidx/compose/ui/geometry/f;", "position", "Landroidx/compose/ui/geometry/i;", "bounds", "", "q", "(JLandroidx/compose/ui/geometry/i;)I", "foundation_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Horizontal extends SelectionMode {
        public Horizontal(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        /* renamed from: q */
        public int mo9693q(long j, @C12579k C15098i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "bounds");
            if (iVar.mo42267f(j)) {
                return 0;
            }
            if (C15094f.m64880p(j) < iVar.mo42279t()) {
                return -1;
            }
            if (C15094f.m64882r(j) >= iVar.mo42249B() || C15094f.m64880p(j) >= iVar.mo42283x()) {
                return 1;
            }
            return -1;
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, mo22516d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode$Vertical;", "Landroidx/compose/foundation/text/selection/SelectionMode;", "Landroidx/compose/ui/geometry/f;", "position", "Landroidx/compose/ui/geometry/i;", "bounds", "", "q", "(JLandroidx/compose/ui/geometry/i;)I", "foundation_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Vertical extends SelectionMode {
        public Vertical(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        /* renamed from: q */
        public int mo9693q(long j, @C12579k C15098i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "bounds");
            if (iVar.mo42267f(j)) {
                return 0;
            }
            if (C15094f.m64882r(j) < iVar.mo42249B()) {
                return -1;
            }
            if (C15094f.m64880p(j) >= iVar.mo42279t() || C15094f.m64882r(j) >= iVar.mo42271j()) {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: q */
    public abstract int mo9693q(long j, @C12579k C15098i iVar);

    /* renamed from: r */
    public final boolean mo9694r(@C12579k C15098i iVar, long j, long j2) {
        boolean z;
        Intrinsics.checkNotNullParameter(iVar, "bounds");
        boolean z2 = true;
        if (iVar.mo42267f(j) || iVar.mo42267f(j2)) {
            return true;
        }
        int q = mo9693q(j, iVar);
        int q2 = mo9693q(j2, iVar);
        if (q > 0) {
            z = true;
        } else {
            z = false;
        }
        if (q2 <= 0) {
            z2 = false;
        }
        return z ^ z2;
    }
}
