package androidx.compose.p004ui.window;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16497o;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,102:1\n86#2:103\n86#2:104\n79#2:105\n86#2:106\n*S KotlinDebug\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n*L\n84#1:103\n87#1:104\n90#1:105\n97#1:106\n*E\n"})
/* renamed from: androidx.compose.ui.window.a */
public final class C16540a implements C16546g {
    @C12579k

    /* renamed from: a */
    public final C8734c f41027a;

    /* renamed from: b */
    public final long f41028b;

    public /* synthetic */ C16540a(C8734c cVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, j);
    }

    /* renamed from: a */
    public long mo9854a(@C12579k C16497o oVar, long j, @C12579k LayoutDirection layoutDirection, long j2) {
        int i;
        LayoutDirection layoutDirection2 = layoutDirection;
        C16497o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(oVar, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
        long a = C16496n.m74593a(0, 0);
        C8734c cVar = this.f41027a;
        C16500q.C16501a aVar = C16500q.f40900b;
        LayoutDirection layoutDirection3 = layoutDirection;
        long a2 = cVar.mo17059a(aVar.mo47897a(), C16502r.m74668a(oVar.mo47862G(), oVar.mo47885r()), layoutDirection3);
        long a3 = this.f41027a.mo17059a(aVar.mo47897a(), C16502r.m74668a(C16500q.m74662m(j2), C16500q.m74659j(j2)), layoutDirection3);
        long a4 = C16496n.m74593a(oVar.mo47886t(), oVar.mo47858B());
        long a5 = C16496n.m74593a(C16494m.m74581m(a) + C16494m.m74581m(a4), C16494m.m74583o(a) + C16494m.m74583o(a4));
        long a6 = C16496n.m74593a(C16494m.m74581m(a5) + C16494m.m74581m(a2), C16494m.m74583o(a5) + C16494m.m74583o(a2));
        long a7 = C16496n.m74593a(C16494m.m74581m(a3), C16494m.m74583o(a3));
        long a8 = C16496n.m74593a(C16494m.m74581m(a6) - C16494m.m74581m(a7), C16494m.m74583o(a6) - C16494m.m74583o(a7));
        int m = C16494m.m74581m(this.f41028b);
        if (layoutDirection2 == LayoutDirection.Ltr) {
            i = 1;
        } else {
            i = -1;
        }
        long a9 = C16496n.m74593a(m * i, C16494m.m74583o(this.f41028b));
        return C16496n.m74593a(C16494m.m74581m(a8) + C16494m.m74581m(a9), C16494m.m74583o(a8) + C16494m.m74583o(a9));
    }

    @C12579k
    /* renamed from: b */
    public final C8734c mo48072b() {
        return this.f41027a;
    }

    /* renamed from: c */
    public final long mo48073c() {
        return this.f41028b;
    }

    public C16540a(C8734c cVar, long j) {
        this.f41027a = cVar;
        this.f41028b = j;
    }
}
