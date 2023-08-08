package com.carrefour.fid.android.domain.models.basket;

import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10975r0;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasketType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketType.kt\ncom/carrefour/fid/android/domain/models/basket/BasketTypeKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,31:1\n9496#2,2:32\n9646#2,4:34\n*S KotlinDebug\n*F\n+ 1 BasketType.kt\ncom/carrefour/fid/android/domain/models/basket/BasketTypeKt\n*L\n19#1:32,2\n19#1:34,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.models.basket.b */
public final class C37969b {
    @C12579k

    /* renamed from: a */
    public static final Map<BasketType, List<StoreServiceType>> f95531a;

    /* renamed from: com.carrefour.fid.android.domain.models.basket.b$a */
    public /* synthetic */ class C37970a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.domain.models.basket.BasketType[] r0 = com.carrefour.fid.android.domain.models.basket.BasketType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_DRIVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.basket.BasketType r1 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_EXPRESS_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.basket.C37969b.C37970a.<clinit>():void");
        }
    }

    static {
        List list;
        BasketType[] values = BasketType.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(values.length), 16));
        for (BasketType basketType : values) {
            int i = C37970a.$EnumSwitchMapping$0[basketType.ordinal()];
            if (i == 1) {
                list = CollectionsKt__CollectionsKt.m40448L(StoreServiceType.Clcv.INSTANCE, StoreServiceType.Drive.INSTANCE);
            } else if (i != 2) {
                list = CollectionsKt__CollectionsKt.m40441E();
            } else {
                list = C10976s.m41419k(StoreServiceType.H1h3.INSTANCE);
            }
            linkedHashMap.put(basketType, list);
        }
        f95531a = linkedHashMap;
    }

    @C12579k
    /* renamed from: a */
    public static final Map<BasketType, List<StoreServiceType>> m156161a() {
        return f95531a;
    }
}
