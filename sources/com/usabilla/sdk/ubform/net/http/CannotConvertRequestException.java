package com.usabilla.sdk.ubform.net.http;

import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/net/http/CannotConvertRequestException;", "", "error", "", "(Ljava/lang/String;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class CannotConvertRequestException extends Throwable {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CannotConvertRequestException(@C12579k String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "error");
    }
}
