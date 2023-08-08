package com.usabilla.sdk.ubform.sdk.field.contract;

import android.content.Context;
import android.graphics.Bitmap;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.field.contract.common.C9964a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.contract.h */
public interface C9980h {

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.contract.h$a */
    public interface C9981a {
        /* renamed from: I */
        void mo20856I();

        @C12580l
        /* renamed from: P */
        Bitmap mo20857P(@C12579k Context context);

        @C12580l
        /* renamed from: Z */
        String mo20858Z();

        /* renamed from: a */
        void mo20859a(@C12580l UbScreenshot ubScreenshot);
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.contract.h$b */
    public interface C9982b extends C9964a.C9966b {
        @C12579k
        /* renamed from: b */
        Context mo20860b();

        void setupScreenshot();
    }
}
