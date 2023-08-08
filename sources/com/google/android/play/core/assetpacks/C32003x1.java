package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C32062k;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.play.core.assetpacks.x1 */
public final class C32003x1 {

    /* renamed from: b */
    public static final C32062k f78177b = new C32062k("MergeSliceTaskHandler");

    /* renamed from: a */
    public final C31906c0 f78178a;

    public C32003x1(C31906c0 c0Var) {
        this.f78178a = c0Var;
    }

    /* renamed from: b */
    public static void m129722b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                m129722b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(valueOf.length() + 28);
                sb.append("Unable to delete directory: ");
                sb.append(valueOf);
                throw new C31904bk(sb.toString());
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 51);
            sb2.append("File clashing with existing file from other slice: ");
            sb2.append(valueOf2);
            throw new C31904bk(sb2.toString());
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 21);
            sb3.append("Unable to move file: ");
            sb3.append(valueOf3);
            throw new C31904bk(sb3.toString());
        }
    }

    /* renamed from: a */
    public final void mo92706a(C31999w1 w1Var) {
        File y = this.f78178a.mo92531y(w1Var.f77956b, w1Var.f78169c, w1Var.f78170d, w1Var.f78171e);
        if (y.exists()) {
            File z = this.f78178a.mo92532z(w1Var.f77956b, w1Var.f78169c, w1Var.f78170d);
            if (!z.exists()) {
                z.mkdirs();
            }
            m129722b(y, z);
            try {
                this.f78178a.mo92498B(w1Var.f77956b, w1Var.f78169c, w1Var.f78170d, this.f78178a.mo92497A(w1Var.f77956b, w1Var.f78169c, w1Var.f78170d) + 1);
            } catch (IOException e) {
                f78177b.mo92776b("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new C31904bk("Writing merge checkpoint failed.", e, w1Var.f77955a);
            }
        } else {
            throw new C31904bk(String.format("Cannot find verified files for slice %s.", new Object[]{w1Var.f78171e}), w1Var.f77955a);
        }
    }
}
