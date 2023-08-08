package com.carrefour.fid.android.catalogs.data.api.entities.responses;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÉ\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006;"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/CatalogHeaderResponse;", "", "id", "", "displayTargets", "", "name", "validityStartDate", "stores", "validityEndDate", "startDate", "endDate", "speed", "storeFormat", "numberOfPage", "slug", "order", "local", "coverUrl", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCoverUrl", "()Ljava/lang/String;", "getDisplayTargets", "()Ljava/util/List;", "getEndDate", "getId", "getLocal", "getName", "getNumberOfPage", "getOrder", "getSlug", "getSpeed", "getStartDate", "getStoreFormat", "getStores", "getValidityEndDate", "getValidityStartDate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class CatalogHeaderResponse {
    @C33608c("cover_url")
    @C12580l
    private final String coverUrl;
    @C33608c("display_targets")
    @C12580l
    private final List<String> displayTargets;
    @C33608c("end_date")
    @C12580l
    private final String endDate;
    @C33608c("id")
    @C12580l

    /* renamed from: id */
    private final String f100753id;
    @C33608c("local")
    @C12580l
    private final String local;
    @C33608c("name")
    @C12580l
    private final String name;
    @C33608c("nb_page")
    @C12580l
    private final String numberOfPage;
    @C33608c("order")
    @C12580l
    private final String order;
    @C33608c("slug_catalog")
    @C12580l
    private final String slug;
    @C33608c("version")
    @C12580l
    private final String speed;
    @C33608c("start_date")
    @C12580l
    private final String startDate;
    @C33608c("store_format")
    @C12580l
    private final String storeFormat;
    @C33608c("stores")
    @C12580l
    private final List<String> stores;
    @C33608c("validity_end_date")
    @C12580l
    private final String validityEndDate;
    @C33608c("validity_start_date")
    @C12580l
    private final String validityStartDate;

    public CatalogHeaderResponse() {
        this((String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogHeaderResponse copy$default(CatalogHeaderResponse catalogHeaderResponse, String str, List list, String str2, String str3, List list2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        CatalogHeaderResponse catalogHeaderResponse2 = catalogHeaderResponse;
        int i2 = i;
        return catalogHeaderResponse.copy((i2 & 1) != 0 ? catalogHeaderResponse2.f100753id : str, (i2 & 2) != 0 ? catalogHeaderResponse2.displayTargets : list, (i2 & 4) != 0 ? catalogHeaderResponse2.name : str2, (i2 & 8) != 0 ? catalogHeaderResponse2.validityStartDate : str3, (i2 & 16) != 0 ? catalogHeaderResponse2.stores : list2, (i2 & 32) != 0 ? catalogHeaderResponse2.validityEndDate : str4, (i2 & 64) != 0 ? catalogHeaderResponse2.startDate : str5, (i2 & 128) != 0 ? catalogHeaderResponse2.endDate : str6, (i2 & 256) != 0 ? catalogHeaderResponse2.speed : str7, (i2 & 512) != 0 ? catalogHeaderResponse2.storeFormat : str8, (i2 & 1024) != 0 ? catalogHeaderResponse2.numberOfPage : str9, (i2 & 2048) != 0 ? catalogHeaderResponse2.slug : str10, (i2 & 4096) != 0 ? catalogHeaderResponse2.order : str11, (i2 & 8192) != 0 ? catalogHeaderResponse2.local : str12, (i2 & 16384) != 0 ? catalogHeaderResponse2.coverUrl : str13);
    }

    @C12580l
    public final String component1() {
        return this.f100753id;
    }

    @C12580l
    public final String component10() {
        return this.storeFormat;
    }

    @C12580l
    public final String component11() {
        return this.numberOfPage;
    }

    @C12580l
    public final String component12() {
        return this.slug;
    }

    @C12580l
    public final String component13() {
        return this.order;
    }

    @C12580l
    public final String component14() {
        return this.local;
    }

    @C12580l
    public final String component15() {
        return this.coverUrl;
    }

    @C12580l
    public final List<String> component2() {
        return this.displayTargets;
    }

    @C12580l
    public final String component3() {
        return this.name;
    }

    @C12580l
    public final String component4() {
        return this.validityStartDate;
    }

    @C12580l
    public final List<String> component5() {
        return this.stores;
    }

    @C12580l
    public final String component6() {
        return this.validityEndDate;
    }

    @C12580l
    public final String component7() {
        return this.startDate;
    }

    @C12580l
    public final String component8() {
        return this.endDate;
    }

    @C12580l
    public final String component9() {
        return this.speed;
    }

    @C12579k
    public final CatalogHeaderResponse copy(@C12580l String str, @C12580l List<String> list, @C12580l String str2, @C12580l String str3, @C12580l List<String> list2, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13) {
        return new CatalogHeaderResponse(str, list, str2, str3, list2, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogHeaderResponse)) {
            return false;
        }
        CatalogHeaderResponse catalogHeaderResponse = (CatalogHeaderResponse) obj;
        return Intrinsics.areEqual((Object) this.f100753id, (Object) catalogHeaderResponse.f100753id) && Intrinsics.areEqual((Object) this.displayTargets, (Object) catalogHeaderResponse.displayTargets) && Intrinsics.areEqual((Object) this.name, (Object) catalogHeaderResponse.name) && Intrinsics.areEqual((Object) this.validityStartDate, (Object) catalogHeaderResponse.validityStartDate) && Intrinsics.areEqual((Object) this.stores, (Object) catalogHeaderResponse.stores) && Intrinsics.areEqual((Object) this.validityEndDate, (Object) catalogHeaderResponse.validityEndDate) && Intrinsics.areEqual((Object) this.startDate, (Object) catalogHeaderResponse.startDate) && Intrinsics.areEqual((Object) this.endDate, (Object) catalogHeaderResponse.endDate) && Intrinsics.areEqual((Object) this.speed, (Object) catalogHeaderResponse.speed) && Intrinsics.areEqual((Object) this.storeFormat, (Object) catalogHeaderResponse.storeFormat) && Intrinsics.areEqual((Object) this.numberOfPage, (Object) catalogHeaderResponse.numberOfPage) && Intrinsics.areEqual((Object) this.slug, (Object) catalogHeaderResponse.slug) && Intrinsics.areEqual((Object) this.order, (Object) catalogHeaderResponse.order) && Intrinsics.areEqual((Object) this.local, (Object) catalogHeaderResponse.local) && Intrinsics.areEqual((Object) this.coverUrl, (Object) catalogHeaderResponse.coverUrl);
    }

    @C12580l
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    @C12580l
    public final List<String> getDisplayTargets() {
        return this.displayTargets;
    }

    @C12580l
    public final String getEndDate() {
        return this.endDate;
    }

    @C12580l
    public final String getId() {
        return this.f100753id;
    }

    @C12580l
    public final String getLocal() {
        return this.local;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    @C12580l
    public final String getNumberOfPage() {
        return this.numberOfPage;
    }

    @C12580l
    public final String getOrder() {
        return this.order;
    }

    @C12580l
    public final String getSlug() {
        return this.slug;
    }

    @C12580l
    public final String getSpeed() {
        return this.speed;
    }

    @C12580l
    public final String getStartDate() {
        return this.startDate;
    }

    @C12580l
    public final String getStoreFormat() {
        return this.storeFormat;
    }

    @C12580l
    public final List<String> getStores() {
        return this.stores;
    }

    @C12580l
    public final String getValidityEndDate() {
        return this.validityEndDate;
    }

    @C12580l
    public final String getValidityStartDate() {
        return this.validityStartDate;
    }

    public int hashCode() {
        String str = this.f100753id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.displayTargets;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.validityStartDate;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list2 = this.stores;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.validityEndDate;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.startDate;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.endDate;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.speed;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.storeFormat;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.numberOfPage;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.slug;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.order;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.local;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.coverUrl;
        if (str13 != null) {
            i = str13.hashCode();
        }
        return hashCode14 + i;
    }

    @C12579k
    public String toString() {
        String str = this.f100753id;
        List<String> list = this.displayTargets;
        String str2 = this.name;
        String str3 = this.validityStartDate;
        List<String> list2 = this.stores;
        String str4 = this.validityEndDate;
        String str5 = this.startDate;
        String str6 = this.endDate;
        String str7 = this.speed;
        String str8 = this.storeFormat;
        String str9 = this.numberOfPage;
        String str10 = this.slug;
        String str11 = this.order;
        String str12 = this.local;
        String str13 = this.coverUrl;
        return "CatalogHeaderResponse(id=" + str + ", displayTargets=" + list + ", name=" + str2 + ", validityStartDate=" + str3 + ", stores=" + list2 + ", validityEndDate=" + str4 + ", startDate=" + str5 + ", endDate=" + str6 + ", speed=" + str7 + ", storeFormat=" + str8 + ", numberOfPage=" + str9 + ", slug=" + str10 + ", order=" + str11 + ", local=" + str12 + ", coverUrl=" + str13 + ")";
    }

    public CatalogHeaderResponse(@C12580l String str, @C12580l List<String> list, @C12580l String str2, @C12580l String str3, @C12580l List<String> list2, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13) {
        this.f100753id = str;
        this.displayTargets = list;
        this.name = str2;
        this.validityStartDate = str3;
        this.stores = list2;
        this.validityEndDate = str4;
        this.startDate = str5;
        this.endDate = str6;
        this.speed = str7;
        this.storeFormat = str8;
        this.numberOfPage = str9;
        this.slug = str10;
        this.order = str11;
        this.local = str12;
        this.coverUrl = str13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CatalogHeaderResponse(java.lang.String r17, java.util.List r18, java.lang.String r19, java.lang.String r20, java.util.List r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r18
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r19
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r20
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r21
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r22
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r23
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r24
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r25
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r26
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r27
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r28
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r29
        L_0x006b:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0071
            r15 = r2
            goto L_0x0073
        L_0x0071:
            r15 = r30
        L_0x0073:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r31
        L_0x007a:
            r17 = r16
            r18 = r1
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
            r31 = r15
            r32 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.api.entities.responses.CatalogHeaderResponse.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
