package com.carrefour.fid.android.domain.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/StickersDomain;", "", "title", "", "stickersUrl", "stickersImageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStickersImageUrl", "()Ljava/lang/String;", "getStickersUrl", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class StickersDomain {
    public static final int $stable = 0;
    @C12579k
    private final String stickersImageUrl;
    @C12579k
    private final String stickersUrl;
    @C12579k
    private final String title;

    public StickersDomain(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "stickersUrl");
        Intrinsics.checkNotNullParameter(str3, "stickersImageUrl");
        this.title = str;
        this.stickersUrl = str2;
        this.stickersImageUrl = str3;
    }

    public static /* synthetic */ StickersDomain copy$default(StickersDomain stickersDomain, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stickersDomain.title;
        }
        if ((i & 2) != 0) {
            str2 = stickersDomain.stickersUrl;
        }
        if ((i & 4) != 0) {
            str3 = stickersDomain.stickersImageUrl;
        }
        return stickersDomain.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.title;
    }

    @C12579k
    public final String component2() {
        return this.stickersUrl;
    }

    @C12579k
    public final String component3() {
        return this.stickersImageUrl;
    }

    @C12579k
    public final StickersDomain copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "stickersUrl");
        Intrinsics.checkNotNullParameter(str3, "stickersImageUrl");
        return new StickersDomain(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersDomain)) {
            return false;
        }
        StickersDomain stickersDomain = (StickersDomain) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) stickersDomain.title) && Intrinsics.areEqual((Object) this.stickersUrl, (Object) stickersDomain.stickersUrl) && Intrinsics.areEqual((Object) this.stickersImageUrl, (Object) stickersDomain.stickersImageUrl);
    }

    @C12579k
    public final String getStickersImageUrl() {
        return this.stickersImageUrl;
    }

    @C12579k
    public final String getStickersUrl() {
        return this.stickersUrl;
    }

    @C12579k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.stickersUrl.hashCode()) * 31) + this.stickersImageUrl.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.title;
        String str2 = this.stickersUrl;
        String str3 = this.stickersImageUrl;
        return "StickersDomain(title=" + str + ", stickersUrl=" + str2 + ", stickersImageUrl=" + str3 + ")";
    }
}
