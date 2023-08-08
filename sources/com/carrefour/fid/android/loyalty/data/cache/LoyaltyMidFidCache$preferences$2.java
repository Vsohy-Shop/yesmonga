package com.carrefour.fid.android.loyalty.data.cache;

import android.content.SharedPreferences;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo22516d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LoyaltyMidFidCache$preferences$2 extends Lambda implements C11289a<SharedPreferences> {
    final /* synthetic */ LoyaltyMidFidCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyMidFidCache$preferences$2(LoyaltyMidFidCache loyaltyMidFidCache) {
        super(0);
        this.this$0 = loyaltyMidFidCache;
    }

    public final SharedPreferences invoke() {
        return this.this$0.context.getSharedPreferences("Loyalty", 0);
    }
}
