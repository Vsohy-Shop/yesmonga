package com.carrefour.fid.android.cms.domain.models;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/models/InternalLink;", "Lcom/carrefour/fid/android/cms/domain/models/LinkDomain;", "title", "", "deepLink", "contentId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getDeepLink", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class InternalLink implements LinkDomain {
    @C12580l
    private final String contentId;
    @C12580l
    private final String deepLink;
    @C12579k
    private final String title;

    public InternalLink(@C12579k String str, @C12580l String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "title");
        this.title = str;
        this.deepLink = str2;
        this.contentId = str3;
    }

    public static /* synthetic */ InternalLink copy$default(InternalLink internalLink, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalLink.title;
        }
        if ((i & 2) != 0) {
            str2 = internalLink.deepLink;
        }
        if ((i & 4) != 0) {
            str3 = internalLink.contentId;
        }
        return internalLink.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.title;
    }

    @C12580l
    public final String component2() {
        return this.deepLink;
    }

    @C12580l
    public final String component3() {
        return this.contentId;
    }

    @C12579k
    public final InternalLink copy(@C12579k String str, @C12580l String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "title");
        return new InternalLink(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalLink)) {
            return false;
        }
        InternalLink internalLink = (InternalLink) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) internalLink.title) && Intrinsics.areEqual((Object) this.deepLink, (Object) internalLink.deepLink) && Intrinsics.areEqual((Object) this.contentId, (Object) internalLink.contentId);
    }

    @C12580l
    public final String getContentId() {
        return this.contentId;
    }

    @C12580l
    public final String getDeepLink() {
        return this.deepLink;
    }

    @C12579k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.deepLink;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contentId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.title;
        String str2 = this.deepLink;
        String str3 = this.contentId;
        return "InternalLink(title=" + str + ", deepLink=" + str2 + ", contentId=" + str3 + ")";
    }
}
