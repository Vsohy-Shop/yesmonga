package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.presentation.models.C38530v;
import com.carrefour.fid.android.shared.constant.C28613z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.models.extension.r */
public final class C38483r {

    /* renamed from: com.carrefour.fid.android.presentation.models.extension.r$a */
    public /* synthetic */ class C38484a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.presentation.models.SuggestionType[] r0 = com.carrefour.fid.android.presentation.models.SuggestionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.presentation.models.SuggestionType r1 = com.carrefour.fid.android.presentation.models.SuggestionType.HISTORY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.presentation.models.SuggestionType r1 = com.carrefour.fid.android.presentation.models.SuggestionType.FREQUENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.presentation.models.SuggestionType r1 = com.carrefour.fid.android.presentation.models.SuggestionType.SUGGESTION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.extension.C38483r.C38484a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final String m159664a(@C12579k C38530v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        int i = C38484a.$EnumSwitchMapping$0[vVar.mo122185l().ordinal()];
        if (i == 1) {
            return C28613z.C28621h.f70131h;
        }
        if (i == 2) {
            return C28613z.C28621h.f70130g;
        }
        if (i == 3) {
            return C28613z.C28621h.f70129f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
