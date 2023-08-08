package androidx.core.net;

import android.net.Uri;
import androidx.annotation.C0359n0;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.google.firebase.installations.C33124s;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.core.net.e */
public final class C17770e {
    @C0359n0
    /* renamed from: a */
    public static String m81141a(@C0359n0 Uri uri) {
        String str;
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase(C28531e0.f69081k) || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase(C17767c.f46168c) || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(scheme);
                sb.append(C12361b.f30257h);
                if (schemeSpecificPart != null) {
                    for (int i = 0; i < schemeSpecificPart.length(); i++) {
                        char charAt = schemeSpecificPart.charAt(i);
                        if (charAt == '-' || charAt == '@' || charAt == '.') {
                            sb.append(charAt);
                        } else {
                            sb.append('x');
                        }
                    }
                }
                return sb.toString();
            } else if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("//");
                String str2 = "";
                if (uri.getHost() != null) {
                    str = uri.getHost();
                } else {
                    str = str2;
                }
                sb2.append(str);
                if (uri.getPort() != -1) {
                    str2 = C33124s.f80355c + uri.getPort();
                }
                sb2.append(str2);
                sb2.append("/...");
                schemeSpecificPart = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder(64);
        if (scheme != null) {
            sb3.append(scheme);
            sb3.append(C12361b.f30257h);
        }
        if (schemeSpecificPart != null) {
            sb3.append(schemeSpecificPart);
        }
        return sb3.toString();
    }
}
