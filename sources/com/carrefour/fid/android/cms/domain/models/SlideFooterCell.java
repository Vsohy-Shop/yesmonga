package com.carrefour.fid.android.cms.domain.models;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/models/SlideFooterCell;", "", "urlImage", "", "title", "linkDomain", "Lcom/carrefour/fid/android/cms/domain/models/LinkDomain;", "alt", "(Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/cms/domain/models/LinkDomain;Ljava/lang/String;)V", "getAlt", "()Ljava/lang/String;", "getLinkDomain", "()Lcom/carrefour/fid/android/cms/domain/models/LinkDomain;", "getTitle", "getUrlImage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SlideFooterCell {
    @C12580l
    private final String alt;
    @C12580l
    private final LinkDomain linkDomain;
    @C12580l
    private final String title;
    @C12580l
    private final String urlImage;

    public SlideFooterCell(@C12580l String str, @C12580l String str2, @C12580l LinkDomain linkDomain2, @C12580l String str3) {
        this.urlImage = str;
        this.title = str2;
        this.linkDomain = linkDomain2;
        this.alt = str3;
    }

    public static /* synthetic */ SlideFooterCell copy$default(SlideFooterCell slideFooterCell, String str, String str2, LinkDomain linkDomain2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slideFooterCell.urlImage;
        }
        if ((i & 2) != 0) {
            str2 = slideFooterCell.title;
        }
        if ((i & 4) != 0) {
            linkDomain2 = slideFooterCell.linkDomain;
        }
        if ((i & 8) != 0) {
            str3 = slideFooterCell.alt;
        }
        return slideFooterCell.copy(str, str2, linkDomain2, str3);
    }

    @C12580l
    public final String component1() {
        return this.urlImage;
    }

    @C12580l
    public final String component2() {
        return this.title;
    }

    @C12580l
    public final LinkDomain component3() {
        return this.linkDomain;
    }

    @C12580l
    public final String component4() {
        return this.alt;
    }

    @C12579k
    public final SlideFooterCell copy(@C12580l String str, @C12580l String str2, @C12580l LinkDomain linkDomain2, @C12580l String str3) {
        return new SlideFooterCell(str, str2, linkDomain2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlideFooterCell)) {
            return false;
        }
        SlideFooterCell slideFooterCell = (SlideFooterCell) obj;
        return Intrinsics.areEqual((Object) this.urlImage, (Object) slideFooterCell.urlImage) && Intrinsics.areEqual((Object) this.title, (Object) slideFooterCell.title) && Intrinsics.areEqual((Object) this.linkDomain, (Object) slideFooterCell.linkDomain) && Intrinsics.areEqual((Object) this.alt, (Object) slideFooterCell.alt);
    }

    @C12580l
    public final String getAlt() {
        return this.alt;
    }

    @C12580l
    public final LinkDomain getLinkDomain() {
        return this.linkDomain;
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
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkDomain linkDomain2 = this.linkDomain;
        int hashCode3 = (hashCode2 + (linkDomain2 == null ? 0 : linkDomain2.hashCode())) * 31;
        String str3 = this.alt;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    @C12579k
    public String toString() {
        String str = this.urlImage;
        String str2 = this.title;
        LinkDomain linkDomain2 = this.linkDomain;
        String str3 = this.alt;
        return "SlideFooterCell(urlImage=" + str + ", title=" + str2 + ", linkDomain=" + linkDomain2 + ", alt=" + str3 + ")";
    }
}
