package com.carrefour.fid.android.service.data.api.entities;

import com.carrefour.fid.android.shared.constant.C28547h2;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0002\u0010\u001fJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010I\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010(J\t\u0010J\u001a\u00020\bHÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0007HÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00072\b\b\u0002\u0010\u001e\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010UJ\u0013\u0010V\u001a\u00020\b2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020YHÖ\u0001J\t\u0010Z\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0019\u0010(R\u0016\u0010\u0018\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010*R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u001a\u0010(R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0016\u0010\u0017\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0016\u0010\u001e\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0016\u0010\u001b\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*¨\u0006["}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/StoreServiceResponse;", "", "id", "", "name", "label", "passDays", "", "", "wording", "description", "weight", "category", "status", "type", "format", "wlecService", "facilityServiceId", "minefiCode", "metiReference", "openingDate", "url", "minOrderAmount", "paymentOnSiteActivated", "isLoyaltyActivated", "isExpress", "isMirror", "yieldEligible", "deliveryFees", "Lcom/carrefour/fid/android/service/data/api/entities/DeliveryFeeResponse;", "returnableShoppingBag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Boolean;ZLjava/util/List;Z)V", "getCategory", "()Ljava/lang/String;", "getDeliveryFees", "()Ljava/util/List;", "getDescription", "getFacilityServiceId", "getFormat", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getLabel", "getMetiReference", "getMinOrderAmount", "getMinefiCode", "getName", "getOpeningDate", "getPassDays", "getPaymentOnSiteActivated", "getReturnableShoppingBag", "getStatus", "getType", "getUrl", "getWeight", "getWlecService", "getWording", "getYieldEligible", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Boolean;ZLjava/util/List;Z)Lcom/carrefour/fid/android/service/data/api/entities/StoreServiceResponse;", "equals", "other", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StoreServiceResponse {
    @C33608c("category")
    @C12579k
    private final String category;
    @C33608c("delivery_fees")
    @C12580l
    private final List<DeliveryFeeResponse> deliveryFees;
    @C33608c("description")
    @C12579k
    private final String description;
    @C33608c("facility_service_id")
    @C12579k
    private final String facilityServiceId;
    @C33608c("store_format")
    @C12579k
    private final String format;
    @C33608c("id")
    @C12579k

    /* renamed from: id */
    private final String f68527id;
    @C33608c("bff_is_express")
    @C12580l
    private final Boolean isExpress;
    @C33608c("is_e_wallet_loyalty_activated")
    private final boolean isLoyaltyActivated;
    @C33608c("is_mirror")
    @C12580l
    private final Boolean isMirror;
    @C33608c("label")
    @C12579k
    private final String label;
    @C33608c("meti_reference")
    @C12579k
    private final String metiReference;
    @C33608c("min_order_amount")
    @C12579k
    private final String minOrderAmount;
    @C33608c("minefi_code")
    @C12579k
    private final String minefiCode;
    @C33608c("name")
    @C12579k
    private final String name;
    @C33608c("opening_date")
    @C12579k
    private final String openingDate;
    @C33608c("pass_days")
    @C12580l
    private final List<Boolean> passDays;
    @C33608c("payment_on_site_activated")
    private final boolean paymentOnSiteActivated;
    @C33608c("returnable_shopping_bag")
    private final boolean returnableShoppingBag;
    @C33608c("status")
    @C12579k
    private final String status;
    @C33608c("type")
    @C12579k
    private final String type;
    @C12579k
    private final String url;
    @C33608c("weight")
    @C12579k
    private final String weight;
    @C33608c("wlec_service")
    @C12579k
    private final String wlecService;
    @C33608c("wording")
    @C12579k
    private final String wording;
    @C33608c("yield_eligible")
    private final boolean yieldEligible;

    public StoreServiceResponse() {
        this((String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (Boolean) null, (Boolean) null, false, (List) null, false, 33554431, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StoreServiceResponse copy$default(StoreServiceResponse storeServiceResponse, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z, boolean z2, Boolean bool, Boolean bool2, boolean z3, List list2, boolean z4, int i, Object obj) {
        StoreServiceResponse storeServiceResponse2 = storeServiceResponse;
        int i2 = i;
        return storeServiceResponse.copy((i2 & 1) != 0 ? storeServiceResponse2.f68527id : str, (i2 & 2) != 0 ? storeServiceResponse2.name : str2, (i2 & 4) != 0 ? storeServiceResponse2.label : str3, (i2 & 8) != 0 ? storeServiceResponse2.passDays : list, (i2 & 16) != 0 ? storeServiceResponse2.wording : str4, (i2 & 32) != 0 ? storeServiceResponse2.description : str5, (i2 & 64) != 0 ? storeServiceResponse2.weight : str6, (i2 & 128) != 0 ? storeServiceResponse2.category : str7, (i2 & 256) != 0 ? storeServiceResponse2.status : str8, (i2 & 512) != 0 ? storeServiceResponse2.type : str9, (i2 & 1024) != 0 ? storeServiceResponse2.format : str10, (i2 & 2048) != 0 ? storeServiceResponse2.wlecService : str11, (i2 & 4096) != 0 ? storeServiceResponse2.facilityServiceId : str12, (i2 & 8192) != 0 ? storeServiceResponse2.minefiCode : str13, (i2 & 16384) != 0 ? storeServiceResponse2.metiReference : str14, (i2 & 32768) != 0 ? storeServiceResponse2.openingDate : str15, (i2 & 65536) != 0 ? storeServiceResponse2.url : str16, (i2 & 131072) != 0 ? storeServiceResponse2.minOrderAmount : str17, (i2 & 262144) != 0 ? storeServiceResponse2.paymentOnSiteActivated : z, (i2 & 524288) != 0 ? storeServiceResponse2.isLoyaltyActivated : z2, (i2 & 1048576) != 0 ? storeServiceResponse2.isExpress : bool, (i2 & 2097152) != 0 ? storeServiceResponse2.isMirror : bool2, (i2 & 4194304) != 0 ? storeServiceResponse2.yieldEligible : z3, (i2 & 8388608) != 0 ? storeServiceResponse2.deliveryFees : list2, (i2 & 16777216) != 0 ? storeServiceResponse2.returnableShoppingBag : z4);
    }

    @C12579k
    public final String component1() {
        return this.f68527id;
    }

    @C12579k
    public final String component10() {
        return this.type;
    }

    @C12579k
    public final String component11() {
        return this.format;
    }

    @C12579k
    public final String component12() {
        return this.wlecService;
    }

    @C12579k
    public final String component13() {
        return this.facilityServiceId;
    }

    @C12579k
    public final String component14() {
        return this.minefiCode;
    }

    @C12579k
    public final String component15() {
        return this.metiReference;
    }

    @C12579k
    public final String component16() {
        return this.openingDate;
    }

    @C12579k
    public final String component17() {
        return this.url;
    }

    @C12579k
    public final String component18() {
        return this.minOrderAmount;
    }

    public final boolean component19() {
        return this.paymentOnSiteActivated;
    }

    @C12579k
    public final String component2() {
        return this.name;
    }

    public final boolean component20() {
        return this.isLoyaltyActivated;
    }

    @C12580l
    public final Boolean component21() {
        return this.isExpress;
    }

    @C12580l
    public final Boolean component22() {
        return this.isMirror;
    }

    public final boolean component23() {
        return this.yieldEligible;
    }

    @C12580l
    public final List<DeliveryFeeResponse> component24() {
        return this.deliveryFees;
    }

    public final boolean component25() {
        return this.returnableShoppingBag;
    }

    @C12579k
    public final String component3() {
        return this.label;
    }

    @C12580l
    public final List<Boolean> component4() {
        return this.passDays;
    }

    @C12579k
    public final String component5() {
        return this.wording;
    }

    @C12579k
    public final String component6() {
        return this.description;
    }

    @C12579k
    public final String component7() {
        return this.weight;
    }

    @C12579k
    public final String component8() {
        return this.category;
    }

    @C12579k
    public final String component9() {
        return this.status;
    }

    @C12579k
    public final StoreServiceResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l List<Boolean> list, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13, @C12579k String str14, @C12579k String str15, @C12579k String str16, @C12579k String str17, boolean z, boolean z2, @C12580l Boolean bool, @C12580l Boolean bool2, boolean z3, @C12580l List<DeliveryFeeResponse> list2, boolean z4) {
        String str18 = str;
        Intrinsics.checkNotNullParameter(str18, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "label");
        Intrinsics.checkNotNullParameter(str4, "wording");
        Intrinsics.checkNotNullParameter(str5, "description");
        Intrinsics.checkNotNullParameter(str6, "weight");
        Intrinsics.checkNotNullParameter(str7, "category");
        Intrinsics.checkNotNullParameter(str8, "status");
        Intrinsics.checkNotNullParameter(str9, "type");
        Intrinsics.checkNotNullParameter(str10, "format");
        Intrinsics.checkNotNullParameter(str11, "wlecService");
        Intrinsics.checkNotNullParameter(str12, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(str13, "minefiCode");
        Intrinsics.checkNotNullParameter(str14, "metiReference");
        Intrinsics.checkNotNullParameter(str15, "openingDate");
        Intrinsics.checkNotNullParameter(str16, "url");
        Intrinsics.checkNotNullParameter(str17, "minOrderAmount");
        return new StoreServiceResponse(str18, str2, str3, list, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, z, z2, bool, bool2, z3, list2, z4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreServiceResponse)) {
            return false;
        }
        StoreServiceResponse storeServiceResponse = (StoreServiceResponse) obj;
        return Intrinsics.areEqual((Object) this.f68527id, (Object) storeServiceResponse.f68527id) && Intrinsics.areEqual((Object) this.name, (Object) storeServiceResponse.name) && Intrinsics.areEqual((Object) this.label, (Object) storeServiceResponse.label) && Intrinsics.areEqual((Object) this.passDays, (Object) storeServiceResponse.passDays) && Intrinsics.areEqual((Object) this.wording, (Object) storeServiceResponse.wording) && Intrinsics.areEqual((Object) this.description, (Object) storeServiceResponse.description) && Intrinsics.areEqual((Object) this.weight, (Object) storeServiceResponse.weight) && Intrinsics.areEqual((Object) this.category, (Object) storeServiceResponse.category) && Intrinsics.areEqual((Object) this.status, (Object) storeServiceResponse.status) && Intrinsics.areEqual((Object) this.type, (Object) storeServiceResponse.type) && Intrinsics.areEqual((Object) this.format, (Object) storeServiceResponse.format) && Intrinsics.areEqual((Object) this.wlecService, (Object) storeServiceResponse.wlecService) && Intrinsics.areEqual((Object) this.facilityServiceId, (Object) storeServiceResponse.facilityServiceId) && Intrinsics.areEqual((Object) this.minefiCode, (Object) storeServiceResponse.minefiCode) && Intrinsics.areEqual((Object) this.metiReference, (Object) storeServiceResponse.metiReference) && Intrinsics.areEqual((Object) this.openingDate, (Object) storeServiceResponse.openingDate) && Intrinsics.areEqual((Object) this.url, (Object) storeServiceResponse.url) && Intrinsics.areEqual((Object) this.minOrderAmount, (Object) storeServiceResponse.minOrderAmount) && this.paymentOnSiteActivated == storeServiceResponse.paymentOnSiteActivated && this.isLoyaltyActivated == storeServiceResponse.isLoyaltyActivated && Intrinsics.areEqual((Object) this.isExpress, (Object) storeServiceResponse.isExpress) && Intrinsics.areEqual((Object) this.isMirror, (Object) storeServiceResponse.isMirror) && this.yieldEligible == storeServiceResponse.yieldEligible && Intrinsics.areEqual((Object) this.deliveryFees, (Object) storeServiceResponse.deliveryFees) && this.returnableShoppingBag == storeServiceResponse.returnableShoppingBag;
    }

    @C12579k
    public final String getCategory() {
        return this.category;
    }

    @C12580l
    public final List<DeliveryFeeResponse> getDeliveryFees() {
        return this.deliveryFees;
    }

    @C12579k
    public final String getDescription() {
        return this.description;
    }

    @C12579k
    public final String getFacilityServiceId() {
        return this.facilityServiceId;
    }

    @C12579k
    public final String getFormat() {
        return this.format;
    }

    @C12579k
    public final String getId() {
        return this.f68527id;
    }

    @C12579k
    public final String getLabel() {
        return this.label;
    }

    @C12579k
    public final String getMetiReference() {
        return this.metiReference;
    }

    @C12579k
    public final String getMinOrderAmount() {
        return this.minOrderAmount;
    }

    @C12579k
    public final String getMinefiCode() {
        return this.minefiCode;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    @C12579k
    public final String getOpeningDate() {
        return this.openingDate;
    }

    @C12580l
    public final List<Boolean> getPassDays() {
        return this.passDays;
    }

    public final boolean getPaymentOnSiteActivated() {
        return this.paymentOnSiteActivated;
    }

    public final boolean getReturnableShoppingBag() {
        return this.returnableShoppingBag;
    }

    @C12579k
    public final String getStatus() {
        return this.status;
    }

    @C12579k
    public final String getType() {
        return this.type;
    }

    @C12579k
    public final String getUrl() {
        return this.url;
    }

    @C12579k
    public final String getWeight() {
        return this.weight;
    }

    @C12579k
    public final String getWlecService() {
        return this.wlecService;
    }

    @C12579k
    public final String getWording() {
        return this.wording;
    }

    public final boolean getYieldEligible() {
        return this.yieldEligible;
    }

    public int hashCode() {
        int hashCode = ((((this.f68527id.hashCode() * 31) + this.name.hashCode()) * 31) + this.label.hashCode()) * 31;
        List<Boolean> list = this.passDays;
        int i = 0;
        int hashCode2 = (((((((((((((((((((((((((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.wording.hashCode()) * 31) + this.description.hashCode()) * 31) + this.weight.hashCode()) * 31) + this.category.hashCode()) * 31) + this.status.hashCode()) * 31) + this.type.hashCode()) * 31) + this.format.hashCode()) * 31) + this.wlecService.hashCode()) * 31) + this.facilityServiceId.hashCode()) * 31) + this.minefiCode.hashCode()) * 31) + this.metiReference.hashCode()) * 31) + this.openingDate.hashCode()) * 31) + this.url.hashCode()) * 31) + this.minOrderAmount.hashCode()) * 31;
        boolean z = this.paymentOnSiteActivated;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isLoyaltyActivated;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        Boolean bool = this.isExpress;
        int hashCode3 = (i3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isMirror;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        boolean z4 = this.yieldEligible;
        if (z4) {
            z4 = true;
        }
        int i4 = (hashCode4 + (z4 ? 1 : 0)) * 31;
        List<DeliveryFeeResponse> list2 = this.deliveryFees;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i5 = (i4 + i) * 31;
        boolean z5 = this.returnableShoppingBag;
        if (!z5) {
            z2 = z5;
        }
        return i5 + (z2 ? 1 : 0);
    }

    @C12580l
    public final Boolean isExpress() {
        return this.isExpress;
    }

    public final boolean isLoyaltyActivated() {
        return this.isLoyaltyActivated;
    }

    @C12580l
    public final Boolean isMirror() {
        return this.isMirror;
    }

    @C12579k
    public String toString() {
        String str = this.f68527id;
        String str2 = this.name;
        String str3 = this.label;
        List<Boolean> list = this.passDays;
        String str4 = this.wording;
        String str5 = this.description;
        String str6 = this.weight;
        String str7 = this.category;
        String str8 = this.status;
        String str9 = this.type;
        String str10 = this.format;
        String str11 = this.wlecService;
        String str12 = this.facilityServiceId;
        String str13 = this.minefiCode;
        String str14 = this.metiReference;
        String str15 = this.openingDate;
        String str16 = this.url;
        String str17 = this.minOrderAmount;
        boolean z = this.paymentOnSiteActivated;
        boolean z2 = this.isLoyaltyActivated;
        Boolean bool = this.isExpress;
        Boolean bool2 = this.isMirror;
        boolean z3 = this.yieldEligible;
        List<DeliveryFeeResponse> list2 = this.deliveryFees;
        boolean z4 = this.returnableShoppingBag;
        return "StoreServiceResponse(id=" + str + ", name=" + str2 + ", label=" + str3 + ", passDays=" + list + ", wording=" + str4 + ", description=" + str5 + ", weight=" + str6 + ", category=" + str7 + ", status=" + str8 + ", type=" + str9 + ", format=" + str10 + ", wlecService=" + str11 + ", facilityServiceId=" + str12 + ", minefiCode=" + str13 + ", metiReference=" + str14 + ", openingDate=" + str15 + ", url=" + str16 + ", minOrderAmount=" + str17 + ", paymentOnSiteActivated=" + z + ", isLoyaltyActivated=" + z2 + ", isExpress=" + bool + ", isMirror=" + bool2 + ", yieldEligible=" + z3 + ", deliveryFees=" + list2 + ", returnableShoppingBag=" + z4 + ")";
    }

    public StoreServiceResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l List<Boolean> list, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13, @C12579k String str14, @C12579k String str15, @C12579k String str16, @C12579k String str17, boolean z, boolean z2, @C12580l Boolean bool, @C12580l Boolean bool2, boolean z3, @C12580l List<DeliveryFeeResponse> list2, boolean z4) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        String str26 = str9;
        String str27 = str10;
        String str28 = str11;
        String str29 = str12;
        String str30 = str13;
        String str31 = str14;
        String str32 = str16;
        Intrinsics.checkNotNullParameter(str18, "id");
        Intrinsics.checkNotNullParameter(str19, "name");
        Intrinsics.checkNotNullParameter(str20, "label");
        Intrinsics.checkNotNullParameter(str21, "wording");
        Intrinsics.checkNotNullParameter(str22, "description");
        Intrinsics.checkNotNullParameter(str23, "weight");
        Intrinsics.checkNotNullParameter(str24, "category");
        Intrinsics.checkNotNullParameter(str25, "status");
        Intrinsics.checkNotNullParameter(str26, "type");
        Intrinsics.checkNotNullParameter(str27, "format");
        Intrinsics.checkNotNullParameter(str28, "wlecService");
        Intrinsics.checkNotNullParameter(str29, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(str30, "minefiCode");
        Intrinsics.checkNotNullParameter(str31, "metiReference");
        Intrinsics.checkNotNullParameter(str15, "openingDate");
        Intrinsics.checkNotNullParameter(str16, "url");
        Intrinsics.checkNotNullParameter(str17, "minOrderAmount");
        this.f68527id = str18;
        this.name = str19;
        this.label = str20;
        this.passDays = list;
        this.wording = str21;
        this.description = str22;
        this.weight = str23;
        this.category = str24;
        this.status = str25;
        this.type = str26;
        this.format = str27;
        this.wlecService = str28;
        this.facilityServiceId = str29;
        this.minefiCode = str30;
        this.metiReference = str31;
        this.openingDate = str15;
        this.url = str16;
        this.minOrderAmount = str17;
        this.paymentOnSiteActivated = z;
        this.isLoyaltyActivated = z2;
        this.isExpress = bool;
        this.isMirror = bool2;
        this.yieldEligible = z3;
        this.deliveryFees = list2;
        this.returnableShoppingBag = z4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoreServiceResponse(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.List r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, boolean r46, boolean r47, java.lang.Boolean r48, java.lang.Boolean r49, boolean r50, java.util.List r51, boolean r52, int r53, kotlin.jvm.internal.DefaultConstructorMarker r54) {
        /*
            r27 = this;
            r0 = r53
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r28
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r29
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r30
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r31
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = r2
            goto L_0x002c
        L_0x002a:
            r7 = r32
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = r2
            goto L_0x0034
        L_0x0032:
            r8 = r33
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = r2
            goto L_0x003c
        L_0x003a:
            r9 = r34
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = r2
            goto L_0x0044
        L_0x0042:
            r10 = r35
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = r2
            goto L_0x004c
        L_0x004a:
            r11 = r36
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = r2
            goto L_0x0054
        L_0x0052:
            r12 = r37
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005e
            java.lang.String r13 = new java.lang.String
            r13.<init>()
            goto L_0x0060
        L_0x005e:
            r13 = r38
        L_0x0060:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0066
            r14 = r2
            goto L_0x0068
        L_0x0066:
            r14 = r39
        L_0x0068:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006e
            r15 = r2
            goto L_0x0070
        L_0x006e:
            r15 = r40
        L_0x0070:
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0076
            r6 = r2
            goto L_0x0078
        L_0x0076:
            r6 = r41
        L_0x0078:
            r54 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0081
            r2 = r54
            goto L_0x0083
        L_0x0081:
            r2 = r42
        L_0x0083:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x008d
            r16 = r54
            goto L_0x008f
        L_0x008d:
            r16 = r43
        L_0x008f:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0098
            r17 = r54
            goto L_0x009a
        L_0x0098:
            r17 = r44
        L_0x009a:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00a3
            r18 = r54
            goto L_0x00a5
        L_0x00a3:
            r18 = r45
        L_0x00a5:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            r20 = 0
            if (r19 == 0) goto L_0x00b0
            r19 = r20
            goto L_0x00b2
        L_0x00b0:
            r19 = r46
        L_0x00b2:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = r20
            goto L_0x00bd
        L_0x00bb:
            r21 = r47
        L_0x00bd:
            r22 = 1048576(0x100000, float:1.469368E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            java.lang.Boolean r22 = java.lang.Boolean.FALSE
            goto L_0x00c8
        L_0x00c6:
            r22 = r48
        L_0x00c8:
            r23 = 2097152(0x200000, float:2.938736E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            java.lang.Boolean r23 = java.lang.Boolean.FALSE
            goto L_0x00d3
        L_0x00d1:
            r23 = r49
        L_0x00d3:
            r24 = 4194304(0x400000, float:5.877472E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = r20
            goto L_0x00de
        L_0x00dc:
            r24 = r50
        L_0x00de:
            r25 = 8388608(0x800000, float:1.17549435E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = 0
            goto L_0x00e9
        L_0x00e7:
            r25 = r51
        L_0x00e9:
            r26 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r26
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r20 = r52
        L_0x00f2:
            r28 = r27
            r29 = r1
            r30 = r3
            r31 = r4
            r32 = r5
            r33 = r7
            r34 = r8
            r35 = r9
            r36 = r10
            r37 = r11
            r38 = r12
            r39 = r13
            r40 = r14
            r41 = r15
            r42 = r6
            r43 = r2
            r44 = r16
            r45 = r17
            r46 = r18
            r47 = r19
            r48 = r21
            r49 = r22
            r50 = r23
            r51 = r24
            r52 = r25
            r53 = r20
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.entities.StoreServiceResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.Boolean, java.lang.Boolean, boolean, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
