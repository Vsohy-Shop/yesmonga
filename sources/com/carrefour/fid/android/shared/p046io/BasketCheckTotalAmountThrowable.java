package com.carrefour.fid.android.shared.p046io;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/io/BasketCheckTotalAmountThrowable;", "", "minAmount", "", "(D)V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.io.BasketCheckTotalAmountThrowable */
public final class BasketCheckTotalAmountThrowable extends Throwable {

    /* renamed from: a */
    public static final int f70463a = 0;

    public BasketCheckTotalAmountThrowable(double d) {
        super("The minimum amount is not reached (" + d + ")");
    }
}
