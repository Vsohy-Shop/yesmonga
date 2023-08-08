package com.carrefour.fid.android.utils;

import android.net.Uri;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.C11607h;
import kotlin.text.C11608i;
import kotlin.text.C11611k;
import kotlin.text.C11622t;
import kotlin.text.Regex;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.utils.o */
public final class C22720o {
    @C12579k

    /* renamed from: a */
    public static final Regex f58220a = new Regex("/p/.+-(\\d+)");

    @C12580l
    /* renamed from: a */
    public static final String m102888a(@C12580l Uri uri) {
        C11608i c;
        C11607h hVar;
        Regex regex = f58220a;
        String path = uri != null ? uri.getPath() : null;
        if (path == null) {
            path = "";
        }
        C11611k d = Regex.m45042d(regex, path, 0, 2, (Object) null);
        if (d == null || (c = d.mo23314c()) == null || (hVar = (C11607h) CollectionsKt___CollectionsKt.m40644i3(c)) == null) {
            return null;
        }
        return hVar.mo23394f();
    }

    @C12579k
    /* renamed from: b */
    public static final String m102889b(@C12580l Uri uri) {
        String str;
        String str2;
        String queryParameter;
        if (uri == null || (queryParameter = uri.getQueryParameter("query_id")) == null) {
            str = "";
        } else {
            str = queryParameter;
        }
        String str3 = (String) CollectionsKt___CollectionsKt.m40653k3(new Regex("(?:query_\\d*)").mo23339p(str, 0));
        if (str3 == null) {
            str2 = "";
        } else {
            str2 = str3;
        }
        return C11622t.replace$default(str, str2, "", false, 4, (Object) null);
    }
}
