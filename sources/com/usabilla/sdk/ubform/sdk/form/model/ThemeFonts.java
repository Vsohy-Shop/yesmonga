package com.usabilla.sdk.ubform.sdk.form.model;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0012"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/ThemeFonts;", "", "bold", "", "getBold", "()Z", "miniSize", "", "getMiniSize", "()I", "textSize", "getTextSize", "titleSize", "getTitleSize", "getFont", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public interface ThemeFonts {
    boolean getBold();

    @C12580l
    Typeface getFont(@C12579k Context context);

    int getMiniSize();

    int getTextSize();

    int getTitleSize();
}
