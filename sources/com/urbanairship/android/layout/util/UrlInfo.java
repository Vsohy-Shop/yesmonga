package com.urbanairship.android.layout.util;

import androidx.annotation.C0359n0;
import com.urbanairship.android.layout.info.C35646a0;
import com.urbanairship.android.layout.info.C35684s0;
import com.urbanairship.android.layout.info.C35685t;
import com.urbanairship.android.layout.info.C35686t0;
import com.urbanairship.android.layout.info.C35689u;
import com.urbanairship.android.layout.info.C35695w0;
import com.urbanairship.android.layout.property.Image;
import java.util.ArrayList;
import java.util.List;

public class UrlInfo {
    @C0359n0

    /* renamed from: a */
    public final UrlType f88788a;
    @C0359n0

    /* renamed from: b */
    public final String f88789b;

    public enum UrlType {
        WEB_PAGE,
        IMAGE,
        VIDEO
    }

    /* renamed from: com.urbanairship.android.layout.util.UrlInfo$a */
    public static /* synthetic */ class C35899a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f88794a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f88795b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.urbanairship.android.layout.property.ViewType[] r0 = com.urbanairship.android.layout.property.ViewType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f88795b = r0
                r1 = 1
                com.urbanairship.android.layout.property.ViewType r2 = com.urbanairship.android.layout.property.ViewType.MEDIA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f88795b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.urbanairship.android.layout.property.ViewType r3 = com.urbanairship.android.layout.property.ViewType.IMAGE_BUTTON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f88795b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.urbanairship.android.layout.property.ViewType r4 = com.urbanairship.android.layout.property.ViewType.WEB_VIEW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.urbanairship.android.layout.property.MediaType[] r3 = com.urbanairship.android.layout.property.MediaType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f88794a = r3
                com.urbanairship.android.layout.property.MediaType r4 = com.urbanairship.android.layout.property.MediaType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f88794a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.urbanairship.android.layout.property.MediaType r3 = com.urbanairship.android.layout.property.MediaType.VIDEO     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f88794a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.urbanairship.android.layout.property.MediaType r1 = com.urbanairship.android.layout.property.MediaType.YOUTUBE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.util.UrlInfo.C35899a.<clinit>():void");
        }
    }

    public UrlInfo(@C0359n0 UrlType urlType, @C0359n0 String str) {
        this.f88788a = urlType;
        this.f88789b = str;
    }

    @C0359n0
    /* renamed from: a */
    public static List<UrlInfo> m148023a(@C0359n0 C35686t0 t0Var) {
        ArrayList arrayList = new ArrayList();
        int i = C35899a.f88795b[t0Var.getType().ordinal()];
        if (i == 1) {
            C35646a0 a0Var = (C35646a0) t0Var;
            int i2 = C35899a.f88794a[a0Var.mo106780k().ordinal()];
            if (i2 == 1) {
                arrayList.add(new UrlInfo(UrlType.IMAGE, a0Var.mo106782m()));
            } else if (i2 == 2 || i2 == 3) {
                arrayList.add(new UrlInfo(UrlType.VIDEO, a0Var.mo106782m()));
            }
        } else if (i == 2) {
            C35685t tVar = (C35685t) t0Var;
            if (tVar.mo106834k().mo107276b() == Image.Type.URL) {
                arrayList.add(new UrlInfo(UrlType.IMAGE, ((Image.C35817b) tVar.mo106834k()).mo107281d()));
            }
        } else if (i == 3) {
            arrayList.add(new UrlInfo(UrlType.WEB_PAGE, ((C35695w0) t0Var).mo106849k()));
        }
        if (t0Var instanceof C35684s0) {
            for (C35689u d : ((C35684s0) t0Var).mo106789k()) {
                arrayList.addAll(m148023a(d.mo106836d()));
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: b */
    public UrlType mo107536b() {
        return this.f88788a;
    }

    @C0359n0
    /* renamed from: c */
    public String mo107537c() {
        return this.f88789b;
    }
}
