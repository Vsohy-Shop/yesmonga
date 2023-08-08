package com.contentsquare.android.sdk;

import android.os.StatFs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.jd */
public class C14451jd {

    /* renamed from: b */
    public static final byte[] f35696b = new byte[0];

    /* renamed from: a */
    public final C14453jf f35697a = new C14453jf("FileStorageUtil");

    /* renamed from: a */
    public final long mo35656a(File file, long j) {
        long length = file.length();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                length += file2.isDirectory() ? mo35656a(file2, j) : file2.length() % j == 0 ? file2.length() : ((file2.length() / j) + 1) * j;
            }
        }
        return length;
    }

    /* renamed from: b */
    public BufferedReader mo35657b(InputStreamReader inputStreamReader) {
        return new BufferedReader(inputStreamReader);
    }

    /* renamed from: c */
    public FileOutputStream mo35658c(File file, boolean z) {
        return new FileOutputStream(file, z);
    }

    /* renamed from: d */
    public InputStreamReader mo35659d(FileInputStream fileInputStream) {
        return new InputStreamReader(fileInputStream, Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    public void mo35660e(String str, String str2) {
        mo35661f(str, str2.getBytes(Charset.forName("UTF-8")), true);
    }

    /* renamed from: f */
    public void mo35661f(String str, byte[] bArr, boolean z) {
        File i = mo35664i(str);
        if (mo35667l(i)) {
            FileOutputStream fileOutputStream = null;
            try {
                this.f35697a.mo35674c("Writing to File: %s data %s", str, bArr);
                fileOutputStream = mo35658c(i, z);
                fileOutputStream.write(bArr);
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    this.f35697a.mo35678g(e, "Failed to close stream.", new Object[0]);
                }
            } catch (IOException e2) {
                this.f35697a.mo35678g(e2, "Data not written to file. Filename : %s", str);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        this.f35697a.mo35678g(e3, "Failed to close stream.", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        this.f35697a.mo35678g(e4, "Failed to close stream.", new Object[0]);
                    }
                }
                throw th;
            }
        } else {
            this.f35697a.mo35677f("Failed to open File: %s ", str);
        }
    }

    /* renamed from: g */
    public boolean mo35662g(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File g : listFiles) {
                mo35662g(g);
            }
        }
        return file.delete();
    }

    /* renamed from: h */
    public boolean mo35663h(String str) {
        return mo35664i(str).delete();
    }

    /* renamed from: i */
    public File mo35664i(String str) {
        return new File(str);
    }

    /* renamed from: j */
    public FileInputStream mo35665j(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: k */
    public long mo35666k(String str) {
        return mo35656a(mo35664i(str), mo35668m(str).getBlockSizeLong());
    }

    /* renamed from: l */
    public boolean mo35667l(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            this.f35697a.mo35678g(e, "Failed to create File. exiting... ", new Object[0]);
            return false;
        }
    }

    /* renamed from: m */
    public StatFs mo35668m(String str) {
        return new StatFs(str);
    }

    /* renamed from: n */
    public boolean mo35669n(String str) {
        File i = mo35664i(str);
        return i.isDirectory() && i.canRead() && i.canWrite();
    }

    /* renamed from: o */
    public String[] mo35670o(String str) {
        File i = mo35664i(str);
        if (!i.isDirectory() || !i.canRead()) {
            return null;
        }
        return i.list();
    }

    /* renamed from: p */
    public boolean mo35671p(String str) {
        return mo35664i(str).mkdirs();
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064 A[SYNTHETIC, Splitter:B:32:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072 A[SYNTHETIC, Splitter:B:37:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0084 A[SYNTHETIC, Splitter:B:45:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0092 A[SYNTHETIC, Splitter:B:50:0x0092] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo35672q(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Failed while closing : InputStream"
            java.lang.String r1 = "Failed while closing : ByteArrayOutputStream"
            java.io.File r2 = new java.io.File
            r2.<init>(r10)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L_0x0012
            byte[] r10 = f35696b
            return r10
        L_0x0012:
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 0
            r5 = 0
            byte[] r3 = new byte[r3]     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            r6.<init>()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.io.FileInputStream r5 = r9.mo35665j(r2)     // Catch:{ IOException -> 0x004b, all -> 0x0049 }
        L_0x0021:
            int r2 = r5.read(r3)     // Catch:{ IOException -> 0x004b, all -> 0x0049 }
            r7 = -1
            if (r2 == r7) goto L_0x002c
            r6.write(r3, r4, r2)     // Catch:{ IOException -> 0x004b, all -> 0x0049 }
            goto L_0x0021
        L_0x002c:
            byte[] r10 = r6.toByteArray()     // Catch:{ IOException -> 0x004b, all -> 0x0049 }
            r6.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x003c
        L_0x0034:
            r2 = move-exception
            com.contentsquare.android.sdk.jf r3 = r9.f35697a
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r3.mo35680j(r2, r1, r6)
        L_0x003c:
            r5.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0048
        L_0x0040:
            r1 = move-exception
            com.contentsquare.android.sdk.jf r2 = r9.f35697a
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r2.mo35680j(r1, r0, r3)
        L_0x0048:
            return r10
        L_0x0049:
            r10 = move-exception
            goto L_0x0082
        L_0x004b:
            r2 = move-exception
            r3 = r5
            r5 = r6
            goto L_0x0054
        L_0x004f:
            r10 = move-exception
            r3 = r5
            goto L_0x0080
        L_0x0052:
            r2 = move-exception
            r3 = r5
        L_0x0054:
            com.contentsquare.android.sdk.jf r6 = r9.f35697a     // Catch:{ all -> 0x007f }
            java.lang.String r7 = "Failed while reading file : %s"
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x007f }
            r8[r4] = r10     // Catch:{ all -> 0x007f }
            r6.mo35678g(r2, r7, r8)     // Catch:{ all -> 0x007f }
            byte[] r10 = f35696b     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x0070
            r5.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0070
        L_0x0068:
            r2 = move-exception
            com.contentsquare.android.sdk.jf r5 = r9.f35697a
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r5.mo35680j(r2, r1, r6)
        L_0x0070:
            if (r3 == 0) goto L_0x007e
            r3.close()     // Catch:{ IOException -> 0x0076 }
            goto L_0x007e
        L_0x0076:
            r1 = move-exception
            com.contentsquare.android.sdk.jf r2 = r9.f35697a
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r2.mo35680j(r1, r0, r3)
        L_0x007e:
            return r10
        L_0x007f:
            r10 = move-exception
        L_0x0080:
            r6 = r5
            r5 = r3
        L_0x0082:
            if (r6 == 0) goto L_0x0090
            r6.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x0090
        L_0x0088:
            r2 = move-exception
            com.contentsquare.android.sdk.jf r3 = r9.f35697a
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r3.mo35680j(r2, r1, r6)
        L_0x0090:
            if (r5 == 0) goto L_0x009e
            r5.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x009e
        L_0x0096:
            r1 = move-exception
            com.contentsquare.android.sdk.jf r2 = r9.f35697a
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r2.mo35680j(r1, r0, r3)
        L_0x009e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14451jd.mo35672q(java.lang.String):byte[]");
    }

    /* renamed from: r */
    public List<String> mo35673r(String str) {
        File file = new File(str);
        LinkedList linkedList = new LinkedList();
        if (file.exists()) {
            FileInputStream fileInputStream = null;
            try {
                FileInputStream j = mo35665j(file);
                BufferedReader b = mo35657b(mo35659d(j));
                while (true) {
                    String readLine = b.readLine();
                    if (readLine == null) {
                        break;
                    }
                    this.f35697a.mo35674c("File Data: %s", readLine);
                    linkedList.add(readLine);
                }
                if (j != null) {
                    try {
                        j.close();
                    } catch (IOException e) {
                        this.f35697a.mo35680j(e, "Failed to close stream", new Object[0]);
                    }
                }
            } catch (IOException | NullPointerException e2) {
                this.f35697a.mo35678g(e2, "Failed while reading file : %s", str);
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e3) {
                        this.f35697a.mo35680j(e3, "Failed to close stream", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e4) {
                        this.f35697a.mo35680j(e4, "Failed to close stream", new Object[0]);
                    }
                }
                throw th;
            }
        }
        return linkedList;
    }
}
