package androidx.webkit.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* renamed from: androidx.webkit.internal.q0 */
public class C20916q0 {

    /* renamed from: b */
    public static final String f54006b = "text/plain";
    @C0359n0

    /* renamed from: a */
    public Context f54007a;

    public C20916q0(@C0359n0 Context context) {
        this.f54007a = context;
    }

    @C0359n0
    /* renamed from: a */
    public static String m96955a(@C0359n0 File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.endsWith("/")) {
            return canonicalPath;
        }
        return canonicalPath + "/";
    }

    @C0363p0
    /* renamed from: b */
    public static File m96956b(@C0359n0 File file, @C0359n0 String str) throws IOException {
        String a = m96955a(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(a)) {
            return new File(canonicalPath);
        }
        return null;
    }

    @C0359n0
    /* renamed from: c */
    public static File m96957c(@C0359n0 Context context) {
        return C20873d.m96839e(context);
    }

    @C0359n0
    /* renamed from: f */
    public static String m96958f(@C0359n0 String str) {
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return guessContentTypeFromName == null ? "text/plain" : guessContentTypeFromName;
    }

    @C0359n0
    /* renamed from: g */
    public static InputStream m96959g(@C0359n0 String str, @C0359n0 InputStream inputStream) throws IOException {
        if (str.endsWith(".svgz")) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    @C0359n0
    /* renamed from: i */
    public static InputStream m96960i(@C0359n0 File file) throws FileNotFoundException, IOException {
        return m96959g(file.getPath(), new FileInputStream(file));
    }

    @C0359n0
    /* renamed from: k */
    public static String m96961k(@C0359n0 String str) {
        if (str.length() <= 1 || str.charAt(0) != '/') {
            return str;
        }
        return str.substring(1);
    }

    /* renamed from: d */
    public final int mo62669d(@C0359n0 String str, @C0359n0 String str2) {
        return this.f54007a.getResources().getIdentifier(str2, str, this.f54007a.getPackageName());
    }

    /* renamed from: e */
    public final int mo62670e(int i) {
        TypedValue typedValue = new TypedValue();
        this.f54007a.getResources().getValue(i, typedValue, true);
        return typedValue.type;
    }

    @C0359n0
    /* renamed from: h */
    public InputStream mo62671h(@C0359n0 String str) throws IOException {
        String k = m96961k(str);
        return m96959g(k, this.f54007a.getAssets().open(k, 2));
    }

    @C0359n0
    /* renamed from: j */
    public InputStream mo62672j(@C0359n0 String str) throws Resources.NotFoundException, IOException {
        String k = m96961k(str);
        String[] split = k.split("/", -1);
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            int lastIndexOf = str3.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str3 = str3.substring(0, lastIndexOf);
            }
            int d = mo62669d(str2, str3);
            int e = mo62670e(d);
            if (e == 3) {
                return m96959g(k, this.f54007a.getResources().openRawResource(d));
            }
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", new Object[]{k, Integer.valueOf(e)}));
        }
        throw new IllegalArgumentException("Incorrect resource path: " + k);
    }
}
