package androidx.documentfile.provider;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.C0363p0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.helper.C12744c;

/* renamed from: androidx.documentfile.provider.c */
public class C18932c extends C18930a {

    /* renamed from: c */
    public File f48187c;

    public C18932c(@C0363p0 C18930a aVar, File file) {
        super(aVar);
        this.f48187c = file;
    }

    /* renamed from: w */
    public static boolean m88543w(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= m88543w(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to delete ");
                    sb.append(file2);
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: x */
    public static String m88544x(String str) {
        String mimeTypeFromExtension;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1).toLowerCase())) == null) {
            return C12744c.f31476j;
        }
        return mimeTypeFromExtension;
    }

    /* renamed from: a */
    public boolean mo55724a() {
        return this.f48187c.canRead();
    }

    /* renamed from: b */
    public boolean mo55725b() {
        return this.f48187c.canWrite();
    }

    @C0363p0
    /* renamed from: c */
    public C18930a mo55726c(String str) {
        File file = new File(this.f48187c, str);
        if (file.isDirectory() || file.mkdir()) {
            return new C18932c(this, file);
        }
        return null;
    }

    @C0363p0
    /* renamed from: d */
    public C18930a mo55727d(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f48187c, str2);
        try {
            file.createNewFile();
            return new C18932c(this, file);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to createFile: ");
            sb.append(e);
            return null;
        }
    }

    /* renamed from: e */
    public boolean mo55728e() {
        m88543w(this.f48187c);
        return this.f48187c.delete();
    }

    /* renamed from: f */
    public boolean mo55729f() {
        return this.f48187c.exists();
    }

    /* renamed from: k */
    public String mo55731k() {
        return this.f48187c.getName();
    }

    @C0363p0
    /* renamed from: m */
    public String mo55733m() {
        if (this.f48187c.isDirectory()) {
            return null;
        }
        return m88544x(this.f48187c.getName());
    }

    /* renamed from: n */
    public Uri mo55734n() {
        return Uri.fromFile(this.f48187c);
    }

    /* renamed from: o */
    public boolean mo55735o() {
        return this.f48187c.isDirectory();
    }

    /* renamed from: q */
    public boolean mo55736q() {
        return this.f48187c.isFile();
    }

    /* renamed from: r */
    public boolean mo55737r() {
        return false;
    }

    /* renamed from: s */
    public long mo55738s() {
        return this.f48187c.lastModified();
    }

    /* renamed from: t */
    public long mo55739t() {
        return this.f48187c.length();
    }

    /* renamed from: u */
    public C18930a[] mo55740u() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.f48187c.listFiles();
        if (listFiles != null) {
            for (File cVar : listFiles) {
                arrayList.add(new C18932c(this, cVar));
            }
        }
        return (C18930a[]) arrayList.toArray(new C18930a[arrayList.size()]);
    }

    /* renamed from: v */
    public boolean mo55741v(String str) {
        File file = new File(this.f48187c.getParentFile(), str);
        if (!this.f48187c.renameTo(file)) {
            return false;
        }
        this.f48187c = file;
        return true;
    }
}
