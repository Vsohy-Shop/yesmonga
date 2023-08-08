package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/Ingredients;", "", "ingredientStatement", "", "nutriscore", "ecoscore", "allergens", "Lcom/carrefour/fid/android/data/entities/APIMAllergens;", "alcoholByVolumeLabel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/APIMAllergens;Ljava/lang/String;)V", "getAlcoholByVolumeLabel", "()Ljava/lang/String;", "getAllergens", "()Lcom/carrefour/fid/android/data/entities/APIMAllergens;", "getEcoscore", "getIngredientStatement", "getNutriscore", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class Ingredients {
    public static final int $stable = 0;
    @C33608c("alcohol_by_volume_label")
    @C12580l
    private final String alcoholByVolumeLabel;
    @C33608c("allergens")
    @C12580l
    private final APIMAllergens allergens;
    @C33608c("ecoscore")
    @C12580l
    private final String ecoscore;
    @C33608c("ingredient_statement")
    @C12580l
    private final String ingredientStatement;
    @C33608c("nutriscore")
    @C12580l
    private final String nutriscore;

    public Ingredients(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l APIMAllergens aPIMAllergens, @C12580l String str4) {
        this.ingredientStatement = str;
        this.nutriscore = str2;
        this.ecoscore = str3;
        this.allergens = aPIMAllergens;
        this.alcoholByVolumeLabel = str4;
    }

    public static /* synthetic */ Ingredients copy$default(Ingredients ingredients, String str, String str2, String str3, APIMAllergens aPIMAllergens, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ingredients.ingredientStatement;
        }
        if ((i & 2) != 0) {
            str2 = ingredients.nutriscore;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = ingredients.ecoscore;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            aPIMAllergens = ingredients.allergens;
        }
        APIMAllergens aPIMAllergens2 = aPIMAllergens;
        if ((i & 16) != 0) {
            str4 = ingredients.alcoholByVolumeLabel;
        }
        return ingredients.copy(str, str5, str6, aPIMAllergens2, str4);
    }

    @C12580l
    public final String component1() {
        return this.ingredientStatement;
    }

    @C12580l
    public final String component2() {
        return this.nutriscore;
    }

    @C12580l
    public final String component3() {
        return this.ecoscore;
    }

    @C12580l
    public final APIMAllergens component4() {
        return this.allergens;
    }

    @C12580l
    public final String component5() {
        return this.alcoholByVolumeLabel;
    }

    @C12579k
    public final Ingredients copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l APIMAllergens aPIMAllergens, @C12580l String str4) {
        return new Ingredients(str, str2, str3, aPIMAllergens, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ingredients)) {
            return false;
        }
        Ingredients ingredients = (Ingredients) obj;
        return Intrinsics.areEqual((Object) this.ingredientStatement, (Object) ingredients.ingredientStatement) && Intrinsics.areEqual((Object) this.nutriscore, (Object) ingredients.nutriscore) && Intrinsics.areEqual((Object) this.ecoscore, (Object) ingredients.ecoscore) && Intrinsics.areEqual((Object) this.allergens, (Object) ingredients.allergens) && Intrinsics.areEqual((Object) this.alcoholByVolumeLabel, (Object) ingredients.alcoholByVolumeLabel);
    }

    @C12580l
    public final String getAlcoholByVolumeLabel() {
        return this.alcoholByVolumeLabel;
    }

    @C12580l
    public final APIMAllergens getAllergens() {
        return this.allergens;
    }

    @C12580l
    public final String getEcoscore() {
        return this.ecoscore;
    }

    @C12580l
    public final String getIngredientStatement() {
        return this.ingredientStatement;
    }

    @C12580l
    public final String getNutriscore() {
        return this.nutriscore;
    }

    public int hashCode() {
        String str = this.ingredientStatement;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nutriscore;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ecoscore;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        APIMAllergens aPIMAllergens = this.allergens;
        int hashCode4 = (hashCode3 + (aPIMAllergens == null ? 0 : aPIMAllergens.hashCode())) * 31;
        String str4 = this.alcoholByVolumeLabel;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.ingredientStatement;
        String str2 = this.nutriscore;
        String str3 = this.ecoscore;
        APIMAllergens aPIMAllergens = this.allergens;
        String str4 = this.alcoholByVolumeLabel;
        return "Ingredients(ingredientStatement=" + str + ", nutriscore=" + str2 + ", ecoscore=" + str3 + ", allergens=" + aPIMAllergens + ", alcoholByVolumeLabel=" + str4 + ")";
    }
}
