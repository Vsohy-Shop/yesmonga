package com.carrefour.fid.android.presentation.models.mapper;

import com.carrefour.fid.android.domain.models.LuckyCartTicketDomain;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.models.mapper.e */
public final class C38503e {
    @C12579k
    /* renamed from: a */
    public static final LuckyCartTicketDomain m159751a(@C12579k LuckyCartTicketDomain luckyCartTicketDomain) {
        Intrinsics.checkNotNullParameter(luckyCartTicketDomain, "<this>");
        return new LuckyCartTicketDomain(luckyCartTicketDomain.getImageUrl(), luckyCartTicketDomain.getRedirectionUrl());
    }
}
