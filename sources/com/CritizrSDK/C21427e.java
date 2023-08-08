package com.CritizrSDK;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.CritizrSDK.e */
public class C21427e {
    /* renamed from: a */
    public static String m98777a(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            return "?";
        }
        int i = 0;
        String str2 = "?";
        while (i < jSONObject.names().length()) {
            try {
                String string = jSONObject.names().getString(i);
                Object obj = jSONObject.get(jSONObject.names().getString(i));
                if (i == 0) {
                    str = string + "=" + obj;
                } else {
                    str = "&" + string + "=" + obj;
                }
                str2 = str2 + str;
                i++;
            } catch (JSONException e) {
                e.printStackTrace();
                return "?";
            }
        }
        return str2;
    }
}
