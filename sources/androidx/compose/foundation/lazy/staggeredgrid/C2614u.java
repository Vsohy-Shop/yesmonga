package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C2855v
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.u */
public interface C2614u {

    @C8567o(parameters = 0)
    @C11363r0({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,121:1\n154#2:122\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n*L\n89#1:122\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.u$a */
    public static final class C2615a implements C2614u {

        /* renamed from: b */
        public static final int f6932b = 0;

        /* renamed from: a */
        public final float f6933a;

        public /* synthetic */ C2615a(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        @C12579k
        /* renamed from: a */
        public List<Integer> mo9019a(@C12579k C16479d dVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            return C2594c.m11751b(i, Math.max((i + i2) / (dVar.mo7429n2(this.f6933a) + i2), 1), i2);
        }

        public boolean equals(@C12580l Object obj) {
            return (obj instanceof C2615a) && C16483g.m74440e0(this.f6933a, ((C2615a) obj).f6933a);
        }

        public int hashCode() {
            return C16483g.m74442h0(this.f6933a);
        }

        public C2615a(float f) {
            this.f6933a = f;
            if (!(C16483g.m74452z(f, C16483g.m74435M((float) 0)) > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.u$b */
    public static final class C2616b implements C2614u {

        /* renamed from: b */
        public static final int f6934b = 0;

        /* renamed from: a */
        public final int f6935a;

        public C2616b(int i) {
            boolean z;
            this.f6935a = i;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        @C12579k
        /* renamed from: a */
        public List<Integer> mo9019a(@C12579k C16479d dVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            return C2594c.m11751b(i, this.f6935a, i2);
        }

        public boolean equals(@C12580l Object obj) {
            return (obj instanceof C2616b) && this.f6935a == ((C2616b) obj).f6935a;
        }

        public int hashCode() {
            return -this.f6935a;
        }
    }

    @C12579k
    /* renamed from: a */
    List<Integer> mo9019a(@C12579k C16479d dVar, int i, int i2);
}
