package com.urbanairship.iam;

import android.webkit.WebView;
import androidx.annotation.C0344h1;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.javascript.C9285a;
import com.urbanairship.javascript.C9289c;
import com.urbanairship.webkit.C9711g;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.iam.w */
public class C9258w extends C9711g {

    /* renamed from: f */
    public final InAppMessage f25227f;

    public C9258w(InAppMessage inAppMessage) {
        this.f25227f = inAppMessage;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    @C0346i
    /* renamed from: d */
    public C9285a.C9287b mo18613d(@C0359n0 C9285a.C9287b bVar, @C0359n0 WebView webView) {
        return super.mo18613d(bVar, webView).mo18679c("getMessageExtras", this.f25227f.mo18183o());
    }

    @C0344h1
    public C9258w(@C0359n0 C9289c cVar, @C0359n0 InAppMessage inAppMessage) {
        super(cVar);
        this.f25227f = inAppMessage;
    }
}
