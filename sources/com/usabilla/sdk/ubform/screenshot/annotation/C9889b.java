package com.usabilla.sdk.ubform.screenshot.annotation;

import android.graphics.Bitmap;
import android.net.Uri;
import com.usabilla.sdk.ubform.sdk.C9912b;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.utils.behavior.C10114a;
import java.io.File;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.b */
public interface C9889b {

    /* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.b$a */
    public interface C9890a extends C9912b<C9891b> {
        /* renamed from: K */
        void mo20449K(boolean z);

        /* renamed from: V */
        void mo20450V(@C12579k Uri uri);

        /* renamed from: a0 */
        boolean mo20451a0();

        /* renamed from: n */
        void mo20452n(@C12579k File file, @C12579k Bitmap bitmap, @C12579k C10114a aVar);

        @C12579k
        /* renamed from: x */
        Uri mo20453x();
    }

    /* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.b$b */
    public interface C9891b {
        /* renamed from: G */
        void mo20373G(@C12579k Uri uri);

        /* renamed from: Q */
        void mo20376Q();

        /* renamed from: c0 */
        void mo20379c0(@C12579k Uri uri);

        /* renamed from: n */
        void mo20380n(@C12579k Uri uri);

        /* renamed from: r0 */
        void mo20382r0();

        /* renamed from: s0 */
        void mo20383s0(int i);

        /* renamed from: w0 */
        void mo20384w0(@C12579k Uri uri);

        /* renamed from: y */
        void mo20385y(@C12579k UbInternalTheme ubInternalTheme);
    }
}
