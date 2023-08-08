package com.usabilla.sdk.ubform.utils.ext;

import com.usabilla.sdk.ubform.sdk.field.model.ScreenshotModel;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldType;
import com.usabilla.sdk.ubform.sdk.page.model.PageModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.utils.ext.j */
public final class C10136j {
    @C12580l
    /* renamed from: a */
    public static final ScreenshotModel m38363a(@C12579k List<PageModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        for (PageModel n : list) {
            Iterator it = n.mo21412n().iterator();
            while (true) {
                if (it.hasNext()) {
                    FieldModel fieldModel = (FieldModel) it.next();
                    if (fieldModel.mo20972c() == FieldType.SCREENSHOT) {
                        return (ScreenshotModel) fieldModel;
                    }
                }
            }
        }
        return null;
    }
}
