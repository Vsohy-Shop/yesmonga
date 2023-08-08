package com.carrefour.fid.android.loyalty.data.cache;

import android.content.Context;
import android.content.SharedPreferences;
import com.carrefour.fid.android.shared.p046io.OneAppApiException;
import com.carrefour.fid.android.shared.util.C28951s;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0013\b\u0007\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0005R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/cache/LoyaltyMidFidCache;", "", "", "hasLoyaltyCard", "hasPrimeFid", "Lkotlin/d2;", "setHasPrimeFid", "", "getLoyaltyCardNumber", "loyaltyCArd", "saveCardFid", "clearData", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "preferences$delegate", "Lkotlin/z;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/Context;)V", "Companion", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class LoyaltyMidFidCache {
    @C12579k
    private static final String CARD_NUMBER = "cardNumber";
    @C12579k
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private static final String HAS_PRIME_FID = "HAS_PRIME_FID";
    @C12579k
    private static final String PREFERENCE_NAME = "Loyalty";
    /* access modifiers changed from: private */
    @C12579k
    public final Context context;
    @C12579k
    private final C11677z preferences$delegate = C10864b0.m38748c(new LoyaltyMidFidCache$preferences$2(this));

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/cache/LoyaltyMidFidCache$Companion;", "", "()V", "CARD_NUMBER", "", "HAS_PRIME_FID", "PREFERENCE_NAME", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Inject
    public LoyaltyMidFidCache(@C10255b @C12579k Context context2) {
        Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
        this.context = context2;
    }

    private final SharedPreferences getPreferences() {
        Object value = this.preferences$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-preferences>(...)");
        return (SharedPreferences) value;
    }

    public final void clearData() {
        SharedPreferences.Editor clear;
        SharedPreferences.Editor edit = getPreferences().edit();
        if (edit == null || (clear = edit.clear()) == null) {
            throw new OneAppApiException(OneAppApiException.OneAppApiExceptionCode.ServiceInitError);
        }
        clear.commit();
    }

    @C12579k
    public final String getLoyaltyCardNumber() {
        boolean z;
        String string = getPreferences().getString("cardNumber", new String());
        if (string == null || string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String b = C28951s.f70964a.mo84276b(string);
            if (b != null) {
                return b;
            }
        } else if (string != null) {
            return string;
        }
        return "";
    }

    public final boolean hasLoyaltyCard() {
        String string = getPreferences().getString("cardNumber", new String());
        return string != null && string.length() > 0;
    }

    public final boolean hasPrimeFid() {
        return getPreferences().getBoolean("HAS_PRIME_FID", false);
    }

    public final void saveCardFid(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "loyaltyCArd");
        SharedPreferences.Editor edit = getPreferences().edit();
        edit.putString("cardNumber", C28951s.f70964a.mo84278d(this.context, str));
        edit.apply();
    }

    public final void setHasPrimeFid(boolean z) {
        SharedPreferences.Editor edit = getPreferences().edit();
        edit.putBoolean("HAS_PRIME_FID", z);
        edit.apply();
    }
}
