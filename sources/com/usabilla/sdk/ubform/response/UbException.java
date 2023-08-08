package com.usabilla.sdk.ubform.response;

import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0006\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u0001\u0002\b\t¨\u0006\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/response/UbException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "t", "", "(Ljava/lang/Throwable;)V", "UbInvalidCampaignException", "UbParseException", "Lcom/usabilla/sdk/ubform/response/UbException$UbInvalidCampaignException;", "Lcom/usabilla/sdk/ubform/response/UbException$UbParseException;", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public abstract class UbException extends Exception {

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/response/UbException$UbInvalidCampaignException;", "Lcom/usabilla/sdk/ubform/response/UbException;", "t", "", "(Ljava/lang/Throwable;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class UbInvalidCampaignException extends UbException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UbInvalidCampaignException(@C12579k Throwable th) {
            super(th, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(th, C10108c.f27801d);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/response/UbException$UbParseException;", "Lcom/usabilla/sdk/ubform/response/UbException;", "t", "", "(Ljava/lang/Throwable;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class UbParseException extends UbException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UbParseException(@C12579k Throwable th) {
            super(th, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(th, C10108c.f27801d);
        }
    }

    public /* synthetic */ UbException(Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(th);
    }

    public UbException(Throwable th) {
        super(th);
    }
}
