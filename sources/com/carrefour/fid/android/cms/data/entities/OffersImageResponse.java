package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import com.urbanairship.iam.C9127a0;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/OffersImageResponse;", "", "title", "", "image", "Lcom/carrefour/fid/android/cms/data/entities/OfferImageUrlResponse;", "(Ljava/lang/String;Lcom/carrefour/fid/android/cms/data/entities/OfferImageUrlResponse;)V", "getImage", "()Lcom/carrefour/fid/android/cms/data/entities/OfferImageUrlResponse;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class OffersImageResponse {
    @C33608c("image")
    @C12579k
    private final OfferImageUrlResponse image;
    @C33608c("title")
    @C12580l
    private final String title;

    public OffersImageResponse(@C12580l String str, @C12579k OfferImageUrlResponse offerImageUrlResponse) {
        Intrinsics.checkNotNullParameter(offerImageUrlResponse, C9127a0.f24709d);
        this.title = str;
        this.image = offerImageUrlResponse;
    }

    public static /* synthetic */ OffersImageResponse copy$default(OffersImageResponse offersImageResponse, String str, OfferImageUrlResponse offerImageUrlResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offersImageResponse.title;
        }
        if ((i & 2) != 0) {
            offerImageUrlResponse = offersImageResponse.image;
        }
        return offersImageResponse.copy(str, offerImageUrlResponse);
    }

    @C12580l
    public final String component1() {
        return this.title;
    }

    @C12579k
    public final OfferImageUrlResponse component2() {
        return this.image;
    }

    @C12579k
    public final OffersImageResponse copy(@C12580l String str, @C12579k OfferImageUrlResponse offerImageUrlResponse) {
        Intrinsics.checkNotNullParameter(offerImageUrlResponse, C9127a0.f24709d);
        return new OffersImageResponse(str, offerImageUrlResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersImageResponse)) {
            return false;
        }
        OffersImageResponse offersImageResponse = (OffersImageResponse) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) offersImageResponse.title) && Intrinsics.areEqual((Object) this.image, (Object) offersImageResponse.image);
    }

    @C12579k
    public final OfferImageUrlResponse getImage() {
        return this.image;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.image.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.title;
        OfferImageUrlResponse offerImageUrlResponse = this.image;
        return "OffersImageResponse(title=" + str + ", image=" + offerImageUrlResponse + ")";
    }
}
