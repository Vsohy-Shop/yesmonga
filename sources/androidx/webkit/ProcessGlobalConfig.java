package androidx.webkit;

import android.content.Context;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.camera.view.C1814q;
import androidx.webkit.internal.C20877e0;
import androidx.webkit.internal.C20908o1;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

public class ProcessGlobalConfig {

    /* renamed from: b */
    public static final Object f53896b = new Object();
    @C0323b0("sLock")

    /* renamed from: c */
    public static boolean f53897c = false;
    private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference<>();

    /* renamed from: a */
    public String f53898a;

    /* renamed from: a */
    public static void m96746a(@C0359n0 ProcessGlobalConfig processGlobalConfig) {
        synchronized (f53896b) {
            if (!f53897c) {
                f53897c = true;
            } else {
                throw new IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
            }
        }
        HashMap hashMap = new HashMap();
        if (!m96747c()) {
            if (C20908o1.f53960M.mo62631e()) {
                C20877e0.m96858e(processGlobalConfig.f53898a);
            } else {
                hashMap.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_SUFFIX, processGlobalConfig.f53898a);
            }
            if (!C1814q.m7242a(sProcessGlobalConfig, (Object) null, hashMap)) {
                throw new RuntimeException("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
            }
            return;
        }
        throw new IllegalStateException("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
    }

    /* renamed from: c */
    public static boolean m96747c() {
        try {
            Field declaredField = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
            declaredField.setAccessible(true);
            if (declaredField.get((Object) null) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @C0359n0
    /* renamed from: b */
    public ProcessGlobalConfig mo62567b(@C0359n0 Context context, @C0359n0 String str) {
        if (!C20908o1.f53960M.mo62630d(context)) {
            throw C20908o1.m96934a();
        } else if (str.equals("")) {
            throw new IllegalArgumentException("Suffix cannot be an empty string");
        } else if (str.indexOf(File.separatorChar) < 0) {
            this.f53898a = str;
            return this;
        } else {
            throw new IllegalArgumentException("Suffix " + str + " contains a path separator");
        }
    }
}
