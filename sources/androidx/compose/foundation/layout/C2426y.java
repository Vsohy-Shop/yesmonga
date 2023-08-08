package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8547h2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.layout.y */
public final class C2426y {

    /* renamed from: androidx.compose.foundation.layout.y$a */
    public /* synthetic */ class C2427a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.layout.IntrinsicSize[] r0 = androidx.compose.foundation.layout.IntrinsicSize.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.layout.IntrinsicSize r1 = androidx.compose.foundation.layout.IntrinsicSize.Min     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.layout.IntrinsicSize r1 = androidx.compose.foundation.layout.IntrinsicSize.Max     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C2426y.C2427a.<clinit>():void");
        }
    }

    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m10722a(@C12579k C8767m mVar, @C12579k IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i = C2427a.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i == 1) {
            return mVar.mo17224k3(C2353e0.f6261a);
        }
        if (i == 2) {
            return mVar.mo17224k3(C2344c0.f6247a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public static final C8767m m10723b(@C12579k C8767m mVar, @C12579k IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i = C2427a.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i == 1) {
            return mVar.mo17224k3(C2397p0.f6310a);
        }
        if (i == 2) {
            return mVar.mo17224k3(C2391n0.f6304a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @C8547h2
    @C12579k
    /* renamed from: c */
    public static final C8767m m10724c(@C12579k C8767m mVar, @C12579k IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i = C2427a.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i == 1) {
            return mVar.mo17224k3(C2400q0.f6316a);
        }
        if (i == 2) {
            return mVar.mo17224k3(C2394o0.f6308a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @C8547h2
    @C12579k
    /* renamed from: d */
    public static final C8767m m10725d(@C12579k C8767m mVar, @C12579k IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i = C2427a.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i == 1) {
            return mVar.mo17224k3(C2357f0.f6268a);
        }
        if (i == 2) {
            return mVar.mo17224k3(C2349d0.f6254a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
