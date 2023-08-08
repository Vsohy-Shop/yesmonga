package com.carrefour.fid.android.cms.domain.extension;

import com.carrefour.fid.android.cms.data.entities.DeliveryRateBlocksPojo;
import com.carrefour.fid.android.cms.data.entities.DeliveryRatePojo;
import com.carrefour.fid.android.domain.models.C38037g;
import com.carrefour.fid.android.domain.models.C38038h;
import com.carrefour.fid.android.domain.models.C38050n;
import com.carrefour.fid.android.domain.models.C38051o;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0000\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/DeliveryRatePojo;", "", "Lcom/carrefour/fid/android/domain/models/h;", "toDomain", "", "Lcom/carrefour/fid/android/domain/models/g;", "toDeliveryPrice", "KEY_DEFAULT_FREE_DELIVERY", "Ljava/lang/String;", "cms_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeliveryRate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryRate.kt\ncom/carrefour/fid/android/cms/domain/extension/DeliveryRateKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1549#2:33\n1620#2,3:34\n*S KotlinDebug\n*F\n+ 1 DeliveryRate.kt\ncom/carrefour/fid/android/cms/domain/extension/DeliveryRateKt\n*L\n11#1:33\n11#1:34,3\n*E\n"})
public final class DeliveryRateKt {
    @C12579k
    private static final String KEY_DEFAULT_FREE_DELIVERY = "OFFERT";

    @C12580l
    public static final C38037g toDeliveryPrice(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Double orElseGet = StringKt.m118922c(str).orElseGet(new C40024a());
        if (orElseGet == null) {
            return null;
        }
        if (orElseGet.doubleValue() > 0.0d) {
            return new C38050n(str);
        }
        return new C38051o(KEY_DEFAULT_FREE_DELIVERY);
    }

    /* access modifiers changed from: private */
    public static final Double toDeliveryPrice$lambda$1() {
        return null;
    }

    @C12580l
    public static final List<C38038h> toDomain(@C12579k DeliveryRatePojo deliveryRatePojo) {
        Intrinsics.checkNotNullParameter(deliveryRatePojo, "<this>");
        List<DeliveryRateBlocksPojo> blocks = deliveryRatePojo.getBlocks();
        if (blocks == null) {
            return null;
        }
        Iterable<DeliveryRateBlocksPojo> iterable = blocks;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (DeliveryRateBlocksPojo deliveryRateKt$toDomain$1$1 : iterable) {
            arrayList.add(new DeliveryRateKt$toDomain$1$1(deliveryRateKt$toDomain$1$1));
        }
        return arrayList;
    }
}
