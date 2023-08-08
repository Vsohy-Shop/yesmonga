package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/Food;", "", "ingredients", "Lcom/carrefour/fid/android/data/entities/Ingredients;", "nutritionalTables", "Lcom/carrefour/fid/android/data/entities/NutritionalTables;", "(Lcom/carrefour/fid/android/data/entities/Ingredients;Lcom/carrefour/fid/android/data/entities/NutritionalTables;)V", "getIngredients", "()Lcom/carrefour/fid/android/data/entities/Ingredients;", "getNutritionalTables", "()Lcom/carrefour/fid/android/data/entities/NutritionalTables;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class Food {
    public static final int $stable = 8;
    @C33608c("ingredients")
    @C12580l
    private final Ingredients ingredients;
    @C33608c("nutritional_tables")
    @C12580l
    private final NutritionalTables nutritionalTables;

    public Food(@C12580l Ingredients ingredients2, @C12580l NutritionalTables nutritionalTables2) {
        this.ingredients = ingredients2;
        this.nutritionalTables = nutritionalTables2;
    }

    public static /* synthetic */ Food copy$default(Food food, Ingredients ingredients2, NutritionalTables nutritionalTables2, int i, Object obj) {
        if ((i & 1) != 0) {
            ingredients2 = food.ingredients;
        }
        if ((i & 2) != 0) {
            nutritionalTables2 = food.nutritionalTables;
        }
        return food.copy(ingredients2, nutritionalTables2);
    }

    @C12580l
    public final Ingredients component1() {
        return this.ingredients;
    }

    @C12580l
    public final NutritionalTables component2() {
        return this.nutritionalTables;
    }

    @C12579k
    public final Food copy(@C12580l Ingredients ingredients2, @C12580l NutritionalTables nutritionalTables2) {
        return new Food(ingredients2, nutritionalTables2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Food)) {
            return false;
        }
        Food food = (Food) obj;
        return Intrinsics.areEqual((Object) this.ingredients, (Object) food.ingredients) && Intrinsics.areEqual((Object) this.nutritionalTables, (Object) food.nutritionalTables);
    }

    @C12580l
    public final Ingredients getIngredients() {
        return this.ingredients;
    }

    @C12580l
    public final NutritionalTables getNutritionalTables() {
        return this.nutritionalTables;
    }

    public int hashCode() {
        Ingredients ingredients2 = this.ingredients;
        int i = 0;
        int hashCode = (ingredients2 == null ? 0 : ingredients2.hashCode()) * 31;
        NutritionalTables nutritionalTables2 = this.nutritionalTables;
        if (nutritionalTables2 != null) {
            i = nutritionalTables2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        Ingredients ingredients2 = this.ingredients;
        NutritionalTables nutritionalTables2 = this.nutritionalTables;
        return "Food(ingredients=" + ingredients2 + ", nutritionalTables=" + nutritionalTables2 + ")";
    }
}
