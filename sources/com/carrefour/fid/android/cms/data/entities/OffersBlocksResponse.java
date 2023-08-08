package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/OffersBlocksResponse;", "", "title", "", "dates", "query", "image", "Lcom/carrefour/fid/android/cms/data/entities/OffersImageResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/cms/data/entities/OffersImageResponse;)V", "getDates", "()Ljava/lang/String;", "getImage", "()Lcom/carrefour/fid/android/cms/data/entities/OffersImageResponse;", "getQuery", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class OffersBlocksResponse {
    @C33608c("validity_dates")
    @C12580l
    private final String dates;
    @C33608c("image")
    @C12580l
    private final OffersImageResponse image;
    @C33608c("es_query_id")
    @C12580l
    private final String query;
    @C33608c("title")
    @C12580l
    private final String title;

    public OffersBlocksResponse(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l OffersImageResponse offersImageResponse) {
        this.title = str;
        this.dates = str2;
        this.query = str3;
        this.image = offersImageResponse;
    }

    public static /* synthetic */ OffersBlocksResponse copy$default(OffersBlocksResponse offersBlocksResponse, String str, String str2, String str3, OffersImageResponse offersImageResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offersBlocksResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = offersBlocksResponse.dates;
        }
        if ((i & 4) != 0) {
            str3 = offersBlocksResponse.query;
        }
        if ((i & 8) != 0) {
            offersImageResponse = offersBlocksResponse.image;
        }
        return offersBlocksResponse.copy(str, str2, str3, offersImageResponse);
    }

    @C12580l
    public final String component1() {
        return this.title;
    }

    @C12580l
    public final String component2() {
        return this.dates;
    }

    @C12580l
    public final String component3() {
        return this.query;
    }

    @C12580l
    public final OffersImageResponse component4() {
        return this.image;
    }

    @C12579k
    public final OffersBlocksResponse copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l OffersImageResponse offersImageResponse) {
        return new OffersBlocksResponse(str, str2, str3, offersImageResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersBlocksResponse)) {
            return false;
        }
        OffersBlocksResponse offersBlocksResponse = (OffersBlocksResponse) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) offersBlocksResponse.title) && Intrinsics.areEqual((Object) this.dates, (Object) offersBlocksResponse.dates) && Intrinsics.areEqual((Object) this.query, (Object) offersBlocksResponse.query) && Intrinsics.areEqual((Object) this.image, (Object) offersBlocksResponse.image);
    }

    @C12580l
    public final String getDates() {
        return this.dates;
    }

    @C12580l
    public final OffersImageResponse getImage() {
        return this.image;
    }

    @C12580l
    public final String getQuery() {
        return this.query;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dates;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.query;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OffersImageResponse offersImageResponse = this.image;
        if (offersImageResponse != null) {
            i = offersImageResponse.hashCode();
        }
        return hashCode3 + i;
    }

    @C12579k
    public String toString() {
        String str = this.title;
        String str2 = this.dates;
        String str3 = this.query;
        OffersImageResponse offersImageResponse = this.image;
        return "OffersBlocksResponse(title=" + str + ", dates=" + str2 + ", query=" + str3 + ", image=" + offersImageResponse + ")";
    }
}
