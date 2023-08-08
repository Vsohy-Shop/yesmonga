package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16497o;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.p004ui.window.C16546g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.selection.d */
public final class C2824d implements C16546g {
    @C12579k

    /* renamed from: a */
    public final HandleReferencePoint f7443a;

    /* renamed from: b */
    public final long f7444b;

    /* renamed from: androidx.compose.foundation.text.selection.d$a */
    public /* synthetic */ class C2825a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.selection.HandleReferencePoint[] r0 = androidx.compose.foundation.text.selection.HandleReferencePoint.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.selection.HandleReferencePoint r1 = androidx.compose.foundation.text.selection.HandleReferencePoint.TopLeft     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.selection.HandleReferencePoint r1 = androidx.compose.foundation.text.selection.HandleReferencePoint.TopRight     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.selection.HandleReferencePoint r1 = androidx.compose.foundation.text.selection.HandleReferencePoint.TopMiddle     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C2824d.C2825a.<clinit>():void");
        }
    }

    public /* synthetic */ C2824d(HandleReferencePoint handleReferencePoint, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(handleReferencePoint, j);
    }

    /* renamed from: a */
    public long mo9854a(@C12579k C16497o oVar, long j, @C12579k LayoutDirection layoutDirection, long j2) {
        Intrinsics.checkNotNullParameter(oVar, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i = C2825a.$EnumSwitchMapping$0[this.f7443a.ordinal()];
        if (i == 1) {
            return C16496n.m74593a(oVar.mo47886t() + C16494m.m74581m(this.f7444b), oVar.mo47858B() + C16494m.m74583o(this.f7444b));
        }
        if (i == 2) {
            return C16496n.m74593a((oVar.mo47886t() + C16494m.m74581m(this.f7444b)) - C16500q.m74662m(j2), oVar.mo47858B() + C16494m.m74583o(this.f7444b));
        }
        if (i == 3) {
            return C16496n.m74593a((oVar.mo47886t() + C16494m.m74581m(this.f7444b)) - (C16500q.m74662m(j2) / 2), oVar.mo47858B() + C16494m.m74583o(this.f7444b));
        }
        throw new NoWhenBranchMatchedException();
    }

    public C2824d(HandleReferencePoint handleReferencePoint, long j) {
        this.f7443a = handleReferencePoint;
        this.f7444b = j;
    }
}
