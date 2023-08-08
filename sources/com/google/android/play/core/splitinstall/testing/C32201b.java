package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.splitcompat.C32133a;
import com.google.android.play.core.splitinstall.C32191p0;
import com.google.android.play.core.splitinstall.C32199t0;
import java.io.File;

/* renamed from: com.google.android.play.core.splitinstall.testing.b */
public class C32201b {
    @Nullable

    /* renamed from: a */
    public static C32200a f78518a;

    /* renamed from: a */
    public static C32200a m130296a(Context context) {
        try {
            File b = C32191p0.m130238a(context).mo92973b();
            if (b == null) {
                throw new LocalTestingException("Failed to retrieve local testing directory path");
            } else if (b.exists()) {
                return m130297b(context, b);
            } else {
                throw new LocalTestingException(String.format("Local testing directory not found: %s", new Object[]{b}));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static synchronized C32200a m130297b(Context context, File file) {
        C32200a aVar;
        synchronized (C32201b.class) {
            C32200a aVar2 = f78518a;
            if (aVar2 == null) {
                f78518a = m130298c(context, file);
            } else if (!aVar2.mo92998q().getAbsolutePath().equals(file.getAbsolutePath())) {
                throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", new Object[]{f78518a.mo92998q().getAbsolutePath(), file.getAbsolutePath()}));
            }
            aVar = f78518a;
        }
        return aVar;
    }

    /* renamed from: c */
    public static C32200a m130298c(Context context, File file) {
        C32133a.m130058i(context);
        return new C32200a(context, file, new C32199t0(context, context.getPackageName()));
    }
}
