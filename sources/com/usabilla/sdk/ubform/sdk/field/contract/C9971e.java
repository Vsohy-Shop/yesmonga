package com.usabilla.sdk.ubform.sdk.field.contract;

import android.graphics.Bitmap;
import android.text.Html;
import com.usabilla.sdk.ubform.sdk.field.contract.common.C9964a;
import com.usabilla.sdk.ubform.utils.C10145l;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.contract.e */
public interface C9971e {

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.contract.e$a */
    public interface C9972a {
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.contract.e$b */
    public interface C9973b extends C9964a.C9966b {
        /* renamed from: h */
        void mo20845h();

        /* renamed from: i */
        void mo20846i(@C12579k C10145l.C10146a aVar, @C12579k Bitmap bitmap);

        void setHtmlText(@C12579k String str, @C12579k Html.ImageGetter imageGetter);

        void setParagraphText(@C12579k String str);
    }
}
