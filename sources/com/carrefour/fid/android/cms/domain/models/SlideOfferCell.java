package com.carrefour.fid.android.cms.domain.models;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/models/SlideOfferCell;", "", "urlImage", "", "alt", "title", "dates", "query", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlt", "()Ljava/lang/String;", "getDates", "getQuery", "getTitle", "getUrlImage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SlideOfferCell {
    @C12580l
    private final String alt;
    @C12580l
    private final String dates;
    @C12580l
    private final String query;
    @C12580l
    private final String title;
    @C12580l
    private final String urlImage;

    public SlideOfferCell(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        this.urlImage = str;
        this.alt = str2;
        this.title = str3;
        this.dates = str4;
        this.query = str5;
    }

    public static /* synthetic */ SlideOfferCell copy$default(SlideOfferCell slideOfferCell, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slideOfferCell.urlImage;
        }
        if ((i & 2) != 0) {
            str2 = slideOfferCell.alt;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = slideOfferCell.title;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = slideOfferCell.dates;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = slideOfferCell.query;
        }
        return slideOfferCell.copy(str, str6, str7, str8, str5);
    }

    @C12580l
    public final String component1() {
        return this.urlImage;
    }

    @C12580l
    public final String component2() {
        return this.alt;
    }

    @C12580l
    public final String component3() {
        return this.title;
    }

    @C12580l
    public final String component4() {
        return this.dates;
    }

    @C12580l
    public final String component5() {
        return this.query;
    }

    @C12579k
    public final SlideOfferCell copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        return new SlideOfferCell(str, str2, str3, str4, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlideOfferCell)) {
            return false;
        }
        SlideOfferCell slideOfferCell = (SlideOfferCell) obj;
        return Intrinsics.areEqual((Object) this.urlImage, (Object) slideOfferCell.urlImage) && Intrinsics.areEqual((Object) this.alt, (Object) slideOfferCell.alt) && Intrinsics.areEqual((Object) this.title, (Object) slideOfferCell.title) && Intrinsics.areEqual((Object) this.dates, (Object) slideOfferCell.dates) && Intrinsics.areEqual((Object) this.query, (Object) slideOfferCell.query);
    }

    @C12580l
    public final String getAlt() {
        return this.alt;
    }

    @C12580l
    public final String getDates() {
        return this.dates;
    }

    @C12580l
    public final String getQuery() {
        return this.query;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    @C12580l
    public final String getUrlImage() {
        return this.urlImage;
    }

    public int hashCode() {
        String str = this.urlImage;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.alt;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dates;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.query;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.urlImage;
        String str2 = this.alt;
        String str3 = this.title;
        String str4 = this.dates;
        String str5 = this.query;
        return "SlideOfferCell(urlImage=" + str + ", alt=" + str2 + ", title=" + str3 + ", dates=" + str4 + ", query=" + str5 + ")";
    }
}
