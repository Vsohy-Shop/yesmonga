package com.usabilla.sdk.ubform.sdk.featurebilla;

import com.google.firebase.crashlytics.internal.metadata.C32748d;
import com.usabilla.sdk.ubform.eventengine.decorators.PercentageDecorator;
import com.usabilla.sdk.ubform.sdk.form.model.Setting;
import com.usabilla.sdk.ubform.sdk.form.model.SettingRules;
import com.usabilla.sdk.ubform.sdk.form.model.SettingsModel;
import com.usabilla.sdk.ubform.sdk.form.model.VariableName;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class FeaturebillaManagerImpl implements C9950a {
    @C12579k

    /* renamed from: a */
    public final C9953c f27423a;
    @C12579k

    /* renamed from: b */
    public final String f27424b;
    @C12579k

    /* renamed from: c */
    public final Map<VariableName, String> f27425c = new LinkedHashMap();
    @C12579k

    /* renamed from: d */
    public final String f27426d = PercentageDecorator.f26902e;

    /* renamed from: e */
    public final double f27427e = 99.0d;

    public FeaturebillaManagerImpl(@C12579k C9953c cVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(cVar, "store");
        Intrinsics.checkNotNullParameter(str, C32748d.f79502c);
        this.f27423a = cVar;
        this.f27424b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> java.lang.Object mo20806a(@org.jetbrains.annotations.C12579k com.usabilla.sdk.ubform.sdk.form.model.VariableName r5, T r6, @org.jetbrains.annotations.C12579k java.util.Map<java.lang.String, java.lang.String> r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super T> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.usabilla.sdk.ubform.sdk.featurebilla.FeaturebillaManagerImpl$getSettingVariable$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.usabilla.sdk.ubform.sdk.featurebilla.FeaturebillaManagerImpl$getSettingVariable$1 r0 = (com.usabilla.sdk.ubform.sdk.featurebilla.FeaturebillaManagerImpl$getSettingVariable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.usabilla.sdk.ubform.sdk.featurebilla.FeaturebillaManagerImpl$getSettingVariable$1 r0 = new com.usabilla.sdk.ubform.sdk.featurebilla.FeaturebillaManagerImpl$getSettingVariable$1
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.L$2
            java.lang.Object r5 = r0.L$1
            com.usabilla.sdk.ubform.sdk.form.model.VariableName r5 = (com.usabilla.sdk.ubform.sdk.form.model.VariableName) r5
            java.lang.Object r7 = r0.L$0
            com.usabilla.sdk.ubform.sdk.featurebilla.FeaturebillaManagerImpl r7 = (com.usabilla.sdk.ubform.sdk.featurebilla.FeaturebillaManagerImpl) r7
            kotlin.C11661u0.m45747n(r8)
            goto L_0x005f
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r8)
            java.util.Map<com.usabilla.sdk.ubform.sdk.form.model.VariableName, java.lang.String> r8 = r4.f27425c
            java.lang.Object r8 = r8.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x0049
            r8 = 0
        L_0x0049:
            if (r8 != 0) goto L_0x006b
            kotlinx.coroutines.flow.e r7 = r4.mo20808e(r7)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.C11909g.m47377J1(r7, r0)
            if (r7 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r7 = r4
        L_0x005f:
            java.util.Map<com.usabilla.sdk.ubform.sdk.form.model.VariableName, java.lang.String> r7 = r7.f27425c
            java.lang.Object r5 = r7.get(r5)
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x006b
            return r6
        L_0x006b:
            int r5 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0073 }
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r5)     // Catch:{ NumberFormatException -> 0x0073 }
        L_0x0073:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.featurebilla.FeaturebillaManagerImpl.mo20806a(com.usabilla.sdk.ubform.sdk.form.model.VariableName, java.lang.Object, java.util.Map, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d */
    public final boolean mo20807d(Setting setting, Map<String, String> map) {
        for (SettingRules settingRules : setting.getRules()) {
            if (Intrinsics.areEqual((Object) settingRules.getName(), (Object) this.f27426d)) {
                if (!mo20809f(setting.getVariable().toString(), Double.parseDouble(settingRules.getValue()))) {
                    return false;
                }
            } else if (!Intrinsics.areEqual((Object) settingRules.getValue(), (Object) map.get(settingRules.getName()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final C11907e<SettingsModel> mo20808e(Map<String, String> map) {
        return C11909g.m47494u(C11909g.m47448f1(this.f27423a.mo20815a(), new FeaturebillaManagerImpl$initialize$1(this, map, (C11045c<? super FeaturebillaManagerImpl$initialize$1>) null)), new FeaturebillaManagerImpl$initialize$2((C11045c<? super FeaturebillaManagerImpl$initialize$2>) null));
    }

    /* renamed from: f */
    public final boolean mo20809f(String str, double d) {
        boolean z;
        boolean z2;
        if (d == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (d == 100.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && ((((double) Math.abs(Intrinsics.stringPlus(str, this.f27424b).hashCode())) % this.f27427e) + ((double) 1)) / 100.0d > d) {
            return false;
        }
        return true;
    }
}
