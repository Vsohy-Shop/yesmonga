package com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails;

import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C40802q;
import com.google.gson.annotations.C33608c;
import com.usabilla.sdk.ubform.p007db.campaign.CampaignTable;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J«\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u0006;"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogHeaderDetailsResponse;", "", "name", "", "validityStartDate", "stores", "", "validityEndDate", "lastModified", "startDate", "endDate", "speed", "storeFormat", "numberOfPage", "displayTargets", "slug", "order", "local", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayTargets", "()Ljava/util/List;", "getEndDate", "()Ljava/lang/String;", "getId", "getLastModified", "getLocal", "getName", "getNumberOfPage", "getOrder", "getSlug", "getSpeed", "getStartDate", "getStoreFormat", "getStores", "getValidityEndDate", "getValidityStartDate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class CatalogHeaderDetailsResponse {
    @C33608c("display_targets")
    @C12579k
    private final List<String> displayTargets;
    @C33608c("end_date")
    @C12579k
    private final String endDate;
    @C33608c("id")
    @C12579k

    /* renamed from: id */
    private final String f100754id;
    @C33608c("last_modified")
    @C12579k
    private final String lastModified;
    @C33608c("local")
    @C12579k
    private final String local;
    @C33608c("name")
    @C12579k
    private final String name;
    @C33608c("nb_page")
    @C12579k
    private final String numberOfPage;
    @C33608c("order")
    @C12579k
    private final String order;
    @C33608c("slug_catalog")
    @C12579k
    private final String slug;
    @C33608c("version")
    @C12579k
    private final String speed;
    @C33608c("start_date")
    @C12579k
    private final String startDate;
    @C33608c("store_format")
    @C12579k
    private final String storeFormat;
    @C33608c("stores")
    @C12579k
    private final List<String> stores;
    @C33608c("validity_end_date")
    @C12579k
    private final String validityEndDate;
    @C33608c("validity_start_date")
    @C12579k
    private final String validityStartDate;

    public CatalogHeaderDetailsResponse() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogHeaderDetailsResponse copy$default(CatalogHeaderDetailsResponse catalogHeaderDetailsResponse, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list2, String str10, String str11, String str12, String str13, int i, Object obj) {
        CatalogHeaderDetailsResponse catalogHeaderDetailsResponse2 = catalogHeaderDetailsResponse;
        int i2 = i;
        return catalogHeaderDetailsResponse.copy((i2 & 1) != 0 ? catalogHeaderDetailsResponse2.name : str, (i2 & 2) != 0 ? catalogHeaderDetailsResponse2.validityStartDate : str2, (i2 & 4) != 0 ? catalogHeaderDetailsResponse2.stores : list, (i2 & 8) != 0 ? catalogHeaderDetailsResponse2.validityEndDate : str3, (i2 & 16) != 0 ? catalogHeaderDetailsResponse2.lastModified : str4, (i2 & 32) != 0 ? catalogHeaderDetailsResponse2.startDate : str5, (i2 & 64) != 0 ? catalogHeaderDetailsResponse2.endDate : str6, (i2 & 128) != 0 ? catalogHeaderDetailsResponse2.speed : str7, (i2 & 256) != 0 ? catalogHeaderDetailsResponse2.storeFormat : str8, (i2 & 512) != 0 ? catalogHeaderDetailsResponse2.numberOfPage : str9, (i2 & 1024) != 0 ? catalogHeaderDetailsResponse2.displayTargets : list2, (i2 & 2048) != 0 ? catalogHeaderDetailsResponse2.slug : str10, (i2 & 4096) != 0 ? catalogHeaderDetailsResponse2.order : str11, (i2 & 8192) != 0 ? catalogHeaderDetailsResponse2.local : str12, (i2 & 16384) != 0 ? catalogHeaderDetailsResponse2.f100754id : str13);
    }

    @C12579k
    public final String component1() {
        return this.name;
    }

    @C12579k
    public final String component10() {
        return this.numberOfPage;
    }

    @C12579k
    public final List<String> component11() {
        return this.displayTargets;
    }

    @C12579k
    public final String component12() {
        return this.slug;
    }

    @C12579k
    public final String component13() {
        return this.order;
    }

    @C12579k
    public final String component14() {
        return this.local;
    }

    @C12579k
    public final String component15() {
        return this.f100754id;
    }

    @C12579k
    public final String component2() {
        return this.validityStartDate;
    }

    @C12579k
    public final List<String> component3() {
        return this.stores;
    }

    @C12579k
    public final String component4() {
        return this.validityEndDate;
    }

    @C12579k
    public final String component5() {
        return this.lastModified;
    }

    @C12579k
    public final String component6() {
        return this.startDate;
    }

    @C12579k
    public final String component7() {
        return this.endDate;
    }

    @C12579k
    public final String component8() {
        return this.speed;
    }

    @C12579k
    public final String component9() {
        return this.storeFormat;
    }

    @C12579k
    public final CatalogHeaderDetailsResponse copy(@C12579k String str, @C12579k String str2, @C12579k List<String> list, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k List<String> list2, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13) {
        String str14 = str;
        Intrinsics.checkNotNullParameter(str14, "name");
        String str15 = str2;
        Intrinsics.checkNotNullParameter(str15, "validityStartDate");
        List<String> list3 = list;
        Intrinsics.checkNotNullParameter(list3, "stores");
        String str16 = str3;
        Intrinsics.checkNotNullParameter(str16, "validityEndDate");
        String str17 = str4;
        Intrinsics.checkNotNullParameter(str17, CampaignTable.f26812l);
        String str18 = str5;
        Intrinsics.checkNotNullParameter(str18, "startDate");
        String str19 = str6;
        Intrinsics.checkNotNullParameter(str19, "endDate");
        String str20 = str7;
        Intrinsics.checkNotNullParameter(str20, "speed");
        String str21 = str8;
        Intrinsics.checkNotNullParameter(str21, "storeFormat");
        String str22 = str9;
        Intrinsics.checkNotNullParameter(str22, "numberOfPage");
        List<String> list4 = list2;
        Intrinsics.checkNotNullParameter(list4, "displayTargets");
        String str23 = str10;
        Intrinsics.checkNotNullParameter(str23, "slug");
        String str24 = str11;
        Intrinsics.checkNotNullParameter(str24, "order");
        String str25 = str12;
        Intrinsics.checkNotNullParameter(str25, C40802q.f103911b);
        Intrinsics.checkNotNullParameter(str13, "id");
        return new CatalogHeaderDetailsResponse(str14, str15, list3, str16, str17, str18, str19, str20, str21, str22, list4, str23, str24, str25, str13);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogHeaderDetailsResponse)) {
            return false;
        }
        CatalogHeaderDetailsResponse catalogHeaderDetailsResponse = (CatalogHeaderDetailsResponse) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) catalogHeaderDetailsResponse.name) && Intrinsics.areEqual((Object) this.validityStartDate, (Object) catalogHeaderDetailsResponse.validityStartDate) && Intrinsics.areEqual((Object) this.stores, (Object) catalogHeaderDetailsResponse.stores) && Intrinsics.areEqual((Object) this.validityEndDate, (Object) catalogHeaderDetailsResponse.validityEndDate) && Intrinsics.areEqual((Object) this.lastModified, (Object) catalogHeaderDetailsResponse.lastModified) && Intrinsics.areEqual((Object) this.startDate, (Object) catalogHeaderDetailsResponse.startDate) && Intrinsics.areEqual((Object) this.endDate, (Object) catalogHeaderDetailsResponse.endDate) && Intrinsics.areEqual((Object) this.speed, (Object) catalogHeaderDetailsResponse.speed) && Intrinsics.areEqual((Object) this.storeFormat, (Object) catalogHeaderDetailsResponse.storeFormat) && Intrinsics.areEqual((Object) this.numberOfPage, (Object) catalogHeaderDetailsResponse.numberOfPage) && Intrinsics.areEqual((Object) this.displayTargets, (Object) catalogHeaderDetailsResponse.displayTargets) && Intrinsics.areEqual((Object) this.slug, (Object) catalogHeaderDetailsResponse.slug) && Intrinsics.areEqual((Object) this.order, (Object) catalogHeaderDetailsResponse.order) && Intrinsics.areEqual((Object) this.local, (Object) catalogHeaderDetailsResponse.local) && Intrinsics.areEqual((Object) this.f100754id, (Object) catalogHeaderDetailsResponse.f100754id);
    }

    @C12579k
    public final List<String> getDisplayTargets() {
        return this.displayTargets;
    }

    @C12579k
    public final String getEndDate() {
        return this.endDate;
    }

    @C12579k
    public final String getId() {
        return this.f100754id;
    }

    @C12579k
    public final String getLastModified() {
        return this.lastModified;
    }

    @C12579k
    public final String getLocal() {
        return this.local;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    @C12579k
    public final String getNumberOfPage() {
        return this.numberOfPage;
    }

    @C12579k
    public final String getOrder() {
        return this.order;
    }

    @C12579k
    public final String getSlug() {
        return this.slug;
    }

    @C12579k
    public final String getSpeed() {
        return this.speed;
    }

    @C12579k
    public final String getStartDate() {
        return this.startDate;
    }

    @C12579k
    public final String getStoreFormat() {
        return this.storeFormat;
    }

    @C12579k
    public final List<String> getStores() {
        return this.stores;
    }

    @C12579k
    public final String getValidityEndDate() {
        return this.validityEndDate;
    }

    @C12579k
    public final String getValidityStartDate() {
        return this.validityStartDate;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.name.hashCode() * 31) + this.validityStartDate.hashCode()) * 31) + this.stores.hashCode()) * 31) + this.validityEndDate.hashCode()) * 31) + this.lastModified.hashCode()) * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode()) * 31) + this.speed.hashCode()) * 31) + this.storeFormat.hashCode()) * 31) + this.numberOfPage.hashCode()) * 31) + this.displayTargets.hashCode()) * 31) + this.slug.hashCode()) * 31) + this.order.hashCode()) * 31) + this.local.hashCode()) * 31) + this.f100754id.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.name;
        String str2 = this.validityStartDate;
        List<String> list = this.stores;
        String str3 = this.validityEndDate;
        String str4 = this.lastModified;
        String str5 = this.startDate;
        String str6 = this.endDate;
        String str7 = this.speed;
        String str8 = this.storeFormat;
        String str9 = this.numberOfPage;
        List<String> list2 = this.displayTargets;
        String str10 = this.slug;
        String str11 = this.order;
        String str12 = this.local;
        String str13 = this.f100754id;
        return "CatalogHeaderDetailsResponse(name=" + str + ", validityStartDate=" + str2 + ", stores=" + list + ", validityEndDate=" + str3 + ", lastModified=" + str4 + ", startDate=" + str5 + ", endDate=" + str6 + ", speed=" + str7 + ", storeFormat=" + str8 + ", numberOfPage=" + str9 + ", displayTargets=" + list2 + ", slug=" + str10 + ", order=" + str11 + ", local=" + str12 + ", id=" + str13 + ")";
    }

    public CatalogHeaderDetailsResponse(@C12579k String str, @C12579k String str2, @C12579k List<String> list, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k List<String> list2, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13) {
        String str14 = str;
        String str15 = str2;
        List<String> list3 = list;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        List<String> list4 = list2;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        String str26 = str13;
        Intrinsics.checkNotNullParameter(str14, "name");
        Intrinsics.checkNotNullParameter(str15, "validityStartDate");
        Intrinsics.checkNotNullParameter(list3, "stores");
        Intrinsics.checkNotNullParameter(str16, "validityEndDate");
        Intrinsics.checkNotNullParameter(str17, CampaignTable.f26812l);
        Intrinsics.checkNotNullParameter(str18, "startDate");
        Intrinsics.checkNotNullParameter(str19, "endDate");
        Intrinsics.checkNotNullParameter(str20, "speed");
        Intrinsics.checkNotNullParameter(str21, "storeFormat");
        Intrinsics.checkNotNullParameter(str22, "numberOfPage");
        Intrinsics.checkNotNullParameter(list4, "displayTargets");
        Intrinsics.checkNotNullParameter(str23, "slug");
        Intrinsics.checkNotNullParameter(str24, "order");
        Intrinsics.checkNotNullParameter(str25, C40802q.f103911b);
        Intrinsics.checkNotNullParameter(str26, "id");
        this.name = str14;
        this.validityStartDate = str15;
        this.stores = list3;
        this.validityEndDate = str16;
        this.lastModified = str17;
        this.startDate = str18;
        this.endDate = str19;
        this.speed = str20;
        this.storeFormat = str21;
        this.numberOfPage = str22;
        this.displayTargets = list4;
        this.slug = str23;
        this.order = str24;
        this.local = str25;
        this.f100754id = str26;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CatalogHeaderDetailsResponse(java.lang.String r16, java.lang.String r17, java.util.List r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.util.List r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r15 = this;
            r0 = r31
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000e
        L_0x000c:
            r1 = r16
        L_0x000e:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            goto L_0x001a
        L_0x0018:
            r2 = r17
        L_0x001a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0023
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0025
        L_0x0023:
            r3 = r18
        L_0x0025:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x002f
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            goto L_0x0031
        L_0x002f:
            r4 = r19
        L_0x0031:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x003b
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            goto L_0x003d
        L_0x003b:
            r5 = r20
        L_0x003d:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0047
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            goto L_0x0049
        L_0x0047:
            r6 = r21
        L_0x0049:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0053
            java.lang.String r7 = new java.lang.String
            r7.<init>()
            goto L_0x0055
        L_0x0053:
            r7 = r22
        L_0x0055:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x005f
            java.lang.String r8 = new java.lang.String
            r8.<init>()
            goto L_0x0061
        L_0x005f:
            r8 = r23
        L_0x0061:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x006b
            java.lang.String r9 = new java.lang.String
            r9.<init>()
            goto L_0x006d
        L_0x006b:
            r9 = r24
        L_0x006d:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0077
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            goto L_0x0079
        L_0x0077:
            r10 = r25
        L_0x0079:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0082
            java.util.List r11 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0084
        L_0x0082:
            r11 = r26
        L_0x0084:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x008e
            java.lang.String r12 = new java.lang.String
            r12.<init>()
            goto L_0x0090
        L_0x008e:
            r12 = r27
        L_0x0090:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x009a
            java.lang.String r13 = new java.lang.String
            r13.<init>()
            goto L_0x009c
        L_0x009a:
            r13 = r28
        L_0x009c:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x00a6
            java.lang.String r14 = new java.lang.String
            r14.<init>()
            goto L_0x00a8
        L_0x00a6:
            r14 = r29
        L_0x00a8:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            goto L_0x00b4
        L_0x00b2:
            r0 = r30
        L_0x00b4:
            r16 = r15
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.CatalogHeaderDetailsResponse.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
