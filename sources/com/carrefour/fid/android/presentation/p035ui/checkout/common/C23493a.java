package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import android.content.Context;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.type.BasketPromoErrorType;
import com.carrefour.fid.android.domain.exceptions.AddPromoCodeThrowable;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.a */
public final class C23493a {
    @C12580l
    /* renamed from: a */
    public static final String m104659a(@C12579k Context context, @C12580l Throwable th) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (th instanceof AddPromoCodeThrowable) {
            AddPromoCodeThrowable addPromoCodeThrowable = (AddPromoCodeThrowable) th;
            return context.getString(BasketPromoErrorType.f89816a.mo108473a(addPromoCodeThrowable.mo114262a()).mo108472r(), new Object[]{addPromoCodeThrowable.mo114263b()});
        } else if (th instanceof NetworkException) {
            return context.getString(R.string.error_no_internet_connexion);
        } else {
            if (th == null) {
                return null;
            }
            return context.getString(R.string.checkout_error_message_default);
        }
    }
}
