package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.C33699k;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\bC\b\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0014\u0012\b\u00100\u001a\u0004\u0018\u00010\u0016\u0012\b\u00101\u001a\u0004\u0018\u00010\u0018\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\u001f\u0012\b\u00107\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b`\u0010aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0002\u00108\u001a\u00020\u00002\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0004\b8\u00109J\t\u0010:\u001a\u00020\u0002HÖ\u0001J\t\u0010;\u001a\u00020\u0018HÖ\u0001J\u0013\u0010=\u001a\u00020\u001f2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b#\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b$\u0010>\u001a\u0004\bA\u0010@R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b%\u0010>\u001a\u0004\bB\u0010@R\u001c\u0010&\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\f\n\u0004\b&\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010'\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\f\n\u0004\b'\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b(\u0010>\u001a\u0004\bI\u0010@R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0004¢\u0006\f\n\u0004\b)\u0010J\u001a\u0004\bK\u0010LR\"\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006X\u0004¢\u0006\f\n\u0004\b*\u0010J\u001a\u0004\bM\u0010LR\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b+\u0010>\u001a\u0004\bN\u0010@R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b,\u0010>\u001a\u0004\bO\u0010@R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b-\u0010>\u001a\u0004\bP\u0010@R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b.\u0010>\u001a\u0004\bQ\u0010@R\u001c\u0010/\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\f\n\u0004\b/\u0010R\u001a\u0004\bS\u0010TR\u001c\u00100\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\f\n\u0004\b0\u0010U\u001a\u0004\bV\u0010WR\u001c\u00101\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\f\n\u0004\b1\u0010X\u001a\u0004\bY\u0010\u001aR\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b2\u0010>\u001a\u0004\bZ\u0010@R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b3\u0010>\u001a\u0004\b[\u0010@R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b4\u0010>\u001a\u0004\b\\\u0010@R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b5\u0010>\u001a\u0004\b]\u0010@R\u001c\u00106\u001a\u0004\u0018\u00010\u001f8\u0006X\u0004¢\u0006\f\n\u0004\b6\u0010^\u001a\u0004\b6\u0010!R\u001c\u00107\u001a\u0004\u0018\u00010\u001f8\u0006X\u0004¢\u0006\f\n\u0004\b7\u0010^\u001a\u0004\b_\u0010!¨\u0006b"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/Product;", "", "", "component1", "component2", "component3", "Lcom/google/gson/k;", "component4", "Lcom/carrefour/fid/android/data/entities/Flags;", "component5", "component6", "", "Lcom/carrefour/fid/android/data/entities/APIMPicture;", "component7", "Lcom/carrefour/fid/android/data/entities/Category;", "component8", "component9", "component10", "component11", "component12", "Lcom/carrefour/fid/android/data/entities/Food;", "component13", "Lcom/carrefour/fid/android/data/entities/APIMNonFood;", "component14", "", "component15", "()Ljava/lang/Integer;", "component16", "component17", "component18", "component19", "", "component20", "()Ljava/lang/Boolean;", "component21", "cdbase", "gtin", "name", "brandName", "flags", "packaging", "pictures", "categories", "storageMode", "warningAdvices", "consumerAdvice", "serviceCenterContact", "food", "nonFood", "productType", "productBrand", "shortTitle", "fullDescription", "informationFlagFormat", "isVariableWeight", "containAlcohol", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/k;Lcom/carrefour/fid/android/data/entities/Flags;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/Food;Lcom/carrefour/fid/android/data/entities/APIMNonFood;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/data/entities/Product;", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getCdbase", "()Ljava/lang/String;", "getGtin", "getName", "Lcom/google/gson/k;", "getBrandName", "()Lcom/google/gson/k;", "Lcom/carrefour/fid/android/data/entities/Flags;", "getFlags", "()Lcom/carrefour/fid/android/data/entities/Flags;", "getPackaging", "Ljava/util/List;", "getPictures", "()Ljava/util/List;", "getCategories", "getStorageMode", "getWarningAdvices", "getConsumerAdvice", "getServiceCenterContact", "Lcom/carrefour/fid/android/data/entities/Food;", "getFood", "()Lcom/carrefour/fid/android/data/entities/Food;", "Lcom/carrefour/fid/android/data/entities/APIMNonFood;", "getNonFood", "()Lcom/carrefour/fid/android/data/entities/APIMNonFood;", "Ljava/lang/Integer;", "getProductType", "getProductBrand", "getShortTitle", "getFullDescription", "getInformationFlagFormat", "Ljava/lang/Boolean;", "getContainAlcohol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/k;Lcom/carrefour/fid/android/data/entities/Flags;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/Food;Lcom/carrefour/fid/android/data/entities/APIMNonFood;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C8567o(parameters = 0)
public final class Product {
    public static final int $stable = 8;
    @C33608c("brand_name")
    @C12580l
    private final C33699k brandName;
    @C33608c("categories")
    @C12580l
    private final List<Category> categories;
    @C33608c("cdbase")
    @C12580l
    private final String cdbase;
    @C33608c("consumer_advice")
    @C12580l
    private final String consumerAdvice;
    @C33608c("contain_alcohol")
    @C12580l
    private final Boolean containAlcohol;
    @C33608c("flags")
    @C12580l
    private final Flags flags;
    @C33608c("food")
    @C12580l
    private final Food food;
    @C33608c("full_description")
    @C12580l
    private final String fullDescription;
    @C33608c("gtin")
    @C12580l
    private final String gtin;
    @C33608c("information_flag_format")
    @C12580l
    private final String informationFlagFormat;
    @C33608c("is_variable_weight")
    @C12580l
    private final Boolean isVariableWeight;
    @C33608c("name")
    @C12580l
    private final String name;
    @C33608c("non_food")
    @C12580l
    private final APIMNonFood nonFood;
    @C33608c("packaging")
    @C12580l
    private final String packaging;
    @C33608c("pictures")
    @C12580l
    private final List<APIMPicture> pictures;
    @C33608c("product_brand")
    @C12580l
    private final String productBrand;
    @C33608c("product_type")
    @C12580l
    private final Integer productType;
    @C33608c("service_center_contact")
    @C12580l
    private final String serviceCenterContact;
    @C33608c("article_short_title")
    @C12580l
    private final String shortTitle;
    @C33608c("storage_mode")
    @C12580l
    private final String storageMode;
    @C33608c("warning_advices")
    @C12580l
    private final String warningAdvices;

    public Product(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l C33699k kVar, @C12580l Flags flags2, @C12580l String str4, @C12580l List<APIMPicture> list, @C12580l List<Category> list2, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l Food food2, @C12580l APIMNonFood aPIMNonFood, @C12580l Integer num, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l Boolean bool, @C12580l Boolean bool2) {
        this.cdbase = str;
        this.gtin = str2;
        this.name = str3;
        this.brandName = kVar;
        this.flags = flags2;
        this.packaging = str4;
        this.pictures = list;
        this.categories = list2;
        this.storageMode = str5;
        this.warningAdvices = str6;
        this.consumerAdvice = str7;
        this.serviceCenterContact = str8;
        this.food = food2;
        this.nonFood = aPIMNonFood;
        this.productType = num;
        this.productBrand = str9;
        this.shortTitle = str10;
        this.fullDescription = str11;
        this.informationFlagFormat = str12;
        this.isVariableWeight = bool;
        this.containAlcohol = bool2;
    }

    public static /* synthetic */ Product copy$default(Product product, String str, String str2, String str3, C33699k kVar, Flags flags2, String str4, List list, List list2, String str5, String str6, String str7, String str8, Food food2, APIMNonFood aPIMNonFood, Integer num, String str9, String str10, String str11, String str12, Boolean bool, Boolean bool2, int i, Object obj) {
        Product product2 = product;
        int i2 = i;
        return product.copy((i2 & 1) != 0 ? product2.cdbase : str, (i2 & 2) != 0 ? product2.gtin : str2, (i2 & 4) != 0 ? product2.name : str3, (i2 & 8) != 0 ? product2.brandName : kVar, (i2 & 16) != 0 ? product2.flags : flags2, (i2 & 32) != 0 ? product2.packaging : str4, (i2 & 64) != 0 ? product2.pictures : list, (i2 & 128) != 0 ? product2.categories : list2, (i2 & 256) != 0 ? product2.storageMode : str5, (i2 & 512) != 0 ? product2.warningAdvices : str6, (i2 & 1024) != 0 ? product2.consumerAdvice : str7, (i2 & 2048) != 0 ? product2.serviceCenterContact : str8, (i2 & 4096) != 0 ? product2.food : food2, (i2 & 8192) != 0 ? product2.nonFood : aPIMNonFood, (i2 & 16384) != 0 ? product2.productType : num, (i2 & 32768) != 0 ? product2.productBrand : str9, (i2 & 65536) != 0 ? product2.shortTitle : str10, (i2 & 131072) != 0 ? product2.fullDescription : str11, (i2 & 262144) != 0 ? product2.informationFlagFormat : str12, (i2 & 524288) != 0 ? product2.isVariableWeight : bool, (i2 & 1048576) != 0 ? product2.containAlcohol : bool2);
    }

    @C12580l
    public final String component1() {
        return this.cdbase;
    }

    @C12580l
    public final String component10() {
        return this.warningAdvices;
    }

    @C12580l
    public final String component11() {
        return this.consumerAdvice;
    }

    @C12580l
    public final String component12() {
        return this.serviceCenterContact;
    }

    @C12580l
    public final Food component13() {
        return this.food;
    }

    @C12580l
    public final APIMNonFood component14() {
        return this.nonFood;
    }

    @C12580l
    public final Integer component15() {
        return this.productType;
    }

    @C12580l
    public final String component16() {
        return this.productBrand;
    }

    @C12580l
    public final String component17() {
        return this.shortTitle;
    }

    @C12580l
    public final String component18() {
        return this.fullDescription;
    }

    @C12580l
    public final String component19() {
        return this.informationFlagFormat;
    }

    @C12580l
    public final String component2() {
        return this.gtin;
    }

    @C12580l
    public final Boolean component20() {
        return this.isVariableWeight;
    }

    @C12580l
    public final Boolean component21() {
        return this.containAlcohol;
    }

    @C12580l
    public final String component3() {
        return this.name;
    }

    @C12580l
    public final C33699k component4() {
        return this.brandName;
    }

    @C12580l
    public final Flags component5() {
        return this.flags;
    }

    @C12580l
    public final String component6() {
        return this.packaging;
    }

    @C12580l
    public final List<APIMPicture> component7() {
        return this.pictures;
    }

    @C12580l
    public final List<Category> component8() {
        return this.categories;
    }

    @C12580l
    public final String component9() {
        return this.storageMode;
    }

    @C12579k
    public final Product copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l C33699k kVar, @C12580l Flags flags2, @C12580l String str4, @C12580l List<APIMPicture> list, @C12580l List<Category> list2, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l Food food2, @C12580l APIMNonFood aPIMNonFood, @C12580l Integer num, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l Boolean bool, @C12580l Boolean bool2) {
        return new Product(str, str2, str3, kVar, flags2, str4, list, list2, str5, str6, str7, str8, food2, aPIMNonFood, num, str9, str10, str11, str12, bool, bool2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return Intrinsics.areEqual((Object) this.cdbase, (Object) product.cdbase) && Intrinsics.areEqual((Object) this.gtin, (Object) product.gtin) && Intrinsics.areEqual((Object) this.name, (Object) product.name) && Intrinsics.areEqual((Object) this.brandName, (Object) product.brandName) && Intrinsics.areEqual((Object) this.flags, (Object) product.flags) && Intrinsics.areEqual((Object) this.packaging, (Object) product.packaging) && Intrinsics.areEqual((Object) this.pictures, (Object) product.pictures) && Intrinsics.areEqual((Object) this.categories, (Object) product.categories) && Intrinsics.areEqual((Object) this.storageMode, (Object) product.storageMode) && Intrinsics.areEqual((Object) this.warningAdvices, (Object) product.warningAdvices) && Intrinsics.areEqual((Object) this.consumerAdvice, (Object) product.consumerAdvice) && Intrinsics.areEqual((Object) this.serviceCenterContact, (Object) product.serviceCenterContact) && Intrinsics.areEqual((Object) this.food, (Object) product.food) && Intrinsics.areEqual((Object) this.nonFood, (Object) product.nonFood) && Intrinsics.areEqual((Object) this.productType, (Object) product.productType) && Intrinsics.areEqual((Object) this.productBrand, (Object) product.productBrand) && Intrinsics.areEqual((Object) this.shortTitle, (Object) product.shortTitle) && Intrinsics.areEqual((Object) this.fullDescription, (Object) product.fullDescription) && Intrinsics.areEqual((Object) this.informationFlagFormat, (Object) product.informationFlagFormat) && Intrinsics.areEqual((Object) this.isVariableWeight, (Object) product.isVariableWeight) && Intrinsics.areEqual((Object) this.containAlcohol, (Object) product.containAlcohol);
    }

    @C12580l
    public final C33699k getBrandName() {
        return this.brandName;
    }

    @C12580l
    public final List<Category> getCategories() {
        return this.categories;
    }

    @C12580l
    public final String getCdbase() {
        return this.cdbase;
    }

    @C12580l
    public final String getConsumerAdvice() {
        return this.consumerAdvice;
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
    public final Food getFood() {
        return this.food;
    }

    @C12580l
    public final String getFullDescription() {
        return this.fullDescription;
    }

    @C12580l
    public final String getGtin() {
        return this.gtin;
    }

    @C12580l
    public final String getInformationFlagFormat() {
        return this.informationFlagFormat;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    @C12580l
    public final APIMNonFood getNonFood() {
        return this.nonFood;
    }

    @C12580l
    public final String getPackaging() {
        return this.packaging;
    }

    @C12580l
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

    @C12580l
    public final String getServiceCenterContact() {
        return this.serviceCenterContact;
    }

    @C12580l
    public final String getShortTitle() {
        return this.shortTitle;
    }

    @C12580l
    public final String getStorageMode() {
        return this.storageMode;
    }

    @C12580l
    public final String getWarningAdvices() {
        return this.warningAdvices;
    }

    public int hashCode() {
        String str = this.cdbase;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gtin;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C33699k kVar = this.brandName;
        int hashCode4 = (hashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Flags flags2 = this.flags;
        int hashCode5 = (hashCode4 + (flags2 == null ? 0 : flags2.hashCode())) * 31;
        String str4 = this.packaging;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<APIMPicture> list = this.pictures;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<Category> list2 = this.categories;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.storageMode;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.warningAdvices;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.consumerAdvice;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.serviceCenterContact;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Food food2 = this.food;
        int hashCode13 = (hashCode12 + (food2 == null ? 0 : food2.hashCode())) * 31;
        APIMNonFood aPIMNonFood = this.nonFood;
        int hashCode14 = (hashCode13 + (aPIMNonFood == null ? 0 : aPIMNonFood.hashCode())) * 31;
        Integer num = this.productType;
        int hashCode15 = (hashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.productBrand;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.shortTitle;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.fullDescription;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.informationFlagFormat;
        int hashCode19 = (hashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.isVariableWeight;
        int hashCode20 = (hashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.containAlcohol;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode20 + i;
    }

    @C12580l
    public final Boolean isVariableWeight() {
        return this.isVariableWeight;
    }

    @C12579k
    public String toString() {
        String str = this.cdbase;
        String str2 = this.gtin;
        String str3 = this.name;
        C33699k kVar = this.brandName;
        Flags flags2 = this.flags;
        String str4 = this.packaging;
        List<APIMPicture> list = this.pictures;
        List<Category> list2 = this.categories;
        String str5 = this.storageMode;
        String str6 = this.warningAdvices;
        String str7 = this.consumerAdvice;
        String str8 = this.serviceCenterContact;
        Food food2 = this.food;
        APIMNonFood aPIMNonFood = this.nonFood;
        Integer num = this.productType;
        String str9 = this.productBrand;
        String str10 = this.shortTitle;
        String str11 = this.fullDescription;
        String str12 = this.informationFlagFormat;
        Boolean bool = this.isVariableWeight;
        Boolean bool2 = this.containAlcohol;
        return "Product(cdbase=" + str + ", gtin=" + str2 + ", name=" + str3 + ", brandName=" + kVar + ", flags=" + flags2 + ", packaging=" + str4 + ", pictures=" + list + ", categories=" + list2 + ", storageMode=" + str5 + ", warningAdvices=" + str6 + ", consumerAdvice=" + str7 + ", serviceCenterContact=" + str8 + ", food=" + food2 + ", nonFood=" + aPIMNonFood + ", productType=" + num + ", productBrand=" + str9 + ", shortTitle=" + str10 + ", fullDescription=" + str11 + ", informationFlagFormat=" + str12 + ", isVariableWeight=" + bool + ", containAlcohol=" + bool2 + ")";
    }
}
