package com.contentsquare.android.error.internal;

import com.contentsquare.android.error.C14117a;
import com.contentsquare.android.sdk.C14453jf;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;

/* renamed from: com.contentsquare.android.error.internal.a */
public final class C14120a {

    /* renamed from: a */
    public static final List<String> f34929a = CollectionsKt__CollectionsKt.m40448L("csq.io", "contentsquare.net", "csqtrk.net");

    /* renamed from: b */
    public static final C14453jf f34930b = new C14453jf("NetworkEventFilter");

    /* renamed from: a */
    public static final boolean m60670a(C14117a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$isAccepted");
        try {
            List<String> list = f34929a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            for (String str : list) {
                String host = new URI(aVar.mo34374n()).getHost();
                if (host == null) {
                    host = "";
                }
                if (C11622t.endsWith$default(host, str, false, 2, (Object) null)) {
                    return false;
                }
            }
            return true;
        } catch (URISyntaxException e) {
            C14453jf jfVar = f34930b;
            String n = aVar.mo34374n();
            jfVar.mo35675d(e, "Cannot parse url: " + n, new Object[0]);
            return true;
        }
    }
}
