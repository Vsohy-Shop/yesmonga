package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public final class MultiDexExtractor implements Closeable {

    /* renamed from: E0 */
    public static final String f50274E0 = "dex.number";

    /* renamed from: F0 */
    public static final String f50275F0 = "dex.crc.";

    /* renamed from: G0 */
    public static final String f50276G0 = "dex.time.";

    /* renamed from: H0 */
    public static final int f50277H0 = 16384;

    /* renamed from: I0 */
    public static final long f50278I0 = -1;

    /* renamed from: J0 */
    public static final String f50279J0 = "MultiDex.lock";

    /* renamed from: X */
    public static final String f50280X = "multidex.version";

    /* renamed from: Y */
    public static final String f50281Y = "timestamp";

    /* renamed from: Z */
    public static final String f50282Z = "crc";

    /* renamed from: g */
    public static final String f50283g = "MultiDex";

    /* renamed from: v */
    public static final String f50284v = "classes";

    /* renamed from: w */
    public static final String f50285w = ".dex";

    /* renamed from: x */
    public static final String f50286x = ".classes";

    /* renamed from: y */
    public static final String f50287y = ".zip";

    /* renamed from: z */
    public static final int f50288z = 3;

    /* renamed from: a */
    public final File f50289a;

    /* renamed from: b */
    public final long f50290b;

    /* renamed from: c */
    public final File f50291c;

    /* renamed from: d */
    public final RandomAccessFile f50292d;

    /* renamed from: e */
    public final FileChannel f50293e;

    /* renamed from: f */
    public final FileLock f50294f;

    public static class ExtractedDex extends File {
        public long crc = -1;

        public ExtractedDex(File file, String str) {
            super(file, str);
        }
    }

    /* renamed from: androidx.multidex.MultiDexExtractor$a */
    public class C19652a implements FileFilter {
        public C19652a() {
        }

        public boolean accept(File file) {
            return !file.getName().equals(MultiDexExtractor.f50279J0);
        }
    }

    public MultiDexExtractor(File file, File file2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor(");
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(file2.getPath());
        sb.append(")");
        this.f50289a = file;
        this.f50291c = file2;
        this.f50290b = m91285g(file);
        File file3 = new File(file2, f50279J0);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f50292d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f50293e = channel;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Blocking on lock ");
                sb2.append(file3.getPath());
                this.f50294f = channel.lock();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file3.getPath());
                sb3.append(" locked");
            } catch (IOException e) {
                e = e;
                m91281b(this.f50293e);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                m91281b(this.f50293e);
                throw e;
            } catch (Error e3) {
                e = e3;
                m91281b(this.f50293e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m91281b(this.f50292d);
            throw e4;
        }
    }

    /* renamed from: b */
    public static void m91281b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public static void m91282c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, f50287y, file.getParentFile());
        StringBuilder sb = new StringBuilder();
        sb.append("Extracting ");
        sb.append(createTempFile.getPath());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Renaming to ");
                sb2.append(file.getPath());
                if (createTempFile.renameTo(file)) {
                    m91281b(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            m91281b(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* renamed from: d */
    public static SharedPreferences m91283d(Context context) {
        return context.getSharedPreferences(f50280X, 4);
    }

    /* renamed from: f */
    public static long m91284f(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: g */
    public static long m91285g(File file) throws IOException {
        long c = C19664e.m91319c(file);
        return c == -1 ? c - 1 : c;
    }

    /* renamed from: i */
    public static boolean m91286i(Context context, File file, long j, String str) {
        SharedPreferences d = m91283d(context);
        if (d.getLong(str + "timestamp", -1) == m91284f(file)) {
            if (d.getLong(str + f50282Z, -1) != j) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static void m91287m(Context context, String str, long j, long j2, List<ExtractedDex> list) {
        SharedPreferences.Editor edit = m91283d(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + f50282Z, j2);
        edit.putInt(str + f50274E0, list.size() + 1);
        int i = 2;
        for (ExtractedDex next : list) {
            edit.putLong(str + f50275F0 + i, next.crc);
            edit.putLong(str + f50276G0 + i, next.lastModified());
            i++;
        }
        edit.commit();
    }

    /* renamed from: a */
    public final void mo58023a() {
        File[] listFiles = this.f50291c.listFiles(new C19652a());
        if (listFiles == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to list secondary dex dir content (");
            sb.append(this.f50291c.getPath());
            sb.append(").");
            return;
        }
        for (File file : listFiles) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Trying to delete old file ");
            sb2.append(file.getPath());
            sb2.append(" of size ");
            sb2.append(file.length());
            if (!file.delete()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to delete old file ");
                sb3.append(file.getPath());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Deleted old file ");
                sb4.append(file.getPath());
            }
        }
    }

    public void close() throws IOException {
        this.f50294f.release();
        this.f50293e.close();
        this.f50292d.close();
    }

    /* renamed from: j */
    public List<? extends File> mo58025j(Context context, String str, boolean z) throws IOException {
        List<ExtractedDex> list;
        List<ExtractedDex> list2;
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor.load(");
        sb.append(this.f50289a.getPath());
        sb.append(", ");
        sb.append(z);
        sb.append(", ");
        sb.append(str);
        sb.append(")");
        if (this.f50294f.isValid()) {
            if (z || m91286i(context, this.f50289a, this.f50290b, str)) {
                list2 = mo58027l();
                m91287m(context, str, m91284f(this.f50289a), this.f50290b, list2);
            } else {
                try {
                    list = mo58026k(context, str);
                } catch (IOException unused) {
                    list2 = mo58027l();
                    m91287m(context, str, m91284f(this.f50289a), this.f50290b, list2);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("load found ");
                sb2.append(list.size());
                sb2.append(" secondary dex files");
                return list;
            }
            list = list2;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("load found ");
            sb22.append(list.size());
            sb22.append(" secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    /* renamed from: k */
    public final List<ExtractedDex> mo58026k(Context context, String str) throws IOException {
        String str2 = str;
        String str3 = this.f50289a.getName() + f50286x;
        SharedPreferences d = m91283d(context);
        int i = d.getInt(str2 + f50274E0, 1);
        ArrayList arrayList = new ArrayList(i + -1);
        int i2 = 2;
        while (i2 <= i) {
            ExtractedDex extractedDex = new ExtractedDex(this.f50291c, str3 + i2 + f50287y);
            if (extractedDex.isFile()) {
                extractedDex.crc = m91285g(extractedDex);
                long j = d.getLong(str2 + f50275F0 + i2, -1);
                long j2 = d.getLong(str2 + f50276G0 + i2, -1);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences = d;
                    if (j == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i2++;
                        d = sharedPreferences;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str2 + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + extractedDex.crc);
            }
            throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r10 = new java.lang.StringBuilder();
        r10.append("Failed to read crc from ");
        r10.append(r8.getAbsolutePath());
        r10 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0083 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> mo58027l() throws java.io.IOException {
        /*
            r14 = this;
            java.lang.String r0 = ".dex"
            java.lang.String r1 = "classes"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r14.f50289a
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ".classes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r14.mo58023a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile
            java.io.File r5 = r14.f50289a
            r4.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r5.<init>()     // Catch:{ all -> 0x0135 }
            r5.append(r1)     // Catch:{ all -> 0x0135 }
            r6 = 2
            r5.append(r6)     // Catch:{ all -> 0x0135 }
            r5.append(r0)     // Catch:{ all -> 0x0135 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0135 }
            java.util.zip.ZipEntry r5 = r4.getEntry(r5)     // Catch:{ all -> 0x0135 }
        L_0x0041:
            if (r5 == 0) goto L_0x0131
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r7.<init>()     // Catch:{ all -> 0x0135 }
            r7.append(r2)     // Catch:{ all -> 0x0135 }
            r7.append(r6)     // Catch:{ all -> 0x0135 }
            java.lang.String r8 = ".zip"
            r7.append(r8)     // Catch:{ all -> 0x0135 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0135 }
            androidx.multidex.MultiDexExtractor$ExtractedDex r8 = new androidx.multidex.MultiDexExtractor$ExtractedDex     // Catch:{ all -> 0x0135 }
            java.io.File r9 = r14.f50291c     // Catch:{ all -> 0x0135 }
            r8.<init>(r9, r7)     // Catch:{ all -> 0x0135 }
            r3.add(r8)     // Catch:{ all -> 0x0135 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r7.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r9 = "Extraction is needed for file "
            r7.append(r9)     // Catch:{ all -> 0x0135 }
            r7.append(r8)     // Catch:{ all -> 0x0135 }
            r7 = 0
            r9 = r7
            r10 = r9
        L_0x0071:
            r11 = 3
            if (r9 >= r11) goto L_0x00ed
            if (r10 != 0) goto L_0x00ed
            int r9 = r9 + 1
            m91282c(r4, r5, r8, r2)     // Catch:{ all -> 0x0135 }
            long r10 = m91285g(r8)     // Catch:{ IOException -> 0x0083 }
            r8.crc = r10     // Catch:{ IOException -> 0x0083 }
            r10 = 1
            goto L_0x0095
        L_0x0083:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r10.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r11 = "Failed to read crc from "
            r10.append(r11)     // Catch:{ all -> 0x0135 }
            java.lang.String r11 = r8.getAbsolutePath()     // Catch:{ all -> 0x0135 }
            r10.append(r11)     // Catch:{ all -> 0x0135 }
            r10 = r7
        L_0x0095:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r11.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "Extraction "
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            if (r10 == 0) goto L_0x00a4
            java.lang.String r12 = "succeeded"
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r12 = "failed"
        L_0x00a6:
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = " '"
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = r8.getAbsolutePath()     // Catch:{ all -> 0x0135 }
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "': length "
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            long r12 = r8.length()     // Catch:{ all -> 0x0135 }
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = " - crc: "
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            long r12 = r8.crc     // Catch:{ all -> 0x0135 }
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            if (r10 != 0) goto L_0x0071
            r8.delete()     // Catch:{ all -> 0x0135 }
            boolean r11 = r8.exists()     // Catch:{ all -> 0x0135 }
            if (r11 == 0) goto L_0x0071
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r11.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "Failed to delete corrupted secondary dex '"
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = r8.getPath()     // Catch:{ all -> 0x0135 }
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "'"
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            goto L_0x0071
        L_0x00ed:
            if (r10 == 0) goto L_0x0109
            int r6 = r6 + 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r5.<init>()     // Catch:{ all -> 0x0135 }
            r5.append(r1)     // Catch:{ all -> 0x0135 }
            r5.append(r6)     // Catch:{ all -> 0x0135 }
            r5.append(r0)     // Catch:{ all -> 0x0135 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0135 }
            java.util.zip.ZipEntry r5 = r4.getEntry(r5)     // Catch:{ all -> 0x0135 }
            goto L_0x0041
        L_0x0109:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0135 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r1.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = "Could not create zip file "
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = r8.getAbsolutePath()     // Catch:{ all -> 0x0135 }
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = " for secondary dex ("
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            r1.append(r6)     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0135 }
            r0.<init>(r1)     // Catch:{ all -> 0x0135 }
            throw r0     // Catch:{ all -> 0x0135 }
        L_0x0131:
            r4.close()     // Catch:{ IOException -> 0x0134 }
        L_0x0134:
            return r3
        L_0x0135:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0139 }
        L_0x0139:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDexExtractor.mo58027l():java.util.List");
    }
}
