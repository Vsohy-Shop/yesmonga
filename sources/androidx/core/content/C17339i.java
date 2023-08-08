package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0351j1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.carrefour.fid.android.shared.constant.C28515a1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jsoup.helper.C12744c;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.i */
public class C17339i extends ContentProvider {
    @C0323b0("sCache")

    /* renamed from: E0 */
    public static final HashMap<String, C17341b> f45593E0 = new HashMap<>();

    /* renamed from: X */
    public static final String f45594X = "path";

    /* renamed from: Y */
    public static final String f45595Y = "displayName";

    /* renamed from: Z */
    public static final File f45596Z = new File("/");

    /* renamed from: c */
    public static final String[] f45597c = {"_display_name", "_size"};

    /* renamed from: d */
    public static final String f45598d = "android.support.FILE_PROVIDER_PATHS";

    /* renamed from: e */
    public static final String f45599e = "root-path";

    /* renamed from: f */
    public static final String f45600f = "files-path";

    /* renamed from: g */
    public static final String f45601g = "cache-path";

    /* renamed from: v */
    public static final String f45602v = "external-path";

    /* renamed from: w */
    public static final String f45603w = "external-files-path";

    /* renamed from: x */
    public static final String f45604x = "external-cache-path";

    /* renamed from: y */
    public static final String f45605y = "external-media-path";

    /* renamed from: z */
    public static final String f45606z = "name";

    /* renamed from: a */
    public C17341b f45607a;

    /* renamed from: b */
    public int f45608b;

    @C0376v0(21)
    /* renamed from: androidx.core.content.i$a */
    public static class C17340a {
        @C0373u
        /* renamed from: a */
        public static File[] m79777a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: androidx.core.content.i$b */
    public interface C17341b {
        /* renamed from: a */
        Uri mo51757a(File file);

        /* renamed from: b */
        File mo51758b(Uri uri);
    }

    /* renamed from: androidx.core.content.i$c */
    public static class C17342c implements C17341b {

        /* renamed from: a */
        public final String f45609a;

        /* renamed from: b */
        public final HashMap<String, File> f45610b = new HashMap<>();

        public C17342c(String str) {
            this.f45609a = str;
        }

        /* renamed from: a */
        public Uri mo51757a(File file) {
            String str;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry next : this.f45610b.entrySet()) {
                    String path = ((File) next.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = next;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    if (path2.endsWith("/")) {
                        str = canonicalPath.substring(path2.length());
                    } else {
                        str = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.f45609a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(str, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* renamed from: b */
        public File mo51758b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f45610b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }

        /* renamed from: c */
        public void mo51759c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f45610b.put(str, file.getCanonicalFile());
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }
    }

    public C17339i() {
        this.f45608b = 0;
    }

    /* renamed from: a */
    public static File m79768a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: b */
    public static Object[] m79769b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* renamed from: c */
    public static String[] m79770c(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    @C0344h1
    /* renamed from: d */
    public static XmlResourceParser m79771d(Context context, String str, @C0363p0 ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt(f45598d, i);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), f45598d);
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    /* renamed from: e */
    public static C17341b m79772e(Context context, String str, int i) {
        C17341b bVar;
        HashMap<String, C17341b> hashMap = f45593E0;
        synchronized (hashMap) {
            bVar = hashMap.get(str);
            if (bVar == null) {
                try {
                    bVar = m79776i(context, str, i);
                    hashMap.put(str, bVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return bVar;
    }

    /* renamed from: f */
    public static Uri m79773f(@C0359n0 Context context, @C0359n0 String str, @C0359n0 File file) {
        return m79772e(context, str, 0).mo51757a(file);
    }

    @SuppressLint({"StreamFiles"})
    @C0359n0
    /* renamed from: g */
    public static Uri m79774g(@C0359n0 Context context, @C0359n0 String str, @C0359n0 File file, @C0359n0 String str2) {
        return m79773f(context, str, file).buildUpon().appendQueryParameter(f45595Y, str2).build();
    }

    /* renamed from: h */
    public static int m79775h(String str) {
        if (C28515a1.f68703k.equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: i */
    public static C17341b m79776i(Context context, String str, int i) throws IOException, XmlPullParserException {
        C17342c cVar = new C17342c(str);
        XmlResourceParser d = m79771d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = d.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = d.getName();
                File file = null;
                String attributeValue = d.getAttributeValue((String) null, "name");
                String attributeValue2 = d.getAttributeValue((String) null, "path");
                if (f45599e.equals(name)) {
                    file = f45596Z;
                } else if (f45600f.equals(name)) {
                    file = context.getFilesDir();
                } else if (f45601g.equals(name)) {
                    file = context.getCacheDir();
                } else if (f45602v.equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if (f45603w.equals(name)) {
                    File[] k = C17318d.m79728k(context, (String) null);
                    if (k.length > 0) {
                        file = k[0];
                    }
                } else if (f45604x.equals(name)) {
                    File[] j = C17318d.m79727j(context);
                    if (j.length > 0) {
                        file = j[0];
                    }
                } else if (f45605y.equals(name)) {
                    File[] a = C17340a.m79777a(context);
                    if (a.length > 0) {
                        file = a[0];
                    }
                }
                if (file != null) {
                    cVar.mo51759c(attributeValue, m79768a(file, attributeValue2));
                }
            }
        }
    }

    public void attachInfo(@C0359n0 Context context, @C0359n0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            HashMap<String, C17341b> hashMap = f45593E0;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
            this.f45607a = m79772e(context, str, this.f45608b);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(@C0359n0 Uri uri, @C0363p0 String str, @C0363p0 String[] strArr) {
        return this.f45607a.mo51758b(uri).delete() ? 1 : 0;
    }

    @C0363p0
    public String getType(@C0359n0 Uri uri) {
        String mimeTypeFromExtension;
        File b = this.f45607a.mo51758b(uri);
        int lastIndexOf = b.getName().lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b.getName().substring(lastIndexOf + 1))) == null) {
            return C12744c.f31476j;
        }
        return mimeTypeFromExtension;
    }

    public Uri insert(@C0359n0 Uri uri, @C0359n0 ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@C0359n0 Uri uri, @C0359n0 String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f45607a.mo51758b(uri), m79775h(str));
    }

    @C0359n0
    public Cursor query(@C0359n0 Uri uri, @C0363p0 String[] strArr, @C0363p0 String str, @C0363p0 String[] strArr2, @C0363p0 String str2) {
        int i;
        String str3;
        File b = this.f45607a.mo51758b(uri);
        String queryParameter = uri.getQueryParameter(f45595Y);
        if (strArr == null) {
            strArr = f45597c;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    str3 = b.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i2] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(b.length());
            }
            i2 = i;
        }
        String[] c = m79770c(strArr3, i2);
        Object[] b2 = m79769b(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(c, 1);
        matrixCursor.addRow(b2);
        return matrixCursor;
    }

    public int update(@C0359n0 Uri uri, @C0359n0 ContentValues contentValues, @C0363p0 String str, @C0363p0 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public C17339i(@C0351j1 int i) {
        this.f45608b = i;
    }
}
