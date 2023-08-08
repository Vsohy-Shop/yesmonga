package com.urbanairship.iam.html;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.iam.C9258w;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.javascript.C9289c;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.iam.html.d */
public abstract class C9201d extends C9258w {

    /* renamed from: g */
    public static final String f25048g = "dismiss";

    public C9201d(@C0359n0 InAppMessage inAppMessage) {
        super(inAppMessage);
    }

    /* renamed from: h */
    public void mo18479h(@C0359n0 WebView webView, @C0359n0 String str, @C0359n0 Uri uri) {
        if (str.equals("dismiss")) {
            String encodedPath = uri.getEncodedPath();
            if (encodedPath != null) {
                String[] split = encodedPath.split("/");
                if (split.length > 1) {
                    try {
                        mo18451n(JsonValue.m34960C(Uri.decode(split[1])));
                    } catch (JsonException e) {
                        C36059m.m148409e("Unable to decode message resolution from JSON.", e);
                    }
                } else {
                    C36059m.m148409e("Unable to decode message resolution, invalid path", new Object[0]);
                }
            } else {
                C36059m.m148409e("Unable to decode message resolution, missing path", new Object[0]);
            }
        }
    }

    /* renamed from: n */
    public abstract void mo18451n(@C0359n0 JsonValue jsonValue);

    @C0344h1
    public C9201d(@C0359n0 C9289c cVar, @C0359n0 InAppMessage inAppMessage) {
        super(cVar, inAppMessage);
    }
}
