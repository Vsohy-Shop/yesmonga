package com.appsflyer.share;

import android.content.Context;
import androidx.navigation.C19758j0;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.C21868ah;
import com.appsflyer.internal.C21980da;
import com.appsflyer.internal.C22004m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.C11626x;

public class LinkGenerator {
    String AFInAppEventParameterName;
    String AFInAppEventType;
    private String AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private final Map<String, String> onAttributionFailureNative = new HashMap();
    private String onDeepLinkingNative;
    private String onInstallConversionDataLoadedNative;
    private final Map<String, String> onInstallConversionFailureNative = new HashMap();
    private String valueOf;
    private final String values;

    public LinkGenerator(String str) {
        this.values = str;
    }

    private static String AFInAppEventType(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder("Illegal ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            AFLogger.AFKeystoreWrapper(sb.toString(), e);
            return "";
        } catch (Throwable th) {
            AFLogger.AFInAppEventType(th);
            return "";
        }
    }

    private Map<String, String> valueOf() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onInstallConversionFailureNative.clear();
        this.onInstallConversionFailureNative.put("pid", this.values);
        linkedHashMap.put("pid", AFInAppEventType(this.values, "media source"));
        String str = this.init;
        if (str != null) {
            this.onInstallConversionFailureNative.put("af_referrer_uid", str);
            linkedHashMap.put("af_referrer_uid", AFInAppEventType(this.init, "referrerUID"));
        }
        String str2 = this.AFKeystoreWrapper;
        if (str2 != null) {
            this.onInstallConversionFailureNative.put(AFInAppEventParameterName.AF_CHANNEL, str2);
            linkedHashMap.put(AFInAppEventParameterName.AF_CHANNEL, AFInAppEventType(this.AFKeystoreWrapper, "channel"));
        }
        String str3 = this.AFLogger$LogLevel;
        if (str3 != null) {
            this.onInstallConversionFailureNative.put("af_referrer_customer_id", str3);
            linkedHashMap.put("af_referrer_customer_id", AFInAppEventType(this.AFLogger$LogLevel, "referrerCustomerId"));
        }
        String str4 = this.valueOf;
        if (str4 != null) {
            this.onInstallConversionFailureNative.put("c", str4);
            linkedHashMap.put("c", AFInAppEventType(this.valueOf, "campaign"));
        }
        String str5 = this.getLevel;
        if (str5 != null) {
            this.onInstallConversionFailureNative.put("af_referrer_name", str5);
            linkedHashMap.put("af_referrer_name", AFInAppEventType(this.getLevel, "referrerName"));
        }
        String str6 = this.AFVersionDeclaration;
        if (str6 != null) {
            this.onInstallConversionFailureNative.put("af_referrer_image_url", str6);
            linkedHashMap.put("af_referrer_image_url", AFInAppEventType(this.AFVersionDeclaration, "referrerImageURL"));
        }
        if (this.onDeepLinkingNative != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.onDeepLinkingNative);
            String str7 = this.AppsFlyer2dXConversionCallback;
            if (str7 != null) {
                String str8 = "";
                this.AppsFlyer2dXConversionCallback = str7.replaceFirst("^[/]", str8);
                if (!this.onDeepLinkingNative.endsWith("/")) {
                    str8 = "/";
                }
                sb.append(str8);
                sb.append(this.AppsFlyer2dXConversionCallback);
            }
            String obj = sb.toString();
            this.onInstallConversionFailureNative.put("af_dp", obj);
            linkedHashMap.put("af_dp", AFInAppEventType(obj, C19758j0.f50575e));
        }
        for (Map.Entry next : this.onAttributionFailureNative.entrySet()) {
            this.onInstallConversionFailureNative.put(next.getKey(), next.getValue());
            linkedHashMap.put(next.getKey(), AFInAppEventType((String) next.getValue(), (String) next.getKey()));
        }
        return linkedHashMap;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.onAttributionFailureNative.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.onAttributionFailureNative.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFInAppEventParameterName;
        if (str == null || !str.startsWith("http")) {
            sb.append(String.format(C21980da.AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C21868ah.valueOf().getHostName()}));
        } else {
            sb.append(this.AFInAppEventParameterName);
        }
        if (this.AFInAppEventType != null) {
            sb.append('/');
            sb.append(this.AFInAppEventType);
        }
        sb.append(AFInAppEventType(valueOf()));
        return sb.toString();
    }

    public String getBrandDomain() {
        return this.onInstallConversionDataLoadedNative;
    }

    public String getCampaign() {
        return this.valueOf;
    }

    public String getChannel() {
        return this.AFKeystoreWrapper;
    }

    public String getMediaSource() {
        return this.values;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.onAttributionFailureNative);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.onDeepLinkingNative = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFInAppEventParameterName = String.format("https://%s/%s", new Object[]{String.format("%sapp.%s", new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C21868ah.valueOf().getHostName()}), str3});
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.AFInAppEventParameterName = String.format("https://%s/%s", new Object[]{str2, str});
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.onInstallConversionDataLoadedNative = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.valueOf = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.AFKeystoreWrapper = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.AppsFlyer2dXConversionCallback = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.AFLogger$LogLevel = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.AFVersionDeclaration = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.getLevel = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.init = str;
        return this;
    }

    private static String AFInAppEventType(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            if (sb.length() == 0) {
                sb.append('?');
            } else {
                sb.append(C11626x.f28913d);
            }
            sb.append(AFInAppEventType((String) next.getKey(), (String) next.getKey()));
            sb.append('=');
            sb.append((String) next.getValue());
        }
        return sb.toString();
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        valueOf();
        String str = this.onInstallConversionDataLoadedNative;
        Map<String, String> map = this.onInstallConversionFailureNative;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventType("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, C21868ah.valueOf(), context);
        createOneLinkHttpTask.AFKeystoreWrapper = responseListener;
        createOneLinkHttpTask.valueOf = str;
        if (C22004m.AFInAppEventType == null) {
            C22004m.AFInAppEventType = new C22004m();
        }
        C22004m.AFInAppEventType.AFKeystoreWrapper().execute(createOneLinkHttpTask);
    }
}
