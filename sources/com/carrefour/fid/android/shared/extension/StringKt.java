package com.carrefour.fid.android.shared.extension;

import android.annotation.SuppressLint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.annotation.C0354l;
import androidx.core.internal.view.C17673a;
import androidx.core.util.C17996p;
import com.bumptech.glide.load.engine.GlideException;
import com.carrefour.fid.android.design.components.widgets.productcard.C37357d;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.shared.util.type.HashType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.urbanairship.util.C9650g;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import kotlin.text.C11611k;
import kotlin.text.C11622t;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;
import org.joda.time.format.C12671a;
import org.joda.time.format.C12674b;
import org.jsoup.C12739a;
import org.jsoup.nodes.Document;

@C11363r0({"SMAP\nString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 String.kt\ncom/carrefour/fid/android/shared/extension/StringKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n970#2:382\n1041#2,3:383\n970#2:386\n1041#2,3:387\n1#3:390\n*S KotlinDebug\n*F\n+ 1 String.kt\ncom/carrefour/fid/android/shared/extension/StringKt\n*L\n41#1:382\n41#1:383,3\n44#1:386\n44#1:387,3\n*E\n"})
public final class StringKt {
    /* renamed from: A */
    public static final int m118892A(@C12580l String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: B */
    public static /* synthetic */ int m118893B(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m118892A(str, i);
    }

    @C12580l
    /* renamed from: C */
    public static final String m118894C(@C12579k String str) {
        List<String> b;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            C11611k d = Regex.m45042d(new Regex("data=(.*?)($|&)"), str, 0, 2, (Object) null);
            if (d == null || (b = d.mo23313b()) == null) {
                return null;
            }
            return b.get(1);
        } catch (Exception unused) {
            C28935i iVar = C28935i.f70940a;
            C28935i.m119705e(iVar, "url in invalid " + str, (Throwable) null, 0, 6, (Object) null);
            return "";
        }
    }

    @C12580l
    /* renamed from: D */
    public static final String m118895D(@C12579k String str) {
        List<String> b;
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11611k d = Regex.m45042d(new Regex("([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z0-9_-]+)"), str, 0, 2, (Object) null);
        if (d == null || (b = d.mo23313b()) == null) {
            return null;
        }
        return (String) CollectionsKt___CollectionsKt.m40479B2(b);
    }

    @C12580l
    /* renamed from: E */
    public static final String m118896E(@C12579k String str) {
        List<String> b;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            C11611k d = Regex.m45042d(new Regex("token=(.*?)($|&)"), str, 0, 2, (Object) null);
            if (d == null || (b = d.mo23313b()) == null) {
                return null;
            }
            return b.get(1);
        } catch (Exception unused) {
            C28935i iVar = C28935i.f70940a;
            C28935i.m119705e(iVar, "url in invalid " + str, (Throwable) null, 0, 6, (Object) null);
            return "";
        }
    }

    /* renamed from: F */
    public static final double m118897F(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (C11622t.isBlank(str)) {
                str = "0";
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ".", false, 2, (Object) null)) {
                return Double.parseDouble(str);
            }
            return Double.parseDouble(str) / ((double) 100);
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = e;
            C28935i.m119704b(C28935i.f70940a, String.valueOf(numberFormatException.getMessage()), numberFormatException, 0, 4, (Object) null);
            return 0.0d;
        }
    }

    @C12579k
    /* renamed from: G */
    public static final String m118898G(@C12580l String str, @C12579k HashType hashType, @C12579k String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(hashType, "type");
        Intrinsics.checkNotNullParameter(str2, "charsetName");
        if (str != null) {
            MessageDigest instance = MessageDigest.getInstance(hashType.mo84286q());
            Charset forName = Charset.forName(str2);
            Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] digest = instance.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(digest, "getInstance(type.value)\n…ay(charset(charsetName)))");
            str3 = ArraysKt___ArraysKt.m38982Gh(digest, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, StringKt$hash$1$1.f70385f, 30, (Object) null);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    /* renamed from: H */
    public static /* synthetic */ String m118899H(String str, HashType hashType, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "UTF-8";
        }
        return m118898G(str, hashType, str2);
    }

    @C12579k
    /* renamed from: I */
    public static final String m118900I(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "authSecret");
        Mac instance = Mac.getInstance("HmacSHA256");
        Charset charset = C11602d.f28868b;
        byte[] bytes = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        instance.init(new SecretKeySpec(bytes, "HmacSHA256"));
        byte[] bytes2 = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byte[] doFinal = instance.doFinal(bytes2);
        Intrinsics.checkNotNullExpressionValue(doFinal, "hMac.doFinal(this.toByteArray(Charsets.UTF_8))");
        return m118916Y(doFinal);
    }

    @C12579k
    /* renamed from: J */
    public static final String m118901J(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i = 0;
        if (str.length() > 3) {
            String take = StringsKt___StringsKt.take(str, 3);
            String takeLast = StringsKt___StringsKt.takeLast(str, str.length() - 3);
            ArrayList arrayList = new ArrayList(takeLast.length());
            while (i < takeLast.length()) {
                takeLast.charAt(i);
                arrayList.add("*");
                i++;
            }
            String obj = StringsKt__StringsKt.trim(CollectionsKt___CollectionsKt.m40639h3(arrayList, new String(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null)).toString();
            return take + obj;
        }
        ArrayList arrayList2 = new ArrayList(str.length());
        while (i < str.length()) {
            str.charAt(i);
            arrayList2.add("*");
            i++;
        }
        return StringsKt__StringsKt.trim(CollectionsKt___CollectionsKt.m40639h3(arrayList2, new String(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null)).toString();
    }

    @C12579k
    /* renamed from: K */
    public static final SpannableString m118902K(@C12579k String str, @C0354l int i, @C12579k StyleSpan styleSpan, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(styleSpan, "styleSpan");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), i2, i3, 33);
        spannableString.setSpan(styleSpan, i2, i3, 33);
        return spannableString;
    }

    @C12580l
    /* renamed from: L */
    public static final SpannableStringBuilder m118903L(@C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "textToRed");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(!C11622t.isBlank(str2))) {
            return spannableStringBuilder.append(str);
        }
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        int length = str2.length() + indexOf$default;
        spannableStringBuilder.append(str);
        if (indexOf$default < 0 || length < 0 || indexOf$default < 0 || length < 0) {
            return spannableStringBuilder;
        }
        if (z) {
            spannableStringBuilder.setSpan(new StyleSpan(1), indexOf$default, length, 0);
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C17673a.f46025c), indexOf$default, length, 0);
        return spannableStringBuilder;
    }

    /* renamed from: M */
    public static /* synthetic */ SpannableStringBuilder m118904M(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m118903L(str, str2, z);
    }

    /* renamed from: N */
    public static final boolean m118905N(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Pattern.compile("^0[1-9]\\d{8}$").matcher(str).find();
    }

    @C12579k
    /* renamed from: O */
    public static final String m118906O(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Regex regex = new Regex("\\p{InCombiningDiacriticalMarks}+");
        String normalize = Normalizer.normalize(charSequence, Normalizer.Form.NFD);
        Intrinsics.checkNotNullExpressionValue(normalize, "normalize(this, Normalizer.Form.NFD)");
        return regex.mo23336m(normalize, new String());
    }

    @C12579k
    /* renamed from: P */
    public static final String m118907P(@C12580l String str) {
        String Q = str != null ? m118908Q(str) : null;
        return Q == null ? "" : Q;
    }

    @C12579k
    /* renamed from: Q */
    public static final String m118908Q(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String obj = StringsKt__StringsKt.trim(str).toString();
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(locale, "ENGLISH");
        String lowerCase = obj.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return StringsKt__StringsKt.trim(new Regex("-+").mo23336m(new Regex("(?<=\\d)[$-](?=\\d)").mo23336m(new Regex("[^a-z0-9@%|]").mo23336m(new Regex("[(){}\\[\\]]").mo23336m(m118906O(lowerCase), ""), "-"), "."), "-")).toString();
    }

    @C12579k
    /* renamed from: R */
    public static final String m118909R(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.C32532b.f78955i);
        String i = m118929i(str);
        return i + str2;
    }

    /* renamed from: S */
    public static /* synthetic */ String m118910S(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = C37357d.f93887a;
        }
        return m118909R(str, str2);
    }

    @C12579k
    /* renamed from: T */
    public static final String m118911T(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "screenName");
        Intrinsics.checkNotNullParameter(str3, "buttonName");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String lowerCase = str3.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String replace$default = C11622t.replace$default(m118912U(lowerCase), " ", C32920e.f79928l, false, 4, (Object) null);
        return str + "?utm_source=app-android&utm_medium=ecosysteme_carrefour&utm_campaign=" + str2 + "&utm_content=" + replace$default;
    }

    @C12579k
    /* renamed from: U */
    public static final String m118912U(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        Intrinsics.checkNotNullExpressionValue(normalize, "normalize(this, Normalizer.Form.NFD)");
        return new Regex("\\p{Mn}+").mo23336m(normalize, "");
    }

    @C12579k
    /* renamed from: V */
    public static final String m118913V(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Document p = C12739a.m54875p(str);
        Intrinsics.checkNotNullExpressionValue(p, "parse(this)");
        p.mo29641A3(new Document.OutputSettings().mo29685s(false));
        p.mo29717K2("br").mo30342i("§§§");
        String X2 = p.mo29750X2();
        Intrinsics.checkNotNullExpressionValue(X2, "document.text()");
        return C11622t.replace$default(X2, "§§§", "\n", false, 4, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3 < (r2.length() + 1)) goto L_0x0012;
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m118914W(@org.jetbrains.annotations.C12579k java.lang.String r2, int r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = -1
            if (r3 <= r0) goto L_0x0011
            int r0 = r2.length()
            r1 = 1
            int r0 = r0 + r1
            if (r3 >= r0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r0 = 0
            if (r1 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r2 = r0
        L_0x0017:
            if (r2 == 0) goto L_0x0022
            java.lang.String r0 = r2.substring(r3)
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.extension.StringKt.m118914W(java.lang.String, int):java.lang.String");
    }

    /* renamed from: X */
    public static final long m118915X(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return DateTime.m51195N2(str).mo27912k();
        } catch (Exception unused) {
            return 0;
        }
    }

    @C12579k
    /* renamed from: Y */
    public static final String m118916Y(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return ArraysKt___ArraysKt.m38982Gh(bArr, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, StringKt$toHex$1.f70386f, 30, (Object) null);
    }

    @C12579k
    /* renamed from: Z */
    public static final String m118917Z(@C12580l String str) {
        if (str != null) {
            Locale locale = Locale.FRANCE;
            Intrinsics.checkNotNullExpressionValue(locale, "FRANCE");
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (upperCase != null) {
                return upperCase;
            }
        }
        return new String();
    }

    /* renamed from: a0 */
    public static final boolean m118919a0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"/"}, false, 0, 6, (Object) null);
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.set(Integer.parseInt((String) split$default.get(2)), Integer.parseInt((String) split$default.get(1)), Integer.parseInt((String) split$default.get(0)), 0, 0);
        int i = instance2.get(1) - instance.get(1);
        if (instance.get(2) >= instance2.get(2) && instance.get(5) > instance2.get(5)) {
            i--;
        }
        if (i >= 18) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: b */
    public static final String m118920b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return "\"" + str + "\"";
    }

    @C12579k
    /* renamed from: b0 */
    public static final String m118921b0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str + "%";
    }

    @C12579k
    /* renamed from: c */
    public static final Optional<Double> m118922c(@C12580l String str) {
        Optional<Double> map = Optional.ofNullable(str).map(new C28766l0(StringKt$asOptionalDouble$1.f70384f));
        Intrinsics.checkNotNullExpressionValue(map, "ofNullable(this).map {\n …ring().toDoubleOrNull()\n}");
        return map;
    }

    @C12579k
    /* renamed from: c0 */
    public static final String m118923c0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return "/" + str;
    }

    /* renamed from: d */
    public static final Double m118924d(C11300l lVar, Object obj) {
        Intrinsics.checkNotNullParameter(lVar, "$tmp0");
        return (Double) lVar.invoke(obj);
    }

    /* renamed from: e */
    public static final boolean m118925e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return C17996p.f46485B.matcher(str).matches();
    }

    @C12579k
    /* renamed from: f */
    public static final String m118926f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String m = new Regex("\\p{C}").mo23336m(new Regex("[\\p{Cntrl}&&[^\r\n\t]]").mo23336m(str, ""), "");
        while (StringsKt__StringsKt.contains$default((CharSequence) m, (CharSequence) GlideException.C22148a.f56917d, false, 2, (Object) null)) {
            m = C11622t.replace$default(m, GlideException.C22148a.f56917d, " ", false, 4, (Object) null);
        }
        return StringsKt__StringsKt.trim(m).toString();
    }

    @C12579k
    /* renamed from: g */
    public static final String m118927g(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return C11622t.replace$default(str, ",", ".", false, 4, (Object) null);
    }

    /* renamed from: h */
    public static final long m118928h(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() >= 13) {
            return m118938r(str, 0, 1, (Object) null) / ((long) 1000);
        }
        return m118938r(str, 0, 1, (Object) null);
    }

    @C12579k
    /* renamed from: i */
    public static final String m118929i(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return C11622t.replace$default(str, ".", ",", false, 4, (Object) null);
    }

    @C12579k
    /* renamed from: j */
    public static final String m118930j(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(encode, "{\n        URLEncoder.encode(this, \"UTF-8\")\n    }");
            return encode;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str;
        }
    }

    @C12579k
    /* renamed from: k */
    public static final String m118931k(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt__StringsKt.substringBefore$default(str, "-", (String) null, 2, (Object) null);
    }

    @C12579k
    /* renamed from: l */
    public static final String m118932l(@C12579k String str, @C12580l String str2, @C12579k String str3) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str3, C9650g.f26444g);
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11368t0 t0Var = C11368t0.f28504a;
            String format = String.format("%s\n%s", Arrays.copyOf(new Object[]{str, str3}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return format;
        }
        C11368t0 t0Var2 = C11368t0.f28504a;
        String format2 = String.format("%s\n%s\n%s", Arrays.copyOf(new Object[]{str, str2, str3}, 3));
        Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
        return format2;
    }

    @C12579k
    /* renamed from: m */
    public static final String m118933m(@C12579k String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{str, str2}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    /* renamed from: n */
    public static final float m118934n(@C12580l String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return f;
        }
    }

    /* renamed from: o */
    public static /* synthetic */ float m118935o(String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        return m118934n(str, f);
    }

    @C12579k
    /* renamed from: p */
    public static final String m118936p(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return String.valueOf(Integer.parseInt(str));
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: q */
    public static final long m118937q(@C12580l String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j;
        }
    }

    /* renamed from: r */
    public static /* synthetic */ long m118938r(String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return m118937q(str, j);
    }

    @C12579k
    /* renamed from: s */
    public static final String m118939s(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String v = C12671a.m54028f("dd/MM/yyyy").mo29259v(DateTime.m51195N2(str));
        Intrinsics.checkNotNullExpressionValue(v, "forPattern(FORMATSLASH)\n…int(DateTime.parse(this))");
        return v;
    }

    @C12579k
    /* renamed from: t */
    public static final String m118940t(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String v = C12671a.m54028f("yyyyMMdd").mo29259v(DateTime.m51195N2(str));
        Intrinsics.checkNotNullExpressionValue(v, "forPattern(\"yyyyMMdd\")\n …int(DateTime.parse(this))");
        return v;
    }

    @SuppressLint({"DefaultLocale"})
    @C12579k
    /* renamed from: u */
    public static final String m118941u(@C12579k String str, @C12579k String str2) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "slotEndDate");
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        if (str2.length() != 0) {
            z2 = false;
        }
        if (z2) {
            return "";
        }
        String R = C28932h.f70914a.mo84227R(str);
        DateTime N2 = DateTime.m51195N2(str2);
        C12674b f = C12671a.m54028f(" - HH:mm");
        String capitalize = C11622t.capitalize(R);
        String v = f.mo29259v(N2);
        Intrinsics.checkNotNullExpressionValue(v, "outputFormatterEnd.print…    endDateTime\n        )");
        return capitalize + C11622t.capitalize(v);
    }

    @SuppressLint({"DefaultLocale"})
    @C12579k
    /* renamed from: v */
    public static final String m118942v(@C12579k String str) {
        boolean z;
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            String v = C12671a.m54028f("EEE dd MMM 'dès' HH'h'mm").mo29259v(DateTime.m51195N2(str));
            Intrinsics.checkNotNullExpressionValue(v, "outputFormatterBegin.print(beginDateTime)");
            return C11622t.capitalize(v);
        } catch (Exception e) {
            C28935i iVar = C28935i.f70940a;
            String message = e.getMessage();
            if (message == null) {
                str2 = "";
            } else {
                str2 = message;
            }
            C28935i.m119705e(iVar, str2, e, 0, 4, (Object) null);
            return "";
        }
    }

    /* renamed from: w */
    public static final boolean m118943w(@C12580l String str, boolean z) {
        if (str == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return z;
        }
    }

    /* renamed from: x */
    public static /* synthetic */ boolean m118944x(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m118943w(str, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = kotlin.text.C11620r.toDoubleOrNull(r0);
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final double m118945y(@org.jetbrains.annotations.C12580l java.lang.String r0, double r1) {
        /*
            if (r0 == 0) goto L_0x000c
            java.lang.Double r0 = kotlin.text.C11620r.toDoubleOrNull(r0)
            if (r0 == 0) goto L_0x000c
            double r1 = r0.doubleValue()
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.extension.StringKt.m118945y(java.lang.String, double):double");
    }

    /* renamed from: z */
    public static /* synthetic */ double m118946z(String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 0.0d;
        }
        return m118945y(str, d);
    }
}
