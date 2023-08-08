package com.urbanairship.iam.assets;

import android.graphics.BitmapFactory;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.android.layout.util.UrlInfo;
import com.urbanairship.iam.C9127a0;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.iam.banner.C9156c;
import com.urbanairship.iam.fullscreen.C9185c;
import com.urbanairship.iam.layout.C9219e;
import com.urbanairship.iam.modal.C9225c;
import com.urbanairship.json.C9323b;
import com.urbanairship.util.C9664m0;
import com.urbanairship.util.C9670p;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.urbanairship.iam.assets.a */
public class C9132a implements C9138f {
    @C0359n0

    /* renamed from: a */
    public static final String f24737a = "width";
    @C0359n0

    /* renamed from: b */
    public static final String f24738b = "height";

    @C0363p0
    /* renamed from: d */
    public static String m34167d(@C0363p0 C9127a0 a0Var) {
        if (a0Var == null || !a0Var.mo18214f().equals(C9127a0.f24709d)) {
            return null;
        }
        return a0Var.mo18215g();
    }

    /* renamed from: a */
    public void mo18240a(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage, @C0359n0 Assets assets) {
        mo18241b(str, inAppMessage, assets);
    }

    /* renamed from: b */
    public int mo18241b(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage, @C0359n0 Assets assets) {
        for (String next : mo18243e(inAppMessage)) {
            if (!assets.mo18229e(next).exists()) {
                try {
                    C9670p.C9671a c = mo18242c(assets, next);
                    if (!c.f26491b) {
                        if (C9664m0.m36194a(c.f26490a)) {
                            return 2;
                        }
                        return 1;
                    }
                } catch (Exception e) {
                    C36059m.m148411g(e, "Unable to download file: %s ", next);
                    return 1;
                }
            }
        }
        return 0;
    }

    @C0359n0
    /* renamed from: c */
    public C9670p.C9671a mo18242c(@C0359n0 Assets assets, @C0359n0 String str) throws IOException {
        File e = assets.mo18229e(str);
        C9670p.C9671a b = C9670p.m36232b(new URL(str), e);
        if (b.f26491b) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(e.getAbsolutePath(), options);
            assets.mo18232j(str, C9323b.m35017y().mo18826j("width", Integer.valueOf(options.outWidth)).mo18826j("height", Integer.valueOf(options.outHeight)).mo18817a());
        }
        return b;
    }

    @C0359n0
    /* renamed from: e */
    public final List<String> mo18243e(@C0359n0 InAppMessage inAppMessage) {
        String d;
        String d2;
        String d3;
        String t = inAppMessage.mo18187t();
        t.hashCode();
        char c = 65535;
        switch (t.hashCode()) {
            case -1396342996:
                if (t.equals("banner")) {
                    c = 0;
                    break;
                }
                break;
            case -1109722326:
                if (t.equals("layout")) {
                    c = 1;
                    break;
                }
                break;
            case 104069805:
                if (t.equals(InAppMessage.f24679Q0)) {
                    c = 2;
                    break;
                }
                break;
            case 110066619:
                if (t.equals(InAppMessage.f24678P0)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C9156c cVar = (C9156c) inAppMessage.mo18182n();
                if (!(cVar == null || (d = m34167d(cVar.mo18351x())) == null)) {
                    return Collections.singletonList(d);
                }
            case 1:
                C9219e eVar = (C9219e) inAppMessage.mo18182n();
                if (eVar != null) {
                    ArrayList arrayList = new ArrayList();
                    for (UrlInfo next : UrlInfo.m148023a(eVar.mo18512b().mo106857h())) {
                        if (next.mo107536b() == UrlInfo.UrlType.IMAGE) {
                            arrayList.add(next.mo107537c());
                        }
                    }
                    return arrayList;
                }
                break;
            case 2:
                C9225c cVar2 = (C9225c) inAppMessage.mo18182n();
                if (!(cVar2 == null || (d2 = m34167d(cVar2.mo18532v())) == null)) {
                    return Collections.singletonList(d2);
                }
            case 3:
                C9185c cVar3 = (C9185c) inAppMessage.mo18182n();
                if (!(cVar3 == null || (d3 = m34167d(cVar3.mo18431s())) == null)) {
                    return Collections.singletonList(d3);
                }
        }
        return Collections.emptyList();
    }
}
