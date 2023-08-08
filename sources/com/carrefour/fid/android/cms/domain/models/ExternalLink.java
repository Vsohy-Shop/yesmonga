package com.carrefour.fid.android.cms.domain.models;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/models/ExternalLink;", "Lcom/carrefour/fid/android/cms/domain/models/LinkDomain;", "title", "", "uri", "contentId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getTitle", "getUri", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ExternalLink implements LinkDomain {
    @C12580l
    private final String contentId;
    @C12579k
    private final String title;
    @C12580l
    private final String uri;

    public ExternalLink(@C12579k String str, @C12580l String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "title");
        this.title = str;
        this.uri = str2;
        this.contentId = str3;
    }

    public static /* synthetic */ ExternalLink copy$default(ExternalLink externalLink, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalLink.title;
        }
        if ((i & 2) != 0) {
            str2 = externalLink.uri;
        }
        if ((i & 4) != 0) {
            str3 = externalLink.contentId;
        }
        return externalLink.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.title;
    }

    @C12580l
    public final String component2() {
        return this.uri;
    }

    @C12580l
    public final String component3() {
        return this.contentId;
    }

    @C12579k
    public final ExternalLink copy(@C12579k String str, @C12580l String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "title");
        return new ExternalLink(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalLink)) {
            return false;
        }
        ExternalLink externalLink = (ExternalLink) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) externalLink.title) && Intrinsics.areEqual((Object) this.uri, (Object) externalLink.uri) && Intrinsics.areEqual((Object) this.contentId, (Object) externalLink.contentId);
    }

    @C12580l
    public final String getContentId() {
        return this.contentId;
    }

    @C12579k
    public final String getTitle() {
        return this.title;
    }

    @C12580l
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.uri;
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
        String str2 = this.uri;
        String str3 = this.contentId;
        return "ExternalLink(title=" + str + ", uri=" + str2 + ", contentId=" + str3 + ")";
    }
}
