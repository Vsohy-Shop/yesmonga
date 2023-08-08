package com.carrefour.fid.android.loyalty.data.models.body;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33606a;
import com.google.gson.annotations.C33608c;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/body/GetOtpBody;", "Ljava/io/Serializable;", "channelId", "", "(Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class GetOtpBody implements Serializable {
    @C33608c("channel_id")
    @C12580l
    @C33606a
    private final String channelId;

    public GetOtpBody() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GetOtpBody copy$default(GetOtpBody getOtpBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getOtpBody.channelId;
        }
        return getOtpBody.copy(str);
    }

    @C12580l
    public final String component1() {
        return this.channelId;
    }

    @C12579k
    public final GetOtpBody copy(@C12580l String str) {
        return new GetOtpBody(str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetOtpBody) && Intrinsics.areEqual((Object) this.channelId, (Object) ((GetOtpBody) obj).channelId);
    }

    @C12580l
    public final String getChannelId() {
        return this.channelId;
    }

    public int hashCode() {
        String str = this.channelId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.channelId;
        return "GetOtpBody(channelId=" + str + ")";
    }

    public GetOtpBody(@C12580l String str) {
        this.channelId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetOtpBody(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str);
    }
}
