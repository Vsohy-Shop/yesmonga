package com.carrefour.fid.android.shared.p046io;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/io/NetWorkResponseThrowable;", "Lcom/carrefour/fid/android/shared/io/ResponseThrowable;", "message", "", "(Ljava/lang/String;)V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.io.NetWorkResponseThrowable */
public final class NetWorkResponseThrowable extends ResponseThrowable {

    /* renamed from: b */
    public static final int f70493b = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetWorkResponseThrowable(@C12579k String str) {
        super(-1, str);
        Intrinsics.checkNotNullParameter(str, "message");
    }
}
