package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.t3 */
public final class C15321t3 {
    @C12579k

    /* renamed from: a */
    public static final C15218g4 f37701a = new C15322a();

    /* renamed from: androidx.compose.ui.graphics.t3$a */
    public static final class C15322a implements C15218g4 {
        @C12579k
        /* renamed from: b */
        public C15174d3.C15176b mo7615a(long j, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(dVar, "density");
            return new C15174d3.C15176b(C15106n.m65045m(j));
        }

        @C12579k
        public String toString() {
            return "RectangleShape";
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C15218g4 m66567a() {
        return f37701a;
    }

    @C8547h2
    /* renamed from: b */
    public static /* synthetic */ void m66568b() {
    }
}
