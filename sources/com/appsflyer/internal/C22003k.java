package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.k */
public final class C22003k {
    public final String[] values;

    public C22003k() {
    }

    public static C21948cb AFInAppEventParameterName(Context context) {
        if (context instanceof Activity) {
            return C21948cb.valueOf;
        }
        if (context instanceof Application) {
            return C21948cb.application;
        }
        return C21948cb.other;
    }

    public static JSONObject AFKeystoreWrapper(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            try {
                jSONObject.put((String) next.getKey(), AFKeystoreWrapper(next.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static List<Object> valueOf(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = valueOf((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFKeystoreWrapper((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public C22003k(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.values = null;
            return;
        }
        Pattern compile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !compile.matcher(str).matches()) {
                AFLogger.AppsFlyer2dXConversionCallback("Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase());
            }
        }
        if (arrayList.contains("all")) {
            this.values = new String[]{"all"};
        } else if (!arrayList.isEmpty()) {
            this.values = (String[]) arrayList.toArray(new String[0]);
        } else {
            this.values = null;
        }
    }

    private static Object AFKeystoreWrapper(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object AFKeystoreWrapper : (Collection) obj) {
                    jSONArray.put(AFKeystoreWrapper(AFKeystoreWrapper));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < length; i++) {
                    jSONArray2.put(AFKeystoreWrapper(Array.get(obj, i)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                return AFKeystoreWrapper((Map<String, ?>) (Map) obj);
            } else {
                return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static Map<String, Object> AFKeystoreWrapper(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = valueOf((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFKeystoreWrapper((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }
}
