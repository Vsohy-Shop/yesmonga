package com.appsflyer.deeplink;

import android.support.annotation.Nullable;
import com.appsflyer.AFInAppEventParameterName;
import com.urbanairship.accengage.C35448a;
import com.urbanairship.util.C9650g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class DeepLink {
    public final JSONObject AFInAppEventParameterName;

    private DeepLink(JSONObject jSONObject) {
        this.AFInAppEventParameterName = jSONObject;
    }

    public static DeepLink AFInAppEventParameterName(Map<String, String> map) throws JSONException {
        Set<String> keySet = map.keySet();
        keySet.removeAll(Arrays.asList(new String[]{"install_time", "path", "scheme", "host", "pid", "c", "af_prt", "af_mp", "clickid", "af_siteid", "af_sub_siteid", "af_c_id", "af_adset", "af_adset_id", "af_ad", "af_ad_id", "af_ad_type", "af_click_lookback", "af_viewthrough_lookback", AFInAppEventParameterName.AF_CHANNEL, "af_keywords", "af_cost_model", "af_cost_currency", "af_cost_value", "af_r", "af_web_dp", "af_dp", "af_force_deeplink", "af_ref", "is_incentivized", "af_param_forwarding", "is_retargeting", "af_reengagement_window", "is_branded_link", "is_universal_link", "esp_name", "af_generated_clk", "transaction_id", "af_fp_lookback_window", "af_vt_fp_lookback_window", "af_fp_priority", "af_generate_clk", "af_inactivity_window", "af_ol_red", "af_attr", "af_ol_lp", "af_blank_red", "af_source", "af_lp_src", "af_src_browser", "af_tranid", "af_wrt_clk", "af_ua", "af_ip", "af_lang", C9650g.f26457t, "sha1_advertising_id", "md5_advertising_id", "android_id", "sha1_android_id", "md5_android_id", "imei", "sha1_imei", "md5_imei", "oaid", "sha1_oaid", "md5_oaid", "af_android_url", "sha1_el", "fire_advertising_id", "sha1_fire_advertising_id", "idfa", "md5_idfa", "af_ios_url", "af_ios_fallback", "sha1_idfa", "mac", "sha1_mac", "af_banner", "af_slk_web_endpoint", "af_chrome_lp", "af_android_custom_url", "af_ios_custom_url", "af_enc_data", "engmnt_source", "redirect_response_data", "shortlink", "advertiserId", "sha1_advertiserId", "advertiser_id", "sha1_advertiser_id", "muid", C35448a.f87313t, "md5_idfv", "sha1_idfv", "af_installpostback", "http_referrer", "af_model", "af_os", "md5_advertiserId", "af_video_total_length", "af_video_played_length", "af_playable_played_length", "af_ad_time_viewed", "af_ad_displayed_percent", "af_audio_total_length", "af_audio_played_length", "link", "af_status", "af_web_id", "af_deeplink"}));
        HashMap hashMap = new HashMap();
        for (String next : keySet) {
            hashMap.put(next, map.get(next));
        }
        return values(new JSONObject(hashMap));
    }

    public static DeepLink values(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("custom_params");
        if (optJSONObject != null) {
            jSONObject.remove("custom_params");
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, optJSONObject.opt(next));
            }
        }
        return new DeepLink(jSONObject);
    }

    @Nullable
    public String getAfSub1() {
        Object opt = this.AFInAppEventParameterName.opt("af_sub1");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getAfSub2() {
        Object opt = this.AFInAppEventParameterName.opt("af_sub2");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getAfSub3() {
        Object opt = this.AFInAppEventParameterName.opt("af_sub3");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getAfSub4() {
        Object opt = this.AFInAppEventParameterName.opt("af_sub4");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getAfSub5() {
        Object opt = this.AFInAppEventParameterName.opt("af_sub5");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getCampaign() {
        Object opt = this.AFInAppEventParameterName.opt("campaign");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getCampaignId() {
        Object opt = this.AFInAppEventParameterName.opt("campaign_id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public JSONObject getClickEvent() {
        return this.AFInAppEventParameterName;
    }

    @Nullable
    public String getClickHttpReferrer() {
        Object opt = this.AFInAppEventParameterName.opt("click_http_referrer");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getDeepLinkValue() {
        Object opt = this.AFInAppEventParameterName.opt("deep_link_value");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getMatchType() {
        Object opt = this.AFInAppEventParameterName.opt("match_type");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getMediaSource() {
        Object opt = this.AFInAppEventParameterName.opt("media_source");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getStringValue(String str) {
        Object opt = this.AFInAppEventParameterName.opt(str);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt == null) {
            return null;
        }
        return String.valueOf(opt);
    }

    @Nullable
    public Boolean isDeferred() {
        Object opt = this.AFInAppEventParameterName.opt("is_deferred");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (Boolean) opt;
    }

    public String toString() {
        return this.AFInAppEventParameterName.toString();
    }
}
