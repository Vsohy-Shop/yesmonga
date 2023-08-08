package com.carrefour.fid.android.cms.data.extension;

import com.carrefour.fid.android.cms.data.entities.BlockCmsResponse;
import com.carrefour.fid.android.cms.data.entities.DataCmsResponse;
import com.carrefour.fid.android.shared.util.C28937k;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCguResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CguResponse.kt\ncom/carrefour/fid/android/cms/data/extension/CguResponseKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1855#2:18\n1856#2:20\n1#3:19\n*S KotlinDebug\n*F\n+ 1 CguResponse.kt\ncom/carrefour/fid/android/cms/data/extension/CguResponseKt\n*L\n11#1:18\n11#1:20\n*E\n"})
/* renamed from: com.carrefour.fid.android.cms.data.extension.a */
public final class C40019a {
    @C12579k
    /* renamed from: a */
    public static final String m162992a(@C12580l DataCmsResponse dataCmsResponse) {
        String str;
        if (dataCmsResponse != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("<html>");
            sb.append(C28937k.f70946c);
            sb.append("<body>");
            List<BlockCmsResponse> blocks = dataCmsResponse.getBlocks();
            if (blocks != null) {
                for (BlockCmsResponse blockCmsResponse : blocks) {
                    String title = blockCmsResponse.getTitle();
                    if (title != null) {
                        sb.append("<h1>" + title + "</h1>");
                    }
                    String description = blockCmsResponse.getDescription();
                    if (description != null) {
                        sb.append(description);
                    }
                }
            }
            sb.append("</body></html>");
            str = sb.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
