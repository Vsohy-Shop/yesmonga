package com.bumptech.glide.load.engine.executor;

import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.bumptech.glide.load.engine.executor.b */
public final class C22229b {

    /* renamed from: a */
    public static final String f57095a = "GlideRuntimeCompat";

    /* renamed from: b */
    public static final String f57096b = "cpu[0-9]+";

    /* renamed from: c */
    public static final String f57097c = "/sys/devices/system/cpu/";

    /* renamed from: com.bumptech.glide.load.engine.executor.b$a */
    public class C22230a implements FilenameFilter {

        /* renamed from: a */
        public final /* synthetic */ Pattern f57098a;

        public C22230a(Pattern pattern) {
            this.f57098a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f57098a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    public static int m101164a() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static int m101165b() {
        File[] fileArr;
        int i;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File(f57097c).listFiles(new C22230a(Pattern.compile(f57096b)));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        if (fileArr != null) {
            i = fileArr.length;
        } else {
            i = 0;
        }
        return Math.max(1, i);
    }
}
