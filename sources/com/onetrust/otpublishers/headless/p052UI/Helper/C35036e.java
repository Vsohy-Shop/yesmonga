package com.onetrust.otpublishers.headless.p052UI.Helper;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import com.google.android.datatransport.cct.C40042a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.Helper.e */
public class C35036e {
    /* renamed from: a */
    public static int m143801a(int i, @C0359n0 KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return 20;
        }
        if (i == 4) {
            return 23;
        }
        if (i == 19) {
            return 25;
        }
        if (i == 61) {
            return 22;
        }
        if (i == 66) {
            return 21;
        }
        switch (i) {
            case 21:
                return 24;
            case 22:
                return 22;
            case 23:
                return 21;
            default:
                return 20;
        }
    }

    /* renamed from: d */
    public static void m143802d(@C0359n0 TextView textView, @C0359n0 String str) {
        for (Drawable drawable : textView.getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(Color.parseColor(str), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* renamed from: e */
    public static void m143803e(boolean z, Button button, C35105e eVar) {
        String str;
        if (z) {
            button.setElevation(8.0f);
            if (!C35020d.m143605J(eVar.mo104708k()) && !C35020d.m143605J(eVar.mo104710m())) {
                button.getBackground().setTint(Color.parseColor(eVar.mo104708k()));
                str = eVar.mo104710m();
            } else {
                return;
            }
        } else {
            button.setElevation(0.0f);
            button.getBackground().setTint(Color.parseColor(eVar.mo104699a()));
            str = eVar.mo104296u();
        }
        button.setTextColor(Color.parseColor(str));
    }

    /* renamed from: b */
    public String mo104302b(@C0359n0 String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (!UIUtils.m143746M(str)) {
            return str.replace("[", "").replace("]", "").replace("\"", "").replace(C40042a.f102078h, "");
        }
        String replace = str.replace("\\/", "/");
        if (replace.startsWith("[") || replace.endsWith("]")) {
            replace = replace.replace("[", "").replace("]", "").replace("\"", "").replace(C40042a.f102078h, "");
        }
        return mo104305g(replace).toString();
    }

    @C0359n0
    /* renamed from: c */
    public String mo104303c(@C0359n0 JSONObject jSONObject) {
        String str = "GroupNameOTT";
        if (C35020d.m143605J(jSONObject.optString(str))) {
            str = "GroupName";
        }
        return jSONObject.optString(str);
    }

    @C0359n0
    /* renamed from: f */
    public String mo104304f(@C0359n0 String str) {
        String str2 = mo104306h(str) ? "bb" : "F1";
        return str.substring(0, 1) + str2 + str.substring(1, str.length());
    }

    /* renamed from: g */
    public SpannableStringBuilder mo104305g(@C0359n0 String str) {
        return new SpannableStringBuilder(Html.fromHtml(str, (Html.ImageGetter) null, new UIUtils.C35031b()));
    }

    /* renamed from: h */
    public boolean mo104306h(@C0359n0 String str) {
        try {
            return ((((double) Integer.valueOf(str.substring(1, 3), 16).intValue()) * 0.299d) + (((double) Integer.valueOf(str.substring(3, 5), 16).intValue()) * 0.587d)) + (((double) Integer.valueOf(str.substring(5, 7), 16).intValue()) * 0.114d) <= 90.0d;
        } catch (Exception e) {
            OTLogger.m143457l("TV Utils", "error on computing dark colors " + e.getMessage());
            return true;
        }
    }
}
