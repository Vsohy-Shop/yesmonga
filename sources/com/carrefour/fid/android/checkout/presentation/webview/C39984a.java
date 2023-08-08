package com.carrefour.fid.android.checkout.presentation.webview;

import android.content.Context;
import com.carrefour.fid.android.shared.extension.C28775q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.checkout.presentation.webview.a */
public final class C39984a {
    @C12579k
    /* renamed from: a */
    public static final String m162964a(@C12579k Context context, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, "paymentPostData");
        Intrinsics.checkNotNullParameter(str2, "url");
        String f = C28775q.m119098f(context, "payline.css");
        return "<html><head>\n<style>" + f + "</style>\n<script src=\"" + str2 + "scripts/widget-min.js\"></script>\n<link href=\"" + str2 + "styles/widget-min.css\" rel=\"stylesheet\" /></head>\n<body>\n<div id=\"PaylineWidget\"\ndata-token=\"" + str + "\"\ndata-template=\"lightbox\"\ndata-embeddedredirectionallowed=\"false\"\ndata-event-nomdeletape=\"HTMLOUT.processHTML\"/>\n</body>\n</html>";
    }

    @C12579k
    /* renamed from: b */
    public static final String m162965b(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "paymentPostData");
        Intrinsics.checkNotNullParameter(str2, "url");
        String str3 = str2 + "#token=" + str;
        Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder()\n        …Data)\n        .toString()");
        return str3;
    }
}
