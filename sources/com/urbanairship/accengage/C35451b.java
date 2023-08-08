package com.urbanairship.accengage;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.push.PushMessage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.urbanairship.accengage.b */
public class C35451b {

    /* renamed from: A */
    public static final String f87324A = "a4sicon";

    /* renamed from: B */
    public static final String f87325B = "a4sb";

    /* renamed from: C */
    public static final String f87326C = "a4smultiplelines";

    /* renamed from: D */
    public static final String f87327D = "a4sbigtemplate";

    /* renamed from: E */
    public static final String f87328E = "a4sbigcontenthtml";

    /* renamed from: F */
    public static final String f87329F = "a4sbigcontent";

    /* renamed from: G */
    public static final String f87330G = "a4sbigpicture";

    /* renamed from: H */
    public static final String f87331H = "acc_url";

    /* renamed from: I */
    public static final String f87332I = "a4surl";

    /* renamed from: J */
    public static final String f87333J = "acc_action";

    /* renamed from: K */
    public static final String f87334K = "openWithSafari";

    /* renamed from: L */
    public static final String f87335L = "a4sopenapp";

    /* renamed from: M */
    public static final String f87336M = "a4sIsDecorated";

    /* renamed from: N */
    public static final String f87337N = "a4sappname";

    /* renamed from: O */
    public static final String f87338O = "a4sheadertext";

    /* renamed from: P */
    public static final String f87339P = "acc_channel";
    @C0359n0

    /* renamed from: b */
    public static final String f87340b = "browser";
    @C0359n0

    /* renamed from: c */
    public static final String f87341c = "urlExec";
    @C0359n0

    /* renamed from: d */
    public static final String f87342d = "webView";
    @C0359n0

    /* renamed from: e */
    public static final String f87343e = "BigTextStyle";
    @C0359n0

    /* renamed from: f */
    public static final String f87344f = "BigPictureStyle";
    @C0359n0

    /* renamed from: g */
    public static final String f87345g = "InboxStyle";
    @C0359n0

    /* renamed from: h */
    public static final String f87346h = "com_ad4screen_sdk_template_notification_bigpicture";
    @C0359n0

    /* renamed from: i */
    public static final String f87347i = "com_ad4screen_sdk_template_notification_bigpicture_collapsed";

    /* renamed from: j */
    public static final String f87348j = "a4scontent";

    /* renamed from: k */
    public static final String f87349k = "a4scontenthtml";

    /* renamed from: l */
    public static final String f87350l = "a4stitlehtml";

    /* renamed from: m */
    public static final String f87351m = "a4stitle";

    /* renamed from: n */
    public static final String f87352n = "a4ssysid";

    /* renamed from: o */
    public static final String f87353o = "a4spriority";

    /* renamed from: p */
    public static final String f87354p = "a4scategory";

    /* renamed from: q */
    public static final String f87355q = "a4saccentcolor";

    /* renamed from: r */
    public static final String f87356r = "a4stemplate";

    /* renamed from: s */
    public static final String f87357s = "a4snotifsound";

    /* renamed from: t */
    public static final String f87358t = "a4sforeground";

    /* renamed from: u */
    public static final String f87359u = "a4sgroup";

    /* renamed from: v */
    public static final String f87360v = "a4sgroupsummary";

    /* renamed from: w */
    public static final String f87361w = "a4scontentinfo";

    /* renamed from: x */
    public static final String f87362x = "a4ssubtext";

    /* renamed from: y */
    public static final String f87363y = "a4ssummarytext";

    /* renamed from: z */
    public static final String f87364z = "a4ssmalliconname";

    /* renamed from: a */
    public final PushMessage f87365a;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.accengage.b$a */
    public @interface C35452a {
    }

    public C35451b(@C0359n0 PushMessage pushMessage) {
        this.f87365a = pushMessage;
    }

    @C0347i0
    /* renamed from: J */
    public static int m146252J(@C0359n0 Context context, @C0363p0 String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "layout", context.getPackageName());
    }

    @C0359n0
    /* renamed from: a */
    public static C35451b m146253a(@C0359n0 PushMessage pushMessage) {
        if (pushMessage.mo19158E()) {
            return new C35451b(pushMessage);
        }
        throw new IllegalArgumentException("PushMessage is not an Accengage push.");
    }

    @C0363p0
    /* renamed from: A */
    public String mo106241A() {
        return mo106248H(f87363y);
    }

    /* renamed from: B */
    public int mo106242B() {
        try {
            return Integer.parseInt(mo106249I(f87352n, "1001"));
        } catch (NumberFormatException unused) {
            C36059m.m148421q("PushMessage - Impossible to parse Accengage system id, use default value: 1001", new Object[0]);
            return 1001;
        }
    }

    @C0363p0
    /* renamed from: C */
    public String mo106243C() {
        String H = mo106248H(f87356r);
        if ((H == null || H.isEmpty()) && f87346h.equals(mo106257h())) {
            return f87347i;
        }
        return H;
    }

    @C0347i0
    /* renamed from: D */
    public int mo106244D(@C0359n0 Context context) {
        String C = mo106243C();
        if (TextUtils.isEmpty(C)) {
            return 0;
        }
        int J = m146252J(context, C);
        if (J == 0) {
            C36059m.m148421q("AccengageMessage - Wrong short template provided : " + C + ". Default one will be used", new Object[0]);
        }
        return J;
    }

    @C0359n0
    /* renamed from: E */
    public String mo106245E() {
        return mo106249I(f87350l, mo106249I(f87351m, ""));
    }

    @C0359n0
    /* renamed from: F */
    public String mo106246F() {
        return mo106249I("acc_url", mo106249I(f87332I, ""));
    }

    @C0359n0
    /* renamed from: G */
    public List<C35453c> mo106247G() {
        ArrayList arrayList = new ArrayList();
        String H = mo106248H(f87325B);
        if (!TextUtils.isEmpty(H)) {
            try {
                Iterator<JsonValue> it = JsonValue.m34960C(H).mo18784z().iterator();
                while (it.hasNext()) {
                    arrayList.add(C35453c.m146289a(it.next()));
                }
            } catch (JsonException e) {
                C36059m.m148411g(e, "Failed to parse Accengage buttons", new Object[0]);
            }
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: H */
    public String mo106248H(@C0359n0 String str) {
        return this.f87365a.mo19175i(str);
    }

    @C0359n0
    /* renamed from: I */
    public String mo106249I(@C0359n0 String str, @C0359n0 String str2) {
        String H = mo106248H(str);
        return H == null ? str2 : H;
    }

    /* renamed from: K */
    public boolean mo106250K() {
        return mo106259j(f87326C);
    }

    /* renamed from: b */
    public int mo106251b() {
        return mo106252c(0);
    }

    /* renamed from: c */
    public int mo106252c(int i) {
        if (mo106248H(f87355q) == null) {
            return i;
        }
        try {
            return Color.parseColor(mo106248H(f87355q));
        } catch (Exception unused) {
            return i;
        }
    }

    @C0363p0
    /* renamed from: d */
    public String mo106253d() {
        return mo106248H("acc_action");
    }

    @C0363p0
    /* renamed from: e */
    public String mo106254e() {
        return mo106248H(f87337N);
    }

    @C0363p0
    /* renamed from: f */
    public String mo106255f() {
        String H = mo106248H(f87328E);
        if (H == null) {
            H = mo106248H(f87329F);
        }
        if (!TextUtils.isEmpty(H)) {
            return H.replace("\n", "<br/>");
        }
        return H;
    }

    @C0363p0
    /* renamed from: g */
    public String mo106256g() {
        return mo106248H(f87330G);
    }

    @C0363p0
    /* renamed from: h */
    public String mo106257h() {
        return mo106248H(f87327D);
    }

    @C0347i0
    /* renamed from: i */
    public int mo106258i(@C0359n0 Context context) {
        String h = mo106257h();
        if (TextUtils.isEmpty(h)) {
            return 0;
        }
        h.hashCode();
        char c = 65535;
        switch (h.hashCode()) {
            case -1877494908:
                if (h.equals(f87343e)) {
                    c = 0;
                    break;
                }
                break;
            case -1618196397:
                if (h.equals(f87344f)) {
                    c = 1;
                    break;
                }
                break;
            case -470971669:
                if (h.equals(f87345g)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return 0;
            default:
                int J = m146252J(context, h);
                if (J == 0) {
                    C36059m.m148421q("AccengageMessage - Wrong expanded template provided : " + h + ". Default one will be used.", new Object[0]);
                }
                return J;
        }
    }

    /* renamed from: j */
    public final boolean mo106259j(String str) {
        String H = mo106248H(str);
        if (H == null) {
            return false;
        }
        return H.matches(".*[yYtT].*");
    }

    @C0359n0
    /* renamed from: k */
    public String mo106260k() {
        return mo106249I(f87354p, "promo");
    }

    @C0363p0
    /* renamed from: l */
    public String mo106261l() {
        return mo106248H(f87339P);
    }

    @C0363p0
    /* renamed from: m */
    public String mo106262m() {
        String H = mo106248H(f87349k);
        if (H == null) {
            return mo106248H("a4scontent");
        }
        return H;
    }

    @C0363p0
    /* renamed from: n */
    public String mo106263n() {
        return mo106248H(f87361w);
    }

    /* renamed from: o */
    public boolean mo106264o() {
        return mo106259j(f87358t);
    }

    @C0363p0
    /* renamed from: p */
    public String mo106265p() {
        return mo106248H(f87359u);
    }

    /* renamed from: q */
    public boolean mo106266q() {
        return mo106259j(f87360v);
    }

    @C0363p0
    /* renamed from: r */
    public String mo106267r() {
        return mo106248H(f87338O);
    }

    /* renamed from: s */
    public boolean mo106268s() {
        return mo106259j(f87336M);
    }

    @C0363p0
    /* renamed from: t */
    public String mo106269t() {
        return mo106248H(f87324A);
    }

    @C0363p0
    /* renamed from: u */
    public String mo106270u() {
        return mo106248H(f87357s);
    }

    /* renamed from: v */
    public boolean mo106271v() {
        return mo106259j(f87334K);
    }

    /* renamed from: w */
    public int mo106272w() {
        try {
            return Integer.parseInt(mo106249I(f87353o, ""));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Deprecated
    /* renamed from: x */
    public int mo106273x(@C0359n0 Context context) {
        return mo106274y(context, context.getApplicationInfo().icon);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y */
    public int mo106274y(@C0359n0 Context context, int i) {
        int identifier;
        String H = mo106248H(f87364z);
        if (TextUtils.isEmpty(H) || (identifier = context.getResources().getIdentifier(H, "drawable", context.getPackageName())) <= 0) {
            return i;
        }
        return identifier;
    }

    @C0363p0
    /* renamed from: z */
    public String mo106275z() {
        return mo106248H(f87362x);
    }
}
