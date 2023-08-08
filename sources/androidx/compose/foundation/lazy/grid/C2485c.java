package androidx.compose.foundation.lazy.grid;

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
/* renamed from: androidx.compose.foundation.lazy.grid.c */
public interface C2485c {

    @C8567o(parameters = 0)
    @C11363r0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,493:1\n154#2:494\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n*L\n272#1:494\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.grid.c$a */
    public static final class C2486a implements C2485c {

        /* renamed from: b */
        public static final int f6586b = 0;

        /* renamed from: a */
        public final float f6587a;

        public /* synthetic */ C2486a(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        @C12579k
        /* renamed from: a */
        public List<Integer> mo8556a(@C12579k C16479d dVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            return LazyGridDslKt.m10977d(i, Math.max((i + i2) / (dVar.mo7429n2(this.f6587a) + i2), 1), i2);
        }

        public boolean equals(@C12580l Object obj) {
            return (obj instanceof C2486a) && C16483g.m74440e0(this.f6587a, ((C2486a) obj).f6587a);
        }

        public int hashCode() {
            return C16483g.m74442h0(this.f6587a);
        }

        public C2486a(float f) {
            this.f6587a = f;
            if (!(C16483g.m74452z(f, C16483g.m74435M((float) 0)) > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.lazy.grid.c$b */
    public static final class C2487b implements C2485c {

        /* renamed from: b */
        public static final int f6588b = 0;

        /* renamed from: a */
        public final int f6589a;

        public C2487b(int i) {
            boolean z;
            this.f6589a = i;
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
        public List<Integer> mo8556a(@C12579k C16479d dVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            return LazyGridDslKt.m10977d(i, this.f6589a, i2);
        }

        public boolean equals(@C12580l Object obj) {
            return (obj instanceof C2487b) && this.f6589a == ((C2487b) obj).f6589a;
        }

        public int hashCode() {
            return -this.f6589a;
        }
    }

    @C12579k
    /* renamed from: a */
    List<Integer> mo8556a(@C12579k C16479d dVar, int i, int i2);
}
