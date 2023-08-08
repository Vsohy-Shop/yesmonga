package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,97:1\n154#2:98\n*S KotlinDebug\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n*L\n61#1:98\n*E\n"})
/* renamed from: androidx.compose.foundation.l */
public final class C2254l {

    /* renamed from: a */
    public static final float f6007a = C16483g.m74435M((float) 30);
    @C12579k

    /* renamed from: b */
    public static final C8767m f6008b;
    @C12579k

    /* renamed from: c */
    public static final C8767m f6009c;

    @C11363r0({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt$HorizontalScrollableClipModifier$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
    /* renamed from: androidx.compose.foundation.l$a */
    public static final class C2255a implements C15218g4 {
        @C12579k
        /* renamed from: a */
        public C15174d3 mo7615a(long j, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(dVar, "density");
            float n2 = (float) dVar.mo7429n2(C2254l.m9704b());
            return new C15174d3.C15176b(new C15098i(0.0f, -n2, C15104m.m65023t(j), C15104m.m65016m(j) + n2));
        }
    }

    @C11363r0({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt$VerticalScrollableClipModifier$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
    /* renamed from: androidx.compose.foundation.l$b */
    public static final class C2256b implements C15218g4 {
        @C12579k
        /* renamed from: a */
        public C15174d3 mo7615a(long j, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(dVar, "density");
            float n2 = (float) dVar.mo7429n2(C2254l.m9704b());
            return new C15174d3.C15176b(new C15098i(-n2, 0.0f, C15104m.m65023t(j) + n2, C15104m.m65016m(j)));
        }
    }

    static {
        C8767m.C8768a aVar = C8767m.f23478j;
        f6008b = C8744d.m32514a(aVar, new C2255a());
        f6009c = C8744d.m32514a(aVar, new C2256b());
    }

    @C12579k
    /* renamed from: a */
    public static final C8767m m9703a(@C12579k C8767m mVar, @C12579k Orientation orientation) {
        C8767m mVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            mVar2 = f6009c;
        } else {
            mVar2 = f6008b;
        }
        return mVar.mo17224k3(mVar2);
    }

    /* renamed from: b */
    public static final float m9704b() {
        return f6007a;
    }
}
