package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.urbanairship.remotedata.C9619j;

@C0376v0(19)
/* renamed from: androidx.documentfile.provider.b */
public class C18931b {

    /* renamed from: a */
    public static final String f48185a = "DocumentFile";

    /* renamed from: b */
    public static final int f48186b = 512;

    /* renamed from: a */
    public static boolean m88527a(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m88533g(context, uri))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m88528b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String g = m88533g(context, uri);
        int n = m88540n(context, uri, "flags", 0);
        if (TextUtils.isEmpty(g)) {
            return false;
        }
        if ((n & 4) != 0) {
            return true;
        }
        if ("vnd.android.document/directory".equals(g) && (n & 8) != 0) {
            return true;
        }
        if (TextUtils.isEmpty(g) || (n & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static void m88529c(@C0363p0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m88530d(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = false;
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            if (cursor.getCount() > 0) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(e);
            return false;
        } finally {
            m88529c(cursor);
        }
    }

    /* renamed from: e */
    public static long m88531e(Context context, Uri uri) {
        return m88541o(context, uri, "flags", 0);
    }

    @C0363p0
    /* renamed from: f */
    public static String m88532f(Context context, Uri uri) {
        return m88542p(context, uri, "_display_name", (String) null);
    }

    @C0363p0
    /* renamed from: g */
    public static String m88533g(Context context, Uri uri) {
        return m88542p(context, uri, "mime_type", (String) null);
    }

    @C0363p0
    /* renamed from: h */
    public static String m88534h(Context context, Uri uri) {
        String g = m88533g(context, uri);
        if ("vnd.android.document/directory".equals(g)) {
            return null;
        }
        return g;
    }

    /* renamed from: i */
    public static boolean m88535i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(m88533g(context, uri));
    }

    /* renamed from: j */
    public static boolean m88536j(Context context, Uri uri) {
        String g = m88533g(context, uri);
        if ("vnd.android.document/directory".equals(g) || TextUtils.isEmpty(g)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m88537k(Context context, Uri uri) {
        if (DocumentsContract.isDocumentUri(context, uri) && (m88531e(context, uri) & 512) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static long m88538l(Context context, Uri uri) {
        return m88541o(context, uri, C9619j.f26321I, 0);
    }

    /* renamed from: m */
    public static long m88539m(Context context, Uri uri) {
        return m88541o(context, uri, "_size", 0);
    }

    /* renamed from: n */
    public static int m88540n(Context context, Uri uri, String str, int i) {
        return (int) m88541o(context, uri, str, (long) i);
    }

    /* renamed from: o */
    public static long m88541o(Context context, Uri uri, String str, long j) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getLong(0);
            }
            m88529c(cursor);
            return j;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(e);
            return j;
        } finally {
            m88529c(cursor);
        }
    }

    @C0363p0
    /* renamed from: p */
    public static String m88542p(Context context, Uri uri, String str, @C0363p0 String str2) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getString(0);
            }
            m88529c(cursor);
            return str2;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(e);
            return str2;
        } finally {
            m88529c(cursor);
        }
    }
}
