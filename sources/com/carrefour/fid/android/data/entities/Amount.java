package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J.\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/Amount;", "", "unscaledAmount", "", "scale", "", "currency", "", "(Ljava/lang/Long;ILjava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getScale", "()I", "getUnscaledAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;ILjava/lang/String;)Lcom/carrefour/fid/android/data/entities/Amount;", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class Amount {
    public static final int $stable = 0;
    @C33608c("currency")
    @C12579k
    private final String currency;
    @C33608c("scale")
    private final int scale;
    @C33608c("unscaled_amount")
    @C12580l
    private final Long unscaledAmount;

    public Amount(@C12580l Long l, int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
        this.unscaledAmount = l;
        this.scale = i;
        this.currency = str;
    }

    public static /* synthetic */ Amount copy$default(Amount amount, Long l, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = amount.unscaledAmount;
        }
        if ((i2 & 2) != 0) {
            i = amount.scale;
        }
        if ((i2 & 4) != 0) {
            str = amount.currency;
        }
        return amount.copy(l, i, str);
    }

    @C12580l
    public final Long component1() {
        return this.unscaledAmount;
    }

    public final int component2() {
        return this.scale;
    }

    @C12579k
    public final String component3() {
        return this.currency;
    }

    @C12579k
    public final Amount copy(@C12580l Long l, int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
        return new Amount(l, i, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) obj;
        return Intrinsics.areEqual((Object) this.unscaledAmount, (Object) amount.unscaledAmount) && this.scale == amount.scale && Intrinsics.areEqual((Object) this.currency, (Object) amount.currency);
    }

    @C12579k
    public final String getCurrency() {
        return this.currency;
    }

    public final int getScale() {
        return this.scale;
    }

    @C12580l
    public final Long getUnscaledAmount() {
        return this.unscaledAmount;
    }

    public int hashCode() {
        Long l = this.unscaledAmount;
        return ((((l == null ? 0 : l.hashCode()) * 31) + Integer.hashCode(this.scale)) * 31) + this.currency.hashCode();
    }

    @C12579k
    public String toString() {
        Long l = this.unscaledAmount;
        int i = this.scale;
        String str = this.currency;
        return "Amount(unscaledAmount=" + l + ", scale=" + i + ", currency=" + str + ")";
    }
}
