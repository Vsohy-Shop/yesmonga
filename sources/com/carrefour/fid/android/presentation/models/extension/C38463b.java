package com.carrefour.fid.android.presentation.models.extension;

import android.content.Context;
import android.widget.TextView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketErrorMessage;
import com.carrefour.fid.android.domain.models.BasketOfferDomain;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBasketModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketModel.kt\ncom/carrefour/fid/android/presentation/models/extension/BasketModelKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1#2:44\n1747#3,3:45\n1747#3,3:48\n*S KotlinDebug\n*F\n+ 1 BasketModel.kt\ncom/carrefour/fid/android/presentation/models/extension/BasketModelKt\n*L\n17#1:45,3\n29#1:48,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.models.extension.b */
public final class C38463b {
    /* renamed from: a */
    public static final int m159616a(@C12580l BasketDomain basketDomain) {
        List<BasketOfferDomain> B;
        int i = 0;
        if (!(basketDomain == null || (B = basketDomain.mo115459B()) == null)) {
            for (BasketOfferDomain B2 : B) {
                i += B2.mo115541B();
            }
        }
        return i;
    }

    /* renamed from: b */
    public static final boolean m159617b(@C12579k BasketDomain basketDomain) {
        Intrinsics.checkNotNullParameter(basketDomain, "<this>");
        List<BasketErrorMessage> y = basketDomain.mo115502y();
        if (y == null) {
            return false;
        }
        Iterable<BasketErrorMessage> iterable = y;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (BasketErrorMessage f : iterable) {
            if (CollectionsKt___CollectionsKt.m40558R1(CollectionsKt__CollectionsKt.m40448L("FAILURE_CASE_SLOT_INVALID_DATE", "FAILURE_CASE_SLOT_NOT_BOOKED", "FAILURE_CASE_SLOT_CLOSE", "SLOT_INFO_NOT_AVAILABLE", "FAILURE_CASE_NO_SLOT", "BASKET_HAS_NO_SLOT"), f.mo115515f())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m159618c(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.BasketDomain r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.carrefour.fid.android.domain.models.BasketSlot r0 = r4.mo115467J()
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.Boolean r0 = r0.mo115656l()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 == 0) goto L_0x0057
            java.util.List r4 = r4.mo115502y()
            r0 = 1
            if (r4 == 0) goto L_0x0053
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r2 = r4 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0032
            r2 = r4
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0032
        L_0x0030:
            r4 = r1
            goto L_0x004f
        L_0x0032:
            java.util.Iterator r4 = r4.iterator()
        L_0x0036:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r4.next()
            com.carrefour.fid.android.domain.models.BasketErrorMessage r2 = (com.carrefour.fid.android.domain.models.BasketErrorMessage) r2
            java.lang.String r2 = r2.mo115515f()
            java.lang.String r3 = "FAILURE_CASE_SLOT_NOT_BOOKED"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0036
            r4 = r0
        L_0x004f:
            if (r4 != r0) goto L_0x0053
            r4 = r0
            goto L_0x0054
        L_0x0053:
            r4 = r1
        L_0x0054:
            if (r4 != 0) goto L_0x0057
            r1 = r0
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.extension.C38463b.m159618c(com.carrefour.fid.android.domain.models.BasketDomain):boolean");
    }

    /* renamed from: d */
    public static final boolean m159619d(@C12579k BasketDomain basketDomain) {
        Intrinsics.checkNotNullParameter(basketDomain, "<this>");
        return !m159618c(basketDomain);
    }

    @C12580l
    /* renamed from: e */
    public static final TextView m159620e(@C12579k BasketDomain basketDomain, @C12580l TextView textView) {
        String str;
        Intrinsics.checkNotNullParameter(basketDomain, "<this>");
        if (textView == null) {
            return null;
        }
        Context context = textView.getContext();
        Object[] objArr = new Object[1];
        String[] stringArray = textView.getResources().getStringArray(R.array.picking_services_list);
        if (C11622t.equals(basketDomain.mo115460C(), "drive", true)) {
            Intrinsics.checkNotNullExpressionValue(stringArray, "pickingServices");
            str = (String) ArraysKt___ArraysKt.m40180sc(stringArray);
        } else {
            Intrinsics.checkNotNullExpressionValue(stringArray, "pickingServices");
            str = (String) ArraysKt___ArraysKt.m39655bi(stringArray);
        }
        objArr[0] = str;
        textView.setText(context.getString(R.string.withdrawal_express_information, objArr));
        return textView;
    }
}
