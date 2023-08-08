package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/CriteoViewCategory;", "", "format", "", "products", "", "Lcom/carrefour/fid/android/data/entities/CriteoProduct;", "productsOrder", "Lcom/carrefour/fid/android/data/entities/CriteoProductOrder;", "rendering", "Lcom/carrefour/fid/android/data/entities/CriteoFormatRendering;", "onLoadBeacon", "onViewBeacon", "onClickBeacon", "onFileClickBeacon", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/data/entities/CriteoFormatRendering;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFormat", "()Ljava/lang/String;", "getOnClickBeacon", "getOnFileClickBeacon", "getOnLoadBeacon", "getOnViewBeacon", "getProducts", "()Ljava/util/List;", "getProductsOrder", "getRendering", "()Lcom/carrefour/fid/android/data/entities/CriteoFormatRendering;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class CriteoViewCategory {
    public static final int $stable = 8;
    @C33608c("format")
    @C12580l
    private final String format;
    @C33608c("OnClickBeacon")
    @C12580l
    private final String onClickBeacon;
    @C33608c("OnFileClickBeacon")
    @C12580l
    private final String onFileClickBeacon;
    @C33608c("OnLoadBeacon")
    @C12580l
    private final String onLoadBeacon;
    @C33608c("OnViewBeacon")
    @C12580l
    private final String onViewBeacon;
    @C33608c("products")
    @C12580l
    private final List<CriteoProduct> products;
    @C33608c("products_order")
    @C12580l
    private final List<CriteoProductOrder> productsOrder;
    @C33608c("rendering")
    @C12580l
    private final CriteoFormatRendering rendering;

    public CriteoViewCategory(@C12580l String str, @C12580l List<CriteoProduct> list, @C12580l List<CriteoProductOrder> list2, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        this.format = str;
        this.products = list;
        this.productsOrder = list2;
        this.rendering = criteoFormatRendering;
        this.onLoadBeacon = str2;
        this.onViewBeacon = str3;
        this.onClickBeacon = str4;
        this.onFileClickBeacon = str5;
    }

    public static /* synthetic */ CriteoViewCategory copy$default(CriteoViewCategory criteoViewCategory, String str, List list, List list2, CriteoFormatRendering criteoFormatRendering, String str2, String str3, String str4, String str5, int i, Object obj) {
        CriteoViewCategory criteoViewCategory2 = criteoViewCategory;
        int i2 = i;
        return criteoViewCategory.copy((i2 & 1) != 0 ? criteoViewCategory2.format : str, (i2 & 2) != 0 ? criteoViewCategory2.products : list, (i2 & 4) != 0 ? criteoViewCategory2.productsOrder : list2, (i2 & 8) != 0 ? criteoViewCategory2.rendering : criteoFormatRendering, (i2 & 16) != 0 ? criteoViewCategory2.onLoadBeacon : str2, (i2 & 32) != 0 ? criteoViewCategory2.onViewBeacon : str3, (i2 & 64) != 0 ? criteoViewCategory2.onClickBeacon : str4, (i2 & 128) != 0 ? criteoViewCategory2.onFileClickBeacon : str5);
    }

    @C12580l
    public final String component1() {
        return this.format;
    }

    @C12580l
    public final List<CriteoProduct> component2() {
        return this.products;
    }

    @C12580l
    public final List<CriteoProductOrder> component3() {
        return this.productsOrder;
    }

    @C12580l
    public final CriteoFormatRendering component4() {
        return this.rendering;
    }

    @C12580l
    public final String component5() {
        return this.onLoadBeacon;
    }

    @C12580l
    public final String component6() {
        return this.onViewBeacon;
    }

    @C12580l
    public final String component7() {
        return this.onClickBeacon;
    }

    @C12580l
    public final String component8() {
        return this.onFileClickBeacon;
    }

    @C12579k
    public final CriteoViewCategory copy(@C12580l String str, @C12580l List<CriteoProduct> list, @C12580l List<CriteoProductOrder> list2, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        return new CriteoViewCategory(str, list, list2, criteoFormatRendering, str2, str3, str4, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CriteoViewCategory)) {
            return false;
        }
        CriteoViewCategory criteoViewCategory = (CriteoViewCategory) obj;
        return Intrinsics.areEqual((Object) this.format, (Object) criteoViewCategory.format) && Intrinsics.areEqual((Object) this.products, (Object) criteoViewCategory.products) && Intrinsics.areEqual((Object) this.productsOrder, (Object) criteoViewCategory.productsOrder) && Intrinsics.areEqual((Object) this.rendering, (Object) criteoViewCategory.rendering) && Intrinsics.areEqual((Object) this.onLoadBeacon, (Object) criteoViewCategory.onLoadBeacon) && Intrinsics.areEqual((Object) this.onViewBeacon, (Object) criteoViewCategory.onViewBeacon) && Intrinsics.areEqual((Object) this.onClickBeacon, (Object) criteoViewCategory.onClickBeacon) && Intrinsics.areEqual((Object) this.onFileClickBeacon, (Object) criteoViewCategory.onFileClickBeacon);
    }

    @C12580l
    public final String getFormat() {
        return this.format;
    }

    @C12580l
    public final String getOnClickBeacon() {
        return this.onClickBeacon;
    }

    @C12580l
    public final String getOnFileClickBeacon() {
        return this.onFileClickBeacon;
    }

    @C12580l
    public final String getOnLoadBeacon() {
        return this.onLoadBeacon;
    }

    @C12580l
    public final String getOnViewBeacon() {
        return this.onViewBeacon;
    }

    @C12580l
    public final List<CriteoProduct> getProducts() {
        return this.products;
    }

    @C12580l
    public final List<CriteoProductOrder> getProductsOrder() {
        return this.productsOrder;
    }

    @C12580l
    public final CriteoFormatRendering getRendering() {
        return this.rendering;
    }

    public int hashCode() {
        String str = this.format;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CriteoProduct> list = this.products;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<CriteoProductOrder> list2 = this.productsOrder;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CriteoFormatRendering criteoFormatRendering = this.rendering;
        int hashCode4 = (hashCode3 + (criteoFormatRendering == null ? 0 : criteoFormatRendering.hashCode())) * 31;
        String str2 = this.onLoadBeacon;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.onViewBeacon;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.onClickBeacon;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.onFileClickBeacon;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    @C12579k
    public String toString() {
        String str = this.format;
        List<CriteoProduct> list = this.products;
        List<CriteoProductOrder> list2 = this.productsOrder;
        CriteoFormatRendering criteoFormatRendering = this.rendering;
        String str2 = this.onLoadBeacon;
        String str3 = this.onViewBeacon;
        String str4 = this.onClickBeacon;
        String str5 = this.onFileClickBeacon;
        return "CriteoViewCategory(format=" + str + ", products=" + list + ", productsOrder=" + list2 + ", rendering=" + criteoFormatRendering + ", onLoadBeacon=" + str2 + ", onViewBeacon=" + str3 + ", onClickBeacon=" + str4 + ", onFileClickBeacon=" + str5 + ")";
    }
}
