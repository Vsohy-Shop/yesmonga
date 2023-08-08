package com.contentsquare.android.sdk;

import android.content.Context;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.h9 */
public final class C14399h9 {

    /* renamed from: a */
    public C14839wd f35601a = new C14839wd();

    /* renamed from: a */
    public final boolean mo35501a(Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C14839wd wdVar = this.f35601a;
        if (wdVar == null) {
            return true;
        }
        Intrinsics.checkNotNull(wdVar);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        return wdVar.mo36770a(applicationContext);
    }
}
