package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.foundation.layout.i0 */
public interface C2366i0 {

    @C8585m0
    @C11363r0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n*L\n218#1:437\n220#1:438\n222#1:439\n224#1:440\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.i0$a */
    public static final class C2367a implements C2366i0 {

        /* renamed from: e */
        public static final int f6277e = 0;

        /* renamed from: a */
        public final float f6278a;

        /* renamed from: b */
        public final float f6279b;

        /* renamed from: c */
        public final float f6280c;

        /* renamed from: d */
        public final float f6281d;

        public /* synthetic */ C2367a(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, f3, f4);
        }

        @C8547h2
        /* renamed from: e */
        public static /* synthetic */ void m10438e() {
        }

        @C8547h2
        /* renamed from: f */
        public static /* synthetic */ void m10439f() {
        }

        @C8547h2
        /* renamed from: g */
        public static /* synthetic */ void m10440g() {
        }

        @C8547h2
        /* renamed from: h */
        public static /* synthetic */ void m10441h() {
        }

        /* renamed from: a */
        public float mo8090a() {
            return this.f6281d;
        }

        /* renamed from: b */
        public float mo8091b(@C12579k LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            return this.f6278a;
        }

        /* renamed from: c */
        public float mo8092c(@C12579k LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            return this.f6280c;
        }

        /* renamed from: d */
        public float mo8093d() {
            return this.f6279b;
        }

        public boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C2367a)) {
                return false;
            }
            C2367a aVar = (C2367a) obj;
            if (!C16483g.m74440e0(this.f6278a, aVar.f6278a) || !C16483g.m74440e0(this.f6279b, aVar.f6279b) || !C16483g.m74440e0(this.f6280c, aVar.f6280c) || !C16483g.m74440e0(this.f6281d, aVar.f6281d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((C16483g.m74442h0(this.f6278a) * 31) + C16483g.m74442h0(this.f6279b)) * 31) + C16483g.m74442h0(this.f6280c)) * 31) + C16483g.m74442h0(this.f6281d);
        }

        @C12579k
        public String toString() {
            return "PaddingValues.Absolute(left=" + C16483g.m74447o0(this.f6278a) + ", top=" + C16483g.m74447o0(this.f6279b) + ", right=" + C16483g.m74447o0(this.f6280c) + ", bottom=" + C16483g.m74447o0(this.f6281d) + ')';
        }

        public C2367a(float f, float f2, float f3, float f4) {
            this.f6278a = f;
            this.f6279b = f2;
            this.f6280c = f3;
            this.f6281d = f4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2367a(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C16483g.m74435M((float) 0) : f, (i & 2) != 0 ? C16483g.m74435M((float) 0) : f2, (i & 4) != 0 ? C16483g.m74435M((float) 0) : f3, (i & 8) != 0 ? C16483g.m74435M((float) 0) : f4, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: a */
    float mo8090a();

    /* renamed from: b */
    float mo8091b(@C12579k LayoutDirection layoutDirection);

    /* renamed from: c */
    float mo8092c(@C12579k LayoutDirection layoutDirection);

    /* renamed from: d */
    float mo8093d();
}
