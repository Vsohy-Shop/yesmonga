package com.carrefour.fid.android.product.presentation.p039ui.list;

import com.carrefour.fid.android.domain.models.criteo.CriteoFormatRendering;
import com.carrefour.fid.android.product.presentation.models.listable.C27680a;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$criteoTrackingCallbacks$1 */
public final class PlpDelegate$criteoTrackingCallbacks$1 implements C27680a {

    /* renamed from: a */
    public final /* synthetic */ PlpDelegate f67888a;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$criteoTrackingCallbacks$1$a */
    public /* synthetic */ class C28019a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.domain.models.criteo.OptionalFooterType[] r0 = com.carrefour.fid.android.domain.models.criteo.OptionalFooterType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.criteo.OptionalFooterType r1 = com.carrefour.fid.android.domain.models.criteo.OptionalFooterType.REDIRECTION     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.criteo.OptionalFooterType r1 = com.carrefour.fid.android.domain.models.criteo.OptionalFooterType.FILE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.criteo.OptionalFooterType r1 = com.carrefour.fid.android.domain.models.criteo.OptionalFooterType.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.list.PlpDelegate$criteoTrackingCallbacks$1.C28019a.<clinit>():void");
        }
    }

    public PlpDelegate$criteoTrackingCallbacks$1(PlpDelegate plpDelegate) {
        this.f67888a = plpDelegate;
    }

    /* renamed from: a */
    public void mo80417a(@C12580l String str) {
        if (str != null) {
            this.f67888a.mo81510p(str);
        }
    }

    /* renamed from: b */
    public void mo80418b(@C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str, @C12580l String str2) {
        if (criteoFormatRendering != null) {
            PlpDelegate plpDelegate = this.f67888a;
            int i = C28019a.$EnumSwitchMapping$0[criteoFormatRendering.mo117356s().ordinal()];
            if (i == 1) {
                String t = criteoFormatRendering.mo117357t();
                if (t != null) {
                    plpDelegate.f67869g.mo32775a(plpDelegate.f67863a, t);
                }
                if (str != null) {
                    plpDelegate.mo81510p(str);
                }
            } else if (i == 2) {
                String t2 = criteoFormatRendering.mo117357t();
                if (t2 != null) {
                    plpDelegate.f67869g.mo32777c(plpDelegate.f67863a, t2, new PlpDelegate$criteoTrackingCallbacks$1$handleButterFlyClick$1$3$1(plpDelegate));
                }
                if (str2 != null) {
                    plpDelegate.mo81510p(str2);
                }
            }
        }
    }
}
