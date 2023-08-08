package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ8\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0006\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/CriteoProductOrder;", "", "buttonName", "", "products", "", "isMandatory", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "getButtonName", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProducts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/data/entities/CriteoProductOrder;", "equals", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class CriteoProductOrder {
    public static final int $stable = 8;
    @C33608c("button_name")
    @C12580l
    private final String buttonName;
    @C33608c("isMandatory")
    @C12580l
    private final Boolean isMandatory;
    @C33608c("products")
    @C12580l
    private final List<String> products;

    public CriteoProductOrder(@C12580l String str, @C12580l List<String> list, @C12580l Boolean bool) {
        this.buttonName = str;
        this.products = list;
        this.isMandatory = bool;
    }

    public static /* synthetic */ CriteoProductOrder copy$default(CriteoProductOrder criteoProductOrder, String str, List<String> list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = criteoProductOrder.buttonName;
        }
        if ((i & 2) != 0) {
            list = criteoProductOrder.products;
        }
        if ((i & 4) != 0) {
            bool = criteoProductOrder.isMandatory;
        }
        return criteoProductOrder.copy(str, list, bool);
    }

    @C12580l
    public final String component1() {
        return this.buttonName;
    }

    @C12580l
    public final List<String> component2() {
        return this.products;
    }

    @C12580l
    public final Boolean component3() {
        return this.isMandatory;
    }

    @C12579k
    public final CriteoProductOrder copy(@C12580l String str, @C12580l List<String> list, @C12580l Boolean bool) {
        return new CriteoProductOrder(str, list, bool);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CriteoProductOrder)) {
            return false;
        }
        CriteoProductOrder criteoProductOrder = (CriteoProductOrder) obj;
        return Intrinsics.areEqual((Object) this.buttonName, (Object) criteoProductOrder.buttonName) && Intrinsics.areEqual((Object) this.products, (Object) criteoProductOrder.products) && Intrinsics.areEqual((Object) this.isMandatory, (Object) criteoProductOrder.isMandatory);
    }

    @C12580l
    public final String getButtonName() {
        return this.buttonName;
    }

    @C12580l
    public final List<String> getProducts() {
        return this.products;
    }

    public int hashCode() {
        String str = this.buttonName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.products;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isMandatory;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    @C12580l
    public final Boolean isMandatory() {
        return this.isMandatory;
    }

    @C12579k
    public String toString() {
        String str = this.buttonName;
        List<String> list = this.products;
        Boolean bool = this.isMandatory;
        return "CriteoProductOrder(buttonName=" + str + ", products=" + list + ", isMandatory=" + bool + ")";
    }
}
