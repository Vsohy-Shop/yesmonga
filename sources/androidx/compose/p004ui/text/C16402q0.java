package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.style.C16436k;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.q0 */
public final class C16402q0 {

    /* renamed from: androidx.compose.ui.text.q0$a */
    public /* synthetic */ class C16403a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.p004ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p004ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p004ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.C16402q0.C16403a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public static final C16051a0 m73987b(C16459y yVar, C16457x xVar) {
        if (yVar == null && xVar == null) {
            return null;
        }
        return C16150c.m72640a(yVar, xVar);
    }

    @C12579k
    /* renamed from: c */
    public static final C16361p0 m73988c(@C12579k C16361p0 p0Var, @C12579k C16361p0 p0Var2, float f) {
        Intrinsics.checkNotNullParameter(p0Var, "start");
        Intrinsics.checkNotNullParameter(p0Var2, "stop");
        return new C16361p0(SpanStyleKt.m72351b(p0Var.mo47499b0(), p0Var2.mo47499b0(), f), C16453u.m74299a(p0Var.mo47497a0(), p0Var2.mo47497a0(), f));
    }

    @C12579k
    /* renamed from: d */
    public static final C16361p0 m73989d(@C12579k C16361p0 p0Var, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(layoutDirection, "direction");
        return new C16361p0(SpanStyleKt.m72355f(p0Var.mo47482J()), C16453u.m74301c(p0Var.mo47479G(), layoutDirection), p0Var.mo47480H());
    }

    /* renamed from: e */
    public static final int m73990e(@C12579k LayoutDirection layoutDirection, @C12580l C16436k kVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        C16436k.C16437a aVar = C16436k.f40732b;
        int a = aVar.mo47688a();
        if (kVar == null) {
            z = false;
        } else {
            z = C16436k.m74207i(kVar.mo47686l(), a);
        }
        if (z) {
            int i = C16403a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i == 1) {
                return aVar.mo47689b();
            }
            if (i == 2) {
                return aVar.mo47690c();
            }
            throw new NoWhenBranchMatchedException();
        } else if (kVar != null) {
            return kVar.mo47686l();
        } else {
            int i2 = C16403a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                return aVar.mo47691d();
            }
            if (i2 == 2) {
                return aVar.mo47692e();
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
