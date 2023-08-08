package com.carrefour.fid.android.design.components.extension;

import android.content.Context;
import android.content.res.Resources;
import com.carrefour.fid.android.design.components.C36896b;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11611k;
import kotlin.text.Regex;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.extension.a */
public final class C37106a {
    @C12579k

    /* renamed from: a */
    public static final Regex f92896a = new Regex("(\\d+),(\\d+)€?");
    @C12579k

    /* renamed from: b */
    public static final Regex f92897b = new Regex("(\\d+),(\\d+)€/(\\w+)");
    @C12579k

    /* renamed from: c */
    public static final Regex f92898c = new Regex("(.+)\n(\\d+),(\\d+)€/(\\w+)\n?(.*)");
    @C12579k

    /* renamed from: d */
    public static final String f92899d = "L";

    /* renamed from: e */
    public static final int f92900e = 0;
    @C12579k

    /* renamed from: f */
    public static final String f92901f = "KG";

    /* renamed from: g */
    public static final int f92902g = 1;
    @C12579k

    /* renamed from: h */
    public static final String f92903h = "U";

    /* renamed from: i */
    public static final int f92904i = 2;

    @C12579k
    /* renamed from: a */
    public static final String m152136a(@C12579k String str, @C12579k Context context) {
        List<String> b;
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C11611k d = Regex.m45042d(f92898c, str, 0, 2, (Object) null);
        if (d == null || (b = d.mo23313b()) == null) {
            return str;
        }
        Resources resources = context.getResources();
        String str3 = b.get(4);
        int hashCode = str3.hashCode();
        if (hashCode != 76) {
            if (hashCode != 85) {
                if (hashCode == 2396 && str3.equals("KG")) {
                    str2 = resources.getStringArray(C36896b.C36899c.accessibility_unit)[1];
                    String string = context.getString(C36896b.C36912p.accessibility_product_content, new Object[]{b.get(1), b.get(2), b.get(3), str2, b.get(5)});
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …     priceValues[5]\n    )");
                    return string;
                }
            } else if (str3.equals(f92903h)) {
                str2 = resources.getStringArray(C36896b.C36899c.accessibility_unit)[2];
                String string2 = context.getString(C36896b.C36912p.accessibility_product_content, new Object[]{b.get(1), b.get(2), b.get(3), str2, b.get(5)});
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(\n     …     priceValues[5]\n    )");
                return string2;
            }
        } else if (str3.equals(f92899d)) {
            str2 = resources.getStringArray(C36896b.C36899c.accessibility_unit)[0];
            String string22 = context.getString(C36896b.C36912p.accessibility_product_content, new Object[]{b.get(1), b.get(2), b.get(3), str2, b.get(5)});
            Intrinsics.checkNotNullExpressionValue(string22, "context.getString(\n     …     priceValues[5]\n    )");
            return string22;
        }
        str2 = b.get(4);
        String string222 = context.getString(C36896b.C36912p.accessibility_product_content, new Object[]{b.get(1), b.get(2), b.get(3), str2, b.get(5)});
        Intrinsics.checkNotNullExpressionValue(string222, "context.getString(\n     …     priceValues[5]\n    )");
        return string222;
    }

    @C12579k
    /* renamed from: b */
    public static final String m152137b(@C12579k String str, @C12579k Context context) {
        List<String> b;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C11611k d = Regex.m45042d(f92896a, str, 0, 2, (Object) null);
        if (d == null || (b = d.mo23313b()) == null) {
            return str;
        }
        String string = context.getString(C36896b.C36912p.accessibility_price, new Object[]{b.get(1), b.get(2)});
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…alues[1], priceValues[2])");
        return string;
    }

    @C12579k
    /* renamed from: c */
    public static final String m152138c(@C12579k String str, @C12579k Context context) {
        List<String> b;
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C11611k d = Regex.m45042d(f92897b, str, 0, 2, (Object) null);
        if (d == null || (b = d.mo23313b()) == null) {
            return str;
        }
        Resources resources = context.getResources();
        String str3 = b.get(3);
        int hashCode = str3.hashCode();
        if (hashCode != 76) {
            if (hashCode != 85) {
                if (hashCode == 2396 && str3.equals("KG")) {
                    str2 = resources.getStringArray(C36896b.C36899c.accessibility_unit)[1];
                    String string = context.getString(C36896b.C36912p.accessibility_price_per_unit, new Object[]{b.get(1), b.get(2), str2});
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…], pricePerUnit[2], unit)");
                    return string;
                }
            } else if (str3.equals(f92903h)) {
                str2 = resources.getStringArray(C36896b.C36899c.accessibility_unit)[2];
                String string2 = context.getString(C36896b.C36912p.accessibility_price_per_unit, new Object[]{b.get(1), b.get(2), str2});
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…], pricePerUnit[2], unit)");
                return string2;
            }
        } else if (str3.equals(f92899d)) {
            str2 = resources.getStringArray(C36896b.C36899c.accessibility_unit)[0];
            String string22 = context.getString(C36896b.C36912p.accessibility_price_per_unit, new Object[]{b.get(1), b.get(2), str2});
            Intrinsics.checkNotNullExpressionValue(string22, "context.getString(R.stri…], pricePerUnit[2], unit)");
            return string22;
        }
        str2 = b.get(3);
        String string222 = context.getString(C36896b.C36912p.accessibility_price_per_unit, new Object[]{b.get(1), b.get(2), str2});
        Intrinsics.checkNotNullExpressionValue(string222, "context.getString(R.stri…], pricePerUnit[2], unit)");
        return string222;
    }
}
