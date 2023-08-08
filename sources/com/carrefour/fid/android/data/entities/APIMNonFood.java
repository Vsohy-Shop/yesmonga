package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMNonFood;", "", "longDescription", "", "shortDesignation", "(Ljava/lang/String;Ljava/lang/String;)V", "getLongDescription", "()Ljava/lang/String;", "getShortDesignation", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMNonFood {
    public static final int $stable = 0;
    @C33608c("long_description")
    @C12580l
    private final String longDescription;
    @C33608c("short_designation")
    @C12580l
    private final String shortDesignation;

    public APIMNonFood(@C12580l String str, @C12580l String str2) {
        this.longDescription = str;
        this.shortDesignation = str2;
    }

    public static /* synthetic */ APIMNonFood copy$default(APIMNonFood aPIMNonFood, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPIMNonFood.longDescription;
        }
        if ((i & 2) != 0) {
            str2 = aPIMNonFood.shortDesignation;
        }
        return aPIMNonFood.copy(str, str2);
    }

    @C12580l
    public final String component1() {
        return this.longDescription;
    }

    @C12580l
    public final String component2() {
        return this.shortDesignation;
    }

    @C12579k
    public final APIMNonFood copy(@C12580l String str, @C12580l String str2) {
        return new APIMNonFood(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMNonFood)) {
            return false;
        }
        APIMNonFood aPIMNonFood = (APIMNonFood) obj;
        return Intrinsics.areEqual((Object) this.longDescription, (Object) aPIMNonFood.longDescription) && Intrinsics.areEqual((Object) this.shortDesignation, (Object) aPIMNonFood.shortDesignation);
    }

    @C12580l
    public final String getLongDescription() {
        return this.longDescription;
    }

    @C12580l
    public final String getShortDesignation() {
        return this.shortDesignation;
    }

    public int hashCode() {
        String str = this.longDescription;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shortDesignation;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.longDescription;
        String str2 = this.shortDesignation;
        return "APIMNonFood(longDescription=" + str + ", shortDesignation=" + str2 + ")";
    }
}
