package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appsflyer.internal.be */
public final class C21919be implements C21918bd {
    private ExecutorService AFInAppEventParameterName;
    @Nullable
    public Context AFInAppEventType;
    private C21905aw AFKeystoreWrapper;
    private C22010u AFLogger$LogLevel;
    private C22015x AppsFlyer2dXConversionCallback;
    private C21938bv getLevel;
    private C21952cf init;
    private final int valueOf = ((int) TimeUnit.SECONDS.toMillis(30));
    private C21920bf values;

    private synchronized ExecutorService AFVersionDeclaration() {
        if (this.AFInAppEventParameterName == null) {
            this.AFInAppEventParameterName = Executors.newCachedThreadPool();
        }
        return this.AFInAppEventParameterName;
    }

    private synchronized C21920bf AppsFlyer2dXConversionCallback() {
        if (this.values == null) {
            this.values = new C21920bf();
        }
        return this.values;
    }

    private synchronized C22010u getLevel() {
        if (this.AFLogger$LogLevel == null) {
            this.AFLogger$LogLevel = new C22010u(new C21927bl(this.valueOf), AFVersionDeclaration());
        }
        return this.AFLogger$LogLevel;
    }

    public final C21923bh AFInAppEventParameterName() {
        return new C21923bh(getLevel(), valueOf());
    }

    public final synchronized C21905aw AFInAppEventType() {
        if (this.AFKeystoreWrapper == null) {
            C21920bf AppsFlyer2dXConversionCallback2 = AppsFlyer2dXConversionCallback();
            Context context = this.AFInAppEventType;
            if (context != null) {
                C21911az azVar = new C21911az(context);
                Context context2 = this.AFInAppEventType;
                if (context2 != null) {
                    this.AFKeystoreWrapper = new C21905aw(AppsFlyer2dXConversionCallback2, azVar, new C21910ay(C21868ah.valueOf(context2)), AFVersionDeclaration(), new C21923bh(getLevel(), valueOf()));
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.AFKeystoreWrapper;
    }

    public final C21930bo AFKeystoreWrapper() {
        Context context = this.AFInAppEventType;
        if (context != null) {
            return new C21910ay(C21868ah.valueOf(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    public final synchronized C21952cf init() {
        if (this.init == null) {
            Context context = this.AFInAppEventType;
            if (context != null) {
                this.init = new C21952cf(new C21910ay(C21868ah.valueOf(context)));
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.init;
    }

    public final synchronized C22015x valueOf() {
        if (this.AppsFlyer2dXConversionCallback == null) {
            Context context = this.AFInAppEventType;
            if (context != null) {
                this.AppsFlyer2dXConversionCallback = new C22015x(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.AppsFlyer2dXConversionCallback;
    }

    public final synchronized C21938bv values() {
        if (this.getLevel == null) {
            Context context = this.AFInAppEventType;
            if (context != null) {
                C21940bw bwVar = new C21940bw(new C21910ay(C21868ah.valueOf(context)));
                this.getLevel = new C21938bv(new C21929bn(), valueOf(), bwVar, new C21923bh(getLevel(), valueOf()), new C21937bu(valueOf(), bwVar), Executors.newSingleThreadExecutor());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.getLevel;
    }
}
