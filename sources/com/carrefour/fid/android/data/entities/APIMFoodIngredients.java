package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMFoodIngredients;", "", "nutriscore", "", "(Ljava/lang/String;)V", "getNutriscore", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMFoodIngredients {
    public static final int $stable = 0;
    @C33608c("nutriscore")
    @C12580l
    private final String nutriscore;

    public APIMFoodIngredients(@C12580l String str) {
        this.nutriscore = str;
    }

    public static /* synthetic */ APIMFoodIngredients copy$default(APIMFoodIngredients aPIMFoodIngredients, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPIMFoodIngredients.nutriscore;
        }
        return aPIMFoodIngredients.copy(str);
    }

    @C12580l
    public final String component1() {
        return this.nutriscore;
    }

    @C12579k
    public final APIMFoodIngredients copy(@C12580l String str) {
        return new APIMFoodIngredients(str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof APIMFoodIngredients) && Intrinsics.areEqual((Object) this.nutriscore, (Object) ((APIMFoodIngredients) obj).nutriscore);
    }

    @C12580l
    public final String getNutriscore() {
        return this.nutriscore;
    }

    public int hashCode() {
        String str = this.nutriscore;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.nutriscore;
        return "APIMFoodIngredients(nutriscore=" + str + ")";
    }
}
