package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* renamed from: com.appsflyer.internal.an */
final class C21887an {
    private final C21890d AFInAppEventParameterName = new C21890d() {
        public final Class<?> AFKeystoreWrapper(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    /* renamed from: com.appsflyer.internal.an$b */
    public enum C21889b {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        SEGMENT("android_segment", "com.segment.analytics.android.integrations.appsflyer.AppsflyerIntegration"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");
        
        /* access modifiers changed from: private */
        public final String onConversionDataSuccess;
        /* access modifiers changed from: private */
        public final String onDeepLinkingNative;

        private C21889b(String str, String str2) {
            this.onDeepLinkingNative = str;
            this.onConversionDataSuccess = str2;
        }
    }

    /* renamed from: com.appsflyer.internal.an$d */
    public interface C21890d {
        Class<?> AFKeystoreWrapper(String str) throws ClassNotFoundException;
    }

    private boolean AFInAppEventType(String str) {
        try {
            this.AFInAppEventParameterName.AFKeystoreWrapper(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.AFInAppEventType(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper(th.getMessage(), th);
            return false;
        }
    }

    public final String AFKeystoreWrapper() {
        for (C21889b bVar : C21889b.values()) {
            if (AFInAppEventType(bVar.onConversionDataSuccess)) {
                return bVar.onDeepLinkingNative;
            }
        }
        return C21889b.DEFAULT.onDeepLinkingNative;
    }
}
