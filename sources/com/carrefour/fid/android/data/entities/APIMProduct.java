package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b4\b\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00104J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Jâ\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\u001c2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u0015HÖ\u0001J\t\u0010O\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010!R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!¨\u0006P"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMProduct;", "", "gtin", "", "nonFood", "Lcom/carrefour/fid/android/data/entities/APIMNonFood;", "food", "Lcom/carrefour/fid/android/data/entities/APIMFood;", "nature", "flags", "Lcom/carrefour/fid/android/data/entities/Flags;", "packaging", "cbase", "isParaPharmacy", "pictures", "", "Lcom/carrefour/fid/android/data/entities/APIMPicture;", "name", "shortTitle", "productBrand", "productType", "", "season", "categories", "Lcom/carrefour/fid/android/data/entities/APIMNode;", "informationFlagFormat", "cdbase", "containAlcohol", "", "(Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/APIMNonFood;Lcom/carrefour/fid/android/data/entities/APIMFood;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/Flags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCategories", "()Ljava/util/List;", "getCbase", "()Ljava/lang/String;", "getCdbase", "getContainAlcohol", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFlags", "()Lcom/carrefour/fid/android/data/entities/Flags;", "getFood", "()Lcom/carrefour/fid/android/data/entities/APIMFood;", "getGtin", "getInformationFlagFormat", "getName", "getNature", "getNonFood", "()Lcom/carrefour/fid/android/data/entities/APIMNonFood;", "getPackaging", "getPictures", "getProductBrand", "getProductType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSeason", "getShortTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/APIMNonFood;Lcom/carrefour/fid/android/data/entities/APIMFood;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/Flags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/data/entities/APIMProduct;", "equals", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMProduct {
    public static final int $stable = 8;
    @C33608c("categories")
    @C12580l
    private final List<APIMNode> categories;
    @C33608c("cbase")
    @C12579k
    private final String cbase;
    @C33608c("cdbase")
    @C12580l
    private final String cdbase;
    @C33608c("contain_alcohol")
    @C12580l
    private final Boolean containAlcohol;
    @C33608c("flags")
    @C12580l
    private final Flags flags;
    @C33608c("food")
    @C12580l
    private final APIMFood food;
    @C33608c("gtin")
    @C12579k
    private final String gtin;
    @C33608c("information_flag_format")
    @C12580l
    private final String informationFlagFormat;
    @C33608c("is_para_pharmacy")
    @C12579k
    private final String isParaPharmacy;
    @C33608c("name")
    @C12579k
    private final String name;
    @C33608c("nature")
    @C12579k
    private final String nature;
    @C33608c("non_food")
    @C12580l
    private final APIMNonFood nonFood;
    @C33608c("packaging")
    @C12579k
    private final String packaging;
    @C33608c("pictures")
    @C12579k
    private final List<APIMPicture> pictures;
    @C33608c("brand_name")
    @C12580l
    private final String productBrand;
    @C33608c("product_type")
    @C12580l
    private final Integer productType;
    @C33608c("season")
    @C12579k
    private final String season;
    @C33608c("article_short_title")
    @C12580l
    private final String shortTitle;

    public APIMProduct(@C12579k String str, @C12580l APIMNonFood aPIMNonFood, @C12580l APIMFood aPIMFood, @C12579k String str2, @C12580l Flags flags2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k List<APIMPicture> list, @C12579k String str6, @C12580l String str7, @C12580l String str8, @C12580l Integer num, @C12579k String str9, @C12580l List<APIMNode> list2, @C12580l String str10, @C12580l String str11, @C12580l Boolean bool) {
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        List<APIMPicture> list3 = list;
        String str15 = str6;
        String str16 = str9;
        Intrinsics.checkNotNullParameter(str, "gtin");
        Intrinsics.checkNotNullParameter(str2, "nature");
        Intrinsics.checkNotNullParameter(str12, "packaging");
        Intrinsics.checkNotNullParameter(str13, "cbase");
        Intrinsics.checkNotNullParameter(str14, "isParaPharmacy");
        Intrinsics.checkNotNullParameter(list3, "pictures");
        Intrinsics.checkNotNullParameter(str15, "name");
        Intrinsics.checkNotNullParameter(str16, "season");
        this.gtin = str;
        this.nonFood = aPIMNonFood;
        this.food = aPIMFood;
        this.nature = str2;
        this.flags = flags2;
        this.packaging = str12;
        this.cbase = str13;
        this.isParaPharmacy = str14;
        this.pictures = list3;
        this.name = str15;
        this.shortTitle = str7;
        this.productBrand = str8;
        this.productType = num;
        this.season = str16;
        this.categories = list2;
        this.informationFlagFormat = str10;
        this.cdbase = str11;
        this.containAlcohol = bool;
    }

    public static /* synthetic */ APIMProduct copy$default(APIMProduct aPIMProduct, String str, APIMNonFood aPIMNonFood, APIMFood aPIMFood, String str2, Flags flags2, String str3, String str4, String str5, List list, String str6, String str7, String str8, Integer num, String str9, List list2, String str10, String str11, Boolean bool, int i, Object obj) {
        APIMProduct aPIMProduct2 = aPIMProduct;
        int i2 = i;
        return aPIMProduct.copy((i2 & 1) != 0 ? aPIMProduct2.gtin : str, (i2 & 2) != 0 ? aPIMProduct2.nonFood : aPIMNonFood, (i2 & 4) != 0 ? aPIMProduct2.food : aPIMFood, (i2 & 8) != 0 ? aPIMProduct2.nature : str2, (i2 & 16) != 0 ? aPIMProduct2.flags : flags2, (i2 & 32) != 0 ? aPIMProduct2.packaging : str3, (i2 & 64) != 0 ? aPIMProduct2.cbase : str4, (i2 & 128) != 0 ? aPIMProduct2.isParaPharmacy : str5, (i2 & 256) != 0 ? aPIMProduct2.pictures : list, (i2 & 512) != 0 ? aPIMProduct2.name : str6, (i2 & 1024) != 0 ? aPIMProduct2.shortTitle : str7, (i2 & 2048) != 0 ? aPIMProduct2.productBrand : str8, (i2 & 4096) != 0 ? aPIMProduct2.productType : num, (i2 & 8192) != 0 ? aPIMProduct2.season : str9, (i2 & 16384) != 0 ? aPIMProduct2.categories : list2, (i2 & 32768) != 0 ? aPIMProduct2.informationFlagFormat : str10, (i2 & 65536) != 0 ? aPIMProduct2.cdbase : str11, (i2 & 131072) != 0 ? aPIMProduct2.containAlcohol : bool);
    }

    @C12579k
    public final String component1() {
        return this.gtin;
    }

    @C12579k
    public final String component10() {
        return this.name;
    }

    @C12580l
    public final String component11() {
        return this.shortTitle;
    }

    @C12580l
    public final String component12() {
        return this.productBrand;
    }

    @C12580l
    public final Integer component13() {
        return this.productType;
    }

    @C12579k
    public final String component14() {
        return this.season;
    }

    @C12580l
    public final List<APIMNode> component15() {
        return this.categories;
    }

    @C12580l
    public final String component16() {
        return this.informationFlagFormat;
    }

    @C12580l
    public final String component17() {
        return this.cdbase;
    }

    @C12580l
    public final Boolean component18() {
        return this.containAlcohol;
    }

    @C12580l
    public final APIMNonFood component2() {
        return this.nonFood;
    }

    @C12580l
    public final APIMFood component3() {
        return this.food;
    }

    @C12579k
    public final String component4() {
        return this.nature;
    }

    @C12580l
    public final Flags component5() {
        return this.flags;
    }

    @C12579k
    public final String component6() {
        return this.packaging;
    }

    @C12579k
    public final String component7() {
        return this.cbase;
    }

    @C12579k
    public final String component8() {
        return this.isParaPharmacy;
    }

    @C12579k
    public final List<APIMPicture> component9() {
        return this.pictures;
    }

    @C12579k
    public final APIMProduct copy(@C12579k String str, @C12580l APIMNonFood aPIMNonFood, @C12580l APIMFood aPIMFood, @C12579k String str2, @C12580l Flags flags2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k List<APIMPicture> list, @C12579k String str6, @C12580l String str7, @C12580l String str8, @C12580l Integer num, @C12579k String str9, @C12580l List<APIMNode> list2, @C12580l String str10, @C12580l String str11, @C12580l Boolean bool) {
        String str12 = str;
        Intrinsics.checkNotNullParameter(str12, "gtin");
        Intrinsics.checkNotNullParameter(str2, "nature");
        Intrinsics.checkNotNullParameter(str3, "packaging");
        Intrinsics.checkNotNullParameter(str4, "cbase");
        Intrinsics.checkNotNullParameter(str5, "isParaPharmacy");
        Intrinsics.checkNotNullParameter(list, "pictures");
        Intrinsics.checkNotNullParameter(str6, "name");
        Intrinsics.checkNotNullParameter(str9, "season");
        return new APIMProduct(str12, aPIMNonFood, aPIMFood, str2, flags2, str3, str4, str5, list, str6, str7, str8, num, str9, list2, str10, str11, bool);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMProduct)) {
            return false;
        }
        APIMProduct aPIMProduct = (APIMProduct) obj;
        return Intrinsics.areEqual((Object) this.gtin, (Object) aPIMProduct.gtin) && Intrinsics.areEqual((Object) this.nonFood, (Object) aPIMProduct.nonFood) && Intrinsics.areEqual((Object) this.food, (Object) aPIMProduct.food) && Intrinsics.areEqual((Object) this.nature, (Object) aPIMProduct.nature) && Intrinsics.areEqual((Object) this.flags, (Object) aPIMProduct.flags) && Intrinsics.areEqual((Object) this.packaging, (Object) aPIMProduct.packaging) && Intrinsics.areEqual((Object) this.cbase, (Object) aPIMProduct.cbase) && Intrinsics.areEqual((Object) this.isParaPharmacy, (Object) aPIMProduct.isParaPharmacy) && Intrinsics.areEqual((Object) this.pictures, (Object) aPIMProduct.pictures) && Intrinsics.areEqual((Object) this.name, (Object) aPIMProduct.name) && Intrinsics.areEqual((Object) this.shortTitle, (Object) aPIMProduct.shortTitle) && Intrinsics.areEqual((Object) this.productBrand, (Object) aPIMProduct.productBrand) && Intrinsics.areEqual((Object) this.productType, (Object) aPIMProduct.productType) && Intrinsics.areEqual((Object) this.season, (Object) aPIMProduct.season) && Intrinsics.areEqual((Object) this.categories, (Object) aPIMProduct.categories) && Intrinsics.areEqual((Object) this.informationFlagFormat, (Object) aPIMProduct.informationFlagFormat) && Intrinsics.areEqual((Object) this.cdbase, (Object) aPIMProduct.cdbase) && Intrinsics.areEqual((Object) this.containAlcohol, (Object) aPIMProduct.containAlcohol);
    }

    @C12580l
    public final List<APIMNode> getCategories() {
        return this.categories;
    }

    @C12579k
    public final String getCbase() {
        return this.cbase;
    }

    @C12580l
    public final String getCdbase() {
        return this.cdbase;
    }

    @C12580l
    public final Boolean getContainAlcohol() {
        return this.containAlcohol;
    }

    @C12580l
    public final Flags getFlags() {
        return this.flags;
    }

    @C12580l
    public final APIMFood getFood() {
        return this.food;
    }

    @C12579k
    public final String getGtin() {
        return this.gtin;
    }

    @C12580l
    public final String getInformationFlagFormat() {
        return this.informationFlagFormat;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    @C12579k
    public final String getNature() {
        return this.nature;
    }

    @C12580l
    public final APIMNonFood getNonFood() {
        return this.nonFood;
    }

    @C12579k
    public final String getPackaging() {
        return this.packaging;
    }

    @C12579k
    public final List<APIMPicture> getPictures() {
        return this.pictures;
    }

    @C12580l
    public final String getProductBrand() {
        return this.productBrand;
    }

    @C12580l
    public final Integer getProductType() {
        return this.productType;
    }

    @C12579k
    public final String getSeason() {
        return this.season;
    }

    @C12580l
    public final String getShortTitle() {
        return this.shortTitle;
    }

    public int hashCode() {
        int hashCode = this.gtin.hashCode() * 31;
        APIMNonFood aPIMNonFood = this.nonFood;
        int i = 0;
        int hashCode2 = (hashCode + (aPIMNonFood == null ? 0 : aPIMNonFood.hashCode())) * 31;
        APIMFood aPIMFood = this.food;
        int hashCode3 = (((hashCode2 + (aPIMFood == null ? 0 : aPIMFood.hashCode())) * 31) + this.nature.hashCode()) * 31;
        Flags flags2 = this.flags;
        int hashCode4 = (((((((((((hashCode3 + (flags2 == null ? 0 : flags2.hashCode())) * 31) + this.packaging.hashCode()) * 31) + this.cbase.hashCode()) * 31) + this.isParaPharmacy.hashCode()) * 31) + this.pictures.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.shortTitle;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productBrand;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.productType;
        int hashCode7 = (((hashCode6 + (num == null ? 0 : num.hashCode())) * 31) + this.season.hashCode()) * 31;
        List<APIMNode> list = this.categories;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.informationFlagFormat;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cdbase;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.containAlcohol;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode10 + i;
    }

    @C12579k
    public final String isParaPharmacy() {
        return this.isParaPharmacy;
    }

    @C12579k
    public String toString() {
        String str = this.gtin;
        APIMNonFood aPIMNonFood = this.nonFood;
        APIMFood aPIMFood = this.food;
        String str2 = this.nature;
        Flags flags2 = this.flags;
        String str3 = this.packaging;
        String str4 = this.cbase;
        String str5 = this.isParaPharmacy;
        List<APIMPicture> list = this.pictures;
        String str6 = this.name;
        String str7 = this.shortTitle;
        String str8 = this.productBrand;
        Integer num = this.productType;
        String str9 = this.season;
        List<APIMNode> list2 = this.categories;
        String str10 = this.informationFlagFormat;
        String str11 = this.cdbase;
        Boolean bool = this.containAlcohol;
        return "APIMProduct(gtin=" + str + ", nonFood=" + aPIMNonFood + ", food=" + aPIMFood + ", nature=" + str2 + ", flags=" + flags2 + ", packaging=" + str3 + ", cbase=" + str4 + ", isParaPharmacy=" + str5 + ", pictures=" + list + ", name=" + str6 + ", shortTitle=" + str7 + ", productBrand=" + str8 + ", productType=" + num + ", season=" + str9 + ", categories=" + list2 + ", informationFlagFormat=" + str10 + ", cdbase=" + str11 + ", containAlcohol=" + bool + ")";
    }
}
