package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40777k;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C33935d;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.common.sdkinternal.ModelType;
import java.io.File;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.model.d */
public class C33957d {
    @C40473a

    /* renamed from: b */
    public static final int f82414b = -1;

    /* renamed from: c */
    public static final C40777k f82415c = new C40777k("ModelFileHelper", "");
    @RecentlyNonNull
    @C0344h1

    /* renamed from: d */
    public static final String f82416d = String.format("com.google.mlkit.%s.models", new Object[]{"translate"});
    @RecentlyNonNull
    @C0344h1

    /* renamed from: e */
    public static final String f82417e = String.format("com.google.mlkit.%s.models", new Object[]{"custom"});
    @C0344h1

    /* renamed from: f */
    public static final String f82418f = String.format("com.google.mlkit.%s.models", new Object[]{"base"});

    /* renamed from: a */
    public final C33947j f82419a;

    public C33957d(@RecentlyNonNull C33947j jVar) {
        this.f82419a = jVar;
    }

    @C0348i1
    @C40473a
    /* renamed from: a */
    public synchronized void mo98762a(@RecentlyNonNull ModelType modelType, @RecentlyNonNull String str) {
        mo98763b(mo98767f(str, modelType, false));
        mo98763b(mo98767f(str, modelType, true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r5 != false) goto L_0x002c;
     */
    @androidx.annotation.C0348i1
    @com.google.android.gms.common.annotation.C40473a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo98763b(@androidx.annotation.C0363p0 java.io.File r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8.isDirectory()
            r2 = 1
            if (r1 == 0) goto L_0x002c
            java.io.File[] r1 = r8.listFiles()
            java.lang.Object r1 = com.google.android.gms.common.internal.C40843u.m166202l(r1)
            java.io.File[] r1 = (java.io.File[]) r1
            int r3 = r1.length
            r4 = r0
            r5 = r2
        L_0x0018:
            if (r4 >= r3) goto L_0x002a
            r6 = r1[r4]
            if (r5 == 0) goto L_0x0026
            boolean r5 = r7.mo98763b(r6)
            if (r5 == 0) goto L_0x0026
            r5 = r2
            goto L_0x0027
        L_0x0026:
            r5 = r0
        L_0x0027:
            int r4 = r4 + 1
            goto L_0x0018
        L_0x002a:
            if (r5 == 0) goto L_0x0033
        L_0x002c:
            boolean r8 = r8.delete()
            if (r8 == 0) goto L_0x0033
            return r2
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.C33957d.mo98763b(java.io.File):boolean");
    }

    @C0348i1
    @C40473a
    /* renamed from: c */
    public void mo98764c(@RecentlyNonNull String str, @RecentlyNonNull ModelType modelType) throws MlKitException {
        String str2;
        String str3;
        File l = mo98773l(str, modelType, true);
        if (!mo98763b(l)) {
            C40777k kVar = f82415c;
            if (l != null) {
                str2 = l.getAbsolutePath();
            } else {
                str2 = null;
            }
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                str3 = "Failed to delete the temp labels file directory: ".concat(valueOf);
            } else {
                str3 = new String("Failed to delete the temp labels file directory: ");
            }
            kVar.mo134432e("ModelFileHelper", str3);
        }
    }

    @C0348i1
    @C40473a
    /* renamed from: d */
    public int mo98765d(@RecentlyNonNull File file) {
        String str;
        File[] listFiles = file.listFiles();
        int i = -1;
        if (!(listFiles == null || (r1 = listFiles.length) == 0)) {
            for (File file2 : listFiles) {
                try {
                    i = Math.max(i, Integer.parseInt(file2.getName()));
                } catch (NumberFormatException unused) {
                    C40777k kVar = f82415c;
                    String valueOf = String.valueOf(file2.getName());
                    if (valueOf.length() != 0) {
                        str = "Contains non-integer file name ".concat(valueOf);
                    } else {
                        str = new String("Contains non-integer file name ");
                    }
                    kVar.mo134430c("ModelFileHelper", str);
                }
            }
        }
        return i;
    }

    @RecentlyNonNull
    @C0348i1
    @C40473a
    /* renamed from: e */
    public File mo98766e(@RecentlyNonNull String str, @RecentlyNonNull ModelType modelType) throws MlKitException {
        return mo98773l(str, modelType, false);
    }

    @RecentlyNonNull
    @C0348i1
    @C40473a
    /* renamed from: f */
    public File mo98767f(@RecentlyNonNull String str, @RecentlyNonNull ModelType modelType, boolean z) {
        String str2;
        ModelType modelType2 = ModelType.UNKNOWN;
        int ordinal = modelType.ordinal();
        if (ordinal == 1) {
            str2 = f82418f;
        } else if (ordinal == 2) {
            str2 = f82416d;
        } else if (ordinal == 4) {
            str2 = f82417e;
        } else {
            String name = modelType.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 69);
            sb.append("Unknown model type ");
            sb.append(name);
            sb.append(". Cannot find a dir to store the downloaded model.");
            throw new IllegalArgumentException(sb.toString());
        }
        File file = new File(this.f82419a.mo98718b().getNoBackupFilesDir(), str2);
        if (z) {
            file = new File(file, "temp");
        }
        return new File(file, str);
    }

    @RecentlyNonNull
    @C0348i1
    @C40473a
    /* renamed from: g */
    public File mo98768g(@RecentlyNonNull String str, @RecentlyNonNull ModelType modelType) throws MlKitException {
        return mo98773l(str, modelType, true);
    }

    @RecentlyNonNull
    @C0348i1
    @C40473a
    /* renamed from: h */
    public File mo98769h(@RecentlyNonNull String str, @RecentlyNonNull ModelType modelType, @RecentlyNonNull String str2) throws MlKitException {
        String str3;
        String str4;
        File l = mo98773l(str, modelType, true);
        if (!l.exists() || !l.isFile() || l.delete()) {
            if (!l.exists()) {
                C40777k kVar = f82415c;
                String valueOf = String.valueOf(l.getAbsolutePath());
                if (valueOf.length() != 0) {
                    str3 = "Temp labels folder does not exist, creating one: ".concat(valueOf);
                } else {
                    str3 = new String("Temp labels folder does not exist, creating one: ");
                }
                kVar.mo134430c("ModelFileHelper", str3);
                if (!l.mkdirs()) {
                    throw new MlKitException("Failed to create a directory to hold the AutoML model's labels file.", 13);
                }
            }
            return new File(l, str2);
        }
        String valueOf2 = String.valueOf(l.getAbsolutePath());
        if (valueOf2.length() != 0) {
            str4 = "Failed to delete the temp labels file: ".concat(valueOf2);
        } else {
            str4 = new String("Failed to delete the temp labels file: ");
        }
        throw new MlKitException(str4, 13);
    }

    @C0348i1
    @C40473a
    /* renamed from: i */
    public boolean mo98770i(@RecentlyNonNull String str, @RecentlyNonNull ModelType modelType) throws MlKitException {
        String k;
        String str2;
        if (modelType == ModelType.UNKNOWN || (k = mo98772k(str, modelType)) == null) {
            return false;
        }
        File file = new File(k);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(file, C33935d.f82351a);
        C40777k kVar = f82415c;
        String valueOf = String.valueOf(file2.getAbsolutePath());
        if (valueOf.length() != 0) {
            str2 = "Model file path: ".concat(valueOf);
        } else {
            str2 = new String("Model file path: ");
        }
        kVar.mo134435h("ModelFileHelper", str2);
        return file2.exists();
    }

    @RecentlyNonNull
    @C0348i1
    /* renamed from: j */
    public final File mo98771j(@RecentlyNonNull String str, @RecentlyNonNull ModelType modelType) throws MlKitException {
        return mo98773l(str, modelType, true);
    }

    @C0348i1
    @RecentlyNullable
    /* renamed from: k */
    public final String mo98772k(@RecentlyNonNull String str, @RecentlyNonNull ModelType modelType) throws MlKitException {
        File e = mo98766e(str, modelType);
        int d = mo98765d(e);
        if (d == -1) {
            return null;
        }
        String absolutePath = e.getAbsolutePath();
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 12);
        sb.append(absolutePath);
        sb.append("/");
        sb.append(d);
        return sb.toString();
    }

    @C0348i1
    /* renamed from: l */
    public final File mo98773l(@C0359n0 String str, @C0359n0 ModelType modelType, boolean z) throws MlKitException {
        String str2;
        File f = mo98767f(str, modelType, z);
        if (!f.exists()) {
            C40777k kVar = f82415c;
            String valueOf = String.valueOf(f.getAbsolutePath());
            if (valueOf.length() != 0) {
                str2 = "model folder does not exist, creating one: ".concat(valueOf);
            } else {
                str2 = new String("model folder does not exist, creating one: ");
            }
            kVar.mo134430c("ModelFileHelper", str2);
            if (!f.mkdirs()) {
                String valueOf2 = String.valueOf(f);
                StringBuilder sb = new StringBuilder(valueOf2.length() + 31);
                sb.append("Failed to create model folder: ");
                sb.append(valueOf2);
                throw new MlKitException(sb.toString(), 13);
            }
        } else if (!f.isDirectory()) {
            String valueOf3 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(valueOf3.length() + 71);
            sb2.append("Can not create model folder, since an existing file has the same name: ");
            sb2.append(valueOf3);
            throw new MlKitException(sb2.toString(), 6);
        }
        return f;
    }
}
