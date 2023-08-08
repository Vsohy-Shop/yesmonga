package com.carrefour.fid.android.various.core;

import com.carrefour.fid.android.various.domain.model.AppMessageType;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/various/core/NoAppNotificationThrowable;", "", "type", "Lcom/carrefour/fid/android/various/domain/model/AppMessageType;", "(Lcom/carrefour/fid/android/various/domain/model/AppMessageType;)V", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NoAppNotificationThrowable extends Throwable {
    public NoAppNotificationThrowable() {
        this((AppMessageType) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NoAppNotificationThrowable(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.various.domain.model.AppMessageType r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            java.lang.String r3 = "app"
        L_0x0004:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " notification."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.core.NoAppNotificationThrowable.<init>(com.carrefour.fid.android.various.domain.model.AppMessageType):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoAppNotificationThrowable(AppMessageType appMessageType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : appMessageType);
    }
}
