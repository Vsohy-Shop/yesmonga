package com.carrefour.fid.android.cms.data.extension;

import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.google.firebase.installations.local.C33093b;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class DataPrimeCmsResponseKt {
    @C12579k
    /* renamed from: a */
    public static final String m162989a(@C12579k List<LoyaltyBonus> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt___CollectionsKt.m40639h3(list, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, DataPrimeCmsResponseKt$extractName$1.f102041f, 30, (Object) null);
    }

    @C12579k
    /* renamed from: b */
    public static final String m162990b(@C12579k List<DataPrimeCmsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt___CollectionsKt.m40639h3(list, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, DataPrimeCmsResponseKt$extractPrimeName$1.f102042f, 30, (Object) null);
    }
}
