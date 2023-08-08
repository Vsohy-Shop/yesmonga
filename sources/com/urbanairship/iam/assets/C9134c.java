package com.urbanairship.iam.assets;

import android.content.Context;
import android.os.Build;
import android.os.storage.StorageManager;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.util.C9670p;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.urbanairship.iam.assets.c */
public class C9134c {

    /* renamed from: d */
    public static final String f24739d = "com.urbanairship.iam.assets";

    /* renamed from: a */
    public final File f24740a;

    /* renamed from: b */
    public final StorageManager f24741b;
    @C0359n0

    /* renamed from: c */
    public final Map<String, Assets> f24742c = new HashMap();

    public C9134c(@C0359n0 Context context) {
        this.f24740a = new File(context.getCacheDir(), f24739d);
        this.f24741b = m34173a(context);
    }

    @C0363p0
    /* renamed from: a */
    public static StorageManager m34173a(@C0359n0 Context context) {
        try {
            return (StorageManager) context.getSystemService("storage");
        } catch (Exception unused) {
            return null;
        }
    }

    @C0348i1
    @C0359n0
    /* renamed from: b */
    public Assets mo18244b(@C0359n0 String str) {
        Assets assets;
        synchronized (this.f24742c) {
            assets = this.f24742c.get(str);
            if (assets == null) {
                assets = Assets.m34158g(mo18245c(str));
                this.f24742c.put(str, assets);
            }
        }
        return assets;
    }

    @C0359n0
    /* renamed from: c */
    public final File mo18245c(@C0359n0 String str) {
        if (!this.f24740a.exists() && !this.f24740a.mkdirs()) {
            C36059m.m148409e("Failed to create asset storage directory.", new Object[0]);
        }
        File file = new File(this.f24740a, str);
        if (!file.exists() && !file.mkdirs()) {
            C36059m.m148409e("Failed to create assets directory.", new Object[0]);
        }
        if (this.f24741b != null && Build.VERSION.SDK_INT >= 26 && file.exists()) {
            try {
                this.f24741b.setCacheBehaviorGroup(file, true);
            } catch (IOException e) {
                C36059m.m148411g(e, "Failed to set cache behavior on directory: %s", file.getAbsoluteFile());
            }
        }
        return file;
    }

    @C0348i1
    /* renamed from: d */
    public void mo18246d(@C0359n0 String str, boolean z) {
        synchronized (this.f24742c) {
            if (z) {
                C9670p.m36231a(mo18245c(str));
            }
            this.f24742c.remove(str);
        }
    }
}
