package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/NutritionalTables;", "", "incoVariante", "", "Lcom/carrefour/fid/android/data/entities/IncoVariante;", "(Ljava/util/List;)V", "getIncoVariante", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class NutritionalTables {
    public static final int $stable = 8;
    @C33608c("inco_variante")
    @C12580l
    private final List<IncoVariante> incoVariante;

    public NutritionalTables(@C12580l List<IncoVariante> list) {
        this.incoVariante = list;
    }

    public static /* synthetic */ NutritionalTables copy$default(NutritionalTables nutritionalTables, List<IncoVariante> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = nutritionalTables.incoVariante;
        }
        return nutritionalTables.copy(list);
    }

    @C12580l
    public final List<IncoVariante> component1() {
        return this.incoVariante;
    }

    @C12579k
    public final NutritionalTables copy(@C12580l List<IncoVariante> list) {
        return new NutritionalTables(list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NutritionalTables) && Intrinsics.areEqual((Object) this.incoVariante, (Object) ((NutritionalTables) obj).incoVariante);
    }

    @C12580l
    public final List<IncoVariante> getIncoVariante() {
        return this.incoVariante;
    }

    public int hashCode() {
        List<IncoVariante> list = this.incoVariante;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @C12579k
    public String toString() {
        List<IncoVariante> list = this.incoVariante;
        return "NutritionalTables(incoVariante=" + list + ")";
    }
}
