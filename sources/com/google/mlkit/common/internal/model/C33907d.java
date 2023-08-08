package com.google.mlkit.common.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40777k;
import com.google.android.gms.common.internal.C40843u;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C33935d;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.C33957d;
import com.google.mlkit.common.sdkinternal.model.C33961h;
import java.io.File;

/* renamed from: com.google.mlkit.common.internal.model.d */
public final class C33907d implements C33961h {

    /* renamed from: c */
    public static final C40777k f82289c = new C40777k("CustomModelFileMover", "");

    /* renamed from: a */
    public final String f82290a;

    /* renamed from: b */
    public final C33957d f82291b;

    public C33907d(@C0359n0 C33947j jVar, @C0359n0 String str) {
        this.f82290a = str;
        this.f82291b = new C33957d(jVar);
    }

    /* renamed from: c */
    public static boolean m136517c(File file, File file2) {
        String str;
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        if (file.renameTo(file2)) {
            f82289c.mo134430c("CustomModelFileMover", String.format("Moved file from %s to %s successfully", new Object[]{absolutePath, absolutePath2}));
            file2.setExecutable(false);
            file2.setWritable(false);
            return true;
        }
        C40777k kVar = f82289c;
        kVar.mo134430c("CustomModelFileMover", String.format("Move file to %s failed, remove the temp file %s.", new Object[]{absolutePath2, absolutePath}));
        if (!file.delete()) {
            String valueOf = String.valueOf(absolutePath);
            if (valueOf.length() != 0) {
                str = "Failed to delete the temp file: ".concat(valueOf);
            } else {
                str = new String("Failed to delete the temp file: ");
            }
            kVar.mo134430c("CustomModelFileMover", str);
        }
        return false;
    }

    @C0363p0
    /* renamed from: a */
    public final File mo98642a(File file) throws MlKitException {
        File file2;
        C33957d dVar = this.f82291b;
        String str = this.f82290a;
        ModelType modelType = ModelType.CUSTOM;
        File e = dVar.mo98766e(str, modelType);
        File file3 = new File(new File(e, String.valueOf(this.f82291b.mo98765d(e) + 1)), C33935d.f82351a);
        File parentFile = file3.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            ((File) C40843u.m166202l(parentFile)).mkdirs();
        }
        File file4 = null;
        if (!m136517c(file, file3)) {
            return null;
        }
        File h = this.f82291b.mo98769h(this.f82290a, modelType, C33935d.f82352b);
        if (h.exists()) {
            file2 = new File(parentFile, C33935d.f82352b);
            if (!m136517c(h, file2)) {
                return null;
            }
        } else {
            file2 = null;
        }
        File h2 = this.f82291b.mo98769h(this.f82290a, modelType, C33935d.f82353c);
        if (h2.exists()) {
            File file5 = new File(parentFile, C33935d.f82353c);
            if (!m136517c(h2, file5)) {
                return null;
            }
            file4 = file5;
        }
        if (file2 == null && file4 == null) {
            return file3;
        }
        return parentFile;
    }

    /* renamed from: b */
    public final File mo98643b() throws MlKitException {
        File e = this.f82291b.mo98766e(this.f82290a, ModelType.CUSTOM);
        return new File(new File(e, String.valueOf(this.f82291b.mo98765d(e) + 1)), C33935d.f82351a);
    }
}
