package com.carrefour.fid.android.loyalty.data.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013Jd\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002J\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u000bJ\"\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u000bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/headers/LoyaltyHeaders;", "", "", "loyaltyCardId", "otpCode", "", "withContentType", "withChannel", "withChannelAttachCard", "audience", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getDefaultHeaders", "getAuthHeaders", "getCreateOrAttachLoyaltyCardHeaders", "Lcom/carrefour/fid/android/shared/data/headers/a;", "headerBuilder", "Lcom/carrefour/fid/android/shared/data/headers/a;", "<init>", "(Lcom/carrefour/fid/android/shared/data/headers/a;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class LoyaltyHeaders {
    @C12579k
    private final C28640a headerBuilder;

    @Inject
    public LoyaltyHeaders(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.headerBuilder = aVar;
    }

    public static /* synthetic */ HashMap getDefaultHeaders$default(LoyaltyHeaders loyaltyHeaders, String str, String str2, boolean z, boolean z2, boolean z3, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        return loyaltyHeaders.getDefaultHeaders(str, str2, z, z2, z3, str3);
    }

    @C12579k
    public final HashMap<String, String> getAuthHeaders() {
        return this.headerBuilder.mo83550n().mo83557u().mo83538C();
    }

    @C12579k
    public final HashMap<String, String> getCreateOrAttachLoyaltyCardHeaders() {
        return this.headerBuilder.mo83540c().mo83546i().mo83538C();
    }

    @C12579k
    public final HashMap<String, String> getDefaultHeaders(@C12580l String str, @C12580l String str2, boolean z, boolean z2, boolean z3, @C12580l String str3) {
        if (str != null) {
            this.headerBuilder.mo83561y(str);
        }
        if (str2 != null) {
            this.headerBuilder.mo83536A(str2);
        }
        if (z) {
            this.headerBuilder.mo83556t();
        }
        if (z2) {
            this.headerBuilder.mo83554r();
        }
        if (z3) {
            this.headerBuilder.mo83553q();
        }
        return this.headerBuilder.mo83540c().mo83547j(str3).mo83550n().mo83546i().mo83538C();
    }
}
