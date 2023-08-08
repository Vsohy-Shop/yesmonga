package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$9$1 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$9$1 extends Lambda implements C11300l<ReinsuranceType, C11079d2> {
    final /* synthetic */ C11300l<C27870j, C11079d2> $actioner;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$9$1$a */
    public /* synthetic */ class C27837a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceType[] r0 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.ReinsuranceType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceType r1 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.ReinsuranceType.REFUNDED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceType r1 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.ReinsuranceType.GUARANTEE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$9$1.C27837a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$9$1(C11300l<? super C27870j, C11079d2> lVar) {
        super(1);
        this.$actioner = lVar;
    }

    /* renamed from: a */
    public final void mo80861a(@C12579k ReinsuranceType reinsuranceType) {
        Intrinsics.checkNotNullParameter(reinsuranceType, "it");
        int i = C27837a.$EnumSwitchMapping$0[reinsuranceType.ordinal()];
        if (i == 1) {
            this.$actioner.invoke(new C27870j.C27887i.C27888a(ReinsuranceType.REFUNDED));
        } else if (i == 2) {
            this.$actioner.invoke(new C27870j.C27887i.C27888a(ReinsuranceType.GUARANTEE));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo80861a((ReinsuranceType) obj);
        return C11079d2.f28267a;
    }
}
