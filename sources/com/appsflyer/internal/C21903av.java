package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.appsflyer.internal.av */
public abstract class C21903av<T> {
    public final FutureTask<T> AFInAppEventParameterName = new FutureTask<>(new Callable<T>() {
        public final T call() {
            if (C21903av.this.AFInAppEventType()) {
                return C21903av.this.valueOf();
            }
            return null;
        }
    });
    public final Context AFInAppEventType;
    public final String AFKeystoreWrapper;
    private final String[] valueOf;

    public C21903av(Context context, String str, String... strArr) {
        this.AFInAppEventType = context;
        this.AFKeystoreWrapper = str;
        this.valueOf = strArr;
    }

    @Nullable
    public T AFInAppEventParameterName() {
        try {
            return this.AFInAppEventParameterName.get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AFLogger.AFKeystoreWrapper(e.getMessage(), e);
            return null;
        }
    }

    public final boolean AFInAppEventType() {
        try {
            ProviderInfo resolveContentProvider = this.AFInAppEventType.getPackageManager().resolveContentProvider(this.AFKeystoreWrapper, 128);
            if (resolveContentProvider == null || !Arrays.asList(this.valueOf).contains(C21845aa.AFInAppEventParameterName(this.AFInAppEventType.getPackageManager(), resolveContentProvider.packageName))) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.AFKeystoreWrapper(e.getMessage(), e);
            return false;
        }
    }

    public abstract T valueOf();
}
