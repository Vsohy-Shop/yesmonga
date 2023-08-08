package com.carrefour.fid.android.data.entities.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33606a;
import com.google.gson.annotations.C33608c;
import java.io.Serializable;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020\u0004\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010+\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015\u0012\b\b\u0002\u0010-\u001a\u00020\u0004\u0012\b\b\u0002\u0010.\u001a\u00020\u0004\u0012\b\b\u0002\u0010/\u001a\u00020\u0004\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001a\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015\u0012\b\b\u0002\u00102\u001a\u00020\u0004\u0012\b\b\u0002\u00103\u001a\u00020\u0004¢\u0006\u0004\b^\u0010_J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003Jø\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010+\u001a\u00020\u00042\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001a2\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b4\u00105J\t\u00106\u001a\u00020\u0004HÖ\u0001J\t\u00108\u001a\u000207HÖ\u0001J\u0013\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001f\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010 \u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b \u0010@\u001a\u0004\bA\u0010BR\u001a\u0010!\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b!\u0010@\u001a\u0004\bC\u0010BR\u001a\u0010\"\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\"\u0010@\u001a\u0004\bD\u0010BR\u001a\u0010#\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b#\u0010@\u001a\u0004\bE\u0010BR\u001c\u0010$\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\f\n\u0004\b$\u0010F\u001a\u0004\bG\u0010\u000bR\u001c\u0010%\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\f\n\u0004\b%\u0010F\u001a\u0004\bH\u0010\u000bR\u001a\u0010&\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b&\u0010@\u001a\u0004\bI\u0010BR\u001a\u0010'\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b'\u0010@\u001a\u0004\bJ\u0010BR\u001a\u0010(\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b(\u0010=\u001a\u0004\b=\u0010?R\u001c\u0010)\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\f\n\u0004\b)\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010*\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\f\n\u0004\b*\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010+\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b+\u0010@\u001a\u0004\bQ\u0010BR \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006X\u0004¢\u0006\f\n\u0004\b,\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010-\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b-\u0010@\u001a\u0004\bU\u0010BR\u001a\u0010.\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b.\u0010@\u001a\u0004\bV\u0010BR\u001a\u0010/\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b/\u0010@\u001a\u0004\bW\u0010BR\u001c\u00100\u001a\u0004\u0018\u00010\u001a8\u0006X\u0004¢\u0006\f\n\u0004\b0\u0010X\u001a\u0004\bY\u0010ZR \u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006X\u0004¢\u0006\f\n\u0004\b1\u0010R\u001a\u0004\b[\u0010TR\u001a\u00102\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b2\u0010@\u001a\u0004\b\\\u0010BR\u001a\u00103\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b3\u0010@\u001a\u0004\b]\u0010B¨\u0006`"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/coupons/CouponEntity;", "Ljava/io/Serializable;", "", "a", "", "l", "o", "p", "q", "", "r", "()Ljava/lang/Double;", "s", "t", "u", "b", "Lcom/carrefour/fid/android/data/entities/coupons/EmissionInfoEntity;", "c", "Lcom/carrefour/fid/android/data/entities/coupons/BookBurnData;", "d", "e", "", "f", "g", "h", "i", "Lcom/carrefour/fid/android/data/entities/coupons/CouponImageEntity;", "j", "k", "m", "n", "ean13", "description", "descriptionField", "category", "couponType", "discountAmount", "discountPercent", "validityStartDate", "validityEndDate", "priority", "emissionInfo", "bookBurnData", "couponSubType", "stores", "storeType", "reimbursementType", "status", "image", "articles", "requirements", "promotionChannel", "v", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;JLcom/carrefour/fid/android/data/entities/coupons/EmissionInfoEntity;Lcom/carrefour/fid/android/data/entities/coupons/BookBurnData;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/coupons/CouponImageEntity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/data/entities/coupons/CouponEntity;", "toString", "", "hashCode", "", "other", "", "equals", "J", "G", "()J", "Ljava/lang/String;", "C", "()Ljava/lang/String;", "D", "z", "B", "Ljava/lang/Double;", "E", "F", "R", "Q", "Lcom/carrefour/fid/android/data/entities/coupons/EmissionInfoEntity;", "H", "()Lcom/carrefour/fid/android/data/entities/coupons/EmissionInfoEntity;", "Lcom/carrefour/fid/android/data/entities/coupons/BookBurnData;", "y", "()Lcom/carrefour/fid/android/data/entities/coupons/BookBurnData;", "A", "Ljava/util/List;", "P", "()Ljava/util/List;", "O", "L", "N", "Lcom/carrefour/fid/android/data/entities/coupons/CouponImageEntity;", "I", "()Lcom/carrefour/fid/android/data/entities/coupons/CouponImageEntity;", "x", "M", "K", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;JLcom/carrefour/fid/android/data/entities/coupons/EmissionInfoEntity;Lcom/carrefour/fid/android/data/entities/coupons/BookBurnData;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/coupons/CouponImageEntity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CouponEntity implements Serializable {

    /* renamed from: a */
    public static final int f90068a = 8;
    @C33608c("articles")
    @C33606a
    @C12579k
    private final List<String> articles;
    @C33608c("book_burn_infos")
    @C12580l
    @C33606a
    private final BookBurnData bookBurnData;
    @C33608c("category")
    @C12579k
    @C33606a
    private final String category;
    @C33608c("coupon_sub_type")
    @C12579k
    @C33606a
    private final String couponSubType;
    @C33608c("coupon_type")
    @C12579k
    @C33606a
    private final String couponType;
    @C33608c("description")
    @C12579k
    @C33606a
    private final String description;
    @C33608c("description_field")
    @C12579k
    @C33606a
    private final String descriptionField;
    @C33608c("discount_amount")
    @C12580l
    @C33606a
    private final Double discountAmount;
    @C33608c("discount_percent")
    @C12580l
    @C33606a
    private final Double discountPercent;
    @C33608c("ean13")
    @C33606a
    private final long ean13;
    @C33608c("emission_infos")
    @C12580l
    @C33606a
    private final EmissionInfoEntity emissionInfo;
    @C33608c("image")
    @C12580l
    @C33606a
    private final CouponImageEntity image;
    @C33608c("priority")
    @C33606a
    private final long priority;
    @C33608c("promotion_channel")
    @C12579k
    @C33606a
    private final String promotionChannel;
    @C33608c("reimbursement_type")
    @C12579k
    @C33606a
    private final String reimbursementType;
    @C33608c("requirements")
    @C12579k
    @C33606a
    private final String requirements;
    @C33608c("status")
    @C12579k
    @C33606a
    private final String status;
    @C33608c("store_type")
    @C12579k
    @C33606a
    private final String storeType;
    @C33608c("stores")
    @C33606a
    @C12579k
    private final List<String> stores;
    @C33608c("validity_end_date")
    @C12579k
    @C33606a
    private final String validityEndDate;
    @C33608c("validity_start_date")
    @C12579k
    @C33606a
    private final String validityStartDate;

    public CouponEntity() {
        this(0, (String) null, (String) null, (String) null, (String) null, (Double) null, (Double) null, (String) null, (String) null, 0, (EmissionInfoEntity) null, (BookBurnData) null, (String) null, (List) null, (String) null, (String) null, (String) null, (CouponImageEntity) null, (List) null, (String) null, (String) null, 2097151, (DefaultConstructorMarker) null);
    }

    /* renamed from: w */
    public static /* synthetic */ CouponEntity m149393w(CouponEntity couponEntity, long j, String str, String str2, String str3, String str4, Double d, Double d2, String str5, String str6, long j2, EmissionInfoEntity emissionInfoEntity, BookBurnData bookBurnData2, String str7, List list, String str8, String str9, String str10, CouponImageEntity couponImageEntity, List list2, String str11, String str12, int i, Object obj) {
        CouponEntity couponEntity2 = couponEntity;
        int i2 = i;
        return couponEntity.mo110914v((i2 & 1) != 0 ? couponEntity2.ean13 : j, (i2 & 2) != 0 ? couponEntity2.description : str, (i2 & 4) != 0 ? couponEntity2.descriptionField : str2, (i2 & 8) != 0 ? couponEntity2.category : str3, (i2 & 16) != 0 ? couponEntity2.couponType : str4, (i2 & 32) != 0 ? couponEntity2.discountAmount : d, (i2 & 64) != 0 ? couponEntity2.discountPercent : d2, (i2 & 128) != 0 ? couponEntity2.validityStartDate : str5, (i2 & 256) != 0 ? couponEntity2.validityEndDate : str6, (i2 & 512) != 0 ? couponEntity2.priority : j2, (i2 & 1024) != 0 ? couponEntity2.emissionInfo : emissionInfoEntity, (i2 & 2048) != 0 ? couponEntity2.bookBurnData : bookBurnData2, (i2 & 4096) != 0 ? couponEntity2.couponSubType : str7, (i2 & 8192) != 0 ? couponEntity2.stores : list, (i2 & 16384) != 0 ? couponEntity2.storeType : str8, (i2 & 32768) != 0 ? couponEntity2.reimbursementType : str9, (i2 & 65536) != 0 ? couponEntity2.status : str10, (i2 & 131072) != 0 ? couponEntity2.image : couponImageEntity, (i2 & 262144) != 0 ? couponEntity2.articles : list2, (i2 & 524288) != 0 ? couponEntity2.requirements : str11, (i2 & 1048576) != 0 ? couponEntity2.promotionChannel : str12);
    }

    @C12579k
    /* renamed from: A */
    public final String mo110872A() {
        return this.couponSubType;
    }

    @C12579k
    /* renamed from: B */
    public final String mo110873B() {
        return this.couponType;
    }

    @C12579k
    /* renamed from: C */
    public final String mo110874C() {
        return this.description;
    }

    @C12579k
    /* renamed from: D */
    public final String mo110875D() {
        return this.descriptionField;
    }

    @C12580l
    /* renamed from: E */
    public final Double mo110876E() {
        return this.discountAmount;
    }

    @C12580l
    /* renamed from: F */
    public final Double mo110877F() {
        return this.discountPercent;
    }

    /* renamed from: G */
    public final long mo110878G() {
        return this.ean13;
    }

    @C12580l
    /* renamed from: H */
    public final EmissionInfoEntity mo110879H() {
        return this.emissionInfo;
    }

    @C12580l
    /* renamed from: I */
    public final CouponImageEntity mo110880I() {
        return this.image;
    }

    /* renamed from: J */
    public final long mo110881J() {
        return this.priority;
    }

    @C12579k
    /* renamed from: K */
    public final String mo110882K() {
        return this.promotionChannel;
    }

    @C12579k
    /* renamed from: L */
    public final String mo110883L() {
        return this.reimbursementType;
    }

    @C12579k
    /* renamed from: M */
    public final String mo110884M() {
        return this.requirements;
    }

    @C12579k
    /* renamed from: N */
    public final String mo110885N() {
        return this.status;
    }

    @C12579k
    /* renamed from: O */
    public final String mo110886O() {
        return this.storeType;
    }

    @C12579k
    /* renamed from: P */
    public final List<String> mo110887P() {
        return this.stores;
    }

    @C12579k
    /* renamed from: Q */
    public final String mo110888Q() {
        return this.validityEndDate;
    }

    @C12579k
    /* renamed from: R */
    public final String mo110889R() {
        return this.validityStartDate;
    }

    /* renamed from: a */
    public final long mo110890a() {
        return this.ean13;
    }

    /* renamed from: b */
    public final long mo110891b() {
        return this.priority;
    }

    @C12580l
    /* renamed from: c */
    public final EmissionInfoEntity mo110892c() {
        return this.emissionInfo;
    }

    @C12580l
    /* renamed from: d */
    public final BookBurnData mo110893d() {
        return this.bookBurnData;
    }

    @C12579k
    /* renamed from: e */
    public final String mo110894e() {
        return this.couponSubType;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponEntity)) {
            return false;
        }
        CouponEntity couponEntity = (CouponEntity) obj;
        return this.ean13 == couponEntity.ean13 && Intrinsics.areEqual((Object) this.description, (Object) couponEntity.description) && Intrinsics.areEqual((Object) this.descriptionField, (Object) couponEntity.descriptionField) && Intrinsics.areEqual((Object) this.category, (Object) couponEntity.category) && Intrinsics.areEqual((Object) this.couponType, (Object) couponEntity.couponType) && Intrinsics.areEqual((Object) this.discountAmount, (Object) couponEntity.discountAmount) && Intrinsics.areEqual((Object) this.discountPercent, (Object) couponEntity.discountPercent) && Intrinsics.areEqual((Object) this.validityStartDate, (Object) couponEntity.validityStartDate) && Intrinsics.areEqual((Object) this.validityEndDate, (Object) couponEntity.validityEndDate) && this.priority == couponEntity.priority && Intrinsics.areEqual((Object) this.emissionInfo, (Object) couponEntity.emissionInfo) && Intrinsics.areEqual((Object) this.bookBurnData, (Object) couponEntity.bookBurnData) && Intrinsics.areEqual((Object) this.couponSubType, (Object) couponEntity.couponSubType) && Intrinsics.areEqual((Object) this.stores, (Object) couponEntity.stores) && Intrinsics.areEqual((Object) this.storeType, (Object) couponEntity.storeType) && Intrinsics.areEqual((Object) this.reimbursementType, (Object) couponEntity.reimbursementType) && Intrinsics.areEqual((Object) this.status, (Object) couponEntity.status) && Intrinsics.areEqual((Object) this.image, (Object) couponEntity.image) && Intrinsics.areEqual((Object) this.articles, (Object) couponEntity.articles) && Intrinsics.areEqual((Object) this.requirements, (Object) couponEntity.requirements) && Intrinsics.areEqual((Object) this.promotionChannel, (Object) couponEntity.promotionChannel);
    }

    @C12579k
    /* renamed from: f */
    public final List<String> mo110896f() {
        return this.stores;
    }

    @C12579k
    /* renamed from: g */
    public final String mo110897g() {
        return this.storeType;
    }

    @C12579k
    /* renamed from: h */
    public final String mo110898h() {
        return this.reimbursementType;
    }

    public int hashCode() {
        int hashCode = ((((((((Long.hashCode(this.ean13) * 31) + this.description.hashCode()) * 31) + this.descriptionField.hashCode()) * 31) + this.category.hashCode()) * 31) + this.couponType.hashCode()) * 31;
        Double d = this.discountAmount;
        int i = 0;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.discountPercent;
        int hashCode3 = (((((((hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31) + this.validityStartDate.hashCode()) * 31) + this.validityEndDate.hashCode()) * 31) + Long.hashCode(this.priority)) * 31;
        EmissionInfoEntity emissionInfoEntity = this.emissionInfo;
        int hashCode4 = (hashCode3 + (emissionInfoEntity == null ? 0 : emissionInfoEntity.hashCode())) * 31;
        BookBurnData bookBurnData2 = this.bookBurnData;
        int hashCode5 = (((((((((((hashCode4 + (bookBurnData2 == null ? 0 : bookBurnData2.hashCode())) * 31) + this.couponSubType.hashCode()) * 31) + this.stores.hashCode()) * 31) + this.storeType.hashCode()) * 31) + this.reimbursementType.hashCode()) * 31) + this.status.hashCode()) * 31;
        CouponImageEntity couponImageEntity = this.image;
        if (couponImageEntity != null) {
            i = couponImageEntity.hashCode();
        }
        return ((((((hashCode5 + i) * 31) + this.articles.hashCode()) * 31) + this.requirements.hashCode()) * 31) + this.promotionChannel.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo110900i() {
        return this.status;
    }

    @C12580l
    /* renamed from: j */
    public final CouponImageEntity mo110901j() {
        return this.image;
    }

    @C12579k
    /* renamed from: k */
    public final List<String> mo110902k() {
        return this.articles;
    }

    @C12579k
    /* renamed from: l */
    public final String mo110903l() {
        return this.description;
    }

    @C12579k
    /* renamed from: m */
    public final String mo110904m() {
        return this.requirements;
    }

    @C12579k
    /* renamed from: n */
    public final String mo110905n() {
        return this.promotionChannel;
    }

    @C12579k
    /* renamed from: o */
    public final String mo110906o() {
        return this.descriptionField;
    }

    @C12579k
    /* renamed from: p */
    public final String mo110907p() {
        return this.category;
    }

    @C12579k
    /* renamed from: q */
    public final String mo110908q() {
        return this.couponType;
    }

    @C12580l
    /* renamed from: r */
    public final Double mo110909r() {
        return this.discountAmount;
    }

    @C12580l
    /* renamed from: s */
    public final Double mo110910s() {
        return this.discountPercent;
    }

    @C12579k
    /* renamed from: t */
    public final String mo110911t() {
        return this.validityStartDate;
    }

    @C12579k
    public String toString() {
        long j = this.ean13;
        String str = this.description;
        String str2 = this.descriptionField;
        String str3 = this.category;
        String str4 = this.couponType;
        Double d = this.discountAmount;
        Double d2 = this.discountPercent;
        String str5 = this.validityStartDate;
        String str6 = this.validityEndDate;
        long j2 = this.priority;
        EmissionInfoEntity emissionInfoEntity = this.emissionInfo;
        BookBurnData bookBurnData2 = this.bookBurnData;
        String str7 = this.couponSubType;
        List<String> list = this.stores;
        String str8 = this.storeType;
        String str9 = this.reimbursementType;
        String str10 = this.status;
        CouponImageEntity couponImageEntity = this.image;
        List<String> list2 = this.articles;
        String str11 = this.requirements;
        String str12 = this.promotionChannel;
        return "CouponEntity(ean13=" + j + ", description=" + str + ", descriptionField=" + str2 + ", category=" + str3 + ", couponType=" + str4 + ", discountAmount=" + d + ", discountPercent=" + d2 + ", validityStartDate=" + str5 + ", validityEndDate=" + str6 + ", priority=" + j2 + ", emissionInfo=" + emissionInfoEntity + ", bookBurnData=" + bookBurnData2 + ", couponSubType=" + str7 + ", stores=" + list + ", storeType=" + str8 + ", reimbursementType=" + str9 + ", status=" + str10 + ", image=" + couponImageEntity + ", articles=" + list2 + ", requirements=" + str11 + ", promotionChannel=" + str12 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final String mo110913u() {
        return this.validityEndDate;
    }

    @C12579k
    /* renamed from: v */
    public final CouponEntity mo110914v(long j, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l Double d, @C12580l Double d2, @C12579k String str5, @C12579k String str6, long j2, @C12580l EmissionInfoEntity emissionInfoEntity, @C12580l BookBurnData bookBurnData2, @C12579k String str7, @C12579k List<String> list, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12580l CouponImageEntity couponImageEntity, @C12579k List<String> list2, @C12579k String str11, @C12579k String str12) {
        long j3 = j;
        Intrinsics.checkNotNullParameter(str, "description");
        Intrinsics.checkNotNullParameter(str2, "descriptionField");
        Intrinsics.checkNotNullParameter(str3, "category");
        Intrinsics.checkNotNullParameter(str4, "couponType");
        Intrinsics.checkNotNullParameter(str5, "validityStartDate");
        Intrinsics.checkNotNullParameter(str6, "validityEndDate");
        Intrinsics.checkNotNullParameter(str7, "couponSubType");
        Intrinsics.checkNotNullParameter(list, "stores");
        Intrinsics.checkNotNullParameter(str8, "storeType");
        Intrinsics.checkNotNullParameter(str9, "reimbursementType");
        Intrinsics.checkNotNullParameter(str10, "status");
        Intrinsics.checkNotNullParameter(list2, "articles");
        Intrinsics.checkNotNullParameter(str11, "requirements");
        Intrinsics.checkNotNullParameter(str12, "promotionChannel");
        return new CouponEntity(j, str, str2, str3, str4, d, d2, str5, str6, j2, emissionInfoEntity, bookBurnData2, str7, list, str8, str9, str10, couponImageEntity, list2, str11, str12);
    }

    @C12579k
    /* renamed from: x */
    public final List<String> mo110915x() {
        return this.articles;
    }

    @C12580l
    /* renamed from: y */
    public final BookBurnData mo110916y() {
        return this.bookBurnData;
    }

    @C12579k
    /* renamed from: z */
    public final String mo110917z() {
        return this.category;
    }

    public CouponEntity(long j, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l Double d, @C12580l Double d2, @C12579k String str5, @C12579k String str6, long j2, @C12580l EmissionInfoEntity emissionInfoEntity, @C12580l BookBurnData bookBurnData2, @C12579k String str7, @C12579k List<String> list, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12580l CouponImageEntity couponImageEntity, @C12579k List<String> list2, @C12579k String str11, @C12579k String str12) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        List<String> list3 = list;
        String str20 = str8;
        String str21 = str9;
        String str22 = str10;
        List<String> list4 = list2;
        String str23 = str11;
        Intrinsics.checkNotNullParameter(str13, "description");
        Intrinsics.checkNotNullParameter(str14, "descriptionField");
        Intrinsics.checkNotNullParameter(str15, "category");
        Intrinsics.checkNotNullParameter(str16, "couponType");
        Intrinsics.checkNotNullParameter(str17, "validityStartDate");
        Intrinsics.checkNotNullParameter(str18, "validityEndDate");
        Intrinsics.checkNotNullParameter(str19, "couponSubType");
        Intrinsics.checkNotNullParameter(list3, "stores");
        Intrinsics.checkNotNullParameter(str20, "storeType");
        Intrinsics.checkNotNullParameter(str21, "reimbursementType");
        Intrinsics.checkNotNullParameter(str22, "status");
        Intrinsics.checkNotNullParameter(list4, "articles");
        Intrinsics.checkNotNullParameter(str23, "requirements");
        Intrinsics.checkNotNullParameter(str12, "promotionChannel");
        this.ean13 = j;
        this.description = str13;
        this.descriptionField = str14;
        this.category = str15;
        this.couponType = str16;
        this.discountAmount = d;
        this.discountPercent = d2;
        this.validityStartDate = str17;
        this.validityEndDate = str18;
        this.priority = j2;
        this.emissionInfo = emissionInfoEntity;
        this.bookBurnData = bookBurnData2;
        this.couponSubType = str19;
        this.stores = list3;
        this.storeType = str20;
        this.reimbursementType = str21;
        this.status = str22;
        this.image = couponImageEntity;
        this.articles = list4;
        this.requirements = str23;
        this.promotionChannel = str12;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CouponEntity(long r24, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.Double r30, java.lang.Double r31, java.lang.String r32, java.lang.String r33, long r34, com.carrefour.fid.android.data.entities.coupons.EmissionInfoEntity r36, com.carrefour.fid.android.data.entities.coupons.BookBurnData r37, java.lang.String r38, java.util.List r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, com.carrefour.fid.android.data.entities.coupons.CouponImageEntity r43, java.util.List r44, java.lang.String r45, java.lang.String r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            r23 = this;
            r0 = r47
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r24
        L_0x000c:
            r1 = r0 & 2
            java.lang.String r6 = ""
            if (r1 == 0) goto L_0x0014
            r1 = r6
            goto L_0x0016
        L_0x0014:
            r1 = r26
        L_0x0016:
            r7 = r0 & 4
            if (r7 == 0) goto L_0x001c
            r7 = r6
            goto L_0x001e
        L_0x001c:
            r7 = r27
        L_0x001e:
            r8 = r0 & 8
            if (r8 == 0) goto L_0x0024
            r8 = r6
            goto L_0x0026
        L_0x0024:
            r8 = r28
        L_0x0026:
            r9 = r0 & 16
            if (r9 == 0) goto L_0x002c
            r9 = r6
            goto L_0x002e
        L_0x002c:
            r9 = r29
        L_0x002e:
            r10 = r0 & 32
            if (r10 == 0) goto L_0x0034
            r10 = 0
            goto L_0x0036
        L_0x0034:
            r10 = r30
        L_0x0036:
            r12 = r0 & 64
            if (r12 == 0) goto L_0x003c
            r12 = 0
            goto L_0x003e
        L_0x003c:
            r12 = r31
        L_0x003e:
            r13 = r0 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x0044
            r13 = r6
            goto L_0x0046
        L_0x0044:
            r13 = r32
        L_0x0046:
            r14 = r0 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x004c
            r14 = r6
            goto L_0x004e
        L_0x004c:
            r14 = r33
        L_0x004e:
            r15 = r0 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r2 = r34
        L_0x0055:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x005b
            r15 = 0
            goto L_0x005d
        L_0x005b:
            r15 = r36
        L_0x005d:
            r11 = r0 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x0063
            r11 = 0
            goto L_0x0065
        L_0x0063:
            r11 = r37
        L_0x0065:
            r25 = r6
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x006e
            r6 = r25
            goto L_0x0070
        L_0x006e:
            r6 = r38
        L_0x0070:
            r48 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x007b
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x007d
        L_0x007b:
            r6 = r39
        L_0x007d:
            r16 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0086
            r6 = r25
            goto L_0x0088
        L_0x0086:
            r6 = r40
        L_0x0088:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0092
            r17 = r25
            goto L_0x0094
        L_0x0092:
            r17 = r41
        L_0x0094:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009d
            r18 = r25
            goto L_0x009f
        L_0x009d:
            r18 = r42
        L_0x009f:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a8
            r19 = 0
            goto L_0x00aa
        L_0x00a8:
            r19 = r43
        L_0x00aa:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b5
            java.util.List r20 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x00b7
        L_0x00b5:
            r20 = r44
        L_0x00b7:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00c3
            java.lang.String r21 = new java.lang.String
            r21.<init>()
            goto L_0x00c5
        L_0x00c3:
            r21 = r45
        L_0x00c5:
            r22 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r22
            if (r0 == 0) goto L_0x00ce
            r0 = r25
            goto L_0x00d0
        L_0x00ce:
            r0 = r46
        L_0x00d0:
            r24 = r23
            r25 = r4
            r27 = r1
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r2
            r37 = r15
            r38 = r11
            r39 = r48
            r40 = r16
            r41 = r6
            r42 = r17
            r43 = r18
            r44 = r19
            r45 = r20
            r46 = r21
            r47 = r0
            r24.<init>(r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.coupons.CouponEntity.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.String, java.lang.String, long, com.carrefour.fid.android.data.entities.coupons.EmissionInfoEntity, com.carrefour.fid.android.data.entities.coupons.BookBurnData, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.data.entities.coupons.CouponImageEntity, java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
