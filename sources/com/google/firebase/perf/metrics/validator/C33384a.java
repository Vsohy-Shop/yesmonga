package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.p049v1.ApplicationInfo;

/* renamed from: com.google.firebase.perf.metrics.validator.a */
public class C33384a extends C33388e {

    /* renamed from: b */
    public static final C33363a f81128b = C33363a.m134449e();

    /* renamed from: a */
    public final ApplicationInfo f81129a;

    public C33384a(ApplicationInfo applicationInfo) {
        this.f81129a = applicationInfo;
    }

    /* renamed from: c */
    public boolean mo96558c() {
        if (mo96559g()) {
            return true;
        }
        f81128b.mo96439l("ApplicationInfo is invalid");
        return false;
    }

    /* renamed from: g */
    public final boolean mo96559g() {
        ApplicationInfo applicationInfo = this.f81129a;
        if (applicationInfo == null) {
            f81128b.mo96439l("ApplicationInfo is null");
            return false;
        } else if (!applicationInfo.hasGoogleAppId()) {
            f81128b.mo96439l("GoogleAppId is null");
            return false;
        } else if (!this.f81129a.hasAppInstanceId()) {
            f81128b.mo96439l("AppInstanceId is null");
            return false;
        } else if (!this.f81129a.hasApplicationProcessState()) {
            f81128b.mo96439l("ApplicationProcessState is null");
            return false;
        } else if (!this.f81129a.hasAndroidAppInfo()) {
            return true;
        } else {
            if (!this.f81129a.getAndroidAppInfo().hasPackageName()) {
                f81128b.mo96439l("AndroidAppInfo.packageName is null");
                return false;
            } else if (this.f81129a.getAndroidAppInfo().hasSdkVersion()) {
                return true;
            } else {
                f81128b.mo96439l("AndroidAppInfo.sdkVersion is null");
                return false;
            }
        }
    }
}
