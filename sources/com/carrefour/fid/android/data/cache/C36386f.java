package com.carrefour.fid.android.data.cache;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners;
import com.carrefour.fid.android.shared.base.C28484f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.cache.f */
public final class C36386f extends C28484f<LuckyCartBanners> {

    /* renamed from: g */
    public static final int f89999g = 0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36386f(LuckyCartBanners luckyCartBanners, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(luckyCartBanners, (i & 2) != 0 ? 43200000 : j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36386f(@C12579k LuckyCartBanners luckyCartBanners, long j) {
        super(luckyCartBanners, j);
        Intrinsics.checkNotNullParameter(luckyCartBanners, "data");
    }
}
