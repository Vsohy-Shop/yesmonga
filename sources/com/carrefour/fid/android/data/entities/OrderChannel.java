package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderChannel;", "", "channelCommunicationCode", "", "communicationChannelName", "communicationValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelCommunicationCode", "()Ljava/lang/String;", "getCommunicationChannelName", "getCommunicationValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OrderChannel {
    public static final int $stable = 0;
    @C33608c("channel_communication_code")
    @C12579k
    private final String channelCommunicationCode;
    @C33608c("communication_channel_name")
    @C12579k
    private final String communicationChannelName;
    @C33608c("communication_value")
    @C12579k
    private final String communicationValue;

    public OrderChannel() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OrderChannel copy$default(OrderChannel orderChannel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderChannel.channelCommunicationCode;
        }
        if ((i & 2) != 0) {
            str2 = orderChannel.communicationChannelName;
        }
        if ((i & 4) != 0) {
            str3 = orderChannel.communicationValue;
        }
        return orderChannel.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.channelCommunicationCode;
    }

    @C12579k
    public final String component2() {
        return this.communicationChannelName;
    }

    @C12579k
    public final String component3() {
        return this.communicationValue;
    }

    @C12579k
    public final OrderChannel copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "channelCommunicationCode");
        Intrinsics.checkNotNullParameter(str2, "communicationChannelName");
        Intrinsics.checkNotNullParameter(str3, "communicationValue");
        return new OrderChannel(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderChannel)) {
            return false;
        }
        OrderChannel orderChannel = (OrderChannel) obj;
        return Intrinsics.areEqual((Object) this.channelCommunicationCode, (Object) orderChannel.channelCommunicationCode) && Intrinsics.areEqual((Object) this.communicationChannelName, (Object) orderChannel.communicationChannelName) && Intrinsics.areEqual((Object) this.communicationValue, (Object) orderChannel.communicationValue);
    }

    @C12579k
    public final String getChannelCommunicationCode() {
        return this.channelCommunicationCode;
    }

    @C12579k
    public final String getCommunicationChannelName() {
        return this.communicationChannelName;
    }

    @C12579k
    public final String getCommunicationValue() {
        return this.communicationValue;
    }

    public int hashCode() {
        return (((this.channelCommunicationCode.hashCode() * 31) + this.communicationChannelName.hashCode()) * 31) + this.communicationValue.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.channelCommunicationCode;
        String str2 = this.communicationChannelName;
        String str3 = this.communicationValue;
        return "OrderChannel(channelCommunicationCode=" + str + ", communicationChannelName=" + str2 + ", communicationValue=" + str3 + ")";
    }

    public OrderChannel(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "channelCommunicationCode");
        Intrinsics.checkNotNullParameter(str2, "communicationChannelName");
        Intrinsics.checkNotNullParameter(str3, "communicationValue");
        this.channelCommunicationCode = str;
        this.communicationChannelName = str2;
        this.communicationValue = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderChannel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "MOBILE_APP" : str, (i & 2) != 0 ? "null" : str2, (i & 4) != 0 ? "null" : str3);
    }
}
