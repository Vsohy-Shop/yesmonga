package com.onetrust.otpublishers.headless.p052UI.Helper;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.app.C0493r;
import androidx.appcompat.view.C0538d;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.C17318d;
import androidx.core.view.C18306m0;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C31178a;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35019c;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.p052UI.TVUI.fragments.C35081h;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35118r;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35192b0;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35201e0;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35206f1;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35213h0;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35217j;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35221k0;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35249x0;
import com.onetrust.otpublishers.headless.p052UI.fragment.OTSDKListFragment;
import com.urbanairship.iam.C9168d0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.XMLReader;

/* renamed from: com.onetrust.otpublishers.headless.UI.Helper.UIUtils */
public class UIUtils {

    /* renamed from: com.onetrust.otpublishers.headless.UI.Helper.UIUtils$a */
    public class C35030a extends ClickableSpan {

        /* renamed from: a */
        public final /* synthetic */ Context f85273a;

        /* renamed from: b */
        public final /* synthetic */ URLSpan f85274b;

        public C35030a(UIUtils uIUtils, Context context, URLSpan uRLSpan) {
            this.f85273a = context;
            this.f85274b = uRLSpan;
        }

        public void onClick(@C0359n0 View view) {
            C35020d.m143600B(this.f85273a, this.f85274b.getURL());
        }
    }

    /* renamed from: com.onetrust.otpublishers.headless.UI.Helper.UIUtils$b */
    public static class C35031b implements Html.TagHandler {

        /* renamed from: a */
        public boolean f85275a = true;

        /* renamed from: b */
        public String f85276b;

        /* renamed from: c */
        public int f85277c = 1;

        public void handleTag(boolean z, @C0359n0 String str, @C0359n0 Editable editable, @C0359n0 XMLReader xMLReader) {
            if ("ul".equals(str)) {
                this.f85276b = "UL";
            } else if ("ol".equals(str)) {
                this.f85276b = "OL";
            }
            if ("li".equals(str)) {
                if ("UL".equals(this.f85276b)) {
                    if (this.f85275a) {
                        editable.append("\n\t•");
                        this.f85275a = false;
                        return;
                    }
                } else if (this.f85275a) {
                    editable.append("\n\t").append(String.valueOf(this.f85277c)).append(". ");
                    this.f85275a = false;
                    this.f85277c++;
                    return;
                }
                this.f85275a = true;
            }
        }
    }

    /* renamed from: C */
    public static void m143740C(@C0359n0 C19232h hVar, @C0359n0 C0493r rVar, @C0359n0 String str) {
        try {
            rVar.show(hVar.mo57175g0(), str);
        } catch (IllegalStateException e) {
            OTLogger.m143447b("OneTrust", "Activity in illegal state to add a Banner fragment " + e.toString());
            m143745L(hVar, rVar, str);
        }
    }

    /* renamed from: F */
    public static void m143741F(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONObject.has("SubGroups")) {
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = jSONObject.getJSONArray("SubGroups");
            for (int i = 0; i < jSONArray3.length(); i++) {
                if (!jSONArray3.getJSONObject(i).getString("Type").contains("COOKIE")) {
                    jSONArray2.put(jSONArray3.getJSONObject(i));
                }
            }
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                m143742G(jSONArray, jSONObject2, jSONObject3, "IAB2_STACK".equals(jSONObject3.getString("Type")));
            }
        }
    }

    /* renamed from: G */
    public static void m143742G(JSONArray jSONArray, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        if (!z && !jSONObject2.getString("Type").contains("COOKIE") && !jSONObject2.getString("Type").contains("BRANCH")) {
            jSONObject.put("CustomGroupId", jSONObject2.getString("CustomGroupId"));
            jSONObject.put("GroupName", jSONObject2.getString("GroupName"));
            jSONObject.put("Type", jSONObject2.getString("Type"));
            jSONArray.put(jSONObject);
        }
    }

    @C0344h1
    /* renamed from: H */
    public static boolean m143743H(@C0363p0 String str, @C0363p0 String str2) {
        return !C35020d.m143605J(str) || !C35020d.m143605J(str2);
    }

    /* renamed from: I */
    public static boolean m143744I(@C0363p0 JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return false;
        }
        if (z) {
            if (!jSONObject.has("BannerMPButtonColor")) {
                OTLogger.m143457l("OneTrust", "Downloaded data does not contain the required fields to render the UI. \nPlease publish the application to a version that matches the SDK version from the admin UI.");
                return true;
            }
        } else if (!jSONObject.has("IsIabEnabled") || !jSONObject.has("PCGrpDescType") || !jSONObject.has("BConsentText")) {
            OTLogger.m143457l("OneTrust", "Downloaded data does not contain the required fields to render the UI. \nPlease publish the application to a version that matches the SDK version from the admin UI.");
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public static void m143745L(@C0359n0 final C19232h hVar, @C0359n0 final C0493r rVar, @C0359n0 final String str) {
        hVar.getLifecycle().mo57464a(new C19470t() {
            /* renamed from: i */
            public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
                if (event.compareTo(Lifecycle.C19372Event.ON_RESUME) == 0) {
                    C0493r.this.show(hVar.mo57175g0(), str);
                    hVar.getLifecycle().mo57467d(this);
                }
            }
        });
    }

    /* renamed from: M */
    public static boolean m143746M(@C0359n0 String str) {
        return Pattern.compile(".*\\<[^>]+>.*", 32).matcher(str).matches();
    }

    /* renamed from: N */
    public static boolean m143747N(@C0359n0 Context context) {
        return (context.getApplicationInfo().flags & 4194304) != 0;
    }

    /* renamed from: a */
    public static int m143748a(@C0359n0 Context context) {
        return 32 == (context.getResources().getConfiguration().uiMode & 48) ? 11 : 22;
    }

    /* renamed from: b */
    public static int m143749b(@C0359n0 Context context, @C0363p0 OTConfiguration oTConfiguration) {
        return (oTConfiguration == null || C35020d.m143605J(oTConfiguration.getDarkModeThemeValue())) ? m143748a(context) : m143750c(C35019c.m143598c(oTConfiguration.getDarkModeThemeValue(), false));
    }

    /* renamed from: c */
    public static int m143750c(boolean z) {
        return z ? 11 : 22;
    }

    @C0363p0
    /* renamed from: f */
    public static Fragment m143751f(@C0359n0 String str, @C0359n0 C19232h hVar) {
        if (C35020d.m143624s(hVar, str)) {
            return hVar.mo57175g0().mo56903s0(str);
        }
        return null;
    }

    @C0359n0
    /* renamed from: i */
    public static String m143752i(@C0359n0 String str) {
        int i;
        if (C35020d.m143605J(str)) {
            return "";
        }
        if (C9168d0.f24881F0.equalsIgnoreCase(str)) {
            i = 4;
        } else if (C9168d0.f24880E0.equalsIgnoreCase(str)) {
            i = 2;
        } else if (!C9168d0.f24887Z.equalsIgnoreCase(str)) {
            return "";
        } else {
            i = 3;
        }
        return String.valueOf(i);
    }

    @C0359n0
    /* renamed from: k */
    public static String m143753k(boolean z, String str, String str2) {
        return z ? str : str2;
    }

    /* renamed from: l */
    public static ArrayList<String> m143754l() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(OTFragmentTags.OT_BANNER_FRAGMENT_TAG);
        arrayList.add(OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG);
        arrayList.add(OTFragmentTags.OT_PREFERENCE_CENTER_DETAILS_FRAGMENT_TAG);
        arrayList.add(OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG);
        arrayList.add(OTFragmentTags.OT_VENDOR_DETAILS_FRAGMENT_TAG);
        arrayList.add(OTFragmentTags.OT_VENDOR_LIST_FILTER_FRAGMENT_TAG);
        arrayList.add(OTFragmentTags.OT_SDK_LIST_FRAGMENT_TAG);
        arrayList.add(OTFragmentTags.OT_SDK_LIST_FILTER_FRAGMENT_TAG);
        arrayList.add(OTFragmentTags.OT_TV_MAIN_FRAGMENT_TAG);
        return arrayList;
    }

    /* renamed from: p */
    public static void m143755p(@C0359n0 Context context, @C0359n0 Button button, @C0363p0 C35105e eVar, @C0363p0 String str, @C0363p0 String str2) {
        if (C35020d.m143605J(str)) {
            OTLogger.m143447b("UIUtils", "Button set background color called with empty buttonBackGroundColor.");
        } else if (new C35020d().mo104024T(context)) {
            button.setBackgroundColor(Color.parseColor(str));
        } else if (eVar == null || !m143743H(eVar.mo104706i(), eVar.mo104704g())) {
            m143756w(button, str, str2, C35265a.C35273h.cookies_setting_button);
        } else {
            String i = eVar.mo104706i();
            if (C35020d.m143605J(i)) {
                i = "4";
            }
            if (C35020d.m143605J(str2)) {
                str2 = str;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(Integer.parseInt(i), Color.parseColor(str2));
            gradientDrawable.setColor(Color.parseColor(str));
            if (!C35020d.m143605J(eVar.mo104704g())) {
                gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, (float) Integer.parseInt(eVar.mo104704g()), context.getResources().getDisplayMetrics()));
            }
            button.setBackground(gradientDrawable);
        }
    }

    /* renamed from: w */
    public static void m143756w(@C0359n0 Button button, @C0363p0 String str, @C0363p0 String str2, int i) {
        if (button.getId() == i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(Integer.parseInt("3"), Color.parseColor(str2));
            gradientDrawable.setColor(Color.parseColor(str));
            gradientDrawable.setCornerRadius(Float.parseFloat("0"));
            button.setBackground(gradientDrawable);
            return;
        }
        button.setBackgroundColor(Color.parseColor(str));
    }

    /* renamed from: x */
    public static void m143757x(@C0359n0 ImageView imageView, @C0359n0 String str) {
        imageView.getDrawable().setTint(Color.parseColor(str));
    }

    /* renamed from: y */
    public static void m143758y(@C0359n0 TextView textView, int i) {
        if (!m143747N(textView.getContext())) {
            m143759z(textView, textView.getContext().getResources().getConfiguration().getLayoutDirection(), i);
        } else {
            textView.setTextAlignment(i);
        }
    }

    /* renamed from: z */
    public static void m143759z(@C0359n0 TextView textView, int i, int i2) {
        int i3 = C18306m0.f46960b;
        int i4 = 8388613;
        if (i == 1) {
            i4 = 8388611;
            i3 = 8388613;
        }
        if (i2 == 2) {
            textView.setGravity(3);
        } else if (i2 == 3) {
            textView.setGravity(5);
        } else if (i2 == 4) {
            textView.setGravity(1);
        } else if (i2 == 5) {
            textView.setGravity(i3);
        } else if (i2 == 6) {
            textView.setGravity(i4);
        }
    }

    /* renamed from: A */
    public void mo104264A(@C0359n0 TextView textView, @C0359n0 C35110j jVar, @C0363p0 OTConfiguration oTConfiguration) {
        Typeface otTypeFaceMap;
        String j = jVar.mo104761j();
        if (C35020d.m143605J(j) || oTConfiguration == null || (otTypeFaceMap = oTConfiguration.getOtTypeFaceMap(j)) == null) {
            int b = C35110j.m144358b(textView, jVar.mo104759h());
            textView.setTypeface(!C35020d.m143605J(jVar.mo104754c()) ? Typeface.create(jVar.mo104754c(), b) : Typeface.create(textView.getTypeface(), b));
            return;
        }
        textView.setTypeface(otTypeFaceMap);
    }

    /* renamed from: B */
    public void mo104265B(@C0359n0 C19232h hVar) {
        try {
            if (C35020d.m143624s(hVar, OTFragmentTags.OT_BANNER_FRAGMENT_TAG)) {
                Fragment s0 = hVar.mo57175g0().mo56903s0(OTFragmentTags.OT_BANNER_FRAGMENT_TAG);
                if (s0 instanceof C35217j) {
                    ((C35217j) s0).dismiss();
                }
            }
            if (C35020d.m143624s(hVar, OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG)) {
                Fragment s02 = hVar.mo57175g0().mo56903s0(OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG);
                if (s02 instanceof C35201e0) {
                    ((C35201e0) s02).dismiss();
                }
            }
            if (C35020d.m143624s(hVar, OTFragmentTags.OT_PREFERENCE_CENTER_DETAILS_FRAGMENT_TAG)) {
                Fragment s03 = hVar.mo57175g0().mo56903s0(OTFragmentTags.OT_PREFERENCE_CENTER_DETAILS_FRAGMENT_TAG);
                if (s03 instanceof C35192b0) {
                    ((C35192b0) s03).dismiss();
                }
            }
            if (C35020d.m143624s(hVar, OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG)) {
                Fragment s04 = hVar.mo57175g0().mo56903s0(OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG);
                if (s04 instanceof C35249x0) {
                    ((C35249x0) s04).dismiss();
                }
            }
            if (C35020d.m143624s(hVar, OTFragmentTags.OT_VENDOR_DETAILS_FRAGMENT_TAG)) {
                Fragment s05 = hVar.mo57175g0().mo56903s0(OTFragmentTags.OT_VENDOR_DETAILS_FRAGMENT_TAG);
                if (s05 instanceof C35206f1) {
                    ((C35206f1) s05).dismiss();
                }
            }
            if (C35020d.m143624s(hVar, OTFragmentTags.OT_SDK_LIST_FRAGMENT_TAG)) {
                Fragment s06 = hVar.mo57175g0().mo56903s0(OTFragmentTags.OT_SDK_LIST_FRAGMENT_TAG);
                if (s06 instanceof OTSDKListFragment) {
                    ((OTSDKListFragment) s06).dismiss();
                }
            }
            if (C35020d.m143624s(hVar, OTFragmentTags.OT_VENDOR_LIST_FILTER_FRAGMENT_TAG)) {
                Fragment s07 = hVar.mo57175g0().mo56903s0(OTFragmentTags.OT_VENDOR_LIST_FILTER_FRAGMENT_TAG);
                if (s07 instanceof C35213h0) {
                    ((C35213h0) s07).dismiss();
                }
            }
            if (C35020d.m143624s(hVar, OTFragmentTags.OT_SDK_LIST_FILTER_FRAGMENT_TAG)) {
                Fragment s08 = hVar.mo57175g0().mo56903s0(OTFragmentTags.OT_SDK_LIST_FILTER_FRAGMENT_TAG);
                if (s08 instanceof C35221k0) {
                    ((C35221k0) s08).dismiss();
                }
            }
            if (C35020d.m143624s(hVar, OTFragmentTags.OT_TV_MAIN_FRAGMENT_TAG)) {
                Fragment s09 = hVar.mo57175g0().mo56903s0(OTFragmentTags.OT_TV_MAIN_FRAGMENT_TAG);
                if (s09 instanceof C35081h) {
                    ((C35081h) s09).dismiss();
                }
            }
        } catch (Exception e) {
            OTLogger.m143457l("UIUtils", "Something went wrong while closing UI: " + e.getMessage());
        }
    }

    /* renamed from: D */
    public void mo104266D(@C0359n0 C19232h hVar, @C0359n0 C34962a aVar) {
        ArrayList<String> l = m143754l();
        for (int i = 0; i < l.size(); i++) {
            Fragment f = m143751f(l.get(i), hVar);
            if (f instanceof C35217j) {
                ((C35217j) f).mo105393a1(aVar);
            }
            if (f instanceof C35201e0) {
                ((C35201e0) f).mo105319V0(aVar);
            }
            if (f instanceof C35192b0) {
                ((C35192b0) f).mo105298h1(aVar);
            }
            if (f instanceof C35249x0) {
                ((C35249x0) f).mo105483a1(aVar);
            }
        }
    }

    /* renamed from: E */
    public void mo104267E(@C0359n0 C34963b bVar, @C0363p0 C34962a aVar) {
        if (aVar != null) {
            aVar.mo103577b(bVar);
        } else {
            OTLogger.m143457l("OneTrust", "Error on sending UI events, listener set was found to be null.This could be because the activity has been recreated. \n Please set listener to get UI event callbacks.");
        }
    }

    /* renamed from: J */
    public int mo104268J(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            Objects.requireNonNull(context);
            WindowMetrics a = ((Activity) context).getWindowManager().getCurrentWindowMetrics();
            Insets a2 = a.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
            int a3 = a2.right + a2.left;
            Rect a4 = a.getBounds();
            return new Size(a4.width() - a3, a4.height() - (a2.top + a2.bottom)).getHeight();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Objects.requireNonNull(context);
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: K */
    public void mo104269K(@C0359n0 ImageView imageView, String str) {
        imageView.setColorFilter(Color.parseColor(str), PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: d */
    public SpannableStringBuilder mo104270d(@C0359n0 Context context, @C0359n0 String str) {
        Spanned fromHtml = Html.fromHtml(str, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        for (URLSpan o : (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class)) {
            mo104277o(context, spannableStringBuilder, o);
        }
        return spannableStringBuilder;
    }

    @C0359n0
    /* renamed from: e */
    public View mo104271e(@C0359n0 Context context, @C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup, int i) {
        return new C35020d().mo104024T(context) ? layoutInflater.cloneInContext(new C0538d(context, C35265a.C35279n.Theme_AppCompat_Light_NoActionBar)).inflate(i, viewGroup, false) : layoutInflater.inflate(i, viewGroup, false);
    }

    @C0359n0
    /* renamed from: g */
    public String mo104272g(long j, @C0359n0 JSONObject jSONObject) {
        String str;
        StringBuilder sb;
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        String str3;
        if (j <= 0) {
            sb = new StringBuilder();
            sb.append("0 ");
            sb.append(jSONObject.optString("PCenterVendorListLifespanDays"));
        } else {
            int i = (int) (j / 2629746);
            int i2 = ((int) (j % 2629746)) / 86400;
            String str4 = "";
            boolean z = true;
            if (i != 0) {
                if (i != 1) {
                    sb3.append(i);
                    sb3.append(" ");
                    str3 = jSONObject.optString("PCenterVendorListLifespanMonths");
                } else {
                    sb3 = new StringBuilder();
                    sb3.append(i);
                    sb3.append(" ");
                    str3 = jSONObject.optString("PCenterVendorListLifespanMonth");
                }
                sb3.append(str3);
                str = sb3.toString();
            } else {
                str = str4;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    sb2 = new StringBuilder();
                    sb2.append(i2);
                    sb2.append(" ");
                    str2 = jSONObject.optString("PCenterVendorListLifespanDay");
                } else if (i2 == 30) {
                    int i3 = i + 1;
                    str = i3 + " " + (i3 == 1 ? jSONObject.optString("PCenterVendorListLifespanMonth") : jSONObject.optString("PCenterVendorListLifespanMonths"));
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(i2);
                    sb2.append(" ");
                    str2 = jSONObject.optString("PCenterVendorListLifespanDays");
                }
                sb2.append(str2);
                str4 = sb2.toString();
            } else {
                if (i != 0) {
                    z = false;
                }
                str4 = m143753k(z, "0 " + jSONObject.optString("PCenterVendorListLifespanDays"), str4);
            }
            sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str4);
        }
        return sb.toString();
    }

    @C0359n0
    /* renamed from: h */
    public String mo104273h(@C0363p0 C35118r rVar, @C0359n0 C35102b0 b0Var, @C0359n0 String str) {
        return !C35020d.m143605J(b0Var.mo104667k()) ? b0Var.mo104667k() : (rVar == null || C35020d.m143605J(rVar.mo104870a())) ? str : rVar.mo104870a();
    }

    @C0359n0
    /* renamed from: j */
    public String mo104274j(@C0359n0 JSONObject jSONObject) {
        String optString = jSONObject.optString("GroupNameMobile");
        return C35020d.m143605J(optString) ? jSONObject.optString("GroupName") : optString;
    }

    @C0359n0
    /* renamed from: m */
    public JSONArray mo104275m(@C0359n0 JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                OTLogger.m143447b("UIUtils", "Individual Purpose List: " + jSONObject2.getString("Type") + GlideException.C22148a.f56917d + jSONObject2.getString("GroupName"));
                m143742G(jSONArray2, jSONObject, jSONObject2, jSONObject2.getString("Type").contains("IAB2_STACK"));
                m143741F(jSONArray2, jSONObject2);
                i++;
            } catch (JSONException e) {
                OTLogger.m143457l("UIUtils", "getPurposeList: " + e.getMessage());
            }
        }
        return jSONArray2;
    }

    /* renamed from: n */
    public void mo104276n(long j, long j2, int i) {
        long j3 = j - j2;
        OTLogger.m143447b("OneTrust", String.format("%s %d.%d s", new Object[]{i != 1 ? i != 2 ? i != 3 ? "Time taken for OT SDK setup data fetch: " : "Time taken for Google Vendor data fetch: " : "Time taken for IAB Vendor data fetch: " : "Time taken for OT SDK setup: ", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j3)), Long.valueOf(j3 % 1000)}));
    }

    /* renamed from: o */
    public void mo104277o(@C0359n0 Context context, @C0359n0 SpannableStringBuilder spannableStringBuilder, @C0359n0 URLSpan uRLSpan) {
        spannableStringBuilder.setSpan(new C35030a(this, context, uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
        spannableStringBuilder.removeSpan(uRLSpan);
    }

    /* renamed from: q */
    public void mo104278q(@C0359n0 Context context, @C0359n0 TextView textView) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copiedText", textView.getText().toString()));
        Toast.makeText(context, "Data Copied to Clipboard", 0).show();
    }

    /* renamed from: r */
    public void mo104279r(@C0359n0 Context context, @C0359n0 TextView textView, @C0363p0 String str) {
        if (str == null || C35020d.m143605J(str)) {
            OTLogger.m143447b("UIUtils", "renderHtmlText called with 'null' text content.");
        } else if (!m143746M(str)) {
            textView.setText(str);
        } else {
            OTLogger.m143447b("UIUtils", "Rendering html content");
            textView.setText(mo104270d(context, str));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: s */
    public void mo104280s(@C0359n0 Context context, @C0359n0 SwitchCompat switchCompat, @C0363p0 String str, @C0363p0 String str2) {
        if (!C35020d.m143605J(str)) {
            switchCompat.getTrackDrawable().setTint(Color.parseColor(str));
        } else {
            switchCompat.getTrackDrawable().setTint(C17318d.m79723f(context, C35265a.C35270e.light_greyOT));
        }
        if (!C35020d.m143605J(str2)) {
            switchCompat.getThumbDrawable().setTint(Color.parseColor(str2));
        } else {
            switchCompat.getThumbDrawable().setTint(C17318d.m79723f(context, C35265a.C35270e.contentTextColorOT));
        }
    }

    /* renamed from: t */
    public void mo104281t(Context context, C31178a aVar) {
        FrameLayout frameLayout = (FrameLayout) aVar.findViewById(C35265a.C35273h.design_bottom_sheet);
        if (frameLayout != null) {
            BottomSheetBehavior i0 = BottomSheetBehavior.m125237i0(frameLayout);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            int J = mo104268J(context);
            if (layoutParams != null) {
                layoutParams.height = J;
            }
            frameLayout.setLayoutParams(layoutParams);
            i0.mo88418W0(3);
            i0.mo88414S0(mo104268J(context));
        }
    }

    /* renamed from: u */
    public void mo104282u(@C0359n0 View view, @C0359n0 Context context) {
        RelativeLayout.LayoutParams layoutParams;
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            Objects.requireNonNull(context);
            View decorView = ((Activity) context).getWindow().getDecorView();
            if ((decorView.getRootWindowInsets() != null ? decorView.getRootWindowInsets().getDisplayCutout() : null) != null) {
                OTLogger.m143461p("UIUtils", "Device is notch enabled");
                layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                i = 50;
            } else {
                OTLogger.m143461p("UIUtils", "Device is not notch enabled");
                layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                i = 70;
            }
        } else {
            layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            i = 60;
        }
        layoutParams.setMargins(0, 0, 0, i);
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: v */
    public void mo104283v(@C0359n0 Button button, @C0359n0 C35110j jVar, @C0363p0 OTConfiguration oTConfiguration) {
        Typeface otTypeFaceMap;
        String j = jVar.mo104761j();
        if (C35020d.m143605J(j) || oTConfiguration == null || (otTypeFaceMap = oTConfiguration.getOtTypeFaceMap(j)) == null) {
            int a = C35110j.m144357a(button, jVar.mo104759h());
            button.setTypeface(!C35020d.m143605J(jVar.mo104754c()) ? Typeface.create(jVar.mo104754c(), a) : Typeface.create(button.getTypeface(), a));
            return;
        }
        button.setTypeface(otTypeFaceMap);
    }
}
