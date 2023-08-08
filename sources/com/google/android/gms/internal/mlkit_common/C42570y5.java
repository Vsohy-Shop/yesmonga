package com.google.android.gms.internal.mlkit_common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.mlkit_common.y5 */
public final class C42570y5 {

    /* renamed from: a */
    public static final String[] f107470a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};

    /* renamed from: b */
    public static final String[] f107471b;

    /* renamed from: c */
    public static final String[] f107472c;

    /* renamed from: d */
    public static final /* synthetic */ int f107473d = 0;

    static {
        boolean z;
        String str;
        String str2;
        String[] strArr = new String[2];
        strArr[0] = "media";
        String str3 = Build.HARDWARE;
        if (str3.equals(CommonUtils.f79239b) || str3.equals(CommonUtils.f79240c)) {
            z = true;
        } else {
            z = false;
        }
        String str4 = "";
        if (true != z) {
            str = str4;
        } else {
            str = "androidx.test.services.storage.runfiles";
        }
        strArr[1] = str;
        f107471b = strArr;
        String[] strArr2 = new String[3];
        int i = Build.VERSION.SDK_INT;
        if (i <= 25) {
            str2 = "com.google.android.inputmethod.latin.inputcontent";
        } else {
            str2 = str4;
        }
        strArr2[0] = str2;
        if (i <= 25) {
            str4 = "com.google.android.inputmethod.latin.dev.inputcontent";
        }
        strArr2[1] = str4;
        strArr2[2] = "com.google.android.apps.docs.storage.legacy";
        f107472c = strArr2;
    }

    /* renamed from: a */
    public static AssetFileDescriptor m171729a(Context context, Uri uri, String str) throws FileNotFoundException {
        C42309a5 a5Var = C42309a5.f106831d;
        ContentResolver contentResolver = context.getContentResolver();
        Uri c = m171731c(uri);
        String scheme = c.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(c, C28515a1.f68703k);
        }
        if ("content".equals(scheme)) {
            if (m171738j(context, c, 1, a5Var)) {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(c, C28515a1.f68703k);
                m171732d(openAssetFileDescriptor);
                return openAssetFileDescriptor;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(c, C28515a1.f68703k);
            m171732d(openAssetFileDescriptor2);
            try {
                m171737i(context, openAssetFileDescriptor2.getParcelFileDescriptor(), c, a5Var);
                return openAssetFileDescriptor2;
            } catch (FileNotFoundException e) {
                m171735g(openAssetFileDescriptor2, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                m171735g(openAssetFileDescriptor2, fileNotFoundException);
                throw fileNotFoundException;
            }
        } else {
            throw new FileNotFoundException("Not implemented. Contact tiktok-users@");
        }
    }

    /* renamed from: b */
    public static InputStream m171730b(Context context, Uri uri) throws FileNotFoundException {
        C42309a5 a5Var = C42309a5.f106831d;
        ContentResolver contentResolver = context.getContentResolver();
        Uri c = m171731c(uri);
        String scheme = c.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(c);
        }
        if ("content".equals(scheme)) {
            if (m171738j(context, c, 1, a5Var)) {
                InputStream openInputStream = contentResolver.openInputStream(c);
                m171732d(openInputStream);
                return openInputStream;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(c.getPath()).getCanonicalFile()), C28515a1.f68703k);
                try {
                    m171737i(context, openFileDescriptor, c, a5Var);
                    return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                } catch (FileNotFoundException e) {
                    m171736h(openFileDescriptor, e);
                    throw e;
                } catch (IOException e2) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                    fileNotFoundException.initCause(e2);
                    m171736h(openFileDescriptor, fileNotFoundException);
                    throw fileNotFoundException;
                }
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
                fileNotFoundException2.initCause(e3);
                throw fileNotFoundException2;
            }
        } else {
            throw new FileNotFoundException("Not implemented. Contact tiktok-users@");
        }
    }

    /* renamed from: c */
    public static Uri m171731c(Uri uri) {
        if (Build.VERSION.SDK_INT < 30) {
            return Uri.parse(uri.toString());
        }
        return uri;
    }

    /* renamed from: d */
    public static <T> T m171732d(T t) throws FileNotFoundException {
        if (t != null) {
            return t;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }

    /* renamed from: e */
    public static String m171733e(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith("/")) {
            return canonicalPath.concat("/");
        }
        return canonicalPath;
    }

    /* renamed from: f */
    public static void m171734f(Exception exc, Exception exc2) {
        exc.addSuppressed(exc2);
    }

    /* renamed from: g */
    public static void m171735g(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            m171734f(fileNotFoundException, e);
        }
    }

    /* renamed from: h */
    public static void m171736h(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            m171734f(fileNotFoundException, e);
        }
    }

    /* renamed from: i */
    public static void m171737i(Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, C42309a5 a5Var) throws IOException {
        String str;
        String str2;
        File h;
        String str3;
        String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        C42412j9 a = C42412j9.m171552a(parcelFileDescriptor.getFileDescriptor());
        C42412j9 b = C42412j9.m171553b(canonicalPath);
        if (b.f107145c) {
            String valueOf = String.valueOf(canonicalPath);
            if (valueOf.length() != 0) {
                str3 = "Can't open file: ".concat(valueOf);
            } else {
                str3 = new String("Can't open file: ");
            }
            throw new FileNotFoundException(str3);
        } else if (a.f107143a == b.f107143a && a.f107144b == b.f107144b) {
            if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
                boolean unused = a5Var.f106834b;
                File h2 = C17318d.m79725h(context);
                boolean z = true;
                if (h2 == null ? !canonicalPath.startsWith(m171733e(Environment.getDataDirectory())) : !canonicalPath.startsWith(m171733e(h2))) {
                    Context b2 = C17318d.m79719b(context);
                    if (b2 == null || (h = C17318d.m79725h(b2)) == null || !canonicalPath.startsWith(m171733e(h))) {
                        File[] k = m171739k(new C42534v(context));
                        int length = k.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                File file = k[i];
                                if (file != null && canonicalPath.startsWith(m171733e(file))) {
                                    break;
                                }
                                i++;
                            } else {
                                File[] k2 = m171739k(new C42545w0(context));
                                int length2 = k2.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length2) {
                                        File file2 = k2[i2];
                                        if (file2 != null && canonicalPath.startsWith(m171733e(file2))) {
                                            break;
                                        }
                                        i2++;
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (z == a5Var.f106833a) {
                    return;
                }
            }
            if (canonicalPath.length() != 0) {
                str2 = "Can't open file: ".concat(canonicalPath);
            } else {
                str2 = new String("Can't open file: ");
            }
            throw new FileNotFoundException(str2);
        } else {
            String valueOf2 = String.valueOf(canonicalPath);
            if (valueOf2.length() != 0) {
                str = "Can't open file: ".concat(valueOf2);
            } else {
                str = new String("Can't open file: ");
            }
            throw new FileNotFoundException(str);
        }
    }

    /* renamed from: j */
    public static boolean m171738j(Context context, Uri uri, int i, C42309a5 a5Var) {
        String authority = uri.getAuthority();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                if (!a5Var.f106833a) {
                    return true;
                }
                return false;
            }
        }
        int c = C42309a5.m171396c(a5Var, context, new C42423k9(uri, resolveContentProvider, authority)) - 1;
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return false;
        }
        if (context.getPackageName().equals(resolveContentProvider.packageName)) {
            return a5Var.f106833a;
        }
        if (a5Var.f106833a) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && resolveContentProvider.exported) {
            String[] strArr = f107471b;
            int length = strArr.length;
            for (int i2 = 0; i2 < 2; i2++) {
                if (strArr[i2].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = f107472c;
            int length2 = strArr2.length;
            for (int i3 = 0; i3 < 3; i3++) {
                if (strArr2[i3].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = f107470a;
            for (int i4 = 0; i4 < 6; i4++) {
                String str = strArr3[i4];
                if (str.charAt(str.length() - 1) == '.') {
                    if (resolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (resolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: k */
    public static File[] m171739k(Callable<File[]> callable) {
        try {
            return callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
