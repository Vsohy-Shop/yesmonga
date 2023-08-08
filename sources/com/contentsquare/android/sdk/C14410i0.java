package com.contentsquare.android.sdk;

import android.content.Context;
import java.io.File;

/* renamed from: com.contentsquare.android.sdk.i0 */
public class C14410i0 {

    /* renamed from: a */
    public C14451jd f35618a;

    /* renamed from: b */
    public String f35619b;

    public C14410i0(Context context) {
        this(new C14451jd(), context.getFilesDir().getAbsolutePath());
    }

    /* renamed from: a */
    public void mo35513a() {
        this.f35618a.mo35662g(new File(this.f35619b));
    }

    public C14410i0(C14451jd jdVar, String str) {
        this.f35618a = jdVar;
        this.f35619b = str + File.separator + "cs";
    }
}
