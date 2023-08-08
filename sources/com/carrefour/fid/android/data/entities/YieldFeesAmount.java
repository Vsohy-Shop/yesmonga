package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(message = "Moved in [basket] module.")
@Keep
@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/YieldFeesAmount;", "", "unscaledAmount", "", "scale", "currency", "", "(IILjava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getScale", "()I", "getUnscaledAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
public final class YieldFeesAmount {
    public static final int $stable = 0;
    @C33608c("currency")
    @C12579k
    private final String currency;
    @C33608c("scale")
    private final int scale;
    @C33608c("unscaled_amount")
    private final int unscaledAmount;

    public YieldFeesAmount(int i, int i2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
        this.unscaledAmount = i;
        this.scale = i2;
        this.currency = str;
    }

    public static /* synthetic */ YieldFeesAmount copy$default(YieldFeesAmount yieldFeesAmount, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = yieldFeesAmount.unscaledAmount;
        }
        if ((i3 & 2) != 0) {
            i2 = yieldFeesAmount.scale;
        }
        if ((i3 & 4) != 0) {
            str = yieldFeesAmount.currency;
        }
        return yieldFeesAmount.copy(i, i2, str);
    }

    public final int component1() {
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
    public final YieldFeesAmount copy(int i, int i2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
        return new YieldFeesAmount(i, i2, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YieldFeesAmount)) {
            return false;
        }
        YieldFeesAmount yieldFeesAmount = (YieldFeesAmount) obj;
        return this.unscaledAmount == yieldFeesAmount.unscaledAmount && this.scale == yieldFeesAmount.scale && Intrinsics.areEqual((Object) this.currency, (Object) yieldFeesAmount.currency);
    }

    @C12579k
    public final String getCurrency() {
        return this.currency;
    }

    public final int getScale() {
        return this.scale;
    }

    public final int getUnscaledAmount() {
        return this.unscaledAmount;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.unscaledAmount) * 31) + Integer.hashCode(this.scale)) * 31) + this.currency.hashCode();
    }

    @C12579k
    public String toString() {
        int i = this.unscaledAmount;
        int i2 = this.scale;
        String str = this.currency;
        return "YieldFeesAmount(unscaledAmount=" + i + ", scale=" + i2 + ", currency=" + str + ")";
    }
}
