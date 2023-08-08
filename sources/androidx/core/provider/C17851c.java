package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.io.FileNotFoundException;

/* renamed from: androidx.core.provider.c */
public final class C17851c {

    /* renamed from: a */
    public static final String f46224a = "tree";

    /* renamed from: androidx.core.provider.c$a */
    public static final class C17852a {

        /* renamed from: a */
        public static final int f46225a = 512;
    }

    @C0376v0(19)
    /* renamed from: androidx.core.provider.c$b */
    public static class C17853b {
        @C0373u
        /* renamed from: a */
        public static Uri m81330a(String str, String str2) {
            return DocumentsContract.buildDocumentUri(str, str2);
        }

        @C0373u
        /* renamed from: b */
        public static boolean m81331b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
            return DocumentsContract.deleteDocument(contentResolver, uri);
        }

        @C0373u
        /* renamed from: c */
        public static String m81332c(Uri uri) {
            return DocumentsContract.getDocumentId(uri);
        }

        @C0373u
        /* renamed from: d */
        public static boolean m81333d(Context context, @C0363p0 Uri uri) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.provider.c$c */
    public static class C17854c {
        @C0373u
        /* renamed from: a */
        public static Uri m81334a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @C0373u
        /* renamed from: b */
        public static Uri m81335b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @C0373u
        /* renamed from: c */
        public static Uri m81336c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @C0373u
        /* renamed from: d */
        public static Uri m81337d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @C0373u
        /* renamed from: e */
        public static Uri m81338e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @C0373u
        /* renamed from: f */
        public static String m81339f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @C0373u
        /* renamed from: g */
        public static Uri m81340g(@C0359n0 ContentResolver contentResolver, @C0359n0 Uri uri, @C0359n0 String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.provider.c$d */
    public static class C17855d {
        @C0373u
        /* renamed from: a */
        public static boolean m81341a(@C0359n0 Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @C0373u
        /* renamed from: b */
        public static boolean m81342b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    @C0363p0
    /* renamed from: a */
    public static Uri m81318a(@C0359n0 String str, @C0363p0 String str2) {
        return C17854c.m81334a(str, str2);
    }

    @C0363p0
    /* renamed from: b */
    public static Uri m81319b(@C0359n0 Uri uri, @C0359n0 String str) {
        return C17854c.m81335b(uri, str);
    }

    @C0363p0
    /* renamed from: c */
    public static Uri m81320c(@C0359n0 String str, @C0359n0 String str2) {
        return C17853b.m81330a(str, str2);
    }

    @C0363p0
    /* renamed from: d */
    public static Uri m81321d(@C0359n0 Uri uri, @C0359n0 String str) {
        return C17854c.m81336c(uri, str);
    }

    @C0363p0
    /* renamed from: e */
    public static Uri m81322e(@C0359n0 String str, @C0359n0 String str2) {
        return C17854c.m81337d(str, str2);
    }

    @C0363p0
    /* renamed from: f */
    public static Uri m81323f(@C0359n0 ContentResolver contentResolver, @C0359n0 Uri uri, @C0359n0 String str, @C0359n0 String str2) throws FileNotFoundException {
        return C17854c.m81338e(contentResolver, uri, str, str2);
    }

    @C0363p0
    /* renamed from: g */
    public static String m81324g(@C0359n0 Uri uri) {
        return C17853b.m81332c(uri);
    }

    @C0363p0
    /* renamed from: h */
    public static String m81325h(@C0359n0 Uri uri) {
        return C17854c.m81339f(uri);
    }

    /* renamed from: i */
    public static boolean m81326i(@C0359n0 Context context, @C0363p0 Uri uri) {
        return C17853b.m81333d(context, uri);
    }

    /* renamed from: j */
    public static boolean m81327j(@C0359n0 Uri uri) {
        return C17855d.m81341a(uri);
    }

    /* renamed from: k */
    public static boolean m81328k(@C0359n0 ContentResolver contentResolver, @C0359n0 Uri uri, @C0359n0 Uri uri2) throws FileNotFoundException {
        return C17855d.m81342b(contentResolver, uri, uri2);
    }

    @C0363p0
    /* renamed from: l */
    public static Uri m81329l(@C0359n0 ContentResolver contentResolver, @C0359n0 Uri uri, @C0359n0 String str) throws FileNotFoundException {
        return C17854c.m81340g(contentResolver, uri, str);
    }
}
