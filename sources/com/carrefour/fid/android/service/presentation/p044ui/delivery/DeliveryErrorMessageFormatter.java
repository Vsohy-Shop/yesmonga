package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import android.content.Context;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.shared.p046io.NetWorkResponseThrowable;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryErrorMessageFormatter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "deliveryError", "", "error", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryErrorMessageFormatter */
public final class DeliveryErrorMessageFormatter {
    @C12579k
    private final Context context;

    public DeliveryErrorMessageFormatter(@C12579k Context context2) {
        Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
        this.context = context2;
    }

    @C12579k
    public final String deliveryError(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "error");
        if (th instanceof NetWorkResponseThrowable) {
            String string = this.context.getString(C28330R.string.general_error_no_network_message);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…error_no_network_message)");
            return string;
        }
        String string2 = this.context.getString(C28330R.string.general_error_parameters_server_not_responding_01);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…server_not_responding_01)");
        return string2;
    }
}
